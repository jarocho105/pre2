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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.CajeroTurnoConstantesFunciones;

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
public class CajeroTurnoDetalleFormJInternalFrame extends CajeroTurnoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajeroTurno;
	
	protected JMenuBar jmenuBarDetalleCajeroTurno;
	
	protected JMenu jmenuDetalleCajeroTurno;
	protected JMenu jmenuDetalleArchivoCajeroTurno;
	protected JMenu jmenuDetalleAccionesCajeroTurno;
	protected JMenu jmenuDetalleDatosCajeroTurno;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajeroTurno;	
	protected GridBagConstraints gridBagConstraintsCajeroTurno;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajeroTurnoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajeroTurno;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected TurnoPunVenBeanSwingJInternalFrame turnopunvenBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_turnopunven="";
	
	public CajeroTurnoSessionBean cajeroturnoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public CajaSessionBean cajaSessionBean;
	public MesaSessionBean mesaSessionBean;
	public TurnoPunVenSessionBean turnopunvenSessionBean;	
	
	public CajeroTurnoLogic cajeroturnoLogic;
	
	public JScrollPane jScrollPanelDatosCajeroTurno;
	public JScrollPane jScrollPanelDatosEdicionCajeroTurno;
	public JScrollPane jScrollPanelDatosGeneralCajeroTurno;
	
	protected JPanel jPanelCamposCajeroTurno;    
	protected JPanel jPanelCamposOcultosCajeroTurno;    	
	protected JPanel jPanelAccionesCajeroTurno;
	protected JPanel jPanelAccionesFormularioCajeroTurno;
    
	
	
	protected Integer iXPanelCamposCajeroTurno=0;
	protected Integer iYPanelCamposCajeroTurno=0;
	
	protected Integer iXPanelCamposOcultosCajeroTurno=0;
	protected Integer iYPanelCamposOcultosCajeroTurno=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajeroTurno;
	public JButton jButtonModificarCajeroTurno;
	public JButton jButtonActualizarCajeroTurno;
    public JButton jButtonEliminarCajeroTurno;
	public JButton jButtonCancelarCajeroTurno;
    public JButton jButtonGuardarCambiosCajeroTurno;
	public JButton jButtonGuardarCambiosTablaCajeroTurno;
	protected JButton jButtonCerrarCajeroTurno;
	
	
	protected JButton jButtonProcesarInformacionCajeroTurno;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajeroTurno;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajeroTurno;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajeroTurno;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajeroTurno;
	protected JButton jButtonModificarToolBarCajeroTurno;
	protected JButton jButtonActualizarToolBarCajeroTurno;
    protected JButton jButtonEliminarToolBarCajeroTurno;
	protected JButton jButtonCancelarToolBarCajeroTurno;
    protected JButton jButtonGuardarCambiosToolBarCajeroTurno;
	protected JButton jButtonGuardarCambiosTablaToolBarCajeroTurno;
	protected JButton jButtonMostrarOcultarTablaToolBarCajeroTurno;
	protected JButton jButtonCerrarToolBarCajeroTurno;
	
	protected JButton jButtonProcesarInformacionToolBarCajeroTurno;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajeroTurno;
	protected JMenuItem jMenuItemModificarCajeroTurno;
	protected JMenuItem jMenuItemActualizarCajeroTurno;
    protected JMenuItem jMenuItemEliminarCajeroTurno;
	protected JMenuItem jMenuItemCancelarCajeroTurno;
    protected JMenuItem jMenuItemGuardarCambiosCajeroTurno;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajeroTurno;
	protected JMenuItem jMenuItemCerrarCajeroTurno;
	protected JMenuItem jMenuItemDetalleCerrarCajeroTurno;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajeroTurno;
	
	protected JMenuItem jMenuItemProcesarInformacionCajeroTurno;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajeroTurno;
	protected JMenuItem jMenuItemMostrarOcultarCajeroTurno;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajeroTurno;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajeroTurno;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajeroTurno;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajeroTurno;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajeroTurno;
	public JLabel jLabelIdCajeroTurno;
	public JLabel jLabelidCajeroTurno;
	public JButton jButtonidCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioCajeroTurno;
	public JLabel jLabelhora_inicioCajeroTurno;
	public JSpinner jSpinnerhora_inicioCajeroTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_finCajeroTurno;
	public JLabel jLabelhora_finCajeroTurno;
	public JSpinner jSpinnerhora_finCajeroTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelhora_servicioCajeroTurno;
	public JLabel jLabelhora_servicioCajeroTurno;
	public JSpinner jSpinnerhora_servicioCajeroTurno= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_servicioCajeroTurnoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajeroTurno;
	public JLabel jLabelid_empresaCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajeroTurno;
	public JButton jButtonid_empresaCajeroTurno= new JButtonMe();
	public JButton jButtonid_empresaCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajeroTurno;
	public JLabel jLabelid_sucursalCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajeroTurno;
	public JButton jButtonid_sucursalCajeroTurno= new JButtonMe();
	public JButton jButtonid_sucursalCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioCajeroTurno;
	public JLabel jLabelid_usuarioCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioCajeroTurno;
	public JButton jButtonid_usuarioCajeroTurno= new JButtonMe();
	public JButton jButtonid_usuarioCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorCajeroTurno;
	public JLabel jLabelid_vendedorCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorCajeroTurno;
	public JButton jButtonid_vendedorCajeroTurno= new JButtonMe();
	public JButton jButtonid_vendedorCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorCajeroTurnoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorCajeroTurnoArbol= new JButtonMe();

	public JPanel jPanelid_cajaCajeroTurno;
	public JLabel jLabelid_cajaCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajeroTurno;
	public JButton jButtonid_cajaCajeroTurno= new JButtonMe();
	public JButton jButtonid_cajaCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesaCajeroTurno;
	public JLabel jLabelid_mesaCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaCajeroTurno;
	public JButton jButtonid_mesaCajeroTurno= new JButtonMe();
	public JButton jButtonid_mesaCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_mesaCajeroTurnoBusqueda= new JButtonMe();

	public JPanel jPanelid_turno_pun_venCajeroTurno;
	public JLabel jLabelid_turno_pun_venCajeroTurno;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_turno_pun_venCajeroTurno;
	public JButton jButtonid_turno_pun_venCajeroTurno= new JButtonMe();
	public JButton jButtonid_turno_pun_venCajeroTurnoUpdate= new JButtonMe();
	public JButton jButtonid_turno_pun_venCajeroTurnoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajeroTurno;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CajeroTurnoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajeroTurno=new JPanel();
				this.jPanelAccionesFormularioCajeroTurno=new JPanel();
				this.jmenuBarDetalleCajeroTurno=new JMenuBar();
				this.jTtoolBarDetalleCajeroTurno=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajeroTurnoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajeroTurnoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajeroTurno No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajeroTurno() {
		return this.jButtonActualizarToolBarCajeroTurno;
	}
	
	public JButton getjButtonEliminarToolBarCajeroTurno() {
		return this.jButtonEliminarToolBarCajeroTurno;
	}
	
	public JButton getjButtonCancelarToolBarCajeroTurno() {
		return this.jButtonCancelarToolBarCajeroTurno;
	}		
	
	public JButton getjButtonProcesarInformacionCajeroTurno() {
		return this.jButtonProcesarInformacionCajeroTurno;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajeroTurno)	{
		this.jButtonProcesarInformacionCajeroTurno = jButtonProcesarInformacionCajeroTurno;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajeroTurno() {
		return this.jComboBoxTiposAccionesCajeroTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajeroTurno(
			JComboBox jComboBoxTiposRelacionesCajeroTurno) {
		this.jComboBoxTiposRelacionesCajeroTurno = jComboBoxTiposRelacionesCajeroTurno;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajeroTurno(
			JComboBox jComboBoxTiposAccionesCajeroTurno) {
		this.jComboBoxTiposAccionesCajeroTurno = jComboBoxTiposAccionesCajeroTurno;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajeroTurno() {
		return this.jComboBoxTiposAccionesFormularioCajeroTurno;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajeroTurno(
			JComboBox jComboBoxTiposAccionesFormularioCajeroTurno) {
		this.jComboBoxTiposAccionesFormularioCajeroTurno = jComboBoxTiposAccionesFormularioCajeroTurno;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		
		this.cajeroturnoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajeroturnoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajeroTurnoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cajero Turno MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
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
	
		CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajeroTurno= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajeroTurno=new JButtonMe();
				this.jButtonModificarToolBarCajeroTurno=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajeroTurno,this.jTtoolBarDetalleCajeroTurno,
							"actualizar","actualizar","Actualizar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajeroTurno,this.jTtoolBarDetalleCajeroTurno,
							"eliminar","eliminar","Eliminar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajeroTurno,this.jTtoolBarDetalleCajeroTurno,
							"cancelar","cancelar","Cancelar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajeroTurno=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajeroTurno,this.jTtoolBarDetalleCajeroTurno,
							"guardarcambios","guardarcambios","Guardar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajeroTurno=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajeroTurno=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajeroTurno=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajeroTurno=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajeroTurno=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajeroTurno= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajeroTurno.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajeroTurno,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajeroTurno= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajeroTurno.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajeroTurno,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajeroTurno= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajeroTurno.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajeroTurno,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajeroTurno= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajeroTurno.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajeroTurno,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajeroTurno= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajeroTurno.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajeroTurno,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajeroTurno= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajeroTurno.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajeroTurno,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajeroTurno= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajeroTurno.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajeroTurno,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajeroTurno= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajeroTurno.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajeroTurno,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajeroTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajeroTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajeroTurno,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajeroTurno= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajeroTurno.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajeroTurno,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajeroTurno.add(this.jMenuItemDetalleCerrarCajeroTurno);
		
		this.jmenuDetalleAccionesCajeroTurno.add(this.jMenuItemActualizarCajeroTurno);
		this.jmenuDetalleAccionesCajeroTurno.add(this.jMenuItemEliminarCajeroTurno);
		this.jmenuDetalleAccionesCajeroTurno.add(this.jMenuItemCancelarCajeroTurno);		
		
		//this.jmenuDetalleDatosCajeroTurno.add(this.jMenuItemDetalleAbrirOrderByCajeroTurno);				
		this.jmenuDetalleDatosCajeroTurno.add(this.jMenuItemDetalleMostarOcultarCajeroTurno);				
				
		//this.jmenuDetalleAccionesCajeroTurno.add(this.jMenuItemGuardarCambiosCajeroTurno);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajeroTurno.add(this.jmenuDetalleArchivoCajeroTurno);		
		this.jmenuBarDetalleCajeroTurno.add(this.jmenuDetalleAccionesCajeroTurno);		
		this.jmenuBarDetalleCajeroTurno.add(this.jmenuDetalleDatosCajeroTurno);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajeroTurno);				
	}
	
	
	public void inicializarElementosCamposCajeroTurno() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajeroTurno = new JLabelMe();
		jLabelIdCajeroTurno.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajeroTurno = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajeroTurno= new GridBagLayout();

		this.jPanelidCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);

		jLabelidCajeroTurno = new JLabel();
		jLabelidCajeroTurno.setText("Id");

		jLabelidCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelhora_inicioCajeroTurno = new JLabelMe();
		this.jLabelhora_inicioCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioCajeroTurno.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelhora_inicioCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		//jFormattedTextFieldhora_inicioCajeroTurno= new JFormattedTextFieldMe();

		jSpinnerhora_inicioCajeroTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioCajeroTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioCajeroTurno = new JSpinner.DateEditor(jSpinnerhora_inicioCajeroTurno, "HH:mm:ss");

		jSpinnerhora_inicioCajeroTurno.setEditor(timeEditorhora_inicioCajeroTurno);

		jSpinnerhora_inicioCajeroTurno.setValue(new Date());

		jSpinnerhora_inicioCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioCajeroTurno.setValue(new Date());
		//jSpinnerhora_inicioCajeroTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioCajeroTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonhora_inicioCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioCajeroTurnoBusqueda.setText("U");
		this.jButtonhora_inicioCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioCajeroTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_finCajeroTurno = new JLabelMe();
		this.jLabelhora_finCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finCajeroTurno.setToolTipText("Hora Fin");
		this.jLabelhora_finCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelhora_finCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		//jFormattedTextFieldhora_finCajeroTurno= new JFormattedTextFieldMe();

		jSpinnerhora_finCajeroTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finCajeroTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finCajeroTurno = new JSpinner.DateEditor(jSpinnerhora_finCajeroTurno, "HH:mm:ss");

		jSpinnerhora_finCajeroTurno.setEditor(timeEditorhora_finCajeroTurno);

		jSpinnerhora_finCajeroTurno.setValue(new Date());

		jSpinnerhora_finCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finCajeroTurno.setValue(new Date());
		//jSpinnerhora_finCajeroTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finCajeroTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonhora_finCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finCajeroTurnoBusqueda.setText("U");
		this.jButtonhora_finCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finCajeroTurnoBusqueda.setVisible(false);		}


					
		this.jLabelhora_servicioCajeroTurno = new JLabelMe();
		this.jLabelhora_servicioCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO+" : *");
		this.jLabelhora_servicioCajeroTurno.setToolTipText("Hora Servicio");
		this.jLabelhora_servicioCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_servicioCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_servicioCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_servicioCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_servicioCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_servicioCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_HORASERVICIO);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelhora_servicioCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		//jFormattedTextFieldhora_servicioCajeroTurno= new JFormattedTextFieldMe();

		jSpinnerhora_servicioCajeroTurno= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_servicioCajeroTurno.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_servicioCajeroTurno = new JSpinner.DateEditor(jSpinnerhora_servicioCajeroTurno, "HH:mm:ss");

		jSpinnerhora_servicioCajeroTurno.setEditor(timeEditorhora_servicioCajeroTurno);

		jSpinnerhora_servicioCajeroTurno.setValue(new Date());

		jSpinnerhora_servicioCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_servicioCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_servicioCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_servicioCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_servicioCajeroTurno.setValue(new Date());
		//jSpinnerhora_servicioCajeroTurno.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_servicioCajeroTurno.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_servicioCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonhora_servicioCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_servicioCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_servicioCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_servicioCajeroTurnoBusqueda.setText("U");
		this.jButtonhora_servicioCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_servicioCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_servicioCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_servicioCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_servicioCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_servicioCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_servicioCajeroTurnoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajeroTurno() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajeroTurno = new JLabelMe();
		this.jLabelid_empresaCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajeroTurno.setToolTipText("Empresa");
		this.jLabelid_empresaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_empresaCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_empresaCajeroTurno= new JComboBoxMe();
		jComboBoxid_empresaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajeroTurno.setEnabled(false);

		this.jButtonid_empresaCajeroTurno= new JButtonMe();
		this.jButtonid_empresaCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajeroTurno.setText("Buscar");
		this.jButtonid_empresaCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajeroTurno"));

		this.jButtonid_empresaCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_empresaCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajeroTurnoBusqueda.setText("U");
		this.jButtonid_empresaCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_empresaCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajeroTurnoUpdate.setText("U");
		this.jButtonid_empresaCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajeroTurnoUpdate"));



					
		this.jLabelid_sucursalCajeroTurno = new JLabelMe();
		this.jLabelid_sucursalCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajeroTurno.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_sucursalCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_sucursalCajeroTurno= new JComboBoxMe();
		jComboBoxid_sucursalCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajeroTurno.setEnabled(false);

		this.jButtonid_sucursalCajeroTurno= new JButtonMe();
		this.jButtonid_sucursalCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajeroTurno.setText("Buscar");
		this.jButtonid_sucursalCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajeroTurno"));

		this.jButtonid_sucursalCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajeroTurnoBusqueda.setText("U");
		this.jButtonid_sucursalCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_sucursalCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajeroTurnoUpdate.setText("U");
		this.jButtonid_sucursalCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajeroTurnoUpdate"));



					
		this.jLabelid_usuarioCajeroTurno = new JLabelMe();
		this.jLabelid_usuarioCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioCajeroTurno.setToolTipText("Usuario");
		this.jLabelid_usuarioCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_usuarioCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_usuarioCajeroTurno= new JComboBoxMe();
		jComboBoxid_usuarioCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioCajeroTurno.setEnabled(false);

		this.jButtonid_usuarioCajeroTurno= new JButtonMe();
		this.jButtonid_usuarioCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCajeroTurno.setText("Buscar");
		this.jButtonid_usuarioCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajeroTurno"));

		this.jButtonid_usuarioCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_usuarioCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajeroTurnoBusqueda.setText("U");
		this.jButtonid_usuarioCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_usuarioCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCajeroTurnoUpdate.setText("U");
		this.jButtonid_usuarioCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCajeroTurnoUpdate"));



					
		this.jLabelid_vendedorCajeroTurno = new JLabelMe();
		this.jLabelid_vendedorCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorCajeroTurno.setToolTipText("Vendedor");
		this.jLabelid_vendedorCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_vendedorCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_vendedorCajeroTurno= new JComboBoxMe();
		jComboBoxid_vendedorCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorCajeroTurno= new JButtonMe();
		this.jButtonid_vendedorCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorCajeroTurno.setText("Buscar");
		this.jButtonid_vendedorCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCajeroTurno"));

		this.jButtonid_vendedorCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_vendedorCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorCajeroTurnoBusqueda.setText("U");
		this.jButtonid_vendedorCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_vendedorCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_vendedorCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorCajeroTurnoUpdate.setText("U");
		this.jButtonid_vendedorCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCajeroTurnoUpdate"));


		jButtonid_vendedorCajeroTurnoArbol= new JButtonMe();
		jButtonid_vendedorCajeroTurnoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorCajeroTurnoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorCajeroTurnoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorCajeroTurnoArbol.setText("Arbol");
		jButtonid_vendedorCajeroTurnoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorCajeroTurnoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorCajeroTurnoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorCajeroTurnoArbol"));



					
		this.jLabelid_cajaCajeroTurno = new JLabelMe();
		this.jLabelid_cajaCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajeroTurno.setToolTipText("Caja");
		this.jLabelid_cajaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_cajaCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_cajaCajeroTurno= new JComboBoxMe();
		jComboBoxid_cajaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaCajeroTurno= new JButtonMe();
		this.jButtonid_cajaCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajeroTurno.setText("Buscar");
		this.jButtonid_cajaCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajeroTurno"));

		this.jButtonid_cajaCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_cajaCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajeroTurnoBusqueda.setText("U");
		this.jButtonid_cajaCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_cajaCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajeroTurnoUpdate.setText("U");
		this.jButtonid_cajaCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajeroTurnoUpdate"));



					
		this.jLabelid_mesaCajeroTurno = new JLabelMe();
		this.jLabelid_mesaCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDMESA+" : *");
		this.jLabelid_mesaCajeroTurno.setToolTipText("Mesa");
		this.jLabelid_mesaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesaCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesaCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesaCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDMESA);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_mesaCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_mesaCajeroTurno= new JComboBoxMe();
		jComboBoxid_mesaCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesaCajeroTurno= new JButtonMe();
		this.jButtonid_mesaCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaCajeroTurno.setText("Buscar");
		this.jButtonid_mesaCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesaCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaCajeroTurno"));

		this.jButtonid_mesaCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_mesaCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaCajeroTurnoBusqueda.setText("U");
		this.jButtonid_mesaCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesaCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesaCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_mesaCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_mesaCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaCajeroTurnoUpdate.setText("U");
		this.jButtonid_mesaCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesaCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesaCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaCajeroTurnoUpdate"));



					
		this.jLabelid_turno_pun_venCajeroTurno = new JLabelMe();
		this.jLabelid_turno_pun_venCajeroTurno.setText(""+CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN+" : *");
		this.jLabelid_turno_pun_venCajeroTurno.setToolTipText("Turno");
		this.jLabelid_turno_pun_venCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_turno_pun_venCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_turno_pun_venCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_turno_pun_venCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_turno_pun_venCajeroTurno=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_turno_pun_venCajeroTurno.setToolTipText(CajeroTurnoConstantesFunciones.LABEL_IDTURNOPUNVEN);
		this.gridaBagLayoutCajeroTurno = new GridBagLayout();
		this.jPanelid_turno_pun_venCajeroTurno.setLayout(this.gridaBagLayoutCajeroTurno);


		jComboBoxid_turno_pun_venCajeroTurno= new JComboBoxMe();
		jComboBoxid_turno_pun_venCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_turno_pun_venCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_turno_pun_venCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_turno_pun_venCajeroTurno= new JButtonMe();
		this.jButtonid_turno_pun_venCajeroTurno.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajeroTurno.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajeroTurno.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_turno_pun_venCajeroTurno.setText("Buscar");
		this.jButtonid_turno_pun_venCajeroTurno.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_turno_pun_venCajeroTurno.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajeroTurno,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_turno_pun_venCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajeroTurno"));

		this.jButtonid_turno_pun_venCajeroTurnoBusqueda= new JButtonMe();
		this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setText("U");
		this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajeroTurnoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_turno_pun_venCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajeroTurnoBusqueda"));

		if(this.cajeroturnoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_turno_pun_venCajeroTurnoBusqueda.setVisible(false);		}

		this.jButtonid_turno_pun_venCajeroTurnoUpdate= new JButtonMe();
		this.jButtonid_turno_pun_venCajeroTurnoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajeroTurnoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_turno_pun_venCajeroTurnoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_turno_pun_venCajeroTurnoUpdate.setText("U");
		this.jButtonid_turno_pun_venCajeroTurnoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_turno_pun_venCajeroTurnoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_turno_pun_venCajeroTurnoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_turno_pun_venCajeroTurno.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_turno_pun_venCajeroTurno.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_turno_pun_venCajeroTurnoUpdate"));



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
		//this.jInternalFrameDetalleCajeroTurno = new CajeroTurnoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cajero Turno DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajeroTurno= new GridBagLayout();
		

		
		String sToolTipCajeroTurno="";
		sToolTipCajeroTurno=CajeroTurnoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajeroTurno+="(PuntoVenta.CajeroTurno)";
		}
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajeroTurno+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajeroTurno = new JButtonMe();
		this.jButtonModificarCajeroTurno = new JButtonMe();
        this.jButtonActualizarCajeroTurno = new JButtonMe();
        this.jButtonEliminarCajeroTurno = new JButtonMe();
        this.jButtonCancelarCajeroTurno = new JButtonMe();
        this.jButtonGuardarCambiosCajeroTurno = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajeroTurno = new JButtonMe();
		this.jButtonCerrarCajeroTurno = new JButtonMe();
		
		this.jScrollPanelDatosCajeroTurno = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajeroTurno = new JScrollPane();
		this.jScrollPanelDatosGeneralCajeroTurno = new JScrollPane();
				
		
		
		this.jPanelCamposCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cajero Turno";
		
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cajero Turnos" + this.sPath));
		} else {
			this.jScrollPanelDatosCajeroTurno.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajeroTurno.setName("jPanelCamposCajeroTurno"); 

		this.jPanelCamposOcultosCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajeroTurno.setName("jPanelCamposOcultosCajeroTurno"); 

        this.jPanelAccionesCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajeroTurno.setToolTipText("Acciones");
        this.jPanelAccionesCajeroTurno.setName("Acciones"); 

		this.jPanelAccionesFormularioCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajeroTurno.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajeroTurno.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajeroTurno.setText("Nuevo");
		this.jButtonModificarCajeroTurno.setText("Editar");
        this.jButtonActualizarCajeroTurno.setText("Actualizar");
        this.jButtonEliminarCajeroTurno.setText("Eliminar");
        this.jButtonCancelarCajeroTurno.setText("Cancelar");
        this.jButtonGuardarCambiosCajeroTurno.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajeroTurno.setText("Guardar");
		this.jButtonCerrarCajeroTurno.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajeroTurno,"nuevo_button","Nuevo",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajeroTurno,"modificar_button","Editar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajeroTurno,"actualizar_button","Actualizar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajeroTurno,"eliminar_button","Eliminar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajeroTurno,"cancelar_button","Cancelar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajeroTurno,"guardarcambios_button","Guardar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajeroTurno,"guardarcambiostabla_button","Guardar",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajeroTurno,"cerrar_button","Salir",this.cajeroturnoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajeroTurno.setToolTipText("Nuevo"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajeroTurno.setToolTipText("Editar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajeroTurno.setToolTipText("Actualizar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajeroTurno.setToolTipText("Eliminar)"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajeroTurno.setToolTipText("Cancelar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajeroTurno.setToolTipText("Guardar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajeroTurno.setToolTipText("Guardar"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajeroTurno.setToolTipText("Salir"+" "+CajeroTurnoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajeroTurno";
		inputMap = this.jButtonNuevoCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajeroTurno.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajeroTurno"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajeroTurno";
		inputMap = this.jButtonActualizarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajeroTurno"));
		
		//ELIMINAR
		sMapKey = "EliminarCajeroTurno";
		inputMap = this.jButtonEliminarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajeroTurno"));
		
		//CANCELAR	
		sMapKey = "CancelarCajeroTurno";
		inputMap = this.jButtonCancelarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajeroTurno"));
		
		//CERRAR		
		sMapKey = "CerrarCajeroTurno";
		inputMap = this.jButtonCerrarCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajeroTurno"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajeroTurno";
		inputMap = this.jButtonGuardarCambiosTablaCajeroTurno.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajeroTurno.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajeroTurno"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajeroTurno = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajeroTurno.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajeroTurno.setToolTipText("Nuevo CajeroTurno");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajeroTurno = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajeroTurno.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajeroTurno.setToolTipText("Sin Cerrar Ventana CajeroTurno");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajeroTurno = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajeroTurno.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajeroTurno.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajeroTurno.setText("Accion");
		this.jComboBoxTiposAccionesCajeroTurno.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajeroTurno = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajeroTurno.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajeroTurno.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajeroTurno = new JLabelMe();
		
		this.jLabelAccionesCajeroTurno.setText("Acciones");		
		this.jLabelAccionesCajeroTurno.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeroTurno.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajeroTurno.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajeroTurno();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajeroTurno();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajeroTurno=new JTabbedPane();
		this.jTabbedPaneRelacionesCajeroTurno.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajeroTurno,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajeroTurno.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeroTurno.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajeroTurno.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajeroTurno, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajeroTurno.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajeroTurno.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajeroTurno.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajeroTurno, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajeroTurno = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajeroTurno = new GridBagLayout();
		
		this.jPanelCamposCajeroTurno.setLayout(gridaBagLayoutCamposCajeroTurno);
		this.jPanelCamposOcultosCajeroTurno.setLayout(gridaBagLayoutCamposOcultosCajeroTurno);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajeroTurno.add(jLabelIdCajeroTurno, this.gridBagConstraintsCajeroTurno);



	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajeroTurno.add(jLabelidCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajeroTurno.add(jLabelid_empresaCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajeroTurno.add(jButtonid_empresaCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajeroTurno.add(jButtonid_empresaCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajeroTurno.add(jComboBoxid_empresaCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajeroTurno.add(jLabelid_sucursalCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajeroTurno.add(jButtonid_sucursalCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajeroTurno.add(jButtonid_sucursalCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajeroTurno.add(jComboBoxid_sucursalCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioCajeroTurno.add(jLabelid_usuarioCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajeroTurno.add(jButtonid_usuarioCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCajeroTurno.add(jButtonid_usuarioCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioCajeroTurno.add(jComboBoxid_usuarioCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorCajeroTurno.add(jLabelid_vendedorCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCajeroTurno.add(jButtonid_vendedorCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorCajeroTurno.add(jButtonid_vendedorCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorCajeroTurno.add(jComboBoxid_vendedorCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajeroTurno.add(jLabelid_cajaCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajeroTurno.add(jButtonid_cajaCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajeroTurno.add(jButtonid_cajaCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajeroTurno.add(jComboBoxid_cajaCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesaCajeroTurno.add(jLabelid_mesaCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaCajeroTurno.add(jButtonid_mesaCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaCajeroTurno.add(jButtonid_mesaCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesaCajeroTurno.add(jComboBoxid_mesaCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_turno_pun_venCajeroTurno.add(jLabelid_turno_pun_venCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_turno_pun_venCajeroTurno.add(jButtonid_turno_pun_venCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 3;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_turno_pun_venCajeroTurno.add(jButtonid_turno_pun_venCajeroTurnoUpdate, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_turno_pun_venCajeroTurno.add(jComboBoxid_turno_pun_venCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioCajeroTurno.add(jLabelhora_inicioCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioCajeroTurno.add(jButtonhora_inicioCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioCajeroTurno.add(jSpinnerhora_inicioCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finCajeroTurno.add(jLabelhora_finCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finCajeroTurno.add(jButtonhora_finCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finCajeroTurno.add(jSpinnerhora_finCajeroTurno, this.gridBagConstraintsCajeroTurno);


	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 0;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_servicioCajeroTurno.add(jLabelhora_servicioCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		//this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = 2;
		this.gridBagConstraintsCajeroTurno.ipadx = 0;
		this.gridBagConstraintsCajeroTurno.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_servicioCajeroTurno.add(jButtonhora_servicioCajeroTurnoBusqueda, this.gridBagConstraintsCajeroTurno);
	}

	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajeroTurno.gridy = 0;
	this.gridBagConstraintsCajeroTurno.gridx = 1;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_servicioCajeroTurno.add(jSpinnerhora_servicioCajeroTurno, this.gridBagConstraintsCajeroTurno);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelidCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelid_vendedorCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelid_cajaCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelid_mesaCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelid_turno_pun_venCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelhora_inicioCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelhora_finCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajeroTurno.add(this.jPanelhora_servicioCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposCajeroTurno % 1==0) {
		iXPanelCamposCajeroTurno=0;
		iYPanelCamposCajeroTurno++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposOcultosCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposOcultosCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajeroTurno.add(this.jPanelid_empresaCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposOcultosCajeroTurno % 1==0) {
		iXPanelCamposOcultosCajeroTurno=0;
		iYPanelCamposOcultosCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposOcultosCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposOcultosCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajeroTurno.add(this.jPanelid_sucursalCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposOcultosCajeroTurno % 1==0) {
		iXPanelCamposOcultosCajeroTurno=0;
		iYPanelCamposOcultosCajeroTurno++;
	}
	this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajeroTurno.gridy = iYPanelCamposOcultosCajeroTurno;
	this.gridBagConstraintsCajeroTurno.gridx = iXPanelCamposOcultosCajeroTurno++;
	this.gridBagConstraintsCajeroTurno.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajeroTurno.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajeroTurno.add(this.jPanelid_usuarioCajeroTurno, this.gridBagConstraintsCajeroTurno);



	if(iXPanelCamposOcultosCajeroTurno % 1==0) {
		iXPanelCamposOcultosCajeroTurno=0;
		iYPanelCamposOcultosCajeroTurno++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajeroTurno= new GridBagLayout();
		this.jPanelAccionesCajeroTurno.setLayout(gridaBagLayoutAccionesCajeroTurno);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajeroTurno= new GridBagLayout();
		this.jPanelAccionesFormularioCajeroTurno.setLayout(gridaBagLayoutAccionesFormularioCajeroTurno);
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajeroTurno.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajeroTurno.add(this.jComboBoxTiposAccionesFormularioCajeroTurno, this.gridBagConstraintsCajeroTurno);

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajeroTurno.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajeroTurno.add(this.jCheckBoxPostAccionNuevoCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajeroTurno.add(this.jCheckBoxPostAccionSinCerrarCajeroTurno, this.gridBagConstraintsCajeroTurno);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajeroturnoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajeroturnoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajeroTurno.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajeroTurno.add(this.jCheckBoxPostAccionSinMensajeCajeroTurno, this.gridBagConstraintsCajeroTurno);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajeroTurno.add(this.jButtonModificarCajeroTurno, this.gridBagConstraintsCajeroTurno);							

		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajeroTurno.gridy = 0;
		this.gridBagConstraintsCajeroTurno.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajeroTurno.add(this.jButtonEliminarCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
			
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = 0;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajeroTurno.add(this.jButtonActualizarCajeroTurno, this.gridBagConstraintsCajeroTurno);


		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = 0;		
		this.gridBagConstraintsCajeroTurno.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajeroTurno.add(this.jButtonGuardarCambiosCajeroTurno, this.gridBagConstraintsCajeroTurno);	
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = 0;		
		this.gridBagConstraintsCajeroTurno.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajeroTurno.add(this.jButtonCancelarCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajeroTurno = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajeroTurno);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();						
			this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajeroTurno.gridx = 0;		
			//this.gridBagConstraintsCajeroTurno.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajeroTurno.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajeroTurno.gridx =0;
		this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajeroTurno.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajeroTurno, this.gridBagConstraintsCajeroTurno);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajeroTurnoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajeroTurno = new CajeroTurnoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cajero Turno DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cajero Turno DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cajero Turno Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajeroTurnoModel cajeroturnoModel=new CajeroTurnoModel(this);
			
			//SI USARA CLASE INTERNA
			//CajeroTurnoModel.CajeroTurnoFocusTraversalPolicy cajeroturnoFocusTraversalPolicy = cajeroturnoModel.new CajeroTurnoFocusTraversalPolicy(this);
			
			//cajeroturnoFocusTraversalPolicy.setcajeroturnoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajeroturnoModel);
			
			
			this.jContentPaneDetalleCajeroTurno = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajeroTurno = new GridBagLayout();	
			this.jContentPaneDetalleCajeroTurno.setLayout(gridaBagLayoutDetalleCajeroTurno);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajeroTurno = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
				this.gridBagConstraintsCajeroTurno.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajeroTurno.gridx = 0;
					
				
				this.jContentPaneDetalleCajeroTurno.add(jTtoolBarDetalleCajeroTurno, gridBagConstraintsCajeroTurno);								
				
}
			
			this.jScrollPanelDatosEdicionCajeroTurno=   new JScrollPane(jContentPaneDetalleCajeroTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajeroTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeroTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeroTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajeroTurno=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajeroTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeroTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajeroTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajeroTurno.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajeroTurno.gridx = 0;
	        
			this.jContentPaneDetalleCajeroTurno.add(jPanelCamposCajeroTurno, gridBagConstraintsCajeroTurno);
			
			
			
			
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
						&& cajeroturnoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajeroturnoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajeroTurno= new GridBagConstraints();
						this.gridBagConstraintsCajeroTurno.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajeroTurno.gridx = 0;
						this.jContentPaneDetalleCajeroTurno.add(this.jTabbedPaneRelacionesCajeroTurno, this.gridBagConstraintsCajeroTurno);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajeroTurno.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajeroTurno.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
					this.gridBagConstraintsCajeroTurno.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajeroTurno.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajeroTurno.gridx = 0;
					
				
					this.jContentPaneDetalleCajeroTurno.add(jPanelCamposOcultosCajeroTurno, gridBagConstraintsCajeroTurno);
				
					this.jPanelCamposOcultosCajeroTurno.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajeroTurno.gridx = 0;
	        this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajeroTurno.add(this.jPanelAccionesFormularioCajeroTurno, this.gridBagConstraintsCajeroTurno);							
			
			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
	        this.gridBagConstraintsCajeroTurno.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajeroTurno.gridx = 0;
	        
			
			this.jContentPaneDetalleCajeroTurno.add(this.jPanelAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajeroTurno);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajeroTurno=   new JScrollPane(this.jPanelCamposCajeroTurno,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajeroTurno.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeroTurno.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajeroTurno.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajeroTurno.gridx = 0;
			this.gridBagConstraintsCajeroTurno.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajeroTurno.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajeroTurno.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajeroTurno.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajeroTurno, this.gridBagConstraintsCajeroTurno);			
			
			this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
			this.gridBagConstraintsCajeroTurno.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajeroTurno.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajeroTurno, this.gridBagConstraintsCajeroTurno);
			
			
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajeroTurno, this.gridBagConstraintsCajeroTurno);
		
			
		this.gridBagConstraintsCajeroTurno = new GridBagConstraints();
		this.gridBagConstraintsCajeroTurno.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajeroTurno.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajeroTurno, this.gridBagConstraintsCajeroTurno);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajeroTurno;//jContentPane;
		
		return jScrollPanelDatosEdicionCajeroTurno;
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
