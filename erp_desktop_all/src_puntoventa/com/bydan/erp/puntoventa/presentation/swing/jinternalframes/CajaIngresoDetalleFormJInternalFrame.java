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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.CajaIngresoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class CajaIngresoDetalleFormJInternalFrame extends CajaIngresoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaIngreso;
	
	protected JMenuBar jmenuBarDetalleCajaIngreso;
	
	protected JMenu jmenuDetalleCajaIngreso;
	protected JMenu jmenuDetalleArchivoCajaIngreso;
	protected JMenu jmenuDetalleAccionesCajaIngreso;
	protected JMenu jmenuDetalleDatosCajaIngreso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaIngreso;	
	protected GridBagConstraints gridBagConstraintsCajaIngreso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaIngresoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaIngreso;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_turnopunven="";
	
	public CajaIngresoSessionBean cajaingresoSessionBean;
	
	

	public CajaIngresoDetalleBeanSwingJInternalFrame cajaingresodetalleBeanSwingJInternalFrame=null;
	public CajaIngresoDetalleBeanSwingJInternalFrame cajaingresodetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaIngresoDetalle=false;
	public CajaIngresoDetalleSessionBean cajaingresodetalleSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;
	public TurnoPunVenSessionBean turnopunvenSessionBean;	
	
	public CajaIngresoLogic cajaingresoLogic;
	
	public JScrollPane jScrollPanelDatosCajaIngreso;
	public JScrollPane jScrollPanelDatosEdicionCajaIngreso;
	public JScrollPane jScrollPanelDatosGeneralCajaIngreso;
	
	protected JPanel jPanelCamposCajaIngreso;    
	protected JPanel jPanelCamposOcultosCajaIngreso;    	
	protected JPanel jPanelAccionesCajaIngreso;
	protected JPanel jPanelAccionesFormularioCajaIngreso;
    
	
	
	protected Integer iXPanelCamposCajaIngreso=0;
	protected Integer iYPanelCamposCajaIngreso=0;
	
	protected Integer iXPanelCamposOcultosCajaIngreso=0;
	protected Integer iYPanelCamposOcultosCajaIngreso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaIngreso;
	public JButton jButtonModificarCajaIngreso;
	public JButton jButtonActualizarCajaIngreso;
    public JButton jButtonEliminarCajaIngreso;
	public JButton jButtonCancelarCajaIngreso;
    public JButton jButtonGuardarCambiosCajaIngreso;
	public JButton jButtonGuardarCambiosTablaCajaIngreso;
	protected JButton jButtonCerrarCajaIngreso;
	
	
	protected JButton jButtonProcesarInformacionCajaIngreso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaIngreso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaIngreso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaIngreso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaIngreso;
	protected JButton jButtonModificarToolBarCajaIngreso;
	protected JButton jButtonActualizarToolBarCajaIngreso;
    protected JButton jButtonEliminarToolBarCajaIngreso;
	protected JButton jButtonCancelarToolBarCajaIngreso;
    protected JButton jButtonGuardarCambiosToolBarCajaIngreso;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaIngreso;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaIngreso;
	protected JButton jButtonCerrarToolBarCajaIngreso;
	
	protected JButton jButtonProcesarInformacionToolBarCajaIngreso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaIngreso;
	protected JMenuItem jMenuItemModificarCajaIngreso;
	protected JMenuItem jMenuItemActualizarCajaIngreso;
    protected JMenuItem jMenuItemEliminarCajaIngreso;
	protected JMenuItem jMenuItemCancelarCajaIngreso;
    protected JMenuItem jMenuItemGuardarCambiosCajaIngreso;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaIngreso;
	protected JMenuItem jMenuItemCerrarCajaIngreso;
	protected JMenuItem jMenuItemDetalleCerrarCajaIngreso;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaIngreso;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaIngreso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaIngreso;
	protected JMenuItem jMenuItemMostrarOcultarCajaIngreso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaIngreso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaIngreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaIngreso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaIngreso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaIngreso;
	public JLabel jLabelIdCajaIngreso;
	public JLabel jLabelidCajaIngreso;
	public JButton jButtonidCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialCajaIngreso;
	public JLabel jLabelsecuencialCajaIngreso;
	public JTextField jTextFieldsecuencialCajaIngreso;
	public JButton jButtonsecuencialCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelfechaCajaIngreso;
	public JLabel jLabelfechaCajaIngreso;
	//public JFormattedTextField jDateChooserfechaCajaIngreso;

	public JDateChooser jDateChooserfechaCajaIngreso;
	public JButton jButtonfechaCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelhoraCajaIngreso;
	public JLabel jLabelhoraCajaIngreso;
	public JSpinner jSpinnerhoraCajaIngreso= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraCajaIngresoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajaIngreso;
	public JLabel jLabelid_empresaCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaIngreso;
	public JButton jButtonid_empresaCajaIngreso= new JButtonMe();
	public JButton jButtonid_empresaCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajaIngreso;
	public JLabel jLabelid_sucursalCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajaIngreso;
	public JButton jButtonid_sucursalCajaIngreso= new JButtonMe();
	public JButton jButtonid_sucursalCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioCajaIngreso;
	public JLabel jLabelid_usuarioCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioCajaIngreso;
	public JButton jButtonid_usuarioCajaIngreso= new JButtonMe();
	public JButton jButtonid_usuarioCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaCajaIngreso;
	public JLabel jLabelid_cajaCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajaIngreso;
	public JButton jButtonid_cajaCajaIngreso= new JButtonMe();
	public JButton jButtonid_cajaCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajaIngresoBusqueda= new JButtonMe();

	public JPanel jPanelid_turno_pun_venCajaIngreso;
	public JLabel jLabelid_turno_pun_venCajaIngreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_turno_pun_venCajaIngreso;
	public JButton jButtonid_turno_pun_venCajaIngreso= new JButtonMe();
	public JButton jButtonid_turno_pun_venCajaIngresoUpdate= new JButtonMe();
	public JButton jButtonid_turno_pun_venCajaIngresoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaIngreso;
	
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
	
	public CajaIngresoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaIngreso=new JPanel();
				this.jPanelAccionesFormularioCajaIngreso=new JPanel();
				this.jmenuBarDetalleCajaIngreso=new JMenuBar();
				this.jTtoolBarDetalleCajaIngreso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaIngresoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaIngresoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaIngreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaIngreso() {
		return this.jButtonActualizarToolBarCajaIngreso;
	}
	
	public JButton getjButtonEliminarToolBarCajaIngreso() {
		return this.jButtonEliminarToolBarCajaIngreso;
	}
	
	public JButton getjButtonCancelarToolBarCajaIngreso() {
		return this.jButtonCancelarToolBarCajaIngreso;
	}		
	
	public JButton getjButtonProcesarInformacionCajaIngreso() {
		return this.jButtonProcesarInformacionCajaIngreso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaIngreso)	{
		this.jButtonProcesarInformacionCajaIngreso = jButtonProcesarInformacionCajaIngreso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaIngreso() {
		return this.jComboBoxTiposAccionesCajaIngreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaIngreso(
			JComboBox jComboBoxTiposRelacionesCajaIngreso) {
		this.jComboBoxTiposRelacionesCajaIngreso = jComboBoxTiposRelacionesCajaIngreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaIngreso(
			JComboBox jComboBoxTiposAccionesCajaIngreso) {
		this.jComboBoxTiposAccionesCajaIngreso = jComboBoxTiposAccionesCajaIngreso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaIngreso() {
		return this.jComboBoxTiposAccionesFormularioCajaIngreso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaIngreso(
			JComboBox jComboBoxTiposAccionesFormularioCajaIngreso) {
		this.jComboBoxTiposAccionesFormularioCajaIngreso = jComboBoxTiposAccionesFormularioCajaIngreso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajaingresoSessionBean=new CajaIngresoSessionBean();
		
		this.cajaingresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaingresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaingresoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaIngresoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Ingreso MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaIngresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaIngreso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaIngreso=new JButtonMe();
				this.jButtonModificarToolBarCajaIngreso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaIngreso,this.jTtoolBarDetalleCajaIngreso,
							"actualizar","actualizar","Actualizar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaIngreso,this.jTtoolBarDetalleCajaIngreso,
							"eliminar","eliminar","Eliminar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaIngreso,this.jTtoolBarDetalleCajaIngreso,
							"cancelar","cancelar","Cancelar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaIngreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaIngreso,this.jTtoolBarDetalleCajaIngreso,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaIngreso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaIngreso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaIngreso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaIngreso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaIngreso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaIngreso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaIngreso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaIngreso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaIngreso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaIngreso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaIngreso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaIngreso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaIngreso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaIngreso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaIngreso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaIngreso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaIngreso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaIngreso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaIngreso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaIngreso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaIngreso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaIngreso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaIngreso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaIngreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaIngreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaIngreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaIngreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaIngreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaIngreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaIngreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaIngreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaIngreso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaIngreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaIngreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaIngreso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaIngreso.add(this.jMenuItemDetalleCerrarCajaIngreso);
		
		this.jmenuDetalleAccionesCajaIngreso.add(this.jMenuItemActualizarCajaIngreso);
		this.jmenuDetalleAccionesCajaIngreso.add(this.jMenuItemEliminarCajaIngreso);
		this.jmenuDetalleAccionesCajaIngreso.add(this.jMenuItemCancelarCajaIngreso);		
		
		//this.jmenuDetalleDatosCajaIngreso.add(this.jMenuItemDetalleAbrirOrderByCajaIngreso);				
		this.jmenuDetalleDatosCajaIngreso.add(this.jMenuItemDetalleMostarOcultarCajaIngreso);				
				
		//this.jmenuDetalleAccionesCajaIngreso.add(this.jMenuItemGuardarCambiosCajaIngreso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaIngreso.add(this.jmenuDetalleArchivoCajaIngreso);		
		this.jmenuBarDetalleCajaIngreso.add(this.jmenuDetalleAccionesCajaIngreso);		
		this.jmenuBarDetalleCajaIngreso.add(this.jmenuDetalleDatosCajaIngreso);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCajaIngreso.add(this.jmenuDetalleCajaIngreso);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaIngreso);				
	}
	
	
	public void inicializarElementosCamposCajaIngreso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaIngreso = new JLabelMe();
		jLabelIdCajaIngreso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaIngreso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaIngreso= new GridBagLayout();

		this.jPanelidCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);

		jLabelidCajaIngreso = new JLabel();
		jLabelidCajaIngreso.setText("Id");

		jLabelidCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialCajaIngreso = new JLabelMe();
		this.jLabelsecuencialCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialCajaIngreso.setToolTipText("Secuencial");
		this.jLabelsecuencialCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelsecuencialCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		jTextFieldsecuencialCajaIngreso= new JTextFieldMe();

		jTextFieldsecuencialCajaIngreso.setEnabled(false);
		jTextFieldsecuencialCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialCajaIngresoBusqueda= new JButtonMe();
		this.jButtonsecuencialCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialCajaIngresoBusqueda.setText("U");
		this.jButtonsecuencialCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialCajaIngresoBusqueda.setVisible(false);		}


					
		this.jLabelfechaCajaIngreso = new JLabelMe();
		this.jLabelfechaCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCajaIngreso.setToolTipText("Fecha");
		this.jLabelfechaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelfechaCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		//jFormattedTextFieldfechaCajaIngreso= new JFormattedTextFieldMe();

		jDateChooserfechaCajaIngreso= new JDateChooser();
		jDateChooserfechaCajaIngreso.setEnabled(false);
		jDateChooserfechaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCajaIngreso.setDate(new Date());
		jDateChooserfechaCajaIngreso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCajaIngreso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCajaIngresoBusqueda= new JButtonMe();
		this.jButtonfechaCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCajaIngresoBusqueda.setText("U");
		this.jButtonfechaCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCajaIngresoBusqueda.setVisible(false);		}


					
		this.jLabelhoraCajaIngreso = new JLabelMe();
		this.jLabelhoraCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraCajaIngreso.setToolTipText("Hora");
		this.jLabelhoraCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelhoraCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		//jFormattedTextFieldhoraCajaIngreso= new JFormattedTextFieldMe();

		jSpinnerhoraCajaIngreso= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraCajaIngreso.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraCajaIngreso = new JSpinner.DateEditor(jSpinnerhoraCajaIngreso, "HH:mm:ss");

		jSpinnerhoraCajaIngreso.setEditor(timeEditorhoraCajaIngreso);

		jSpinnerhoraCajaIngreso.setValue(new Date());

		jSpinnerhoraCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraCajaIngreso.setValue(new Date());
		//jSpinnerhoraCajaIngreso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraCajaIngreso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraCajaIngresoBusqueda= new JButtonMe();
		this.jButtonhoraCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraCajaIngresoBusqueda.setText("U");
		this.jButtonhoraCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraCajaIngresoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaIngreso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajaIngreso = new JLabelMe();
		this.jLabelid_empresaCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaIngreso.setToolTipText("Empresa");
		this.jLabelid_empresaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelid_empresaCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		jComboBoxid_empresaCajaIngreso= new JComboBoxMe();
		jComboBoxid_empresaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaIngreso.setEnabled(false);

		this.jButtonid_empresaCajaIngreso= new JButtonMe();
		this.jButtonid_empresaCajaIngreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaIngreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaIngreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaIngreso.setText("Buscar");
		this.jButtonid_empresaCajaIngreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaIngreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaIngreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaIngreso"));

		this.jButtonid_empresaCajaIngresoBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaIngresoBusqueda.setText("U");
		this.jButtonid_empresaCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaIngresoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaIngresoUpdate= new JButtonMe();
		this.jButtonid_empresaCajaIngresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaIngresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaIngresoUpdate.setText("U");
		this.jButtonid_empresaCajaIngresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaIngresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaIngresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaIngresoUpdate"));



					
		this.jLabelid_sucursalCajaIngreso = new JLabelMe();
		this.jLabelid_sucursalCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajaIngreso.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelid_sucursalCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		jComboBoxid_sucursalCajaIngreso= new JComboBoxMe();
		jComboBoxid_sucursalCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajaIngreso.setEnabled(false);

		this.jButtonid_sucursalCajaIngreso= new JButtonMe();
		this.jButtonid_sucursalCajaIngreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaIngreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaIngreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaIngreso.setText("Buscar");
		this.jButtonid_sucursalCajaIngreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajaIngreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaIngreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaIngreso"));

		this.jButtonid_sucursalCajaIngresoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaIngresoBusqueda.setText("U");
		this.jButtonid_sucursalCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajaIngresoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajaIngresoUpdate= new JButtonMe();
		this.jButtonid_sucursalCajaIngresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaIngresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaIngresoUpdate.setText("U");
		this.jButtonid_sucursalCajaIngresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajaIngresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaIngresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaIngresoUpdate"));



					
		this.jLabelid_usuarioCajaIngreso = new JLabelMe();
		this.jLabelid_usuarioCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioCajaIngreso.setToolTipText("Usuario");
		this.jLabelid_usuarioCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelid_usuarioCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		jComboBoxid_usuarioCajaIngreso= new JComboBoxMe();
		jComboBoxid_usuarioCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioCajaIngreso.setEnabled(false);

		this.jButtonid_usuarioCajaIngreso= new JButtonMe();
		this.jButtonid_usuarioCajaIngreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaIngreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaIngreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaIngreso.setText("Buscar");
		this.jButtonid_usuarioCajaIngreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioCajaIngreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaIngreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaIngreso"));

		this.jButtonid_usuarioCajaIngresoBusqueda= new JButtonMe();
		this.jButtonid_usuarioCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajaIngresoBusqueda.setText("U");
		this.jButtonid_usuarioCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioCajaIngresoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioCajaIngresoUpdate= new JButtonMe();
		this.jButtonid_usuarioCajaIngresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaIngresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaIngresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajaIngresoUpdate.setText("U");
		this.jButtonid_usuarioCajaIngresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioCajaIngresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaIngresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaIngresoUpdate"));



					
		this.jLabelid_cajaCajaIngreso = new JLabelMe();
		this.jLabelid_cajaCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajaIngreso.setToolTipText("Caja");
		this.jLabelid_cajaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelid_cajaCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		jComboBoxid_cajaCajaIngreso= new JComboBoxMe();
		jComboBoxid_cajaCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaCajaIngreso= new JButtonMe();
		this.jButtonid_cajaCajaIngreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaIngreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaIngreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaIngreso.setText("Buscar");
		this.jButtonid_cajaCajaIngreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajaIngreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaIngreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaIngreso"));

		this.jButtonid_cajaCajaIngresoBusqueda= new JButtonMe();
		this.jButtonid_cajaCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaIngresoBusqueda.setText("U");
		this.jButtonid_cajaCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajaIngresoBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajaIngresoUpdate= new JButtonMe();
		this.jButtonid_cajaCajaIngresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaIngresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaIngresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaIngresoUpdate.setText("U");
		this.jButtonid_cajaCajaIngresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajaIngresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaIngresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaIngresoUpdate"));



					
		this.jLabelid_turno_pun_venCajaIngreso = new JLabelMe();
		this.jLabelid_turno_pun_venCajaIngreso.setText(""+CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN+" : *");
		this.jLabelid_turno_pun_venCajaIngreso.setToolTipText("Turno");
		this.jLabelid_turno_pun_venCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_turno_pun_venCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_turno_pun_venCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_turno_pun_venCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_turno_pun_venCajaIngreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_turno_pun_venCajaIngreso.setToolTipText(CajaIngresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
		this.gridaBagLayoutCajaIngreso = new GridBagLayout();
		this.jPanelid_turno_pun_venCajaIngreso.setLayout(this.gridaBagLayoutCajaIngreso);


		jComboBoxid_turno_pun_venCajaIngreso= new JComboBoxMe();
		jComboBoxid_turno_pun_venCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_turno_pun_venCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_turno_pun_venCajaIngreso= new JButtonMe();
		this.jButtonid_turno_pun_venCajaIngreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajaIngreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajaIngreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajaIngreso.setText("Buscar");
		this.jButtonid_turno_pun_venCajaIngreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_turno_pun_venCajaIngreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajaIngreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_turno_pun_venCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajaIngreso"));

		this.jButtonid_turno_pun_venCajaIngresoBusqueda= new JButtonMe();
		this.jButtonid_turno_pun_venCajaIngresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaIngresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaIngresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_turno_pun_venCajaIngresoBusqueda.setText("U");
		this.jButtonid_turno_pun_venCajaIngresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_turno_pun_venCajaIngresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajaIngresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_turno_pun_venCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajaIngresoBusqueda"));

		if(this.cajaingresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_turno_pun_venCajaIngresoBusqueda.setVisible(false);		}

		this.jButtonid_turno_pun_venCajaIngresoUpdate= new JButtonMe();
		this.jButtonid_turno_pun_venCajaIngresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaIngresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaIngresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_turno_pun_venCajaIngresoUpdate.setText("U");
		this.jButtonid_turno_pun_venCajaIngresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_turno_pun_venCajaIngresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajaIngresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_turno_pun_venCajaIngreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajaIngreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajaIngresoUpdate"));



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
		//this.jInternalFrameDetalleCajaIngreso = new CajaIngresoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Ingreso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaIngreso= new GridBagLayout();
		

		
		String sToolTipCajaIngreso="";
		sToolTipCajaIngreso=CajaIngresoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaIngreso+="(PuntoVenta.CajaIngreso)";
		}
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaIngreso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaIngreso = new JButtonMe();
		this.jButtonModificarCajaIngreso = new JButtonMe();
        this.jButtonActualizarCajaIngreso = new JButtonMe();
        this.jButtonEliminarCajaIngreso = new JButtonMe();
        this.jButtonCancelarCajaIngreso = new JButtonMe();
        this.jButtonGuardarCambiosCajaIngreso = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaIngreso = new JButtonMe();
		this.jButtonCerrarCajaIngreso = new JButtonMe();
		
		this.jScrollPanelDatosCajaIngreso = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaIngreso = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaIngreso = new JScrollPane();
				
		
		
		this.jPanelCamposCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Ingreso";
		
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Ingresos" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaIngreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaIngreso.setName("jPanelCamposCajaIngreso"); 

		this.jPanelCamposOcultosCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaIngreso.setName("jPanelCamposOcultosCajaIngreso"); 

        this.jPanelAccionesCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaIngreso.setToolTipText("Acciones");
        this.jPanelAccionesCajaIngreso.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaIngreso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaIngreso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaIngreso.setText("Nuevo");
		this.jButtonModificarCajaIngreso.setText("Editar");
        this.jButtonActualizarCajaIngreso.setText("Actualizar");
        this.jButtonEliminarCajaIngreso.setText("Eliminar");
        this.jButtonCancelarCajaIngreso.setText("Cancelar");
        this.jButtonGuardarCambiosCajaIngreso.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaIngreso.setText("Guardar");
		this.jButtonCerrarCajaIngreso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaIngreso,"nuevo_button","Nuevo",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaIngreso,"modificar_button","Editar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaIngreso,"actualizar_button","Actualizar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaIngreso,"eliminar_button","Eliminar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaIngreso,"cancelar_button","Cancelar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaIngreso,"guardarcambios_button","Guardar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaIngreso,"guardarcambiostabla_button","Guardar",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaIngreso,"cerrar_button","Salir",this.cajaingresoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaIngreso.setToolTipText("Nuevo"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaIngreso.setToolTipText("Editar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaIngreso.setToolTipText("Actualizar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaIngreso.setToolTipText("Eliminar)"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaIngreso.setToolTipText("Cancelar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaIngreso.setToolTipText("Guardar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaIngreso.setToolTipText("Guardar"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaIngreso.setToolTipText("Salir"+" "+CajaIngresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaIngreso";
		inputMap = this.jButtonNuevoCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaIngreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaIngreso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaIngreso";
		inputMap = this.jButtonActualizarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaIngreso"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaIngreso";
		inputMap = this.jButtonEliminarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaIngreso"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaIngreso";
		inputMap = this.jButtonCancelarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaIngreso"));
		
		//CERRAR		
		sMapKey = "CerrarCajaIngreso";
		inputMap = this.jButtonCerrarCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaIngreso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaIngreso";
		inputMap = this.jButtonGuardarCambiosTablaCajaIngreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaIngreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaIngreso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaIngreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaIngreso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaIngreso.setToolTipText("Nuevo CajaIngreso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaIngreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaIngreso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaIngreso.setToolTipText("Sin Cerrar Ventana CajaIngreso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaIngreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaIngreso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaIngreso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaIngreso.setText("Accion");
		this.jComboBoxTiposAccionesCajaIngreso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaIngreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaIngreso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaIngreso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaIngreso = new JLabelMe();
		
		this.jLabelAccionesCajaIngreso.setText("Acciones");		
		this.jLabelAccionesCajaIngreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaIngreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaIngreso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaIngreso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaIngreso=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaIngreso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaIngreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaIngreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaIngreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaIngreso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaIngreso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaIngreso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaIngreso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaIngreso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaIngreso = new GridBagLayout();
		
		this.jPanelCamposCajaIngreso.setLayout(gridaBagLayoutCamposCajaIngreso);
		this.jPanelCamposOcultosCajaIngreso.setLayout(gridaBagLayoutCamposOcultosCajaIngreso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaIngreso.add(jLabelIdCajaIngreso, this.gridBagConstraintsCajaIngreso);



	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaIngreso.add(jLabelidCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaIngreso.add(jLabelid_empresaCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaIngreso.add(jButtonid_empresaCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 3;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaIngreso.add(jButtonid_empresaCajaIngresoUpdate, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaIngreso.add(jComboBoxid_empresaCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajaIngreso.add(jLabelid_sucursalCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaIngreso.add(jButtonid_sucursalCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 3;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaIngreso.add(jButtonid_sucursalCajaIngresoUpdate, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajaIngreso.add(jComboBoxid_sucursalCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioCajaIngreso.add(jLabelid_usuarioCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajaIngreso.add(jButtonid_usuarioCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 3;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajaIngreso.add(jButtonid_usuarioCajaIngresoUpdate, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioCajaIngreso.add(jComboBoxid_usuarioCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajaIngreso.add(jLabelid_cajaCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaIngreso.add(jButtonid_cajaCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 3;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaIngreso.add(jButtonid_cajaCajaIngresoUpdate, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajaIngreso.add(jComboBoxid_cajaCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_turno_pun_venCajaIngreso.add(jLabelid_turno_pun_venCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_turno_pun_venCajaIngreso.add(jButtonid_turno_pun_venCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 3;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_turno_pun_venCajaIngreso.add(jButtonid_turno_pun_venCajaIngresoUpdate, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_turno_pun_venCajaIngreso.add(jComboBoxid_turno_pun_venCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialCajaIngreso.add(jLabelsecuencialCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialCajaIngreso.add(jButtonsecuencialCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialCajaIngreso.add(jTextFieldsecuencialCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCajaIngreso.add(jLabelfechaCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCajaIngreso.add(jButtonfechaCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCajaIngreso.add(jDateChooserfechaCajaIngreso, this.gridBagConstraintsCajaIngreso);


	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 0;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoraCajaIngreso.add(jLabelhoraCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = 2;
		this.gridBagConstraintsCajaIngreso.ipadx = 0;
		this.gridBagConstraintsCajaIngreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraCajaIngreso.add(jButtonhoraCajaIngresoBusqueda, this.gridBagConstraintsCajaIngreso);
	}

	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaIngreso.gridy = 0;
	this.gridBagConstraintsCajaIngreso.gridx = 1;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoraCajaIngreso.add(jSpinnerhoraCajaIngreso, this.gridBagConstraintsCajaIngreso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngreso.add(this.jPanelidCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposCajaIngreso % 1==0) {
		iXPanelCamposCajaIngreso=0;
		iYPanelCamposCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngreso.add(this.jPanelid_cajaCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposCajaIngreso % 1==0) {
		iXPanelCamposCajaIngreso=0;
		iYPanelCamposCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngreso.add(this.jPanelid_turno_pun_venCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposCajaIngreso % 1==0) {
		iXPanelCamposCajaIngreso=0;
		iYPanelCamposCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngreso.add(this.jPanelsecuencialCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposCajaIngreso % 1==0) {
		iXPanelCamposCajaIngreso=0;
		iYPanelCamposCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngreso.add(this.jPanelfechaCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposCajaIngreso % 1==0) {
		iXPanelCamposCajaIngreso=0;
		iYPanelCamposCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaIngreso.add(this.jPanelhoraCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposCajaIngreso % 1==0) {
		iXPanelCamposCajaIngreso=0;
		iYPanelCamposCajaIngreso++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposOcultosCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposOcultosCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaIngreso.add(this.jPanelid_empresaCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposOcultosCajaIngreso % 1==0) {
		iXPanelCamposOcultosCajaIngreso=0;
		iYPanelCamposOcultosCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposOcultosCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposOcultosCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaIngreso.add(this.jPanelid_sucursalCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposOcultosCajaIngreso % 1==0) {
		iXPanelCamposOcultosCajaIngreso=0;
		iYPanelCamposOcultosCajaIngreso++;
	}
	this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaIngreso.gridy = iYPanelCamposOcultosCajaIngreso;
	this.gridBagConstraintsCajaIngreso.gridx = iXPanelCamposOcultosCajaIngreso++;
	this.gridBagConstraintsCajaIngreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaIngreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaIngreso.add(this.jPanelid_usuarioCajaIngreso, this.gridBagConstraintsCajaIngreso);



	if(iXPanelCamposOcultosCajaIngreso % 1==0) {
		iXPanelCamposOcultosCajaIngreso=0;
		iYPanelCamposOcultosCajaIngreso++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaIngreso= new GridBagLayout();
		this.jPanelAccionesCajaIngreso.setLayout(gridaBagLayoutAccionesCajaIngreso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaIngreso= new GridBagLayout();
		this.jPanelAccionesFormularioCajaIngreso.setLayout(gridaBagLayoutAccionesFormularioCajaIngreso);
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaIngreso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaIngreso.add(this.jComboBoxTiposAccionesFormularioCajaIngreso, this.gridBagConstraintsCajaIngreso);

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaIngreso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaIngreso.add(this.jCheckBoxPostAccionNuevoCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaIngreso.add(this.jCheckBoxPostAccionSinCerrarCajaIngreso, this.gridBagConstraintsCajaIngreso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajaingresoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajaingresoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaIngreso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaIngreso.add(this.jCheckBoxPostAccionSinMensajeCajaIngreso, this.gridBagConstraintsCajaIngreso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaIngreso.add(this.jButtonModificarCajaIngreso, this.gridBagConstraintsCajaIngreso);							

		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaIngreso.gridy = 0;
		this.gridBagConstraintsCajaIngreso.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaIngreso.add(this.jButtonEliminarCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
			
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = 0;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaIngreso.add(this.jButtonActualizarCajaIngreso, this.gridBagConstraintsCajaIngreso);


		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = 0;		
		this.gridBagConstraintsCajaIngreso.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaIngreso.add(this.jButtonGuardarCambiosCajaIngreso, this.gridBagConstraintsCajaIngreso);	
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = 0;		
		this.gridBagConstraintsCajaIngreso.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaIngreso.add(this.jButtonCancelarCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaIngreso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaIngreso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaingresoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();						
			this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaIngreso.gridx = 0;		
			//this.gridBagConstraintsCajaIngreso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaIngreso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaIngreso.gridx =0;
		this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaIngreso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaIngreso, this.gridBagConstraintsCajaIngreso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaIngresoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaIngreso = new CajaIngresoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Ingreso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Ingreso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Ingreso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaIngresoModel cajaingresoModel=new CajaIngresoModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaIngresoModel.CajaIngresoFocusTraversalPolicy cajaingresoFocusTraversalPolicy = cajaingresoModel.new CajaIngresoFocusTraversalPolicy(this);
			
			//cajaingresoFocusTraversalPolicy.setcajaingresoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajaingresoModel);
			
			
			this.jContentPaneDetalleCajaIngreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaIngreso = new GridBagLayout();	
			this.jContentPaneDetalleCajaIngreso.setLayout(gridaBagLayoutDetalleCajaIngreso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaIngreso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
				this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaIngreso.gridx = 0;
					
				
				this.jContentPaneDetalleCajaIngreso.add(jTtoolBarDetalleCajaIngreso, gridBagConstraintsCajaIngreso);								
				
}
			
			this.jScrollPanelDatosEdicionCajaIngreso=   new JScrollPane(jContentPaneDetalleCajaIngreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaIngreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaIngreso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaIngreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaIngreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaIngreso.gridx = 0;
	        
			this.jContentPaneDetalleCajaIngreso.add(jPanelCamposCajaIngreso, gridBagConstraintsCajaIngreso);
			
			
			
			
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
						&& cajaingresoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCajaIngresoDetalle(this.puedeCargarPorParteCajaIngresoDetalle,false,-1);
					
					if(this.cajaingresoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaIngreso= new GridBagConstraints();
						this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaIngreso.gridx = 0;
						this.jContentPaneDetalleCajaIngreso.add(this.jTabbedPaneRelacionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaIngreso.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCajaIngresoDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaIngreso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
					this.gridBagConstraintsCajaIngreso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaIngreso.gridx = 0;
					
				
					this.jContentPaneDetalleCajaIngreso.add(jPanelCamposOcultosCajaIngreso, gridBagConstraintsCajaIngreso);
				
					this.jPanelCamposOcultosCajaIngreso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCajaIngreso.gridx = 0;
	        this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaIngreso.add(this.jPanelAccionesFormularioCajaIngreso, this.gridBagConstraintsCajaIngreso);							
			
			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
	        this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCajaIngreso.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaIngreso.add(this.jPanelAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaIngreso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaIngreso=   new JScrollPane(this.jPanelCamposCajaIngreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaIngreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaIngreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaIngreso.gridx = 0;
			this.gridBagConstraintsCajaIngreso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaIngreso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaIngreso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaIngreso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaIngreso, this.gridBagConstraintsCajaIngreso);			
			
			this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
			this.gridBagConstraintsCajaIngreso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaIngreso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaIngreso, this.gridBagConstraintsCajaIngreso);
			
			
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaIngreso, this.gridBagConstraintsCajaIngreso);
		
			
		this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
		this.gridBagConstraintsCajaIngreso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaIngreso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaIngreso, this.gridBagConstraintsCajaIngreso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaIngreso;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaIngreso;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCajaIngresoDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		this.cajaingresodetalleSessionBean.setConGuardarRelaciones(false);
		this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(true);

		this.cajaingresodetalleBeanSwingJInternalFrame=null;//new CajaIngresoDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaingresodetalleBeanSwingJInternalFramePopup=new CajaIngresoDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaingresodetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {

				CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaIngresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaIngresoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(true);

				this.cajaingresodetalleBeanSwingJInternalFrame=new CajaIngresoDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaingresodetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaingresodetalleBeanSwingJInternalFrame.setcajaingresodetalleSessionBean(this.cajaingresodetalleSessionBean);

				//this.gridBagConstraintsCajaIngreso = new GridBagConstraints();
				//this.gridBagConstraintsCajaIngreso.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCajaIngreso.gridx = 0;
				//this.jContentPaneDetalleCajaIngreso.add(this.cajaingresodetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCajaIngreso);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCajaIngreso.add("Caja Ingreso Detalles",this.cajaingresodetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCajaIngreso.setComponentAt(iIndexTab,this.cajaingresodetalleBeanSwingJInternalFrame.getContentPane());
				}

				//CajaIngresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(false);
				this.cajaingresodetalleBeanSwingJInternalFrame=null;//new CajaIngresoDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaIngresoDetalle) {
					this.jTabbedPaneRelacionesCajaIngreso.add("Caja Ingreso Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCajaIngresoDetalleBeanSwingJInternalFrame(List<CajaIngreso> cajaingresos,CajaIngreso cajaingreso,CajaIngresoDetalleBeanSwingJInternalFrame cajaingresodetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaingresodetalleBeanSwingJInternalFrame=new CajaIngresoDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaingresodetalleBeanSwingJInternalFrame.getCajaIngresoDetalleLogic().setConnexion(this.cajaingresoLogic.getConnexion());

					cajaingresodetalleBeanSwingJInternalFrame.setcajaingresosForeignKey(cajaingresos);
					cajaingresodetalleBeanSwingJInternalFrame.setcajaingresoForeignKey(cajaingreso);
					cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionCajaIngreso(true);
					cajaingresodetalleBeanSwingJInternalFrame.cajaingresodetalleSessionBean.setlidCajaIngresoActual(cajaingreso.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaingresodetalleBeanSwingJInternalFrame.cargarCombosForeignKeyCajaIngresoDetalle(cajaingresodetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaingresodetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaCajaIngreso(true);
					cajaingresodetalleBeanSwingJInternalFrame.setid_caja_ingresoFK_IdCajaIngreso(cajaingreso.getId());

					if(!this.conCargarFormDetalle) {
						cajaingresodetalleBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaingresodetalleBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaIngresoForeignKey(cajaingreso,1,false,true,true);
					cajaingresodetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaingresodetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdCajaIngreso");
					cajaingresodetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCajaIngreso");
					cajaingresodetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngresoDetalle(true);
					cajaingresodetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n",cajaingresodetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaingresodetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaingresodetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaingresodetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaingresodetalleBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngresoDetalle("relacionado");
					} else {
						cajaingresodetalleBeanSwingJInternalFrame.actualizarEstadoPanelsCajaIngresoDetalle("no_relacionado");
					}

					cajaingresodetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaIngresoDetalle().setVisible(false);

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
