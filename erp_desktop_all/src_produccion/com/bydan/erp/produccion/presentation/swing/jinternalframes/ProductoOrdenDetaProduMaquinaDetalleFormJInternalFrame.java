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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMaquinaConstantesFunciones;

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
public class ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame extends ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoOrdenDetaProduMaquina;
	
	protected JMenuBar jmenuBarDetalleProductoOrdenDetaProduMaquina;
	
	protected JMenu jmenuDetalleProductoOrdenDetaProduMaquina;
	protected JMenu jmenuDetalleArchivoProductoOrdenDetaProduMaquina;
	protected JMenu jmenuDetalleAccionesProductoOrdenDetaProduMaquina;
	protected JMenu jmenuDetalleDatosProductoOrdenDetaProduMaquina;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduMaquina;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduMaquina;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoOrdenDetaProduMaquina;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoAreaEmpresaProduBeanSwingJInternalFrame tipoareaempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoareaempresaprodu="";

	protected TipoProcesoEmpresaProduBeanSwingJInternalFrame tipoprocesoempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprocesoempresaprodu="";

	protected TipoMaquinaEmpresaBeanSwingJInternalFrame tipomaquinaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomaquinaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduMaquinaSessionBean productoordendetaprodumaquinaSessionBean;
	
	
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoAreaEmpresaProduSessionBean tipoareaempresaproduSessionBean;
	public TipoProcesoEmpresaProduSessionBean tipoprocesoempresaproduSessionBean;
	public TipoMaquinaEmpresaSessionBean tipomaquinaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoOrdenDetaProduMaquinaLogic productoordendetaprodumaquinaLogic;
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMaquina;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina;
	
	protected JPanel jPanelCamposProductoOrdenDetaProduMaquina;    
	protected JPanel jPanelCamposOcultosProductoOrdenDetaProduMaquina;    	
	protected JPanel jPanelAccionesProductoOrdenDetaProduMaquina;
	protected JPanel jPanelAccionesFormularioProductoOrdenDetaProduMaquina;
    
	
	
	protected Integer iXPanelCamposProductoOrdenDetaProduMaquina=0;
	protected Integer iYPanelCamposProductoOrdenDetaProduMaquina=0;
	
	protected Integer iXPanelCamposOcultosProductoOrdenDetaProduMaquina=0;
	protected Integer iYPanelCamposOcultosProductoOrdenDetaProduMaquina=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoOrdenDetaProduMaquina;
	public JButton jButtonModificarProductoOrdenDetaProduMaquina;
	public JButton jButtonActualizarProductoOrdenDetaProduMaquina;
    public JButton jButtonEliminarProductoOrdenDetaProduMaquina;
	public JButton jButtonCancelarProductoOrdenDetaProduMaquina;
    public JButton jButtonGuardarCambiosProductoOrdenDetaProduMaquina;
	public JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina;
	protected JButton jButtonCerrarProductoOrdenDetaProduMaquina;
	
	
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduMaquina;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonModificarToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonActualizarToolBarProductoOrdenDetaProduMaquina;
    protected JButton jButtonEliminarToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonCancelarToolBarProductoOrdenDetaProduMaquina;
    protected JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMaquina;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduMaquina;
	
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMaquina;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemModificarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemActualizarProductoOrdenDetaProduMaquina;
    protected JMenuItem jMenuItemEliminarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemCancelarProductoOrdenDetaProduMaquina;
    protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMaquina;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduMaquina;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMaquina;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoOrdenDetaProduMaquina;
	public JLabel jLabelIdProductoOrdenDetaProduMaquina;
	public JLabel jLabelidProductoOrdenDetaProduMaquina;
	public JButton jButtonidProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoOrdenDetaProduMaquina;
	public JLabel jLabelcantidadProductoOrdenDetaProduMaquina;
	public JTextField jTextFieldcantidadProductoOrdenDetaProduMaquina;
	public JButton jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoOrdenDetaProduMaquina;
	public JLabel jLabelcostoProductoOrdenDetaProduMaquina;
	public JTextField jTextFieldcostoProductoOrdenDetaProduMaquina;
	public JButton jButtoncostoProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoOrdenDetaProduMaquina;
	public JLabel jLabelcosto_totalProductoOrdenDetaProduMaquina;
	public JTextField jTextFieldcosto_totalProductoOrdenDetaProduMaquina;
	public JButton jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoOrdenDetaProduMaquina;
	public JLabel jLabeldescripcionProductoOrdenDetaProduMaquina;
	public JTextArea jTextAreadescripcionProductoOrdenDetaProduMaquina;
	public JScrollPane jscrollPanedescripcionProductoOrdenDetaProduMaquina;
	public JButton jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_deta_produProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_orden_deta_produProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina;
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina;
	public JButton jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina;
	public JButton jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina;
	public JButton jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoOrdenDetaProduMaquina;
	public JLabel jLabelid_unidadProductoOrdenDetaProduMaquina;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoOrdenDetaProduMaquina;
	public JButton jButtonid_unidadProductoOrdenDetaProduMaquina= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoOrdenDetaProduMaquina;
	
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
	
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoOrdenDetaProduMaquina=new JPanel();
				this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina=new JPanel();
				this.jmenuBarDetalleProductoOrdenDetaProduMaquina=new JMenuBar();
				this.jTtoolBarDetalleProductoOrdenDetaProduMaquina=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMaquinaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduMaquina No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoOrdenDetaProduMaquina() {
		return this.jButtonActualizarToolBarProductoOrdenDetaProduMaquina;
	}
	
	public JButton getjButtonEliminarToolBarProductoOrdenDetaProduMaquina() {
		return this.jButtonEliminarToolBarProductoOrdenDetaProduMaquina;
	}
	
	public JButton getjButtonCancelarToolBarProductoOrdenDetaProduMaquina() {
		return this.jButtonCancelarToolBarProductoOrdenDetaProduMaquina;
	}		
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduMaquina() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduMaquina)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduMaquina = jButtonProcesarInformacionProductoOrdenDetaProduMaquina;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina = jComboBoxTiposRelacionesProductoOrdenDetaProduMaquina;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina = jComboBoxTiposAccionesProductoOrdenDetaProduMaquina;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina() {
		return this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina(
			JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina) {
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina = jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoordendetaprodumaquinaSessionBean=new ProductoOrdenDetaProduMaquinaSessionBean();
		
		this.productoordendetaprodumaquinaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumaquinaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduMaquinaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduMaquinaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Maquina MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoOrdenDetaProduMaquinaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoOrdenDetaProduMaquina= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduMaquina=new JButtonMe();
				this.jButtonModificarToolBarProductoOrdenDetaProduMaquina=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarDetalleProductoOrdenDetaProduMaquina,
							"actualizar","actualizar","Actualizar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarDetalleProductoOrdenDetaProduMaquina,
							"eliminar","eliminar","Eliminar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarDetalleProductoOrdenDetaProduMaquina,
							"cancelar","cancelar","Cancelar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMaquina,this.jTtoolBarDetalleProductoOrdenDetaProduMaquina,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoOrdenDetaProduMaquina=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoOrdenDetaProduMaquina=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoOrdenDetaProduMaquina=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoOrdenDetaProduMaquina=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduMaquina= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduMaquina.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduMaquina,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoOrdenDetaProduMaquina= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoOrdenDetaProduMaquina.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoOrdenDetaProduMaquina,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoOrdenDetaProduMaquina= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoOrdenDetaProduMaquina.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoOrdenDetaProduMaquina,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoOrdenDetaProduMaquina= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoOrdenDetaProduMaquina.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoOrdenDetaProduMaquina,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoOrdenDetaProduMaquina= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoOrdenDetaProduMaquina.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoOrdenDetaProduMaquina,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduMaquina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduMaquina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduMaquina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoOrdenDetaProduMaquina.add(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMaquina);
		
		this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemActualizarProductoOrdenDetaProduMaquina);
		this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemEliminarProductoOrdenDetaProduMaquina);
		this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemCancelarProductoOrdenDetaProduMaquina);		
		
		//this.jmenuDetalleDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMaquina);				
		this.jmenuDetalleDatosProductoOrdenDetaProduMaquina.add(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMaquina);				
				
		//this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMaquina);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoOrdenDetaProduMaquina.add(this.jmenuDetalleArchivoProductoOrdenDetaProduMaquina);		
		this.jmenuBarDetalleProductoOrdenDetaProduMaquina.add(this.jmenuDetalleAccionesProductoOrdenDetaProduMaquina);		
		this.jmenuBarDetalleProductoOrdenDetaProduMaquina.add(this.jmenuDetalleDatosProductoOrdenDetaProduMaquina);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoOrdenDetaProduMaquina);				
	}
	
	
	public void inicializarElementosCamposProductoOrdenDetaProduMaquina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoOrdenDetaProduMaquina = new JLabelMe();
		jLabelIdProductoOrdenDetaProduMaquina.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoOrdenDetaProduMaquina = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina= new GridBagLayout();

		this.jPanelidProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);

		jLabelidProductoOrdenDetaProduMaquina = new JLabel();
		jLabelidProductoOrdenDetaProduMaquina.setText("Id");

		jLabelidProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelcantidadProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoOrdenDetaProduMaquina.setToolTipText("Cantad");
		this.jLabelcantidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelcantidadProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jTextFieldcantidadProductoOrdenDetaProduMaquina= new JTextFieldMe();
		jTextFieldcantidadProductoOrdenDetaProduMaquina.setEnabled(false);
		jTextFieldcantidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoOrdenDetaProduMaquina.setText("0");

		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelcostoProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoOrdenDetaProduMaquina.setToolTipText("Costo");
		this.jLabelcostoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelcostoProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jTextFieldcostoProductoOrdenDetaProduMaquina= new JTextFieldMe();
		jTextFieldcostoProductoOrdenDetaProduMaquina.setEnabled(false);
		jTextFieldcostoProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoOrdenDetaProduMaquina.setText("0.0");

		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelcosto_totalProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoOrdenDetaProduMaquina.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelcosto_totalProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jTextFieldcosto_totalProductoOrdenDetaProduMaquina= new JTextFieldMe();
		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setEnabled(false);
		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.setText("0.0");

		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabeldescripcionProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoOrdenDetaProduMaquina.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPaneldescripcionProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jTextAreadescripcionProductoOrdenDetaProduMaquina= new JTextAreaMe();
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setEnabled(false);
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setLineWrap(true);
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setWrapStyleWord(true);
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoOrdenDetaProduMaquina.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoOrdenDetaProduMaquina = new JScrollPane(jTextAreadescripcionProductoOrdenDetaProduMaquina);
		jscrollPanedescripcionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoOrdenDetaProduMaquina() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU+" : *");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina.setToolTipText("Orden Deta Produ");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDORDENDETAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMaquina"));

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMaquinaUpdate"));



					
		this.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU+" : *");
		this.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setToolTipText("Tipo Area Empresa Produ");
		this.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOAREAEMPRESAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquina"));

		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.setText("U");
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate"));



					
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU+" : *");
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setToolTipText("Tipo Proceso Empresa Produ");
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOPROCESOEMPRESAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina"));

		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.setText("U");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate"));



					
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA+" : *");
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setToolTipText("Tipo Merma Empresa");
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDTIPOMAQUINAEMPRESA);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquina"));

		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.setText("U");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate"));



					
		this.jLabelid_unidadProductoOrdenDetaProduMaquina = new JLabelMe();
		this.jLabelid_unidadProductoOrdenDetaProduMaquina.setText(""+ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoOrdenDetaProduMaquina.setToolTipText("Unad");
		this.jLabelid_unidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoOrdenDetaProduMaquina=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoOrdenDetaProduMaquina.setToolTipText(ProductoOrdenDetaProduMaquinaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		this.jPanelid_unidadProductoOrdenDetaProduMaquina.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMaquina);


		jComboBoxid_unidadProductoOrdenDetaProduMaquina= new JComboBoxMe();
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoOrdenDetaProduMaquina= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMaquina.setText("Buscar");
		this.jButtonid_unidadProductoOrdenDetaProduMaquina.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMaquina.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMaquina,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMaquina"));

		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMaquinaBusqueda"));

		if(this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMaquina.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMaquinaUpdate"));



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
		//this.jInternalFrameDetalleProductoOrdenDetaProduMaquina = new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden Maquina DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduMaquina= new GridBagLayout();
		

		
		String sToolTipProductoOrdenDetaProduMaquina="";
		sToolTipProductoOrdenDetaProduMaquina=ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduMaquina+="(Produccion.ProductoOrdenDetaProduMaquina)";
		}
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduMaquina+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonModificarProductoOrdenDetaProduMaquina = new JButtonMe();
        this.jButtonActualizarProductoOrdenDetaProduMaquina = new JButtonMe();
        this.jButtonEliminarProductoOrdenDetaProduMaquina = new JButtonMe();
        this.jButtonCancelarProductoOrdenDetaProduMaquina = new JButtonMe();
        this.jButtonGuardarCambiosProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduMaquina = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduMaquina = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina = new JScrollPane();
				
		
		
		this.jPanelCamposProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Maquina";
		
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Maquinaes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduMaquina.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoOrdenDetaProduMaquina.setName("jPanelCamposProductoOrdenDetaProduMaquina"); 

		this.jPanelCamposOcultosProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoOrdenDetaProduMaquina.setName("jPanelCamposOcultosProductoOrdenDetaProduMaquina"); 

        this.jPanelAccionesProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduMaquina.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduMaquina.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoOrdenDetaProduMaquina.setText("Nuevo");
		this.jButtonModificarProductoOrdenDetaProduMaquina.setText("Editar");
        this.jButtonActualizarProductoOrdenDetaProduMaquina.setText("Actualizar");
        this.jButtonEliminarProductoOrdenDetaProduMaquina.setText("Eliminar");
        this.jButtonCancelarProductoOrdenDetaProduMaquina.setText("Cancelar");
        this.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduMaquina.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduMaquina,"nuevo_button","Nuevo",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoOrdenDetaProduMaquina,"modificar_button","Editar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoOrdenDetaProduMaquina,"actualizar_button","Actualizar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoOrdenDetaProduMaquina,"eliminar_button","Eliminar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoOrdenDetaProduMaquina,"cancelar_button","Cancelar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoOrdenDetaProduMaquina,"guardarcambios_button","Guardar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina,"guardarcambiostabla_button","Guardar",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduMaquina,"cerrar_button","Salir",this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoOrdenDetaProduMaquina.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoOrdenDetaProduMaquina.setToolTipText("Editar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoOrdenDetaProduMaquina.setToolTipText("Actualizar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoOrdenDetaProduMaquina.setToolTipText("Eliminar)"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoOrdenDetaProduMaquina.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoOrdenDetaProduMaquina.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduMaquina.setToolTipText("Salir"+" "+ProductoOrdenDetaProduMaquinaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduMaquina"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoOrdenDetaProduMaquina"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoOrdenDetaProduMaquina"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoOrdenDetaProduMaquina"));
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduMaquina"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduMaquina";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMaquina.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduMaquina"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina.setToolTipText("Nuevo ProductoOrdenDetaProduMaquina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina.setToolTipText("Sin Cerrar Ventana ProductoOrdenDetaProduMaquina");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoOrdenDetaProduMaquina = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoOrdenDetaProduMaquina();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoOrdenDetaProduMaquina();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoOrdenDetaProduMaquina = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoOrdenDetaProduMaquina = new GridBagLayout();
		
		this.jPanelCamposProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutCamposProductoOrdenDetaProduMaquina);
		this.jPanelCamposOcultosProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutCamposOcultosProductoOrdenDetaProduMaquina);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoOrdenDetaProduMaquina.add(jLabelIdProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoOrdenDetaProduMaquina.add(jLabelidProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.add(jLabelid_orden_deta_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.add(jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.add(jButtonid_orden_deta_produProductoOrdenDetaProduMaquinaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina.add(jComboBoxid_orden_deta_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.add(jLabelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.add(jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.add(jButtonid_tipo_area_empresa_produProductoOrdenDetaProduMaquinaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina.add(jComboBoxid_tipo_area_empresa_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.add(jLabelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.add(jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.add(jButtonid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquinaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina.add(jComboBoxid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.add(jLabelid_tipo_merma_empresaProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.add(jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.add(jButtonid_tipo_merma_empresaProductoOrdenDetaProduMaquinaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina.add(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoOrdenDetaProduMaquina.add(jLabelid_unidadProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduMaquina.add(jButtonid_unidadProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduMaquina.add(jButtonid_unidadProductoOrdenDetaProduMaquinaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoOrdenDetaProduMaquina.add(jComboBoxid_unidadProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoOrdenDetaProduMaquina.add(jLabelcantidadProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoOrdenDetaProduMaquina.add(jButtoncantidadProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoOrdenDetaProduMaquina.add(jTextFieldcantidadProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoOrdenDetaProduMaquina.add(jLabelcostoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoOrdenDetaProduMaquina.add(jButtoncostoProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoOrdenDetaProduMaquina.add(jTextFieldcostoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoOrdenDetaProduMaquina.add(jLabelcosto_totalProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoOrdenDetaProduMaquina.add(jButtoncosto_totalProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoOrdenDetaProduMaquina.add(jTextFieldcosto_totalProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoOrdenDetaProduMaquina.add(jLabeldescripcionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoOrdenDetaProduMaquina.add(jButtondescripcionProductoOrdenDetaProduMaquinaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoOrdenDetaProduMaquina.add(jscrollPanedescripcionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelidProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelid_orden_deta_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelid_tipo_area_empresa_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelid_tipo_proceso_empresa_produProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelid_unidadProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelcantidadProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelcostoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPanelcosto_totalProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iYPanelCamposProductoOrdenDetaProduMaquina;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iXPanelCamposProductoOrdenDetaProduMaquina++;
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMaquina.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMaquina.add(this.jPaneldescripcionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);



	if(iXPanelCamposProductoOrdenDetaProduMaquina % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMaquina=0;
		iYPanelCamposProductoOrdenDetaProduMaquina++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduMaquina= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduMaquina);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoOrdenDetaProduMaquina= new GridBagLayout();
		this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutAccionesFormularioProductoOrdenDetaProduMaquina);
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.add(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.add(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.add(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoordendetaprodumaquinaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina.add(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduMaquina.add(this.jButtonModificarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);							

		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduMaquina.add(this.jButtonEliminarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMaquina.add(this.jButtonActualizarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);


		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMaquina.add(this.jButtonGuardarCambiosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);	
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMaquina.add(this.jButtonCancelarProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduMaquina = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduMaquina);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodumaquinaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoOrdenDetaProduMaquinaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoOrdenDetaProduMaquina = new ProductoOrdenDetaProduMaquinaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden Maquina DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden Maquina DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Maquina Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoOrdenDetaProduMaquinaModel productoordendetaprodumaquinaModel=new ProductoOrdenDetaProduMaquinaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoOrdenDetaProduMaquinaModel.ProductoOrdenDetaProduMaquinaFocusTraversalPolicy productoordendetaprodumaquinaFocusTraversalPolicy = productoordendetaprodumaquinaModel.new ProductoOrdenDetaProduMaquinaFocusTraversalPolicy(this);
			
			//productoordendetaprodumaquinaFocusTraversalPolicy.setproductoordendetaprodumaquinaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoordendetaprodumaquinaModel);
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduMaquina = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoOrdenDetaProduMaquina = new GridBagLayout();	
			this.jContentPaneDetalleProductoOrdenDetaProduMaquina.setLayout(gridaBagLayoutDetalleProductoOrdenDetaProduMaquina);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMaquina = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
					
				
				this.jContentPaneDetalleProductoOrdenDetaProduMaquina.add(jTtoolBarDetalleProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);								
				
}
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina=   new JScrollPane(jContentPaneDetalleProductoOrdenDetaProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	        
			this.jContentPaneDetalleProductoOrdenDetaProduMaquina.add(jPanelCamposProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			
			
			
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
						&& productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoordendetaprodumaquinaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoOrdenDetaProduMaquina= new GridBagConstraints();
						this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
						this.jContentPaneDetalleProductoOrdenDetaProduMaquina.add(this.jTabbedPaneRelacionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoOrdenDetaProduMaquina.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoOrdenDetaProduMaquina.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
					this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
					
				
					this.jContentPaneDetalleProductoOrdenDetaProduMaquina.add(jPanelCamposOcultosProductoOrdenDetaProduMaquina, gridBagConstraintsProductoOrdenDetaProduMaquina);
				
					this.jPanelCamposOcultosProductoOrdenDetaProduMaquina.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	        this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduMaquina.add(this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);							
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
	        this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoOrdenDetaProduMaquina.add(this.jPanelAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina=   new JScrollPane(this.jPanelCamposProductoOrdenDetaProduMaquina,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);			
			
			this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMaquina = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMaquina.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMaquina, this.gridBagConstraintsProductoOrdenDetaProduMaquina);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoOrdenDetaProduMaquina;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoOrdenDetaProduMaquina;
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
