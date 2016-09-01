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
import com.bydan.erp.inventario.util.DescuentoTipoPrecioConstantesFunciones;

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
public class DescuentoTipoPrecioDetalleFormJInternalFrame extends DescuentoTipoPrecioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDescuentoTipoPrecio;
	
	protected JMenuBar jmenuBarDetalleDescuentoTipoPrecio;
	
	protected JMenu jmenuDetalleDescuentoTipoPrecio;
	protected JMenu jmenuDetalleArchivoDescuentoTipoPrecio;
	protected JMenu jmenuDetalleAccionesDescuentoTipoPrecio;
	protected JMenu jmenuDetalleDatosDescuentoTipoPrecio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDescuentoTipoPrecio;	
	protected GridBagConstraints gridBagConstraintsDescuentoTipoPrecio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DescuentoTipoPrecioBeanSwingJInternalFrameAdditional jInternalFrameDetalleDescuentoTipoPrecio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";
	
	public DescuentoTipoPrecioSessionBean descuentotipoprecioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;	
	
	public DescuentoTipoPrecioLogic descuentotipoprecioLogic;
	
	public JScrollPane jScrollPanelDatosDescuentoTipoPrecio;
	public JScrollPane jScrollPanelDatosEdicionDescuentoTipoPrecio;
	public JScrollPane jScrollPanelDatosGeneralDescuentoTipoPrecio;
	
	protected JPanel jPanelCamposDescuentoTipoPrecio;    
	protected JPanel jPanelCamposOcultosDescuentoTipoPrecio;    	
	protected JPanel jPanelAccionesDescuentoTipoPrecio;
	protected JPanel jPanelAccionesFormularioDescuentoTipoPrecio;
    
	
	
	protected Integer iXPanelCamposDescuentoTipoPrecio=0;
	protected Integer iYPanelCamposDescuentoTipoPrecio=0;
	
	protected Integer iXPanelCamposOcultosDescuentoTipoPrecio=0;
	protected Integer iYPanelCamposOcultosDescuentoTipoPrecio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDescuentoTipoPrecio;
	public JButton jButtonModificarDescuentoTipoPrecio;
	public JButton jButtonActualizarDescuentoTipoPrecio;
    public JButton jButtonEliminarDescuentoTipoPrecio;
	public JButton jButtonCancelarDescuentoTipoPrecio;
    public JButton jButtonGuardarCambiosDescuentoTipoPrecio;
	public JButton jButtonGuardarCambiosTablaDescuentoTipoPrecio;
	protected JButton jButtonCerrarDescuentoTipoPrecio;
	
	
	protected JButton jButtonProcesarInformacionDescuentoTipoPrecio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDescuentoTipoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDescuentoTipoPrecio;
	protected JButton jButtonModificarToolBarDescuentoTipoPrecio;
	protected JButton jButtonActualizarToolBarDescuentoTipoPrecio;
    protected JButton jButtonEliminarToolBarDescuentoTipoPrecio;
	protected JButton jButtonCancelarToolBarDescuentoTipoPrecio;
    protected JButton jButtonGuardarCambiosToolBarDescuentoTipoPrecio;
	protected JButton jButtonGuardarCambiosTablaToolBarDescuentoTipoPrecio;
	protected JButton jButtonMostrarOcultarTablaToolBarDescuentoTipoPrecio;
	protected JButton jButtonCerrarToolBarDescuentoTipoPrecio;
	
	protected JButton jButtonProcesarInformacionToolBarDescuentoTipoPrecio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDescuentoTipoPrecio;
	protected JMenuItem jMenuItemModificarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemActualizarDescuentoTipoPrecio;
    protected JMenuItem jMenuItemEliminarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemCancelarDescuentoTipoPrecio;
    protected JMenuItem jMenuItemGuardarCambiosDescuentoTipoPrecio;
	protected JMenuItem jMenuItemGuardarCambiosTablaDescuentoTipoPrecio;
	protected JMenuItem jMenuItemCerrarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemDetalleCerrarDescuentoTipoPrecio;
	protected JMenuItem jMenuItemDetalleMostarOcultarDescuentoTipoPrecio;
	
	protected JMenuItem jMenuItemProcesarInformacionDescuentoTipoPrecio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDescuentoTipoPrecio;
	protected JMenuItem jMenuItemMostrarOcultarDescuentoTipoPrecio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDescuentoTipoPrecio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDescuentoTipoPrecio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDescuentoTipoPrecio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDescuentoTipoPrecio;
	public JLabel jLabelIdDescuentoTipoPrecio;
	public JLabel jLabelidDescuentoTipoPrecio;
	public JButton jButtonidDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDescuentoTipoPrecio;
	public JLabel jLabeldescripcionDescuentoTipoPrecio;
	public JTextArea jTextAreadescripcionDescuentoTipoPrecio;
	public JScrollPane jscrollPanedescripcionDescuentoTipoPrecio;
	public JButton jButtondescripcionDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDescuentoTipoPrecio;
	public JLabel jLabelporcentajeDescuentoTipoPrecio;
	public JTextField jTextFieldporcentajeDescuentoTipoPrecio;
	public JButton jButtonporcentajeDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioDescuentoTipoPrecio;
	public JLabel jLabelfecha_inicioDescuentoTipoPrecio;
	//public JFormattedTextField jDateChooserfecha_inicioDescuentoTipoPrecio;

	public JDateChooser jDateChooserfecha_inicioDescuentoTipoPrecio;
	public JButton jButtonfecha_inicioDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finDescuentoTipoPrecio;
	public JLabel jLabelfecha_finDescuentoTipoPrecio;
	//public JFormattedTextField jDateChooserfecha_finDescuentoTipoPrecio;

	public JDateChooser jDateChooserfecha_finDescuentoTipoPrecio;
	public JButton jButtonfecha_finDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoDescuentoTipoPrecio;
	public JLabel jLabelesta_activoDescuentoTipoPrecio;
	public JCheckBox jCheckBoxesta_activoDescuentoTipoPrecio;
	public JButton jButtonesta_activoDescuentoTipoPrecioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDescuentoTipoPrecio;
	public JLabel jLabelid_empresaDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDescuentoTipoPrecio;
	public JButton jButtonid_empresaDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_empresaDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_empresaDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDescuentoTipoPrecio;
	public JLabel jLabelid_sucursalDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDescuentoTipoPrecio;
	public JButton jButtonid_sucursalDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_sucursalDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioDescuentoTipoPrecio;
	public JLabel jLabelid_usuarioDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioDescuentoTipoPrecio;
	public JButton jButtonid_usuarioDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_usuarioDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDescuentoTipoPrecio;
	public JLabel jLabelid_bodegaDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDescuentoTipoPrecio;
	public JButton jButtonid_bodegaDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_bodegaDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDescuentoTipoPrecioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioDescuentoTipoPrecio;
	public JLabel jLabelid_tipo_precioDescuentoTipoPrecio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioDescuentoTipoPrecio;
	public JButton jButtonid_tipo_precioDescuentoTipoPrecio= new JButtonMe();
	public JButton jButtonid_tipo_precioDescuentoTipoPrecioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioDescuentoTipoPrecioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDescuentoTipoPrecio;
	
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
	
	public DescuentoTipoPrecioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDescuentoTipoPrecio=new JPanel();
				this.jPanelAccionesFormularioDescuentoTipoPrecio=new JPanel();
				this.jmenuBarDetalleDescuentoTipoPrecio=new JMenuBar();
				this.jTtoolBarDetalleDescuentoTipoPrecio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DescuentoTipoPrecioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DescuentoTipoPrecioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DescuentoTipoPrecio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDescuentoTipoPrecio() {
		return this.jButtonActualizarToolBarDescuentoTipoPrecio;
	}
	
	public JButton getjButtonEliminarToolBarDescuentoTipoPrecio() {
		return this.jButtonEliminarToolBarDescuentoTipoPrecio;
	}
	
	public JButton getjButtonCancelarToolBarDescuentoTipoPrecio() {
		return this.jButtonCancelarToolBarDescuentoTipoPrecio;
	}		
	
	public JButton getjButtonProcesarInformacionDescuentoTipoPrecio() {
		return this.jButtonProcesarInformacionDescuentoTipoPrecio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDescuentoTipoPrecio)	{
		this.jButtonProcesarInformacionDescuentoTipoPrecio = jButtonProcesarInformacionDescuentoTipoPrecio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDescuentoTipoPrecio() {
		return this.jComboBoxTiposAccionesDescuentoTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposRelacionesDescuentoTipoPrecio) {
		this.jComboBoxTiposRelacionesDescuentoTipoPrecio = jComboBoxTiposRelacionesDescuentoTipoPrecio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDescuentoTipoPrecio(
			JComboBox jComboBoxTiposAccionesDescuentoTipoPrecio) {
		this.jComboBoxTiposAccionesDescuentoTipoPrecio = jComboBoxTiposAccionesDescuentoTipoPrecio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDescuentoTipoPrecio() {
		return this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDescuentoTipoPrecio(
			JComboBox jComboBoxTiposAccionesFormularioDescuentoTipoPrecio) {
		this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio = jComboBoxTiposAccionesFormularioDescuentoTipoPrecio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.descuentotipoprecioSessionBean=new DescuentoTipoPrecioSessionBean();
		
		this.descuentotipoprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.descuentotipoprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.descuentotipoprecioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DescuentoTipoPrecioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DescuentoTipoPrecioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Descuento Tipo Precio MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
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
	
		DescuentoTipoPrecioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDescuentoTipoPrecio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDescuentoTipoPrecio=new JButtonMe();
				this.jButtonModificarToolBarDescuentoTipoPrecio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDescuentoTipoPrecio,this.jTtoolBarDetalleDescuentoTipoPrecio,
							"actualizar","actualizar","Actualizar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDescuentoTipoPrecio,this.jTtoolBarDetalleDescuentoTipoPrecio,
							"eliminar","eliminar","Eliminar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDescuentoTipoPrecio,this.jTtoolBarDetalleDescuentoTipoPrecio,
							"cancelar","cancelar","Cancelar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDescuentoTipoPrecio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDescuentoTipoPrecio,this.jTtoolBarDetalleDescuentoTipoPrecio,
							"guardarcambios","guardarcambios","Guardar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDescuentoTipoPrecio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDescuentoTipoPrecio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDescuentoTipoPrecio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDescuentoTipoPrecio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDescuentoTipoPrecio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDescuentoTipoPrecio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDescuentoTipoPrecio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDescuentoTipoPrecio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDescuentoTipoPrecio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDescuentoTipoPrecio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDescuentoTipoPrecio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDescuentoTipoPrecio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDescuentoTipoPrecio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDescuentoTipoPrecio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDescuentoTipoPrecio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDescuentoTipoPrecio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDescuentoTipoPrecio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDescuentoTipoPrecio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDescuentoTipoPrecio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDescuentoTipoPrecio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDescuentoTipoPrecio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDescuentoTipoPrecio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDescuentoTipoPrecio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDescuentoTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDescuentoTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDescuentoTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDescuentoTipoPrecio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDescuentoTipoPrecio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDescuentoTipoPrecio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDescuentoTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDescuentoTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDescuentoTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDescuentoTipoPrecio.add(this.jMenuItemDetalleCerrarDescuentoTipoPrecio);
		
		this.jmenuDetalleAccionesDescuentoTipoPrecio.add(this.jMenuItemActualizarDescuentoTipoPrecio);
		this.jmenuDetalleAccionesDescuentoTipoPrecio.add(this.jMenuItemEliminarDescuentoTipoPrecio);
		this.jmenuDetalleAccionesDescuentoTipoPrecio.add(this.jMenuItemCancelarDescuentoTipoPrecio);		
		
		//this.jmenuDetalleDatosDescuentoTipoPrecio.add(this.jMenuItemDetalleAbrirOrderByDescuentoTipoPrecio);				
		this.jmenuDetalleDatosDescuentoTipoPrecio.add(this.jMenuItemDetalleMostarOcultarDescuentoTipoPrecio);				
				
		//this.jmenuDetalleAccionesDescuentoTipoPrecio.add(this.jMenuItemGuardarCambiosDescuentoTipoPrecio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDescuentoTipoPrecio.add(this.jmenuDetalleArchivoDescuentoTipoPrecio);		
		this.jmenuBarDetalleDescuentoTipoPrecio.add(this.jmenuDetalleAccionesDescuentoTipoPrecio);		
		this.jmenuBarDetalleDescuentoTipoPrecio.add(this.jmenuDetalleDatosDescuentoTipoPrecio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDescuentoTipoPrecio);				
	}
	
	
	public void inicializarElementosCamposDescuentoTipoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDescuentoTipoPrecio = new JLabelMe();
		jLabelIdDescuentoTipoPrecio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDescuentoTipoPrecio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDescuentoTipoPrecio= new GridBagLayout();

		this.jPanelidDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);

		jLabelidDescuentoTipoPrecio = new JLabel();
		jLabelidDescuentoTipoPrecio.setText("Id");

		jLabelidDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDescuentoTipoPrecio = new JLabelMe();
		this.jLabeldescripcionDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDescuentoTipoPrecio.setToolTipText("Descripcion");
		this.jLabeldescripcionDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPaneldescripcionDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jTextAreadescripcionDescuentoTipoPrecio= new JTextAreaMe();
		jTextAreadescripcionDescuentoTipoPrecio.setEnabled(false);
		jTextAreadescripcionDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDescuentoTipoPrecio.setLineWrap(true);
		jTextAreadescripcionDescuentoTipoPrecio.setWrapStyleWord(true);
		jTextAreadescripcionDescuentoTipoPrecio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDescuentoTipoPrecio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDescuentoTipoPrecio = new JScrollPane(jTextAreadescripcionDescuentoTipoPrecio);
		jscrollPanedescripcionDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtondescripcionDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtondescripcionDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDescuentoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeDescuentoTipoPrecio = new JLabelMe();
		this.jLabelporcentajeDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDescuentoTipoPrecio.setToolTipText("Porcentaje");
		this.jLabelporcentajeDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelporcentajeDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jTextFieldporcentajeDescuentoTipoPrecio= new JTextFieldMe();
		jTextFieldporcentajeDescuentoTipoPrecio.setEnabled(false);
		jTextFieldporcentajeDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDescuentoTipoPrecio.setText("0.0");

		this.jButtonporcentajeDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDescuentoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioDescuentoTipoPrecio = new JLabelMe();
		this.jLabelfecha_inicioDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioDescuentoTipoPrecio.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelfecha_inicioDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		//jFormattedTextFieldfecha_inicioDescuentoTipoPrecio= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioDescuentoTipoPrecio= new JDateChooser();
		jDateChooserfecha_inicioDescuentoTipoPrecio.setEnabled(false);
		jDateChooserfecha_inicioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioDescuentoTipoPrecio.setDate(new Date());
		jDateChooserfecha_inicioDescuentoTipoPrecio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioDescuentoTipoPrecio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioDescuentoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finDescuentoTipoPrecio = new JLabelMe();
		this.jLabelfecha_finDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finDescuentoTipoPrecio.setToolTipText("Fecha Fin");
		this.jLabelfecha_finDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelfecha_finDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		//jFormattedTextFieldfecha_finDescuentoTipoPrecio= new JFormattedTextFieldMe();

		jDateChooserfecha_finDescuentoTipoPrecio= new JDateChooser();
		jDateChooserfecha_finDescuentoTipoPrecio.setEnabled(false);
		jDateChooserfecha_finDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finDescuentoTipoPrecio.setDate(new Date());
		jDateChooserfecha_finDescuentoTipoPrecio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finDescuentoTipoPrecio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finDescuentoTipoPrecioBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoDescuentoTipoPrecio = new JLabelMe();
		this.jLabelesta_activoDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoDescuentoTipoPrecio.setToolTipText("Esta Activo");
		this.jLabelesta_activoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelesta_activoDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jCheckBoxesta_activoDescuentoTipoPrecio= new JCheckBoxMe();
		jCheckBoxesta_activoDescuentoTipoPrecio.setEnabled(false);

		jCheckBoxesta_activoDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoDescuentoTipoPrecioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDescuentoTipoPrecio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDescuentoTipoPrecio = new JLabelMe();
		this.jLabelid_empresaDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDescuentoTipoPrecio.setToolTipText("Empresa");
		this.jLabelid_empresaDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelid_empresaDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jComboBoxid_empresaDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_empresaDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDescuentoTipoPrecio.setEnabled(false);

		this.jButtonid_empresaDescuentoTipoPrecio= new JButtonMe();
		this.jButtonid_empresaDescuentoTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDescuentoTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDescuentoTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDescuentoTipoPrecio.setText("Buscar");
		this.jButtonid_empresaDescuentoTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDescuentoTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDescuentoTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDescuentoTipoPrecio"));

		this.jButtonid_empresaDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDescuentoTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_empresaDescuentoTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_empresaDescuentoTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDescuentoTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDescuentoTipoPrecioUpdate.setText("U");
		this.jButtonid_empresaDescuentoTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDescuentoTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDescuentoTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDescuentoTipoPrecioUpdate"));



					
		this.jLabelid_sucursalDescuentoTipoPrecio = new JLabelMe();
		this.jLabelid_sucursalDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDescuentoTipoPrecio.setToolTipText("Sucursal");
		this.jLabelid_sucursalDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelid_sucursalDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jComboBoxid_sucursalDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_sucursalDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDescuentoTipoPrecio.setEnabled(false);

		this.jButtonid_sucursalDescuentoTipoPrecio= new JButtonMe();
		this.jButtonid_sucursalDescuentoTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDescuentoTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDescuentoTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDescuentoTipoPrecio.setText("Buscar");
		this.jButtonid_sucursalDescuentoTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDescuentoTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDescuentoTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDescuentoTipoPrecio"));

		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDescuentoTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDescuentoTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_sucursalDescuentoTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDescuentoTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDescuentoTipoPrecioUpdate.setText("U");
		this.jButtonid_sucursalDescuentoTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDescuentoTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDescuentoTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDescuentoTipoPrecioUpdate"));



					
		this.jLabelid_usuarioDescuentoTipoPrecio = new JLabelMe();
		this.jLabelid_usuarioDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioDescuentoTipoPrecio.setToolTipText("Usuario");
		this.jLabelid_usuarioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelid_usuarioDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jComboBoxid_usuarioDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_usuarioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioDescuentoTipoPrecio.setEnabled(false);

		this.jButtonid_usuarioDescuentoTipoPrecio= new JButtonMe();
		this.jButtonid_usuarioDescuentoTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDescuentoTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDescuentoTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioDescuentoTipoPrecio.setText("Buscar");
		this.jButtonid_usuarioDescuentoTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioDescuentoTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDescuentoTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDescuentoTipoPrecio"));

		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioDescuentoTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioDescuentoTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_usuarioDescuentoTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioDescuentoTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioDescuentoTipoPrecioUpdate.setText("U");
		this.jButtonid_usuarioDescuentoTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioDescuentoTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioDescuentoTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioDescuentoTipoPrecioUpdate"));



					
		this.jLabelid_bodegaDescuentoTipoPrecio = new JLabelMe();
		this.jLabelid_bodegaDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDescuentoTipoPrecio.setToolTipText("Bodega");
		this.jLabelid_bodegaDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelid_bodegaDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jComboBoxid_bodegaDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_bodegaDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDescuentoTipoPrecio= new JButtonMe();
		this.jButtonid_bodegaDescuentoTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDescuentoTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDescuentoTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDescuentoTipoPrecio.setText("Buscar");
		this.jButtonid_bodegaDescuentoTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDescuentoTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDescuentoTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDescuentoTipoPrecio"));

		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDescuentoTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDescuentoTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_bodegaDescuentoTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDescuentoTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDescuentoTipoPrecioUpdate.setText("U");
		this.jButtonid_bodegaDescuentoTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDescuentoTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDescuentoTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDescuentoTipoPrecioUpdate"));



					
		this.jLabelid_tipo_precioDescuentoTipoPrecio = new JLabelMe();
		this.jLabelid_tipo_precioDescuentoTipoPrecio.setText(""+DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioDescuentoTipoPrecio.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioDescuentoTipoPrecio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioDescuentoTipoPrecio.setToolTipText(DescuentoTipoPrecioConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		this.jPanelid_tipo_precioDescuentoTipoPrecio.setLayout(this.gridaBagLayoutDescuentoTipoPrecio);


		jComboBoxid_tipo_precioDescuentoTipoPrecio= new JComboBoxMe();
		jComboBoxid_tipo_precioDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioDescuentoTipoPrecio= new JButtonMe();
		this.jButtonid_tipo_precioDescuentoTipoPrecio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioDescuentoTipoPrecio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioDescuentoTipoPrecio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioDescuentoTipoPrecio.setText("Buscar");
		this.jButtonid_tipo_precioDescuentoTipoPrecio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioDescuentoTipoPrecio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioDescuentoTipoPrecio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioDescuentoTipoPrecio"));

		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setText("U");
		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioDescuentoTipoPrecioBusqueda"));

		if(this.descuentotipoprecioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioDescuentoTipoPrecioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate= new JButtonMe();
		this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.setText("U");
		this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioDescuentoTipoPrecioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioDescuentoTipoPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioDescuentoTipoPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioDescuentoTipoPrecioUpdate"));



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
		//this.jInternalFrameDetalleDescuentoTipoPrecio = new DescuentoTipoPrecioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Descuento Tipo Precio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDescuentoTipoPrecio= new GridBagLayout();
		

		
		String sToolTipDescuentoTipoPrecio="";
		sToolTipDescuentoTipoPrecio=DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDescuentoTipoPrecio+="(Inventario.DescuentoTipoPrecio)";
		}
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			sToolTipDescuentoTipoPrecio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDescuentoTipoPrecio = new JButtonMe();
		this.jButtonModificarDescuentoTipoPrecio = new JButtonMe();
        this.jButtonActualizarDescuentoTipoPrecio = new JButtonMe();
        this.jButtonEliminarDescuentoTipoPrecio = new JButtonMe();
        this.jButtonCancelarDescuentoTipoPrecio = new JButtonMe();
        this.jButtonGuardarCambiosDescuentoTipoPrecio = new JButtonMe();
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio = new JButtonMe();
		this.jButtonCerrarDescuentoTipoPrecio = new JButtonMe();
		
		this.jScrollPanelDatosDescuentoTipoPrecio = new JScrollPane();   
        this.jScrollPanelDatosEdicionDescuentoTipoPrecio = new JScrollPane();
		this.jScrollPanelDatosGeneralDescuentoTipoPrecio = new JScrollPane();
				
		
		
		this.jPanelCamposDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Descuento Tipo Precio";
		
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Descuento Tipo Precios" + this.sPath));
		} else {
			this.jScrollPanelDatosDescuentoTipoPrecio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDescuentoTipoPrecio.setName("jPanelCamposDescuentoTipoPrecio"); 

		this.jPanelCamposOcultosDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDescuentoTipoPrecio.setName("jPanelCamposOcultosDescuentoTipoPrecio"); 

        this.jPanelAccionesDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDescuentoTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesDescuentoTipoPrecio.setName("Acciones"); 

		this.jPanelAccionesFormularioDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDescuentoTipoPrecio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDescuentoTipoPrecio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDescuentoTipoPrecio.setText("Nuevo");
		this.jButtonModificarDescuentoTipoPrecio.setText("Editar");
        this.jButtonActualizarDescuentoTipoPrecio.setText("Actualizar");
        this.jButtonEliminarDescuentoTipoPrecio.setText("Eliminar");
        this.jButtonCancelarDescuentoTipoPrecio.setText("Cancelar");
        this.jButtonGuardarCambiosDescuentoTipoPrecio.setText("Guardar");
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.setText("Guardar");
		this.jButtonCerrarDescuentoTipoPrecio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDescuentoTipoPrecio,"nuevo_button","Nuevo",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDescuentoTipoPrecio,"modificar_button","Editar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDescuentoTipoPrecio,"actualizar_button","Actualizar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDescuentoTipoPrecio,"eliminar_button","Eliminar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDescuentoTipoPrecio,"cancelar_button","Cancelar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDescuentoTipoPrecio,"guardarcambios_button","Guardar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDescuentoTipoPrecio,"guardarcambiostabla_button","Guardar",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDescuentoTipoPrecio,"cerrar_button","Salir",this.descuentotipoprecioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDescuentoTipoPrecio.setToolTipText("Nuevo"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDescuentoTipoPrecio.setToolTipText("Editar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDescuentoTipoPrecio.setToolTipText("Actualizar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDescuentoTipoPrecio.setToolTipText("Eliminar)"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDescuentoTipoPrecio.setToolTipText("Cancelar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDescuentoTipoPrecio.setToolTipText("Guardar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.setToolTipText("Guardar"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDescuentoTipoPrecio.setToolTipText("Salir"+" "+DescuentoTipoPrecioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDescuentoTipoPrecio";
		inputMap = this.jButtonNuevoDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDescuentoTipoPrecio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDescuentoTipoPrecio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDescuentoTipoPrecio";
		inputMap = this.jButtonActualizarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDescuentoTipoPrecio"));
		
		//ELIMINAR
		sMapKey = "EliminarDescuentoTipoPrecio";
		inputMap = this.jButtonEliminarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDescuentoTipoPrecio"));
		
		//CANCELAR	
		sMapKey = "CancelarDescuentoTipoPrecio";
		inputMap = this.jButtonCancelarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDescuentoTipoPrecio"));
		
		//CERRAR		
		sMapKey = "CerrarDescuentoTipoPrecio";
		inputMap = this.jButtonCerrarDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDescuentoTipoPrecio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDescuentoTipoPrecio";
		inputMap = this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDescuentoTipoPrecio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDescuentoTipoPrecio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDescuentoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDescuentoTipoPrecio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDescuentoTipoPrecio.setToolTipText("Nuevo DescuentoTipoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio.setToolTipText("Sin Cerrar Ventana DescuentoTipoPrecio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDescuentoTipoPrecio.setText("Accion");
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDescuentoTipoPrecio = new JLabelMe();
		
		this.jLabelAccionesDescuentoTipoPrecio.setText("Acciones");		
		this.jLabelAccionesDescuentoTipoPrecio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoTipoPrecio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDescuentoTipoPrecio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDescuentoTipoPrecio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDescuentoTipoPrecio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDescuentoTipoPrecio=new JTabbedPane();
		this.jTabbedPaneRelacionesDescuentoTipoPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDescuentoTipoPrecio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDescuentoTipoPrecio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDescuentoTipoPrecio = new GridBagLayout();
		
		this.jPanelCamposDescuentoTipoPrecio.setLayout(gridaBagLayoutCamposDescuentoTipoPrecio);
		this.jPanelCamposOcultosDescuentoTipoPrecio.setLayout(gridaBagLayoutCamposOcultosDescuentoTipoPrecio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDescuentoTipoPrecio.add(jLabelIdDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDescuentoTipoPrecio.add(jLabelidDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDescuentoTipoPrecio.add(jLabelid_empresaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDescuentoTipoPrecio.add(jButtonid_empresaDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 3;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDescuentoTipoPrecio.add(jButtonid_empresaDescuentoTipoPrecioUpdate, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDescuentoTipoPrecio.add(jComboBoxid_empresaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDescuentoTipoPrecio.add(jLabelid_sucursalDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDescuentoTipoPrecio.add(jButtonid_sucursalDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 3;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDescuentoTipoPrecio.add(jButtonid_sucursalDescuentoTipoPrecioUpdate, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDescuentoTipoPrecio.add(jComboBoxid_sucursalDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioDescuentoTipoPrecio.add(jLabelid_usuarioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDescuentoTipoPrecio.add(jButtonid_usuarioDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 3;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioDescuentoTipoPrecio.add(jButtonid_usuarioDescuentoTipoPrecioUpdate, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioDescuentoTipoPrecio.add(jComboBoxid_usuarioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDescuentoTipoPrecio.add(jLabelid_bodegaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDescuentoTipoPrecio.add(jButtonid_bodegaDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 3;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDescuentoTipoPrecio.add(jButtonid_bodegaDescuentoTipoPrecioUpdate, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDescuentoTipoPrecio.add(jComboBoxid_bodegaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioDescuentoTipoPrecio.add(jLabelid_tipo_precioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioDescuentoTipoPrecio.add(jButtonid_tipo_precioDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 3;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioDescuentoTipoPrecio.add(jButtonid_tipo_precioDescuentoTipoPrecioUpdate, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioDescuentoTipoPrecio.add(jComboBoxid_tipo_precioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDescuentoTipoPrecio.add(jLabeldescripcionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDescuentoTipoPrecio.add(jButtondescripcionDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDescuentoTipoPrecio.add(jscrollPanedescripcionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDescuentoTipoPrecio.add(jLabelporcentajeDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDescuentoTipoPrecio.add(jButtonporcentajeDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDescuentoTipoPrecio.add(jTextFieldporcentajeDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioDescuentoTipoPrecio.add(jLabelfecha_inicioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioDescuentoTipoPrecio.add(jButtonfecha_inicioDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioDescuentoTipoPrecio.add(jDateChooserfecha_inicioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finDescuentoTipoPrecio.add(jLabelfecha_finDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finDescuentoTipoPrecio.add(jButtonfecha_finDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finDescuentoTipoPrecio.add(jDateChooserfecha_finDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoDescuentoTipoPrecio.add(jLabelesta_activoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		//this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 2;
		this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoDescuentoTipoPrecio.add(jButtonesta_activoDescuentoTipoPrecioBusqueda, this.gridBagConstraintsDescuentoTipoPrecio);
	}

	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = 1;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoDescuentoTipoPrecio.add(jCheckBoxesta_activoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelidDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelid_bodegaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelid_tipo_precioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPaneldescripcionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelporcentajeDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelfecha_inicioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelfecha_finDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDescuentoTipoPrecio.add(this.jPanelesta_activoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposDescuentoTipoPrecio % 1==0) {
		iXPanelCamposDescuentoTipoPrecio=0;
		iYPanelCamposDescuentoTipoPrecio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposOcultosDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposOcultosDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDescuentoTipoPrecio.add(this.jPanelid_empresaDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposOcultosDescuentoTipoPrecio % 1==0) {
		iXPanelCamposOcultosDescuentoTipoPrecio=0;
		iYPanelCamposOcultosDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposOcultosDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposOcultosDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDescuentoTipoPrecio.add(this.jPanelid_sucursalDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposOcultosDescuentoTipoPrecio % 1==0) {
		iXPanelCamposOcultosDescuentoTipoPrecio=0;
		iYPanelCamposOcultosDescuentoTipoPrecio++;
	}
	this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDescuentoTipoPrecio.gridy = iYPanelCamposOcultosDescuentoTipoPrecio;
	this.gridBagConstraintsDescuentoTipoPrecio.gridx = iXPanelCamposOcultosDescuentoTipoPrecio++;
	this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDescuentoTipoPrecio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDescuentoTipoPrecio.add(this.jPanelid_usuarioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);



	if(iXPanelCamposOcultosDescuentoTipoPrecio % 1==0) {
		iXPanelCamposOcultosDescuentoTipoPrecio=0;
		iYPanelCamposOcultosDescuentoTipoPrecio++;
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
			
		GridBagLayout gridaBagLayoutAccionesDescuentoTipoPrecio= new GridBagLayout();
		this.jPanelAccionesDescuentoTipoPrecio.setLayout(gridaBagLayoutAccionesDescuentoTipoPrecio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDescuentoTipoPrecio= new GridBagLayout();
		this.jPanelAccionesFormularioDescuentoTipoPrecio.setLayout(gridaBagLayoutAccionesFormularioDescuentoTipoPrecio);
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDescuentoTipoPrecio.add(this.jComboBoxTiposAccionesFormularioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDescuentoTipoPrecio.add(this.jCheckBoxPostAccionNuevoDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDescuentoTipoPrecio.add(this.jCheckBoxPostAccionSinCerrarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.descuentotipoprecioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDescuentoTipoPrecio.add(this.jCheckBoxPostAccionSinMensajeDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccion++;
			
		this.jPanelAccionesDescuentoTipoPrecio.add(this.jButtonModificarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);							

		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =iPosXAccion++;
			
		this.jPanelAccionesDescuentoTipoPrecio.add(this.jButtonEliminarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesDescuentoTipoPrecio.add(this.jButtonActualizarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);


		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = iPosXAccion++;
		
		this.jPanelAccionesDescuentoTipoPrecio.add(this.jButtonGuardarCambiosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);	
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = 0;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =iPosXAccion++;
		
		this.jPanelAccionesDescuentoTipoPrecio.add(this.jButtonCancelarDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDescuentoTipoPrecio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDescuentoTipoPrecio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.descuentotipoprecioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();						
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;		
			//this.gridBagConstraintsDescuentoTipoPrecio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDescuentoTipoPrecio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =0;
		this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDescuentoTipoPrecio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DescuentoTipoPrecioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDescuentoTipoPrecio = new DescuentoTipoPrecioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Descuento Tipo Precio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Descuento Tipo Precio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Descuento Tipo Precio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DescuentoTipoPrecioModel descuentotipoprecioModel=new DescuentoTipoPrecioModel(this);
			
			//SI USARA CLASE INTERNA
			//DescuentoTipoPrecioModel.DescuentoTipoPrecioFocusTraversalPolicy descuentotipoprecioFocusTraversalPolicy = descuentotipoprecioModel.new DescuentoTipoPrecioFocusTraversalPolicy(this);
			
			//descuentotipoprecioFocusTraversalPolicy.setdescuentotipoprecioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(descuentotipoprecioModel);
			
			
			this.jContentPaneDetalleDescuentoTipoPrecio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDescuentoTipoPrecio = new GridBagLayout();	
			this.jContentPaneDetalleDescuentoTipoPrecio.setLayout(gridaBagLayoutDetalleDescuentoTipoPrecio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDescuentoTipoPrecio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
				this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
					
				
				this.jContentPaneDetalleDescuentoTipoPrecio.add(jTtoolBarDetalleDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);								
				
}
			
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio=   new JScrollPane(jContentPaneDetalleDescuentoTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	        
			this.jContentPaneDetalleDescuentoTipoPrecio.add(jPanelCamposDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);
			
			
			
			
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
						&& descuentotipoprecioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.descuentotipoprecioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDescuentoTipoPrecio= new GridBagConstraints();
						this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
						this.jContentPaneDetalleDescuentoTipoPrecio.add(this.jTabbedPaneRelacionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDescuentoTipoPrecio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDescuentoTipoPrecio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
					this.gridBagConstraintsDescuentoTipoPrecio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
					
				
					this.jContentPaneDetalleDescuentoTipoPrecio.add(jPanelCamposOcultosDescuentoTipoPrecio, gridBagConstraintsDescuentoTipoPrecio);
				
					this.jPanelCamposOcultosDescuentoTipoPrecio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	        this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDescuentoTipoPrecio.add(this.jPanelAccionesFormularioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);							
			
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
	        this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
	        
			
			this.jContentPaneDetalleDescuentoTipoPrecio.add(this.jPanelAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDescuentoTipoPrecio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio=   new JScrollPane(this.jPanelCamposDescuentoTipoPrecio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDescuentoTipoPrecio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
			this.gridBagConstraintsDescuentoTipoPrecio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDescuentoTipoPrecio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDescuentoTipoPrecio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);			
			
			this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
			this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
			
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		
			
		this.gridBagConstraintsDescuentoTipoPrecio = new GridBagConstraints();
		this.gridBagConstraintsDescuentoTipoPrecio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDescuentoTipoPrecio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDescuentoTipoPrecio, this.gridBagConstraintsDescuentoTipoPrecio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDescuentoTipoPrecio;//jContentPane;
		
		return jScrollPanelDatosEdicionDescuentoTipoPrecio;
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
