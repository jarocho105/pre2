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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.VentasLineasConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class VentasLineasDetalleFormJInternalFrame extends VentasLineasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVentasLineas;
	
	protected JMenuBar jmenuBarDetalleVentasLineas;
	
	protected JMenu jmenuDetalleVentasLineas;
	protected JMenu jmenuDetalleArchivoVentasLineas;
	protected JMenu jmenuDetalleAccionesVentasLineas;
	protected JMenu jmenuDetalleDatosVentasLineas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVentasLineas;	
	protected GridBagConstraints gridBagConstraintsVentasLineas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VentasLineasBeanSwingJInternalFrameAdditional jInternalFrameDetalleVentasLineas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_linea="";

	protected LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineagrupo="";

	protected LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineacategoria="";

	protected LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_lineamarca="";
	
	public VentasLineasSessionBean ventaslineasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public LineaSessionBean lineaSessionBean;
	public LineaSessionBean lineagrupoSessionBean;
	public LineaSessionBean lineacategoriaSessionBean;
	public LineaSessionBean lineamarcaSessionBean;	
	
	public VentasLineasLogic ventaslineasLogic;
	
	public JScrollPane jScrollPanelDatosVentasLineas;
	public JScrollPane jScrollPanelDatosEdicionVentasLineas;
	public JScrollPane jScrollPanelDatosGeneralVentasLineas;
	
	protected JPanel jPanelCamposVentasLineas;    
	protected JPanel jPanelCamposOcultosVentasLineas;    	
	protected JPanel jPanelAccionesVentasLineas;
	protected JPanel jPanelAccionesFormularioVentasLineas;
    
	
	
	protected Integer iXPanelCamposVentasLineas=0;
	protected Integer iYPanelCamposVentasLineas=0;
	
	protected Integer iXPanelCamposOcultosVentasLineas=0;
	protected Integer iYPanelCamposOcultosVentasLineas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVentasLineas;
	public JButton jButtonModificarVentasLineas;
	public JButton jButtonActualizarVentasLineas;
    public JButton jButtonEliminarVentasLineas;
	public JButton jButtonCancelarVentasLineas;
    public JButton jButtonGuardarCambiosVentasLineas;
	public JButton jButtonGuardarCambiosTablaVentasLineas;
	protected JButton jButtonCerrarVentasLineas;
	
	
	protected JButton jButtonProcesarInformacionVentasLineas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVentasLineas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVentasLineas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVentasLineas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVentasLineas;
	protected JButton jButtonModificarToolBarVentasLineas;
	protected JButton jButtonActualizarToolBarVentasLineas;
    protected JButton jButtonEliminarToolBarVentasLineas;
	protected JButton jButtonCancelarToolBarVentasLineas;
    protected JButton jButtonGuardarCambiosToolBarVentasLineas;
	protected JButton jButtonGuardarCambiosTablaToolBarVentasLineas;
	protected JButton jButtonMostrarOcultarTablaToolBarVentasLineas;
	protected JButton jButtonCerrarToolBarVentasLineas;
	
	protected JButton jButtonProcesarInformacionToolBarVentasLineas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVentasLineas;
	protected JMenuItem jMenuItemModificarVentasLineas;
	protected JMenuItem jMenuItemActualizarVentasLineas;
    protected JMenuItem jMenuItemEliminarVentasLineas;
	protected JMenuItem jMenuItemCancelarVentasLineas;
    protected JMenuItem jMenuItemGuardarCambiosVentasLineas;
	protected JMenuItem jMenuItemGuardarCambiosTablaVentasLineas;
	protected JMenuItem jMenuItemCerrarVentasLineas;
	protected JMenuItem jMenuItemDetalleCerrarVentasLineas;
	protected JMenuItem jMenuItemDetalleMostarOcultarVentasLineas;
	
	protected JMenuItem jMenuItemProcesarInformacionVentasLineas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVentasLineas;
	protected JMenuItem jMenuItemMostrarOcultarVentasLineas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVentasLineas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVentasLineas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVentasLineas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVentasLineas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVentasLineas;
	public JLabel jLabelIdVentasLineas;
	public JLabel jLabelidVentasLineas;
	public JButton jButtonidVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeVentasLineas;
	public JLabel jLabelfecha_emision_desdeVentasLineas;
	//public JFormattedTextField jDateChooserfecha_emision_desdeVentasLineas;

	public JDateChooser jDateChooserfecha_emision_desdeVentasLineas;
	public JButton jButtonfecha_emision_desdeVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaVentasLineas;
	public JLabel jLabelfecha_emision_hastaVentasLineas;
	//public JFormattedTextField jDateChooserfecha_emision_hastaVentasLineas;

	public JDateChooser jDateChooserfecha_emision_hastaVentasLineas;
	public JButton jButtonfecha_emision_hastaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_lineaVentasLineas;
	public JLabel jLabelnombre_lineaVentasLineas;
	public JTextArea jTextAreanombre_lineaVentasLineas;
	public JScrollPane jscrollPanenombre_lineaVentasLineas;
	public JButton jButtonnombre_lineaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_grupoVentasLineas;
	public JLabel jLabelnombre_grupoVentasLineas;
	public JTextArea jTextAreanombre_grupoVentasLineas;
	public JScrollPane jscrollPanenombre_grupoVentasLineas;
	public JButton jButtonnombre_grupoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_categoriaVentasLineas;
	public JLabel jLabelnombre_categoriaVentasLineas;
	public JTextArea jTextAreanombre_categoriaVentasLineas;
	public JScrollPane jscrollPanenombre_categoriaVentasLineas;
	public JButton jButtonnombre_categoriaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_marcaVentasLineas;
	public JLabel jLabelnombre_marcaVentasLineas;
	public JTextArea jTextAreanombre_marcaVentasLineas;
	public JScrollPane jscrollPanenombre_marcaVentasLineas;
	public JButton jButtonnombre_marcaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelmontoVentasLineas;
	public JLabel jLabelmontoVentasLineas;
	public JTextField jTextFieldmontoVentasLineas;
	public JButton jButtonmontoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelnotas_creditoVentasLineas;
	public JLabel jLabelnotas_creditoVentasLineas;
	public JTextField jTextFieldnotas_creditoVentasLineas;
	public JButton jButtonnotas_creditoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelventa_netaVentasLineas;
	public JLabel jLabelventa_netaVentasLineas;
	public JTextField jTextFieldventa_netaVentasLineas;
	public JButton jButtonventa_netaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeVentasLineas;
	public JLabel jLabelporcentajeVentasLineas;
	public JTextField jTextFieldporcentajeVentasLineas;
	public JButton jButtonporcentajeVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelacumuladoVentasLineas;
	public JLabel jLabelacumuladoVentasLineas;
	public JTextField jTextFieldacumuladoVentasLineas;
	public JButton jButtonacumuladoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPaneltipoVentasLineas;
	public JLabel jLabeltipoVentasLineas;
	public JTextField jTextFieldtipoVentasLineas;
	public JButton jButtontipoVentasLineasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVentasLineas;
	public JLabel jLabelid_empresaVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVentasLineas;
	public JButton jButtonid_empresaVentasLineas= new JButtonMe();
	public JButton jButtonid_empresaVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_empresaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_lineaVentasLineas;
	public JLabel jLabelid_lineaVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_lineaVentasLineas;
	public JButton jButtonid_lineaVentasLineas= new JButtonMe();
	public JButton jButtonid_lineaVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_lineaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_grupoVentasLineas;
	public JLabel jLabelid_linea_grupoVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_grupoVentasLineas;
	public JButton jButtonid_linea_grupoVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_grupoVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_grupoVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_categoriaVentasLineas;
	public JLabel jLabelid_linea_categoriaVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_categoriaVentasLineas;
	public JButton jButtonid_linea_categoriaVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_categoriaVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_categoriaVentasLineasBusqueda= new JButtonMe();

	public JPanel jPanelid_linea_marcaVentasLineas;
	public JLabel jLabelid_linea_marcaVentasLineas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_linea_marcaVentasLineas;
	public JButton jButtonid_linea_marcaVentasLineas= new JButtonMe();
	public JButton jButtonid_linea_marcaVentasLineasUpdate= new JButtonMe();
	public JButton jButtonid_linea_marcaVentasLineasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVentasLineas;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=704;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VentasLineasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVentasLineas=new JPanel();
				this.jPanelAccionesFormularioVentasLineas=new JPanel();
				this.jmenuBarDetalleVentasLineas=new JMenuBar();
				this.jTtoolBarDetalleVentasLineas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VentasLineasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VentasLineasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VentasLineas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVentasLineas() {
		return this.jButtonActualizarToolBarVentasLineas;
	}
	
	public JButton getjButtonEliminarToolBarVentasLineas() {
		return this.jButtonEliminarToolBarVentasLineas;
	}
	
	public JButton getjButtonCancelarToolBarVentasLineas() {
		return this.jButtonCancelarToolBarVentasLineas;
	}		
	
	public JButton getjButtonProcesarInformacionVentasLineas() {
		return this.jButtonProcesarInformacionVentasLineas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVentasLineas)	{
		this.jButtonProcesarInformacionVentasLineas = jButtonProcesarInformacionVentasLineas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVentasLineas() {
		return this.jComboBoxTiposAccionesVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVentasLineas(
			JComboBox jComboBoxTiposRelacionesVentasLineas) {
		this.jComboBoxTiposRelacionesVentasLineas = jComboBoxTiposRelacionesVentasLineas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVentasLineas(
			JComboBox jComboBoxTiposAccionesVentasLineas) {
		this.jComboBoxTiposAccionesVentasLineas = jComboBoxTiposAccionesVentasLineas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVentasLineas() {
		return this.jComboBoxTiposAccionesFormularioVentasLineas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVentasLineas(
			JComboBox jComboBoxTiposAccionesFormularioVentasLineas) {
		this.jComboBoxTiposAccionesFormularioVentasLineas = jComboBoxTiposAccionesFormularioVentasLineas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ventaslineasSessionBean=new VentasLineasSessionBean();
		
		this.ventaslineasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ventaslineasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ventaslineasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VentasLineasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ventas Lineas MANTENIMIENTO"));
		
		
		if(iWidth > 1850) {
			iWidth=1850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
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
	
		VentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVentasLineas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVentasLineas=new JButtonMe();
				this.jButtonModificarToolBarVentasLineas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVentasLineas,this.jTtoolBarDetalleVentasLineas,
							"actualizar","actualizar","Actualizar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVentasLineas,this.jTtoolBarDetalleVentasLineas,
							"eliminar","eliminar","Eliminar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVentasLineas,this.jTtoolBarDetalleVentasLineas,
							"cancelar","cancelar","Cancelar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVentasLineas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVentasLineas,this.jTtoolBarDetalleVentasLineas,
							"guardarcambios","guardarcambios","Guardar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVentasLineas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVentasLineas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVentasLineas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVentasLineas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVentasLineas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVentasLineas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVentasLineas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVentasLineas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVentasLineas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVentasLineas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVentasLineas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVentasLineas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVentasLineas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVentasLineas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVentasLineas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVentasLineas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVentasLineas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVentasLineas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVentasLineas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVentasLineas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVentasLineas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVentasLineas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVentasLineas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVentasLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVentasLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVentasLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVentasLineas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVentasLineas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVentasLineas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVentasLineas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVentasLineas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVentasLineas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVentasLineas.add(this.jMenuItemDetalleCerrarVentasLineas);
		
		this.jmenuDetalleAccionesVentasLineas.add(this.jMenuItemActualizarVentasLineas);
		this.jmenuDetalleAccionesVentasLineas.add(this.jMenuItemEliminarVentasLineas);
		this.jmenuDetalleAccionesVentasLineas.add(this.jMenuItemCancelarVentasLineas);		
		
		//this.jmenuDetalleDatosVentasLineas.add(this.jMenuItemDetalleAbrirOrderByVentasLineas);				
		this.jmenuDetalleDatosVentasLineas.add(this.jMenuItemDetalleMostarOcultarVentasLineas);				
				
		//this.jmenuDetalleAccionesVentasLineas.add(this.jMenuItemGuardarCambiosVentasLineas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVentasLineas.add(this.jmenuDetalleArchivoVentasLineas);		
		this.jmenuBarDetalleVentasLineas.add(this.jmenuDetalleAccionesVentasLineas);		
		this.jmenuBarDetalleVentasLineas.add(this.jmenuDetalleDatosVentasLineas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVentasLineas);				
	}
	
	
	public void inicializarElementosCamposVentasLineas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVentasLineas = new JLabelMe();
		jLabelIdVentasLineas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVentasLineas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVentasLineas= new GridBagLayout();

		this.jPanelidVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);

		jLabelidVentasLineas = new JLabel();
		jLabelidVentasLineas.setText("Id");

		jLabelidVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeVentasLineas = new JLabelMe();
		this.jLabelfecha_emision_desdeVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeVentasLineas.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelfecha_emision_desdeVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		//jFormattedTextFieldfecha_emision_desdeVentasLineas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeVentasLineas= new JDateChooser();
		jDateChooserfecha_emision_desdeVentasLineas.setEnabled(false);
		jDateChooserfecha_emision_desdeVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeVentasLineas.setDate(new Date());
		jDateChooserfecha_emision_desdeVentasLineas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeVentasLineas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeVentasLineasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeVentasLineasBusqueda.setText("U");
		this.jButtonfecha_emision_desdeVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaVentasLineas = new JLabelMe();
		this.jLabelfecha_emision_hastaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaVentasLineas.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelfecha_emision_hastaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		//jFormattedTextFieldfecha_emision_hastaVentasLineas= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaVentasLineas= new JDateChooser();
		jDateChooserfecha_emision_hastaVentasLineas.setEnabled(false);
		jDateChooserfecha_emision_hastaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaVentasLineas.setDate(new Date());
		jDateChooserfecha_emision_hastaVentasLineas.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaVentasLineas.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaVentasLineasBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaVentasLineasBusqueda.setText("U");
		this.jButtonfecha_emision_hastaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_lineaVentasLineas = new JLabelMe();
		this.jLabelnombre_lineaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_NOMBRELINEA+" : *");
		this.jLabelnombre_lineaVentasLineas.setToolTipText("Nombre Linea");
		this.jLabelnombre_lineaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_lineaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_lineaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_lineaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_lineaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_NOMBRELINEA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelnombre_lineaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextAreanombre_lineaVentasLineas= new JTextAreaMe();
		jTextAreanombre_lineaVentasLineas.setEnabled(false);
		jTextAreanombre_lineaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_lineaVentasLineas.setLineWrap(true);
		jTextAreanombre_lineaVentasLineas.setWrapStyleWord(true);
		jTextAreanombre_lineaVentasLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_lineaVentasLineas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_lineaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_lineaVentasLineas = new JScrollPane(jTextAreanombre_lineaVentasLineas);
		jscrollPanenombre_lineaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_lineaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_lineaVentasLineasBusqueda= new JButtonMe();
		this.jButtonnombre_lineaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_lineaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_lineaVentasLineasBusqueda.setText("U");
		this.jButtonnombre_lineaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_lineaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_lineaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_lineaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_lineaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_lineaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_lineaVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_grupoVentasLineas = new JLabelMe();
		this.jLabelnombre_grupoVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO+" : *");
		this.jLabelnombre_grupoVentasLineas.setToolTipText("Nombre Grupo");
		this.jLabelnombre_grupoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_grupoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_grupoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_grupoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_grupoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_grupoVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_NOMBREGRUPO);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelnombre_grupoVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextAreanombre_grupoVentasLineas= new JTextAreaMe();
		jTextAreanombre_grupoVentasLineas.setEnabled(false);
		jTextAreanombre_grupoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_grupoVentasLineas.setLineWrap(true);
		jTextAreanombre_grupoVentasLineas.setWrapStyleWord(true);
		jTextAreanombre_grupoVentasLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_grupoVentasLineas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_grupoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_grupoVentasLineas = new JScrollPane(jTextAreanombre_grupoVentasLineas);
		jscrollPanenombre_grupoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_grupoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_grupoVentasLineasBusqueda= new JButtonMe();
		this.jButtonnombre_grupoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_grupoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_grupoVentasLineasBusqueda.setText("U");
		this.jButtonnombre_grupoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_grupoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_grupoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_grupoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_grupoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_grupoVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_grupoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_categoriaVentasLineas = new JLabelMe();
		this.jLabelnombre_categoriaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA+" : *");
		this.jLabelnombre_categoriaVentasLineas.setToolTipText("Nombre Categoria");
		this.jLabelnombre_categoriaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_categoriaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_categoriaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_categoriaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_categoriaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_categoriaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_NOMBRECATEGORIA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelnombre_categoriaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextAreanombre_categoriaVentasLineas= new JTextAreaMe();
		jTextAreanombre_categoriaVentasLineas.setEnabled(false);
		jTextAreanombre_categoriaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_categoriaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_categoriaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_categoriaVentasLineas.setLineWrap(true);
		jTextAreanombre_categoriaVentasLineas.setWrapStyleWord(true);
		jTextAreanombre_categoriaVentasLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_categoriaVentasLineas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_categoriaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_categoriaVentasLineas = new JScrollPane(jTextAreanombre_categoriaVentasLineas);
		jscrollPanenombre_categoriaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_categoriaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_categoriaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_categoriaVentasLineasBusqueda= new JButtonMe();
		this.jButtonnombre_categoriaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_categoriaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_categoriaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_categoriaVentasLineasBusqueda.setText("U");
		this.jButtonnombre_categoriaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_categoriaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_categoriaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_categoriaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_categoriaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_categoriaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_categoriaVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_marcaVentasLineas = new JLabelMe();
		this.jLabelnombre_marcaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_NOMBREMARCA+" : *");
		this.jLabelnombre_marcaVentasLineas.setToolTipText("Nombre Marca");
		this.jLabelnombre_marcaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_marcaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_marcaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_marcaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_marcaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_marcaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_NOMBREMARCA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelnombre_marcaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextAreanombre_marcaVentasLineas= new JTextAreaMe();
		jTextAreanombre_marcaVentasLineas.setEnabled(false);
		jTextAreanombre_marcaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_marcaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_marcaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_marcaVentasLineas.setLineWrap(true);
		jTextAreanombre_marcaVentasLineas.setWrapStyleWord(true);
		jTextAreanombre_marcaVentasLineas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_marcaVentasLineas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_marcaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_marcaVentasLineas = new JScrollPane(jTextAreanombre_marcaVentasLineas);
		jscrollPanenombre_marcaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_marcaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_marcaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_marcaVentasLineasBusqueda= new JButtonMe();
		this.jButtonnombre_marcaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_marcaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_marcaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_marcaVentasLineasBusqueda.setText("U");
		this.jButtonnombre_marcaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_marcaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_marcaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_marcaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_marcaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_marcaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_marcaVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelmontoVentasLineas = new JLabelMe();
		this.jLabelmontoVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoVentasLineas.setToolTipText("Monto");
		this.jLabelmontoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelmontoVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextFieldmontoVentasLineas= new JTextFieldMe();
		jTextFieldmontoVentasLineas.setEnabled(false);
		jTextFieldmontoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoVentasLineas.setText("0.0");

		this.jButtonmontoVentasLineasBusqueda= new JButtonMe();
		this.jButtonmontoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoVentasLineasBusqueda.setText("U");
		this.jButtonmontoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelnotas_creditoVentasLineas = new JLabelMe();
		this.jLabelnotas_creditoVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_NOTASCREDITO+" : *");
		this.jLabelnotas_creditoVentasLineas.setToolTipText("Notas Credito");
		this.jLabelnotas_creditoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnotas_creditoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnotas_creditoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnotas_creditoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnotas_creditoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnotas_creditoVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_NOTASCREDITO);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelnotas_creditoVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextFieldnotas_creditoVentasLineas= new JTextFieldMe();
		jTextFieldnotas_creditoVentasLineas.setEnabled(false);
		jTextFieldnotas_creditoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnotas_creditoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnotas_creditoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnotas_creditoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnotas_creditoVentasLineas.setText("0.0");

		this.jButtonnotas_creditoVentasLineasBusqueda= new JButtonMe();
		this.jButtonnotas_creditoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnotas_creditoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnotas_creditoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnotas_creditoVentasLineasBusqueda.setText("U");
		this.jButtonnotas_creditoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnotas_creditoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnotas_creditoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnotas_creditoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnotas_creditoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"notas_creditoVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnotas_creditoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelventa_netaVentasLineas = new JLabelMe();
		this.jLabelventa_netaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_VENTANETA+" : *");
		this.jLabelventa_netaVentasLineas.setToolTipText("Venta Neta");
		this.jLabelventa_netaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventa_netaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelventa_netaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelventa_netaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelventa_netaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelventa_netaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_VENTANETA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelventa_netaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextFieldventa_netaVentasLineas= new JTextFieldMe();
		jTextFieldventa_netaVentasLineas.setEnabled(false);
		jTextFieldventa_netaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventa_netaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldventa_netaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldventa_netaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldventa_netaVentasLineas.setText("0.0");

		this.jButtonventa_netaVentasLineasBusqueda= new JButtonMe();
		this.jButtonventa_netaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventa_netaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonventa_netaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonventa_netaVentasLineasBusqueda.setText("U");
		this.jButtonventa_netaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonventa_netaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonventa_netaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldventa_netaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldventa_netaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"venta_netaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonventa_netaVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeVentasLineas = new JLabelMe();
		this.jLabelporcentajeVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeVentasLineas.setToolTipText("Porcentaje");
		this.jLabelporcentajeVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelporcentajeVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextFieldporcentajeVentasLineas= new JTextFieldMe();
		jTextFieldporcentajeVentasLineas.setEnabled(false);
		jTextFieldporcentajeVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeVentasLineas.setText("0.0");

		this.jButtonporcentajeVentasLineasBusqueda= new JButtonMe();
		this.jButtonporcentajeVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeVentasLineasBusqueda.setText("U");
		this.jButtonporcentajeVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabelacumuladoVentasLineas = new JLabelMe();
		this.jLabelacumuladoVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_ACUMULADO+" : *");
		this.jLabelacumuladoVentasLineas.setToolTipText("Acumulado");
		this.jLabelacumuladoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacumuladoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelacumuladoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacumuladoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacumuladoVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_ACUMULADO);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelacumuladoVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextFieldacumuladoVentasLineas= new JTextFieldMe();
		jTextFieldacumuladoVentasLineas.setEnabled(false);
		jTextFieldacumuladoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacumuladoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldacumuladoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldacumuladoVentasLineas.setText("0.0");

		this.jButtonacumuladoVentasLineasBusqueda= new JButtonMe();
		this.jButtonacumuladoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacumuladoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacumuladoVentasLineasBusqueda.setText("U");
		this.jButtonacumuladoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacumuladoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacumuladoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldacumuladoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldacumuladoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acumuladoVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacumuladoVentasLineasBusqueda.setVisible(false);		}


					
		this.jLabeltipoVentasLineas = new JLabelMe();
		this.jLabeltipoVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_TIPO+" : *");
		this.jLabeltipoVentasLineas.setToolTipText("Tipo");
		this.jLabeltipoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipoVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_TIPO);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPaneltipoVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jTextFieldtipoVentasLineas= new JTextFieldMe();

		jTextFieldtipoVentasLineas.setEnabled(false);
		jTextFieldtipoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipoVentasLineasBusqueda= new JButtonMe();
		this.jButtontipoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipoVentasLineasBusqueda.setText("U");
		this.jButtontipoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipoVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipoVentasLineasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVentasLineas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVentasLineas = new JLabelMe();
		this.jLabelid_empresaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVentasLineas.setToolTipText("Empresa");
		this.jLabelid_empresaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelid_empresaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jComboBoxid_empresaVentasLineas= new JComboBoxMe();
		jComboBoxid_empresaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVentasLineas.setEnabled(false);

		this.jButtonid_empresaVentasLineas= new JButtonMe();
		this.jButtonid_empresaVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVentasLineas.setText("Buscar");
		this.jButtonid_empresaVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasLineas"));

		this.jButtonid_empresaVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_empresaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasLineasBusqueda.setText("U");
		this.jButtonid_empresaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_empresaVentasLineasUpdate= new JButtonMe();
		this.jButtonid_empresaVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVentasLineasUpdate.setText("U");
		this.jButtonid_empresaVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVentasLineasUpdate"));



					
		this.jLabelid_lineaVentasLineas = new JLabelMe();
		this.jLabelid_lineaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_IDLINEA+" : *");
		this.jLabelid_lineaVentasLineas.setToolTipText("Linea");
		this.jLabelid_lineaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_lineaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_lineaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_lineaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_lineaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_IDLINEA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelid_lineaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jComboBoxid_lineaVentasLineas= new JComboBoxMe();
		jComboBoxid_lineaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_lineaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_lineaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_lineaVentasLineas= new JButtonMe();
		this.jButtonid_lineaVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_lineaVentasLineas.setText("Buscar");
		this.jButtonid_lineaVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_lineaVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_lineaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaVentasLineas"));

		this.jButtonid_lineaVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_lineaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaVentasLineasBusqueda.setText("U");
		this.jButtonid_lineaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_lineaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_lineaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_lineaVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_lineaVentasLineasUpdate= new JButtonMe();
		this.jButtonid_lineaVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_lineaVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_lineaVentasLineasUpdate.setText("U");
		this.jButtonid_lineaVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_lineaVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_lineaVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_lineaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_lineaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_lineaVentasLineasUpdate"));



					
		this.jLabelid_linea_grupoVentasLineas = new JLabelMe();
		this.jLabelid_linea_grupoVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO+" : *");
		this.jLabelid_linea_grupoVentasLineas.setToolTipText("Linea Grupo");
		this.jLabelid_linea_grupoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_grupoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_grupoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_grupoVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_grupoVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_IDLINEAGRUPO);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelid_linea_grupoVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jComboBoxid_linea_grupoVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_grupoVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_grupoVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_grupoVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_grupoVentasLineas= new JButtonMe();
		this.jButtonid_linea_grupoVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_grupoVentasLineas.setText("Buscar");
		this.jButtonid_linea_grupoVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_grupoVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_grupoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoVentasLineas"));

		this.jButtonid_linea_grupoVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_linea_grupoVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoVentasLineasBusqueda.setText("U");
		this.jButtonid_linea_grupoVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_grupoVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_grupoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_grupoVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_linea_grupoVentasLineasUpdate= new JButtonMe();
		this.jButtonid_linea_grupoVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_grupoVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_grupoVentasLineasUpdate.setText("U");
		this.jButtonid_linea_grupoVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_grupoVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_grupoVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_grupoVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_grupoVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_grupoVentasLineasUpdate"));



					
		this.jLabelid_linea_categoriaVentasLineas = new JLabelMe();
		this.jLabelid_linea_categoriaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA+" : *");
		this.jLabelid_linea_categoriaVentasLineas.setToolTipText("Linea Categoria");
		this.jLabelid_linea_categoriaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_linea_categoriaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_categoriaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_categoriaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_categoriaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelid_linea_categoriaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jComboBoxid_linea_categoriaVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_categoriaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_categoriaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_categoriaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_categoriaVentasLineas= new JButtonMe();
		this.jButtonid_linea_categoriaVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_categoriaVentasLineas.setText("Buscar");
		this.jButtonid_linea_categoriaVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_categoriaVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_categoriaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaVentasLineas"));

		this.jButtonid_linea_categoriaVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_linea_categoriaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaVentasLineasBusqueda.setText("U");
		this.jButtonid_linea_categoriaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_categoriaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_categoriaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_categoriaVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_linea_categoriaVentasLineasUpdate= new JButtonMe();
		this.jButtonid_linea_categoriaVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_categoriaVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_categoriaVentasLineasUpdate.setText("U");
		this.jButtonid_linea_categoriaVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_categoriaVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_categoriaVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_categoriaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_categoriaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_categoriaVentasLineasUpdate"));



					
		this.jLabelid_linea_marcaVentasLineas = new JLabelMe();
		this.jLabelid_linea_marcaVentasLineas.setText(""+VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA+" : *");
		this.jLabelid_linea_marcaVentasLineas.setToolTipText("Linea Marca");
		this.jLabelid_linea_marcaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_linea_marcaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_linea_marcaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_linea_marcaVentasLineas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_linea_marcaVentasLineas.setToolTipText(VentasLineasConstantesFunciones.LABEL_IDLINEAMARCA);
		this.gridaBagLayoutVentasLineas = new GridBagLayout();
		this.jPanelid_linea_marcaVentasLineas.setLayout(this.gridaBagLayoutVentasLineas);


		jComboBoxid_linea_marcaVentasLineas= new JComboBoxMe();
		jComboBoxid_linea_marcaVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_linea_marcaVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_linea_marcaVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_linea_marcaVentasLineas= new JButtonMe();
		this.jButtonid_linea_marcaVentasLineas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaVentasLineas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaVentasLineas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_linea_marcaVentasLineas.setText("Buscar");
		this.jButtonid_linea_marcaVentasLineas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_linea_marcaVentasLineas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaVentasLineas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_linea_marcaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaVentasLineas"));

		this.jButtonid_linea_marcaVentasLineasBusqueda= new JButtonMe();
		this.jButtonid_linea_marcaVentasLineasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentasLineasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentasLineasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaVentasLineasBusqueda.setText("U");
		this.jButtonid_linea_marcaVentasLineasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_linea_marcaVentasLineasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaVentasLineasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_linea_marcaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaVentasLineasBusqueda"));

		if(this.ventaslineasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_linea_marcaVentasLineasBusqueda.setVisible(false);		}

		this.jButtonid_linea_marcaVentasLineasUpdate= new JButtonMe();
		this.jButtonid_linea_marcaVentasLineasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentasLineasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_linea_marcaVentasLineasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_linea_marcaVentasLineasUpdate.setText("U");
		this.jButtonid_linea_marcaVentasLineasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_linea_marcaVentasLineasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_linea_marcaVentasLineasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_linea_marcaVentasLineas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_linea_marcaVentasLineas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_linea_marcaVentasLineasUpdate"));



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
		//this.jInternalFrameDetalleVentasLineas = new VentasLineasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ventas Lineas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVentasLineas= new GridBagLayout();
		

		
		String sToolTipVentasLineas="";
		sToolTipVentasLineas=VentasLineasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVentasLineas+="(Facturacion.VentasLineas)";
		}
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			sToolTipVentasLineas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVentasLineas = new JButtonMe();
		this.jButtonModificarVentasLineas = new JButtonMe();
        this.jButtonActualizarVentasLineas = new JButtonMe();
        this.jButtonEliminarVentasLineas = new JButtonMe();
        this.jButtonCancelarVentasLineas = new JButtonMe();
        this.jButtonGuardarCambiosVentasLineas = new JButtonMe();
		this.jButtonGuardarCambiosTablaVentasLineas = new JButtonMe();
		this.jButtonCerrarVentasLineas = new JButtonMe();
		
		this.jScrollPanelDatosVentasLineas = new JScrollPane();   
        this.jScrollPanelDatosEdicionVentasLineas = new JScrollPane();
		this.jScrollPanelDatosGeneralVentasLineas = new JScrollPane();
				
		
		
		this.jPanelCamposVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ventas Lineas";
		
		if(!this.ventaslineasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ventas Lineases" + this.sPath));
		} else {
			this.jScrollPanelDatosVentasLineas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVentasLineas.setName("jPanelCamposVentasLineas"); 

		this.jPanelCamposOcultosVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVentasLineas.setName("jPanelCamposOcultosVentasLineas"); 

        this.jPanelAccionesVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVentasLineas.setToolTipText("Acciones");
        this.jPanelAccionesVentasLineas.setName("Acciones"); 

		this.jPanelAccionesFormularioVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVentasLineas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVentasLineas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVentasLineas.setText("Nuevo");
		this.jButtonModificarVentasLineas.setText("Editar");
        this.jButtonActualizarVentasLineas.setText("Actualizar");
        this.jButtonEliminarVentasLineas.setText("Eliminar");
        this.jButtonCancelarVentasLineas.setText("Cancelar");
        this.jButtonGuardarCambiosVentasLineas.setText("Guardar");
		this.jButtonGuardarCambiosTablaVentasLineas.setText("Guardar");
		this.jButtonCerrarVentasLineas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVentasLineas,"nuevo_button","Nuevo",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVentasLineas,"modificar_button","Editar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVentasLineas,"actualizar_button","Actualizar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVentasLineas,"eliminar_button","Eliminar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVentasLineas,"cancelar_button","Cancelar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVentasLineas,"guardarcambios_button","Guardar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVentasLineas,"guardarcambiostabla_button","Guardar",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVentasLineas,"cerrar_button","Salir",this.ventaslineasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVentasLineas.setToolTipText("Nuevo"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVentasLineas.setToolTipText("Editar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVentasLineas.setToolTipText("Actualizar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVentasLineas.setToolTipText("Eliminar)"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVentasLineas.setToolTipText("Cancelar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVentasLineas.setToolTipText("Guardar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVentasLineas.setToolTipText("Guardar"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVentasLineas.setToolTipText("Salir"+" "+VentasLineasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVentasLineas";
		inputMap = this.jButtonNuevoVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVentasLineas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVentasLineas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVentasLineas";
		inputMap = this.jButtonActualizarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVentasLineas"));
		
		//ELIMINAR
		sMapKey = "EliminarVentasLineas";
		inputMap = this.jButtonEliminarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVentasLineas"));
		
		//CANCELAR	
		sMapKey = "CancelarVentasLineas";
		inputMap = this.jButtonCancelarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVentasLineas"));
		
		//CERRAR		
		sMapKey = "CerrarVentasLineas";
		inputMap = this.jButtonCerrarVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVentasLineas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVentasLineas";
		inputMap = this.jButtonGuardarCambiosTablaVentasLineas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVentasLineas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVentasLineas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVentasLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVentasLineas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVentasLineas.setToolTipText("Nuevo VentasLineas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVentasLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVentasLineas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVentasLineas.setToolTipText("Sin Cerrar Ventana VentasLineas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVentasLineas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVentasLineas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVentasLineas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVentasLineas.setText("Accion");
		this.jComboBoxTiposAccionesVentasLineas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVentasLineas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVentasLineas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVentasLineas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVentasLineas = new JLabelMe();
		
		this.jLabelAccionesVentasLineas.setText("Acciones");		
		this.jLabelAccionesVentasLineas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasLineas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVentasLineas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVentasLineas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVentasLineas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVentasLineas=new JTabbedPane();
		this.jTabbedPaneRelacionesVentasLineas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVentasLineas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVentasLineas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasLineas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVentasLineas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVentasLineas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVentasLineas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasLineas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVentasLineas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVentasLineas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVentasLineas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVentasLineas = new GridBagLayout();
		
		this.jPanelCamposVentasLineas.setLayout(gridaBagLayoutCamposVentasLineas);
		this.jPanelCamposOcultosVentasLineas.setLayout(gridaBagLayoutCamposOcultosVentasLineas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVentasLineas.add(jLabelIdVentasLineas, this.gridBagConstraintsVentasLineas);



	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVentasLineas.add(jLabelidVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVentasLineas.add(jLabelid_empresaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasLineas.add(jButtonid_empresaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 3;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVentasLineas.add(jButtonid_empresaVentasLineasUpdate, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVentasLineas.add(jComboBoxid_empresaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_lineaVentasLineas.add(jLabelid_lineaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaVentasLineas.add(jButtonid_lineaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 3;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_lineaVentasLineas.add(jButtonid_lineaVentasLineasUpdate, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_lineaVentasLineas.add(jComboBoxid_lineaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_grupoVentasLineas.add(jLabelid_linea_grupoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoVentasLineas.add(jButtonid_linea_grupoVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 3;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_grupoVentasLineas.add(jButtonid_linea_grupoVentasLineasUpdate, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_grupoVentasLineas.add(jComboBoxid_linea_grupoVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_categoriaVentasLineas.add(jLabelid_linea_categoriaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaVentasLineas.add(jButtonid_linea_categoriaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 3;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_categoriaVentasLineas.add(jButtonid_linea_categoriaVentasLineasUpdate, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_categoriaVentasLineas.add(jComboBoxid_linea_categoriaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_linea_marcaVentasLineas.add(jLabelid_linea_marcaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaVentasLineas.add(jButtonid_linea_marcaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 3;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_linea_marcaVentasLineas.add(jButtonid_linea_marcaVentasLineasUpdate, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_linea_marcaVentasLineas.add(jComboBoxid_linea_marcaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeVentasLineas.add(jLabelfecha_emision_desdeVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeVentasLineas.add(jButtonfecha_emision_desdeVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeVentasLineas.add(jDateChooserfecha_emision_desdeVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaVentasLineas.add(jLabelfecha_emision_hastaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaVentasLineas.add(jButtonfecha_emision_hastaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaVentasLineas.add(jDateChooserfecha_emision_hastaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_lineaVentasLineas.add(jLabelnombre_lineaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_lineaVentasLineas.add(jButtonnombre_lineaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_lineaVentasLineas.add(jscrollPanenombre_lineaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_grupoVentasLineas.add(jLabelnombre_grupoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_grupoVentasLineas.add(jButtonnombre_grupoVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_grupoVentasLineas.add(jscrollPanenombre_grupoVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_categoriaVentasLineas.add(jLabelnombre_categoriaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_categoriaVentasLineas.add(jButtonnombre_categoriaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_categoriaVentasLineas.add(jscrollPanenombre_categoriaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_marcaVentasLineas.add(jLabelnombre_marcaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_marcaVentasLineas.add(jButtonnombre_marcaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_marcaVentasLineas.add(jscrollPanenombre_marcaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoVentasLineas.add(jLabelmontoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoVentasLineas.add(jButtonmontoVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoVentasLineas.add(jTextFieldmontoVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnotas_creditoVentasLineas.add(jLabelnotas_creditoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnotas_creditoVentasLineas.add(jButtonnotas_creditoVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnotas_creditoVentasLineas.add(jTextFieldnotas_creditoVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelventa_netaVentasLineas.add(jLabelventa_netaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelventa_netaVentasLineas.add(jButtonventa_netaVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelventa_netaVentasLineas.add(jTextFieldventa_netaVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeVentasLineas.add(jLabelporcentajeVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeVentasLineas.add(jButtonporcentajeVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeVentasLineas.add(jTextFieldporcentajeVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacumuladoVentasLineas.add(jLabelacumuladoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPanelacumuladoVentasLineas.add(jButtonacumuladoVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacumuladoVentasLineas.add(jTextFieldacumuladoVentasLineas, this.gridBagConstraintsVentasLineas);


	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 0;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipoVentasLineas.add(jLabeltipoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		//this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = 2;
		this.gridBagConstraintsVentasLineas.ipadx = 0;
		this.gridBagConstraintsVentasLineas.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipoVentasLineas.add(jButtontipoVentasLineasBusqueda, this.gridBagConstraintsVentasLineas);
	}

	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVentasLineas.gridy = 0;
	this.gridBagConstraintsVentasLineas.gridx = 1;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipoVentasLineas.add(jTextFieldtipoVentasLineas, this.gridBagConstraintsVentasLineas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelidVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelid_lineaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelid_linea_grupoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelid_linea_categoriaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelid_linea_marcaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelfecha_emision_desdeVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelfecha_emision_hastaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelnombre_lineaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelnombre_grupoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelnombre_categoriaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelnombre_marcaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelmontoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelnotas_creditoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelventa_netaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelporcentajeVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPanelacumuladoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVentasLineas.add(this.jPaneltipoVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposVentasLineas % 2==0) {
		iXPanelCamposVentasLineas=0;
		iYPanelCamposVentasLineas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVentasLineas.gridy = iYPanelCamposOcultosVentasLineas;
	this.gridBagConstraintsVentasLineas.gridx = iXPanelCamposOcultosVentasLineas++;
	this.gridBagConstraintsVentasLineas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVentasLineas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVentasLineas.add(this.jPanelid_empresaVentasLineas, this.gridBagConstraintsVentasLineas);



	if(iXPanelCamposOcultosVentasLineas % 2==0) {
		iXPanelCamposOcultosVentasLineas=0;
		iYPanelCamposOcultosVentasLineas++;
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
			
		GridBagLayout gridaBagLayoutAccionesVentasLineas= new GridBagLayout();
		this.jPanelAccionesVentasLineas.setLayout(gridaBagLayoutAccionesVentasLineas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVentasLineas= new GridBagLayout();
		this.jPanelAccionesFormularioVentasLineas.setLayout(gridaBagLayoutAccionesFormularioVentasLineas);
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVentasLineas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVentasLineas.add(this.jComboBoxTiposAccionesFormularioVentasLineas, this.gridBagConstraintsVentasLineas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx = iPosXAccion++;
			
		this.jPanelAccionesVentasLineas.add(this.jButtonModificarVentasLineas, this.gridBagConstraintsVentasLineas);							

		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVentasLineas.gridy = 0;
		this.gridBagConstraintsVentasLineas.gridx =iPosXAccion++;
			
		this.jPanelAccionesVentasLineas.add(this.jButtonEliminarVentasLineas, this.gridBagConstraintsVentasLineas);
		
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = 0;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasLineas.add(this.jButtonActualizarVentasLineas, this.gridBagConstraintsVentasLineas);


		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = 0;		
		this.gridBagConstraintsVentasLineas.gridx = iPosXAccion++;
		
		this.jPanelAccionesVentasLineas.add(this.jButtonGuardarCambiosVentasLineas, this.gridBagConstraintsVentasLineas);	
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = 0;		
		this.gridBagConstraintsVentasLineas.gridx =iPosXAccion++;
		
		this.jPanelAccionesVentasLineas.add(this.jButtonCancelarVentasLineas, this.gridBagConstraintsVentasLineas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVentasLineas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVentasLineas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ventaslineasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();						
			this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVentasLineas.gridx = 0;		
			//this.gridBagConstraintsVentasLineas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVentasLineas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVentasLineas.gridx =0;
		this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVentasLineas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVentasLineas, this.gridBagConstraintsVentasLineas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VentasLineasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVentasLineas = new VentasLineasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ventas Lineas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ventas Lineas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ventas Lineas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VentasLineasModel ventaslineasModel=new VentasLineasModel(this);
			
			//SI USARA CLASE INTERNA
			//VentasLineasModel.VentasLineasFocusTraversalPolicy ventaslineasFocusTraversalPolicy = ventaslineasModel.new VentasLineasFocusTraversalPolicy(this);
			
			//ventaslineasFocusTraversalPolicy.setventaslineasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ventaslineasModel);
			
			
			this.jContentPaneDetalleVentasLineas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVentasLineas = new GridBagLayout();	
			this.jContentPaneDetalleVentasLineas.setLayout(gridaBagLayoutDetalleVentasLineas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVentasLineas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVentasLineas = new GridBagConstraints();
				this.gridBagConstraintsVentasLineas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVentasLineas.gridx = 0;
					
				
				this.jContentPaneDetalleVentasLineas.add(jTtoolBarDetalleVentasLineas, gridBagConstraintsVentasLineas);								
				
}
			
			this.jScrollPanelDatosEdicionVentasLineas=   new JScrollPane(jContentPaneDetalleVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVentasLineas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVentasLineas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVentasLineas.gridx = 0;
	        
			this.jContentPaneDetalleVentasLineas.add(jPanelCamposVentasLineas, gridBagConstraintsVentasLineas);
			
			
			
			
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
						//&& ventaslineasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.ventaslineasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVentasLineas= new GridBagConstraints();
						this.gridBagConstraintsVentasLineas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVentasLineas.gridx = 0;
						this.jContentPaneDetalleVentasLineas.add(this.jTabbedPaneRelacionesVentasLineas, this.gridBagConstraintsVentasLineas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVentasLineas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVentasLineas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVentasLineas = new GridBagConstraints();
					this.gridBagConstraintsVentasLineas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVentasLineas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVentasLineas.gridx = 0;
					
				
					this.jContentPaneDetalleVentasLineas.add(jPanelCamposOcultosVentasLineas, gridBagConstraintsVentasLineas);
				
					this.jPanelCamposOcultosVentasLineas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVentasLineas.gridx = 0;
	        this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVentasLineas.add(this.jPanelAccionesFormularioVentasLineas, this.gridBagConstraintsVentasLineas);							
			
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
	        this.gridBagConstraintsVentasLineas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVentasLineas.gridx = 0;
	        
			
			this.jContentPaneDetalleVentasLineas.add(this.jPanelAccionesVentasLineas, this.gridBagConstraintsVentasLineas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVentasLineas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVentasLineas=   new JScrollPane(this.jPanelCamposVentasLineas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVentasLineas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasLineas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVentasLineas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVentasLineas.gridx = 0;
			this.gridBagConstraintsVentasLineas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVentasLineas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVentasLineas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVentasLineas, this.gridBagConstraintsVentasLineas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasLineas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVentasLineas, this.gridBagConstraintsVentasLineas);			
			
			this.gridBagConstraintsVentasLineas = new GridBagConstraints();
			this.gridBagConstraintsVentasLineas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVentasLineas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVentasLineas, this.gridBagConstraintsVentasLineas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVentasLineas, this.gridBagConstraintsVentasLineas);
			
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVentasLineas, this.gridBagConstraintsVentasLineas);
		
			
		this.gridBagConstraintsVentasLineas = new GridBagConstraints();
		this.gridBagConstraintsVentasLineas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVentasLineas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVentasLineas, this.gridBagConstraintsVentasLineas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVentasLineas;//jContentPane;
		
		return jScrollPanelDatosEdicionVentasLineas;
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
