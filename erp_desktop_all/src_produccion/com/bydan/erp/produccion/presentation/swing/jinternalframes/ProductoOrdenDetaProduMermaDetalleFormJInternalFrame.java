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
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduMermaConstantesFunciones;

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
public class ProductoOrdenDetaProduMermaDetalleFormJInternalFrame extends ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProductoOrdenDetaProduMerma;
	
	protected JMenuBar jmenuBarDetalleProductoOrdenDetaProduMerma;
	
	protected JMenu jmenuDetalleProductoOrdenDetaProduMerma;
	protected JMenu jmenuDetalleArchivoProductoOrdenDetaProduMerma;
	protected JMenu jmenuDetalleAccionesProductoOrdenDetaProduMerma;
	protected JMenu jmenuDetalleDatosProductoOrdenDetaProduMerma;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProductoOrdenDetaProduMerma;	
	protected GridBagConstraints gridBagConstraintsProductoOrdenDetaProduMerma;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional jInternalFrameDetalleProductoOrdenDetaProduMerma;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordendetaprodu="";

	protected TipoMermaEmpresaBeanSwingJInternalFrame tipomermaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomermaempresa="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";
	
	public ProductoOrdenDetaProduMermaSessionBean productoordendetaprodumermaSessionBean;
	
	
	
	
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	public TipoMermaEmpresaSessionBean tipomermaempresaSessionBean;
	public UnidadSessionBean unidadSessionBean;	
	
	public ProductoOrdenDetaProduMermaLogic productoordendetaprodumermaLogic;
	
	public JScrollPane jScrollPanelDatosProductoOrdenDetaProduMerma;
	public JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProduMerma;
	public JScrollPane jScrollPanelDatosGeneralProductoOrdenDetaProduMerma;
	
	protected JPanel jPanelCamposProductoOrdenDetaProduMerma;    
	protected JPanel jPanelCamposOcultosProductoOrdenDetaProduMerma;    	
	protected JPanel jPanelAccionesProductoOrdenDetaProduMerma;
	protected JPanel jPanelAccionesFormularioProductoOrdenDetaProduMerma;
    
	
	
	protected Integer iXPanelCamposProductoOrdenDetaProduMerma=0;
	protected Integer iYPanelCamposProductoOrdenDetaProduMerma=0;
	
	protected Integer iXPanelCamposOcultosProductoOrdenDetaProduMerma=0;
	protected Integer iYPanelCamposOcultosProductoOrdenDetaProduMerma=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProductoOrdenDetaProduMerma;
	public JButton jButtonModificarProductoOrdenDetaProduMerma;
	public JButton jButtonActualizarProductoOrdenDetaProduMerma;
    public JButton jButtonEliminarProductoOrdenDetaProduMerma;
	public JButton jButtonCancelarProductoOrdenDetaProduMerma;
    public JButton jButtonGuardarCambiosProductoOrdenDetaProduMerma;
	public JButton jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma;
	protected JButton jButtonCerrarProductoOrdenDetaProduMerma;
	
	
	protected JButton jButtonProcesarInformacionProductoOrdenDetaProduMerma;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonModificarToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonActualizarToolBarProductoOrdenDetaProduMerma;
    protected JButton jButtonEliminarToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonCancelarToolBarProductoOrdenDetaProduMerma;
    protected JButton jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProduMerma;
	protected JButton jButtonCerrarToolBarProductoOrdenDetaProduMerma;
	
	protected JButton jButtonProcesarInformacionToolBarProductoOrdenDetaProduMerma;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemModificarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemActualizarProductoOrdenDetaProduMerma;
    protected JMenuItem jMenuItemEliminarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemCancelarProductoOrdenDetaProduMerma;
    protected JMenuItem jMenuItemGuardarCambiosProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemGuardarCambiosTablaProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemCerrarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemDetalleCerrarProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma;
	
	protected JMenuItem jMenuItemProcesarInformacionProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProductoOrdenDetaProduMerma;
	protected JMenuItem jMenuItemMostrarOcultarProductoOrdenDetaProduMerma;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProductoOrdenDetaProduMerma;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMerma;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProductoOrdenDetaProduMerma;
	public JLabel jLabelIdProductoOrdenDetaProduMerma;
	public JLabel jLabelidProductoOrdenDetaProduMerma;
	public JButton jButtonidProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadProductoOrdenDetaProduMerma;
	public JLabel jLabelcantidadProductoOrdenDetaProduMerma;
	public JTextField jTextFieldcantidadProductoOrdenDetaProduMerma;
	public JButton jButtoncantidadProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelcostoProductoOrdenDetaProduMerma;
	public JLabel jLabelcostoProductoOrdenDetaProduMerma;
	public JTextField jTextFieldcostoProductoOrdenDetaProduMerma;
	public JButton jButtoncostoProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalProductoOrdenDetaProduMerma;
	public JLabel jLabelcosto_totalProductoOrdenDetaProduMerma;
	public JTextField jTextFieldcosto_totalProductoOrdenDetaProduMerma;
	public JButton jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionProductoOrdenDetaProduMerma;
	public JLabel jLabeldescripcionProductoOrdenDetaProduMerma;
	public JTextArea jTextAreadescripcionProductoOrdenDetaProduMerma;
	public JScrollPane jscrollPanedescripcionProductoOrdenDetaProduMerma;
	public JButton jButtondescripcionProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_orden_deta_produProductoOrdenDetaProduMerma;
	public JLabel jLabelid_orden_deta_produProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma;
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMerma= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma;
	public JLabel jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma;
	public JButton jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadProductoOrdenDetaProduMerma;
	public JLabel jLabelid_unidadProductoOrdenDetaProduMerma;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadProductoOrdenDetaProduMerma;
	public JButton jButtonid_unidadProductoOrdenDetaProduMerma= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduMermaUpdate= new JButtonMe();
	public JButton jButtonid_unidadProductoOrdenDetaProduMermaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProductoOrdenDetaProduMerma;
	
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
	
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProductoOrdenDetaProduMerma=new JPanel();
				this.jPanelAccionesFormularioProductoOrdenDetaProduMerma=new JPanel();
				this.jmenuBarDetalleProductoOrdenDetaProduMerma=new JMenuBar();
				this.jTtoolBarDetalleProductoOrdenDetaProduMerma=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProductoOrdenDetaProduMermaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProductoOrdenDetaProduMerma No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProductoOrdenDetaProduMerma() {
		return this.jButtonActualizarToolBarProductoOrdenDetaProduMerma;
	}
	
	public JButton getjButtonEliminarToolBarProductoOrdenDetaProduMerma() {
		return this.jButtonEliminarToolBarProductoOrdenDetaProduMerma;
	}
	
	public JButton getjButtonCancelarToolBarProductoOrdenDetaProduMerma() {
		return this.jButtonCancelarToolBarProductoOrdenDetaProduMerma;
	}		
	
	public JButton getjButtonProcesarInformacionProductoOrdenDetaProduMerma() {
		return this.jButtonProcesarInformacionProductoOrdenDetaProduMerma;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProductoOrdenDetaProduMerma)	{
		this.jButtonProcesarInformacionProductoOrdenDetaProduMerma = jButtonProcesarInformacionProductoOrdenDetaProduMerma;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposRelacionesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposRelacionesProductoOrdenDetaProduMerma = jComboBoxTiposRelacionesProductoOrdenDetaProduMerma;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposAccionesProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma = jComboBoxTiposAccionesProductoOrdenDetaProduMerma;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma() {
		return this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma(
			JComboBox jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma) {
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma = jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.productoordendetaprodumermaSessionBean=new ProductoOrdenDetaProduMermaSessionBean();
		
		this.productoordendetaprodumermaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaprodumermaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProductoOrdenDetaProduMermaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProductoOrdenDetaProduMermaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Merma MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
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
	
		ProductoOrdenDetaProduMermaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProductoOrdenDetaProduMerma= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProductoOrdenDetaProduMerma=new JButtonMe();
				this.jButtonModificarToolBarProductoOrdenDetaProduMerma=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProductoOrdenDetaProduMerma,this.jTtoolBarDetalleProductoOrdenDetaProduMerma,
							"actualizar","actualizar","Actualizar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProductoOrdenDetaProduMerma,this.jTtoolBarDetalleProductoOrdenDetaProduMerma,
							"eliminar","eliminar","Eliminar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProductoOrdenDetaProduMerma,this.jTtoolBarDetalleProductoOrdenDetaProduMerma,
							"cancelar","cancelar","Cancelar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProductoOrdenDetaProduMerma,this.jTtoolBarDetalleProductoOrdenDetaProduMerma,
							"guardarcambios","guardarcambios","Guardar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProductoOrdenDetaProduMerma=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProductoOrdenDetaProduMerma=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProductoOrdenDetaProduMerma=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProductoOrdenDetaProduMerma=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProductoOrdenDetaProduMerma=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProductoOrdenDetaProduMerma= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProductoOrdenDetaProduMerma.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProductoOrdenDetaProduMerma,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProductoOrdenDetaProduMerma= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProductoOrdenDetaProduMerma.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProductoOrdenDetaProduMerma,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProductoOrdenDetaProduMerma= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProductoOrdenDetaProduMerma.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProductoOrdenDetaProduMerma,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProductoOrdenDetaProduMerma= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProductoOrdenDetaProduMerma.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProductoOrdenDetaProduMerma,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProductoOrdenDetaProduMerma= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProductoOrdenDetaProduMerma.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProductoOrdenDetaProduMerma,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProductoOrdenDetaProduMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProductoOrdenDetaProduMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProductoOrdenDetaProduMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProductoOrdenDetaProduMerma.add(this.jMenuItemDetalleCerrarProductoOrdenDetaProduMerma);
		
		this.jmenuDetalleAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemActualizarProductoOrdenDetaProduMerma);
		this.jmenuDetalleAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemEliminarProductoOrdenDetaProduMerma);
		this.jmenuDetalleAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemCancelarProductoOrdenDetaProduMerma);		
		
		//this.jmenuDetalleDatosProductoOrdenDetaProduMerma.add(this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProduMerma);				
		this.jmenuDetalleDatosProductoOrdenDetaProduMerma.add(this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProduMerma);				
				
		//this.jmenuDetalleAccionesProductoOrdenDetaProduMerma.add(this.jMenuItemGuardarCambiosProductoOrdenDetaProduMerma);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProductoOrdenDetaProduMerma.add(this.jmenuDetalleArchivoProductoOrdenDetaProduMerma);		
		this.jmenuBarDetalleProductoOrdenDetaProduMerma.add(this.jmenuDetalleAccionesProductoOrdenDetaProduMerma);		
		this.jmenuBarDetalleProductoOrdenDetaProduMerma.add(this.jmenuDetalleDatosProductoOrdenDetaProduMerma);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProductoOrdenDetaProduMerma);				
	}
	
	
	public void inicializarElementosCamposProductoOrdenDetaProduMerma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProductoOrdenDetaProduMerma = new JLabelMe();
		jLabelIdProductoOrdenDetaProduMerma.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProductoOrdenDetaProduMerma = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProductoOrdenDetaProduMerma= new GridBagLayout();

		this.jPanelidProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);

		jLabelidProductoOrdenDetaProduMerma = new JLabel();
		jLabelidProductoOrdenDetaProduMerma.setText("Id");

		jLabelidProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabelcantidadProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadProductoOrdenDetaProduMerma.setToolTipText("Cantad");
		this.jLabelcantidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPanelcantidadProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jTextFieldcantidadProductoOrdenDetaProduMerma= new JTextFieldMe();
		jTextFieldcantidadProductoOrdenDetaProduMerma.setEnabled(false);
		jTextFieldcantidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadProductoOrdenDetaProduMerma.setText("0");

		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}


					
		this.jLabelcostoProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabelcostoProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoProductoOrdenDetaProduMerma.setToolTipText("Costo");
		this.jLabelcostoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPanelcostoProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jTextFieldcostoProductoOrdenDetaProduMerma= new JTextFieldMe();
		jTextFieldcostoProductoOrdenDetaProduMerma.setEnabled(false);
		jTextFieldcostoProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoProductoOrdenDetaProduMerma.setText("0.0");

		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabelcosto_totalProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalProductoOrdenDetaProduMerma.setToolTipText("Costo Total");
		this.jLabelcosto_totalProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPanelcosto_totalProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jTextFieldcosto_totalProductoOrdenDetaProduMerma= new JTextFieldMe();
		jTextFieldcosto_totalProductoOrdenDetaProduMerma.setEnabled(false);
		jTextFieldcosto_totalProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalProductoOrdenDetaProduMerma.setText("0.0");

		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabeldescripcionProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionProductoOrdenDetaProduMerma.setToolTipText("Descripcion");
		this.jLabeldescripcionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPaneldescripcionProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jTextAreadescripcionProductoOrdenDetaProduMerma= new JTextAreaMe();
		jTextAreadescripcionProductoOrdenDetaProduMerma.setEnabled(false);
		jTextAreadescripcionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionProductoOrdenDetaProduMerma.setLineWrap(true);
		jTextAreadescripcionProductoOrdenDetaProduMerma.setWrapStyleWord(true);
		jTextAreadescripcionProductoOrdenDetaProduMerma.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionProductoOrdenDetaProduMerma.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionProductoOrdenDetaProduMerma = new JScrollPane(jTextAreadescripcionProductoOrdenDetaProduMerma);
		jscrollPanedescripcionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProductoOrdenDetaProduMerma() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU+" : *");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMerma.setToolTipText("Orden Deta Produ");
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_orden_deta_produProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_deta_produProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDORDENDETAPRODU);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma= new JComboBoxMe();
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma.setText("Buscar");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMerma"));

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}

		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate= new JButtonMe();
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.setText("U");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_deta_produProductoOrdenDetaProduMermaUpdate"));



					
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA+" : *");
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setToolTipText("Tipo Merma Empresa");
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDTIPOMERMAEMPRESA);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma= new JComboBoxMe();
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma.setText("Buscar");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoOrdenDetaProduMerma"));

		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate= new JButtonMe();
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.setText("U");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate"));



					
		this.jLabelid_unidadProductoOrdenDetaProduMerma = new JLabelMe();
		this.jLabelid_unidadProductoOrdenDetaProduMerma.setText(""+ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadProductoOrdenDetaProduMerma.setToolTipText("Unad");
		this.jLabelid_unidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadProductoOrdenDetaProduMerma=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadProductoOrdenDetaProduMerma.setToolTipText(ProductoOrdenDetaProduMermaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		this.jPanelid_unidadProductoOrdenDetaProduMerma.setLayout(this.gridaBagLayoutProductoOrdenDetaProduMerma);


		jComboBoxid_unidadProductoOrdenDetaProduMerma= new JComboBoxMe();
		jComboBoxid_unidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadProductoOrdenDetaProduMerma= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadProductoOrdenDetaProduMerma.setText("Buscar");
		this.jButtonid_unidadProductoOrdenDetaProduMerma.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMerma.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMerma,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMerma"));

		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMermaBusqueda"));

		if(this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadProductoOrdenDetaProduMermaBusqueda.setVisible(false);		}

		this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate= new JButtonMe();
		this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.setText("U");
		this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadProductoOrdenDetaProduMermaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadProductoOrdenDetaProduMerma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadProductoOrdenDetaProduMerma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadProductoOrdenDetaProduMermaUpdate"));



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
		//this.jInternalFrameDetalleProductoOrdenDetaProduMerma = new ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden Merma DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProductoOrdenDetaProduMerma= new GridBagLayout();
		

		
		String sToolTipProductoOrdenDetaProduMerma="";
		sToolTipProductoOrdenDetaProduMerma=ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProductoOrdenDetaProduMerma+="(Produccion.ProductoOrdenDetaProduMerma)";
		}
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			sToolTipProductoOrdenDetaProduMerma+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonModificarProductoOrdenDetaProduMerma = new JButtonMe();
        this.jButtonActualizarProductoOrdenDetaProduMerma = new JButtonMe();
        this.jButtonEliminarProductoOrdenDetaProduMerma = new JButtonMe();
        this.jButtonCancelarProductoOrdenDetaProduMerma = new JButtonMe();
        this.jButtonGuardarCambiosProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma = new JButtonMe();
		this.jButtonCerrarProductoOrdenDetaProduMerma = new JButtonMe();
		
		this.jScrollPanelDatosProductoOrdenDetaProduMerma = new JScrollPane();   
        this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma = new JScrollPane();
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma = new JScrollPane();
				
		
		
		this.jPanelCamposProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Merma";
		
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Mermaes" + this.sPath));
		} else {
			this.jScrollPanelDatosProductoOrdenDetaProduMerma.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProductoOrdenDetaProduMerma.setName("jPanelCamposProductoOrdenDetaProduMerma"); 

		this.jPanelCamposOcultosProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProductoOrdenDetaProduMerma.setName("jPanelCamposOcultosProductoOrdenDetaProduMerma"); 

        this.jPanelAccionesProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProductoOrdenDetaProduMerma.setToolTipText("Acciones");
        this.jPanelAccionesProductoOrdenDetaProduMerma.setName("Acciones"); 

		this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProductoOrdenDetaProduMerma.setText("Nuevo");
		this.jButtonModificarProductoOrdenDetaProduMerma.setText("Editar");
        this.jButtonActualizarProductoOrdenDetaProduMerma.setText("Actualizar");
        this.jButtonEliminarProductoOrdenDetaProduMerma.setText("Eliminar");
        this.jButtonCancelarProductoOrdenDetaProduMerma.setText("Cancelar");
        this.jButtonGuardarCambiosProductoOrdenDetaProduMerma.setText("Guardar");
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.setText("Guardar");
		this.jButtonCerrarProductoOrdenDetaProduMerma.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProductoOrdenDetaProduMerma,"nuevo_button","Nuevo",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProductoOrdenDetaProduMerma,"modificar_button","Editar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProductoOrdenDetaProduMerma,"actualizar_button","Actualizar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProductoOrdenDetaProduMerma,"eliminar_button","Eliminar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProductoOrdenDetaProduMerma,"cancelar_button","Cancelar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProductoOrdenDetaProduMerma,"guardarcambios_button","Guardar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma,"guardarcambiostabla_button","Guardar",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProductoOrdenDetaProduMerma,"cerrar_button","Salir",this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProductoOrdenDetaProduMerma.setToolTipText("Nuevo"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProductoOrdenDetaProduMerma.setToolTipText("Editar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProductoOrdenDetaProduMerma.setToolTipText("Actualizar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProductoOrdenDetaProduMerma.setToolTipText("Eliminar)"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProductoOrdenDetaProduMerma.setToolTipText("Cancelar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProductoOrdenDetaProduMerma.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.setToolTipText("Guardar"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProductoOrdenDetaProduMerma.setToolTipText("Salir"+" "+ProductoOrdenDetaProduMermaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProductoOrdenDetaProduMerma";
		inputMap = this.jButtonNuevoProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProductoOrdenDetaProduMerma.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProductoOrdenDetaProduMerma"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonActualizarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProductoOrdenDetaProduMerma"));
		
		//ELIMINAR
		sMapKey = "EliminarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonEliminarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProductoOrdenDetaProduMerma"));
		
		//CANCELAR	
		sMapKey = "CancelarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonCancelarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProductoOrdenDetaProduMerma"));
		
		//CERRAR		
		sMapKey = "CerrarProductoOrdenDetaProduMerma";
		inputMap = this.jButtonCerrarProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProductoOrdenDetaProduMerma"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProductoOrdenDetaProduMerma";
		inputMap = this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProduMerma.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProductoOrdenDetaProduMerma"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma.setToolTipText("Nuevo ProductoOrdenDetaProduMerma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma.setToolTipText("Sin Cerrar Ventana ProductoOrdenDetaProduMerma");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setText("Accion");
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProductoOrdenDetaProduMerma = new JLabelMe();
		
		this.jLabelAccionesProductoOrdenDetaProduMerma.setText("Acciones");		
		this.jLabelAccionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProductoOrdenDetaProduMerma();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProductoOrdenDetaProduMerma();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma=new JTabbedPane();
		this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProductoOrdenDetaProduMerma = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProductoOrdenDetaProduMerma = new GridBagLayout();
		
		this.jPanelCamposProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutCamposProductoOrdenDetaProduMerma);
		this.jPanelCamposOcultosProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutCamposOcultosProductoOrdenDetaProduMerma);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProductoOrdenDetaProduMerma.add(jLabelIdProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProductoOrdenDetaProduMerma.add(jLabelidProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.add(jLabelid_orden_deta_produProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.add(jButtonid_orden_deta_produProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.add(jButtonid_orden_deta_produProductoOrdenDetaProduMermaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma.add(jComboBoxid_orden_deta_produProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.add(jLabelid_tipo_merma_empresaProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.add(jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.add(jButtonid_tipo_merma_empresaProductoOrdenDetaProduMermaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma.add(jComboBoxid_tipo_merma_empresaProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadProductoOrdenDetaProduMerma.add(jLabelid_unidadProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduMerma.add(jButtonid_unidadProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 3;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadProductoOrdenDetaProduMerma.add(jButtonid_unidadProductoOrdenDetaProduMermaUpdate, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadProductoOrdenDetaProduMerma.add(jComboBoxid_unidadProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadProductoOrdenDetaProduMerma.add(jLabelcantidadProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadProductoOrdenDetaProduMerma.add(jButtoncantidadProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadProductoOrdenDetaProduMerma.add(jTextFieldcantidadProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoProductoOrdenDetaProduMerma.add(jLabelcostoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoProductoOrdenDetaProduMerma.add(jButtoncostoProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoProductoOrdenDetaProduMerma.add(jTextFieldcostoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalProductoOrdenDetaProduMerma.add(jLabelcosto_totalProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalProductoOrdenDetaProduMerma.add(jButtoncosto_totalProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalProductoOrdenDetaProduMerma.add(jTextFieldcosto_totalProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionProductoOrdenDetaProduMerma.add(jLabeldescripcionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 2;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionProductoOrdenDetaProduMerma.add(jButtondescripcionProductoOrdenDetaProduMermaBusqueda, this.gridBagConstraintsProductoOrdenDetaProduMerma);
	}

	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 1;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionProductoOrdenDetaProduMerma.add(jscrollPanedescripcionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelidProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelid_orden_deta_produProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelid_tipo_merma_empresaProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelid_unidadProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelcantidadProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelcostoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPanelcosto_totalProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
	}
	this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iYPanelCamposProductoOrdenDetaProduMerma;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iXPanelCamposProductoOrdenDetaProduMerma++;
	this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProductoOrdenDetaProduMerma.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProductoOrdenDetaProduMerma.add(this.jPaneldescripcionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);



	if(iXPanelCamposProductoOrdenDetaProduMerma % 1==0) {
		iXPanelCamposProductoOrdenDetaProduMerma=0;
		iYPanelCamposProductoOrdenDetaProduMerma++;
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
			
		GridBagLayout gridaBagLayoutAccionesProductoOrdenDetaProduMerma= new GridBagLayout();
		this.jPanelAccionesProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutAccionesProductoOrdenDetaProduMerma);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProductoOrdenDetaProduMerma= new GridBagLayout();
		this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutAccionesFormularioProductoOrdenDetaProduMerma);
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.add(this.jComboBoxTiposAccionesFormularioProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.add(this.jCheckBoxPostAccionNuevoProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.add(this.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.productoordendetaprodumermaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProductoOrdenDetaProduMerma.add(this.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduMerma.add(this.jButtonModificarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);							

		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iPosXAccion++;
			
		this.jPanelAccionesProductoOrdenDetaProduMerma.add(this.jButtonEliminarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMerma.add(this.jButtonActualizarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);


		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMerma.add(this.jButtonGuardarCambiosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);	
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = 0;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =iPosXAccion++;
		
		this.jPanelAccionesProductoOrdenDetaProduMerma.add(this.jButtonCancelarProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProductoOrdenDetaProduMerma = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProductoOrdenDetaProduMerma);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.productoordendetaprodumermaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();						
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;		
			//this.gridBagConstraintsProductoOrdenDetaProduMerma.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProductoOrdenDetaProduMerma.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =0;
		this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProductoOrdenDetaProduMerma.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProductoOrdenDetaProduMermaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProductoOrdenDetaProduMerma = new ProductoOrdenDetaProduMermaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden Merma DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden Merma DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Merma Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProductoOrdenDetaProduMermaModel productoordendetaprodumermaModel=new ProductoOrdenDetaProduMermaModel(this);
			
			//SI USARA CLASE INTERNA
			//ProductoOrdenDetaProduMermaModel.ProductoOrdenDetaProduMermaFocusTraversalPolicy productoordendetaprodumermaFocusTraversalPolicy = productoordendetaprodumermaModel.new ProductoOrdenDetaProduMermaFocusTraversalPolicy(this);
			
			//productoordendetaprodumermaFocusTraversalPolicy.setproductoordendetaprodumermaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(productoordendetaprodumermaModel);
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduMerma = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProductoOrdenDetaProduMerma = new GridBagLayout();	
			this.jContentPaneDetalleProductoOrdenDetaProduMerma.setLayout(gridaBagLayoutDetalleProductoOrdenDetaProduMerma);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProductoOrdenDetaProduMerma = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
				this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
					
				
				this.jContentPaneDetalleProductoOrdenDetaProduMerma.add(jTtoolBarDetalleProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);								
				
}
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma=   new JScrollPane(jContentPaneDetalleProductoOrdenDetaProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	        
			this.jContentPaneDetalleProductoOrdenDetaProduMerma.add(jPanelCamposProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);
			
			
			
			
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
						&& productoordendetaprodumermaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.productoordendetaprodumermaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProductoOrdenDetaProduMerma= new GridBagConstraints();
						this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
						this.jContentPaneDetalleProductoOrdenDetaProduMerma.add(this.jTabbedPaneRelacionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProductoOrdenDetaProduMerma.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProductoOrdenDetaProduMerma.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
					this.gridBagConstraintsProductoOrdenDetaProduMerma.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
					
				
					this.jContentPaneDetalleProductoOrdenDetaProduMerma.add(jPanelCamposOcultosProductoOrdenDetaProduMerma, gridBagConstraintsProductoOrdenDetaProduMerma);
				
					this.jPanelCamposOcultosProductoOrdenDetaProduMerma.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	        this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProductoOrdenDetaProduMerma.add(this.jPanelAccionesFormularioProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);							
			
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
	        this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
	        
			
			this.jContentPaneDetalleProductoOrdenDetaProduMerma.add(this.jPanelAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProductoOrdenDetaProduMerma);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma=   new JScrollPane(this.jPanelCamposProductoOrdenDetaProduMerma,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProductoOrdenDetaProduMerma.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);			
			
			this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
			
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		
			
		this.gridBagConstraintsProductoOrdenDetaProduMerma = new GridBagConstraints();
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProductoOrdenDetaProduMerma.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProductoOrdenDetaProduMerma, this.gridBagConstraintsProductoOrdenDetaProduMerma);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProductoOrdenDetaProduMerma;//jContentPane;
		
		return jScrollPanelDatosEdicionProductoOrdenDetaProduMerma;
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
