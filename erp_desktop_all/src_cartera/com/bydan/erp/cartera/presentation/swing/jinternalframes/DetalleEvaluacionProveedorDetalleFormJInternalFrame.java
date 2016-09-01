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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleEvaluacionProveedorConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleEvaluacionProveedorDetalleFormJInternalFrame extends DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleEvaluacionProveedor;
	
	protected JMenuBar jmenuBarDetalleDetalleEvaluacionProveedor;
	
	protected JMenu jmenuDetalleDetalleEvaluacionProveedor;
	protected JMenu jmenuDetalleArchivoDetalleEvaluacionProveedor;
	protected JMenu jmenuDetalleAccionesDetalleEvaluacionProveedor;
	protected JMenu jmenuDetalleDatosDetalleEvaluacionProveedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleEvaluacionProveedor;	
	protected GridBagConstraints gridBagConstraintsDetalleEvaluacionProveedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleEvaluacionProveedor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected EvaluacionProveedorBeanSwingJInternalFrame evaluacionproveedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_evaluacionproveedor="";

	protected PreguntaEvaluacionBeanSwingJInternalFrame preguntaevaluacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_preguntaevaluacion="";

	protected SubPreguntaEvaluacionBeanSwingJInternalFrame subpreguntaevaluacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subpreguntaevaluacion="";

	protected SiNoBeanSwingJInternalFrame sinoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sino="";
	
	public DetalleEvaluacionProveedorSessionBean detalleevaluacionproveedorSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public EvaluacionProveedorSessionBean evaluacionproveedorSessionBean;
	public PreguntaEvaluacionSessionBean preguntaevaluacionSessionBean;
	public SubPreguntaEvaluacionSessionBean subpreguntaevaluacionSessionBean;
	public SiNoSessionBean sinoSessionBean;	
	
	public DetalleEvaluacionProveedorLogic detalleevaluacionproveedorLogic;
	
	public JScrollPane jScrollPanelDatosDetalleEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosEdicionDetalleEvaluacionProveedor;
	public JScrollPane jScrollPanelDatosGeneralDetalleEvaluacionProveedor;
	
	protected JPanel jPanelCamposDetalleEvaluacionProveedor;    
	protected JPanel jPanelCamposOcultosDetalleEvaluacionProveedor;    	
	protected JPanel jPanelAccionesDetalleEvaluacionProveedor;
	protected JPanel jPanelAccionesFormularioDetalleEvaluacionProveedor;
    
	
	
	protected Integer iXPanelCamposDetalleEvaluacionProveedor=0;
	protected Integer iYPanelCamposDetalleEvaluacionProveedor=0;
	
	protected Integer iXPanelCamposOcultosDetalleEvaluacionProveedor=0;
	protected Integer iYPanelCamposOcultosDetalleEvaluacionProveedor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleEvaluacionProveedor;
	public JButton jButtonModificarDetalleEvaluacionProveedor;
	public JButton jButtonActualizarDetalleEvaluacionProveedor;
    public JButton jButtonEliminarDetalleEvaluacionProveedor;
	public JButton jButtonCancelarDetalleEvaluacionProveedor;
    public JButton jButtonGuardarCambiosDetalleEvaluacionProveedor;
	public JButton jButtonGuardarCambiosTablaDetalleEvaluacionProveedor;
	protected JButton jButtonCerrarDetalleEvaluacionProveedor;
	
	
	protected JButton jButtonProcesarInformacionDetalleEvaluacionProveedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonModificarToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonActualizarToolBarDetalleEvaluacionProveedor;
    protected JButton jButtonEliminarToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonCancelarToolBarDetalleEvaluacionProveedor;
    protected JButton jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleEvaluacionProveedor;
	protected JButton jButtonCerrarToolBarDetalleEvaluacionProveedor;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleEvaluacionProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemModificarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemActualizarDetalleEvaluacionProveedor;
    protected JMenuItem jMenuItemEliminarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemCancelarDetalleEvaluacionProveedor;
    protected JMenuItem jMenuItemGuardarCambiosDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemCerrarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleCerrarDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleEvaluacionProveedor;
	protected JMenuItem jMenuItemMostrarOcultarDetalleEvaluacionProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleEvaluacionProveedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleEvaluacionProveedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleEvaluacionProveedor;
	public JLabel jLabelIdDetalleEvaluacionProveedor;
	public JLabel jLabelidDetalleEvaluacionProveedor;
	public JButton jButtonidDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleEvaluacionProveedor;
	public JLabel jLabeldescripcionDetalleEvaluacionProveedor;
	public JTextArea jTextAreadescripcionDetalleEvaluacionProveedor;
	public JScrollPane jscrollPanedescripcionDetalleEvaluacionProveedor;
	public JButton jButtondescripcionDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleEvaluacionProveedor;
	public JLabel jLabelid_empresaDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleEvaluacionProveedor;
	public JButton jButtonid_empresaDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_empresaDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleEvaluacionProveedor;
	public JLabel jLabelid_sucursalDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleEvaluacionProveedor;
	public JButton jButtonid_sucursalDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_sucursalDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleEvaluacionProveedor;
	public JLabel jLabelid_ejercicioDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleEvaluacionProveedor;
	public JButton jButtonid_ejercicioDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleEvaluacionProveedor;
	public JLabel jLabelid_periodoDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleEvaluacionProveedor;
	public JButton jButtonid_periodoDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_periodoDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor;
	public JLabel jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor;
	public JButton jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor;
	public JLabel jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor;
	public JButton jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor;
	public JLabel jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor;
	public JButton jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_si_noDetalleEvaluacionProveedor;
	public JLabel jLabelid_si_noDetalleEvaluacionProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_si_noDetalleEvaluacionProveedor;
	public JButton jButtonid_si_noDetalleEvaluacionProveedor= new JButtonMe();
	public JButton jButtonid_si_noDetalleEvaluacionProveedorUpdate= new JButtonMe();
	public JButton jButtonid_si_noDetalleEvaluacionProveedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleEvaluacionProveedor;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleEvaluacionProveedor=new JPanel();
				this.jPanelAccionesFormularioDetalleEvaluacionProveedor=new JPanel();
				this.jmenuBarDetalleDetalleEvaluacionProveedor=new JMenuBar();
				this.jTtoolBarDetalleDetalleEvaluacionProveedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleEvaluacionProveedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleEvaluacionProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleEvaluacionProveedor() {
		return this.jButtonActualizarToolBarDetalleEvaluacionProveedor;
	}
	
	public JButton getjButtonEliminarToolBarDetalleEvaluacionProveedor() {
		return this.jButtonEliminarToolBarDetalleEvaluacionProveedor;
	}
	
	public JButton getjButtonCancelarToolBarDetalleEvaluacionProveedor() {
		return this.jButtonCancelarToolBarDetalleEvaluacionProveedor;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleEvaluacionProveedor() {
		return this.jButtonProcesarInformacionDetalleEvaluacionProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleEvaluacionProveedor)	{
		this.jButtonProcesarInformacionDetalleEvaluacionProveedor = jButtonProcesarInformacionDetalleEvaluacionProveedor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposAccionesDetalleEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposRelacionesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposRelacionesDetalleEvaluacionProveedor = jComboBoxTiposRelacionesDetalleEvaluacionProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposAccionesDetalleEvaluacionProveedor) {
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor = jComboBoxTiposAccionesDetalleEvaluacionProveedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor() {
		return this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor(
			JComboBox jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor) {
		this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor = jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleevaluacionproveedorSessionBean=new DetalleEvaluacionProveedorSessionBean();
		
		this.detalleevaluacionproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleevaluacionproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleEvaluacionProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleEvaluacionProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Evaluacion Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleEvaluacionProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleEvaluacionProveedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleEvaluacionProveedor=new JButtonMe();
				this.jButtonModificarToolBarDetalleEvaluacionProveedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleDetalleEvaluacionProveedor,
							"actualizar","actualizar","Actualizar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleDetalleEvaluacionProveedor,
							"eliminar","eliminar","Eliminar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleDetalleEvaluacionProveedor,
							"cancelar","cancelar","Cancelar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleEvaluacionProveedor,this.jTtoolBarDetalleDetalleEvaluacionProveedor,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleEvaluacionProveedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleEvaluacionProveedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleEvaluacionProveedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleEvaluacionProveedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleEvaluacionProveedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleEvaluacionProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleEvaluacionProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleEvaluacionProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleEvaluacionProveedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleEvaluacionProveedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleEvaluacionProveedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleEvaluacionProveedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleEvaluacionProveedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleEvaluacionProveedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleEvaluacionProveedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleEvaluacionProveedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleEvaluacionProveedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleEvaluacionProveedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleEvaluacionProveedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleEvaluacionProveedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleEvaluacionProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleEvaluacionProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleEvaluacionProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleEvaluacionProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleEvaluacionProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleEvaluacionProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleEvaluacionProveedor.add(this.jMenuItemDetalleCerrarDetalleEvaluacionProveedor);
		
		this.jmenuDetalleAccionesDetalleEvaluacionProveedor.add(this.jMenuItemActualizarDetalleEvaluacionProveedor);
		this.jmenuDetalleAccionesDetalleEvaluacionProveedor.add(this.jMenuItemEliminarDetalleEvaluacionProveedor);
		this.jmenuDetalleAccionesDetalleEvaluacionProveedor.add(this.jMenuItemCancelarDetalleEvaluacionProveedor);		
		
		//this.jmenuDetalleDatosDetalleEvaluacionProveedor.add(this.jMenuItemDetalleAbrirOrderByDetalleEvaluacionProveedor);				
		this.jmenuDetalleDatosDetalleEvaluacionProveedor.add(this.jMenuItemDetalleMostarOcultarDetalleEvaluacionProveedor);				
				
		//this.jmenuDetalleAccionesDetalleEvaluacionProveedor.add(this.jMenuItemGuardarCambiosDetalleEvaluacionProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleEvaluacionProveedor.add(this.jmenuDetalleArchivoDetalleEvaluacionProveedor);		
		this.jmenuBarDetalleDetalleEvaluacionProveedor.add(this.jmenuDetalleAccionesDetalleEvaluacionProveedor);		
		this.jmenuBarDetalleDetalleEvaluacionProveedor.add(this.jmenuDetalleDatosDetalleEvaluacionProveedor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleEvaluacionProveedor);				
	}
	
	
	public void inicializarElementosCamposDetalleEvaluacionProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleEvaluacionProveedor = new JLabelMe();
		jLabelIdDetalleEvaluacionProveedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleEvaluacionProveedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleEvaluacionProveedor= new GridBagLayout();

		this.jPanelidDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);

		jLabelidDetalleEvaluacionProveedor = new JLabel();
		jLabelidDetalleEvaluacionProveedor.setText("Id");

		jLabelidDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabeldescripcionDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetalleEvaluacionProveedor.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPaneldescripcionDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jTextAreadescripcionDetalleEvaluacionProveedor= new JTextAreaMe();
		jTextAreadescripcionDetalleEvaluacionProveedor.setEnabled(false);
		jTextAreadescripcionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleEvaluacionProveedor.setLineWrap(true);
		jTextAreadescripcionDetalleEvaluacionProveedor.setWrapStyleWord(true);
		jTextAreadescripcionDetalleEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleEvaluacionProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleEvaluacionProveedor = new JScrollPane(jTextAreadescripcionDetalleEvaluacionProveedor);
		jscrollPanedescripcionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleEvaluacionProveedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleEvaluacionProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_empresaDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleEvaluacionProveedor.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_empresaDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_empresaDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_empresaDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleEvaluacionProveedor.setEnabled(false);

		this.jButtonid_empresaDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_empresaDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_empresaDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleEvaluacionProveedor"));

		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_empresaDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_sucursalDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_sucursalDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleEvaluacionProveedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_sucursalDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_sucursalDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_sucursalDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleEvaluacionProveedor.setEnabled(false);

		this.jButtonid_sucursalDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_sucursalDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_sucursalDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleEvaluacionProveedor"));

		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_ejercicioDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_ejercicioDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleEvaluacionProveedor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_ejercicioDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_ejercicioDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.setEnabled(false);

		this.jButtonid_ejercicioDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_ejercicioDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_ejercicioDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleEvaluacionProveedor"));

		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_periodoDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_periodoDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleEvaluacionProveedor.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_periodoDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_periodoDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_periodoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleEvaluacionProveedor.setEnabled(false);

		this.jButtonid_periodoDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_periodoDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_periodoDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleEvaluacionProveedor"));

		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_periodoDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR+" : *");
		this.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor.setToolTipText("Evaluacion Proveedor");
		this.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDEVALUACIONPROVEEDOR);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_proveedorDetalleEvaluacionProveedor"));

		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_evaluacion_proveedorDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION+" : *");
		this.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor.setToolTipText("Pregunta Evaluacion");
		this.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDPREGUNTAEVALUACION);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_evaluacionDetalleEvaluacionProveedor"));

		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION+" : *");
		this.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setToolTipText("Sub Pregunta Evaluacion");
		this.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSUBPREGUNTAEVALUACION);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedor"));

		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate"));



					
		this.jLabelid_si_noDetalleEvaluacionProveedor = new JLabelMe();
		this.jLabelid_si_noDetalleEvaluacionProveedor.setText(""+DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO+" : *");
		this.jLabelid_si_noDetalleEvaluacionProveedor.setToolTipText("Si No");
		this.jLabelid_si_noDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_si_noDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_si_noDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_si_noDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_si_noDetalleEvaluacionProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_si_noDetalleEvaluacionProveedor.setToolTipText(DetalleEvaluacionProveedorConstantesFunciones.LABEL_IDSINO);
		this.gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		this.jPanelid_si_noDetalleEvaluacionProveedor.setLayout(this.gridaBagLayoutDetalleEvaluacionProveedor);


		jComboBoxid_si_noDetalleEvaluacionProveedor= new JComboBoxMe();
		jComboBoxid_si_noDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_si_noDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_si_noDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_si_noDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_si_noDetalleEvaluacionProveedor= new JButtonMe();
		this.jButtonid_si_noDetalleEvaluacionProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_si_noDetalleEvaluacionProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_si_noDetalleEvaluacionProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_si_noDetalleEvaluacionProveedor.setText("Buscar");
		this.jButtonid_si_noDetalleEvaluacionProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_si_noDetalleEvaluacionProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_si_noDetalleEvaluacionProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_si_noDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_si_noDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_si_noDetalleEvaluacionProveedor"));

		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda= new JButtonMe();
		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setText("U");
		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_si_noDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_si_noDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_si_noDetalleEvaluacionProveedorBusqueda"));

		if(this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_si_noDetalleEvaluacionProveedorBusqueda.setVisible(false);		}

		this.jButtonid_si_noDetalleEvaluacionProveedorUpdate= new JButtonMe();
		this.jButtonid_si_noDetalleEvaluacionProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_si_noDetalleEvaluacionProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_si_noDetalleEvaluacionProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_si_noDetalleEvaluacionProveedorUpdate.setText("U");
		this.jButtonid_si_noDetalleEvaluacionProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_si_noDetalleEvaluacionProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_si_noDetalleEvaluacionProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_si_noDetalleEvaluacionProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_si_noDetalleEvaluacionProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_si_noDetalleEvaluacionProveedorUpdate"));



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
		//this.jInternalFrameDetalleDetalleEvaluacionProveedor = new DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Evaluacion Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleEvaluacionProveedor= new GridBagLayout();
		

		
		String sToolTipDetalleEvaluacionProveedor="";
		sToolTipDetalleEvaluacionProveedor=DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleEvaluacionProveedor+="(Cartera.DetalleEvaluacionProveedor)";
		}
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleEvaluacionProveedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonModificarDetalleEvaluacionProveedor = new JButtonMe();
        this.jButtonActualizarDetalleEvaluacionProveedor = new JButtonMe();
        this.jButtonEliminarDetalleEvaluacionProveedor = new JButtonMe();
        this.jButtonCancelarDetalleEvaluacionProveedor = new JButtonMe();
        this.jButtonGuardarCambiosDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor = new JButtonMe();
		this.jButtonCerrarDetalleEvaluacionProveedor = new JButtonMe();
		
		this.jScrollPanelDatosDetalleEvaluacionProveedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Evaluacion Proveedor";
		
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Evaluacion Proveedores" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleEvaluacionProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleEvaluacionProveedor.setName("jPanelCamposDetalleEvaluacionProveedor"); 

		this.jPanelCamposOcultosDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleEvaluacionProveedor.setName("jPanelCamposOcultosDetalleEvaluacionProveedor"); 

        this.jPanelAccionesDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleEvaluacionProveedor.setToolTipText("Acciones");
        this.jPanelAccionesDetalleEvaluacionProveedor.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleEvaluacionProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleEvaluacionProveedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleEvaluacionProveedor.setText("Nuevo");
		this.jButtonModificarDetalleEvaluacionProveedor.setText("Editar");
        this.jButtonActualizarDetalleEvaluacionProveedor.setText("Actualizar");
        this.jButtonEliminarDetalleEvaluacionProveedor.setText("Eliminar");
        this.jButtonCancelarDetalleEvaluacionProveedor.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleEvaluacionProveedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.setText("Guardar");
		this.jButtonCerrarDetalleEvaluacionProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleEvaluacionProveedor,"nuevo_button","Nuevo",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleEvaluacionProveedor,"modificar_button","Editar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleEvaluacionProveedor,"actualizar_button","Actualizar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleEvaluacionProveedor,"eliminar_button","Eliminar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleEvaluacionProveedor,"cancelar_button","Cancelar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleEvaluacionProveedor,"guardarcambios_button","Guardar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor,"guardarcambiostabla_button","Guardar",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleEvaluacionProveedor,"cerrar_button","Salir",this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleEvaluacionProveedor.setToolTipText("Nuevo"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleEvaluacionProveedor.setToolTipText("Editar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleEvaluacionProveedor.setToolTipText("Actualizar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleEvaluacionProveedor.setToolTipText("Eliminar)"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleEvaluacionProveedor.setToolTipText("Cancelar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleEvaluacionProveedor.setToolTipText("Guardar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.setToolTipText("Guardar"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleEvaluacionProveedor.setToolTipText("Salir"+" "+DetalleEvaluacionProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleEvaluacionProveedor";
		inputMap = this.jButtonNuevoDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleEvaluacionProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleEvaluacionProveedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleEvaluacionProveedor";
		inputMap = this.jButtonActualizarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleEvaluacionProveedor"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleEvaluacionProveedor";
		inputMap = this.jButtonEliminarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleEvaluacionProveedor"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleEvaluacionProveedor";
		inputMap = this.jButtonCancelarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleEvaluacionProveedor"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleEvaluacionProveedor";
		inputMap = this.jButtonCerrarDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleEvaluacionProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleEvaluacionProveedor";
		inputMap = this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleEvaluacionProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleEvaluacionProveedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor.setToolTipText("Nuevo DetalleEvaluacionProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor.setToolTipText("Sin Cerrar Ventana DetalleEvaluacionProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setText("Accion");
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleEvaluacionProveedor = new JLabelMe();
		
		this.jLabelAccionesDetalleEvaluacionProveedor.setText("Acciones");		
		this.jLabelAccionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleEvaluacionProveedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleEvaluacionProveedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleEvaluacionProveedor=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleEvaluacionProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleEvaluacionProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleEvaluacionProveedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleEvaluacionProveedor = new GridBagLayout();
		
		this.jPanelCamposDetalleEvaluacionProveedor.setLayout(gridaBagLayoutCamposDetalleEvaluacionProveedor);
		this.jPanelCamposOcultosDetalleEvaluacionProveedor.setLayout(gridaBagLayoutCamposOcultosDetalleEvaluacionProveedor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleEvaluacionProveedor.add(jLabelIdDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleEvaluacionProveedor.add(jLabelidDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleEvaluacionProveedor.add(jLabelid_empresaDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleEvaluacionProveedor.add(jButtonid_empresaDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleEvaluacionProveedor.add(jButtonid_empresaDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleEvaluacionProveedor.add(jComboBoxid_empresaDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleEvaluacionProveedor.add(jLabelid_sucursalDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleEvaluacionProveedor.add(jButtonid_sucursalDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleEvaluacionProveedor.add(jButtonid_sucursalDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleEvaluacionProveedor.add(jComboBoxid_sucursalDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleEvaluacionProveedor.add(jLabelid_ejercicioDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleEvaluacionProveedor.add(jButtonid_ejercicioDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleEvaluacionProveedor.add(jButtonid_ejercicioDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleEvaluacionProveedor.add(jComboBoxid_ejercicioDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleEvaluacionProveedor.add(jLabelid_periodoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleEvaluacionProveedor.add(jButtonid_periodoDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleEvaluacionProveedor.add(jButtonid_periodoDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleEvaluacionProveedor.add(jComboBoxid_periodoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.add(jLabelid_evaluacion_proveedorDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.add(jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.add(jButtonid_evaluacion_proveedorDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor.add(jComboBoxid_evaluacion_proveedorDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.add(jLabelid_pregunta_evaluacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.add(jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.add(jButtonid_pregunta_evaluacionDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor.add(jComboBoxid_pregunta_evaluacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.add(jLabelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.add(jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.add(jButtonid_sub_pregunta_evaluacionDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor.add(jComboBoxid_sub_pregunta_evaluacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_si_noDetalleEvaluacionProveedor.add(jLabelid_si_noDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_si_noDetalleEvaluacionProveedor.add(jButtonid_si_noDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 3;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_si_noDetalleEvaluacionProveedor.add(jButtonid_si_noDetalleEvaluacionProveedorUpdate, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_si_noDetalleEvaluacionProveedor.add(jComboBoxid_si_noDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleEvaluacionProveedor.add(jLabeldescripcionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		//this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 2;
		this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleEvaluacionProveedor.add(jButtondescripcionDetalleEvaluacionProveedorBusqueda, this.gridBagConstraintsDetalleEvaluacionProveedor);
	}

	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 1;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleEvaluacionProveedor.add(jscrollPanedescripcionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionProveedor.add(this.jPanelidDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposDetalleEvaluacionProveedor=0;
		iYPanelCamposDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionProveedor.add(this.jPanelid_evaluacion_proveedorDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposDetalleEvaluacionProveedor=0;
		iYPanelCamposDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionProveedor.add(this.jPanelid_pregunta_evaluacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposDetalleEvaluacionProveedor=0;
		iYPanelCamposDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionProveedor.add(this.jPanelid_sub_pregunta_evaluacionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposDetalleEvaluacionProveedor=0;
		iYPanelCamposDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionProveedor.add(this.jPanelid_si_noDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposDetalleEvaluacionProveedor=0;
		iYPanelCamposDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleEvaluacionProveedor.add(this.jPaneldescripcionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposDetalleEvaluacionProveedor=0;
		iYPanelCamposDetalleEvaluacionProveedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposOcultosDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposOcultosDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleEvaluacionProveedor.add(this.jPanelid_empresaDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposOcultosDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosDetalleEvaluacionProveedor=0;
		iYPanelCamposOcultosDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposOcultosDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposOcultosDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleEvaluacionProveedor.add(this.jPanelid_sucursalDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposOcultosDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosDetalleEvaluacionProveedor=0;
		iYPanelCamposOcultosDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposOcultosDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposOcultosDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleEvaluacionProveedor.add(this.jPanelid_ejercicioDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposOcultosDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosDetalleEvaluacionProveedor=0;
		iYPanelCamposOcultosDetalleEvaluacionProveedor++;
	}
	this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iYPanelCamposOcultosDetalleEvaluacionProveedor;
	this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iXPanelCamposOcultosDetalleEvaluacionProveedor++;
	this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleEvaluacionProveedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleEvaluacionProveedor.add(this.jPanelid_periodoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);



	if(iXPanelCamposOcultosDetalleEvaluacionProveedor % 1==0) {
		iXPanelCamposOcultosDetalleEvaluacionProveedor=0;
		iYPanelCamposOcultosDetalleEvaluacionProveedor++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleEvaluacionProveedor= new GridBagLayout();
		this.jPanelAccionesDetalleEvaluacionProveedor.setLayout(gridaBagLayoutAccionesDetalleEvaluacionProveedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleEvaluacionProveedor= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleEvaluacionProveedor.setLayout(gridaBagLayoutAccionesFormularioDetalleEvaluacionProveedor);
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleEvaluacionProveedor.add(this.jComboBoxTiposAccionesFormularioDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleEvaluacionProveedor.add(this.jCheckBoxPostAccionNuevoDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleEvaluacionProveedor.add(this.jCheckBoxPostAccionSinCerrarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleevaluacionproveedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleEvaluacionProveedor.add(this.jCheckBoxPostAccionSinMensajeDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleEvaluacionProveedor.add(this.jButtonModificarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);							

		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleEvaluacionProveedor.add(this.jButtonEliminarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
			
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleEvaluacionProveedor.add(this.jButtonActualizarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);


		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleEvaluacionProveedor.add(this.jButtonGuardarCambiosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);	
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = 0;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleEvaluacionProveedor.add(this.jButtonCancelarDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleEvaluacionProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleEvaluacionProveedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleevaluacionproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();						
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;		
			//this.gridBagConstraintsDetalleEvaluacionProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleEvaluacionProveedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =0;
		this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleEvaluacionProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleEvaluacionProveedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleEvaluacionProveedor = new DetalleEvaluacionProveedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Evaluacion Proveedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Evaluacion Proveedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Evaluacion Proveedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleEvaluacionProveedorModel detalleevaluacionproveedorModel=new DetalleEvaluacionProveedorModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleEvaluacionProveedorModel.DetalleEvaluacionProveedorFocusTraversalPolicy detalleevaluacionproveedorFocusTraversalPolicy = detalleevaluacionproveedorModel.new DetalleEvaluacionProveedorFocusTraversalPolicy(this);
			
			//detalleevaluacionproveedorFocusTraversalPolicy.setdetalleevaluacionproveedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleevaluacionproveedorModel);
			
			
			this.jContentPaneDetalleDetalleEvaluacionProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleEvaluacionProveedor = new GridBagLayout();	
			this.jContentPaneDetalleDetalleEvaluacionProveedor.setLayout(gridaBagLayoutDetalleDetalleEvaluacionProveedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleEvaluacionProveedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
				this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleEvaluacionProveedor.add(jTtoolBarDetalleDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor=   new JScrollPane(jContentPaneDetalleDetalleEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	        
			this.jContentPaneDetalleDetalleEvaluacionProveedor.add(jPanelCamposDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);
			
			
			
			
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
						&& detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleevaluacionproveedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleEvaluacionProveedor= new GridBagConstraints();
						this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
						this.jContentPaneDetalleDetalleEvaluacionProveedor.add(this.jTabbedPaneRelacionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleEvaluacionProveedor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleEvaluacionProveedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
					this.gridBagConstraintsDetalleEvaluacionProveedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleEvaluacionProveedor.add(jPanelCamposOcultosDetalleEvaluacionProveedor, gridBagConstraintsDetalleEvaluacionProveedor);
				
					this.jPanelCamposOcultosDetalleEvaluacionProveedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	        this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleEvaluacionProveedor.add(this.jPanelAccionesFormularioDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);							
			
			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
	        this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleEvaluacionProveedor.add(this.jPanelAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleEvaluacionProveedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor=   new JScrollPane(this.jPanelCamposDetalleEvaluacionProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
			this.gridBagConstraintsDetalleEvaluacionProveedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleEvaluacionProveedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleEvaluacionProveedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);			
			
			this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
			
			
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		
			
		this.gridBagConstraintsDetalleEvaluacionProveedor = new GridBagConstraints();
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleEvaluacionProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleEvaluacionProveedor, this.gridBagConstraintsDetalleEvaluacionProveedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleEvaluacionProveedor;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleEvaluacionProveedor;
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
