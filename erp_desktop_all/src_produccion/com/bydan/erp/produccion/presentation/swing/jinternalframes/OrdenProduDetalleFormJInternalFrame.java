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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.produccion.util.OrdenProduConstantesFunciones;

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
public class OrdenProduDetalleFormJInternalFrame extends OrdenProduBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleOrdenProdu;
	
	protected JMenuBar jmenuBarDetalleOrdenProdu;
	
	protected JMenu jmenuDetalleOrdenProdu;
	protected JMenu jmenuDetalleArchivoOrdenProdu;
	protected JMenu jmenuDetalleAccionesOrdenProdu;
	protected JMenu jmenuDetalleDatosOrdenProdu;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutOrdenProdu;	
	protected GridBagConstraints gridBagConstraintsOrdenProdu;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected OrdenProduBeanSwingJInternalFrameAdditional jInternalFrameDetalleOrdenProdu;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprioridadempresaprodu="";

	protected EmpleadoBeanSwingJInternalFrame empleadoresponsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadoresponsable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoordenprodu="";
	
	public OrdenProduSessionBean ordenproduSessionBean;
	
	

	public OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame=null;
	public OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteOrdenDetaProdu=false;
	public OrdenDetaProduSessionBean ordendetaproduSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoPrioridadEmpresaProduSessionBean tipoprioridadempresaproduSessionBean;
	public EmpleadoSessionBean empleadoresponsableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EstadoOrdenProduSessionBean estadoordenproduSessionBean;	
	
	public OrdenProduLogic ordenproduLogic;
	
	public JScrollPane jScrollPanelDatosOrdenProdu;
	public JScrollPane jScrollPanelDatosEdicionOrdenProdu;
	public JScrollPane jScrollPanelDatosGeneralOrdenProdu;
	
	protected JPanel jPanelCamposOrdenProdu;    
	protected JPanel jPanelCamposOcultosOrdenProdu;    	
	protected JPanel jPanelAccionesOrdenProdu;
	protected JPanel jPanelAccionesFormularioOrdenProdu;
    
	
	
	protected Integer iXPanelCamposOrdenProdu=0;
	protected Integer iYPanelCamposOrdenProdu=0;
	
	protected Integer iXPanelCamposOcultosOrdenProdu=0;
	protected Integer iYPanelCamposOcultosOrdenProdu=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoOrdenProdu;
	public JButton jButtonModificarOrdenProdu;
	public JButton jButtonActualizarOrdenProdu;
    public JButton jButtonEliminarOrdenProdu;
	public JButton jButtonCancelarOrdenProdu;
    public JButton jButtonGuardarCambiosOrdenProdu;
	public JButton jButtonGuardarCambiosTablaOrdenProdu;
	protected JButton jButtonCerrarOrdenProdu;
	
	
	protected JButton jButtonProcesarInformacionOrdenProdu;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoOrdenProdu;
	protected JCheckBox jCheckBoxPostAccionSinCerrarOrdenProdu;
	protected JCheckBox jCheckBoxPostAccionSinMensajeOrdenProdu;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarOrdenProdu;
	protected JButton jButtonModificarToolBarOrdenProdu;
	protected JButton jButtonActualizarToolBarOrdenProdu;
    protected JButton jButtonEliminarToolBarOrdenProdu;
	protected JButton jButtonCancelarToolBarOrdenProdu;
    protected JButton jButtonGuardarCambiosToolBarOrdenProdu;
	protected JButton jButtonGuardarCambiosTablaToolBarOrdenProdu;
	protected JButton jButtonMostrarOcultarTablaToolBarOrdenProdu;
	protected JButton jButtonCerrarToolBarOrdenProdu;
	
	protected JButton jButtonProcesarInformacionToolBarOrdenProdu;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoOrdenProdu;
	protected JMenuItem jMenuItemModificarOrdenProdu;
	protected JMenuItem jMenuItemActualizarOrdenProdu;
    protected JMenuItem jMenuItemEliminarOrdenProdu;
	protected JMenuItem jMenuItemCancelarOrdenProdu;
    protected JMenuItem jMenuItemGuardarCambiosOrdenProdu;
	protected JMenuItem jMenuItemGuardarCambiosTablaOrdenProdu;
	protected JMenuItem jMenuItemCerrarOrdenProdu;
	protected JMenuItem jMenuItemDetalleCerrarOrdenProdu;
	protected JMenuItem jMenuItemDetalleMostarOcultarOrdenProdu;
	
	protected JMenuItem jMenuItemProcesarInformacionOrdenProdu;
	protected JMenuItem jMenuItemNuevoGuardarCambiosOrdenProdu;
	protected JMenuItem jMenuItemMostrarOcultarOrdenProdu;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesOrdenProdu;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesOrdenProdu;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesOrdenProdu;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioOrdenProdu;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidOrdenProdu;
	public JLabel jLabelIdOrdenProdu;
	public JLabel jLabelidOrdenProdu;
	public JButton jButtonidOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialOrdenProdu;
	public JLabel jLabelsecuencialOrdenProdu;
	public JTextField jTextFieldsecuencialOrdenProdu;
	public JButton jButtonsecuencialOrdenProduBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_clienteOrdenProdu;
	public JLabel jLabeldireccion_clienteOrdenProdu;
	public JTextArea jTextAreadireccion_clienteOrdenProdu;
	public JScrollPane jscrollPanedireccion_clienteOrdenProdu;
	public JButton jButtondireccion_clienteOrdenProduBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_clienteOrdenProdu;
	public JLabel jLabeltelefono_clienteOrdenProdu;
	public JTextField jTextFieldtelefono_clienteOrdenProdu;
	public JButton jButtontelefono_clienteOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelruc_clienteOrdenProdu;
	public JLabel jLabelruc_clienteOrdenProdu;
	public JTextField jTextFieldruc_clienteOrdenProdu;
	public JButton jButtonruc_clienteOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelloteOrdenProdu;
	public JLabel jLabelloteOrdenProdu;
	public JTextField jTextFieldloteOrdenProdu;
	public JButton jButtonloteOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelfecha_pedidoOrdenProdu;
	public JLabel jLabelfecha_pedidoOrdenProdu;
	//public JFormattedTextField jDateChooserfecha_pedidoOrdenProdu;

	public JDateChooser jDateChooserfecha_pedidoOrdenProdu;
	public JButton jButtonfecha_pedidoOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaOrdenProdu;
	public JLabel jLabelfecha_entregaOrdenProdu;
	//public JFormattedTextField jDateChooserfecha_entregaOrdenProdu;

	public JDateChooser jDateChooserfecha_entregaOrdenProdu;
	public JButton jButtonfecha_entregaOrdenProduBusqueda= new JButtonMe();

	public JPanel jPaneles_uso_internoOrdenProdu;
	public JLabel jLabeles_uso_internoOrdenProdu;
	public JCheckBox jCheckBoxes_uso_internoOrdenProdu;
	public JButton jButtones_uso_internoOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelfechaOrdenProdu;
	public JLabel jLabelfechaOrdenProdu;
	//public JFormattedTextField jDateChooserfechaOrdenProdu;

	public JDateChooser jDateChooserfechaOrdenProdu;
	public JButton jButtonfechaOrdenProduBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionOrdenProdu;
	public JLabel jLabeldescripcionOrdenProdu;
	public JTextArea jTextAreadescripcionOrdenProdu;
	public JScrollPane jscrollPanedescripcionOrdenProdu;
	public JButton jButtondescripcionOrdenProduBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaOrdenProdu;
	public JLabel jLabelid_empresaOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaOrdenProdu;
	public JButton jButtonid_empresaOrdenProdu= new JButtonMe();
	public JButton jButtonid_empresaOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_empresaOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalOrdenProdu;
	public JLabel jLabelid_sucursalOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalOrdenProdu;
	public JButton jButtonid_sucursalOrdenProdu= new JButtonMe();
	public JButton jButtonid_sucursalOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_sucursalOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioOrdenProdu;
	public JLabel jLabelid_ejercicioOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioOrdenProdu;
	public JButton jButtonid_ejercicioOrdenProdu= new JButtonMe();
	public JButton jButtonid_ejercicioOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoOrdenProdu;
	public JLabel jLabelid_periodoOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoOrdenProdu;
	public JButton jButtonid_periodoOrdenProdu= new JButtonMe();
	public JButton jButtonid_periodoOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_periodoOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoOrdenProdu;
	public JLabel jLabelid_formatoOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoOrdenProdu;
	public JButton jButtonid_formatoOrdenProdu= new JButtonMe();
	public JButton jButtonid_formatoOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_formatoOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_prioridad_empresa_produOrdenProdu;
	public JLabel jLabelid_tipo_prioridad_empresa_produOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_prioridad_empresa_produOrdenProdu;
	public JButton jButtonid_tipo_prioridad_empresa_produOrdenProdu= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_responsableOrdenProdu;
	public JLabel jLabelid_empleado_responsableOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_responsableOrdenProdu;
	public JButton jButtonid_empleado_responsableOrdenProdu= new JButtonMe();
	public JButton jButtonid_empleado_responsableOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_empleado_responsableOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteOrdenProdu;
	public JLabel jLabelid_clienteOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteOrdenProdu;
	public JButton jButtonid_clienteOrdenProdu= new JButtonMe();
	public JButton jButtonid_clienteOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_clienteOrdenProduBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_orden_produOrdenProdu;
	public JLabel jLabelid_estado_orden_produOrdenProdu;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_orden_produOrdenProdu;
	public JButton jButtonid_estado_orden_produOrdenProdu= new JButtonMe();
	public JButton jButtonid_estado_orden_produOrdenProduUpdate= new JButtonMe();
	public JButton jButtonid_estado_orden_produOrdenProduBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesOrdenProdu;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public OrdenProduDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposOrdenProdu=new JPanel();
				this.jPanelAccionesFormularioOrdenProdu=new JPanel();
				this.jmenuBarDetalleOrdenProdu=new JMenuBar();
				this.jTtoolBarDetalleOrdenProdu=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public OrdenProduDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public OrdenProduDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("OrdenProdu No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarOrdenProdu() {
		return this.jButtonActualizarToolBarOrdenProdu;
	}
	
	public JButton getjButtonEliminarToolBarOrdenProdu() {
		return this.jButtonEliminarToolBarOrdenProdu;
	}
	
	public JButton getjButtonCancelarToolBarOrdenProdu() {
		return this.jButtonCancelarToolBarOrdenProdu;
	}		
	
	public JButton getjButtonProcesarInformacionOrdenProdu() {
		return this.jButtonProcesarInformacionOrdenProdu;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionOrdenProdu)	{
		this.jButtonProcesarInformacionOrdenProdu = jButtonProcesarInformacionOrdenProdu;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesOrdenProdu() {
		return this.jComboBoxTiposAccionesOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesOrdenProdu(
			JComboBox jComboBoxTiposRelacionesOrdenProdu) {
		this.jComboBoxTiposRelacionesOrdenProdu = jComboBoxTiposRelacionesOrdenProdu;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesOrdenProdu(
			JComboBox jComboBoxTiposAccionesOrdenProdu) {
		this.jComboBoxTiposAccionesOrdenProdu = jComboBoxTiposAccionesOrdenProdu;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioOrdenProdu() {
		return this.jComboBoxTiposAccionesFormularioOrdenProdu;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioOrdenProdu(
			JComboBox jComboBoxTiposAccionesFormularioOrdenProdu) {
		this.jComboBoxTiposAccionesFormularioOrdenProdu = jComboBoxTiposAccionesFormularioOrdenProdu;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ordenproduSessionBean=new OrdenProduSessionBean();
		
		this.ordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ordenproduSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.ordendetaproduSessionBean=new OrdenDetaProduSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		OrdenProduJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Orden Produccion MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
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
	
		OrdenProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleOrdenProdu= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarOrdenProdu=new JButtonMe();
				this.jButtonModificarToolBarOrdenProdu=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarOrdenProdu,this.jTtoolBarDetalleOrdenProdu,
							"actualizar","actualizar","Actualizar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarOrdenProdu,this.jTtoolBarDetalleOrdenProdu,
							"eliminar","eliminar","Eliminar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarOrdenProdu,this.jTtoolBarDetalleOrdenProdu,
							"cancelar","cancelar","Cancelar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarOrdenProdu=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarOrdenProdu,this.jTtoolBarDetalleOrdenProdu,
							"guardarcambios","guardarcambios","Guardar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleOrdenProdu=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleOrdenProdu=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoOrdenProdu=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesOrdenProdu=new JMenuMe("Acciones");
		this.jmenuDetalleDatosOrdenProdu=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoOrdenProdu= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoOrdenProdu.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoOrdenProdu,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarOrdenProdu= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarOrdenProdu.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarOrdenProdu,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarOrdenProdu= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarOrdenProdu.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarOrdenProdu,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarOrdenProdu= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarOrdenProdu.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarOrdenProdu,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarOrdenProdu= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarOrdenProdu.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarOrdenProdu,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosOrdenProdu= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosOrdenProdu.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosOrdenProdu,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarOrdenProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarOrdenProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarOrdenProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarOrdenProdu= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarOrdenProdu.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarOrdenProdu,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarOrdenProdu= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarOrdenProdu.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarOrdenProdu,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoOrdenProdu.add(this.jMenuItemDetalleCerrarOrdenProdu);
		
		this.jmenuDetalleAccionesOrdenProdu.add(this.jMenuItemActualizarOrdenProdu);
		this.jmenuDetalleAccionesOrdenProdu.add(this.jMenuItemEliminarOrdenProdu);
		this.jmenuDetalleAccionesOrdenProdu.add(this.jMenuItemCancelarOrdenProdu);		
		
		//this.jmenuDetalleDatosOrdenProdu.add(this.jMenuItemDetalleAbrirOrderByOrdenProdu);				
		this.jmenuDetalleDatosOrdenProdu.add(this.jMenuItemDetalleMostarOcultarOrdenProdu);				
				
		//this.jmenuDetalleAccionesOrdenProdu.add(this.jMenuItemGuardarCambiosOrdenProdu);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleOrdenProdu.add(this.jmenuDetalleArchivoOrdenProdu);		
		this.jmenuBarDetalleOrdenProdu.add(this.jmenuDetalleAccionesOrdenProdu);		
		this.jmenuBarDetalleOrdenProdu.add(this.jmenuDetalleDatosOrdenProdu);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleOrdenProdu.add(this.jmenuDetalleOrdenProdu);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleOrdenProdu);				
	}
	
	
	public void inicializarElementosCamposOrdenProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdOrdenProdu = new JLabelMe();
		jLabelIdOrdenProdu.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidOrdenProdu = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutOrdenProdu= new GridBagLayout();

		this.jPanelidOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);

		jLabelidOrdenProdu = new JLabel();
		jLabelidOrdenProdu.setText("Id");

		jLabelidOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialOrdenProdu = new JLabelMe();
		this.jLabelsecuencialOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialOrdenProdu.setToolTipText("Secuencial");
		this.jLabelsecuencialOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelsecuencialOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jTextFieldsecuencialOrdenProdu= new JTextFieldMe();

		jTextFieldsecuencialOrdenProdu.setEnabled(false);
		jTextFieldsecuencialOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialOrdenProduBusqueda= new JButtonMe();
		this.jButtonsecuencialOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialOrdenProduBusqueda.setText("U");
		this.jButtonsecuencialOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_clienteOrdenProdu = new JLabelMe();
		this.jLabeldireccion_clienteOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE+" : *");
		this.jLabeldireccion_clienteOrdenProdu.setToolTipText("Direccion Cliente");
		this.jLabeldireccion_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_clienteOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_clienteOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPaneldireccion_clienteOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jTextAreadireccion_clienteOrdenProdu= new JTextAreaMe();
		jTextAreadireccion_clienteOrdenProdu.setEnabled(false);
		jTextAreadireccion_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteOrdenProdu.setLineWrap(true);
		jTextAreadireccion_clienteOrdenProdu.setWrapStyleWord(true);
		jTextAreadireccion_clienteOrdenProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_clienteOrdenProdu.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_clienteOrdenProdu = new JScrollPane(jTextAreadireccion_clienteOrdenProdu);
		jscrollPanedireccion_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccion_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccion_clienteOrdenProduBusqueda= new JButtonMe();
		this.jButtondireccion_clienteOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_clienteOrdenProduBusqueda.setText("U");
		this.jButtondireccion_clienteOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_clienteOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_clienteOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_clienteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_clienteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_clienteOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_clienteOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_clienteOrdenProdu = new JLabelMe();
		this.jLabeltelefono_clienteOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE+" : *");
		this.jLabeltelefono_clienteOrdenProdu.setToolTipText("Telefono Cliente");
		this.jLabeltelefono_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_clienteOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_clienteOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPaneltelefono_clienteOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jTextFieldtelefono_clienteOrdenProdu= new JTextFieldMe();

		jTextFieldtelefono_clienteOrdenProdu.setEnabled(false);
		jTextFieldtelefono_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefono_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefono_clienteOrdenProduBusqueda= new JButtonMe();
		this.jButtontelefono_clienteOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_clienteOrdenProduBusqueda.setText("U");
		this.jButtontelefono_clienteOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_clienteOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_clienteOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefono_clienteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefono_clienteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_clienteOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_clienteOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabelruc_clienteOrdenProdu = new JLabelMe();
		this.jLabelruc_clienteOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_RUCCLIENTE+" : *");
		this.jLabelruc_clienteOrdenProdu.setToolTipText("Ruc Cliente");
		this.jLabelruc_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_clienteOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_clienteOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_RUCCLIENTE);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelruc_clienteOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jTextFieldruc_clienteOrdenProdu= new JTextFieldMe();

		jTextFieldruc_clienteOrdenProdu.setEnabled(false);
		jTextFieldruc_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_clienteOrdenProduBusqueda= new JButtonMe();
		this.jButtonruc_clienteOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_clienteOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_clienteOrdenProduBusqueda.setText("U");
		this.jButtonruc_clienteOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_clienteOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_clienteOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_clienteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_clienteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_clienteOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_clienteOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabelloteOrdenProdu = new JLabelMe();
		this.jLabelloteOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteOrdenProdu.setToolTipText("Lote");
		this.jLabelloteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelloteOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jTextFieldloteOrdenProdu= new JTextFieldMe();

		jTextFieldloteOrdenProdu.setEnabled(false);
		jTextFieldloteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteOrdenProduBusqueda= new JButtonMe();
		this.jButtonloteOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteOrdenProduBusqueda.setText("U");
		this.jButtonloteOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabelfecha_pedidoOrdenProdu = new JLabelMe();
		this.jLabelfecha_pedidoOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO+" : *");
		this.jLabelfecha_pedidoOrdenProdu.setToolTipText("Fecha Pedo");
		this.jLabelfecha_pedidoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pedidoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_pedidoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_pedidoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_pedidoOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_pedidoOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_FECHAPEDIDO);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelfecha_pedidoOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		//jFormattedTextFieldfecha_pedidoOrdenProdu= new JFormattedTextFieldMe();

		jDateChooserfecha_pedidoOrdenProdu= new JDateChooser();
		jDateChooserfecha_pedidoOrdenProdu.setEnabled(false);
		jDateChooserfecha_pedidoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pedidoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_pedidoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_pedidoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_pedidoOrdenProdu.setDate(new Date());
		jDateChooserfecha_pedidoOrdenProdu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_pedidoOrdenProdu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_pedidoOrdenProduBusqueda= new JButtonMe();
		this.jButtonfecha_pedidoOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pedidoOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_pedidoOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_pedidoOrdenProduBusqueda.setText("U");
		this.jButtonfecha_pedidoOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_pedidoOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_pedidoOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_pedidoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_pedidoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_pedidoOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_pedidoOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaOrdenProdu = new JLabelMe();
		this.jLabelfecha_entregaOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaOrdenProdu.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelfecha_entregaOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		//jFormattedTextFieldfecha_entregaOrdenProdu= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaOrdenProdu= new JDateChooser();
		jDateChooserfecha_entregaOrdenProdu.setEnabled(false);
		jDateChooserfecha_entregaOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaOrdenProdu.setDate(new Date());
		jDateChooserfecha_entregaOrdenProdu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaOrdenProdu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaOrdenProduBusqueda= new JButtonMe();
		this.jButtonfecha_entregaOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaOrdenProduBusqueda.setText("U");
		this.jButtonfecha_entregaOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabeles_uso_internoOrdenProdu = new JLabelMe();
		this.jLabeles_uso_internoOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO+" : *");
		this.jLabeles_uso_internoOrdenProdu.setToolTipText("Es Uso Interno");
		this.jLabeles_uso_internoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_uso_internoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_uso_internoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_uso_internoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_uso_internoOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_uso_internoOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_ESUSOINTERNO);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPaneles_uso_internoOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jCheckBoxes_uso_internoOrdenProdu= new JCheckBoxMe();
		jCheckBoxes_uso_internoOrdenProdu.setEnabled(false);

		jCheckBoxes_uso_internoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_uso_internoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_uso_internoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_uso_internoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_uso_internoOrdenProduBusqueda= new JButtonMe();
		this.jButtones_uso_internoOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_uso_internoOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_uso_internoOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_uso_internoOrdenProduBusqueda.setText("U");
		this.jButtones_uso_internoOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_uso_internoOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_uso_internoOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_uso_internoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_uso_internoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_uso_internoOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_uso_internoOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabelfechaOrdenProdu = new JLabelMe();
		this.jLabelfechaOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaOrdenProdu.setToolTipText("Fecha");
		this.jLabelfechaOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelfechaOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		//jFormattedTextFieldfechaOrdenProdu= new JFormattedTextFieldMe();

		jDateChooserfechaOrdenProdu= new JDateChooser();
		jDateChooserfechaOrdenProdu.setEnabled(false);
		jDateChooserfechaOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaOrdenProdu.setDate(new Date());
		jDateChooserfechaOrdenProdu.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaOrdenProdu.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaOrdenProduBusqueda= new JButtonMe();
		this.jButtonfechaOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaOrdenProduBusqueda.setText("U");
		this.jButtonfechaOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaOrdenProduBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionOrdenProdu = new JLabelMe();
		this.jLabeldescripcionOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionOrdenProdu.setToolTipText("Descripcion");
		this.jLabeldescripcionOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPaneldescripcionOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jTextAreadescripcionOrdenProdu= new JTextAreaMe();
		jTextAreadescripcionOrdenProdu.setEnabled(false);
		jTextAreadescripcionOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionOrdenProdu.setLineWrap(true);
		jTextAreadescripcionOrdenProdu.setWrapStyleWord(true);
		jTextAreadescripcionOrdenProdu.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionOrdenProdu.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionOrdenProdu = new JScrollPane(jTextAreadescripcionOrdenProdu);
		jscrollPanedescripcionOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionOrdenProduBusqueda= new JButtonMe();
		this.jButtondescripcionOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionOrdenProduBusqueda.setText("U");
		this.jButtondescripcionOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionOrdenProduBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysOrdenProdu() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaOrdenProdu = new JLabelMe();
		this.jLabelid_empresaOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaOrdenProdu.setToolTipText("Empresa");
		this.jLabelid_empresaOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_empresaOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_empresaOrdenProdu= new JComboBoxMe();
		jComboBoxid_empresaOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaOrdenProdu.setEnabled(false);

		this.jButtonid_empresaOrdenProdu= new JButtonMe();
		this.jButtonid_empresaOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaOrdenProdu.setText("Buscar");
		this.jButtonid_empresaOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenProdu"));

		this.jButtonid_empresaOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_empresaOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaOrdenProduBusqueda.setText("U");
		this.jButtonid_empresaOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_empresaOrdenProduUpdate= new JButtonMe();
		this.jButtonid_empresaOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaOrdenProduUpdate.setText("U");
		this.jButtonid_empresaOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaOrdenProduUpdate"));



					
		this.jLabelid_sucursalOrdenProdu = new JLabelMe();
		this.jLabelid_sucursalOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalOrdenProdu.setToolTipText("Sucursal");
		this.jLabelid_sucursalOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_sucursalOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_sucursalOrdenProdu= new JComboBoxMe();
		jComboBoxid_sucursalOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalOrdenProdu.setEnabled(false);

		this.jButtonid_sucursalOrdenProdu= new JButtonMe();
		this.jButtonid_sucursalOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalOrdenProdu.setText("Buscar");
		this.jButtonid_sucursalOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenProdu"));

		this.jButtonid_sucursalOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_sucursalOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalOrdenProduBusqueda.setText("U");
		this.jButtonid_sucursalOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_sucursalOrdenProduUpdate= new JButtonMe();
		this.jButtonid_sucursalOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalOrdenProduUpdate.setText("U");
		this.jButtonid_sucursalOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalOrdenProduUpdate"));



					
		this.jLabelid_ejercicioOrdenProdu = new JLabelMe();
		this.jLabelid_ejercicioOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioOrdenProdu.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_ejercicioOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_ejercicioOrdenProdu= new JComboBoxMe();
		jComboBoxid_ejercicioOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioOrdenProdu.setEnabled(false);

		this.jButtonid_ejercicioOrdenProdu= new JButtonMe();
		this.jButtonid_ejercicioOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioOrdenProdu.setText("Buscar");
		this.jButtonid_ejercicioOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenProdu"));

		this.jButtonid_ejercicioOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_ejercicioOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioOrdenProduBusqueda.setText("U");
		this.jButtonid_ejercicioOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioOrdenProduUpdate= new JButtonMe();
		this.jButtonid_ejercicioOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioOrdenProduUpdate.setText("U");
		this.jButtonid_ejercicioOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioOrdenProduUpdate"));



					
		this.jLabelid_periodoOrdenProdu = new JLabelMe();
		this.jLabelid_periodoOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoOrdenProdu.setToolTipText("Periodo");
		this.jLabelid_periodoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_periodoOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_periodoOrdenProdu= new JComboBoxMe();
		jComboBoxid_periodoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoOrdenProdu.setEnabled(false);

		this.jButtonid_periodoOrdenProdu= new JButtonMe();
		this.jButtonid_periodoOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoOrdenProdu.setText("Buscar");
		this.jButtonid_periodoOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenProdu"));

		this.jButtonid_periodoOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_periodoOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoOrdenProduBusqueda.setText("U");
		this.jButtonid_periodoOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_periodoOrdenProduUpdate= new JButtonMe();
		this.jButtonid_periodoOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoOrdenProduUpdate.setText("U");
		this.jButtonid_periodoOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoOrdenProduUpdate"));



					
		this.jLabelid_formatoOrdenProdu = new JLabelMe();
		this.jLabelid_formatoOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoOrdenProdu.setToolTipText("Formato");
		this.jLabelid_formatoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_formatoOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_formatoOrdenProdu= new JComboBoxMe();
		jComboBoxid_formatoOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoOrdenProdu= new JButtonMe();
		this.jButtonid_formatoOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoOrdenProdu.setText("Buscar");
		this.jButtonid_formatoOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoOrdenProdu"));

		this.jButtonid_formatoOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_formatoOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoOrdenProduBusqueda.setText("U");
		this.jButtonid_formatoOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_formatoOrdenProduUpdate= new JButtonMe();
		this.jButtonid_formatoOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoOrdenProduUpdate.setText("U");
		this.jButtonid_formatoOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoOrdenProduUpdate"));



					
		this.jLabelid_tipo_prioridad_empresa_produOrdenProdu = new JLabelMe();
		this.jLabelid_tipo_prioridad_empresa_produOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU+" : *");
		this.jLabelid_tipo_prioridad_empresa_produOrdenProdu.setToolTipText("Tipo Priorad Empresa Produ");
		this.jLabelid_tipo_prioridad_empresa_produOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_prioridad_empresa_produOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_prioridad_empresa_produOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_prioridad_empresa_produOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_prioridad_empresa_produOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_prioridad_empresa_produOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_tipo_prioridad_empresa_produOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu= new JComboBoxMe();
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_prioridad_empresa_produOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu= new JButtonMe();
		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu.setText("Buscar");
		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_prioridad_empresa_produOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prioridad_empresa_produOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prioridad_empresa_produOrdenProdu"));

		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setText("U");
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prioridad_empresa_produOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate= new JButtonMe();
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.setText("U");
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_prioridad_empresa_produOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_prioridad_empresa_produOrdenProduUpdate"));



					
		this.jLabelid_empleado_responsableOrdenProdu = new JLabelMe();
		this.jLabelid_empleado_responsableOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE+" : *");
		this.jLabelid_empleado_responsableOrdenProdu.setToolTipText("Empleado Responsable");
		this.jLabelid_empleado_responsableOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_empleado_responsableOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_empleado_responsableOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_responsableOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_responsableOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_responsableOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_empleado_responsableOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_empleado_responsableOrdenProdu= new JComboBoxMe();
		jComboBoxid_empleado_responsableOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsableOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_responsableOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_responsableOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_responsableOrdenProdu= new JButtonMe();
		this.jButtonid_empleado_responsableOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_responsableOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_responsableOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_responsableOrdenProdu.setText("Buscar");
		this.jButtonid_empleado_responsableOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_responsableOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_responsableOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_responsableOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_responsableOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_responsableOrdenProdu"));

		this.jButtonid_empleado_responsableOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_empleado_responsableOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsableOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsableOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_responsableOrdenProduBusqueda.setText("U");
		this.jButtonid_empleado_responsableOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_responsableOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_responsableOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_responsableOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_responsableOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_responsableOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_responsableOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_empleado_responsableOrdenProduUpdate= new JButtonMe();
		this.jButtonid_empleado_responsableOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsableOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_responsableOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_responsableOrdenProduUpdate.setText("U");
		this.jButtonid_empleado_responsableOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_responsableOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_responsableOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_responsableOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_responsableOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_responsableOrdenProduUpdate"));



					
		this.jLabelid_clienteOrdenProdu = new JLabelMe();
		this.jLabelid_clienteOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteOrdenProdu.setToolTipText("Cliente");
		this.jLabelid_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_clienteOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_clienteOrdenProdu= new JComboBoxMe();
		jComboBoxid_clienteOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteOrdenProdu= new JButtonMe();
		this.jButtonid_clienteOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteOrdenProdu.setText("Buscar");
		this.jButtonid_clienteOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteOrdenProdu"));

		this.jButtonid_clienteOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_clienteOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteOrdenProduBusqueda.setText("U");
		this.jButtonid_clienteOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_clienteOrdenProduUpdate= new JButtonMe();
		this.jButtonid_clienteOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteOrdenProduUpdate.setText("U");
		this.jButtonid_clienteOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteOrdenProduUpdate"));



					
		this.jLabelid_estado_orden_produOrdenProdu = new JLabelMe();
		this.jLabelid_estado_orden_produOrdenProdu.setText(""+OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU+" : *");
		this.jLabelid_estado_orden_produOrdenProdu.setToolTipText("Estado Orden Produ");
		this.jLabelid_estado_orden_produOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_orden_produOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_estado_orden_produOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_orden_produOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_orden_produOrdenProdu=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_orden_produOrdenProdu.setToolTipText(OrdenProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
		this.gridaBagLayoutOrdenProdu = new GridBagLayout();
		this.jPanelid_estado_orden_produOrdenProdu.setLayout(this.gridaBagLayoutOrdenProdu);


		jComboBoxid_estado_orden_produOrdenProdu= new JComboBoxMe();
		jComboBoxid_estado_orden_produOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_orden_produOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_orden_produOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_orden_produOrdenProdu= new JButtonMe();
		this.jButtonid_estado_orden_produOrdenProdu.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_produOrdenProdu.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_produOrdenProdu.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_orden_produOrdenProdu.setText("Buscar");
		this.jButtonid_estado_orden_produOrdenProdu.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_orden_produOrdenProdu.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_produOrdenProdu,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_orden_produOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_produOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_produOrdenProdu"));

		this.jButtonid_estado_orden_produOrdenProduBusqueda= new JButtonMe();
		this.jButtonid_estado_orden_produOrdenProduBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produOrdenProduBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produOrdenProduBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_orden_produOrdenProduBusqueda.setText("U");
		this.jButtonid_estado_orden_produOrdenProduBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_orden_produOrdenProduBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_produOrdenProduBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_orden_produOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_produOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_produOrdenProduBusqueda"));

		if(this.ordenproduSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_orden_produOrdenProduBusqueda.setVisible(false);		}

		this.jButtonid_estado_orden_produOrdenProduUpdate= new JButtonMe();
		this.jButtonid_estado_orden_produOrdenProduUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produOrdenProduUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_orden_produOrdenProduUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_orden_produOrdenProduUpdate.setText("U");
		this.jButtonid_estado_orden_produOrdenProduUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_orden_produOrdenProduUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_orden_produOrdenProduUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_orden_produOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_orden_produOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_orden_produOrdenProduUpdate"));



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
		//this.jInternalFrameDetalleOrdenProdu = new OrdenProduBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Orden Produccion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutOrdenProdu= new GridBagLayout();
		

		
		String sToolTipOrdenProdu="";
		sToolTipOrdenProdu=OrdenProduConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipOrdenProdu+="(Produccion.OrdenProdu)";
		}
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			sToolTipOrdenProdu+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoOrdenProdu = new JButtonMe();
		this.jButtonModificarOrdenProdu = new JButtonMe();
        this.jButtonActualizarOrdenProdu = new JButtonMe();
        this.jButtonEliminarOrdenProdu = new JButtonMe();
        this.jButtonCancelarOrdenProdu = new JButtonMe();
        this.jButtonGuardarCambiosOrdenProdu = new JButtonMe();
		this.jButtonGuardarCambiosTablaOrdenProdu = new JButtonMe();
		this.jButtonCerrarOrdenProdu = new JButtonMe();
		
		this.jScrollPanelDatosOrdenProdu = new JScrollPane();   
        this.jScrollPanelDatosEdicionOrdenProdu = new JScrollPane();
		this.jScrollPanelDatosGeneralOrdenProdu = new JScrollPane();
				
		
		
		this.jPanelCamposOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Orden Produccion";
		
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Orden Producciones" + this.sPath));
		} else {
			this.jScrollPanelDatosOrdenProdu.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposOrdenProdu.setName("jPanelCamposOrdenProdu"); 

		this.jPanelCamposOcultosOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosOrdenProdu.setName("jPanelCamposOcultosOrdenProdu"); 

        this.jPanelAccionesOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesOrdenProdu.setToolTipText("Acciones");
        this.jPanelAccionesOrdenProdu.setName("Acciones"); 

		this.jPanelAccionesFormularioOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioOrdenProdu.setToolTipText("Acciones");
        this.jPanelAccionesFormularioOrdenProdu.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoOrdenProdu.setText("Nuevo");
		this.jButtonModificarOrdenProdu.setText("Editar");
        this.jButtonActualizarOrdenProdu.setText("Actualizar");
        this.jButtonEliminarOrdenProdu.setText("Eliminar");
        this.jButtonCancelarOrdenProdu.setText("Cancelar");
        this.jButtonGuardarCambiosOrdenProdu.setText("Guardar");
		this.jButtonGuardarCambiosTablaOrdenProdu.setText("Guardar");
		this.jButtonCerrarOrdenProdu.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoOrdenProdu,"nuevo_button","Nuevo",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarOrdenProdu,"modificar_button","Editar",this.ordenproduSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarOrdenProdu,"actualizar_button","Actualizar",this.ordenproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarOrdenProdu,"eliminar_button","Eliminar",this.ordenproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarOrdenProdu,"cancelar_button","Cancelar",this.ordenproduSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosOrdenProdu,"guardarcambios_button","Guardar",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaOrdenProdu,"guardarcambiostabla_button","Guardar",this.ordenproduSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrdenProdu,"cerrar_button","Salir",this.ordenproduSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoOrdenProdu.setToolTipText("Nuevo"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarOrdenProdu.setToolTipText("Editar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarOrdenProdu.setToolTipText("Actualizar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarOrdenProdu.setToolTipText("Eliminar)"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarOrdenProdu.setToolTipText("Cancelar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosOrdenProdu.setToolTipText("Guardar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaOrdenProdu.setToolTipText("Guardar"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarOrdenProdu.setToolTipText("Salir"+" "+OrdenProduConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoOrdenProdu";
		inputMap = this.jButtonNuevoOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoOrdenProdu.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoOrdenProdu"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarOrdenProdu";
		inputMap = this.jButtonActualizarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarOrdenProdu"));
		
		//ELIMINAR
		sMapKey = "EliminarOrdenProdu";
		inputMap = this.jButtonEliminarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarOrdenProdu"));
		
		//CANCELAR	
		sMapKey = "CancelarOrdenProdu";
		inputMap = this.jButtonCancelarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarOrdenProdu"));
		
		//CERRAR		
		sMapKey = "CerrarOrdenProdu";
		inputMap = this.jButtonCerrarOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarOrdenProdu"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaOrdenProdu";
		inputMap = this.jButtonGuardarCambiosTablaOrdenProdu.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaOrdenProdu.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaOrdenProdu"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoOrdenProdu.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoOrdenProdu.setToolTipText("Nuevo OrdenProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarOrdenProdu.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarOrdenProdu.setToolTipText("Sin Cerrar Ventana OrdenProdu");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeOrdenProdu = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeOrdenProdu.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeOrdenProdu.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesOrdenProdu.setText("Accion");
		this.jComboBoxTiposAccionesOrdenProdu.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioOrdenProdu = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioOrdenProdu.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioOrdenProdu.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesOrdenProdu = new JLabelMe();
		
		this.jLabelAccionesOrdenProdu.setText("Acciones");		
		this.jLabelAccionesOrdenProdu.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenProdu.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesOrdenProdu.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposOrdenProdu();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysOrdenProdu();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesOrdenProdu=new JTabbedPane();
		this.jTabbedPaneRelacionesOrdenProdu.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesOrdenProdu,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesOrdenProdu.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenProdu.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesOrdenProdu.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesOrdenProdu, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioOrdenProdu.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOrdenProdu.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioOrdenProdu.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioOrdenProdu, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposOrdenProdu = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosOrdenProdu = new GridBagLayout();
		
		this.jPanelCamposOrdenProdu.setLayout(gridaBagLayoutCamposOrdenProdu);
		this.jPanelCamposOcultosOrdenProdu.setLayout(gridaBagLayoutCamposOcultosOrdenProdu);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidOrdenProdu.add(jLabelIdOrdenProdu, this.gridBagConstraintsOrdenProdu);



	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidOrdenProdu.add(jLabelidOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaOrdenProdu.add(jLabelid_empresaOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaOrdenProdu.add(jButtonid_empresaOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaOrdenProdu.add(jButtonid_empresaOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaOrdenProdu.add(jComboBoxid_empresaOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalOrdenProdu.add(jLabelid_sucursalOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalOrdenProdu.add(jButtonid_sucursalOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalOrdenProdu.add(jButtonid_sucursalOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalOrdenProdu.add(jComboBoxid_sucursalOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioOrdenProdu.add(jLabelid_ejercicioOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioOrdenProdu.add(jButtonid_ejercicioOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioOrdenProdu.add(jButtonid_ejercicioOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioOrdenProdu.add(jComboBoxid_ejercicioOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoOrdenProdu.add(jLabelid_periodoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoOrdenProdu.add(jButtonid_periodoOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoOrdenProdu.add(jButtonid_periodoOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoOrdenProdu.add(jComboBoxid_periodoOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoOrdenProdu.add(jLabelid_formatoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoOrdenProdu.add(jButtonid_formatoOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoOrdenProdu.add(jButtonid_formatoOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoOrdenProdu.add(jComboBoxid_formatoOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_prioridad_empresa_produOrdenProdu.add(jLabelid_tipo_prioridad_empresa_produOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prioridad_empresa_produOrdenProdu.add(jButtonid_tipo_prioridad_empresa_produOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_prioridad_empresa_produOrdenProdu.add(jButtonid_tipo_prioridad_empresa_produOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_prioridad_empresa_produOrdenProdu.add(jComboBoxid_tipo_prioridad_empresa_produOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_responsableOrdenProdu.add(jLabelid_empleado_responsableOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_responsableOrdenProdu.add(jButtonid_empleado_responsableOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_responsableOrdenProdu.add(jButtonid_empleado_responsableOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_responsableOrdenProdu.add(jComboBoxid_empleado_responsableOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialOrdenProdu.add(jLabelsecuencialOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialOrdenProdu.add(jButtonsecuencialOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialOrdenProdu.add(jTextFieldsecuencialOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteOrdenProdu.add(jLabelid_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 2;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteOrdenProdu.add(jButtonid_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteOrdenProdu.add(jButtonid_clienteOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 4;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteOrdenProdu.add(jButtonid_clienteOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteOrdenProdu.add(jComboBoxid_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccion_clienteOrdenProdu.add(jLabeldireccion_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_clienteOrdenProdu.add(jButtondireccion_clienteOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccion_clienteOrdenProdu.add(jscrollPanedireccion_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_clienteOrdenProdu.add(jLabeltelefono_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_clienteOrdenProdu.add(jButtontelefono_clienteOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_clienteOrdenProdu.add(jTextFieldtelefono_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_clienteOrdenProdu.add(jLabelruc_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_clienteOrdenProdu.add(jButtonruc_clienteOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_clienteOrdenProdu.add(jTextFieldruc_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteOrdenProdu.add(jLabelloteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteOrdenProdu.add(jButtonloteOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteOrdenProdu.add(jTextFieldloteOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_pedidoOrdenProdu.add(jLabelfecha_pedidoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_pedidoOrdenProdu.add(jButtonfecha_pedidoOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_pedidoOrdenProdu.add(jDateChooserfecha_pedidoOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaOrdenProdu.add(jLabelfecha_entregaOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaOrdenProdu.add(jButtonfecha_entregaOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaOrdenProdu.add(jDateChooserfecha_entregaOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_uso_internoOrdenProdu.add(jLabeles_uso_internoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_uso_internoOrdenProdu.add(jButtones_uso_internoOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_uso_internoOrdenProdu.add(jCheckBoxes_uso_internoOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaOrdenProdu.add(jLabelfechaOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaOrdenProdu.add(jButtonfechaOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaOrdenProdu.add(jDateChooserfechaOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionOrdenProdu.add(jLabeldescripcionOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionOrdenProdu.add(jButtondescripcionOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionOrdenProdu.add(jscrollPanedescripcionOrdenProdu, this.gridBagConstraintsOrdenProdu);


	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 0;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_orden_produOrdenProdu.add(jLabelid_estado_orden_produOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 2;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_orden_produOrdenProdu.add(jButtonid_estado_orden_produOrdenProduBusqueda, this.gridBagConstraintsOrdenProdu);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		//this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = 3;
		this.gridBagConstraintsOrdenProdu.ipadx = 0;
		this.gridBagConstraintsOrdenProdu.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_orden_produOrdenProdu.add(jButtonid_estado_orden_produOrdenProduUpdate, this.gridBagConstraintsOrdenProdu);
	}

	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsOrdenProdu.gridy = 0;
	this.gridBagConstraintsOrdenProdu.gridx = 1;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_orden_produOrdenProdu.add(jComboBoxid_estado_orden_produOrdenProdu, this.gridBagConstraintsOrdenProdu);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelidOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelid_formatoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelid_tipo_prioridad_empresa_produOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelid_empleado_responsableOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelsecuencialOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelid_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPaneldireccion_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPaneltelefono_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelruc_clienteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelloteOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelfecha_pedidoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelfecha_entregaOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPaneles_uso_internoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelfechaOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPaneldescripcionOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOrdenProdu.add(this.jPanelid_estado_orden_produOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOrdenProdu % 2==0) {
		iXPanelCamposOrdenProdu=0;
		iYPanelCamposOrdenProdu++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOcultosOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOcultosOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenProdu.add(this.jPanelid_empresaOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOcultosOrdenProdu % 2==0) {
		iXPanelCamposOcultosOrdenProdu=0;
		iYPanelCamposOcultosOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOcultosOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOcultosOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenProdu.add(this.jPanelid_sucursalOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOcultosOrdenProdu % 2==0) {
		iXPanelCamposOcultosOrdenProdu=0;
		iYPanelCamposOcultosOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOcultosOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOcultosOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenProdu.add(this.jPanelid_ejercicioOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOcultosOrdenProdu % 2==0) {
		iXPanelCamposOcultosOrdenProdu=0;
		iYPanelCamposOcultosOrdenProdu++;
	}
	this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsOrdenProdu.gridy = iYPanelCamposOcultosOrdenProdu;
	this.gridBagConstraintsOrdenProdu.gridx = iXPanelCamposOcultosOrdenProdu++;
	this.gridBagConstraintsOrdenProdu.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsOrdenProdu.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosOrdenProdu.add(this.jPanelid_periodoOrdenProdu, this.gridBagConstraintsOrdenProdu);



	if(iXPanelCamposOcultosOrdenProdu % 2==0) {
		iXPanelCamposOcultosOrdenProdu=0;
		iYPanelCamposOcultosOrdenProdu++;
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
			
		GridBagLayout gridaBagLayoutAccionesOrdenProdu= new GridBagLayout();
		this.jPanelAccionesOrdenProdu.setLayout(gridaBagLayoutAccionesOrdenProdu);
		
		GridBagLayout gridaBagLayoutAccionesFormularioOrdenProdu= new GridBagLayout();
		this.jPanelAccionesFormularioOrdenProdu.setLayout(gridaBagLayoutAccionesFormularioOrdenProdu);
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOrdenProdu.add(this.jComboBoxTiposAccionesFormularioOrdenProdu, this.gridBagConstraintsOrdenProdu);

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioOrdenProdu.add(this.jCheckBoxPostAccionNuevoOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOrdenProdu.add(this.jCheckBoxPostAccionSinCerrarOrdenProdu, this.gridBagConstraintsOrdenProdu);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ordenproduSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ordenproduSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsOrdenProdu.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioOrdenProdu.add(this.jCheckBoxPostAccionSinMensajeOrdenProdu, this.gridBagConstraintsOrdenProdu);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx = iPosXAccion++;
			
		this.jPanelAccionesOrdenProdu.add(this.jButtonModificarOrdenProdu, this.gridBagConstraintsOrdenProdu);							

		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsOrdenProdu.gridy = 0;
		this.gridBagConstraintsOrdenProdu.gridx =iPosXAccion++;
			
		this.jPanelAccionesOrdenProdu.add(this.jButtonEliminarOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
			
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = 0;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesOrdenProdu.add(this.jButtonActualizarOrdenProdu, this.gridBagConstraintsOrdenProdu);


		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = 0;		
		this.gridBagConstraintsOrdenProdu.gridx = iPosXAccion++;
		
		this.jPanelAccionesOrdenProdu.add(this.jButtonGuardarCambiosOrdenProdu, this.gridBagConstraintsOrdenProdu);	
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = 0;		
		this.gridBagConstraintsOrdenProdu.gridx =iPosXAccion++;
		
		this.jPanelAccionesOrdenProdu.add(this.jButtonCancelarOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutOrdenProdu = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutOrdenProdu);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ordenproduSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();						
			this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;
			this.gridBagConstraintsOrdenProdu.gridx = 0;		
			//this.gridBagConstraintsOrdenProdu.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsOrdenProdu.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy =iGridyPrincipal++;
		this.gridBagConstraintsOrdenProdu.gridx =0;
		this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsOrdenProdu.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosOrdenProdu, this.gridBagConstraintsOrdenProdu);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(OrdenProduJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleOrdenProdu = new OrdenProduBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Orden Produccion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Orden Produccion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Produccion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			OrdenProduModel ordenproduModel=new OrdenProduModel(this);
			
			//SI USARA CLASE INTERNA
			//OrdenProduModel.OrdenProduFocusTraversalPolicy ordenproduFocusTraversalPolicy = ordenproduModel.new OrdenProduFocusTraversalPolicy(this);
			
			//ordenproduFocusTraversalPolicy.setordenproduJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ordenproduModel);
			
			
			this.jContentPaneDetalleOrdenProdu = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleOrdenProdu = new GridBagLayout();	
			this.jContentPaneDetalleOrdenProdu.setLayout(gridaBagLayoutDetalleOrdenProdu);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosOrdenProdu = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
				this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsOrdenProdu.gridx = 0;
					
				
				this.jContentPaneDetalleOrdenProdu.add(jTtoolBarDetalleOrdenProdu, gridBagConstraintsOrdenProdu);								
				
}
			
			this.jScrollPanelDatosEdicionOrdenProdu=   new JScrollPane(jContentPaneDetalleOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralOrdenProdu=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			
			
	        this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsOrdenProdu.gridx = 0;
	        
			this.jContentPaneDetalleOrdenProdu.add(jPanelCamposOrdenProdu, gridBagConstraintsOrdenProdu);
			
			
			
			
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
						&& ordenproduSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameOrdenDetaProdu(this.puedeCargarPorParteOrdenDetaProdu,false,-1);
					
					if(this.ordenproduSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsOrdenProdu= new GridBagConstraints();
						this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones++;
						this.gridBagConstraintsOrdenProdu.gridx = 0;
						this.jContentPaneDetalleOrdenProdu.add(this.jTabbedPaneRelacionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesOrdenProdu.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameOrdenDetaProdu(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosOrdenProdu.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
					this.gridBagConstraintsOrdenProdu.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsOrdenProdu.gridx = 0;
					
				
					this.jContentPaneDetalleOrdenProdu.add(jPanelCamposOcultosOrdenProdu, gridBagConstraintsOrdenProdu);
				
					this.jPanelCamposOcultosOrdenProdu.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsOrdenProdu.gridx = 0;
	        this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleOrdenProdu.add(this.jPanelAccionesFormularioOrdenProdu, this.gridBagConstraintsOrdenProdu);							
			
			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
	        this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsOrdenProdu.gridx = 0;
	        
			
			this.jContentPaneDetalleOrdenProdu.add(this.jPanelAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionOrdenProdu);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionOrdenProdu=   new JScrollPane(this.jPanelCamposOrdenProdu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionOrdenProdu.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenProdu.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionOrdenProdu.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsOrdenProdu.gridx = 0;
			this.gridBagConstraintsOrdenProdu.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsOrdenProdu.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsOrdenProdu.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOrdenProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioOrdenProdu, this.gridBagConstraintsOrdenProdu);			
			
			this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
			this.gridBagConstraintsOrdenProdu.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsOrdenProdu.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOrdenProdu, this.gridBagConstraintsOrdenProdu);
			
			
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosOrdenProdu, this.gridBagConstraintsOrdenProdu);
		
			
		this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
		this.gridBagConstraintsOrdenProdu.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsOrdenProdu.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesOrdenProdu, this.gridBagConstraintsOrdenProdu);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralOrdenProdu;//jContentPane;
		
		return jScrollPanelDatosEdicionOrdenProdu;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameOrdenDetaProdu(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ordendetaproduSessionBean=new OrdenDetaProduSessionBean();
		this.ordendetaproduSessionBean.setConGuardarRelaciones(false);
		this.ordendetaproduSessionBean.setEsGuardarRelacionado(true);

		this.ordendetaproduBeanSwingJInternalFrame=null;//new OrdenDetaProduBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ordendetaproduBeanSwingJInternalFramePopup=new OrdenDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ordendetaproduBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {

				OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL=OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL;
				OrdenDetaProduJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=OrdenProduJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ordendetaproduSessionBean.setEsGuardarRelacionado(true);

				this.ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ordendetaproduBeanSwingJInternalFrame.setordendetaproduSessionBean(this.ordendetaproduSessionBean);

				//this.gridBagConstraintsOrdenProdu = new GridBagConstraints();
				//this.gridBagConstraintsOrdenProdu.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsOrdenProdu.gridx = 0;
				//this.jContentPaneDetalleOrdenProdu.add(this.ordendetaproduBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsOrdenProdu);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesOrdenProdu.add("Orden Detalle Producciones",this.ordendetaproduBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesOrdenProdu.setComponentAt(iIndexTab,this.ordendetaproduBeanSwingJInternalFrame.getContentPane());
				}

				//OrdenDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ordendetaproduSessionBean.setEsGuardarRelacionado(false);
				this.ordendetaproduBeanSwingJInternalFrame=null;//new OrdenDetaProduBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ordendetaproduSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteOrdenDetaProdu) {
					this.jTabbedPaneRelacionesOrdenProdu.add("Orden Detalle Producciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarOrdenDetaProduBeanSwingJInternalFrame(List<OrdenProdu> ordenprodus,OrdenProdu ordenprodu,OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ordendetaproduBeanSwingJInternalFrame.getOrdenDetaProduLogic().setConnexion(this.ordenproduLogic.getConnexion());

					ordendetaproduBeanSwingJInternalFrame.setordenprodusForeignKey(ordenprodus);
					ordendetaproduBeanSwingJInternalFrame.setordenproduForeignKey(ordenprodu);
					ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.setisBusquedaDesdeForeignKeySesionOrdenProdu(true);
					ordendetaproduBeanSwingJInternalFrame.ordendetaproduSessionBean.setlidOrdenProduActual(ordenprodu.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ordendetaproduBeanSwingJInternalFrame.cargarCombosForeignKeyOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrame.isCargarCombosDependencia);
					ordendetaproduBeanSwingJInternalFrame.setVisibilidadBusquedasParaOrdenProdu(true);
					ordendetaproduBeanSwingJInternalFrame.setid_orden_produFK_IdOrdenProdu(ordenprodu.getId());

					if(!this.conCargarFormDetalle) {
						ordendetaproduBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ordendetaproduBeanSwingJInternalFrame.setSelectedItemCombosFrameOrdenProduForeignKey(ordenprodu,1,false,true,true);
					ordendetaproduBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ordendetaproduBeanSwingJInternalFrame.procesarBusqueda("FK_IdOrdenProdu");
					ordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdOrdenProdu");
					ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu(true);
					ordendetaproduBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesOrdenDetaProdu("n",ordendetaproduBeanSwingJInternalFrame.isGuardarCambiosEnLote, ordendetaproduBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ordendetaproduBeanSwingJInternalFrame.setAutoscrolls(true);
					ordendetaproduBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ordendetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenDetaProdu("relacionado");
					} else {
						ordendetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsOrdenDetaProdu("no_relacionado");
					}

					ordendetaproduBeanSwingJInternalFrame.getjButtonRecargarInformacionOrdenDetaProdu().setVisible(false);

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
