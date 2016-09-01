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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.RequisicionConstantesFunciones;

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
public class RequisicionDetalleFormJInternalFrame extends RequisicionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRequisicion;
	
	protected JMenuBar jmenuBarDetalleRequisicion;
	
	protected JMenu jmenuDetalleRequisicion;
	protected JMenu jmenuDetalleArchivoRequisicion;
	protected JMenu jmenuDetalleAccionesRequisicion;
	protected JMenu jmenuDetalleDatosRequisicion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRequisicion;	
	protected GridBagConstraints gridBagConstraintsRequisicion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RequisicionBeanSwingJInternalFrameAdditional jInternalFrameDetalleRequisicion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoRequisicionBeanSwingJInternalFrame tiporequisicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporequisicion="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EstadoRequisicionBeanSwingJInternalFrame estadorequisicionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadorequisicion="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected BodegaBeanSwingJInternalFrame bodegasolicitarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegasolicitar="";

	protected BodegaBeanSwingJInternalFrame bodegasolicitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegasolicita="";
	
	public RequisicionSessionBean requisicionSessionBean;
	
	

	public DetalleRequisicionBeanSwingJInternalFrame detallerequisicionBeanSwingJInternalFrame=null;
	public DetalleRequisicionBeanSwingJInternalFrame detallerequisicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleRequisicion=false;
	public DetalleRequisicionSessionBean detallerequisicionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoRequisicionSessionBean tiporequisicionSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EstadoRequisicionSessionBean estadorequisicionSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public BodegaSessionBean bodegasolicitarSessionBean;
	public BodegaSessionBean bodegasolicitaSessionBean;	
	
	public RequisicionLogic requisicionLogic;
	
	public JScrollPane jScrollPanelDatosRequisicion;
	public JScrollPane jScrollPanelDatosEdicionRequisicion;
	public JScrollPane jScrollPanelDatosGeneralRequisicion;
	
	protected JPanel jPanelCamposRequisicion;    
	protected JPanel jPanelCamposOcultosRequisicion;    	
	protected JPanel jPanelAccionesRequisicion;
	protected JPanel jPanelAccionesFormularioRequisicion;
    
	
	
	protected Integer iXPanelCamposRequisicion=0;
	protected Integer iYPanelCamposRequisicion=0;
	
	protected Integer iXPanelCamposOcultosRequisicion=0;
	protected Integer iYPanelCamposOcultosRequisicion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRequisicion;
	public JButton jButtonModificarRequisicion;
	public JButton jButtonActualizarRequisicion;
    public JButton jButtonEliminarRequisicion;
	public JButton jButtonCancelarRequisicion;
    public JButton jButtonGuardarCambiosRequisicion;
	public JButton jButtonGuardarCambiosTablaRequisicion;
	protected JButton jButtonCerrarRequisicion;
	
	
	protected JButton jButtonProcesarInformacionRequisicion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRequisicion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRequisicion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRequisicion;
	protected JButton jButtonModificarToolBarRequisicion;
	protected JButton jButtonActualizarToolBarRequisicion;
    protected JButton jButtonEliminarToolBarRequisicion;
	protected JButton jButtonCancelarToolBarRequisicion;
    protected JButton jButtonGuardarCambiosToolBarRequisicion;
	protected JButton jButtonGuardarCambiosTablaToolBarRequisicion;
	protected JButton jButtonMostrarOcultarTablaToolBarRequisicion;
	protected JButton jButtonCerrarToolBarRequisicion;
	
	protected JButton jButtonProcesarInformacionToolBarRequisicion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRequisicion;
	protected JMenuItem jMenuItemModificarRequisicion;
	protected JMenuItem jMenuItemActualizarRequisicion;
    protected JMenuItem jMenuItemEliminarRequisicion;
	protected JMenuItem jMenuItemCancelarRequisicion;
    protected JMenuItem jMenuItemGuardarCambiosRequisicion;
	protected JMenuItem jMenuItemGuardarCambiosTablaRequisicion;
	protected JMenuItem jMenuItemCerrarRequisicion;
	protected JMenuItem jMenuItemDetalleCerrarRequisicion;
	protected JMenuItem jMenuItemDetalleMostarOcultarRequisicion;
	
	protected JMenuItem jMenuItemProcesarInformacionRequisicion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRequisicion;
	protected JMenuItem jMenuItemMostrarOcultarRequisicion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRequisicion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRequisicion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRequisicion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRequisicion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRequisicion;
	public JLabel jLabelIdRequisicion;
	public JLabel jLabelidRequisicion;
	public JButton jButtonidRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialRequisicion;
	public JLabel jLabelnumero_secuencialRequisicion;
	public JTextField jTextFieldnumero_secuencialRequisicion;
	public JButton jButtonnumero_secuencialRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelfechaRequisicion;
	public JLabel jLabelfechaRequisicion;
	//public JFormattedTextField jDateChooserfechaRequisicion;

	public JDateChooser jDateChooserfechaRequisicion;
	public JButton jButtonfechaRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelhoraRequisicion;
	public JLabel jLabelhoraRequisicion;
	public JSpinner jSpinnerhoraRequisicion= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraRequisicionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionRequisicion;
	public JLabel jLabeldescripcionRequisicion;
	public JTextArea jTextAreadescripcionRequisicion;
	public JScrollPane jscrollPanedescripcionRequisicion;
	public JButton jButtondescripcionRequisicionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRequisicion;
	public JLabel jLabelid_empresaRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRequisicion;
	public JButton jButtonid_empresaRequisicion= new JButtonMe();
	public JButton jButtonid_empresaRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_empresaRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRequisicion;
	public JLabel jLabelid_sucursalRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRequisicion;
	public JButton jButtonid_sucursalRequisicion= new JButtonMe();
	public JButton jButtonid_sucursalRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_requisicionRequisicion;
	public JLabel jLabelid_tipo_requisicionRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_requisicionRequisicion;
	public JButton jButtonid_tipo_requisicionRequisicion= new JButtonMe();
	public JButton jButtonid_tipo_requisicionRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_tipo_requisicionRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoRequisicion;
	public JLabel jLabelid_empleadoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoRequisicion;
	public JButton jButtonid_empleadoRequisicion= new JButtonMe();
	public JButton jButtonid_empleadoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_empleadoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_requisicionRequisicion;
	public JLabel jLabelid_estado_requisicionRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_requisicionRequisicion;
	public JButton jButtonid_estado_requisicionRequisicion= new JButtonMe();
	public JButton jButtonid_estado_requisicionRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_estado_requisicionRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoRequisicion;
	public JLabel jLabelid_formatoRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoRequisicion;
	public JButton jButtonid_formatoRequisicion= new JButtonMe();
	public JButton jButtonid_formatoRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_formatoRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_solicitarRequisicion;
	public JLabel jLabelid_bodega_solicitarRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_solicitarRequisicion;
	public JButton jButtonid_bodega_solicitarRequisicion= new JButtonMe();
	public JButton jButtonid_bodega_solicitarRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_bodega_solicitarRequisicionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_solicitaRequisicion;
	public JLabel jLabelid_bodega_solicitaRequisicion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_solicitaRequisicion;
	public JButton jButtonid_bodega_solicitaRequisicion= new JButtonMe();
	public JButton jButtonid_bodega_solicitaRequisicionUpdate= new JButtonMe();
	public JButton jButtonid_bodega_solicitaRequisicionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRequisicion;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RequisicionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRequisicion=new JPanel();
				this.jPanelAccionesFormularioRequisicion=new JPanel();
				this.jmenuBarDetalleRequisicion=new JMenuBar();
				this.jTtoolBarDetalleRequisicion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RequisicionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Requisicion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
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
	
	
	public JButton getjButtonActualizarToolBarRequisicion() {
		return this.jButtonActualizarToolBarRequisicion;
	}
	
	public JButton getjButtonEliminarToolBarRequisicion() {
		return this.jButtonEliminarToolBarRequisicion;
	}
	
	public JButton getjButtonCancelarToolBarRequisicion() {
		return this.jButtonCancelarToolBarRequisicion;
	}		
	
	public JButton getjButtonProcesarInformacionRequisicion() {
		return this.jButtonProcesarInformacionRequisicion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRequisicion)	{
		this.jButtonProcesarInformacionRequisicion = jButtonProcesarInformacionRequisicion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRequisicion() {
		return this.jComboBoxTiposAccionesRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRequisicion(
			JComboBox jComboBoxTiposRelacionesRequisicion) {
		this.jComboBoxTiposRelacionesRequisicion = jComboBoxTiposRelacionesRequisicion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRequisicion(
			JComboBox jComboBoxTiposAccionesRequisicion) {
		this.jComboBoxTiposAccionesRequisicion = jComboBoxTiposAccionesRequisicion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRequisicion() {
		return this.jComboBoxTiposAccionesFormularioRequisicion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRequisicion(
			JComboBox jComboBoxTiposAccionesFormularioRequisicion) {
		this.jComboBoxTiposAccionesFormularioRequisicion = jComboBoxTiposAccionesFormularioRequisicion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.requisicionSessionBean=new RequisicionSessionBean();
		
		this.requisicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.requisicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.requisicionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RequisicionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Requisicion MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
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
	
		RequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRequisicion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRequisicion=new JButtonMe();
				this.jButtonModificarToolBarRequisicion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRequisicion,this.jTtoolBarDetalleRequisicion,
							"actualizar","actualizar","Actualizar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRequisicion,this.jTtoolBarDetalleRequisicion,
							"eliminar","eliminar","Eliminar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRequisicion,this.jTtoolBarDetalleRequisicion,
							"cancelar","cancelar","Cancelar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRequisicion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRequisicion,this.jTtoolBarDetalleRequisicion,
							"guardarcambios","guardarcambios","Guardar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRequisicion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRequisicion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRequisicion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRequisicion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRequisicion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRequisicion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRequisicion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRequisicion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRequisicion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRequisicion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRequisicion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRequisicion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRequisicion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRequisicion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRequisicion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRequisicion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRequisicion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRequisicion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRequisicion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRequisicion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRequisicion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRequisicion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRequisicion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRequisicion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRequisicion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRequisicion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRequisicion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRequisicion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRequisicion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRequisicion.add(this.jMenuItemDetalleCerrarRequisicion);
		
		this.jmenuDetalleAccionesRequisicion.add(this.jMenuItemActualizarRequisicion);
		this.jmenuDetalleAccionesRequisicion.add(this.jMenuItemEliminarRequisicion);
		this.jmenuDetalleAccionesRequisicion.add(this.jMenuItemCancelarRequisicion);		
		
		//this.jmenuDetalleDatosRequisicion.add(this.jMenuItemDetalleAbrirOrderByRequisicion);				
		this.jmenuDetalleDatosRequisicion.add(this.jMenuItemDetalleMostarOcultarRequisicion);				
				
		//this.jmenuDetalleAccionesRequisicion.add(this.jMenuItemGuardarCambiosRequisicion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRequisicion.add(this.jmenuDetalleArchivoRequisicion);		
		this.jmenuBarDetalleRequisicion.add(this.jmenuDetalleAccionesRequisicion);		
		this.jmenuBarDetalleRequisicion.add(this.jmenuDetalleDatosRequisicion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRequisicion.add(this.jmenuDetalleRequisicion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRequisicion);				
	}
	
	
	public void inicializarElementosCamposRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRequisicion = new JLabelMe();
		jLabelIdRequisicion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRequisicion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRequisicion= new GridBagLayout();

		this.jPanelidRequisicion.setLayout(this.gridaBagLayoutRequisicion);

		jLabelidRequisicion = new JLabel();
		jLabelidRequisicion.setText("Id");

		jLabelidRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialRequisicion = new JLabelMe();
		this.jLabelnumero_secuencialRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialRequisicion.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelnumero_secuencialRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jTextFieldnumero_secuencialRequisicion= new JTextFieldMe();

		jTextFieldnumero_secuencialRequisicion.setEnabled(false);
		jTextFieldnumero_secuencialRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialRequisicionBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialRequisicionBusqueda.setText("U");
		this.jButtonnumero_secuencialRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialRequisicionBusqueda.setVisible(false);		}


					
		this.jLabelfechaRequisicion = new JLabelMe();
		this.jLabelfechaRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaRequisicion.setToolTipText("Fecha");
		this.jLabelfechaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelfechaRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		//jFormattedTextFieldfechaRequisicion= new JFormattedTextFieldMe();

		jDateChooserfechaRequisicion= new JDateChooser();
		jDateChooserfechaRequisicion.setEnabled(false);
		jDateChooserfechaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaRequisicion.setDate(new Date());
		jDateChooserfechaRequisicion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaRequisicion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaRequisicionBusqueda= new JButtonMe();
		this.jButtonfechaRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaRequisicionBusqueda.setText("U");
		this.jButtonfechaRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaRequisicionBusqueda.setVisible(false);		}


					
		this.jLabelhoraRequisicion = new JLabelMe();
		this.jLabelhoraRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraRequisicion.setToolTipText("Hora");
		this.jLabelhoraRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelhoraRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		//jFormattedTextFieldhoraRequisicion= new JFormattedTextFieldMe();

		jSpinnerhoraRequisicion= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraRequisicion.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraRequisicion = new JSpinner.DateEditor(jSpinnerhoraRequisicion, "HH:mm:ss");

		jSpinnerhoraRequisicion.setEditor(timeEditorhoraRequisicion);

		jSpinnerhoraRequisicion.setValue(new Date());

		jSpinnerhoraRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraRequisicion.setValue(new Date());
		//jSpinnerhoraRequisicion.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraRequisicion.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraRequisicionBusqueda= new JButtonMe();
		this.jButtonhoraRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraRequisicionBusqueda.setText("U");
		this.jButtonhoraRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraRequisicionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionRequisicion = new JLabelMe();
		this.jLabeldescripcionRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionRequisicion.setToolTipText("Descripcion");
		this.jLabeldescripcionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPaneldescripcionRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jTextAreadescripcionRequisicion= new JTextAreaMe();
		jTextAreadescripcionRequisicion.setEnabled(false);
		jTextAreadescripcionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRequisicion.setLineWrap(true);
		jTextAreadescripcionRequisicion.setWrapStyleWord(true);
		jTextAreadescripcionRequisicion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionRequisicion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionRequisicion = new JScrollPane(jTextAreadescripcionRequisicion);
		jscrollPanedescripcionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));
		jscrollPanedescripcionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));
		jscrollPanedescripcionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));

		this.jButtondescripcionRequisicionBusqueda= new JButtonMe();
		this.jButtondescripcionRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionRequisicionBusqueda.setText("U");
		this.jButtondescripcionRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionRequisicionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRequisicion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRequisicion = new JLabelMe();
		this.jLabelid_empresaRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRequisicion.setToolTipText("Empresa");
		this.jLabelid_empresaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_empresaRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_empresaRequisicion= new JComboBoxMe();
		jComboBoxid_empresaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRequisicion.setEnabled(false);

		this.jButtonid_empresaRequisicion= new JButtonMe();
		this.jButtonid_empresaRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRequisicion.setText("Buscar");
		this.jButtonid_empresaRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRequisicion"));

		this.jButtonid_empresaRequisicionBusqueda= new JButtonMe();
		this.jButtonid_empresaRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRequisicionBusqueda.setText("U");
		this.jButtonid_empresaRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_empresaRequisicionUpdate= new JButtonMe();
		this.jButtonid_empresaRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRequisicionUpdate.setText("U");
		this.jButtonid_empresaRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRequisicionUpdate"));



					
		this.jLabelid_sucursalRequisicion = new JLabelMe();
		this.jLabelid_sucursalRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRequisicion.setToolTipText("Sucursal");
		this.jLabelid_sucursalRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_sucursalRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_sucursalRequisicion= new JComboBoxMe();
		jComboBoxid_sucursalRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRequisicion.setEnabled(false);

		this.jButtonid_sucursalRequisicion= new JButtonMe();
		this.jButtonid_sucursalRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRequisicion.setText("Buscar");
		this.jButtonid_sucursalRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRequisicion"));

		this.jButtonid_sucursalRequisicionBusqueda= new JButtonMe();
		this.jButtonid_sucursalRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRequisicionBusqueda.setText("U");
		this.jButtonid_sucursalRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRequisicionUpdate= new JButtonMe();
		this.jButtonid_sucursalRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRequisicionUpdate.setText("U");
		this.jButtonid_sucursalRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRequisicionUpdate"));



					
		this.jLabelid_tipo_requisicionRequisicion = new JLabelMe();
		this.jLabelid_tipo_requisicionRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION+" : *");
		this.jLabelid_tipo_requisicionRequisicion.setToolTipText("Tipo");
		this.jLabelid_tipo_requisicionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_requisicionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_requisicionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_requisicionRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_requisicionRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_requisicionRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDTIPOREQUISICION);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_tipo_requisicionRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_tipo_requisicionRequisicion= new JComboBoxMe();
		jComboBoxid_tipo_requisicionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_requisicionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_requisicionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_requisicionRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_requisicionRequisicion= new JButtonMe();
		this.jButtonid_tipo_requisicionRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_requisicionRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_requisicionRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_requisicionRequisicion.setText("Buscar");
		this.jButtonid_tipo_requisicionRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_requisicionRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_requisicionRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_requisicionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_requisicionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_requisicionRequisicion"));

		this.jButtonid_tipo_requisicionRequisicionBusqueda= new JButtonMe();
		this.jButtonid_tipo_requisicionRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_requisicionRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_requisicionRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_requisicionRequisicionBusqueda.setText("U");
		this.jButtonid_tipo_requisicionRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_requisicionRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_requisicionRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_requisicionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_requisicionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_requisicionRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_requisicionRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_tipo_requisicionRequisicionUpdate= new JButtonMe();
		this.jButtonid_tipo_requisicionRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_requisicionRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_requisicionRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_requisicionRequisicionUpdate.setText("U");
		this.jButtonid_tipo_requisicionRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_requisicionRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_requisicionRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_requisicionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_requisicionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_requisicionRequisicionUpdate"));



					
		this.jLabelid_empleadoRequisicion = new JLabelMe();
		this.jLabelid_empleadoRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoRequisicion.setToolTipText("Empleado");
		this.jLabelid_empleadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_empleadoRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_empleadoRequisicion= new JComboBoxMe();
		jComboBoxid_empleadoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoRequisicion= new JButtonMe();
		this.jButtonid_empleadoRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRequisicion.setText("Buscar");
		this.jButtonid_empleadoRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRequisicion"));

		this.jButtonid_empleadoRequisicionBusqueda= new JButtonMe();
		this.jButtonid_empleadoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRequisicionBusqueda.setText("U");
		this.jButtonid_empleadoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_empleadoRequisicionUpdate= new JButtonMe();
		this.jButtonid_empleadoRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRequisicionUpdate.setText("U");
		this.jButtonid_empleadoRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRequisicionUpdate"));



					
		this.jLabelid_estado_requisicionRequisicion = new JLabelMe();
		this.jLabelid_estado_requisicionRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION+" : *");
		this.jLabelid_estado_requisicionRequisicion.setToolTipText("Estado");
		this.jLabelid_estado_requisicionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_requisicionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_requisicionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_requisicionRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_requisicionRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_requisicionRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDESTADOREQUISICION);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_estado_requisicionRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_estado_requisicionRequisicion= new JComboBoxMe();
		jComboBoxid_estado_requisicionRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_requisicionRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_requisicionRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_requisicionRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_requisicionRequisicion= new JButtonMe();
		this.jButtonid_estado_requisicionRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_requisicionRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_requisicionRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_requisicionRequisicion.setText("Buscar");
		this.jButtonid_estado_requisicionRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_requisicionRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_requisicionRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_requisicionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_requisicionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_requisicionRequisicion"));

		this.jButtonid_estado_requisicionRequisicionBusqueda= new JButtonMe();
		this.jButtonid_estado_requisicionRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicionRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicionRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_requisicionRequisicionBusqueda.setText("U");
		this.jButtonid_estado_requisicionRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_requisicionRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_requisicionRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_requisicionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_requisicionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_requisicionRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_requisicionRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_estado_requisicionRequisicionUpdate= new JButtonMe();
		this.jButtonid_estado_requisicionRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicionRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicionRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_requisicionRequisicionUpdate.setText("U");
		this.jButtonid_estado_requisicionRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_requisicionRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_requisicionRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_requisicionRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_requisicionRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_requisicionRequisicionUpdate"));



					
		this.jLabelid_formatoRequisicion = new JLabelMe();
		this.jLabelid_formatoRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoRequisicion.setToolTipText("Formato");
		this.jLabelid_formatoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_formatoRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_formatoRequisicion= new JComboBoxMe();
		jComboBoxid_formatoRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoRequisicion= new JButtonMe();
		this.jButtonid_formatoRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoRequisicion.setText("Buscar");
		this.jButtonid_formatoRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoRequisicion"));

		this.jButtonid_formatoRequisicionBusqueda= new JButtonMe();
		this.jButtonid_formatoRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoRequisicionBusqueda.setText("U");
		this.jButtonid_formatoRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_formatoRequisicionUpdate= new JButtonMe();
		this.jButtonid_formatoRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoRequisicionUpdate.setText("U");
		this.jButtonid_formatoRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoRequisicionUpdate"));



					
		this.jLabelid_bodega_solicitarRequisicion = new JLabelMe();
		this.jLabelid_bodega_solicitarRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR+" : *");
		this.jLabelid_bodega_solicitarRequisicion.setToolTipText("Bode Solicitar");
		this.jLabelid_bodega_solicitarRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_solicitarRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_solicitarRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_solicitarRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_solicitarRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_solicitarRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITAR);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_bodega_solicitarRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_bodega_solicitarRequisicion= new JComboBoxMe();
		jComboBoxid_bodega_solicitarRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitarRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitarRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_solicitarRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_solicitarRequisicion= new JButtonMe();
		this.jButtonid_bodega_solicitarRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_solicitarRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_solicitarRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_solicitarRequisicion.setText("Buscar");
		this.jButtonid_bodega_solicitarRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_solicitarRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_solicitarRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_solicitarRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_solicitarRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_solicitarRequisicion"));

		this.jButtonid_bodega_solicitarRequisicionBusqueda= new JButtonMe();
		this.jButtonid_bodega_solicitarRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitarRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitarRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_solicitarRequisicionBusqueda.setText("U");
		this.jButtonid_bodega_solicitarRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_solicitarRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_solicitarRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_solicitarRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_solicitarRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_solicitarRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_solicitarRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_bodega_solicitarRequisicionUpdate= new JButtonMe();
		this.jButtonid_bodega_solicitarRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitarRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitarRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_solicitarRequisicionUpdate.setText("U");
		this.jButtonid_bodega_solicitarRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_solicitarRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_solicitarRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_solicitarRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_solicitarRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_solicitarRequisicionUpdate"));



					
		this.jLabelid_bodega_solicitaRequisicion = new JLabelMe();
		this.jLabelid_bodega_solicitaRequisicion.setText(""+RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA+" : *");
		this.jLabelid_bodega_solicitaRequisicion.setToolTipText("Bode Solicita");
		this.jLabelid_bodega_solicitaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_solicitaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_solicitaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_solicitaRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_solicitaRequisicion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_solicitaRequisicion.setToolTipText(RequisicionConstantesFunciones.LABEL_IDBODEGASOLICITA);
		this.gridaBagLayoutRequisicion = new GridBagLayout();
		this.jPanelid_bodega_solicitaRequisicion.setLayout(this.gridaBagLayoutRequisicion);


		jComboBoxid_bodega_solicitaRequisicion= new JComboBoxMe();
		jComboBoxid_bodega_solicitaRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitaRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_solicitaRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_solicitaRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_solicitaRequisicion= new JButtonMe();
		this.jButtonid_bodega_solicitaRequisicion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_solicitaRequisicion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_solicitaRequisicion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_solicitaRequisicion.setText("Buscar");
		this.jButtonid_bodega_solicitaRequisicion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_solicitaRequisicion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_solicitaRequisicion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_solicitaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_solicitaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_solicitaRequisicion"));

		this.jButtonid_bodega_solicitaRequisicionBusqueda= new JButtonMe();
		this.jButtonid_bodega_solicitaRequisicionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitaRequisicionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitaRequisicionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_solicitaRequisicionBusqueda.setText("U");
		this.jButtonid_bodega_solicitaRequisicionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_solicitaRequisicionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_solicitaRequisicionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_solicitaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_solicitaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_solicitaRequisicionBusqueda"));

		if(this.requisicionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_solicitaRequisicionBusqueda.setVisible(false);		}

		this.jButtonid_bodega_solicitaRequisicionUpdate= new JButtonMe();
		this.jButtonid_bodega_solicitaRequisicionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitaRequisicionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_solicitaRequisicionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_solicitaRequisicionUpdate.setText("U");
		this.jButtonid_bodega_solicitaRequisicionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_solicitaRequisicionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_solicitaRequisicionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_solicitaRequisicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_solicitaRequisicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_solicitaRequisicionUpdate"));



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
		
		//INDEPENDIENTE DEL PARAMETRO TIENE LA FUNCIONALIDAD DE GUARDAR RELACIONES
		this.conFuncionalidadRelaciones=true;	
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleRequisicion = new RequisicionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Requisicion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRequisicion= new GridBagLayout();
		

		
		String sToolTipRequisicion="";
		sToolTipRequisicion=RequisicionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRequisicion+="(Inventario.Requisicion)";
		}
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			sToolTipRequisicion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRequisicion = new JButtonMe();
		this.jButtonModificarRequisicion = new JButtonMe();
        this.jButtonActualizarRequisicion = new JButtonMe();
        this.jButtonEliminarRequisicion = new JButtonMe();
        this.jButtonCancelarRequisicion = new JButtonMe();
        this.jButtonGuardarCambiosRequisicion = new JButtonMe();
		this.jButtonGuardarCambiosTablaRequisicion = new JButtonMe();
		this.jButtonCerrarRequisicion = new JButtonMe();
		
		this.jScrollPanelDatosRequisicion = new JScrollPane();   
        this.jScrollPanelDatosEdicionRequisicion = new JScrollPane();
		this.jScrollPanelDatosGeneralRequisicion = new JScrollPane();
				
		
		
		this.jPanelCamposRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Requisicion";
		
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisiciones" + this.sPath));
		} else {
			this.jScrollPanelDatosRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposRequisicion.setName("jPanelCamposRequisicion"); 

		this.jPanelCamposOcultosRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRequisicion.setName("jPanelCamposOcultosRequisicion"); 

        this.jPanelAccionesRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesRequisicion.setName("Acciones"); 

		this.jPanelAccionesFormularioRequisicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRequisicion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRequisicion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRequisicion.setText("Nuevo");
		this.jButtonModificarRequisicion.setText("Editar");
        this.jButtonActualizarRequisicion.setText("Actualizar");
        this.jButtonEliminarRequisicion.setText("Eliminar");
        this.jButtonCancelarRequisicion.setText("Cancelar");
        this.jButtonGuardarCambiosRequisicion.setText("Guardar");
		this.jButtonGuardarCambiosTablaRequisicion.setText("Guardar");
		this.jButtonCerrarRequisicion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRequisicion,"nuevo_button","Nuevo",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRequisicion,"modificar_button","Editar",this.requisicionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRequisicion,"actualizar_button","Actualizar",this.requisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRequisicion,"eliminar_button","Eliminar",this.requisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRequisicion,"cancelar_button","Cancelar",this.requisicionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRequisicion,"guardarcambios_button","Guardar",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRequisicion,"guardarcambiostabla_button","Guardar",this.requisicionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRequisicion,"cerrar_button","Salir",this.requisicionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRequisicion.setToolTipText("Nuevo"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRequisicion.setToolTipText("Editar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRequisicion.setToolTipText("Actualizar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRequisicion.setToolTipText("Eliminar)"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRequisicion.setToolTipText("Cancelar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRequisicion.setToolTipText("Guardar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRequisicion.setToolTipText("Guardar"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRequisicion.setToolTipText("Salir"+" "+RequisicionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRequisicion";
		inputMap = this.jButtonNuevoRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRequisicion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRequisicion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRequisicion";
		inputMap = this.jButtonActualizarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRequisicion"));
		
		//ELIMINAR
		sMapKey = "EliminarRequisicion";
		inputMap = this.jButtonEliminarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRequisicion"));
		
		//CANCELAR	
		sMapKey = "CancelarRequisicion";
		inputMap = this.jButtonCancelarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRequisicion"));
		
		//CERRAR		
		sMapKey = "CerrarRequisicion";
		inputMap = this.jButtonCerrarRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRequisicion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRequisicion";
		inputMap = this.jButtonGuardarCambiosTablaRequisicion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRequisicion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRequisicion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRequisicion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRequisicion.setToolTipText("Nuevo Requisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRequisicion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRequisicion.setToolTipText("Sin Cerrar Ventana Requisicion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRequisicion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRequisicion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRequisicion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRequisicion.setText("Accion");
		this.jComboBoxTiposAccionesRequisicion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRequisicion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRequisicion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRequisicion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRequisicion = new JLabelMe();
		
		this.jLabelAccionesRequisicion.setText("Acciones");		
		this.jLabelAccionesRequisicion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRequisicion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRequisicion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRequisicion=new JTabbedPane();
		this.jTabbedPaneRelacionesRequisicion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRequisicion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRequisicion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRequisicion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRequisicion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRequisicion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRequisicion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRequisicion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRequisicion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRequisicion = new GridBagLayout();
		
		this.jPanelCamposRequisicion.setLayout(gridaBagLayoutCamposRequisicion);
		this.jPanelCamposOcultosRequisicion.setLayout(gridaBagLayoutCamposOcultosRequisicion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidRequisicion.add(jLabelIdRequisicion, this.gridBagConstraintsRequisicion);



	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidRequisicion.add(jLabelidRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaRequisicion.add(jLabelid_empresaRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRequisicion.add(jButtonid_empresaRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRequisicion.add(jButtonid_empresaRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaRequisicion.add(jComboBoxid_empresaRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalRequisicion.add(jLabelid_sucursalRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRequisicion.add(jButtonid_sucursalRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRequisicion.add(jButtonid_sucursalRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalRequisicion.add(jComboBoxid_sucursalRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialRequisicion.add(jLabelnumero_secuencialRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialRequisicion.add(jButtonnumero_secuencialRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialRequisicion.add(jTextFieldnumero_secuencialRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_requisicionRequisicion.add(jLabelid_tipo_requisicionRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_requisicionRequisicion.add(jButtonid_tipo_requisicionRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_requisicionRequisicion.add(jButtonid_tipo_requisicionRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_requisicionRequisicion.add(jComboBoxid_tipo_requisicionRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaRequisicion.add(jLabelfechaRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaRequisicion.add(jButtonfechaRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaRequisicion.add(jDateChooserfechaRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelhoraRequisicion.add(jLabelhoraRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraRequisicion.add(jButtonhoraRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelhoraRequisicion.add(jSpinnerhoraRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoRequisicion.add(jLabelid_empleadoRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRequisicion.add(jButtonid_empleadoRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRequisicion.add(jButtonid_empleadoRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoRequisicion.add(jComboBoxid_empleadoRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_requisicionRequisicion.add(jLabelid_estado_requisicionRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_requisicionRequisicion.add(jButtonid_estado_requisicionRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_requisicionRequisicion.add(jButtonid_estado_requisicionRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_requisicionRequisicion.add(jComboBoxid_estado_requisicionRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoRequisicion.add(jLabelid_formatoRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoRequisicion.add(jButtonid_formatoRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoRequisicion.add(jButtonid_formatoRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoRequisicion.add(jComboBoxid_formatoRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_bodega_solicitarRequisicion.add(jLabelid_bodega_solicitarRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_solicitarRequisicion.add(jButtonid_bodega_solicitarRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_solicitarRequisicion.add(jButtonid_bodega_solicitarRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_bodega_solicitarRequisicion.add(jComboBoxid_bodega_solicitarRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionRequisicion.add(jLabeldescripcionRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionRequisicion.add(jButtondescripcionRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionRequisicion.add(jscrollPanedescripcionRequisicion, this.gridBagConstraintsRequisicion);


	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 0;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_bodega_solicitaRequisicion.add(jLabelid_bodega_solicitaRequisicion, this.gridBagConstraintsRequisicion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 2;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_solicitaRequisicion.add(jButtonid_bodega_solicitaRequisicionBusqueda, this.gridBagConstraintsRequisicion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		//this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = 3;
		this.gridBagConstraintsRequisicion.ipadx = 0;
		this.gridBagConstraintsRequisicion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_solicitaRequisicion.add(jButtonid_bodega_solicitaRequisicionUpdate, this.gridBagConstraintsRequisicion);
	}

	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicion.gridy = 0;
	this.gridBagConstraintsRequisicion.gridx = 1;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_bodega_solicitaRequisicion.add(jComboBoxid_bodega_solicitaRequisicion, this.gridBagConstraintsRequisicion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelidRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelnumero_secuencialRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelid_tipo_requisicionRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelfechaRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelhoraRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelid_empleadoRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelid_estado_requisicionRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelid_formatoRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelid_bodega_solicitarRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsRequisicion.gridwidth = 2;

	this.jPanelCamposRequisicion.add(this.jPaneldescripcionRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	//NUM X EXTRA
	iXPanelCamposRequisicion+=1;
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposRequisicion.add(this.jPanelid_bodega_solicitaRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposRequisicion % 3==0) {
		iXPanelCamposRequisicion=0;
		iYPanelCamposRequisicion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposOcultosRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposOcultosRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRequisicion.add(this.jPanelid_empresaRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposOcultosRequisicion % 3==0) {
		iXPanelCamposOcultosRequisicion=0;
		iYPanelCamposOcultosRequisicion++;
	}
	this.gridBagConstraintsRequisicion = new GridBagConstraints();
	this.gridBagConstraintsRequisicion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicion.gridy = iYPanelCamposOcultosRequisicion;
	this.gridBagConstraintsRequisicion.gridx = iXPanelCamposOcultosRequisicion++;
	this.gridBagConstraintsRequisicion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicion.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosRequisicion.add(this.jPanelid_sucursalRequisicion, this.gridBagConstraintsRequisicion);



	if(iXPanelCamposOcultosRequisicion % 3==0) {
		iXPanelCamposOcultosRequisicion=0;
		iYPanelCamposOcultosRequisicion++;
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
			
		GridBagLayout gridaBagLayoutAccionesRequisicion= new GridBagLayout();
		this.jPanelAccionesRequisicion.setLayout(gridaBagLayoutAccionesRequisicion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRequisicion= new GridBagLayout();
		this.jPanelAccionesFormularioRequisicion.setLayout(gridaBagLayoutAccionesFormularioRequisicion);
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRequisicion.add(this.jComboBoxTiposAccionesFormularioRequisicion, this.gridBagConstraintsRequisicion);

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRequisicion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRequisicion.add(this.jCheckBoxPostAccionNuevoRequisicion, this.gridBagConstraintsRequisicion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRequisicion.add(this.jCheckBoxPostAccionSinCerrarRequisicion, this.gridBagConstraintsRequisicion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.requisicionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.requisicionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRequisicion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRequisicion.add(this.jCheckBoxPostAccionSinMensajeRequisicion, this.gridBagConstraintsRequisicion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx = iPosXAccion++;
			
		this.jPanelAccionesRequisicion.add(this.jButtonModificarRequisicion, this.gridBagConstraintsRequisicion);							

		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicion.gridy = 0;
		this.gridBagConstraintsRequisicion.gridx =iPosXAccion++;
			
		this.jPanelAccionesRequisicion.add(this.jButtonEliminarRequisicion, this.gridBagConstraintsRequisicion);
		
			
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = 0;		
		this.gridBagConstraintsRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesRequisicion.add(this.jButtonActualizarRequisicion, this.gridBagConstraintsRequisicion);


		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = 0;		
		this.gridBagConstraintsRequisicion.gridx = iPosXAccion++;
		
		this.jPanelAccionesRequisicion.add(this.jButtonGuardarCambiosRequisicion, this.gridBagConstraintsRequisicion);	
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = 0;		
		this.gridBagConstraintsRequisicion.gridx =iPosXAccion++;
		
		this.jPanelAccionesRequisicion.add(this.jButtonCancelarRequisicion, this.gridBagConstraintsRequisicion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRequisicion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRequisicion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.requisicionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRequisicion = new GridBagConstraints();						
			this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRequisicion.gridx = 0;		
			//this.gridBagConstraintsRequisicion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRequisicion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRequisicion.gridx =0;
		this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRequisicion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRequisicion, this.gridBagConstraintsRequisicion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RequisicionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRequisicion = new RequisicionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Requisicion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Requisicion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Requisicion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RequisicionModel requisicionModel=new RequisicionModel(this);
			
			//SI USARA CLASE INTERNA
			//RequisicionModel.RequisicionFocusTraversalPolicy requisicionFocusTraversalPolicy = requisicionModel.new RequisicionFocusTraversalPolicy(this);
			
			//requisicionFocusTraversalPolicy.setrequisicionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(requisicionModel);
			
			
			this.jContentPaneDetalleRequisicion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRequisicion = new GridBagLayout();	
			this.jContentPaneDetalleRequisicion.setLayout(gridaBagLayoutDetalleRequisicion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRequisicion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRequisicion = new GridBagConstraints();
				this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRequisicion.gridx = 0;
					
				
				this.jContentPaneDetalleRequisicion.add(jTtoolBarDetalleRequisicion, gridBagConstraintsRequisicion);								
				
}
			
			this.jScrollPanelDatosEdicionRequisicion=   new JScrollPane(jContentPaneDetalleRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRequisicion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRequisicion.gridx = 0;
	        
			this.jContentPaneDetalleRequisicion.add(jPanelCamposRequisicion, gridBagConstraintsRequisicion);
			
			
			
			
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
						&& requisicionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleRequisicion(this.puedeCargarPorParteDetalleRequisicion,false,-1);
					
					if(this.requisicionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRequisicion= new GridBagConstraints();
						this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRequisicion.gridx = 0;
						this.jContentPaneDetalleRequisicion.add(this.jTabbedPaneRelacionesRequisicion, this.gridBagConstraintsRequisicion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRequisicion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleRequisicion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRequisicion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRequisicion = new GridBagConstraints();
					this.gridBagConstraintsRequisicion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRequisicion.gridx = 0;
					
				
					this.jContentPaneDetalleRequisicion.add(jPanelCamposOcultosRequisicion, gridBagConstraintsRequisicion);
				
					this.jPanelCamposOcultosRequisicion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsRequisicion.gridx = 0;
	        this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRequisicion.add(this.jPanelAccionesFormularioRequisicion, this.gridBagConstraintsRequisicion);							
			
			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsRequisicion.gridx = 0;
	        
			
			this.jContentPaneDetalleRequisicion.add(this.jPanelAccionesRequisicion, this.gridBagConstraintsRequisicion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRequisicion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRequisicion=   new JScrollPane(this.jPanelCamposRequisicion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRequisicion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRequisicion.gridx = 0;
			this.gridBagConstraintsRequisicion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRequisicion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRequisicion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRequisicion, this.gridBagConstraintsRequisicion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRequisicion, this.gridBagConstraintsRequisicion);			
			
			this.gridBagConstraintsRequisicion = new GridBagConstraints();
			this.gridBagConstraintsRequisicion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRequisicion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRequisicion, this.gridBagConstraintsRequisicion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRequisicion, this.gridBagConstraintsRequisicion);
			
			
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRequisicion, this.gridBagConstraintsRequisicion);
		
			
		this.gridBagConstraintsRequisicion = new GridBagConstraints();
		this.gridBagConstraintsRequisicion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRequisicion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRequisicion, this.gridBagConstraintsRequisicion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRequisicion;//jContentPane;
		
		return jScrollPanelDatosEdicionRequisicion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleRequisicion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallerequisicionSessionBean=new DetalleRequisicionSessionBean();
		this.detallerequisicionSessionBean.setConGuardarRelaciones(false);
		this.detallerequisicionSessionBean.setEsGuardarRelacionado(true);

		this.detallerequisicionBeanSwingJInternalFrame=null;//new DetalleRequisicionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallerequisicionBeanSwingJInternalFramePopup=new DetalleRequisicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallerequisicionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {

				DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL=RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleRequisicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RequisicionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallerequisicionSessionBean.setEsGuardarRelacionado(true);

				this.detallerequisicionBeanSwingJInternalFrame=new DetalleRequisicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallerequisicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallerequisicionBeanSwingJInternalFrame.setdetallerequisicionSessionBean(this.detallerequisicionSessionBean);

				//this.gridBagConstraintsRequisicion = new GridBagConstraints();
				//this.gridBagConstraintsRequisicion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRequisicion.gridx = 0;
				//this.jContentPaneDetalleRequisicion.add(this.detallerequisicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRequisicion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRequisicion.add("Detalle Requisicions",this.detallerequisicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRequisicion.setComponentAt(iIndexTab,this.detallerequisicionBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleRequisicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallerequisicionSessionBean.setEsGuardarRelacionado(false);
				this.detallerequisicionBeanSwingJInternalFrame=null;//new DetalleRequisicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallerequisicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleRequisicion) {
					this.jTabbedPaneRelacionesRequisicion.add("Detalle Requisicions",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleRequisicionBeanSwingJInternalFrame(List<Requisicion> requisicions,Requisicion requisicion,DetalleRequisicionBeanSwingJInternalFrame detallerequisicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallerequisicionBeanSwingJInternalFrame=new DetalleRequisicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallerequisicionBeanSwingJInternalFrame.getDetalleRequisicionLogic().setConnexion(this.requisicionLogic.getConnexion());

					detallerequisicionBeanSwingJInternalFrame.setrequisicionsForeignKey(requisicions);
					detallerequisicionBeanSwingJInternalFrame.setrequisicionForeignKey(requisicion);
					detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.setisBusquedaDesdeForeignKeySesionRequisicion(true);
					detallerequisicionBeanSwingJInternalFrame.detallerequisicionSessionBean.setlidRequisicionActual(requisicion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallerequisicionBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleRequisicion(detallerequisicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallerequisicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaRequisicion(true);
					detallerequisicionBeanSwingJInternalFrame.setid_requisicionFK_IdRequisicion(requisicion.getId());

					if(!this.conCargarFormDetalle) {
						detallerequisicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallerequisicionBeanSwingJInternalFrame.setSelectedItemCombosFrameRequisicionForeignKey(requisicion,1,false,true,true);
					detallerequisicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallerequisicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdRequisicion");
					detallerequisicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRequisicion");
					detallerequisicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRequisicion(true);
					detallerequisicionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleRequisicion("n",detallerequisicionBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallerequisicionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallerequisicionBeanSwingJInternalFrame.setAutoscrolls(true);
					detallerequisicionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallerequisicionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRequisicion("relacionado");
					} else {
						detallerequisicionBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRequisicion("no_relacionado");
					}

					detallerequisicionBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleRequisicion().setVisible(false);

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
