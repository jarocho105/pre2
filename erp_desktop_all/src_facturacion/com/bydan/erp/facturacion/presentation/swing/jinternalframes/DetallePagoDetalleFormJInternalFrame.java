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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.DetallePagoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class DetallePagoDetalleFormJInternalFrame extends DetallePagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePago;
	
	protected JMenuBar jmenuBarDetalleDetallePago;
	
	protected JMenu jmenuDetalleDetallePago;
	protected JMenu jmenuDetalleArchivoDetallePago;
	protected JMenu jmenuDetalleAccionesDetallePago;
	protected JMenu jmenuDetalleDatosDetallePago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePago;	
	protected GridBagConstraints gridBagConstraintsDetallePago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetallePagoSessionBean detallepagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetallePagoLogic detallepagoLogic;
	
	public JScrollPane jScrollPanelDatosDetallePago;
	public JScrollPane jScrollPanelDatosEdicionDetallePago;
	public JScrollPane jScrollPanelDatosGeneralDetallePago;
	
	protected JPanel jPanelCamposDetallePago;    
	protected JPanel jPanelCamposOcultosDetallePago;    	
	protected JPanel jPanelAccionesDetallePago;
	protected JPanel jPanelAccionesFormularioDetallePago;
    
	
	
	protected Integer iXPanelCamposDetallePago=0;
	protected Integer iYPanelCamposDetallePago=0;
	
	protected Integer iXPanelCamposOcultosDetallePago=0;
	protected Integer iYPanelCamposOcultosDetallePago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePago;
	public JButton jButtonModificarDetallePago;
	public JButton jButtonActualizarDetallePago;
    public JButton jButtonEliminarDetallePago;
	public JButton jButtonCancelarDetallePago;
    public JButton jButtonGuardarCambiosDetallePago;
	public JButton jButtonGuardarCambiosTablaDetallePago;
	protected JButton jButtonCerrarDetallePago;
	
	
	protected JButton jButtonProcesarInformacionDetallePago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePago;
	protected JButton jButtonModificarToolBarDetallePago;
	protected JButton jButtonActualizarToolBarDetallePago;
    protected JButton jButtonEliminarToolBarDetallePago;
	protected JButton jButtonCancelarToolBarDetallePago;
    protected JButton jButtonGuardarCambiosToolBarDetallePago;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePago;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePago;
	protected JButton jButtonCerrarToolBarDetallePago;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePago;
	protected JMenuItem jMenuItemModificarDetallePago;
	protected JMenuItem jMenuItemActualizarDetallePago;
    protected JMenuItem jMenuItemEliminarDetallePago;
	protected JMenuItem jMenuItemCancelarDetallePago;
    protected JMenuItem jMenuItemGuardarCambiosDetallePago;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePago;
	protected JMenuItem jMenuItemCerrarDetallePago;
	protected JMenuItem jMenuItemDetalleCerrarDetallePago;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePago;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePago;
	protected JMenuItem jMenuItemMostrarOcultarDetallePago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePago;
	public JLabel jLabelIdDetallePago;
	public JLabel jLabelidDetallePago;
	public JButton jButtonidDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelvalorDetallePago;
	public JLabel jLabelvalorDetallePago;
	public JTextField jTextFieldvalorDetallePago;
	public JButton jButtonvalorDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_filaDetallePago;
	public JLabel jLabelnumero_filaDetallePago;
	public JTextField jTextFieldnumero_filaDetallePago;
	public JButton jButtonnumero_filaDetallePagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetallePago;
	public JLabel jLabelid_empresaDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePago;
	public JButton jButtonid_empresaDetallePago= new JButtonMe();
	public JButton jButtonid_empresaDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePago;
	public JLabel jLabelid_sucursalDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePago;
	public JButton jButtonid_sucursalDetallePago= new JButtonMe();
	public JButton jButtonid_sucursalDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePago;
	public JLabel jLabelid_ejercicioDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePago;
	public JButton jButtonid_ejercicioDetallePago= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePago;
	public JLabel jLabelid_periodoDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePago;
	public JButton jButtonid_periodoDetallePago= new JButtonMe();
	public JButton jButtonid_periodoDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetallePago;
	public JLabel jLabelid_asiento_contableDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetallePago;
	public JButton jButtonid_asiento_contableDetallePago= new JButtonMe();
	public JButton jButtonid_asiento_contableDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_forma_pagoDetallePago;
	public JLabel jLabelid_tipo_forma_pagoDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoDetallePago;
	public JButton jButtonid_tipo_forma_pagoDetallePago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetallePago;
	public JLabel jLabelid_anioDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetallePago;
	public JButton jButtonid_anioDetallePago= new JButtonMe();
	public JButton jButtonid_anioDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_anioDetallePagoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetallePago;
	public JLabel jLabelid_mesDetallePago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetallePago;
	public JButton jButtonid_mesDetallePago= new JButtonMe();
	public JButton jButtonid_mesDetallePagoUpdate= new JButtonMe();
	public JButton jButtonid_mesDetallePagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePago;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePago=new JPanel();
				this.jPanelAccionesFormularioDetallePago=new JPanel();
				this.jmenuBarDetalleDetallePago=new JMenuBar();
				this.jTtoolBarDetalleDetallePago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePago() {
		return this.jButtonActualizarToolBarDetallePago;
	}
	
	public JButton getjButtonEliminarToolBarDetallePago() {
		return this.jButtonEliminarToolBarDetallePago;
	}
	
	public JButton getjButtonCancelarToolBarDetallePago() {
		return this.jButtonCancelarToolBarDetallePago;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePago() {
		return this.jButtonProcesarInformacionDetallePago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePago)	{
		this.jButtonProcesarInformacionDetallePago = jButtonProcesarInformacionDetallePago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePago() {
		return this.jComboBoxTiposAccionesDetallePago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePago(
			JComboBox jComboBoxTiposRelacionesDetallePago) {
		this.jComboBoxTiposRelacionesDetallePago = jComboBoxTiposRelacionesDetallePago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePago(
			JComboBox jComboBoxTiposAccionesDetallePago) {
		this.jComboBoxTiposAccionesDetallePago = jComboBoxTiposAccionesDetallePago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePago() {
		return this.jComboBoxTiposAccionesFormularioDetallePago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePago(
			JComboBox jComboBoxTiposAccionesFormularioDetallePago) {
		this.jComboBoxTiposAccionesFormularioDetallePago = jComboBoxTiposAccionesFormularioDetallePago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepagoSessionBean=new DetallePagoSessionBean();
		
		this.detallepagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePago=new JButtonMe();
				this.jButtonModificarToolBarDetallePago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePago,this.jTtoolBarDetalleDetallePago,
							"actualizar","actualizar","Actualizar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePago,this.jTtoolBarDetalleDetallePago,
							"eliminar","eliminar","Eliminar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePago,this.jTtoolBarDetalleDetallePago,
							"cancelar","cancelar","Cancelar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePago,this.jTtoolBarDetalleDetallePago,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePago.add(this.jMenuItemDetalleCerrarDetallePago);
		
		this.jmenuDetalleAccionesDetallePago.add(this.jMenuItemActualizarDetallePago);
		this.jmenuDetalleAccionesDetallePago.add(this.jMenuItemEliminarDetallePago);
		this.jmenuDetalleAccionesDetallePago.add(this.jMenuItemCancelarDetallePago);		
		
		//this.jmenuDetalleDatosDetallePago.add(this.jMenuItemDetalleAbrirOrderByDetallePago);				
		this.jmenuDetalleDatosDetallePago.add(this.jMenuItemDetalleMostarOcultarDetallePago);				
				
		//this.jmenuDetalleAccionesDetallePago.add(this.jMenuItemGuardarCambiosDetallePago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePago.add(this.jmenuDetalleArchivoDetallePago);		
		this.jmenuBarDetalleDetallePago.add(this.jmenuDetalleAccionesDetallePago);		
		this.jmenuBarDetalleDetallePago.add(this.jmenuDetalleDatosDetallePago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePago);				
	}
	
	
	public void inicializarElementosCamposDetallePago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePago = new JLabelMe();
		jLabelIdDetallePago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePago= new GridBagLayout();

		this.jPanelidDetallePago.setLayout(this.gridaBagLayoutDetallePago);

		jLabelidDetallePago = new JLabel();
		jLabelidDetallePago.setText("Id");

		jLabelidDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorDetallePago = new JLabelMe();
		this.jLabelvalorDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorDetallePago.setToolTipText("Valor");
		this.jLabelvalorDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelvalorDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jTextFieldvalorDetallePago= new JTextFieldMe();
		jTextFieldvalorDetallePago.setEnabled(false);
		jTextFieldvalorDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorDetallePago.setText("0.0");

		this.jButtonvalorDetallePagoBusqueda= new JButtonMe();
		this.jButtonvalorDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorDetallePagoBusqueda.setText("U");
		this.jButtonvalorDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorDetallePagoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_filaDetallePago = new JLabelMe();
		this.jLabelnumero_filaDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_NUMEROFILA+" : *");
		this.jLabelnumero_filaDetallePago.setToolTipText("Numero Fila");
		this.jLabelnumero_filaDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_filaDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_filaDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_filaDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_filaDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_filaDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_NUMEROFILA);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelnumero_filaDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jTextFieldnumero_filaDetallePago= new JTextFieldMe();
		jTextFieldnumero_filaDetallePago.setEnabled(false);
		jTextFieldnumero_filaDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_filaDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_filaDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_filaDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_filaDetallePago.setText("0");

		this.jButtonnumero_filaDetallePagoBusqueda= new JButtonMe();
		this.jButtonnumero_filaDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_filaDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_filaDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_filaDetallePagoBusqueda.setText("U");
		this.jButtonnumero_filaDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_filaDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_filaDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_filaDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_filaDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_filaDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_filaDetallePagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetallePago = new JLabelMe();
		this.jLabelid_empresaDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePago.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_empresaDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_empresaDetallePago= new JComboBoxMe();
		jComboBoxid_empresaDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePago.setEnabled(false);

		this.jButtonid_empresaDetallePago= new JButtonMe();
		this.jButtonid_empresaDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePago.setText("Buscar");
		this.jButtonid_empresaDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePago"));

		this.jButtonid_empresaDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePagoBusqueda.setText("U");
		this.jButtonid_empresaDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePagoUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePagoUpdate.setText("U");
		this.jButtonid_empresaDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePagoUpdate"));



					
		this.jLabelid_sucursalDetallePago = new JLabelMe();
		this.jLabelid_sucursalDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePago.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_sucursalDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_sucursalDetallePago= new JComboBoxMe();
		jComboBoxid_sucursalDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePago.setEnabled(false);

		this.jButtonid_sucursalDetallePago= new JButtonMe();
		this.jButtonid_sucursalDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePago.setText("Buscar");
		this.jButtonid_sucursalDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePago"));

		this.jButtonid_sucursalDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePagoBusqueda.setText("U");
		this.jButtonid_sucursalDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePagoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePagoUpdate.setText("U");
		this.jButtonid_sucursalDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePagoUpdate"));



					
		this.jLabelid_ejercicioDetallePago = new JLabelMe();
		this.jLabelid_ejercicioDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePago.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_ejercicioDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_ejercicioDetallePago= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePago.setEnabled(false);

		this.jButtonid_ejercicioDetallePago= new JButtonMe();
		this.jButtonid_ejercicioDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePago.setText("Buscar");
		this.jButtonid_ejercicioDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePago"));

		this.jButtonid_ejercicioDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePagoBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePagoUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePagoUpdate.setText("U");
		this.jButtonid_ejercicioDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePagoUpdate"));



					
		this.jLabelid_periodoDetallePago = new JLabelMe();
		this.jLabelid_periodoDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePago.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_periodoDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_periodoDetallePago= new JComboBoxMe();
		jComboBoxid_periodoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePago.setEnabled(false);

		this.jButtonid_periodoDetallePago= new JButtonMe();
		this.jButtonid_periodoDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePago.setText("Buscar");
		this.jButtonid_periodoDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePago"));

		this.jButtonid_periodoDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePagoBusqueda.setText("U");
		this.jButtonid_periodoDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePagoUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePagoUpdate.setText("U");
		this.jButtonid_periodoDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePagoUpdate"));



					
		this.jLabelid_asiento_contableDetallePago = new JLabelMe();
		this.jLabelid_asiento_contableDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetallePago.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_asiento_contableDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_asiento_contableDetallePago= new JComboBoxMe();
		jComboBoxid_asiento_contableDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetallePago= new JButtonMe();
		this.jButtonid_asiento_contableDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetallePago.setText("Buscar");
		this.jButtonid_asiento_contableDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetallePago"));

		this.jButtonid_asiento_contableDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetallePagoBusqueda.setText("U");
		this.jButtonid_asiento_contableDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetallePagoUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetallePagoUpdate.setText("U");
		this.jButtonid_asiento_contableDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetallePagoUpdate"));



					
		this.jLabelid_tipo_forma_pagoDetallePago = new JLabelMe();
		this.jLabelid_tipo_forma_pagoDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO+" : *");
		this.jLabelid_tipo_forma_pagoDetallePago.setToolTipText("Tipo Forma Pago");
		this.jLabelid_tipo_forma_pagoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_forma_pagoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_forma_pagoDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_forma_pagoDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDTIPOFORMAPAGO);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_tipo_forma_pagoDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_tipo_forma_pagoDetallePago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_forma_pagoDetallePago= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_forma_pagoDetallePago.setText("Buscar");
		this.jButtonid_tipo_forma_pagoDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_forma_pagoDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_forma_pagoDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetallePago"));

		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setText("U");
		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_forma_pagoDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_forma_pagoDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_forma_pagoDetallePagoUpdate= new JButtonMe();
		this.jButtonid_tipo_forma_pagoDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_forma_pagoDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_forma_pagoDetallePagoUpdate.setText("U");
		this.jButtonid_tipo_forma_pagoDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_forma_pagoDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_forma_pagoDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_forma_pagoDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_forma_pagoDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_forma_pagoDetallePagoUpdate"));



					
		this.jLabelid_anioDetallePago = new JLabelMe();
		this.jLabelid_anioDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetallePago.setToolTipText("Anio");
		this.jLabelid_anioDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_anioDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_anioDetallePago= new JComboBoxMe();
		jComboBoxid_anioDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetallePago.setEnabled(false);

		this.jButtonid_anioDetallePago= new JButtonMe();
		this.jButtonid_anioDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePago.setText("Buscar");
		this.jButtonid_anioDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePago"));

		this.jButtonid_anioDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_anioDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePagoBusqueda.setText("U");
		this.jButtonid_anioDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_anioDetallePagoUpdate= new JButtonMe();
		this.jButtonid_anioDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePagoUpdate.setText("U");
		this.jButtonid_anioDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePagoUpdate"));



					
		this.jLabelid_mesDetallePago = new JLabelMe();
		this.jLabelid_mesDetallePago.setText(""+DetallePagoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetallePago.setToolTipText("Mes");
		this.jLabelid_mesDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetallePago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetallePago.setToolTipText(DetallePagoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetallePago = new GridBagLayout();
		this.jPanelid_mesDetallePago.setLayout(this.gridaBagLayoutDetallePago);


		jComboBoxid_mesDetallePago= new JComboBoxMe();
		jComboBoxid_mesDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetallePago.setEnabled(false);

		this.jButtonid_mesDetallePago= new JButtonMe();
		this.jButtonid_mesDetallePago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePago.setText("Buscar");
		this.jButtonid_mesDetallePago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetallePago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePago"));

		this.jButtonid_mesDetallePagoBusqueda= new JButtonMe();
		this.jButtonid_mesDetallePagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePagoBusqueda.setText("U");
		this.jButtonid_mesDetallePagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetallePagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePagoBusqueda"));

		if(this.detallepagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetallePagoBusqueda.setVisible(false);		}

		this.jButtonid_mesDetallePagoUpdate= new JButtonMe();
		this.jButtonid_mesDetallePagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePagoUpdate.setText("U");
		this.jButtonid_mesDetallePagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetallePagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetallePago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePagoUpdate"));



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
		//this.jInternalFrameDetalleDetallePago = new DetallePagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePago= new GridBagLayout();
		

		
		String sToolTipDetallePago="";
		sToolTipDetallePago=DetallePagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePago+="(Facturacion.DetallePago)";
		}
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePago = new JButtonMe();
		this.jButtonModificarDetallePago = new JButtonMe();
        this.jButtonActualizarDetallePago = new JButtonMe();
        this.jButtonEliminarDetallePago = new JButtonMe();
        this.jButtonCancelarDetallePago = new JButtonMe();
        this.jButtonGuardarCambiosDetallePago = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePago = new JButtonMe();
		this.jButtonCerrarDetallePago = new JButtonMe();
		
		this.jScrollPanelDatosDetallePago = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePago = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePago = new JScrollPane();
				
		
		
		this.jPanelCamposDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pago";
		
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePago.setName("jPanelCamposDetallePago"); 

		this.jPanelCamposOcultosDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePago.setName("jPanelCamposOcultosDetallePago"); 

        this.jPanelAccionesDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePago.setToolTipText("Acciones");
        this.jPanelAccionesDetallePago.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePago.setText("Nuevo");
		this.jButtonModificarDetallePago.setText("Editar");
        this.jButtonActualizarDetallePago.setText("Actualizar");
        this.jButtonEliminarDetallePago.setText("Eliminar");
        this.jButtonCancelarDetallePago.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePago.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePago.setText("Guardar");
		this.jButtonCerrarDetallePago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePago,"nuevo_button","Nuevo",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePago,"modificar_button","Editar",this.detallepagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePago,"actualizar_button","Actualizar",this.detallepagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePago,"eliminar_button","Eliminar",this.detallepagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePago,"cancelar_button","Cancelar",this.detallepagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePago,"guardarcambios_button","Guardar",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePago,"guardarcambiostabla_button","Guardar",this.detallepagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePago,"cerrar_button","Salir",this.detallepagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePago.setToolTipText("Nuevo"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePago.setToolTipText("Editar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePago.setToolTipText("Actualizar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePago.setToolTipText("Eliminar)"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePago.setToolTipText("Cancelar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePago.setToolTipText("Guardar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePago.setToolTipText("Guardar"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePago.setToolTipText("Salir"+" "+DetallePagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePago";
		inputMap = this.jButtonNuevoDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePago";
		inputMap = this.jButtonActualizarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePago"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePago";
		inputMap = this.jButtonEliminarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePago"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePago";
		inputMap = this.jButtonCancelarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePago"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePago";
		inputMap = this.jButtonCerrarDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePago";
		inputMap = this.jButtonGuardarCambiosTablaDetallePago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePago.setToolTipText("Nuevo DetallePago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePago.setToolTipText("Sin Cerrar Ventana DetallePago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePago.setText("Accion");
		this.jComboBoxTiposAccionesDetallePago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePago = new JLabelMe();
		
		this.jLabelAccionesDetallePago.setText("Acciones");		
		this.jLabelAccionesDetallePago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePago=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePago = new GridBagLayout();
		
		this.jPanelCamposDetallePago.setLayout(gridaBagLayoutCamposDetallePago);
		this.jPanelCamposOcultosDetallePago.setLayout(gridaBagLayoutCamposOcultosDetallePago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePago.add(jLabelIdDetallePago, this.gridBagConstraintsDetallePago);



	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePago.add(jLabelidDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePago.add(jLabelid_empresaDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePago.add(jButtonid_empresaDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePago.add(jButtonid_empresaDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePago.add(jComboBoxid_empresaDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePago.add(jLabelid_sucursalDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePago.add(jButtonid_sucursalDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePago.add(jButtonid_sucursalDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePago.add(jComboBoxid_sucursalDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallePago.add(jLabelid_ejercicioDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePago.add(jButtonid_ejercicioDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePago.add(jButtonid_ejercicioDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallePago.add(jComboBoxid_ejercicioDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetallePago.add(jLabelid_periodoDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePago.add(jButtonid_periodoDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePago.add(jButtonid_periodoDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetallePago.add(jComboBoxid_periodoDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableDetallePago.add(jLabelid_asiento_contableDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 2;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetallePago.add(jButtonid_asiento_contableDetallePago, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetallePago.add(jButtonid_asiento_contableDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 4;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetallePago.add(jButtonid_asiento_contableDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableDetallePago.add(jComboBoxid_asiento_contableDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_forma_pagoDetallePago.add(jLabelid_tipo_forma_pagoDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoDetallePago.add(jButtonid_tipo_forma_pagoDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_forma_pagoDetallePago.add(jButtonid_tipo_forma_pagoDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_forma_pagoDetallePago.add(jComboBoxid_tipo_forma_pagoDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorDetallePago.add(jLabelvalorDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorDetallePago.add(jButtonvalorDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorDetallePago.add(jTextFieldvalorDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_filaDetallePago.add(jLabelnumero_filaDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_filaDetallePago.add(jButtonnumero_filaDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_filaDetallePago.add(jTextFieldnumero_filaDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetallePago.add(jLabelid_anioDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePago.add(jButtonid_anioDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePago.add(jButtonid_anioDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetallePago.add(jComboBoxid_anioDetallePago, this.gridBagConstraintsDetallePago);


	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 0;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetallePago.add(jLabelid_mesDetallePago, this.gridBagConstraintsDetallePago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 2;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePago.add(jButtonid_mesDetallePagoBusqueda, this.gridBagConstraintsDetallePago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		//this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = 3;
		this.gridBagConstraintsDetallePago.ipadx = 0;
		this.gridBagConstraintsDetallePago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePago.add(jButtonid_mesDetallePagoUpdate, this.gridBagConstraintsDetallePago);
	}

	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePago.gridy = 0;
	this.gridBagConstraintsDetallePago.gridx = 1;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetallePago.add(jComboBoxid_mesDetallePago, this.gridBagConstraintsDetallePago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePago.add(this.jPanelidDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposDetallePago % 1==0) {
		iXPanelCamposDetallePago=0;
		iYPanelCamposDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePago.add(this.jPanelid_asiento_contableDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposDetallePago % 1==0) {
		iXPanelCamposDetallePago=0;
		iYPanelCamposDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePago.add(this.jPanelid_tipo_forma_pagoDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposDetallePago % 1==0) {
		iXPanelCamposDetallePago=0;
		iYPanelCamposDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePago.add(this.jPanelvalorDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposDetallePago % 1==0) {
		iXPanelCamposDetallePago=0;
		iYPanelCamposDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePago.add(this.jPanelnumero_filaDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposDetallePago % 1==0) {
		iXPanelCamposDetallePago=0;
		iYPanelCamposDetallePago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposOcultosDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposOcultosDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePago.add(this.jPanelid_empresaDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposOcultosDetallePago % 1==0) {
		iXPanelCamposOcultosDetallePago=0;
		iYPanelCamposOcultosDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposOcultosDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposOcultosDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePago.add(this.jPanelid_sucursalDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposOcultosDetallePago % 1==0) {
		iXPanelCamposOcultosDetallePago=0;
		iYPanelCamposOcultosDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposOcultosDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposOcultosDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePago.add(this.jPanelid_ejercicioDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposOcultosDetallePago % 1==0) {
		iXPanelCamposOcultosDetallePago=0;
		iYPanelCamposOcultosDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposOcultosDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposOcultosDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePago.add(this.jPanelid_periodoDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposOcultosDetallePago % 1==0) {
		iXPanelCamposOcultosDetallePago=0;
		iYPanelCamposOcultosDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposOcultosDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposOcultosDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePago.add(this.jPanelid_anioDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposOcultosDetallePago % 1==0) {
		iXPanelCamposOcultosDetallePago=0;
		iYPanelCamposOcultosDetallePago++;
	}
	this.gridBagConstraintsDetallePago = new GridBagConstraints();
	this.gridBagConstraintsDetallePago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePago.gridy = iYPanelCamposOcultosDetallePago;
	this.gridBagConstraintsDetallePago.gridx = iXPanelCamposOcultosDetallePago++;
	this.gridBagConstraintsDetallePago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePago.add(this.jPanelid_mesDetallePago, this.gridBagConstraintsDetallePago);



	if(iXPanelCamposOcultosDetallePago % 1==0) {
		iXPanelCamposOcultosDetallePago=0;
		iYPanelCamposOcultosDetallePago++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePago= new GridBagLayout();
		this.jPanelAccionesDetallePago.setLayout(gridaBagLayoutAccionesDetallePago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePago= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePago.setLayout(gridaBagLayoutAccionesFormularioDetallePago);
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePago.add(this.jComboBoxTiposAccionesFormularioDetallePago, this.gridBagConstraintsDetallePago);

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePago.add(this.jCheckBoxPostAccionNuevoDetallePago, this.gridBagConstraintsDetallePago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePago.add(this.jCheckBoxPostAccionSinCerrarDetallePago, this.gridBagConstraintsDetallePago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePago.add(this.jCheckBoxPostAccionSinMensajeDetallePago, this.gridBagConstraintsDetallePago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePago.add(this.jButtonModificarDetallePago, this.gridBagConstraintsDetallePago);							

		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePago.gridy = 0;
		this.gridBagConstraintsDetallePago.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePago.add(this.jButtonEliminarDetallePago, this.gridBagConstraintsDetallePago);
		
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = 0;		
		this.gridBagConstraintsDetallePago.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePago.add(this.jButtonActualizarDetallePago, this.gridBagConstraintsDetallePago);


		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = 0;		
		this.gridBagConstraintsDetallePago.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePago.add(this.jButtonGuardarCambiosDetallePago, this.gridBagConstraintsDetallePago);	
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = 0;		
		this.gridBagConstraintsDetallePago.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePago.add(this.jButtonCancelarDetallePago, this.gridBagConstraintsDetallePago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePago = new GridBagConstraints();						
			this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePago.gridx = 0;		
			//this.gridBagConstraintsDetallePago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePago.gridx =0;
		this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePago, this.gridBagConstraintsDetallePago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePago = new DetallePagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePagoModel detallepagoModel=new DetallePagoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePagoModel.DetallePagoFocusTraversalPolicy detallepagoFocusTraversalPolicy = detallepagoModel.new DetallePagoFocusTraversalPolicy(this);
			
			//detallepagoFocusTraversalPolicy.setdetallepagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepagoModel);
			
			
			this.jContentPaneDetalleDetallePago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePago = new GridBagLayout();	
			this.jContentPaneDetalleDetallePago.setLayout(gridaBagLayoutDetalleDetallePago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePago = new GridBagConstraints();
				this.gridBagConstraintsDetallePago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePago.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePago.add(jTtoolBarDetalleDetallePago, gridBagConstraintsDetallePago);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePago=   new JScrollPane(jContentPaneDetalleDetallePago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePago.gridx = 0;
	        
			this.jContentPaneDetalleDetallePago.add(jPanelCamposDetallePago, gridBagConstraintsDetallePago);
			
			
			
			
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
						&& detallepagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePago= new GridBagConstraints();
						this.gridBagConstraintsDetallePago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePago.gridx = 0;
						this.jContentPaneDetalleDetallePago.add(this.jTabbedPaneRelacionesDetallePago, this.gridBagConstraintsDetallePago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePago = new GridBagConstraints();
					this.gridBagConstraintsDetallePago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePago.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePago.add(jPanelCamposOcultosDetallePago, gridBagConstraintsDetallePago);
				
					this.jPanelCamposOcultosDetallePago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePago.gridx = 0;
	        this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePago.add(this.jPanelAccionesFormularioDetallePago, this.gridBagConstraintsDetallePago);							
			
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
	        this.gridBagConstraintsDetallePago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePago.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePago.add(this.jPanelAccionesDetallePago, this.gridBagConstraintsDetallePago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePago=   new JScrollPane(this.jPanelCamposDetallePago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePago.gridx = 0;
			this.gridBagConstraintsDetallePago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePago, this.gridBagConstraintsDetallePago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePago, this.gridBagConstraintsDetallePago);			
			
			this.gridBagConstraintsDetallePago = new GridBagConstraints();
			this.gridBagConstraintsDetallePago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePago, this.gridBagConstraintsDetallePago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePago, this.gridBagConstraintsDetallePago);
			
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePago, this.gridBagConstraintsDetallePago);
		
			
		this.gridBagConstraintsDetallePago = new GridBagConstraints();
		this.gridBagConstraintsDetallePago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePago, this.gridBagConstraintsDetallePago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePago;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePago;
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
