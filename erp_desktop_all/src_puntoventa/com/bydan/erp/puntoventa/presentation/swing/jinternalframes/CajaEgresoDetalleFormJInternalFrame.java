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
import com.bydan.erp.puntoventa.util.CajaEgresoConstantesFunciones;

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
public class CajaEgresoDetalleFormJInternalFrame extends CajaEgresoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaEgreso;
	
	protected JMenuBar jmenuBarDetalleCajaEgreso;
	
	protected JMenu jmenuDetalleCajaEgreso;
	protected JMenu jmenuDetalleArchivoCajaEgreso;
	protected JMenu jmenuDetalleAccionesCajaEgreso;
	protected JMenu jmenuDetalleDatosCajaEgreso;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaEgreso;	
	protected GridBagConstraints gridBagConstraintsCajaEgreso;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaEgresoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaEgreso;		
	
	
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
	
	public CajaEgresoSessionBean cajaegresoSessionBean;
	
	

	public CajaEgresoDetalleBeanSwingJInternalFrame cajaegresodetalleBeanSwingJInternalFrame=null;
	public CajaEgresoDetalleBeanSwingJInternalFrame cajaegresodetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajaEgresoDetalle=false;
	public CajaEgresoDetalleSessionBean cajaegresodetalleSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public CajaSessionBean cajaSessionBean;
	public TurnoPunVenSessionBean turnopunvenSessionBean;	
	
	public CajaEgresoLogic cajaegresoLogic;
	
	public JScrollPane jScrollPanelDatosCajaEgreso;
	public JScrollPane jScrollPanelDatosEdicionCajaEgreso;
	public JScrollPane jScrollPanelDatosGeneralCajaEgreso;
	
	protected JPanel jPanelCamposCajaEgreso;    
	protected JPanel jPanelCamposOcultosCajaEgreso;    	
	protected JPanel jPanelAccionesCajaEgreso;
	protected JPanel jPanelAccionesFormularioCajaEgreso;
    
	
	
	protected Integer iXPanelCamposCajaEgreso=0;
	protected Integer iYPanelCamposCajaEgreso=0;
	
	protected Integer iXPanelCamposOcultosCajaEgreso=0;
	protected Integer iYPanelCamposOcultosCajaEgreso=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaEgreso;
	public JButton jButtonModificarCajaEgreso;
	public JButton jButtonActualizarCajaEgreso;
    public JButton jButtonEliminarCajaEgreso;
	public JButton jButtonCancelarCajaEgreso;
    public JButton jButtonGuardarCambiosCajaEgreso;
	public JButton jButtonGuardarCambiosTablaCajaEgreso;
	protected JButton jButtonCerrarCajaEgreso;
	
	
	protected JButton jButtonProcesarInformacionCajaEgreso;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaEgreso;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaEgreso;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaEgreso;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaEgreso;
	protected JButton jButtonModificarToolBarCajaEgreso;
	protected JButton jButtonActualizarToolBarCajaEgreso;
    protected JButton jButtonEliminarToolBarCajaEgreso;
	protected JButton jButtonCancelarToolBarCajaEgreso;
    protected JButton jButtonGuardarCambiosToolBarCajaEgreso;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaEgreso;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaEgreso;
	protected JButton jButtonCerrarToolBarCajaEgreso;
	
	protected JButton jButtonProcesarInformacionToolBarCajaEgreso;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaEgreso;
	protected JMenuItem jMenuItemModificarCajaEgreso;
	protected JMenuItem jMenuItemActualizarCajaEgreso;
    protected JMenuItem jMenuItemEliminarCajaEgreso;
	protected JMenuItem jMenuItemCancelarCajaEgreso;
    protected JMenuItem jMenuItemGuardarCambiosCajaEgreso;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaEgreso;
	protected JMenuItem jMenuItemCerrarCajaEgreso;
	protected JMenuItem jMenuItemDetalleCerrarCajaEgreso;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaEgreso;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaEgreso;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaEgreso;
	protected JMenuItem jMenuItemMostrarOcultarCajaEgreso;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaEgreso;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaEgreso;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaEgreso;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaEgreso;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaEgreso;
	public JLabel jLabelIdCajaEgreso;
	public JLabel jLabelidCajaEgreso;
	public JButton jButtonidCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialCajaEgreso;
	public JLabel jLabelsecuencialCajaEgreso;
	public JTextField jTextFieldsecuencialCajaEgreso;
	public JButton jButtonsecuencialCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelfechaCajaEgreso;
	public JLabel jLabelfechaCajaEgreso;
	//public JFormattedTextField jDateChooserfechaCajaEgreso;

	public JDateChooser jDateChooserfechaCajaEgreso;
	public JButton jButtonfechaCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelhoraCajaEgreso;
	public JLabel jLabelhoraCajaEgreso;
	public JSpinner jSpinnerhoraCajaEgreso= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelvalorCajaEgreso;
	public JLabel jLabelvalorCajaEgreso;
	public JTextField jTextFieldvalorCajaEgreso;
	public JButton jButtonvalorCajaEgresoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajaEgreso;
	public JLabel jLabelid_empresaCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaEgreso;
	public JButton jButtonid_empresaCajaEgreso= new JButtonMe();
	public JButton jButtonid_empresaCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajaEgreso;
	public JLabel jLabelid_sucursalCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajaEgreso;
	public JButton jButtonid_sucursalCajaEgreso= new JButtonMe();
	public JButton jButtonid_sucursalCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioCajaEgreso;
	public JLabel jLabelid_usuarioCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioCajaEgreso;
	public JButton jButtonid_usuarioCajaEgreso= new JButtonMe();
	public JButton jButtonid_usuarioCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaCajaEgreso;
	public JLabel jLabelid_cajaCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajaEgreso;
	public JButton jButtonid_cajaCajaEgreso= new JButtonMe();
	public JButton jButtonid_cajaCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajaEgresoBusqueda= new JButtonMe();

	public JPanel jPanelid_turno_pun_venCajaEgreso;
	public JLabel jLabelid_turno_pun_venCajaEgreso;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_turno_pun_venCajaEgreso;
	public JButton jButtonid_turno_pun_venCajaEgreso= new JButtonMe();
	public JButton jButtonid_turno_pun_venCajaEgresoUpdate= new JButtonMe();
	public JButton jButtonid_turno_pun_venCajaEgresoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaEgreso;
	
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
	
	public CajaEgresoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaEgreso=new JPanel();
				this.jPanelAccionesFormularioCajaEgreso=new JPanel();
				this.jmenuBarDetalleCajaEgreso=new JMenuBar();
				this.jTtoolBarDetalleCajaEgreso=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaEgresoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaEgresoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaEgreso No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaEgreso() {
		return this.jButtonActualizarToolBarCajaEgreso;
	}
	
	public JButton getjButtonEliminarToolBarCajaEgreso() {
		return this.jButtonEliminarToolBarCajaEgreso;
	}
	
	public JButton getjButtonCancelarToolBarCajaEgreso() {
		return this.jButtonCancelarToolBarCajaEgreso;
	}		
	
	public JButton getjButtonProcesarInformacionCajaEgreso() {
		return this.jButtonProcesarInformacionCajaEgreso;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaEgreso)	{
		this.jButtonProcesarInformacionCajaEgreso = jButtonProcesarInformacionCajaEgreso;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaEgreso() {
		return this.jComboBoxTiposAccionesCajaEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaEgreso(
			JComboBox jComboBoxTiposRelacionesCajaEgreso) {
		this.jComboBoxTiposRelacionesCajaEgreso = jComboBoxTiposRelacionesCajaEgreso;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaEgreso(
			JComboBox jComboBoxTiposAccionesCajaEgreso) {
		this.jComboBoxTiposAccionesCajaEgreso = jComboBoxTiposAccionesCajaEgreso;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaEgreso() {
		return this.jComboBoxTiposAccionesFormularioCajaEgreso;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaEgreso(
			JComboBox jComboBoxTiposAccionesFormularioCajaEgreso) {
		this.jComboBoxTiposAccionesFormularioCajaEgreso = jComboBoxTiposAccionesFormularioCajaEgreso;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajaegresoSessionBean=new CajaEgresoSessionBean();
		
		this.cajaegresoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaegresoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajaegresoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaEgresoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Egreso MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaEgresoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaEgreso= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaEgreso=new JButtonMe();
				this.jButtonModificarToolBarCajaEgreso=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaEgreso,this.jTtoolBarDetalleCajaEgreso,
							"actualizar","actualizar","Actualizar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaEgreso,this.jTtoolBarDetalleCajaEgreso,
							"eliminar","eliminar","Eliminar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaEgreso,this.jTtoolBarDetalleCajaEgreso,
							"cancelar","cancelar","Cancelar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaEgreso=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaEgreso,this.jTtoolBarDetalleCajaEgreso,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaEgreso=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaEgreso=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaEgreso=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaEgreso=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaEgreso=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaEgreso= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaEgreso.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaEgreso,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaEgreso= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaEgreso.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaEgreso,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaEgreso= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaEgreso.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaEgreso,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaEgreso= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaEgreso.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaEgreso,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaEgreso= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaEgreso.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaEgreso,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaEgreso= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaEgreso.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaEgreso,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaEgreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaEgreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaEgreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaEgreso= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaEgreso.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaEgreso,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaEgreso,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaEgreso= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaEgreso.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaEgreso,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaEgreso.add(this.jMenuItemDetalleCerrarCajaEgreso);
		
		this.jmenuDetalleAccionesCajaEgreso.add(this.jMenuItemActualizarCajaEgreso);
		this.jmenuDetalleAccionesCajaEgreso.add(this.jMenuItemEliminarCajaEgreso);
		this.jmenuDetalleAccionesCajaEgreso.add(this.jMenuItemCancelarCajaEgreso);		
		
		//this.jmenuDetalleDatosCajaEgreso.add(this.jMenuItemDetalleAbrirOrderByCajaEgreso);				
		this.jmenuDetalleDatosCajaEgreso.add(this.jMenuItemDetalleMostarOcultarCajaEgreso);				
				
		//this.jmenuDetalleAccionesCajaEgreso.add(this.jMenuItemGuardarCambiosCajaEgreso);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaEgreso.add(this.jmenuDetalleArchivoCajaEgreso);		
		this.jmenuBarDetalleCajaEgreso.add(this.jmenuDetalleAccionesCajaEgreso);		
		this.jmenuBarDetalleCajaEgreso.add(this.jmenuDetalleDatosCajaEgreso);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCajaEgreso.add(this.jmenuDetalleCajaEgreso);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaEgreso);				
	}
	
	
	public void inicializarElementosCamposCajaEgreso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaEgreso = new JLabelMe();
		jLabelIdCajaEgreso.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaEgreso = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaEgreso= new GridBagLayout();

		this.jPanelidCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);

		jLabelidCajaEgreso = new JLabel();
		jLabelidCajaEgreso.setText("Id");

		jLabelidCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialCajaEgreso = new JLabelMe();
		this.jLabelsecuencialCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialCajaEgreso.setToolTipText("Secuencial");
		this.jLabelsecuencialCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelsecuencialCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jTextFieldsecuencialCajaEgreso= new JTextFieldMe();

		jTextFieldsecuencialCajaEgreso.setEnabled(false);
		jTextFieldsecuencialCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialCajaEgresoBusqueda= new JButtonMe();
		this.jButtonsecuencialCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialCajaEgresoBusqueda.setText("U");
		this.jButtonsecuencialCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialCajaEgresoBusqueda.setVisible(false);		}


					
		this.jLabelfechaCajaEgreso = new JLabelMe();
		this.jLabelfechaCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCajaEgreso.setToolTipText("Fecha");
		this.jLabelfechaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelfechaCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		//jFormattedTextFieldfechaCajaEgreso= new JFormattedTextFieldMe();

		jDateChooserfechaCajaEgreso= new JDateChooser();
		jDateChooserfechaCajaEgreso.setEnabled(false);
		jDateChooserfechaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCajaEgreso.setDate(new Date());
		jDateChooserfechaCajaEgreso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCajaEgreso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCajaEgresoBusqueda= new JButtonMe();
		this.jButtonfechaCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCajaEgresoBusqueda.setText("U");
		this.jButtonfechaCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCajaEgresoBusqueda.setVisible(false);		}


					
		this.jLabelhoraCajaEgreso = new JLabelMe();
		this.jLabelhoraCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraCajaEgreso.setToolTipText("Hora");
		this.jLabelhoraCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelhoraCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		//jFormattedTextFieldhoraCajaEgreso= new JFormattedTextFieldMe();

		jSpinnerhoraCajaEgreso= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraCajaEgreso.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraCajaEgreso = new JSpinner.DateEditor(jSpinnerhoraCajaEgreso, "HH:mm:ss");

		jSpinnerhoraCajaEgreso.setEditor(timeEditorhoraCajaEgreso);

		jSpinnerhoraCajaEgreso.setValue(new Date());

		jSpinnerhoraCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraCajaEgreso.setValue(new Date());
		//jSpinnerhoraCajaEgreso.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraCajaEgreso.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraCajaEgresoBusqueda= new JButtonMe();
		this.jButtonhoraCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraCajaEgresoBusqueda.setText("U");
		this.jButtonhoraCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraCajaEgresoBusqueda.setVisible(false);		}


					
		this.jLabelvalorCajaEgreso = new JLabelMe();
		this.jLabelvalorCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorCajaEgreso.setToolTipText("Valor");
		this.jLabelvalorCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelvalorCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jTextFieldvalorCajaEgreso= new JTextFieldMe();
		jTextFieldvalorCajaEgreso.setEnabled(false);
		jTextFieldvalorCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorCajaEgreso.setText("0.0");

		this.jButtonvalorCajaEgresoBusqueda= new JButtonMe();
		this.jButtonvalorCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorCajaEgresoBusqueda.setText("U");
		this.jButtonvalorCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorCajaEgresoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaEgreso() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajaEgreso = new JLabelMe();
		this.jLabelid_empresaCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaEgreso.setToolTipText("Empresa");
		this.jLabelid_empresaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelid_empresaCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jComboBoxid_empresaCajaEgreso= new JComboBoxMe();
		jComboBoxid_empresaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaEgreso.setEnabled(false);

		this.jButtonid_empresaCajaEgreso= new JButtonMe();
		this.jButtonid_empresaCajaEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaEgreso.setText("Buscar");
		this.jButtonid_empresaCajaEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaEgreso"));

		this.jButtonid_empresaCajaEgresoBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaEgresoBusqueda.setText("U");
		this.jButtonid_empresaCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaEgresoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaEgresoUpdate= new JButtonMe();
		this.jButtonid_empresaCajaEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaEgresoUpdate.setText("U");
		this.jButtonid_empresaCajaEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaEgresoUpdate"));



					
		this.jLabelid_sucursalCajaEgreso = new JLabelMe();
		this.jLabelid_sucursalCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajaEgreso.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelid_sucursalCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jComboBoxid_sucursalCajaEgreso= new JComboBoxMe();
		jComboBoxid_sucursalCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajaEgreso.setEnabled(false);

		this.jButtonid_sucursalCajaEgreso= new JButtonMe();
		this.jButtonid_sucursalCajaEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaEgreso.setText("Buscar");
		this.jButtonid_sucursalCajaEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajaEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaEgreso"));

		this.jButtonid_sucursalCajaEgresoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaEgresoBusqueda.setText("U");
		this.jButtonid_sucursalCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajaEgresoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajaEgresoUpdate= new JButtonMe();
		this.jButtonid_sucursalCajaEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaEgresoUpdate.setText("U");
		this.jButtonid_sucursalCajaEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajaEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaEgresoUpdate"));



					
		this.jLabelid_usuarioCajaEgreso = new JLabelMe();
		this.jLabelid_usuarioCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioCajaEgreso.setToolTipText("Usuario");
		this.jLabelid_usuarioCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelid_usuarioCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jComboBoxid_usuarioCajaEgreso= new JComboBoxMe();
		jComboBoxid_usuarioCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioCajaEgreso.setEnabled(false);

		this.jButtonid_usuarioCajaEgreso= new JButtonMe();
		this.jButtonid_usuarioCajaEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajaEgreso.setText("Buscar");
		this.jButtonid_usuarioCajaEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioCajaEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaEgreso"));

		this.jButtonid_usuarioCajaEgresoBusqueda= new JButtonMe();
		this.jButtonid_usuarioCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajaEgresoBusqueda.setText("U");
		this.jButtonid_usuarioCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioCajaEgresoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioCajaEgresoUpdate= new JButtonMe();
		this.jButtonid_usuarioCajaEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajaEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajaEgresoUpdate.setText("U");
		this.jButtonid_usuarioCajaEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioCajaEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajaEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajaEgresoUpdate"));



					
		this.jLabelid_cajaCajaEgreso = new JLabelMe();
		this.jLabelid_cajaCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajaEgreso.setToolTipText("Caja");
		this.jLabelid_cajaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelid_cajaCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jComboBoxid_cajaCajaEgreso= new JComboBoxMe();
		jComboBoxid_cajaCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaCajaEgreso= new JButtonMe();
		this.jButtonid_cajaCajaEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaEgreso.setText("Buscar");
		this.jButtonid_cajaCajaEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajaEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaEgreso"));

		this.jButtonid_cajaCajaEgresoBusqueda= new JButtonMe();
		this.jButtonid_cajaCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaEgresoBusqueda.setText("U");
		this.jButtonid_cajaCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajaEgresoBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajaEgresoUpdate= new JButtonMe();
		this.jButtonid_cajaCajaEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaEgresoUpdate.setText("U");
		this.jButtonid_cajaCajaEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajaEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaEgresoUpdate"));



					
		this.jLabelid_turno_pun_venCajaEgreso = new JLabelMe();
		this.jLabelid_turno_pun_venCajaEgreso.setText(""+CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN+" : *");
		this.jLabelid_turno_pun_venCajaEgreso.setToolTipText("Turno");
		this.jLabelid_turno_pun_venCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_turno_pun_venCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_turno_pun_venCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_turno_pun_venCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_turno_pun_venCajaEgreso=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_turno_pun_venCajaEgreso.setToolTipText(CajaEgresoConstantesFunciones.LABEL_IDTURNOPUNVEN);
		this.gridaBagLayoutCajaEgreso = new GridBagLayout();
		this.jPanelid_turno_pun_venCajaEgreso.setLayout(this.gridaBagLayoutCajaEgreso);


		jComboBoxid_turno_pun_venCajaEgreso= new JComboBoxMe();
		jComboBoxid_turno_pun_venCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_turno_pun_venCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_turno_pun_venCajaEgreso= new JButtonMe();
		this.jButtonid_turno_pun_venCajaEgreso.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajaEgreso.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajaEgreso.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajaEgreso.setText("Buscar");
		this.jButtonid_turno_pun_venCajaEgreso.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_turno_pun_venCajaEgreso.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajaEgreso,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_turno_pun_venCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajaEgreso"));

		this.jButtonid_turno_pun_venCajaEgresoBusqueda= new JButtonMe();
		this.jButtonid_turno_pun_venCajaEgresoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaEgresoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaEgresoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_turno_pun_venCajaEgresoBusqueda.setText("U");
		this.jButtonid_turno_pun_venCajaEgresoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_turno_pun_venCajaEgresoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajaEgresoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_turno_pun_venCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajaEgresoBusqueda"));

		if(this.cajaegresoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_turno_pun_venCajaEgresoBusqueda.setVisible(false);		}

		this.jButtonid_turno_pun_venCajaEgresoUpdate= new JButtonMe();
		this.jButtonid_turno_pun_venCajaEgresoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaEgresoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajaEgresoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_turno_pun_venCajaEgresoUpdate.setText("U");
		this.jButtonid_turno_pun_venCajaEgresoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_turno_pun_venCajaEgresoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajaEgresoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_turno_pun_venCajaEgreso.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajaEgreso.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajaEgresoUpdate"));



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
		//this.jInternalFrameDetalleCajaEgreso = new CajaEgresoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Egreso DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaEgreso= new GridBagLayout();
		

		
		String sToolTipCajaEgreso="";
		sToolTipCajaEgreso=CajaEgresoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaEgreso+="(PuntoVenta.CajaEgreso)";
		}
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaEgreso+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaEgreso = new JButtonMe();
		this.jButtonModificarCajaEgreso = new JButtonMe();
        this.jButtonActualizarCajaEgreso = new JButtonMe();
        this.jButtonEliminarCajaEgreso = new JButtonMe();
        this.jButtonCancelarCajaEgreso = new JButtonMe();
        this.jButtonGuardarCambiosCajaEgreso = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaEgreso = new JButtonMe();
		this.jButtonCerrarCajaEgreso = new JButtonMe();
		
		this.jScrollPanelDatosCajaEgreso = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaEgreso = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaEgreso = new JScrollPane();
				
		
		
		this.jPanelCamposCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Egreso";
		
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Egresos" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaEgreso.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaEgreso.setName("jPanelCamposCajaEgreso"); 

		this.jPanelCamposOcultosCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaEgreso.setName("jPanelCamposOcultosCajaEgreso"); 

        this.jPanelAccionesCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaEgreso.setToolTipText("Acciones");
        this.jPanelAccionesCajaEgreso.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaEgreso.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaEgreso.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaEgreso.setText("Nuevo");
		this.jButtonModificarCajaEgreso.setText("Editar");
        this.jButtonActualizarCajaEgreso.setText("Actualizar");
        this.jButtonEliminarCajaEgreso.setText("Eliminar");
        this.jButtonCancelarCajaEgreso.setText("Cancelar");
        this.jButtonGuardarCambiosCajaEgreso.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaEgreso.setText("Guardar");
		this.jButtonCerrarCajaEgreso.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaEgreso,"nuevo_button","Nuevo",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaEgreso,"modificar_button","Editar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaEgreso,"actualizar_button","Actualizar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaEgreso,"eliminar_button","Eliminar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaEgreso,"cancelar_button","Cancelar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaEgreso,"guardarcambios_button","Guardar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaEgreso,"guardarcambiostabla_button","Guardar",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaEgreso,"cerrar_button","Salir",this.cajaegresoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaEgreso.setToolTipText("Nuevo"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaEgreso.setToolTipText("Editar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaEgreso.setToolTipText("Actualizar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaEgreso.setToolTipText("Eliminar)"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaEgreso.setToolTipText("Cancelar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaEgreso.setToolTipText("Guardar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaEgreso.setToolTipText("Guardar"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaEgreso.setToolTipText("Salir"+" "+CajaEgresoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaEgreso";
		inputMap = this.jButtonNuevoCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaEgreso.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaEgreso"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaEgreso";
		inputMap = this.jButtonActualizarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaEgreso"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaEgreso";
		inputMap = this.jButtonEliminarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaEgreso"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaEgreso";
		inputMap = this.jButtonCancelarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaEgreso"));
		
		//CERRAR		
		sMapKey = "CerrarCajaEgreso";
		inputMap = this.jButtonCerrarCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaEgreso"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaEgreso";
		inputMap = this.jButtonGuardarCambiosTablaCajaEgreso.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaEgreso.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaEgreso"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaEgreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaEgreso.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaEgreso.setToolTipText("Nuevo CajaEgreso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaEgreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaEgreso.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaEgreso.setToolTipText("Sin Cerrar Ventana CajaEgreso");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaEgreso = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaEgreso.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaEgreso.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaEgreso.setText("Accion");
		this.jComboBoxTiposAccionesCajaEgreso.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaEgreso = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaEgreso.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaEgreso.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaEgreso = new JLabelMe();
		
		this.jLabelAccionesCajaEgreso.setText("Acciones");		
		this.jLabelAccionesCajaEgreso.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgreso.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaEgreso.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaEgreso();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaEgreso();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaEgreso=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaEgreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaEgreso,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaEgreso.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgreso.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaEgreso.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaEgreso, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaEgreso.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaEgreso.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaEgreso.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaEgreso, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaEgreso = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaEgreso = new GridBagLayout();
		
		this.jPanelCamposCajaEgreso.setLayout(gridaBagLayoutCamposCajaEgreso);
		this.jPanelCamposOcultosCajaEgreso.setLayout(gridaBagLayoutCamposOcultosCajaEgreso);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaEgreso.add(jLabelIdCajaEgreso, this.gridBagConstraintsCajaEgreso);



	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaEgreso.add(jLabelidCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaEgreso.add(jLabelid_empresaCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaEgreso.add(jButtonid_empresaCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 3;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaEgreso.add(jButtonid_empresaCajaEgresoUpdate, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaEgreso.add(jComboBoxid_empresaCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajaEgreso.add(jLabelid_sucursalCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaEgreso.add(jButtonid_sucursalCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 3;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaEgreso.add(jButtonid_sucursalCajaEgresoUpdate, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajaEgreso.add(jComboBoxid_sucursalCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioCajaEgreso.add(jLabelid_usuarioCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajaEgreso.add(jButtonid_usuarioCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 3;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajaEgreso.add(jButtonid_usuarioCajaEgresoUpdate, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioCajaEgreso.add(jComboBoxid_usuarioCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajaEgreso.add(jLabelid_cajaCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaEgreso.add(jButtonid_cajaCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 3;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaEgreso.add(jButtonid_cajaCajaEgresoUpdate, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajaEgreso.add(jComboBoxid_cajaCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_turno_pun_venCajaEgreso.add(jLabelid_turno_pun_venCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_turno_pun_venCajaEgreso.add(jButtonid_turno_pun_venCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 3;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_turno_pun_venCajaEgreso.add(jButtonid_turno_pun_venCajaEgresoUpdate, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_turno_pun_venCajaEgreso.add(jComboBoxid_turno_pun_venCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialCajaEgreso.add(jLabelsecuencialCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialCajaEgreso.add(jButtonsecuencialCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialCajaEgreso.add(jTextFieldsecuencialCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaCajaEgreso.add(jLabelfechaCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCajaEgreso.add(jButtonfechaCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaCajaEgreso.add(jDateChooserfechaCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhoraCajaEgreso.add(jLabelhoraCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraCajaEgreso.add(jButtonhoraCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhoraCajaEgreso.add(jSpinnerhoraCajaEgreso, this.gridBagConstraintsCajaEgreso);


	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 0;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorCajaEgreso.add(jLabelvalorCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		//this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = 2;
		this.gridBagConstraintsCajaEgreso.ipadx = 0;
		this.gridBagConstraintsCajaEgreso.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorCajaEgreso.add(jButtonvalorCajaEgresoBusqueda, this.gridBagConstraintsCajaEgreso);
	}

	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaEgreso.gridy = 0;
	this.gridBagConstraintsCajaEgreso.gridx = 1;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorCajaEgreso.add(jTextFieldvalorCajaEgreso, this.gridBagConstraintsCajaEgreso);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelidCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelid_cajaCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelid_turno_pun_venCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelsecuencialCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelfechaCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelhoraCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaEgreso.add(this.jPanelvalorCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposCajaEgreso % 1==0) {
		iXPanelCamposCajaEgreso=0;
		iYPanelCamposCajaEgreso++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposOcultosCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposOcultosCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaEgreso.add(this.jPanelid_empresaCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposOcultosCajaEgreso % 1==0) {
		iXPanelCamposOcultosCajaEgreso=0;
		iYPanelCamposOcultosCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposOcultosCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposOcultosCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaEgreso.add(this.jPanelid_sucursalCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposOcultosCajaEgreso % 1==0) {
		iXPanelCamposOcultosCajaEgreso=0;
		iYPanelCamposOcultosCajaEgreso++;
	}
	this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaEgreso.gridy = iYPanelCamposOcultosCajaEgreso;
	this.gridBagConstraintsCajaEgreso.gridx = iXPanelCamposOcultosCajaEgreso++;
	this.gridBagConstraintsCajaEgreso.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaEgreso.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaEgreso.add(this.jPanelid_usuarioCajaEgreso, this.gridBagConstraintsCajaEgreso);



	if(iXPanelCamposOcultosCajaEgreso % 1==0) {
		iXPanelCamposOcultosCajaEgreso=0;
		iYPanelCamposOcultosCajaEgreso++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaEgreso= new GridBagLayout();
		this.jPanelAccionesCajaEgreso.setLayout(gridaBagLayoutAccionesCajaEgreso);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaEgreso= new GridBagLayout();
		this.jPanelAccionesFormularioCajaEgreso.setLayout(gridaBagLayoutAccionesFormularioCajaEgreso);
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaEgreso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaEgreso.add(this.jComboBoxTiposAccionesFormularioCajaEgreso, this.gridBagConstraintsCajaEgreso);

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaEgreso.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaEgreso.add(this.jCheckBoxPostAccionNuevoCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaEgreso.add(this.jCheckBoxPostAccionSinCerrarCajaEgreso, this.gridBagConstraintsCajaEgreso);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajaegresoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajaegresoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaEgreso.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaEgreso.add(this.jCheckBoxPostAccionSinMensajeCajaEgreso, this.gridBagConstraintsCajaEgreso);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaEgreso.add(this.jButtonModificarCajaEgreso, this.gridBagConstraintsCajaEgreso);							

		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaEgreso.gridy = 0;
		this.gridBagConstraintsCajaEgreso.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaEgreso.add(this.jButtonEliminarCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = 0;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaEgreso.add(this.jButtonActualizarCajaEgreso, this.gridBagConstraintsCajaEgreso);


		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = 0;		
		this.gridBagConstraintsCajaEgreso.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaEgreso.add(this.jButtonGuardarCambiosCajaEgreso, this.gridBagConstraintsCajaEgreso);	
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = 0;		
		this.gridBagConstraintsCajaEgreso.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaEgreso.add(this.jButtonCancelarCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaEgreso = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaEgreso);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajaegresoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();						
			this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaEgreso.gridx = 0;		
			//this.gridBagConstraintsCajaEgreso.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaEgreso.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaEgreso.gridx =0;
		this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaEgreso.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaEgreso, this.gridBagConstraintsCajaEgreso);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaEgresoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaEgreso = new CajaEgresoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Egreso DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Egreso DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Egreso Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaEgresoModel cajaegresoModel=new CajaEgresoModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaEgresoModel.CajaEgresoFocusTraversalPolicy cajaegresoFocusTraversalPolicy = cajaegresoModel.new CajaEgresoFocusTraversalPolicy(this);
			
			//cajaegresoFocusTraversalPolicy.setcajaegresoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajaegresoModel);
			
			
			this.jContentPaneDetalleCajaEgreso = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaEgreso = new GridBagLayout();	
			this.jContentPaneDetalleCajaEgreso.setLayout(gridaBagLayoutDetalleCajaEgreso);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaEgreso = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
				this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaEgreso.gridx = 0;
					
				
				this.jContentPaneDetalleCajaEgreso.add(jTtoolBarDetalleCajaEgreso, gridBagConstraintsCajaEgreso);								
				
}
			
			this.jScrollPanelDatosEdicionCajaEgreso=   new JScrollPane(jContentPaneDetalleCajaEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaEgreso=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaEgreso.gridx = 0;
	        
			this.jContentPaneDetalleCajaEgreso.add(jPanelCamposCajaEgreso, gridBagConstraintsCajaEgreso);
			
			
			
			
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
						&& cajaegresoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCajaEgresoDetalle(this.puedeCargarPorParteCajaEgresoDetalle,false,-1);
					
					if(this.cajaegresoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaEgreso= new GridBagConstraints();
						this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaEgreso.gridx = 0;
						this.jContentPaneDetalleCajaEgreso.add(this.jTabbedPaneRelacionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaEgreso.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCajaEgresoDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaEgreso.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
					this.gridBagConstraintsCajaEgreso.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaEgreso.gridx = 0;
					
				
					this.jContentPaneDetalleCajaEgreso.add(jPanelCamposOcultosCajaEgreso, gridBagConstraintsCajaEgreso);
				
					this.jPanelCamposOcultosCajaEgreso.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCajaEgreso.gridx = 0;
	        this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaEgreso.add(this.jPanelAccionesFormularioCajaEgreso, this.gridBagConstraintsCajaEgreso);							
			
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
	        this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCajaEgreso.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaEgreso.add(this.jPanelAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaEgreso);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaEgreso=   new JScrollPane(this.jPanelCamposCajaEgreso,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaEgreso.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgreso.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaEgreso.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaEgreso.gridx = 0;
			this.gridBagConstraintsCajaEgreso.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaEgreso.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaEgreso.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaEgreso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaEgreso, this.gridBagConstraintsCajaEgreso);			
			
			this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
			this.gridBagConstraintsCajaEgreso.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaEgreso.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaEgreso, this.gridBagConstraintsCajaEgreso);
			
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaEgreso, this.gridBagConstraintsCajaEgreso);
		
			
		this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
		this.gridBagConstraintsCajaEgreso.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaEgreso.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaEgreso, this.gridBagConstraintsCajaEgreso);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaEgreso;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaEgreso;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCajaEgresoDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		this.cajaegresodetalleSessionBean.setConGuardarRelaciones(false);
		this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(true);

		this.cajaegresodetalleBeanSwingJInternalFrame=null;//new CajaEgresoDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajaegresodetalleBeanSwingJInternalFramePopup=new CajaEgresoDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajaegresodetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {

				CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajaEgresoDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CajaEgresoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(true);

				this.cajaegresodetalleBeanSwingJInternalFrame=new CajaEgresoDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajaegresodetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajaegresodetalleBeanSwingJInternalFrame.setcajaegresodetalleSessionBean(this.cajaegresodetalleSessionBean);

				//this.gridBagConstraintsCajaEgreso = new GridBagConstraints();
				//this.gridBagConstraintsCajaEgreso.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCajaEgreso.gridx = 0;
				//this.jContentPaneDetalleCajaEgreso.add(this.cajaegresodetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCajaEgreso);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCajaEgreso.add("Caja Egreso Detalles",this.cajaegresodetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCajaEgreso.setComponentAt(iIndexTab,this.cajaegresodetalleBeanSwingJInternalFrame.getContentPane());
				}

				//CajaEgresoDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(false);
				this.cajaegresodetalleBeanSwingJInternalFrame=null;//new CajaEgresoDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajaEgresoDetalle) {
					this.jTabbedPaneRelacionesCajaEgreso.add("Caja Egreso Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCajaEgresoDetalleBeanSwingJInternalFrame(List<CajaEgreso> cajaegresos,CajaEgreso cajaegreso,CajaEgresoDetalleBeanSwingJInternalFrame cajaegresodetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajaegresodetalleBeanSwingJInternalFrame=new CajaEgresoDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajaegresodetalleBeanSwingJInternalFrame.getCajaEgresoDetalleLogic().setConnexion(this.cajaegresoLogic.getConnexion());

					cajaegresodetalleBeanSwingJInternalFrame.setcajaegresosForeignKey(cajaegresos);
					cajaegresodetalleBeanSwingJInternalFrame.setcajaegresoForeignKey(cajaegreso);
					cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionCajaEgreso(true);
					cajaegresodetalleBeanSwingJInternalFrame.cajaegresodetalleSessionBean.setlidCajaEgresoActual(cajaegreso.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajaegresodetalleBeanSwingJInternalFrame.cargarCombosForeignKeyCajaEgresoDetalle(cajaegresodetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajaegresodetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaCajaEgreso(true);
					cajaegresodetalleBeanSwingJInternalFrame.setid_caja_egresoFK_IdCajaEgreso(cajaegreso.getId());

					if(!this.conCargarFormDetalle) {
						cajaegresodetalleBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajaegresodetalleBeanSwingJInternalFrame.setSelectedItemCombosFrameCajaEgresoForeignKey(cajaegreso,1,false,true,true);
					cajaegresodetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajaegresodetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdCajaEgreso");
					cajaegresodetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCajaEgreso");
					cajaegresodetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgresoDetalle(true);
					cajaegresodetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n",cajaegresodetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajaegresodetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajaegresodetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					cajaegresodetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajaegresodetalleBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgresoDetalle("relacionado");
					} else {
						cajaegresodetalleBeanSwingJInternalFrame.actualizarEstadoPanelsCajaEgresoDetalle("no_relacionado");
					}

					cajaegresodetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionCajaEgresoDetalle().setVisible(false);

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
