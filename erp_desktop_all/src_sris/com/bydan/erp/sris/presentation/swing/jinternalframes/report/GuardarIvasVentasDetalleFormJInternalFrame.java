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
package com.bydan.erp.sris.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.report.*;
import com.bydan.erp.sris.util.report.GuardarIvasVentasConstantesFunciones;

import com.bydan.erp.sris.business.logic.report.*;
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
public class GuardarIvasVentasDetalleFormJInternalFrame extends GuardarIvasVentasBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleGuardarIvasVentas;
	
	protected JMenuBar jmenuBarDetalleGuardarIvasVentas;
	
	protected JMenu jmenuDetalleGuardarIvasVentas;
	protected JMenu jmenuDetalleArchivoGuardarIvasVentas;
	protected JMenu jmenuDetalleAccionesGuardarIvasVentas;
	protected JMenu jmenuDetalleDatosGuardarIvasVentas;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGuardarIvasVentas;	
	protected GridBagConstraints gridBagConstraintsGuardarIvasVentas;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected GuardarIvasVentasBeanSwingJInternalFrameAdditional jInternalFrameDetalleGuardarIvasVentas;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuenteivaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuenteiva="";
	
	public GuardarIvasVentasSessionBean guardarivasventasSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public TipoRetencionSessionBean tiporetencionfuenteivaSessionBean;	
	
	public GuardarIvasVentasLogic guardarivasventasLogic;
	
	public JScrollPane jScrollPanelDatosGuardarIvasVentas;
	public JScrollPane jScrollPanelDatosEdicionGuardarIvasVentas;
	public JScrollPane jScrollPanelDatosGeneralGuardarIvasVentas;
	
	protected JPanel jPanelCamposGuardarIvasVentas;    
	protected JPanel jPanelCamposOcultosGuardarIvasVentas;    	
	protected JPanel jPanelAccionesGuardarIvasVentas;
	protected JPanel jPanelAccionesFormularioGuardarIvasVentas;
    
	
	
	protected Integer iXPanelCamposGuardarIvasVentas=0;
	protected Integer iYPanelCamposGuardarIvasVentas=0;
	
	protected Integer iXPanelCamposOcultosGuardarIvasVentas=0;
	protected Integer iYPanelCamposOcultosGuardarIvasVentas=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoGuardarIvasVentas;
	public JButton jButtonModificarGuardarIvasVentas;
	public JButton jButtonActualizarGuardarIvasVentas;
    public JButton jButtonEliminarGuardarIvasVentas;
	public JButton jButtonCancelarGuardarIvasVentas;
    public JButton jButtonGuardarCambiosGuardarIvasVentas;
	public JButton jButtonGuardarCambiosTablaGuardarIvasVentas;
	protected JButton jButtonCerrarGuardarIvasVentas;
	
	
	protected JButton jButtonProcesarInformacionGuardarIvasVentas;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoGuardarIvasVentas;
	protected JCheckBox jCheckBoxPostAccionSinCerrarGuardarIvasVentas;
	protected JCheckBox jCheckBoxPostAccionSinMensajeGuardarIvasVentas;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGuardarIvasVentas;
	protected JButton jButtonModificarToolBarGuardarIvasVentas;
	protected JButton jButtonActualizarToolBarGuardarIvasVentas;
    protected JButton jButtonEliminarToolBarGuardarIvasVentas;
	protected JButton jButtonCancelarToolBarGuardarIvasVentas;
    protected JButton jButtonGuardarCambiosToolBarGuardarIvasVentas;
	protected JButton jButtonGuardarCambiosTablaToolBarGuardarIvasVentas;
	protected JButton jButtonMostrarOcultarTablaToolBarGuardarIvasVentas;
	protected JButton jButtonCerrarToolBarGuardarIvasVentas;
	
	protected JButton jButtonProcesarInformacionToolBarGuardarIvasVentas;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGuardarIvasVentas;
	protected JMenuItem jMenuItemModificarGuardarIvasVentas;
	protected JMenuItem jMenuItemActualizarGuardarIvasVentas;
    protected JMenuItem jMenuItemEliminarGuardarIvasVentas;
	protected JMenuItem jMenuItemCancelarGuardarIvasVentas;
    protected JMenuItem jMenuItemGuardarCambiosGuardarIvasVentas;
	protected JMenuItem jMenuItemGuardarCambiosTablaGuardarIvasVentas;
	protected JMenuItem jMenuItemCerrarGuardarIvasVentas;
	protected JMenuItem jMenuItemDetalleCerrarGuardarIvasVentas;
	protected JMenuItem jMenuItemDetalleMostarOcultarGuardarIvasVentas;
	
	protected JMenuItem jMenuItemProcesarInformacionGuardarIvasVentas;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGuardarIvasVentas;
	protected JMenuItem jMenuItemMostrarOcultarGuardarIvasVentas;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGuardarIvasVentas;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGuardarIvasVentas;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioGuardarIvasVentas;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidGuardarIvasVentas;
	public JLabel jLabelIdGuardarIvasVentas;
	public JLabel jLabelidGuardarIvasVentas;
	public JButton jButtonidGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_estado_asiento_contableGuardarIvasVentas;
	public JLabel jLabelcodigo_estado_asiento_contableGuardarIvasVentas;
	public JTextField jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas;
	public JButton jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_periodoGuardarIvasVentas;
	public JLabel jLabelnombre_periodoGuardarIvasVentas;
	public JTextField jTextFieldnombre_periodoGuardarIvasVentas;
	public JButton jButtonnombre_periodoGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas;
	public JLabel jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas;
	public JTextArea jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas;
	public JScrollPane jscrollPanenombre_tipo_retencion_fuente_ivaGuardarIvasVentas;
	public JButton jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeGuardarIvasVentas;
	public JLabel jLabelporcentajeGuardarIvasVentas;
	public JTextField jTextFieldporcentajeGuardarIvasVentas;
	public JButton jButtonporcentajeGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelbase_imponibleGuardarIvasVentas;
	public JLabel jLabelbase_imponibleGuardarIvasVentas;
	public JTextField jTextFieldbase_imponibleGuardarIvasVentas;
	public JButton jButtonbase_imponibleGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelvalorGuardarIvasVentas;
	public JLabel jLabelvalorGuardarIvasVentas;
	public JTextField jTextFieldvalorGuardarIvasVentas;
	public JButton jButtonvalorGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelnumeroGuardarIvasVentas;
	public JLabel jLabelnumeroGuardarIvasVentas;
	public JTextField jTextFieldnumeroGuardarIvasVentas;
	public JButton jButtonnumeroGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelruc_benefGuardarIvasVentas;
	public JLabel jLabelruc_benefGuardarIvasVentas;
	public JTextField jTextFieldruc_benefGuardarIvasVentas;
	public JButton jButtonruc_benefGuardarIvasVentasBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaGuardarIvasVentas;
	public JLabel jLabelid_empresaGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaGuardarIvasVentas;
	public JButton jButtonid_empresaGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_empresaGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_empresaGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioGuardarIvasVentas;
	public JLabel jLabelid_ejercicioGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioGuardarIvasVentas;
	public JButton jButtonid_ejercicioGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_ejercicioGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoGuardarIvasVentas;
	public JLabel jLabelid_periodoGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoGuardarIvasVentas;
	public JButton jButtonid_periodoGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_periodoGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_periodoGuardarIvasVentasBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas;
	public JLabel jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas;
	public JButton jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesGuardarIvasVentas;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public GuardarIvasVentasDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposGuardarIvasVentas=new JPanel();
				this.jPanelAccionesFormularioGuardarIvasVentas=new JPanel();
				this.jmenuBarDetalleGuardarIvasVentas=new JMenuBar();
				this.jTtoolBarDetalleGuardarIvasVentas=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public GuardarIvasVentasDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GuardarIvasVentasDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GuardarIvasVentas No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarGuardarIvasVentas() {
		return this.jButtonActualizarToolBarGuardarIvasVentas;
	}
	
	public JButton getjButtonEliminarToolBarGuardarIvasVentas() {
		return this.jButtonEliminarToolBarGuardarIvasVentas;
	}
	
	public JButton getjButtonCancelarToolBarGuardarIvasVentas() {
		return this.jButtonCancelarToolBarGuardarIvasVentas;
	}		
	
	public JButton getjButtonProcesarInformacionGuardarIvasVentas() {
		return this.jButtonProcesarInformacionGuardarIvasVentas;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGuardarIvasVentas)	{
		this.jButtonProcesarInformacionGuardarIvasVentas = jButtonProcesarInformacionGuardarIvasVentas;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGuardarIvasVentas() {
		return this.jComboBoxTiposAccionesGuardarIvasVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGuardarIvasVentas(
			JComboBox jComboBoxTiposRelacionesGuardarIvasVentas) {
		this.jComboBoxTiposRelacionesGuardarIvasVentas = jComboBoxTiposRelacionesGuardarIvasVentas;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGuardarIvasVentas(
			JComboBox jComboBoxTiposAccionesGuardarIvasVentas) {
		this.jComboBoxTiposAccionesGuardarIvasVentas = jComboBoxTiposAccionesGuardarIvasVentas;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioGuardarIvasVentas() {
		return this.jComboBoxTiposAccionesFormularioGuardarIvasVentas;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioGuardarIvasVentas(
			JComboBox jComboBoxTiposAccionesFormularioGuardarIvasVentas) {
		this.jComboBoxTiposAccionesFormularioGuardarIvasVentas = jComboBoxTiposAccionesFormularioGuardarIvasVentas;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.guardarivasventasSessionBean=new GuardarIvasVentasSessionBean();
		
		this.guardarivasventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.guardarivasventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.guardarivasventasSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GuardarIvasVentasJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GuardarIvasVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GuardarIvasVentasJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Guardar Ivas Ventas MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
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
	
		GuardarIvasVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleGuardarIvasVentas= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarGuardarIvasVentas=new JButtonMe();
				this.jButtonModificarToolBarGuardarIvasVentas=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarGuardarIvasVentas,this.jTtoolBarDetalleGuardarIvasVentas,
							"actualizar","actualizar","Actualizar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarGuardarIvasVentas,this.jTtoolBarDetalleGuardarIvasVentas,
							"eliminar","eliminar","Eliminar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarGuardarIvasVentas,this.jTtoolBarDetalleGuardarIvasVentas,
							"cancelar","cancelar","Cancelar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarGuardarIvasVentas=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarGuardarIvasVentas,this.jTtoolBarDetalleGuardarIvasVentas,
							"guardarcambios","guardarcambios","Guardar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleGuardarIvasVentas=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleGuardarIvasVentas=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoGuardarIvasVentas=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesGuardarIvasVentas=new JMenuMe("Acciones");
		this.jmenuDetalleDatosGuardarIvasVentas=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGuardarIvasVentas= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGuardarIvasVentas.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarIvasVentas,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarGuardarIvasVentas= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarGuardarIvasVentas.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarGuardarIvasVentas,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarGuardarIvasVentas= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarGuardarIvasVentas.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarGuardarIvasVentas,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarGuardarIvasVentas= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarGuardarIvasVentas.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarGuardarIvasVentas,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarGuardarIvasVentas= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarGuardarIvasVentas.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarGuardarIvasVentas,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosGuardarIvasVentas= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGuardarIvasVentas.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGuardarIvasVentas,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGuardarIvasVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGuardarIvasVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGuardarIvasVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarGuardarIvasVentas= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarGuardarIvasVentas.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarGuardarIvasVentas,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGuardarIvasVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGuardarIvasVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGuardarIvasVentas,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGuardarIvasVentas= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGuardarIvasVentas.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGuardarIvasVentas,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoGuardarIvasVentas.add(this.jMenuItemDetalleCerrarGuardarIvasVentas);
		
		this.jmenuDetalleAccionesGuardarIvasVentas.add(this.jMenuItemActualizarGuardarIvasVentas);
		this.jmenuDetalleAccionesGuardarIvasVentas.add(this.jMenuItemEliminarGuardarIvasVentas);
		this.jmenuDetalleAccionesGuardarIvasVentas.add(this.jMenuItemCancelarGuardarIvasVentas);		
		
		//this.jmenuDetalleDatosGuardarIvasVentas.add(this.jMenuItemDetalleAbrirOrderByGuardarIvasVentas);				
		this.jmenuDetalleDatosGuardarIvasVentas.add(this.jMenuItemDetalleMostarOcultarGuardarIvasVentas);				
				
		//this.jmenuDetalleAccionesGuardarIvasVentas.add(this.jMenuItemGuardarCambiosGuardarIvasVentas);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleGuardarIvasVentas.add(this.jmenuDetalleArchivoGuardarIvasVentas);		
		this.jmenuBarDetalleGuardarIvasVentas.add(this.jmenuDetalleAccionesGuardarIvasVentas);		
		this.jmenuBarDetalleGuardarIvasVentas.add(this.jmenuDetalleDatosGuardarIvasVentas);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleGuardarIvasVentas);				
	}
	
	
	public void inicializarElementosCamposGuardarIvasVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdGuardarIvasVentas = new JLabelMe();
		jLabelIdGuardarIvasVentas.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidGuardarIvasVentas = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutGuardarIvasVentas= new GridBagLayout();

		this.jPanelidGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);

		jLabelidGuardarIvasVentas = new JLabel();
		jLabelidGuardarIvasVentas.setText("Id");

		jLabelidGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_estado_asiento_contableGuardarIvasVentas = new JLabelMe();
		this.jLabelcodigo_estado_asiento_contableGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE+" : *");
		this.jLabelcodigo_estado_asiento_contableGuardarIvasVentas.setToolTipText("Codigo Estado Asiento Contable");
		this.jLabelcodigo_estado_asiento_contableGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_estado_asiento_contableGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_estado_asiento_contableGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_estado_asiento_contableGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_CODIGOESTADOASIENTOCONTABLE);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas= new JTextFieldMe();

		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setEnabled(false);
		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setText("U");
		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_estado_asiento_contableGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_periodoGuardarIvasVentas = new JLabelMe();
		this.jLabelnombre_periodoGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO+" : *");
		this.jLabelnombre_periodoGuardarIvasVentas.setToolTipText("Nombre Periodo");
		this.jLabelnombre_periodoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_periodoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_periodoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_periodoGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_periodoGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_periodoGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_NOMBREPERIODO);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelnombre_periodoGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldnombre_periodoGuardarIvasVentas= new JTextFieldMe();

		jTextFieldnombre_periodoGuardarIvasVentas.setEnabled(false);
		jTextFieldnombre_periodoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_periodoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_periodoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_periodoGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_periodoGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setText("U");
		this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_periodoGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_periodoGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_periodoGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_periodoGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_periodoGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas = new JLabelMe();
		this.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA+" : *");
		this.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setToolTipText("Nombre Tipo Retencion Fuente Iva");
		this.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_NOMBRETIPORETENCIONFUENTEIVA);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas= new JTextAreaMe();
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setEnabled(false);
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setLineWrap(true);
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setWrapStyleWord(true);
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tipo_retencion_fuente_ivaGuardarIvasVentas = new JScrollPane(jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas);
		jscrollPanenombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tipo_retencion_fuente_ivaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setText("U");
		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tipo_retencion_fuente_ivaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeGuardarIvasVentas = new JLabelMe();
		this.jLabelporcentajeGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeGuardarIvasVentas.setToolTipText("Porcentaje");
		this.jLabelporcentajeGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelporcentajeGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldporcentajeGuardarIvasVentas= new JTextFieldMe();
		jTextFieldporcentajeGuardarIvasVentas.setEnabled(false);
		jTextFieldporcentajeGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeGuardarIvasVentas.setText("0.0");

		this.jButtonporcentajeGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonporcentajeGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeGuardarIvasVentasBusqueda.setText("U");
		this.jButtonporcentajeGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelbase_imponibleGuardarIvasVentas = new JLabelMe();
		this.jLabelbase_imponibleGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE+" : *");
		this.jLabelbase_imponibleGuardarIvasVentas.setToolTipText("Base Imponible");
		this.jLabelbase_imponibleGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbase_imponibleGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbase_imponibleGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbase_imponibleGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbase_imponibleGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_BASEIMPONIBLE);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelbase_imponibleGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldbase_imponibleGuardarIvasVentas= new JTextFieldMe();
		jTextFieldbase_imponibleGuardarIvasVentas.setEnabled(false);
		jTextFieldbase_imponibleGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbase_imponibleGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbase_imponibleGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbase_imponibleGuardarIvasVentas.setText("0.0");

		this.jButtonbase_imponibleGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setText("U");
		this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbase_imponibleGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbase_imponibleGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbase_imponibleGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"base_imponibleGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbase_imponibleGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelvalorGuardarIvasVentas = new JLabelMe();
		this.jLabelvalorGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorGuardarIvasVentas.setToolTipText("Valor");
		this.jLabelvalorGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelvalorGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldvalorGuardarIvasVentas= new JTextFieldMe();
		jTextFieldvalorGuardarIvasVentas.setEnabled(false);
		jTextFieldvalorGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorGuardarIvasVentas.setText("0.0");

		this.jButtonvalorGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonvalorGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorGuardarIvasVentasBusqueda.setText("U");
		this.jButtonvalorGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelnumeroGuardarIvasVentas = new JLabelMe();
		this.jLabelnumeroGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroGuardarIvasVentas.setToolTipText("Numero");
		this.jLabelnumeroGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelnumeroGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldnumeroGuardarIvasVentas= new JTextFieldMe();

		jTextFieldnumeroGuardarIvasVentas.setEnabled(false);
		jTextFieldnumeroGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonnumeroGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroGuardarIvasVentasBusqueda.setText("U");
		this.jButtonnumeroGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroGuardarIvasVentasBusqueda.setVisible(false);		}


					
		this.jLabelruc_benefGuardarIvasVentas = new JLabelMe();
		this.jLabelruc_benefGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF+" : *");
		this.jLabelruc_benefGuardarIvasVentas.setToolTipText("Ruc Benef");
		this.jLabelruc_benefGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelruc_benefGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelruc_benefGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelruc_benefGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelruc_benefGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_RUCBENEF);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelruc_benefGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jTextFieldruc_benefGuardarIvasVentas= new JTextFieldMe();

		jTextFieldruc_benefGuardarIvasVentas.setEnabled(false);
		jTextFieldruc_benefGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldruc_benefGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldruc_benefGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonruc_benefGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonruc_benefGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonruc_benefGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonruc_benefGuardarIvasVentasBusqueda.setText("U");
		this.jButtonruc_benefGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonruc_benefGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonruc_benefGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldruc_benefGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldruc_benefGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ruc_benefGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonruc_benefGuardarIvasVentasBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysGuardarIvasVentas() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaGuardarIvasVentas = new JLabelMe();
		this.jLabelid_empresaGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaGuardarIvasVentas.setToolTipText("Empresa");
		this.jLabelid_empresaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelid_empresaGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jComboBoxid_empresaGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_empresaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaGuardarIvasVentas.setEnabled(false);

		this.jButtonid_empresaGuardarIvasVentas= new JButtonMe();
		this.jButtonid_empresaGuardarIvasVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuardarIvasVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuardarIvasVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaGuardarIvasVentas.setText("Buscar");
		this.jButtonid_empresaGuardarIvasVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaGuardarIvasVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuardarIvasVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuardarIvasVentas"));

		this.jButtonid_empresaGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonid_empresaGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGuardarIvasVentasBusqueda.setText("U");
		this.jButtonid_empresaGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaGuardarIvasVentasBusqueda.setVisible(false);		}

		this.jButtonid_empresaGuardarIvasVentasUpdate= new JButtonMe();
		this.jButtonid_empresaGuardarIvasVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuardarIvasVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaGuardarIvasVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaGuardarIvasVentasUpdate.setText("U");
		this.jButtonid_empresaGuardarIvasVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaGuardarIvasVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaGuardarIvasVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaGuardarIvasVentasUpdate"));



					
		this.jLabelid_ejercicioGuardarIvasVentas = new JLabelMe();
		this.jLabelid_ejercicioGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioGuardarIvasVentas.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelid_ejercicioGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jComboBoxid_ejercicioGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_ejercicioGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioGuardarIvasVentas.setEnabled(false);

		this.jButtonid_ejercicioGuardarIvasVentas= new JButtonMe();
		this.jButtonid_ejercicioGuardarIvasVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGuardarIvasVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGuardarIvasVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioGuardarIvasVentas.setText("Buscar");
		this.jButtonid_ejercicioGuardarIvasVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioGuardarIvasVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGuardarIvasVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGuardarIvasVentas"));

		this.jButtonid_ejercicioGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setText("U");
		this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioGuardarIvasVentasBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioGuardarIvasVentasUpdate= new JButtonMe();
		this.jButtonid_ejercicioGuardarIvasVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuardarIvasVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioGuardarIvasVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioGuardarIvasVentasUpdate.setText("U");
		this.jButtonid_ejercicioGuardarIvasVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioGuardarIvasVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioGuardarIvasVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioGuardarIvasVentasUpdate"));



					
		this.jLabelid_periodoGuardarIvasVentas = new JLabelMe();
		this.jLabelid_periodoGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoGuardarIvasVentas.setToolTipText("Periodo");
		this.jLabelid_periodoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelid_periodoGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jComboBoxid_periodoGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_periodoGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoGuardarIvasVentas.setEnabled(false);

		this.jButtonid_periodoGuardarIvasVentas= new JButtonMe();
		this.jButtonid_periodoGuardarIvasVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoGuardarIvasVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoGuardarIvasVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoGuardarIvasVentas.setText("Buscar");
		this.jButtonid_periodoGuardarIvasVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoGuardarIvasVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoGuardarIvasVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoGuardarIvasVentas"));

		this.jButtonid_periodoGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonid_periodoGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoGuardarIvasVentasBusqueda.setText("U");
		this.jButtonid_periodoGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoGuardarIvasVentasBusqueda.setVisible(false);		}

		this.jButtonid_periodoGuardarIvasVentasUpdate= new JButtonMe();
		this.jButtonid_periodoGuardarIvasVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuardarIvasVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoGuardarIvasVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoGuardarIvasVentasUpdate.setText("U");
		this.jButtonid_periodoGuardarIvasVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoGuardarIvasVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoGuardarIvasVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoGuardarIvasVentasUpdate"));



					
		this.jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas = new JLabelMe();
		this.jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setText(""+GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA+" : *");
		this.jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setToolTipText("Tipo Retencion Fuente Iva");
		this.jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setToolTipText(GuardarIvasVentasConstantesFunciones.LABEL_IDTIPORETENCIONFUENTEIVA);
		this.gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.setLayout(this.gridaBagLayoutGuardarIvasVentas);


		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas.setText("Buscar");
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentas,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentas"));

		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setText("U");
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda"));

		if(this.guardarivasventasSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.setText("U");
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate"));



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
		//this.jInternalFrameDetalleGuardarIvasVentas = new GuardarIvasVentasBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Guardar Ivas Ventas DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGuardarIvasVentas= new GridBagLayout();
		

		
		String sToolTipGuardarIvasVentas="";
		sToolTipGuardarIvasVentas=GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGuardarIvasVentas+="(Sris.GuardarIvasVentas)";
		}
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			sToolTipGuardarIvasVentas+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoGuardarIvasVentas = new JButtonMe();
		this.jButtonModificarGuardarIvasVentas = new JButtonMe();
        this.jButtonActualizarGuardarIvasVentas = new JButtonMe();
        this.jButtonEliminarGuardarIvasVentas = new JButtonMe();
        this.jButtonCancelarGuardarIvasVentas = new JButtonMe();
        this.jButtonGuardarCambiosGuardarIvasVentas = new JButtonMe();
		this.jButtonGuardarCambiosTablaGuardarIvasVentas = new JButtonMe();
		this.jButtonCerrarGuardarIvasVentas = new JButtonMe();
		
		this.jScrollPanelDatosGuardarIvasVentas = new JScrollPane();   
        this.jScrollPanelDatosEdicionGuardarIvasVentas = new JScrollPane();
		this.jScrollPanelDatosGeneralGuardarIvasVentas = new JScrollPane();
				
		
		
		this.jPanelCamposGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Guardar Ivas Ventas";
		
		if(!this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Guardar Ivas Ventases" + this.sPath));
		} else {
			this.jScrollPanelDatosGuardarIvasVentas.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposGuardarIvasVentas.setName("jPanelCamposGuardarIvasVentas"); 

		this.jPanelCamposOcultosGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosGuardarIvasVentas.setName("jPanelCamposOcultosGuardarIvasVentas"); 

        this.jPanelAccionesGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGuardarIvasVentas.setToolTipText("Acciones");
        this.jPanelAccionesGuardarIvasVentas.setName("Acciones"); 

		this.jPanelAccionesFormularioGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioGuardarIvasVentas.setToolTipText("Acciones");
        this.jPanelAccionesFormularioGuardarIvasVentas.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoGuardarIvasVentas.setText("Nuevo");
		this.jButtonModificarGuardarIvasVentas.setText("Editar");
        this.jButtonActualizarGuardarIvasVentas.setText("Actualizar");
        this.jButtonEliminarGuardarIvasVentas.setText("Eliminar");
        this.jButtonCancelarGuardarIvasVentas.setText("Cancelar");
        this.jButtonGuardarCambiosGuardarIvasVentas.setText("Guardar");
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.setText("Guardar");
		this.jButtonCerrarGuardarIvasVentas.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarIvasVentas,"nuevo_button","Nuevo",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarGuardarIvasVentas,"modificar_button","Editar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarGuardarIvasVentas,"actualizar_button","Actualizar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarGuardarIvasVentas,"eliminar_button","Eliminar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarGuardarIvasVentas,"cancelar_button","Cancelar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosGuardarIvasVentas,"guardarcambios_button","Guardar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGuardarIvasVentas,"guardarcambiostabla_button","Guardar",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGuardarIvasVentas,"cerrar_button","Salir",this.guardarivasventasSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoGuardarIvasVentas.setToolTipText("Nuevo"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarGuardarIvasVentas.setToolTipText("Editar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarGuardarIvasVentas.setToolTipText("Actualizar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarGuardarIvasVentas.setToolTipText("Eliminar)"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarGuardarIvasVentas.setToolTipText("Cancelar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosGuardarIvasVentas.setToolTipText("Guardar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.setToolTipText("Guardar"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGuardarIvasVentas.setToolTipText("Salir"+" "+GuardarIvasVentasConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGuardarIvasVentas";
		inputMap = this.jButtonNuevoGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGuardarIvasVentas.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGuardarIvasVentas"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarGuardarIvasVentas";
		inputMap = this.jButtonActualizarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarGuardarIvasVentas"));
		
		//ELIMINAR
		sMapKey = "EliminarGuardarIvasVentas";
		inputMap = this.jButtonEliminarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarGuardarIvasVentas"));
		
		//CANCELAR	
		sMapKey = "CancelarGuardarIvasVentas";
		inputMap = this.jButtonCancelarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarGuardarIvasVentas"));
		
		//CERRAR		
		sMapKey = "CerrarGuardarIvasVentas";
		inputMap = this.jButtonCerrarGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGuardarIvasVentas"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGuardarIvasVentas";
		inputMap = this.jButtonGuardarCambiosTablaGuardarIvasVentas.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGuardarIvasVentas.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGuardarIvasVentas"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoGuardarIvasVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoGuardarIvasVentas.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoGuardarIvasVentas.setToolTipText("Nuevo GuardarIvasVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarGuardarIvasVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarGuardarIvasVentas.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarGuardarIvasVentas.setToolTipText("Sin Cerrar Ventana GuardarIvasVentas");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeGuardarIvasVentas = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeGuardarIvasVentas.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeGuardarIvasVentas.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGuardarIvasVentas.setText("Accion");
		this.jComboBoxTiposAccionesGuardarIvasVentas.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioGuardarIvasVentas = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesGuardarIvasVentas = new JLabelMe();
		
		this.jLabelAccionesGuardarIvasVentas.setText("Acciones");		
		this.jLabelAccionesGuardarIvasVentas.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuardarIvasVentas.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGuardarIvasVentas.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposGuardarIvasVentas();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysGuardarIvasVentas();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesGuardarIvasVentas=new JTabbedPane();
		this.jTabbedPaneRelacionesGuardarIvasVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesGuardarIvasVentas,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGuardarIvasVentas.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioGuardarIvasVentas.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioGuardarIvasVentas, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposGuardarIvasVentas = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosGuardarIvasVentas = new GridBagLayout();
		
		this.jPanelCamposGuardarIvasVentas.setLayout(gridaBagLayoutCamposGuardarIvasVentas);
		this.jPanelCamposOcultosGuardarIvasVentas.setLayout(gridaBagLayoutCamposOcultosGuardarIvasVentas);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidGuardarIvasVentas.add(jLabelIdGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidGuardarIvasVentas.add(jLabelidGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaGuardarIvasVentas.add(jLabelid_empresaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGuardarIvasVentas.add(jButtonid_empresaGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 3;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaGuardarIvasVentas.add(jButtonid_empresaGuardarIvasVentasUpdate, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaGuardarIvasVentas.add(jComboBoxid_empresaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioGuardarIvasVentas.add(jLabelid_ejercicioGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioGuardarIvasVentas.add(jButtonid_ejercicioGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 3;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioGuardarIvasVentas.add(jButtonid_ejercicioGuardarIvasVentasUpdate, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioGuardarIvasVentas.add(jComboBoxid_ejercicioGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoGuardarIvasVentas.add(jLabelid_periodoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoGuardarIvasVentas.add(jButtonid_periodoGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 3;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoGuardarIvasVentas.add(jButtonid_periodoGuardarIvasVentasUpdate, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoGuardarIvasVentas.add(jComboBoxid_periodoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jLabelid_tipo_retencion_fuente_ivaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 3;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jButtonid_tipo_retencion_fuente_ivaGuardarIvasVentasUpdate, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jComboBoxid_tipo_retencion_fuente_ivaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas.add(jLabelcodigo_estado_asiento_contableGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas.add(jButtoncodigo_estado_asiento_contableGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas.add(jTextFieldcodigo_estado_asiento_contableGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_periodoGuardarIvasVentas.add(jLabelnombre_periodoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_periodoGuardarIvasVentas.add(jButtonnombre_periodoGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_periodoGuardarIvasVentas.add(jTextFieldnombre_periodoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jLabelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jButtonnombre_tipo_retencion_fuente_ivaGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas.add(jscrollPanenombre_tipo_retencion_fuente_ivaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeGuardarIvasVentas.add(jLabelporcentajeGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeGuardarIvasVentas.add(jButtonporcentajeGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeGuardarIvasVentas.add(jTextFieldporcentajeGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelbase_imponibleGuardarIvasVentas.add(jLabelbase_imponibleGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelbase_imponibleGuardarIvasVentas.add(jButtonbase_imponibleGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelbase_imponibleGuardarIvasVentas.add(jTextFieldbase_imponibleGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorGuardarIvasVentas.add(jLabelvalorGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorGuardarIvasVentas.add(jButtonvalorGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorGuardarIvasVentas.add(jTextFieldvalorGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroGuardarIvasVentas.add(jLabelnumeroGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroGuardarIvasVentas.add(jButtonnumeroGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroGuardarIvasVentas.add(jTextFieldnumeroGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelruc_benefGuardarIvasVentas.add(jLabelruc_benefGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		//this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = 2;
		this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
		this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(0, 0, 0, 0);
		this.jPanelruc_benefGuardarIvasVentas.add(jButtonruc_benefGuardarIvasVentasBusqueda, this.gridBagConstraintsGuardarIvasVentas);
	}

	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
	this.gridBagConstraintsGuardarIvasVentas.gridx = 1;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelruc_benefGuardarIvasVentas.add(jTextFieldruc_benefGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelidGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelid_tipo_retencion_fuente_ivaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelcodigo_estado_asiento_contableGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelnombre_periodoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelnombre_tipo_retencion_fuente_ivaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelporcentajeGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelbase_imponibleGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelvalorGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelnumeroGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposGuardarIvasVentas.add(this.jPanelruc_benefGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposGuardarIvasVentas % 2==0) {
		iXPanelCamposGuardarIvasVentas=0;
		iYPanelCamposGuardarIvasVentas++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposOcultosGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposOcultosGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuardarIvasVentas.add(this.jPanelid_empresaGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposOcultosGuardarIvasVentas % 2==0) {
		iXPanelCamposOcultosGuardarIvasVentas=0;
		iYPanelCamposOcultosGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposOcultosGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposOcultosGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuardarIvasVentas.add(this.jPanelid_ejercicioGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposOcultosGuardarIvasVentas % 2==0) {
		iXPanelCamposOcultosGuardarIvasVentas=0;
		iYPanelCamposOcultosGuardarIvasVentas++;
	}
	this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsGuardarIvasVentas.gridy = iYPanelCamposOcultosGuardarIvasVentas;
	this.gridBagConstraintsGuardarIvasVentas.gridx = iXPanelCamposOcultosGuardarIvasVentas++;
	this.gridBagConstraintsGuardarIvasVentas.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsGuardarIvasVentas.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosGuardarIvasVentas.add(this.jPanelid_periodoGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);



	if(iXPanelCamposOcultosGuardarIvasVentas % 2==0) {
		iXPanelCamposOcultosGuardarIvasVentas=0;
		iYPanelCamposOcultosGuardarIvasVentas++;
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
			
		GridBagLayout gridaBagLayoutAccionesGuardarIvasVentas= new GridBagLayout();
		this.jPanelAccionesGuardarIvasVentas.setLayout(gridaBagLayoutAccionesGuardarIvasVentas);
		
		GridBagLayout gridaBagLayoutAccionesFormularioGuardarIvasVentas= new GridBagLayout();
		this.jPanelAccionesFormularioGuardarIvasVentas.setLayout(gridaBagLayoutAccionesFormularioGuardarIvasVentas);
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioGuardarIvasVentas.add(this.jComboBoxTiposAccionesFormularioGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccion++;
			
		this.jPanelAccionesGuardarIvasVentas.add(this.jButtonModificarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);							

		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;
		this.gridBagConstraintsGuardarIvasVentas.gridx =iPosXAccion++;
			
		this.jPanelAccionesGuardarIvasVentas.add(this.jButtonEliminarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesGuardarIvasVentas.add(this.jButtonActualizarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);


		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = iPosXAccion++;
		
		this.jPanelAccionesGuardarIvasVentas.add(this.jButtonGuardarCambiosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);	
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = 0;		
		this.gridBagConstraintsGuardarIvasVentas.gridx =iPosXAccion++;
		
		this.jPanelAccionesGuardarIvasVentas.add(this.jButtonCancelarGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGuardarIvasVentas = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGuardarIvasVentas);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.guardarivasventasSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();						
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;		
			//this.gridBagConstraintsGuardarIvasVentas.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGuardarIvasVentas.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGuardarIvasVentas.gridx =0;
		this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGuardarIvasVentas.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(GuardarIvasVentasJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleGuardarIvasVentas = new GuardarIvasVentasBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Guardar Ivas Ventas DATOS");
			
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
			
	        //this.setTitle("[FOR] - Guardar Ivas Ventas DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Guardar Ivas Ventas Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			GuardarIvasVentasModel guardarivasventasModel=new GuardarIvasVentasModel(this);
			
			//SI USARA CLASE INTERNA
			//GuardarIvasVentasModel.GuardarIvasVentasFocusTraversalPolicy guardarivasventasFocusTraversalPolicy = guardarivasventasModel.new GuardarIvasVentasFocusTraversalPolicy(this);
			
			//guardarivasventasFocusTraversalPolicy.setguardarivasventasJInternalFrame(this);
			
			this.setFocusTraversalPolicy(guardarivasventasModel);
			
			
			this.jContentPaneDetalleGuardarIvasVentas = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleGuardarIvasVentas = new GridBagLayout();	
			this.jContentPaneDetalleGuardarIvasVentas.setLayout(gridaBagLayoutDetalleGuardarIvasVentas);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGuardarIvasVentas = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
				this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
					
				
				this.jContentPaneDetalleGuardarIvasVentas.add(jTtoolBarDetalleGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);								
				
}
			
			this.jScrollPanelDatosEdicionGuardarIvasVentas=   new JScrollPane(jContentPaneDetalleGuardarIvasVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGuardarIvasVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuardarIvasVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuardarIvasVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralGuardarIvasVentas=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGuardarIvasVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuardarIvasVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGuardarIvasVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			
			
	        this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	        
			this.jContentPaneDetalleGuardarIvasVentas.add(jPanelCamposGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);
			
			
			
			
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
						//&& guardarivasventasSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.guardarivasventasSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsGuardarIvasVentas= new GridBagConstraints();
						this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyRelaciones++;
						this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
						this.jContentPaneDetalleGuardarIvasVentas.add(this.jTabbedPaneRelacionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesGuardarIvasVentas.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosGuardarIvasVentas.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
					this.gridBagConstraintsGuardarIvasVentas.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
					
				
					this.jContentPaneDetalleGuardarIvasVentas.add(jPanelCamposOcultosGuardarIvasVentas, gridBagConstraintsGuardarIvasVentas);
				
					this.jPanelCamposOcultosGuardarIvasVentas.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	        this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleGuardarIvasVentas.add(this.jPanelAccionesFormularioGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);							
			
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
	        this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
	        
			
			this.jContentPaneDetalleGuardarIvasVentas.add(this.jPanelAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionGuardarIvasVentas);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionGuardarIvasVentas=   new JScrollPane(this.jPanelCamposGuardarIvasVentas,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionGuardarIvasVentas.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuardarIvasVentas.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionGuardarIvasVentas.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
			this.gridBagConstraintsGuardarIvasVentas.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsGuardarIvasVentas.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsGuardarIvasVentas.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);			
			
			this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
			this.gridBagConstraintsGuardarIvasVentas.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
			
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		
			
		this.gridBagConstraintsGuardarIvasVentas = new GridBagConstraints();
		this.gridBagConstraintsGuardarIvasVentas.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGuardarIvasVentas.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGuardarIvasVentas, this.gridBagConstraintsGuardarIvasVentas);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralGuardarIvasVentas;//jContentPane;
		
		return jScrollPanelDatosEdicionGuardarIvasVentas;
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
