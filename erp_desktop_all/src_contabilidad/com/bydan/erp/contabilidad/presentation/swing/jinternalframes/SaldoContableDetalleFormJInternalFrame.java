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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.SaldoContableConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class SaldoContableDetalleFormJInternalFrame extends SaldoContableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleSaldoContable;
	
	protected JMenuBar jmenuBarDetalleSaldoContable;
	
	protected JMenu jmenuDetalleSaldoContable;
	protected JMenu jmenuDetalleArchivoSaldoContable;
	protected JMenu jmenuDetalleAccionesSaldoContable;
	protected JMenu jmenuDetalleDatosSaldoContable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutSaldoContable;	
	protected GridBagConstraints gridBagConstraintsSaldoContable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected SaldoContableBeanSwingJInternalFrameAdditional jInternalFrameDetalleSaldoContable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public SaldoContableSessionBean saldocontableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public SaldoContableLogic saldocontableLogic;
	
	public JScrollPane jScrollPanelDatosSaldoContable;
	public JScrollPane jScrollPanelDatosEdicionSaldoContable;
	public JScrollPane jScrollPanelDatosGeneralSaldoContable;
	
	protected JPanel jPanelCamposSaldoContable;    
	protected JPanel jPanelCamposOcultosSaldoContable;    	
	protected JPanel jPanelAccionesSaldoContable;
	protected JPanel jPanelAccionesFormularioSaldoContable;
    
	
	
	protected Integer iXPanelCamposSaldoContable=0;
	protected Integer iYPanelCamposSaldoContable=0;
	
	protected Integer iXPanelCamposOcultosSaldoContable=0;
	protected Integer iYPanelCamposOcultosSaldoContable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoSaldoContable;
	public JButton jButtonModificarSaldoContable;
	public JButton jButtonActualizarSaldoContable;
    public JButton jButtonEliminarSaldoContable;
	public JButton jButtonCancelarSaldoContable;
    public JButton jButtonGuardarCambiosSaldoContable;
	public JButton jButtonGuardarCambiosTablaSaldoContable;
	protected JButton jButtonCerrarSaldoContable;
	
	
	protected JButton jButtonProcesarInformacionSaldoContable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoSaldoContable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarSaldoContable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeSaldoContable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarSaldoContable;
	protected JButton jButtonModificarToolBarSaldoContable;
	protected JButton jButtonActualizarToolBarSaldoContable;
    protected JButton jButtonEliminarToolBarSaldoContable;
	protected JButton jButtonCancelarToolBarSaldoContable;
    protected JButton jButtonGuardarCambiosToolBarSaldoContable;
	protected JButton jButtonGuardarCambiosTablaToolBarSaldoContable;
	protected JButton jButtonMostrarOcultarTablaToolBarSaldoContable;
	protected JButton jButtonCerrarToolBarSaldoContable;
	
	protected JButton jButtonProcesarInformacionToolBarSaldoContable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoSaldoContable;
	protected JMenuItem jMenuItemModificarSaldoContable;
	protected JMenuItem jMenuItemActualizarSaldoContable;
    protected JMenuItem jMenuItemEliminarSaldoContable;
	protected JMenuItem jMenuItemCancelarSaldoContable;
    protected JMenuItem jMenuItemGuardarCambiosSaldoContable;
	protected JMenuItem jMenuItemGuardarCambiosTablaSaldoContable;
	protected JMenuItem jMenuItemCerrarSaldoContable;
	protected JMenuItem jMenuItemDetalleCerrarSaldoContable;
	protected JMenuItem jMenuItemDetalleMostarOcultarSaldoContable;
	
	protected JMenuItem jMenuItemProcesarInformacionSaldoContable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosSaldoContable;
	protected JMenuItem jMenuItemMostrarOcultarSaldoContable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesSaldoContable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesSaldoContable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesSaldoContable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioSaldoContable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidSaldoContable;
	public JLabel jLabelIdSaldoContable;
	public JLabel jLabelidSaldoContable;
	public JButton jButtonidSaldoContableBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localSaldoContable;
	public JLabel jLabeldebito_mone_localSaldoContable;
	public JTextField jTextFielddebito_mone_localSaldoContable;
	public JButton jButtondebito_mone_localSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localSaldoContable;
	public JLabel jLabelcredito_mone_localSaldoContable;
	public JTextField jTextFieldcredito_mone_localSaldoContable;
	public JButton jButtoncredito_mone_localSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_mone_localSaldoContable;
	public JLabel jLabelsaldo_mone_localSaldoContable;
	public JTextField jTextFieldsaldo_mone_localSaldoContable;
	public JButton jButtonsaldo_mone_localSaldoContableBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraSaldoContable;
	public JLabel jLabeldebito_mone_extraSaldoContable;
	public JTextField jTextFielddebito_mone_extraSaldoContable;
	public JButton jButtondebito_mone_extraSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_extraSaldoContable;
	public JLabel jLabelcredito_mone_extraSaldoContable;
	public JTextField jTextFieldcredito_mone_extraSaldoContable;
	public JButton jButtoncredito_mone_extraSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_mone_extraSaldoContable;
	public JLabel jLabelsaldo_mone_extraSaldoContable;
	public JTextField jTextFieldsaldo_mone_extraSaldoContable;
	public JButton jButtonsaldo_mone_extraSaldoContableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaSaldoContable;
	public JLabel jLabelid_empresaSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaSaldoContable;
	public JButton jButtonid_empresaSaldoContable= new JButtonMe();
	public JButton jButtonid_empresaSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_empresaSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalSaldoContable;
	public JLabel jLabelid_sucursalSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalSaldoContable;
	public JButton jButtonid_sucursalSaldoContable= new JButtonMe();
	public JButton jButtonid_sucursalSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_sucursalSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioSaldoContable;
	public JLabel jLabelid_ejercicioSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioSaldoContable;
	public JButton jButtonid_ejercicioSaldoContable= new JButtonMe();
	public JButton jButtonid_ejercicioSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoSaldoContable;
	public JLabel jLabelid_periodoSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoSaldoContable;
	public JButton jButtonid_periodoSaldoContable= new JButtonMe();
	public JButton jButtonid_periodoSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_periodoSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_anioSaldoContable;
	public JLabel jLabelid_anioSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioSaldoContable;
	public JButton jButtonid_anioSaldoContable= new JButtonMe();
	public JButton jButtonid_anioSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_anioSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_mesSaldoContable;
	public JLabel jLabelid_mesSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesSaldoContable;
	public JButton jButtonid_mesSaldoContable= new JButtonMe();
	public JButton jButtonid_mesSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_mesSaldoContableBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableSaldoContable;
	public JLabel jLabelid_cuenta_contableSaldoContable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableSaldoContable;
	public JButton jButtonid_cuenta_contableSaldoContable= new JButtonMe();
	public JButton jButtonid_cuenta_contableSaldoContableUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableSaldoContableBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableSaldoContableArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesSaldoContable;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public SaldoContableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposSaldoContable=new JPanel();
				this.jPanelAccionesFormularioSaldoContable=new JPanel();
				this.jmenuBarDetalleSaldoContable=new JMenuBar();
				this.jTtoolBarDetalleSaldoContable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public SaldoContableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public SaldoContableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("SaldoContable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarSaldoContable() {
		return this.jButtonActualizarToolBarSaldoContable;
	}
	
	public JButton getjButtonEliminarToolBarSaldoContable() {
		return this.jButtonEliminarToolBarSaldoContable;
	}
	
	public JButton getjButtonCancelarToolBarSaldoContable() {
		return this.jButtonCancelarToolBarSaldoContable;
	}		
	
	public JButton getjButtonProcesarInformacionSaldoContable() {
		return this.jButtonProcesarInformacionSaldoContable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionSaldoContable)	{
		this.jButtonProcesarInformacionSaldoContable = jButtonProcesarInformacionSaldoContable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesSaldoContable() {
		return this.jComboBoxTiposAccionesSaldoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesSaldoContable(
			JComboBox jComboBoxTiposRelacionesSaldoContable) {
		this.jComboBoxTiposRelacionesSaldoContable = jComboBoxTiposRelacionesSaldoContable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesSaldoContable(
			JComboBox jComboBoxTiposAccionesSaldoContable) {
		this.jComboBoxTiposAccionesSaldoContable = jComboBoxTiposAccionesSaldoContable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioSaldoContable() {
		return this.jComboBoxTiposAccionesFormularioSaldoContable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioSaldoContable(
			JComboBox jComboBoxTiposAccionesFormularioSaldoContable) {
		this.jComboBoxTiposAccionesFormularioSaldoContable = jComboBoxTiposAccionesFormularioSaldoContable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.saldocontableSessionBean=new SaldoContableSessionBean();
		
		this.saldocontableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.saldocontableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.saldocontableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		SaldoContableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		SaldoContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		SaldoContableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Saldo Contable MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
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
	
		SaldoContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleSaldoContable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarSaldoContable=new JButtonMe();
				this.jButtonModificarToolBarSaldoContable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarSaldoContable,this.jTtoolBarDetalleSaldoContable,
							"actualizar","actualizar","Actualizar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarSaldoContable,this.jTtoolBarDetalleSaldoContable,
							"eliminar","eliminar","Eliminar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarSaldoContable,this.jTtoolBarDetalleSaldoContable,
							"cancelar","cancelar","Cancelar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarSaldoContable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarSaldoContable,this.jTtoolBarDetalleSaldoContable,
							"guardarcambios","guardarcambios","Guardar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleSaldoContable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleSaldoContable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoSaldoContable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesSaldoContable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosSaldoContable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoSaldoContable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoSaldoContable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoSaldoContable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarSaldoContable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarSaldoContable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarSaldoContable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarSaldoContable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarSaldoContable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarSaldoContable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarSaldoContable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarSaldoContable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarSaldoContable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarSaldoContable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarSaldoContable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarSaldoContable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosSaldoContable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosSaldoContable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosSaldoContable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarSaldoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarSaldoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarSaldoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarSaldoContable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarSaldoContable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarSaldoContable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarSaldoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarSaldoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarSaldoContable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarSaldoContable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarSaldoContable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarSaldoContable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoSaldoContable.add(this.jMenuItemDetalleCerrarSaldoContable);
		
		this.jmenuDetalleAccionesSaldoContable.add(this.jMenuItemActualizarSaldoContable);
		this.jmenuDetalleAccionesSaldoContable.add(this.jMenuItemEliminarSaldoContable);
		this.jmenuDetalleAccionesSaldoContable.add(this.jMenuItemCancelarSaldoContable);		
		
		//this.jmenuDetalleDatosSaldoContable.add(this.jMenuItemDetalleAbrirOrderBySaldoContable);				
		this.jmenuDetalleDatosSaldoContable.add(this.jMenuItemDetalleMostarOcultarSaldoContable);				
				
		//this.jmenuDetalleAccionesSaldoContable.add(this.jMenuItemGuardarCambiosSaldoContable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleSaldoContable.add(this.jmenuDetalleArchivoSaldoContable);		
		this.jmenuBarDetalleSaldoContable.add(this.jmenuDetalleAccionesSaldoContable);		
		this.jmenuBarDetalleSaldoContable.add(this.jmenuDetalleDatosSaldoContable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleSaldoContable);				
	}
	
	
	public void inicializarElementosCamposSaldoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdSaldoContable = new JLabelMe();
		jLabelIdSaldoContable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidSaldoContable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutSaldoContable= new GridBagLayout();

		this.jPanelidSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);

		jLabelidSaldoContable = new JLabel();
		jLabelidSaldoContable.setText("Id");

		jLabelidSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldebito_mone_localSaldoContable = new JLabelMe();
		this.jLabeldebito_mone_localSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localSaldoContable.setToolTipText("Debito Moneda Local");
		this.jLabeldebito_mone_localSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldebito_mone_localSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPaneldebito_mone_localSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jTextFielddebito_mone_localSaldoContable= new JTextFieldMe();
		jTextFielddebito_mone_localSaldoContable.setEnabled(false);
		jTextFielddebito_mone_localSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localSaldoContable.setText("0.0");

		this.jButtondebito_mone_localSaldoContableBusqueda= new JButtonMe();
		this.jButtondebito_mone_localSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localSaldoContableBusqueda.setText("U");
		this.jButtondebito_mone_localSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localSaldoContableBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localSaldoContable = new JLabelMe();
		this.jLabelcredito_mone_localSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localSaldoContable.setToolTipText("Credito Moneda Local");
		this.jLabelcredito_mone_localSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcredito_mone_localSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcredito_mone_localSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelcredito_mone_localSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jTextFieldcredito_mone_localSaldoContable= new JTextFieldMe();
		jTextFieldcredito_mone_localSaldoContable.setEnabled(false);
		jTextFieldcredito_mone_localSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localSaldoContable.setText("0.0");

		this.jButtoncredito_mone_localSaldoContableBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localSaldoContableBusqueda.setText("U");
		this.jButtoncredito_mone_localSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localSaldoContableBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_mone_localSaldoContable = new JLabelMe();
		this.jLabelsaldo_mone_localSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL+" : *");
		this.jLabelsaldo_mone_localSaldoContable.setToolTipText("Saldo Moneda Local");
		this.jLabelsaldo_mone_localSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldo_mone_localSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldo_mone_localSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_mone_localSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_mone_localSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_mone_localSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_SALDOMONELOCAL);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelsaldo_mone_localSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jTextFieldsaldo_mone_localSaldoContable= new JTextFieldMe();
		jTextFieldsaldo_mone_localSaldoContable.setEnabled(false);
		jTextFieldsaldo_mone_localSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_mone_localSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_mone_localSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_mone_localSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_mone_localSaldoContable.setText("0.0");

		this.jButtonsaldo_mone_localSaldoContableBusqueda= new JButtonMe();
		this.jButtonsaldo_mone_localSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_mone_localSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_mone_localSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_mone_localSaldoContableBusqueda.setText("U");
		this.jButtonsaldo_mone_localSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_mone_localSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_mone_localSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_mone_localSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_mone_localSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_mone_localSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_mone_localSaldoContableBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraSaldoContable = new JLabelMe();
		this.jLabeldebito_mone_extraSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraSaldoContable.setToolTipText("Debito Moneda Extranjera");
		this.jLabeldebito_mone_extraSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldebito_mone_extraSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeldebito_mone_extraSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPaneldebito_mone_extraSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jTextFielddebito_mone_extraSaldoContable= new JTextFieldMe();
		jTextFielddebito_mone_extraSaldoContable.setEnabled(false);
		jTextFielddebito_mone_extraSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraSaldoContable.setText("0.0");

		this.jButtondebito_mone_extraSaldoContableBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraSaldoContableBusqueda.setText("U");
		this.jButtondebito_mone_extraSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraSaldoContableBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_extraSaldoContable = new JLabelMe();
		this.jLabelcredito_mone_extraSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA+" : *");
		this.jLabelcredito_mone_extraSaldoContable.setToolTipText("Credito Moneda Extrajera");
		this.jLabelcredito_mone_extraSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcredito_mone_extraSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcredito_mone_extraSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_extraSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_extraSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_extraSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelcredito_mone_extraSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jTextFieldcredito_mone_extraSaldoContable= new JTextFieldMe();
		jTextFieldcredito_mone_extraSaldoContable.setEnabled(false);
		jTextFieldcredito_mone_extraSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_extraSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_extraSaldoContable.setText("0.0");

		this.jButtoncredito_mone_extraSaldoContableBusqueda= new JButtonMe();
		this.jButtoncredito_mone_extraSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_extraSaldoContableBusqueda.setText("U");
		this.jButtoncredito_mone_extraSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_extraSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_extraSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_extraSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_extraSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_extraSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_extraSaldoContableBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_mone_extraSaldoContable = new JLabelMe();
		this.jLabelsaldo_mone_extraSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA+" : *");
		this.jLabelsaldo_mone_extraSaldoContable.setToolTipText("Saldo Moneda Extrajera");
		this.jLabelsaldo_mone_extraSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsaldo_mone_extraSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsaldo_mone_extraSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_mone_extraSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_mone_extraSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_mone_extraSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_SALDOMONEEXTRA);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelsaldo_mone_extraSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jTextFieldsaldo_mone_extraSaldoContable= new JTextFieldMe();
		jTextFieldsaldo_mone_extraSaldoContable.setEnabled(false);
		jTextFieldsaldo_mone_extraSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_mone_extraSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_mone_extraSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_mone_extraSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_mone_extraSaldoContable.setText("0.0");

		this.jButtonsaldo_mone_extraSaldoContableBusqueda= new JButtonMe();
		this.jButtonsaldo_mone_extraSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_mone_extraSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_mone_extraSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_mone_extraSaldoContableBusqueda.setText("U");
		this.jButtonsaldo_mone_extraSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_mone_extraSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_mone_extraSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_mone_extraSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_mone_extraSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_mone_extraSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_mone_extraSaldoContableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysSaldoContable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaSaldoContable = new JLabelMe();
		this.jLabelid_empresaSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaSaldoContable.setToolTipText("Empresa");
		this.jLabelid_empresaSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_empresaSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_empresaSaldoContable= new JComboBoxMe();
		jComboBoxid_empresaSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaSaldoContable.setEnabled(false);

		this.jButtonid_empresaSaldoContable= new JButtonMe();
		this.jButtonid_empresaSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaSaldoContable.setText("Buscar");
		this.jButtonid_empresaSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldoContable"));

		this.jButtonid_empresaSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_empresaSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldoContableBusqueda.setText("U");
		this.jButtonid_empresaSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_empresaSaldoContableUpdate= new JButtonMe();
		this.jButtonid_empresaSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaSaldoContableUpdate.setText("U");
		this.jButtonid_empresaSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaSaldoContableUpdate"));



					
		this.jLabelid_sucursalSaldoContable = new JLabelMe();
		this.jLabelid_sucursalSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalSaldoContable.setToolTipText("Sucursal");
		this.jLabelid_sucursalSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_sucursalSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_sucursalSaldoContable= new JComboBoxMe();
		jComboBoxid_sucursalSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalSaldoContable.setEnabled(false);

		this.jButtonid_sucursalSaldoContable= new JButtonMe();
		this.jButtonid_sucursalSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalSaldoContable.setText("Buscar");
		this.jButtonid_sucursalSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldoContable"));

		this.jButtonid_sucursalSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_sucursalSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSaldoContableBusqueda.setText("U");
		this.jButtonid_sucursalSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_sucursalSaldoContableUpdate= new JButtonMe();
		this.jButtonid_sucursalSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalSaldoContableUpdate.setText("U");
		this.jButtonid_sucursalSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalSaldoContableUpdate"));



					
		this.jLabelid_ejercicioSaldoContable = new JLabelMe();
		this.jLabelid_ejercicioSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioSaldoContable.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_ejercicioSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_ejercicioSaldoContable= new JComboBoxMe();
		jComboBoxid_ejercicioSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioSaldoContable.setEnabled(false);

		this.jButtonid_ejercicioSaldoContable= new JButtonMe();
		this.jButtonid_ejercicioSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioSaldoContable.setText("Buscar");
		this.jButtonid_ejercicioSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSaldoContable"));

		this.jButtonid_ejercicioSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_ejercicioSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSaldoContableBusqueda.setText("U");
		this.jButtonid_ejercicioSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioSaldoContableUpdate= new JButtonMe();
		this.jButtonid_ejercicioSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioSaldoContableUpdate.setText("U");
		this.jButtonid_ejercicioSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioSaldoContableUpdate"));



					
		this.jLabelid_periodoSaldoContable = new JLabelMe();
		this.jLabelid_periodoSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoSaldoContable.setToolTipText("Periodo");
		this.jLabelid_periodoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_periodoSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_periodoSaldoContable= new JComboBoxMe();
		jComboBoxid_periodoSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoSaldoContable.setEnabled(false);

		this.jButtonid_periodoSaldoContable= new JButtonMe();
		this.jButtonid_periodoSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoSaldoContable.setText("Buscar");
		this.jButtonid_periodoSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSaldoContable"));

		this.jButtonid_periodoSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_periodoSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoSaldoContableBusqueda.setText("U");
		this.jButtonid_periodoSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_periodoSaldoContableUpdate= new JButtonMe();
		this.jButtonid_periodoSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoSaldoContableUpdate.setText("U");
		this.jButtonid_periodoSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoSaldoContableUpdate"));



					
		this.jLabelid_anioSaldoContable = new JLabelMe();
		this.jLabelid_anioSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioSaldoContable.setToolTipText("Anio");
		this.jLabelid_anioSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_anioSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_anioSaldoContable= new JComboBoxMe();
		jComboBoxid_anioSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioSaldoContable.setEnabled(false);

		this.jButtonid_anioSaldoContable= new JButtonMe();
		this.jButtonid_anioSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioSaldoContable.setText("Buscar");
		this.jButtonid_anioSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSaldoContable"));

		this.jButtonid_anioSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_anioSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioSaldoContableBusqueda.setText("U");
		this.jButtonid_anioSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_anioSaldoContableUpdate= new JButtonMe();
		this.jButtonid_anioSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioSaldoContableUpdate.setText("U");
		this.jButtonid_anioSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioSaldoContableUpdate"));



					
		this.jLabelid_mesSaldoContable = new JLabelMe();
		this.jLabelid_mesSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesSaldoContable.setToolTipText("Mes");
		this.jLabelid_mesSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_mesSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_mesSaldoContable= new JComboBoxMe();
		jComboBoxid_mesSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesSaldoContable.setEnabled(false);

		this.jButtonid_mesSaldoContable= new JButtonMe();
		this.jButtonid_mesSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesSaldoContable.setText("Buscar");
		this.jButtonid_mesSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSaldoContable"));

		this.jButtonid_mesSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_mesSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesSaldoContableBusqueda.setText("U");
		this.jButtonid_mesSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_mesSaldoContableUpdate= new JButtonMe();
		this.jButtonid_mesSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesSaldoContableUpdate.setText("U");
		this.jButtonid_mesSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesSaldoContableUpdate"));



					
		this.jLabelid_cuenta_contableSaldoContable = new JLabelMe();
		this.jLabelid_cuenta_contableSaldoContable.setText(""+SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableSaldoContable.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableSaldoContable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableSaldoContable.setToolTipText(SaldoContableConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutSaldoContable = new GridBagLayout();
		this.jPanelid_cuenta_contableSaldoContable.setLayout(this.gridaBagLayoutSaldoContable);


		jComboBoxid_cuenta_contableSaldoContable= new JComboBoxMe();
		jComboBoxid_cuenta_contableSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableSaldoContable= new JButtonMe();
		this.jButtonid_cuenta_contableSaldoContable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableSaldoContable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableSaldoContable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableSaldoContable.setText("Buscar");
		this.jButtonid_cuenta_contableSaldoContable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableSaldoContable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSaldoContable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSaldoContable"));

		this.jButtonid_cuenta_contableSaldoContableBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableSaldoContableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSaldoContableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSaldoContableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableSaldoContableBusqueda.setText("U");
		this.jButtonid_cuenta_contableSaldoContableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableSaldoContableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSaldoContableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSaldoContableBusqueda"));

		if(this.saldocontableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableSaldoContableBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableSaldoContableUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableSaldoContableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSaldoContableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableSaldoContableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableSaldoContableUpdate.setText("U");
		this.jButtonid_cuenta_contableSaldoContableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableSaldoContableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSaldoContableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSaldoContableUpdate"));


		jButtonid_cuenta_contableSaldoContableArbol= new JButtonMe();
		jButtonid_cuenta_contableSaldoContableArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableSaldoContableArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableSaldoContableArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableSaldoContableArbol.setText("Arbol");
		jButtonid_cuenta_contableSaldoContableArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableSaldoContableArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableSaldoContableArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableSaldoContable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableSaldoContable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableSaldoContableArbol"));



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
		//this.jInternalFrameDetalleSaldoContable = new SaldoContableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Saldo Contable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutSaldoContable= new GridBagLayout();
		

		
		String sToolTipSaldoContable="";
		sToolTipSaldoContable=SaldoContableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipSaldoContable+="(Contabilidad.SaldoContable)";
		}
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			sToolTipSaldoContable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoSaldoContable = new JButtonMe();
		this.jButtonModificarSaldoContable = new JButtonMe();
        this.jButtonActualizarSaldoContable = new JButtonMe();
        this.jButtonEliminarSaldoContable = new JButtonMe();
        this.jButtonCancelarSaldoContable = new JButtonMe();
        this.jButtonGuardarCambiosSaldoContable = new JButtonMe();
		this.jButtonGuardarCambiosTablaSaldoContable = new JButtonMe();
		this.jButtonCerrarSaldoContable = new JButtonMe();
		
		this.jScrollPanelDatosSaldoContable = new JScrollPane();   
        this.jScrollPanelDatosEdicionSaldoContable = new JScrollPane();
		this.jScrollPanelDatosGeneralSaldoContable = new JScrollPane();
				
		
		
		this.jPanelCamposSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Saldo Contable";
		
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Saldo Contables" + this.sPath));
		} else {
			this.jScrollPanelDatosSaldoContable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposSaldoContable.setName("jPanelCamposSaldoContable"); 

		this.jPanelCamposOcultosSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosSaldoContable.setName("jPanelCamposOcultosSaldoContable"); 

        this.jPanelAccionesSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesSaldoContable.setToolTipText("Acciones");
        this.jPanelAccionesSaldoContable.setName("Acciones"); 

		this.jPanelAccionesFormularioSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioSaldoContable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioSaldoContable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoSaldoContable.setText("Nuevo");
		this.jButtonModificarSaldoContable.setText("Editar");
        this.jButtonActualizarSaldoContable.setText("Actualizar");
        this.jButtonEliminarSaldoContable.setText("Eliminar");
        this.jButtonCancelarSaldoContable.setText("Cancelar");
        this.jButtonGuardarCambiosSaldoContable.setText("Guardar");
		this.jButtonGuardarCambiosTablaSaldoContable.setText("Guardar");
		this.jButtonCerrarSaldoContable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoSaldoContable,"nuevo_button","Nuevo",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarSaldoContable,"modificar_button","Editar",this.saldocontableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarSaldoContable,"actualizar_button","Actualizar",this.saldocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarSaldoContable,"eliminar_button","Eliminar",this.saldocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarSaldoContable,"cancelar_button","Cancelar",this.saldocontableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosSaldoContable,"guardarcambios_button","Guardar",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaSaldoContable,"guardarcambiostabla_button","Guardar",this.saldocontableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarSaldoContable,"cerrar_button","Salir",this.saldocontableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoSaldoContable.setToolTipText("Nuevo"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarSaldoContable.setToolTipText("Editar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarSaldoContable.setToolTipText("Actualizar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarSaldoContable.setToolTipText("Eliminar)"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarSaldoContable.setToolTipText("Cancelar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosSaldoContable.setToolTipText("Guardar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaSaldoContable.setToolTipText("Guardar"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarSaldoContable.setToolTipText("Salir"+" "+SaldoContableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoSaldoContable";
		inputMap = this.jButtonNuevoSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoSaldoContable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoSaldoContable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarSaldoContable";
		inputMap = this.jButtonActualizarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarSaldoContable"));
		
		//ELIMINAR
		sMapKey = "EliminarSaldoContable";
		inputMap = this.jButtonEliminarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarSaldoContable"));
		
		//CANCELAR	
		sMapKey = "CancelarSaldoContable";
		inputMap = this.jButtonCancelarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarSaldoContable"));
		
		//CERRAR		
		sMapKey = "CerrarSaldoContable";
		inputMap = this.jButtonCerrarSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarSaldoContable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaSaldoContable";
		inputMap = this.jButtonGuardarCambiosTablaSaldoContable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaSaldoContable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaSaldoContable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoSaldoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoSaldoContable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoSaldoContable.setToolTipText("Nuevo SaldoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarSaldoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarSaldoContable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarSaldoContable.setToolTipText("Sin Cerrar Ventana SaldoContable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeSaldoContable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeSaldoContable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeSaldoContable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesSaldoContable.setText("Accion");
		this.jComboBoxTiposAccionesSaldoContable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioSaldoContable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioSaldoContable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioSaldoContable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesSaldoContable = new JLabelMe();
		
		this.jLabelAccionesSaldoContable.setText("Acciones");		
		this.jLabelAccionesSaldoContable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoContable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesSaldoContable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposSaldoContable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysSaldoContable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesSaldoContable=new JTabbedPane();
		this.jTabbedPaneRelacionesSaldoContable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesSaldoContable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesSaldoContable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoContable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesSaldoContable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesSaldoContable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioSaldoContable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldoContable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioSaldoContable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioSaldoContable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposSaldoContable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosSaldoContable = new GridBagLayout();
		
		this.jPanelCamposSaldoContable.setLayout(gridaBagLayoutCamposSaldoContable);
		this.jPanelCamposOcultosSaldoContable.setLayout(gridaBagLayoutCamposOcultosSaldoContable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidSaldoContable.add(jLabelIdSaldoContable, this.gridBagConstraintsSaldoContable);



	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidSaldoContable.add(jLabelidSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaSaldoContable.add(jLabelid_empresaSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldoContable.add(jButtonid_empresaSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 3;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaSaldoContable.add(jButtonid_empresaSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaSaldoContable.add(jComboBoxid_empresaSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalSaldoContable.add(jLabelid_sucursalSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSaldoContable.add(jButtonid_sucursalSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 3;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalSaldoContable.add(jButtonid_sucursalSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalSaldoContable.add(jComboBoxid_sucursalSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioSaldoContable.add(jLabelid_ejercicioSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSaldoContable.add(jButtonid_ejercicioSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 3;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioSaldoContable.add(jButtonid_ejercicioSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioSaldoContable.add(jComboBoxid_ejercicioSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoSaldoContable.add(jLabelid_periodoSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoSaldoContable.add(jButtonid_periodoSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 3;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoSaldoContable.add(jButtonid_periodoSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoSaldoContable.add(jComboBoxid_periodoSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioSaldoContable.add(jLabelid_anioSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioSaldoContable.add(jButtonid_anioSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 3;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioSaldoContable.add(jButtonid_anioSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioSaldoContable.add(jComboBoxid_anioSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesSaldoContable.add(jLabelid_mesSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesSaldoContable.add(jButtonid_mesSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 3;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesSaldoContable.add(jButtonid_mesSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesSaldoContable.add(jComboBoxid_mesSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableSaldoContable.add(jLabelid_cuenta_contableSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 2;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableSaldoContable.add(jButtonid_cuenta_contableSaldoContable, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 3;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableSaldoContable.add(jButtonid_cuenta_contableSaldoContableArbol, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 4;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableSaldoContable.add(jButtonid_cuenta_contableSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 5;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableSaldoContable.add(jButtonid_cuenta_contableSaldoContableUpdate, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableSaldoContable.add(jComboBoxid_cuenta_contableSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_localSaldoContable.add(jLabeldebito_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localSaldoContable.add(jButtondebito_mone_localSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_localSaldoContable.add(jTextFielddebito_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_localSaldoContable.add(jLabelcredito_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localSaldoContable.add(jButtoncredito_mone_localSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_localSaldoContable.add(jTextFieldcredito_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_mone_localSaldoContable.add(jLabelsaldo_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_mone_localSaldoContable.add(jButtonsaldo_mone_localSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_mone_localSaldoContable.add(jTextFieldsaldo_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldebito_mone_extraSaldoContable.add(jLabeldebito_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraSaldoContable.add(jButtondebito_mone_extraSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldebito_mone_extraSaldoContable.add(jTextFielddebito_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcredito_mone_extraSaldoContable.add(jLabelcredito_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_extraSaldoContable.add(jButtoncredito_mone_extraSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcredito_mone_extraSaldoContable.add(jTextFieldcredito_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);


	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 0;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_mone_extraSaldoContable.add(jLabelsaldo_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		//this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = 2;
		this.gridBagConstraintsSaldoContable.ipadx = 0;
		this.gridBagConstraintsSaldoContable.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_mone_extraSaldoContable.add(jButtonsaldo_mone_extraSaldoContableBusqueda, this.gridBagConstraintsSaldoContable);
	}

	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsSaldoContable.gridy = 0;
	this.gridBagConstraintsSaldoContable.gridx = 1;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_mone_extraSaldoContable.add(jTextFieldsaldo_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPanelidSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPanelid_cuenta_contableSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPaneldebito_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPanelcredito_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPanelsaldo_mone_localSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPaneldebito_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPanelcredito_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposSaldoContable.add(this.jPanelsaldo_mone_extraSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposSaldoContable % 2==0) {
		iXPanelCamposSaldoContable=0;
		iYPanelCamposSaldoContable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposOcultosSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposOcultosSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoContable.add(this.jPanelid_empresaSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposOcultosSaldoContable % 2==0) {
		iXPanelCamposOcultosSaldoContable=0;
		iYPanelCamposOcultosSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposOcultosSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposOcultosSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoContable.add(this.jPanelid_sucursalSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposOcultosSaldoContable % 2==0) {
		iXPanelCamposOcultosSaldoContable=0;
		iYPanelCamposOcultosSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposOcultosSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposOcultosSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoContable.add(this.jPanelid_ejercicioSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposOcultosSaldoContable % 2==0) {
		iXPanelCamposOcultosSaldoContable=0;
		iYPanelCamposOcultosSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposOcultosSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposOcultosSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoContable.add(this.jPanelid_periodoSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposOcultosSaldoContable % 2==0) {
		iXPanelCamposOcultosSaldoContable=0;
		iYPanelCamposOcultosSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposOcultosSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposOcultosSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoContable.add(this.jPanelid_anioSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposOcultosSaldoContable % 2==0) {
		iXPanelCamposOcultosSaldoContable=0;
		iYPanelCamposOcultosSaldoContable++;
	}
	this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsSaldoContable.gridy = iYPanelCamposOcultosSaldoContable;
	this.gridBagConstraintsSaldoContable.gridx = iXPanelCamposOcultosSaldoContable++;
	this.gridBagConstraintsSaldoContable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsSaldoContable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosSaldoContable.add(this.jPanelid_mesSaldoContable, this.gridBagConstraintsSaldoContable);



	if(iXPanelCamposOcultosSaldoContable % 2==0) {
		iXPanelCamposOcultosSaldoContable=0;
		iYPanelCamposOcultosSaldoContable++;
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
			
		GridBagLayout gridaBagLayoutAccionesSaldoContable= new GridBagLayout();
		this.jPanelAccionesSaldoContable.setLayout(gridaBagLayoutAccionesSaldoContable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioSaldoContable= new GridBagLayout();
		this.jPanelAccionesFormularioSaldoContable.setLayout(gridaBagLayoutAccionesFormularioSaldoContable);
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldoContable.add(this.jComboBoxTiposAccionesFormularioSaldoContable, this.gridBagConstraintsSaldoContable);

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsSaldoContable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioSaldoContable.add(this.jCheckBoxPostAccionNuevoSaldoContable, this.gridBagConstraintsSaldoContable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSaldoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSaldoContable.add(this.jCheckBoxPostAccionSinCerrarSaldoContable, this.gridBagConstraintsSaldoContable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.saldocontableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.saldocontableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsSaldoContable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioSaldoContable.add(this.jCheckBoxPostAccionSinMensajeSaldoContable, this.gridBagConstraintsSaldoContable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx = iPosXAccion++;
			
		this.jPanelAccionesSaldoContable.add(this.jButtonModificarSaldoContable, this.gridBagConstraintsSaldoContable);							

		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsSaldoContable.gridy = 0;
		this.gridBagConstraintsSaldoContable.gridx =iPosXAccion++;
			
		this.jPanelAccionesSaldoContable.add(this.jButtonEliminarSaldoContable, this.gridBagConstraintsSaldoContable);
		
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = 0;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldoContable.add(this.jButtonActualizarSaldoContable, this.gridBagConstraintsSaldoContable);


		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = 0;		
		this.gridBagConstraintsSaldoContable.gridx = iPosXAccion++;
		
		this.jPanelAccionesSaldoContable.add(this.jButtonGuardarCambiosSaldoContable, this.gridBagConstraintsSaldoContable);	
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = 0;		
		this.gridBagConstraintsSaldoContable.gridx =iPosXAccion++;
		
		this.jPanelAccionesSaldoContable.add(this.jButtonCancelarSaldoContable, this.gridBagConstraintsSaldoContable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutSaldoContable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutSaldoContable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.saldocontableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();						
			this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsSaldoContable.gridx = 0;		
			//this.gridBagConstraintsSaldoContable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsSaldoContable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsSaldoContable.gridx =0;
		this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsSaldoContable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosSaldoContable, this.gridBagConstraintsSaldoContable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(SaldoContableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleSaldoContable = new SaldoContableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Saldo Contable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Saldo Contable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Saldo Contable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			SaldoContableModel saldocontableModel=new SaldoContableModel(this);
			
			//SI USARA CLASE INTERNA
			//SaldoContableModel.SaldoContableFocusTraversalPolicy saldocontableFocusTraversalPolicy = saldocontableModel.new SaldoContableFocusTraversalPolicy(this);
			
			//saldocontableFocusTraversalPolicy.setsaldocontableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(saldocontableModel);
			
			
			this.jContentPaneDetalleSaldoContable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleSaldoContable = new GridBagLayout();	
			this.jContentPaneDetalleSaldoContable.setLayout(gridaBagLayoutDetalleSaldoContable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosSaldoContable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsSaldoContable = new GridBagConstraints();
				this.gridBagConstraintsSaldoContable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsSaldoContable.gridx = 0;
					
				
				this.jContentPaneDetalleSaldoContable.add(jTtoolBarDetalleSaldoContable, gridBagConstraintsSaldoContable);								
				
}
			
			this.jScrollPanelDatosEdicionSaldoContable=   new JScrollPane(jContentPaneDetalleSaldoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralSaldoContable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralSaldoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralSaldoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsSaldoContable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsSaldoContable.gridx = 0;
	        
			this.jContentPaneDetalleSaldoContable.add(jPanelCamposSaldoContable, gridBagConstraintsSaldoContable);
			
			
			
			
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
						&& saldocontableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.saldocontableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsSaldoContable= new GridBagConstraints();
						this.gridBagConstraintsSaldoContable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsSaldoContable.gridx = 0;
						this.jContentPaneDetalleSaldoContable.add(this.jTabbedPaneRelacionesSaldoContable, this.gridBagConstraintsSaldoContable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesSaldoContable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosSaldoContable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsSaldoContable = new GridBagConstraints();
					this.gridBagConstraintsSaldoContable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsSaldoContable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsSaldoContable.gridx = 0;
					
				
					this.jContentPaneDetalleSaldoContable.add(jPanelCamposOcultosSaldoContable, gridBagConstraintsSaldoContable);
				
					this.jPanelCamposOcultosSaldoContable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsSaldoContable.gridx = 0;
	        this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleSaldoContable.add(this.jPanelAccionesFormularioSaldoContable, this.gridBagConstraintsSaldoContable);							
			
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
	        this.gridBagConstraintsSaldoContable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsSaldoContable.gridx = 0;
	        
			
			this.jContentPaneDetalleSaldoContable.add(this.jPanelAccionesSaldoContable, this.gridBagConstraintsSaldoContable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionSaldoContable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionSaldoContable=   new JScrollPane(this.jPanelCamposSaldoContable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionSaldoContable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoContable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionSaldoContable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsSaldoContable.gridx = 0;
			this.gridBagConstraintsSaldoContable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsSaldoContable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsSaldoContable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionSaldoContable, this.gridBagConstraintsSaldoContable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioSaldoContable, this.gridBagConstraintsSaldoContable);			
			
			this.gridBagConstraintsSaldoContable = new GridBagConstraints();
			this.gridBagConstraintsSaldoContable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsSaldoContable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesSaldoContable, this.gridBagConstraintsSaldoContable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposSaldoContable, this.gridBagConstraintsSaldoContable);
			
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosSaldoContable, this.gridBagConstraintsSaldoContable);
		
			
		this.gridBagConstraintsSaldoContable = new GridBagConstraints();
		this.gridBagConstraintsSaldoContable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsSaldoContable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesSaldoContable, this.gridBagConstraintsSaldoContable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralSaldoContable;//jContentPane;
		
		return jScrollPanelDatosEdicionSaldoContable;
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
