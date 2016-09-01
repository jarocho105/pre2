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
import com.bydan.erp.inventario.util.DetalleImpuestoInvenConstantesFunciones;

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
public class DetalleImpuestoInvenDetalleFormJInternalFrame extends DetalleImpuestoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleImpuestoInven;
	
	protected JMenuBar jmenuBarDetalleDetalleImpuestoInven;
	
	protected JMenu jmenuDetalleDetalleImpuestoInven;
	protected JMenu jmenuDetalleArchivoDetalleImpuestoInven;
	protected JMenu jmenuDetalleAccionesDetalleImpuestoInven;
	protected JMenu jmenuDetalleDatosDetalleImpuestoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleImpuestoInven;	
	protected GridBagConstraints gridBagConstraintsDetalleImpuestoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleImpuestoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleImpuestoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_impuestoinven="";
	
	public DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public ImpuestoInvenSessionBean impuestoinvenSessionBean;	
	
	public DetalleImpuestoInvenLogic detalleimpuestoinvenLogic;
	
	public JScrollPane jScrollPanelDatosDetalleImpuestoInven;
	public JScrollPane jScrollPanelDatosEdicionDetalleImpuestoInven;
	public JScrollPane jScrollPanelDatosGeneralDetalleImpuestoInven;
	
	protected JPanel jPanelCamposDetalleImpuestoInven;    
	protected JPanel jPanelCamposOcultosDetalleImpuestoInven;    	
	protected JPanel jPanelAccionesDetalleImpuestoInven;
	protected JPanel jPanelAccionesFormularioDetalleImpuestoInven;
    
	
	
	protected Integer iXPanelCamposDetalleImpuestoInven=0;
	protected Integer iYPanelCamposDetalleImpuestoInven=0;
	
	protected Integer iXPanelCamposOcultosDetalleImpuestoInven=0;
	protected Integer iYPanelCamposOcultosDetalleImpuestoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleImpuestoInven;
	public JButton jButtonModificarDetalleImpuestoInven;
	public JButton jButtonActualizarDetalleImpuestoInven;
    public JButton jButtonEliminarDetalleImpuestoInven;
	public JButton jButtonCancelarDetalleImpuestoInven;
    public JButton jButtonGuardarCambiosDetalleImpuestoInven;
	public JButton jButtonGuardarCambiosTablaDetalleImpuestoInven;
	protected JButton jButtonCerrarDetalleImpuestoInven;
	
	
	protected JButton jButtonProcesarInformacionDetalleImpuestoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleImpuestoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleImpuestoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleImpuestoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleImpuestoInven;
	protected JButton jButtonModificarToolBarDetalleImpuestoInven;
	protected JButton jButtonActualizarToolBarDetalleImpuestoInven;
    protected JButton jButtonEliminarToolBarDetalleImpuestoInven;
	protected JButton jButtonCancelarToolBarDetalleImpuestoInven;
    protected JButton jButtonGuardarCambiosToolBarDetalleImpuestoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleImpuestoInven;
	protected JButton jButtonCerrarToolBarDetalleImpuestoInven;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleImpuestoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleImpuestoInven;
	protected JMenuItem jMenuItemModificarDetalleImpuestoInven;
	protected JMenuItem jMenuItemActualizarDetalleImpuestoInven;
    protected JMenuItem jMenuItemEliminarDetalleImpuestoInven;
	protected JMenuItem jMenuItemCancelarDetalleImpuestoInven;
    protected JMenuItem jMenuItemGuardarCambiosDetalleImpuestoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleImpuestoInven;
	protected JMenuItem jMenuItemCerrarDetalleImpuestoInven;
	protected JMenuItem jMenuItemDetalleCerrarDetalleImpuestoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleImpuestoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleImpuestoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleImpuestoInven;
	protected JMenuItem jMenuItemMostrarOcultarDetalleImpuestoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleImpuestoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleImpuestoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleImpuestoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleImpuestoInven;
	public JLabel jLabelIdDetalleImpuestoInven;
	public JLabel jLabelidDetalleImpuestoInven;
	public JButton jButtonidDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDetalleImpuestoInven;
	public JLabel jLabelporcentajeDetalleImpuestoInven;
	public JTextField jTextFieldporcentajeDetalleImpuestoInven;
	public JButton jButtonporcentajeDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetalleImpuestoInven;
	public JLabel jLabelvalorDetalleImpuestoInven;
	public JTextField jTextFieldvalorDetalleImpuestoInven;
	public JButton jButtonvalorDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleImpuestoInven;
	public JLabel jLabeldescripcionDetalleImpuestoInven;
	public JTextField jTextFielddescripcionDetalleImpuestoInven;
	public JButton jButtondescripcionDetalleImpuestoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleImpuestoInven;
	public JLabel jLabelid_empresaDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleImpuestoInven;
	public JButton jButtonid_empresaDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_empresaDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleImpuestoInven;
	public JLabel jLabelid_sucursalDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleImpuestoInven;
	public JButton jButtonid_sucursalDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_sucursalDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleImpuestoInven;
	public JLabel jLabelid_bodegaDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleImpuestoInven;
	public JButton jButtonid_bodegaDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_bodegaDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleImpuestoInven;
	public JLabel jLabelid_productoDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleImpuestoInven;
	public JButton jButtonid_productoDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_productoDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleImpuestoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_impuesto_invenDetalleImpuestoInven;
	public JLabel jLabelid_impuesto_invenDetalleImpuestoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_impuesto_invenDetalleImpuestoInven;
	public JButton jButtonid_impuesto_invenDetalleImpuestoInven= new JButtonMe();
	public JButton jButtonid_impuesto_invenDetalleImpuestoInvenUpdate= new JButtonMe();
	public JButton jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleImpuestoInven;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleImpuestoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleImpuestoInven=new JPanel();
				this.jPanelAccionesFormularioDetalleImpuestoInven=new JPanel();
				this.jmenuBarDetalleDetalleImpuestoInven=new JMenuBar();
				this.jTtoolBarDetalleDetalleImpuestoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleImpuestoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleImpuestoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleImpuestoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleImpuestoInven() {
		return this.jButtonActualizarToolBarDetalleImpuestoInven;
	}
	
	public JButton getjButtonEliminarToolBarDetalleImpuestoInven() {
		return this.jButtonEliminarToolBarDetalleImpuestoInven;
	}
	
	public JButton getjButtonCancelarToolBarDetalleImpuestoInven() {
		return this.jButtonCancelarToolBarDetalleImpuestoInven;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleImpuestoInven() {
		return this.jButtonProcesarInformacionDetalleImpuestoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleImpuestoInven)	{
		this.jButtonProcesarInformacionDetalleImpuestoInven = jButtonProcesarInformacionDetalleImpuestoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleImpuestoInven() {
		return this.jComboBoxTiposAccionesDetalleImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleImpuestoInven(
			JComboBox jComboBoxTiposRelacionesDetalleImpuestoInven) {
		this.jComboBoxTiposRelacionesDetalleImpuestoInven = jComboBoxTiposRelacionesDetalleImpuestoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleImpuestoInven(
			JComboBox jComboBoxTiposAccionesDetalleImpuestoInven) {
		this.jComboBoxTiposAccionesDetalleImpuestoInven = jComboBoxTiposAccionesDetalleImpuestoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleImpuestoInven() {
		return this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleImpuestoInven(
			JComboBox jComboBoxTiposAccionesFormularioDetalleImpuestoInven) {
		this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven = jComboBoxTiposAccionesFormularioDetalleImpuestoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		
		this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleImpuestoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleImpuestoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Impuesto Inven MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleImpuestoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleImpuestoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleImpuestoInven=new JButtonMe();
				this.jButtonModificarToolBarDetalleImpuestoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleImpuestoInven,this.jTtoolBarDetalleDetalleImpuestoInven,
							"actualizar","actualizar","Actualizar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleImpuestoInven,this.jTtoolBarDetalleDetalleImpuestoInven,
							"eliminar","eliminar","Eliminar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleImpuestoInven,this.jTtoolBarDetalleDetalleImpuestoInven,
							"cancelar","cancelar","Cancelar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleImpuestoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleImpuestoInven,this.jTtoolBarDetalleDetalleImpuestoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleImpuestoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleImpuestoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleImpuestoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleImpuestoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleImpuestoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleImpuestoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleImpuestoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleImpuestoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleImpuestoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleImpuestoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleImpuestoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleImpuestoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleImpuestoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleImpuestoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleImpuestoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleImpuestoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleImpuestoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleImpuestoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleImpuestoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleImpuestoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleImpuestoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleImpuestoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleImpuestoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleImpuestoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleImpuestoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleImpuestoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleImpuestoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleImpuestoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleImpuestoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleImpuestoInven.add(this.jMenuItemDetalleCerrarDetalleImpuestoInven);
		
		this.jmenuDetalleAccionesDetalleImpuestoInven.add(this.jMenuItemActualizarDetalleImpuestoInven);
		this.jmenuDetalleAccionesDetalleImpuestoInven.add(this.jMenuItemEliminarDetalleImpuestoInven);
		this.jmenuDetalleAccionesDetalleImpuestoInven.add(this.jMenuItemCancelarDetalleImpuestoInven);		
		
		//this.jmenuDetalleDatosDetalleImpuestoInven.add(this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven);				
		this.jmenuDetalleDatosDetalleImpuestoInven.add(this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven);				
				
		//this.jmenuDetalleAccionesDetalleImpuestoInven.add(this.jMenuItemGuardarCambiosDetalleImpuestoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleImpuestoInven.add(this.jmenuDetalleArchivoDetalleImpuestoInven);		
		this.jmenuBarDetalleDetalleImpuestoInven.add(this.jmenuDetalleAccionesDetalleImpuestoInven);		
		this.jmenuBarDetalleDetalleImpuestoInven.add(this.jmenuDetalleDatosDetalleImpuestoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleImpuestoInven);				
	}
	
	
	public void inicializarElementosCamposDetalleImpuestoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleImpuestoInven = new JLabelMe();
		jLabelIdDetalleImpuestoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleImpuestoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleImpuestoInven= new GridBagLayout();

		this.jPanelidDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);

		jLabelidDetalleImpuestoInven = new JLabel();
		jLabelidDetalleImpuestoInven.setText("Id");

		jLabelidDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelporcentajeDetalleImpuestoInven = new JLabelMe();
		this.jLabelporcentajeDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDetalleImpuestoInven.setToolTipText("Porcentaje");
		this.jLabelporcentajeDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelporcentajeDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jTextFieldporcentajeDetalleImpuestoInven= new JTextFieldMe();
		jTextFieldporcentajeDetalleImpuestoInven.setEnabled(false);
		jTextFieldporcentajeDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDetalleImpuestoInven.setText("0.0");

		this.jButtonporcentajeDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDetalleImpuestoInvenBusqueda.setVisible(false);		}


					
		this.jLabelvalorDetalleImpuestoInven = new JLabelMe();
		this.jLabelvalorDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetalleImpuestoInven.setToolTipText("Valor");
		this.jLabelvalorDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelvalorDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jTextFieldvalorDetalleImpuestoInven= new JTextFieldMe();
		jTextFieldvalorDetalleImpuestoInven.setEnabled(false);
		jTextFieldvalorDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetalleImpuestoInven.setText("0.0");

		this.jButtonvalorDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonvalorDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonvalorDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetalleImpuestoInvenBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleImpuestoInven = new JLabelMe();
		this.jLabeldescripcionDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleImpuestoInven.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPaneldescripcionDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jTextFielddescripcionDetalleImpuestoInven= new JTextFieldMe();

		jTextFielddescripcionDetalleImpuestoInven.setEnabled(false);
		jTextFielddescripcionDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescripcionDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondescripcionDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtondescripcionDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescripcionDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescripcionDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleImpuestoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleImpuestoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleImpuestoInven = new JLabelMe();
		this.jLabelid_empresaDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleImpuestoInven.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelid_empresaDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jComboBoxid_empresaDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_empresaDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleImpuestoInven.setEnabled(false);

		this.jButtonid_empresaDetalleImpuestoInven= new JButtonMe();
		this.jButtonid_empresaDetalleImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleImpuestoInven.setText("Buscar");
		this.jButtonid_empresaDetalleImpuestoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleImpuestoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleImpuestoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleImpuestoInven"));

		this.jButtonid_empresaDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleImpuestoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleImpuestoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleImpuestoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleImpuestoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleImpuestoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleImpuestoInvenUpdate.setText("U");
		this.jButtonid_empresaDetalleImpuestoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleImpuestoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleImpuestoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleImpuestoInvenUpdate"));



					
		this.jLabelid_sucursalDetalleImpuestoInven = new JLabelMe();
		this.jLabelid_sucursalDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleImpuestoInven.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelid_sucursalDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jComboBoxid_sucursalDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_sucursalDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleImpuestoInven.setEnabled(false);

		this.jButtonid_sucursalDetalleImpuestoInven= new JButtonMe();
		this.jButtonid_sucursalDetalleImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleImpuestoInven.setText("Buscar");
		this.jButtonid_sucursalDetalleImpuestoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleImpuestoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleImpuestoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleImpuestoInven"));

		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleImpuestoInvenBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleImpuestoInvenUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleImpuestoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleImpuestoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleImpuestoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleImpuestoInvenUpdate.setText("U");
		this.jButtonid_sucursalDetalleImpuestoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleImpuestoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleImpuestoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleImpuestoInvenUpdate"));



					
		this.jLabelid_bodegaDetalleImpuestoInven = new JLabelMe();
		this.jLabelid_bodegaDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleImpuestoInven.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelid_bodegaDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jComboBoxid_bodegaDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_bodegaDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleImpuestoInven= new JButtonMe();
		this.jButtonid_bodegaDetalleImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleImpuestoInven.setText("Buscar");
		this.jButtonid_bodegaDetalleImpuestoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleImpuestoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleImpuestoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleImpuestoInven"));

		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleImpuestoInvenBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleImpuestoInvenUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleImpuestoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleImpuestoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleImpuestoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleImpuestoInvenUpdate.setText("U");
		this.jButtonid_bodegaDetalleImpuestoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleImpuestoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleImpuestoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleImpuestoInvenUpdate"));



					
		this.jLabelid_productoDetalleImpuestoInven = new JLabelMe();
		this.jLabelid_productoDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleImpuestoInven.setToolTipText("Producto");
		this.jLabelid_productoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelid_productoDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jComboBoxid_productoDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_productoDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleImpuestoInven= new JButtonMe();
		this.jButtonid_productoDetalleImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleImpuestoInven.setText("Buscar");
		this.jButtonid_productoDetalleImpuestoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleImpuestoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleImpuestoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleImpuestoInven"));

		this.jButtonid_productoDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonid_productoDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleImpuestoInvenBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleImpuestoInvenUpdate= new JButtonMe();
		this.jButtonid_productoDetalleImpuestoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleImpuestoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleImpuestoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleImpuestoInvenUpdate.setText("U");
		this.jButtonid_productoDetalleImpuestoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleImpuestoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleImpuestoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleImpuestoInvenUpdate"));



					
		this.jLabelid_impuesto_invenDetalleImpuestoInven = new JLabelMe();
		this.jLabelid_impuesto_invenDetalleImpuestoInven.setText(""+DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN+" : *");
		this.jLabelid_impuesto_invenDetalleImpuestoInven.setToolTipText("Impuesto Inven");
		this.jLabelid_impuesto_invenDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_impuesto_invenDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_impuesto_invenDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_impuesto_invenDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_impuesto_invenDetalleImpuestoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_impuesto_invenDetalleImpuestoInven.setToolTipText(DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN);
		this.gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		this.jPanelid_impuesto_invenDetalleImpuestoInven.setLayout(this.gridaBagLayoutDetalleImpuestoInven);


		jComboBoxid_impuesto_invenDetalleImpuestoInven= new JComboBoxMe();
		jComboBoxid_impuesto_invenDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_impuesto_invenDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_impuesto_invenDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_impuesto_invenDetalleImpuestoInven= new JButtonMe();
		this.jButtonid_impuesto_invenDetalleImpuestoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_impuesto_invenDetalleImpuestoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_impuesto_invenDetalleImpuestoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_impuesto_invenDetalleImpuestoInven.setText("Buscar");
		this.jButtonid_impuesto_invenDetalleImpuestoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_impuesto_invenDetalleImpuestoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_impuesto_invenDetalleImpuestoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_impuesto_invenDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_impuesto_invenDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_impuesto_invenDetalleImpuestoInven"));

		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda= new JButtonMe();
		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setText("U");
		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_impuesto_invenDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_impuesto_invenDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_impuesto_invenDetalleImpuestoInvenBusqueda"));

		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.setVisible(false);		}

		this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate= new JButtonMe();
		this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.setText("U");
		this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_impuesto_invenDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_impuesto_invenDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_impuesto_invenDetalleImpuestoInvenUpdate"));



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
		//this.jInternalFrameDetalleDetalleImpuestoInven = new DetalleImpuestoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Impuesto Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleImpuestoInven= new GridBagLayout();
		

		
		String sToolTipDetalleImpuestoInven="";
		sToolTipDetalleImpuestoInven=DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleImpuestoInven+="(Inventario.DetalleImpuestoInven)";
		}
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleImpuestoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleImpuestoInven = new JButtonMe();
		this.jButtonModificarDetalleImpuestoInven = new JButtonMe();
        this.jButtonActualizarDetalleImpuestoInven = new JButtonMe();
        this.jButtonEliminarDetalleImpuestoInven = new JButtonMe();
        this.jButtonCancelarDetalleImpuestoInven = new JButtonMe();
        this.jButtonGuardarCambiosDetalleImpuestoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven = new JButtonMe();
		this.jButtonCerrarDetalleImpuestoInven = new JButtonMe();
		
		this.jScrollPanelDatosDetalleImpuestoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleImpuestoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleImpuestoInven = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Impuesto Inven";
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Impuesto Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleImpuestoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleImpuestoInven.setName("jPanelCamposDetalleImpuestoInven"); 

		this.jPanelCamposOcultosDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleImpuestoInven.setName("jPanelCamposOcultosDetalleImpuestoInven"); 

        this.jPanelAccionesDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleImpuestoInven.setToolTipText("Acciones");
        this.jPanelAccionesDetalleImpuestoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleImpuestoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleImpuestoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleImpuestoInven.setText("Nuevo");
		this.jButtonModificarDetalleImpuestoInven.setText("Editar");
        this.jButtonActualizarDetalleImpuestoInven.setText("Actualizar");
        this.jButtonEliminarDetalleImpuestoInven.setText("Eliminar");
        this.jButtonCancelarDetalleImpuestoInven.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleImpuestoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.setText("Guardar");
		this.jButtonCerrarDetalleImpuestoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleImpuestoInven,"nuevo_button","Nuevo",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleImpuestoInven,"modificar_button","Editar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleImpuestoInven,"actualizar_button","Actualizar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleImpuestoInven,"eliminar_button","Eliminar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleImpuestoInven,"cancelar_button","Cancelar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleImpuestoInven,"guardarcambios_button","Guardar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleImpuestoInven,"guardarcambiostabla_button","Guardar",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleImpuestoInven,"cerrar_button","Salir",this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleImpuestoInven.setToolTipText("Nuevo"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleImpuestoInven.setToolTipText("Editar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleImpuestoInven.setToolTipText("Actualizar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleImpuestoInven.setToolTipText("Eliminar)"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleImpuestoInven.setToolTipText("Cancelar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleImpuestoInven.setToolTipText("Guardar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.setToolTipText("Guardar"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleImpuestoInven.setToolTipText("Salir"+" "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleImpuestoInven";
		inputMap = this.jButtonNuevoDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleImpuestoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleImpuestoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleImpuestoInven";
		inputMap = this.jButtonActualizarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleImpuestoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleImpuestoInven";
		inputMap = this.jButtonEliminarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleImpuestoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleImpuestoInven";
		inputMap = this.jButtonCancelarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleImpuestoInven"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleImpuestoInven";
		inputMap = this.jButtonCerrarDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleImpuestoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleImpuestoInven";
		inputMap = this.jButtonGuardarCambiosTablaDetalleImpuestoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleImpuestoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleImpuestoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleImpuestoInven.setToolTipText("Nuevo DetalleImpuestoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven.setToolTipText("Sin Cerrar Ventana DetalleImpuestoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleImpuestoInven.setText("Accion");
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleImpuestoInven = new JLabelMe();
		
		this.jLabelAccionesDetalleImpuestoInven.setText("Acciones");		
		this.jLabelAccionesDetalleImpuestoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleImpuestoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleImpuestoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleImpuestoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleImpuestoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleImpuestoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleImpuestoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleImpuestoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleImpuestoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleImpuestoInven = new GridBagLayout();
		
		this.jPanelCamposDetalleImpuestoInven.setLayout(gridaBagLayoutCamposDetalleImpuestoInven);
		this.jPanelCamposOcultosDetalleImpuestoInven.setLayout(gridaBagLayoutCamposOcultosDetalleImpuestoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleImpuestoInven.add(jLabelIdDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleImpuestoInven.add(jLabelidDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleImpuestoInven.add(jLabelid_empresaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleImpuestoInven.add(jButtonid_empresaDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 3;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleImpuestoInven.add(jButtonid_empresaDetalleImpuestoInvenUpdate, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleImpuestoInven.add(jComboBoxid_empresaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleImpuestoInven.add(jLabelid_sucursalDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleImpuestoInven.add(jButtonid_sucursalDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 3;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleImpuestoInven.add(jButtonid_sucursalDetalleImpuestoInvenUpdate, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleImpuestoInven.add(jComboBoxid_sucursalDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleImpuestoInven.add(jLabelid_bodegaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleImpuestoInven.add(jButtonid_bodegaDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 3;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleImpuestoInven.add(jButtonid_bodegaDetalleImpuestoInvenUpdate, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleImpuestoInven.add(jComboBoxid_bodegaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleImpuestoInven.add(jLabelid_productoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleImpuestoInven.add(jButtonid_productoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 3;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleImpuestoInven.add(jButtonid_productoDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 4;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleImpuestoInven.add(jButtonid_productoDetalleImpuestoInvenUpdate, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleImpuestoInven.add(jComboBoxid_productoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_impuesto_invenDetalleImpuestoInven.add(jLabelid_impuesto_invenDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_impuesto_invenDetalleImpuestoInven.add(jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 3;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_impuesto_invenDetalleImpuestoInven.add(jButtonid_impuesto_invenDetalleImpuestoInvenUpdate, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_impuesto_invenDetalleImpuestoInven.add(jComboBoxid_impuesto_invenDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDetalleImpuestoInven.add(jLabelporcentajeDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDetalleImpuestoInven.add(jButtonporcentajeDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDetalleImpuestoInven.add(jTextFieldporcentajeDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetalleImpuestoInven.add(jLabelvalorDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetalleImpuestoInven.add(jButtonvalorDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetalleImpuestoInven.add(jTextFieldvalorDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleImpuestoInven.add(jLabeldescripcionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		//this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 2;
		this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
		this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleImpuestoInven.add(jButtondescripcionDetalleImpuestoInvenBusqueda, this.gridBagConstraintsDetalleImpuestoInven);
	}

	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = 1;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleImpuestoInven.add(jTextFielddescripcionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPanelidDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPanelid_bodegaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPanelid_productoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPanelid_impuesto_invenDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPanelporcentajeDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPanelvalorDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleImpuestoInven.add(this.jPaneldescripcionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposDetalleImpuestoInven % 1==0) {
		iXPanelCamposDetalleImpuestoInven=0;
		iYPanelCamposDetalleImpuestoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposOcultosDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposOcultosDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleImpuestoInven.add(this.jPanelid_empresaDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposOcultosDetalleImpuestoInven % 1==0) {
		iXPanelCamposOcultosDetalleImpuestoInven=0;
		iYPanelCamposOcultosDetalleImpuestoInven++;
	}
	this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleImpuestoInven.gridy = iYPanelCamposOcultosDetalleImpuestoInven;
	this.gridBagConstraintsDetalleImpuestoInven.gridx = iXPanelCamposOcultosDetalleImpuestoInven++;
	this.gridBagConstraintsDetalleImpuestoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleImpuestoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleImpuestoInven.add(this.jPanelid_sucursalDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);



	if(iXPanelCamposOcultosDetalleImpuestoInven % 1==0) {
		iXPanelCamposOcultosDetalleImpuestoInven=0;
		iYPanelCamposOcultosDetalleImpuestoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleImpuestoInven= new GridBagLayout();
		this.jPanelAccionesDetalleImpuestoInven.setLayout(gridaBagLayoutAccionesDetalleImpuestoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleImpuestoInven= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleImpuestoInven.setLayout(gridaBagLayoutAccionesFormularioDetalleImpuestoInven);
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleImpuestoInven.add(this.jComboBoxTiposAccionesFormularioDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleImpuestoInven.add(this.jCheckBoxPostAccionNuevoDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleImpuestoInven.add(this.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleImpuestoInven.add(this.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleImpuestoInven.add(this.jButtonModificarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);							

		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;
		this.gridBagConstraintsDetalleImpuestoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleImpuestoInven.add(this.jButtonEliminarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleImpuestoInven.add(this.jButtonActualizarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);


		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleImpuestoInven.add(this.jButtonGuardarCambiosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);	
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = 0;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleImpuestoInven.add(this.jButtonCancelarDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleImpuestoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleImpuestoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();						
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;		
			//this.gridBagConstraintsDetalleImpuestoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleImpuestoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleImpuestoInven.gridx =0;
		this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleImpuestoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleImpuestoInven = new DetalleImpuestoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Impuesto Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Impuesto Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Impuesto Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleImpuestoInvenModel detalleimpuestoinvenModel=new DetalleImpuestoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleImpuestoInvenModel.DetalleImpuestoInvenFocusTraversalPolicy detalleimpuestoinvenFocusTraversalPolicy = detalleimpuestoinvenModel.new DetalleImpuestoInvenFocusTraversalPolicy(this);
			
			//detalleimpuestoinvenFocusTraversalPolicy.setdetalleimpuestoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleimpuestoinvenModel);
			
			
			this.jContentPaneDetalleDetalleImpuestoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleImpuestoInven = new GridBagLayout();	
			this.jContentPaneDetalleDetalleImpuestoInven.setLayout(gridaBagLayoutDetalleDetalleImpuestoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleImpuestoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
				this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleImpuestoInven.add(jTtoolBarDetalleDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleImpuestoInven=   new JScrollPane(jContentPaneDetalleDetalleImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleImpuestoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	        
			this.jContentPaneDetalleDetalleImpuestoInven.add(jPanelCamposDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);
			
			
			
			
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
						&& detalleimpuestoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleImpuestoInven= new GridBagConstraints();
						this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
						this.jContentPaneDetalleDetalleImpuestoInven.add(this.jTabbedPaneRelacionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleImpuestoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleImpuestoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
					this.gridBagConstraintsDetalleImpuestoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleImpuestoInven.add(jPanelCamposOcultosDetalleImpuestoInven, gridBagConstraintsDetalleImpuestoInven);
				
					this.jPanelCamposOcultosDetalleImpuestoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	        this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleImpuestoInven.add(this.jPanelAccionesFormularioDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);							
			
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
	        this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleImpuestoInven.add(this.jPanelAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleImpuestoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleImpuestoInven=   new JScrollPane(this.jPanelCamposDetalleImpuestoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleImpuestoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleImpuestoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleImpuestoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
			this.gridBagConstraintsDetalleImpuestoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleImpuestoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleImpuestoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);			
			
			this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
			this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
			
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		
			
		this.gridBagConstraintsDetalleImpuestoInven = new GridBagConstraints();
		this.gridBagConstraintsDetalleImpuestoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleImpuestoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleImpuestoInven, this.gridBagConstraintsDetalleImpuestoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleImpuestoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleImpuestoInven;
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
