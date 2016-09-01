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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.DetallePagoChequeConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class DetallePagoChequeDetalleFormJInternalFrame extends DetallePagoChequeBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePagoCheque;
	
	protected JMenuBar jmenuBarDetalleDetallePagoCheque;
	
	protected JMenu jmenuDetalleDetallePagoCheque;
	protected JMenu jmenuDetalleArchivoDetallePagoCheque;
	protected JMenu jmenuDetalleAccionesDetallePagoCheque;
	protected JMenu jmenuDetalleDatosDetallePagoCheque;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePagoCheque;	
	protected GridBagConstraints gridBagConstraintsDetallePagoCheque;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePagoChequeBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePagoCheque;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetallePagoChequeSessionBean detallepagochequeSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetallePagoChequeLogic detallepagochequeLogic;
	
	public JScrollPane jScrollPanelDatosDetallePagoCheque;
	public JScrollPane jScrollPanelDatosEdicionDetallePagoCheque;
	public JScrollPane jScrollPanelDatosGeneralDetallePagoCheque;
	
	protected JPanel jPanelCamposDetallePagoCheque;    
	protected JPanel jPanelCamposOcultosDetallePagoCheque;    	
	protected JPanel jPanelAccionesDetallePagoCheque;
	protected JPanel jPanelAccionesFormularioDetallePagoCheque;
    
	
	
	protected Integer iXPanelCamposDetallePagoCheque=0;
	protected Integer iYPanelCamposDetallePagoCheque=0;
	
	protected Integer iXPanelCamposOcultosDetallePagoCheque=0;
	protected Integer iYPanelCamposOcultosDetallePagoCheque=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePagoCheque;
	public JButton jButtonModificarDetallePagoCheque;
	public JButton jButtonActualizarDetallePagoCheque;
    public JButton jButtonEliminarDetallePagoCheque;
	public JButton jButtonCancelarDetallePagoCheque;
    public JButton jButtonGuardarCambiosDetallePagoCheque;
	public JButton jButtonGuardarCambiosTablaDetallePagoCheque;
	protected JButton jButtonCerrarDetallePagoCheque;
	
	
	protected JButton jButtonProcesarInformacionDetallePagoCheque;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePagoCheque;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePagoCheque;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePagoCheque;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePagoCheque;
	protected JButton jButtonModificarToolBarDetallePagoCheque;
	protected JButton jButtonActualizarToolBarDetallePagoCheque;
    protected JButton jButtonEliminarToolBarDetallePagoCheque;
	protected JButton jButtonCancelarToolBarDetallePagoCheque;
    protected JButton jButtonGuardarCambiosToolBarDetallePagoCheque;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePagoCheque;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePagoCheque;
	protected JButton jButtonCerrarToolBarDetallePagoCheque;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePagoCheque;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePagoCheque;
	protected JMenuItem jMenuItemModificarDetallePagoCheque;
	protected JMenuItem jMenuItemActualizarDetallePagoCheque;
    protected JMenuItem jMenuItemEliminarDetallePagoCheque;
	protected JMenuItem jMenuItemCancelarDetallePagoCheque;
    protected JMenuItem jMenuItemGuardarCambiosDetallePagoCheque;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePagoCheque;
	protected JMenuItem jMenuItemCerrarDetallePagoCheque;
	protected JMenuItem jMenuItemDetalleCerrarDetallePagoCheque;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePagoCheque;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePagoCheque;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePagoCheque;
	protected JMenuItem jMenuItemMostrarOcultarDetallePagoCheque;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePagoCheque;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePagoCheque;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePagoCheque;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePagoCheque;
	public JLabel jLabelIdDetallePagoCheque;
	public JLabel jLabelidDetallePagoCheque;
	public JButton jButtonidDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetallePagoCheque;
	public JLabel jLabelvalorDetallePagoCheque;
	public JTextField jTextFieldvalorDetallePagoCheque;
	public JButton jButtonvalorDetallePagoChequeBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallePagoCheque;
	public JLabel jLabelid_empresaDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePagoCheque;
	public JButton jButtonid_empresaDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_empresaDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePagoCheque;
	public JLabel jLabelid_sucursalDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePagoCheque;
	public JButton jButtonid_sucursalDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_sucursalDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetallePagoCheque;
	public JLabel jLabelid_asiento_contableDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetallePagoCheque;
	public JButton jButtonid_asiento_contableDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_asiento_contableDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePagoCheque;
	public JLabel jLabelid_ejercicioDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePagoCheque;
	public JButton jButtonid_ejercicioDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePagoCheque;
	public JLabel jLabelid_periodoDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePagoCheque;
	public JButton jButtonid_periodoDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_periodoDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetallePagoCheque;
	public JLabel jLabelid_anioDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetallePagoCheque;
	public JButton jButtonid_anioDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_anioDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_anioDetallePagoChequeBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetallePagoCheque;
	public JLabel jLabelid_mesDetallePagoCheque;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetallePagoCheque;
	public JButton jButtonid_mesDetallePagoCheque= new JButtonMe();
	public JButton jButtonid_mesDetallePagoChequeUpdate= new JButtonMe();
	public JButton jButtonid_mesDetallePagoChequeBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePagoCheque;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePagoChequeDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePagoCheque=new JPanel();
				this.jPanelAccionesFormularioDetallePagoCheque=new JPanel();
				this.jmenuBarDetalleDetallePagoCheque=new JMenuBar();
				this.jTtoolBarDetalleDetallePagoCheque=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePagoChequeDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoChequeDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePagoCheque No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePagoCheque() {
		return this.jButtonActualizarToolBarDetallePagoCheque;
	}
	
	public JButton getjButtonEliminarToolBarDetallePagoCheque() {
		return this.jButtonEliminarToolBarDetallePagoCheque;
	}
	
	public JButton getjButtonCancelarToolBarDetallePagoCheque() {
		return this.jButtonCancelarToolBarDetallePagoCheque;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePagoCheque() {
		return this.jButtonProcesarInformacionDetallePagoCheque;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePagoCheque)	{
		this.jButtonProcesarInformacionDetallePagoCheque = jButtonProcesarInformacionDetallePagoCheque;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePagoCheque() {
		return this.jComboBoxTiposAccionesDetallePagoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePagoCheque(
			JComboBox jComboBoxTiposRelacionesDetallePagoCheque) {
		this.jComboBoxTiposRelacionesDetallePagoCheque = jComboBoxTiposRelacionesDetallePagoCheque;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePagoCheque(
			JComboBox jComboBoxTiposAccionesDetallePagoCheque) {
		this.jComboBoxTiposAccionesDetallePagoCheque = jComboBoxTiposAccionesDetallePagoCheque;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePagoCheque() {
		return this.jComboBoxTiposAccionesFormularioDetallePagoCheque;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePagoCheque(
			JComboBox jComboBoxTiposAccionesFormularioDetallePagoCheque) {
		this.jComboBoxTiposAccionesFormularioDetallePagoCheque = jComboBoxTiposAccionesFormularioDetallePagoCheque;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepagochequeSessionBean=new DetallePagoChequeSessionBean();
		
		this.detallepagochequeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagochequeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepagochequeSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePagoChequeJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePagoChequeJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePagoChequeJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pago Cheque MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePagoChequeJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePagoCheque= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePagoCheque=new JButtonMe();
				this.jButtonModificarToolBarDetallePagoCheque=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePagoCheque,this.jTtoolBarDetalleDetallePagoCheque,
							"actualizar","actualizar","Actualizar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePagoCheque,this.jTtoolBarDetalleDetallePagoCheque,
							"eliminar","eliminar","Eliminar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePagoCheque,this.jTtoolBarDetalleDetallePagoCheque,
							"cancelar","cancelar","Cancelar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePagoCheque=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePagoCheque,this.jTtoolBarDetalleDetallePagoCheque,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePagoCheque=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePagoCheque=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePagoCheque=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePagoCheque=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePagoCheque=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePagoCheque= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePagoCheque.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePagoCheque,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePagoCheque= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePagoCheque.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePagoCheque,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePagoCheque= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePagoCheque.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePagoCheque,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePagoCheque= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePagoCheque.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePagoCheque,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePagoCheque= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePagoCheque.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePagoCheque,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePagoCheque= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePagoCheque.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePagoCheque,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePagoCheque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePagoCheque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePagoCheque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePagoCheque= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePagoCheque.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePagoCheque,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePagoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePagoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePagoCheque,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePagoCheque= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePagoCheque.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePagoCheque,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePagoCheque.add(this.jMenuItemDetalleCerrarDetallePagoCheque);
		
		this.jmenuDetalleAccionesDetallePagoCheque.add(this.jMenuItemActualizarDetallePagoCheque);
		this.jmenuDetalleAccionesDetallePagoCheque.add(this.jMenuItemEliminarDetallePagoCheque);
		this.jmenuDetalleAccionesDetallePagoCheque.add(this.jMenuItemCancelarDetallePagoCheque);		
		
		//this.jmenuDetalleDatosDetallePagoCheque.add(this.jMenuItemDetalleAbrirOrderByDetallePagoCheque);				
		this.jmenuDetalleDatosDetallePagoCheque.add(this.jMenuItemDetalleMostarOcultarDetallePagoCheque);				
				
		//this.jmenuDetalleAccionesDetallePagoCheque.add(this.jMenuItemGuardarCambiosDetallePagoCheque);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePagoCheque.add(this.jmenuDetalleArchivoDetallePagoCheque);		
		this.jmenuBarDetalleDetallePagoCheque.add(this.jmenuDetalleAccionesDetallePagoCheque);		
		this.jmenuBarDetalleDetallePagoCheque.add(this.jmenuDetalleDatosDetallePagoCheque);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePagoCheque);				
	}
	
	
	public void inicializarElementosCamposDetallePagoCheque() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePagoCheque = new JLabelMe();
		jLabelIdDetallePagoCheque.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePagoCheque = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePagoCheque= new GridBagLayout();

		this.jPanelidDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);

		jLabelidDetallePagoCheque = new JLabel();
		jLabelidDetallePagoCheque.setText("Id");

		jLabelidDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetallePagoCheque = new JLabelMe();
		this.jLabelvalorDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetallePagoCheque.setToolTipText("Valor");
		this.jLabelvalorDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelvalorDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jTextFieldvalorDetallePagoCheque= new JTextFieldMe();
		jTextFieldvalorDetallePagoCheque.setEnabled(false);
		jTextFieldvalorDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetallePagoCheque.setText("0.0");

		this.jButtonvalorDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonvalorDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetallePagoChequeBusqueda.setText("U");
		this.jButtonvalorDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetallePagoChequeBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePagoCheque() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallePagoCheque = new JLabelMe();
		this.jLabelid_empresaDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePagoCheque.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_empresaDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_empresaDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_empresaDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePagoCheque.setEnabled(false);

		this.jButtonid_empresaDetallePagoCheque= new JButtonMe();
		this.jButtonid_empresaDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePagoCheque.setText("Buscar");
		this.jButtonid_empresaDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagoCheque"));

		this.jButtonid_empresaDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_empresaDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePagoChequeUpdate.setText("U");
		this.jButtonid_empresaDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagoChequeUpdate"));



					
		this.jLabelid_sucursalDetallePagoCheque = new JLabelMe();
		this.jLabelid_sucursalDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePagoCheque.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_sucursalDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_sucursalDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_sucursalDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePagoCheque.setEnabled(false);

		this.jButtonid_sucursalDetallePagoCheque= new JButtonMe();
		this.jButtonid_sucursalDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePagoCheque.setText("Buscar");
		this.jButtonid_sucursalDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePagoCheque"));

		this.jButtonid_sucursalDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_sucursalDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePagoChequeUpdate.setText("U");
		this.jButtonid_sucursalDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePagoChequeUpdate"));



					
		this.jLabelid_asiento_contableDetallePagoCheque = new JLabelMe();
		this.jLabelid_asiento_contableDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetallePagoCheque.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_asiento_contableDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_asiento_contableDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_asiento_contableDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetallePagoCheque= new JButtonMe();
		this.jButtonid_asiento_contableDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetallePagoCheque.setText("Buscar");
		this.jButtonid_asiento_contableDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetallePagoCheque"));

		this.jButtonid_asiento_contableDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetallePagoChequeUpdate.setText("U");
		this.jButtonid_asiento_contableDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetallePagoChequeUpdate"));



					
		this.jLabelid_ejercicioDetallePagoCheque = new JLabelMe();
		this.jLabelid_ejercicioDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePagoCheque.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_ejercicioDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_ejercicioDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePagoCheque.setEnabled(false);

		this.jButtonid_ejercicioDetallePagoCheque= new JButtonMe();
		this.jButtonid_ejercicioDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePagoCheque.setText("Buscar");
		this.jButtonid_ejercicioDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePagoCheque"));

		this.jButtonid_ejercicioDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePagoChequeUpdate.setText("U");
		this.jButtonid_ejercicioDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePagoChequeUpdate"));



					
		this.jLabelid_periodoDetallePagoCheque = new JLabelMe();
		this.jLabelid_periodoDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePagoCheque.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_periodoDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_periodoDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_periodoDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePagoCheque.setEnabled(false);

		this.jButtonid_periodoDetallePagoCheque= new JButtonMe();
		this.jButtonid_periodoDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePagoCheque.setText("Buscar");
		this.jButtonid_periodoDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePagoCheque"));

		this.jButtonid_periodoDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_periodoDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePagoChequeUpdate.setText("U");
		this.jButtonid_periodoDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePagoChequeUpdate"));



					
		this.jLabelid_anioDetallePagoCheque = new JLabelMe();
		this.jLabelid_anioDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetallePagoCheque.setToolTipText("Anio");
		this.jLabelid_anioDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_anioDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_anioDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_anioDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetallePagoCheque.setEnabled(false);

		this.jButtonid_anioDetallePagoCheque= new JButtonMe();
		this.jButtonid_anioDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePagoCheque.setText("Buscar");
		this.jButtonid_anioDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePagoCheque"));

		this.jButtonid_anioDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_anioDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_anioDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_anioDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_anioDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePagoChequeUpdate.setText("U");
		this.jButtonid_anioDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePagoChequeUpdate"));



					
		this.jLabelid_mesDetallePagoCheque = new JLabelMe();
		this.jLabelid_mesDetallePagoCheque.setText(""+DetallePagoChequeConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetallePagoCheque.setToolTipText("Mes");
		this.jLabelid_mesDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetallePagoCheque=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetallePagoCheque.setToolTipText(DetallePagoChequeConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		this.jPanelid_mesDetallePagoCheque.setLayout(this.gridaBagLayoutDetallePagoCheque);


		jComboBoxid_mesDetallePagoCheque= new JComboBoxMe();
		jComboBoxid_mesDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetallePagoCheque.setEnabled(false);

		this.jButtonid_mesDetallePagoCheque= new JButtonMe();
		this.jButtonid_mesDetallePagoCheque.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePagoCheque.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePagoCheque.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePagoCheque.setText("Buscar");
		this.jButtonid_mesDetallePagoCheque.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetallePagoCheque.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePagoCheque,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePagoCheque"));

		this.jButtonid_mesDetallePagoChequeBusqueda= new JButtonMe();
		this.jButtonid_mesDetallePagoChequeBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoChequeBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoChequeBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePagoChequeBusqueda.setText("U");
		this.jButtonid_mesDetallePagoChequeBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetallePagoChequeBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePagoChequeBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePagoChequeBusqueda"));

		if(this.detallepagochequeSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetallePagoChequeBusqueda.setVisible(false);		}

		this.jButtonid_mesDetallePagoChequeUpdate= new JButtonMe();
		this.jButtonid_mesDetallePagoChequeUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoChequeUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoChequeUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePagoChequeUpdate.setText("U");
		this.jButtonid_mesDetallePagoChequeUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetallePagoChequeUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePagoChequeUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetallePagoCheque.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePagoCheque.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePagoChequeUpdate"));



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
		//this.jInternalFrameDetalleDetallePagoCheque = new DetallePagoChequeBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pago Cheque DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePagoCheque= new GridBagLayout();
		

		
		String sToolTipDetallePagoCheque="";
		sToolTipDetallePagoCheque=DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePagoCheque+="(Tesoreria.DetallePagoCheque)";
		}
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePagoCheque+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePagoCheque = new JButtonMe();
		this.jButtonModificarDetallePagoCheque = new JButtonMe();
        this.jButtonActualizarDetallePagoCheque = new JButtonMe();
        this.jButtonEliminarDetallePagoCheque = new JButtonMe();
        this.jButtonCancelarDetallePagoCheque = new JButtonMe();
        this.jButtonGuardarCambiosDetallePagoCheque = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePagoCheque = new JButtonMe();
		this.jButtonCerrarDetallePagoCheque = new JButtonMe();
		
		this.jScrollPanelDatosDetallePagoCheque = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePagoCheque = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePagoCheque = new JScrollPane();
				
		
		
		this.jPanelCamposDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pago Cheque";
		
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pago Cheques" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePagoCheque.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePagoCheque.setName("jPanelCamposDetallePagoCheque"); 

		this.jPanelCamposOcultosDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePagoCheque.setName("jPanelCamposOcultosDetallePagoCheque"); 

        this.jPanelAccionesDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePagoCheque.setToolTipText("Acciones");
        this.jPanelAccionesDetallePagoCheque.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePagoCheque.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePagoCheque.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePagoCheque.setText("Nuevo");
		this.jButtonModificarDetallePagoCheque.setText("Editar");
        this.jButtonActualizarDetallePagoCheque.setText("Actualizar");
        this.jButtonEliminarDetallePagoCheque.setText("Eliminar");
        this.jButtonCancelarDetallePagoCheque.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePagoCheque.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePagoCheque.setText("Guardar");
		this.jButtonCerrarDetallePagoCheque.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePagoCheque,"nuevo_button","Nuevo",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePagoCheque,"modificar_button","Editar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePagoCheque,"actualizar_button","Actualizar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePagoCheque,"eliminar_button","Eliminar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePagoCheque,"cancelar_button","Cancelar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePagoCheque,"guardarcambios_button","Guardar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePagoCheque,"guardarcambiostabla_button","Guardar",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePagoCheque,"cerrar_button","Salir",this.detallepagochequeSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePagoCheque.setToolTipText("Nuevo"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePagoCheque.setToolTipText("Editar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePagoCheque.setToolTipText("Actualizar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePagoCheque.setToolTipText("Eliminar)"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePagoCheque.setToolTipText("Cancelar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePagoCheque.setToolTipText("Guardar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePagoCheque.setToolTipText("Guardar"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePagoCheque.setToolTipText("Salir"+" "+DetallePagoChequeConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePagoCheque";
		inputMap = this.jButtonNuevoDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePagoCheque.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePagoCheque"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePagoCheque";
		inputMap = this.jButtonActualizarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePagoCheque"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePagoCheque";
		inputMap = this.jButtonEliminarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePagoCheque"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePagoCheque";
		inputMap = this.jButtonCancelarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePagoCheque"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePagoCheque";
		inputMap = this.jButtonCerrarDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePagoCheque"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePagoCheque";
		inputMap = this.jButtonGuardarCambiosTablaDetallePagoCheque.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePagoCheque.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePagoCheque"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePagoCheque = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePagoCheque.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePagoCheque.setToolTipText("Nuevo DetallePagoCheque");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePagoCheque = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePagoCheque.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePagoCheque.setToolTipText("Sin Cerrar Ventana DetallePagoCheque");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePagoCheque = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePagoCheque.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePagoCheque.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePagoCheque.setText("Accion");
		this.jComboBoxTiposAccionesDetallePagoCheque.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePagoCheque = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePagoCheque.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePagoCheque.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePagoCheque = new JLabelMe();
		
		this.jLabelAccionesDetallePagoCheque.setText("Acciones");		
		this.jLabelAccionesDetallePagoCheque.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagoCheque.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePagoCheque.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePagoCheque();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePagoCheque();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePagoCheque=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePagoCheque.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePagoCheque,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePagoCheque.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagoCheque.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePagoCheque.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePagoCheque.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePagoCheque.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePagoCheque.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePagoCheque, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePagoCheque = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePagoCheque = new GridBagLayout();
		
		this.jPanelCamposDetallePagoCheque.setLayout(gridaBagLayoutCamposDetallePagoCheque);
		this.jPanelCamposOcultosDetallePagoCheque.setLayout(gridaBagLayoutCamposOcultosDetallePagoCheque);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePagoCheque.add(jLabelIdDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePagoCheque.add(jLabelidDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePagoCheque.add(jLabelid_empresaDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePagoCheque.add(jButtonid_empresaDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePagoCheque.add(jButtonid_empresaDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePagoCheque.add(jComboBoxid_empresaDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePagoCheque.add(jLabelid_sucursalDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePagoCheque.add(jButtonid_sucursalDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePagoCheque.add(jButtonid_sucursalDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePagoCheque.add(jComboBoxid_sucursalDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDetallePagoCheque.add(jLabelid_asiento_contableDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 2;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetallePagoCheque.add(jButtonid_asiento_contableDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetallePagoCheque.add(jButtonid_asiento_contableDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 4;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetallePagoCheque.add(jButtonid_asiento_contableDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDetallePagoCheque.add(jComboBoxid_asiento_contableDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallePagoCheque.add(jLabelid_ejercicioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePagoCheque.add(jButtonid_ejercicioDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePagoCheque.add(jButtonid_ejercicioDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallePagoCheque.add(jComboBoxid_ejercicioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetallePagoCheque.add(jLabelid_periodoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePagoCheque.add(jButtonid_periodoDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePagoCheque.add(jButtonid_periodoDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetallePagoCheque.add(jComboBoxid_periodoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetallePagoCheque.add(jLabelvalorDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetallePagoCheque.add(jButtonvalorDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetallePagoCheque.add(jTextFieldvalorDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetallePagoCheque.add(jLabelid_anioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePagoCheque.add(jButtonid_anioDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePagoCheque.add(jButtonid_anioDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetallePagoCheque.add(jComboBoxid_anioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetallePagoCheque.add(jLabelid_mesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 2;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePagoCheque.add(jButtonid_mesDetallePagoChequeBusqueda, this.gridBagConstraintsDetallePagoCheque);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		//this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = 3;
		this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
		this.gridBagConstraintsDetallePagoCheque.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePagoCheque.add(jButtonid_mesDetallePagoChequeUpdate, this.gridBagConstraintsDetallePagoCheque);
	}

	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePagoCheque.gridy = 0;
	this.gridBagConstraintsDetallePagoCheque.gridx = 1;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetallePagoCheque.add(jComboBoxid_mesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagoCheque.add(this.jPanelidDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposDetallePagoCheque % 1==0) {
		iXPanelCamposDetallePagoCheque=0;
		iYPanelCamposDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagoCheque.add(this.jPanelid_asiento_contableDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposDetallePagoCheque % 1==0) {
		iXPanelCamposDetallePagoCheque=0;
		iYPanelCamposDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePagoCheque.add(this.jPanelvalorDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposDetallePagoCheque % 1==0) {
		iXPanelCamposDetallePagoCheque=0;
		iYPanelCamposDetallePagoCheque++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposOcultosDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposOcultosDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagoCheque.add(this.jPanelid_empresaDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposOcultosDetallePagoCheque % 1==0) {
		iXPanelCamposOcultosDetallePagoCheque=0;
		iYPanelCamposOcultosDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposOcultosDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposOcultosDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagoCheque.add(this.jPanelid_sucursalDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposOcultosDetallePagoCheque % 1==0) {
		iXPanelCamposOcultosDetallePagoCheque=0;
		iYPanelCamposOcultosDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposOcultosDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposOcultosDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagoCheque.add(this.jPanelid_ejercicioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposOcultosDetallePagoCheque % 1==0) {
		iXPanelCamposOcultosDetallePagoCheque=0;
		iYPanelCamposOcultosDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposOcultosDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposOcultosDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagoCheque.add(this.jPanelid_periodoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposOcultosDetallePagoCheque % 1==0) {
		iXPanelCamposOcultosDetallePagoCheque=0;
		iYPanelCamposOcultosDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposOcultosDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposOcultosDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagoCheque.add(this.jPanelid_anioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposOcultosDetallePagoCheque % 1==0) {
		iXPanelCamposOcultosDetallePagoCheque=0;
		iYPanelCamposOcultosDetallePagoCheque++;
	}
	this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePagoCheque.gridy = iYPanelCamposOcultosDetallePagoCheque;
	this.gridBagConstraintsDetallePagoCheque.gridx = iXPanelCamposOcultosDetallePagoCheque++;
	this.gridBagConstraintsDetallePagoCheque.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePagoCheque.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePagoCheque.add(this.jPanelid_mesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);



	if(iXPanelCamposOcultosDetallePagoCheque % 1==0) {
		iXPanelCamposOcultosDetallePagoCheque=0;
		iYPanelCamposOcultosDetallePagoCheque++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePagoCheque= new GridBagLayout();
		this.jPanelAccionesDetallePagoCheque.setLayout(gridaBagLayoutAccionesDetallePagoCheque);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePagoCheque= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePagoCheque.setLayout(gridaBagLayoutAccionesFormularioDetallePagoCheque);
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePagoCheque.add(this.jComboBoxTiposAccionesFormularioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePagoCheque.add(this.jCheckBoxPostAccionNuevoDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePagoCheque.add(this.jCheckBoxPostAccionSinCerrarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepagochequeSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepagochequeSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePagoCheque.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePagoCheque.add(this.jCheckBoxPostAccionSinMensajeDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePagoCheque.add(this.jButtonModificarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);							

		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;
		this.gridBagConstraintsDetallePagoCheque.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePagoCheque.add(this.jButtonEliminarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePagoCheque.add(this.jButtonActualizarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);


		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;		
		this.gridBagConstraintsDetallePagoCheque.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePagoCheque.add(this.jButtonGuardarCambiosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);	
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = 0;		
		this.gridBagConstraintsDetallePagoCheque.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePagoCheque.add(this.jButtonCancelarDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePagoCheque = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePagoCheque);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepagochequeSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();						
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;		
			//this.gridBagConstraintsDetallePagoCheque.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePagoCheque.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePagoCheque.gridx =0;
		this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePagoCheque.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePagoChequeJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePagoCheque = new DetallePagoChequeBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pago Cheque DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pago Cheque DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pago Cheque Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePagoChequeModel detallepagochequeModel=new DetallePagoChequeModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePagoChequeModel.DetallePagoChequeFocusTraversalPolicy detallepagochequeFocusTraversalPolicy = detallepagochequeModel.new DetallePagoChequeFocusTraversalPolicy(this);
			
			//detallepagochequeFocusTraversalPolicy.setdetallepagochequeJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepagochequeModel);
			
			
			this.jContentPaneDetalleDetallePagoCheque = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePagoCheque = new GridBagLayout();	
			this.jContentPaneDetalleDetallePagoCheque.setLayout(gridaBagLayoutDetalleDetallePagoCheque);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePagoCheque = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
				this.gridBagConstraintsDetallePagoCheque.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePagoCheque.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePagoCheque.add(jTtoolBarDetalleDetallePagoCheque, gridBagConstraintsDetallePagoCheque);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePagoCheque=   new JScrollPane(jContentPaneDetalleDetallePagoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePagoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePagoCheque=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePagoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePagoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePagoCheque.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	        
			this.jContentPaneDetalleDetallePagoCheque.add(jPanelCamposDetallePagoCheque, gridBagConstraintsDetallePagoCheque);
			
			
			
			
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
						&& detallepagochequeSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepagochequeSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePagoCheque= new GridBagConstraints();
						this.gridBagConstraintsDetallePagoCheque.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePagoCheque.gridx = 0;
						this.jContentPaneDetalleDetallePagoCheque.add(this.jTabbedPaneRelacionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePagoCheque.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePagoCheque.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
					this.gridBagConstraintsDetallePagoCheque.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePagoCheque.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePagoCheque.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePagoCheque.add(jPanelCamposOcultosDetallePagoCheque, gridBagConstraintsDetallePagoCheque);
				
					this.jPanelCamposOcultosDetallePagoCheque.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	        this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePagoCheque.add(this.jPanelAccionesFormularioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);							
			
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
	        this.gridBagConstraintsDetallePagoCheque.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePagoCheque.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePagoCheque.add(this.jPanelAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePagoCheque);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePagoCheque=   new JScrollPane(this.jPanelCamposDetallePagoCheque,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePagoCheque.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagoCheque.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePagoCheque.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;
			this.gridBagConstraintsDetallePagoCheque.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePagoCheque.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePagoCheque.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);			
			
			this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
			this.gridBagConstraintsDetallePagoCheque.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePagoCheque.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
			
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		
			
		this.gridBagConstraintsDetallePagoCheque = new GridBagConstraints();
		this.gridBagConstraintsDetallePagoCheque.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePagoCheque.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePagoCheque, this.gridBagConstraintsDetallePagoCheque);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePagoCheque;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePagoCheque;
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
