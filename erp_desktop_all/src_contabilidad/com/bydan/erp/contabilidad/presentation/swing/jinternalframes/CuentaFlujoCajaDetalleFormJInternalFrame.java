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
import com.bydan.erp.contabilidad.util.CuentaFlujoCajaConstantesFunciones;

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
public class CuentaFlujoCajaDetalleFormJInternalFrame extends CuentaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleCuentaFlujoCaja;
	
	protected JMenu jmenuDetalleCuentaFlujoCaja;
	protected JMenu jmenuDetalleArchivoCuentaFlujoCaja;
	protected JMenu jmenuDetalleAccionesCuentaFlujoCaja;
	protected JMenu jmenuDetalleDatosCuentaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsCuentaFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";

	protected DiaBeanSwingJInternalFrame diaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_dia="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean;
	
	

	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame detallecuentaflujocajaBeanSwingJInternalFrame=null;
	public DetalleCuentaFlujoCajaBeanSwingJInternalFrame detallecuentaflujocajaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleCuentaFlujoCaja=false;
	public DetalleCuentaFlujoCajaSessionBean detallecuentaflujocajaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public MesSessionBean mesSessionBean;
	public DiaSessionBean diaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public CuentaFlujoCajaLogic cuentaflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralCuentaFlujoCaja;
	
	protected JPanel jPanelCamposCuentaFlujoCaja;    
	protected JPanel jPanelCamposOcultosCuentaFlujoCaja;    	
	protected JPanel jPanelAccionesCuentaFlujoCaja;
	protected JPanel jPanelAccionesFormularioCuentaFlujoCaja;
    
	
	
	protected Integer iXPanelCamposCuentaFlujoCaja=0;
	protected Integer iYPanelCamposCuentaFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosCuentaFlujoCaja=0;
	protected Integer iYPanelCamposOcultosCuentaFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaFlujoCaja;
	public JButton jButtonModificarCuentaFlujoCaja;
	public JButton jButtonActualizarCuentaFlujoCaja;
    public JButton jButtonEliminarCuentaFlujoCaja;
	public JButton jButtonCancelarCuentaFlujoCaja;
    public JButton jButtonGuardarCambiosCuentaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaCuentaFlujoCaja;
	protected JButton jButtonCerrarCuentaFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionCuentaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaFlujoCaja;
	protected JButton jButtonModificarToolBarCuentaFlujoCaja;
	protected JButton jButtonActualizarToolBarCuentaFlujoCaja;
    protected JButton jButtonEliminarToolBarCuentaFlujoCaja;
	protected JButton jButtonCancelarToolBarCuentaFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarCuentaFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaFlujoCaja;
	protected JButton jButtonCerrarToolBarCuentaFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaFlujoCaja;
	protected JMenuItem jMenuItemModificarCuentaFlujoCaja;
	protected JMenuItem jMenuItemActualizarCuentaFlujoCaja;
    protected JMenuItem jMenuItemEliminarCuentaFlujoCaja;
	protected JMenuItem jMenuItemCancelarCuentaFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosCuentaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaFlujoCaja;
	protected JMenuItem jMenuItemCerrarCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarCuentaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaFlujoCaja;
	public JLabel jLabelIdCuentaFlujoCaja;
	public JLabel jLabelidCuentaFlujoCaja;
	public JButton jButtonidCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombreCuentaFlujoCaja;
	public JLabel jLabelnombreCuentaFlujoCaja;
	public JTextArea jTextAreanombreCuentaFlujoCaja;
	public JScrollPane jscrollPanenombreCuentaFlujoCaja;
	public JButton jButtonnombreCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelformulaCuentaFlujoCaja;
	public JLabel jLabelformulaCuentaFlujoCaja;
	public JTextArea jTextAreaformulaCuentaFlujoCaja;
	public JScrollPane jscrollPaneformulaCuentaFlujoCaja;
	public JButton jButtonformulaCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPaneles_flujo_cajaCuentaFlujoCaja;
	public JLabel jLabeles_flujo_cajaCuentaFlujoCaja;
	public JCheckBox jCheckBoxes_flujo_cajaCuentaFlujoCaja;
	public JButton jButtones_flujo_cajaCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelcon_agruparCuentaFlujoCaja;
	public JLabel jLabelcon_agruparCuentaFlujoCaja;
	public JCheckBox jCheckBoxcon_agruparCuentaFlujoCaja;
	public JButton jButtoncon_agruparCuentaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaFlujoCaja;
	public JLabel jLabelid_empresaCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaFlujoCaja;
	public JButton jButtonid_empresaCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_empresaCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesCuentaFlujoCaja;
	public JLabel jLabelid_mesCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesCuentaFlujoCaja;
	public JButton jButtonid_mesCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_mesCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_mesCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_diaCuentaFlujoCaja;
	public JLabel jLabelid_diaCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_diaCuentaFlujoCaja;
	public JButton jButtonid_diaCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_diaCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_diaCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCuentaFlujoCaja;
	public JLabel jLabelid_cuenta_contableCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaFlujoCaja;
	public JButton jButtonid_cuenta_contableCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaFlujoCajaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaFlujoCaja;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioCuentaFlujoCaja=new JPanel();
				this.jmenuBarDetalleCuentaFlujoCaja=new JMenuBar();
				this.jTtoolBarDetalleCuentaFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaFlujoCaja() {
		return this.jButtonActualizarToolBarCuentaFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarCuentaFlujoCaja() {
		return this.jButtonEliminarToolBarCuentaFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarCuentaFlujoCaja() {
		return this.jButtonCancelarToolBarCuentaFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaFlujoCaja() {
		return this.jButtonProcesarInformacionCuentaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaFlujoCaja)	{
		this.jButtonProcesarInformacionCuentaFlujoCaja = jButtonProcesarInformacionCuentaFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaFlujoCaja() {
		return this.jComboBoxTiposAccionesCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesCuentaFlujoCaja) {
		this.jComboBoxTiposRelacionesCuentaFlujoCaja = jComboBoxTiposRelacionesCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaFlujoCaja(
			JComboBox jComboBoxTiposAccionesCuentaFlujoCaja) {
		this.jComboBoxTiposAccionesCuentaFlujoCaja = jComboBoxTiposAccionesCuentaFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioCuentaFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja = jComboBoxTiposAccionesFormularioCuentaFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentaflujocajaSessionBean=new CuentaFlujoCajaSessionBean();
		
		this.cuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentaflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarCuentaFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaFlujoCaja,this.jTtoolBarDetalleCuentaFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaFlujoCaja.add(this.jMenuItemDetalleCerrarCuentaFlujoCaja);
		
		this.jmenuDetalleAccionesCuentaFlujoCaja.add(this.jMenuItemActualizarCuentaFlujoCaja);
		this.jmenuDetalleAccionesCuentaFlujoCaja.add(this.jMenuItemEliminarCuentaFlujoCaja);
		this.jmenuDetalleAccionesCuentaFlujoCaja.add(this.jMenuItemCancelarCuentaFlujoCaja);		
		
		//this.jmenuDetalleDatosCuentaFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByCuentaFlujoCaja);				
		this.jmenuDetalleDatosCuentaFlujoCaja.add(this.jMenuItemDetalleMostarOcultarCuentaFlujoCaja);				
				
		//this.jmenuDetalleAccionesCuentaFlujoCaja.add(this.jMenuItemGuardarCambiosCuentaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuDetalleArchivoCuentaFlujoCaja);		
		this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuDetalleAccionesCuentaFlujoCaja);		
		this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuDetalleDatosCuentaFlujoCaja);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCuentaFlujoCaja.add(this.jmenuDetalleCuentaFlujoCaja);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposCuentaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaFlujoCaja = new JLabelMe();
		jLabelIdCuentaFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaFlujoCaja= new GridBagLayout();

		this.jPanelidCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);

		jLabelidCuentaFlujoCaja = new JLabel();
		jLabelidCuentaFlujoCaja.setText("Id");

		jLabelidCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreCuentaFlujoCaja = new JLabelMe();
		this.jLabelnombreCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCuentaFlujoCaja.setToolTipText("Nombre");
		this.jLabelnombreCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelnombreCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jTextAreanombreCuentaFlujoCaja= new JTextAreaMe();
		jTextAreanombreCuentaFlujoCaja.setEnabled(false);
		jTextAreanombreCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCuentaFlujoCaja.setLineWrap(true);
		jTextAreanombreCuentaFlujoCaja.setWrapStyleWord(true);
		jTextAreanombreCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCuentaFlujoCaja.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCuentaFlujoCaja = new JScrollPane(jTextAreanombreCuentaFlujoCaja);
		jscrollPanenombreCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonnombreCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonnombreCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCuentaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelformulaCuentaFlujoCaja = new JLabelMe();
		this.jLabelformulaCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA+" :");
		this.jLabelformulaCuentaFlujoCaja.setToolTipText("Formula");
		this.jLabelformulaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformulaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelformulaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelformulaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelformulaCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelformulaCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_FORMULA);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelformulaCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jTextAreaformulaCuentaFlujoCaja= new JTextAreaMe();
		jTextAreaformulaCuentaFlujoCaja.setEnabled(false);
		jTextAreaformulaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaformulaCuentaFlujoCaja.setLineWrap(true);
		jTextAreaformulaCuentaFlujoCaja.setWrapStyleWord(true);
		jTextAreaformulaCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaformulaCuentaFlujoCaja.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaformulaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneformulaCuentaFlujoCaja = new JScrollPane(jTextAreaformulaCuentaFlujoCaja);
		jscrollPaneformulaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneformulaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneformulaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonformulaCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonformulaCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformulaCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonformulaCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonformulaCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonformulaCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonformulaCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonformulaCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaformulaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaformulaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"formulaCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonformulaCuentaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabeles_flujo_cajaCuentaFlujoCaja = new JLabelMe();
		this.jLabeles_flujo_cajaCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA+" : *");
		this.jLabeles_flujo_cajaCuentaFlujoCaja.setToolTipText("Es Flujo Caja");
		this.jLabeles_flujo_cajaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_flujo_cajaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_flujo_cajaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_flujo_cajaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_flujo_cajaCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_flujo_cajaCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_ESFLUJOCAJA);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPaneles_flujo_cajaCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jCheckBoxes_flujo_cajaCuentaFlujoCaja= new JCheckBoxMe();
		jCheckBoxes_flujo_cajaCuentaFlujoCaja.setEnabled(false);

		jCheckBoxes_flujo_cajaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_flujo_cajaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_flujo_cajaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_flujo_cajaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setText("U");
		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_flujo_cajaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_flujo_cajaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_flujo_cajaCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_flujo_cajaCuentaFlujoCajaBusqueda.setVisible(false);		}


					
		this.jLabelcon_agruparCuentaFlujoCaja = new JLabelMe();
		this.jLabelcon_agruparCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR+" : *");
		this.jLabelcon_agruparCuentaFlujoCaja.setToolTipText("Con Agrupar");
		this.jLabelcon_agruparCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_agruparCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_agruparCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_agruparCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_agruparCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_agruparCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_CONAGRUPAR);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelcon_agruparCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jCheckBoxcon_agruparCuentaFlujoCaja= new JCheckBoxMe();
		jCheckBoxcon_agruparCuentaFlujoCaja.setEnabled(false);

		jCheckBoxcon_agruparCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_agruparCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_agruparCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_agruparCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_agruparCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setText("U");
		this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_agruparCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_agruparCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_agruparCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_agruparCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_agruparCuentaFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_empresaCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaFlujoCaja.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_empresaCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jComboBoxid_empresaCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_empresaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaFlujoCaja.setEnabled(false);

		this.jButtonid_empresaCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_empresaCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_empresaCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaFlujoCaja"));

		this.jButtonid_empresaCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_empresaCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_empresaCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaFlujoCajaUpdate"));



					
		this.jLabelid_mesCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_mesCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesCuentaFlujoCaja.setToolTipText("Mes");
		this.jLabelid_mesCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_mesCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jComboBoxid_mesCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_mesCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_mesCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_mesCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCuentaFlujoCaja"));

		this.jButtonid_mesCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_mesCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_mesCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_mesCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_mesCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_mesCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCuentaFlujoCajaUpdate"));



					
		this.jLabelid_diaCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_diaCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA+" : *");
		this.jLabelid_diaCuentaFlujoCaja.setToolTipText("Dia");
		this.jLabelid_diaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_diaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_diaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_diaCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_diaCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_IDDIA);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_diaCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jComboBoxid_diaCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_diaCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_diaCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_diaCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_diaCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_diaCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_diaCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_diaCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_diaCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_diaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaCuentaFlujoCaja"));

		this.jButtonid_diaCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_diaCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_diaCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_diaCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_diaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_diaCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_diaCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_diaCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_diaCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_diaCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_diaCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_diaCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_diaCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_diaCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_diaCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_diaCuentaFlujoCajaUpdate"));



					
		this.jLabelid_cuenta_contableCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaFlujoCaja.setText(""+CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCuentaFlujoCaja.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaFlujoCaja.setToolTipText(CuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaFlujoCaja.setLayout(this.gridaBagLayoutCuentaFlujoCaja);


		jComboBoxid_cuenta_contableCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaFlujoCaja"));

		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaFlujoCajaBusqueda"));

		if(this.cuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaFlujoCajaUpdate"));


		jButtonid_cuenta_contableCuentaFlujoCajaArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaFlujoCajaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaFlujoCajaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaFlujoCajaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaFlujoCajaArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaFlujoCajaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaFlujoCajaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaFlujoCajaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaFlujoCajaArbol"));



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
		//this.jInternalFrameDetalleCuentaFlujoCaja = new CuentaFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaFlujoCaja= new GridBagLayout();
		

		
		String sToolTipCuentaFlujoCaja="";
		sToolTipCuentaFlujoCaja=CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaFlujoCaja+="(Contabilidad.CuentaFlujoCaja)";
		}
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaFlujoCaja = new JButtonMe();
		this.jButtonModificarCuentaFlujoCaja = new JButtonMe();
        this.jButtonActualizarCuentaFlujoCaja = new JButtonMe();
        this.jButtonEliminarCuentaFlujoCaja = new JButtonMe();
        this.jButtonCancelarCuentaFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosCuentaFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarCuentaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosCuentaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Flujo Caja";
		
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaFlujoCaja.setName("jPanelCamposCuentaFlujoCaja"); 

		this.jPanelCamposOcultosCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaFlujoCaja.setName("jPanelCamposOcultosCuentaFlujoCaja"); 

        this.jPanelAccionesCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesCuentaFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaFlujoCaja.setText("Nuevo");
		this.jButtonModificarCuentaFlujoCaja.setText("Editar");
        this.jButtonActualizarCuentaFlujoCaja.setText("Actualizar");
        this.jButtonEliminarCuentaFlujoCaja.setText("Eliminar");
        this.jButtonCancelarCuentaFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.setText("Guardar");
		this.jButtonCerrarCuentaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaFlujoCaja,"nuevo_button","Nuevo",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaFlujoCaja,"modificar_button","Editar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaFlujoCaja,"actualizar_button","Actualizar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaFlujoCaja,"eliminar_button","Eliminar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaFlujoCaja,"cancelar_button","Cancelar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaFlujoCaja,"guardarcambios_button","Guardar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaFlujoCaja,"guardarcambiostabla_button","Guardar",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaFlujoCaja,"cerrar_button","Salir",this.cuentaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaFlujoCaja.setToolTipText("Nuevo"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaFlujoCaja.setToolTipText("Editar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaFlujoCaja.setToolTipText("Actualizar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaFlujoCaja.setToolTipText("Eliminar)"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaFlujoCaja.setToolTipText("Cancelar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaFlujoCaja.setToolTipText("Guardar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.setToolTipText("Guardar"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaFlujoCaja.setToolTipText("Salir"+" "+CuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaFlujoCaja";
		inputMap = this.jButtonNuevoCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaFlujoCaja";
		inputMap = this.jButtonActualizarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaFlujoCaja";
		inputMap = this.jButtonEliminarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaFlujoCaja";
		inputMap = this.jButtonCancelarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaFlujoCaja";
		inputMap = this.jButtonCerrarCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaFlujoCaja.setToolTipText("Nuevo CuentaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja.setToolTipText("Sin Cerrar Ventana CuentaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesCuentaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposCuentaFlujoCaja.setLayout(gridaBagLayoutCamposCuentaFlujoCaja);
		this.jPanelCamposOcultosCuentaFlujoCaja.setLayout(gridaBagLayoutCamposOcultosCuentaFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaFlujoCaja.add(jLabelIdCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaFlujoCaja.add(jLabelidCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaFlujoCaja.add(jLabelid_empresaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaFlujoCaja.add(jButtonid_empresaCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 3;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaFlujoCaja.add(jButtonid_empresaCuentaFlujoCajaUpdate, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaFlujoCaja.add(jComboBoxid_empresaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCuentaFlujoCaja.add(jLabelnombreCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCuentaFlujoCaja.add(jButtonnombreCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCuentaFlujoCaja.add(jscrollPanenombreCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesCuentaFlujoCaja.add(jLabelid_mesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesCuentaFlujoCaja.add(jButtonid_mesCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 3;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesCuentaFlujoCaja.add(jButtonid_mesCuentaFlujoCajaUpdate, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesCuentaFlujoCaja.add(jComboBoxid_mesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_diaCuentaFlujoCaja.add(jLabelid_diaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaCuentaFlujoCaja.add(jButtonid_diaCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 3;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_diaCuentaFlujoCaja.add(jButtonid_diaCuentaFlujoCajaUpdate, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_diaCuentaFlujoCaja.add(jComboBoxid_diaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaFlujoCaja.add(jLabelid_cuenta_contableCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaFlujoCaja.add(jButtonid_cuenta_contableCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 3;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaFlujoCaja.add(jButtonid_cuenta_contableCuentaFlujoCajaArbol, this.gridBagConstraintsCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 4;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaFlujoCaja.add(jButtonid_cuenta_contableCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 5;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaFlujoCaja.add(jButtonid_cuenta_contableCuentaFlujoCajaUpdate, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaFlujoCaja.add(jComboBoxid_cuenta_contableCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelformulaCuentaFlujoCaja.add(jLabelformulaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelformulaCuentaFlujoCaja.add(jButtonformulaCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelformulaCuentaFlujoCaja.add(jscrollPaneformulaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_flujo_cajaCuentaFlujoCaja.add(jLabeles_flujo_cajaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_flujo_cajaCuentaFlujoCaja.add(jButtones_flujo_cajaCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_flujo_cajaCuentaFlujoCaja.add(jCheckBoxes_flujo_cajaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_agruparCuentaFlujoCaja.add(jLabelcon_agruparCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_agruparCuentaFlujoCaja.add(jButtoncon_agruparCuentaFlujoCajaBusqueda, this.gridBagConstraintsCuentaFlujoCaja);
	}

	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_agruparCuentaFlujoCaja.add(jCheckBoxcon_agruparCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelidCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelnombreCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelid_mesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelid_diaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelid_cuenta_contableCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelformulaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPaneles_flujo_cajaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaFlujoCaja.add(this.jPanelcon_agruparCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposCuentaFlujoCaja % 1==0) {
		iXPanelCamposCuentaFlujoCaja=0;
		iYPanelCamposCuentaFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaFlujoCaja.gridy = iYPanelCamposOcultosCuentaFlujoCaja;
	this.gridBagConstraintsCuentaFlujoCaja.gridx = iXPanelCamposOcultosCuentaFlujoCaja++;
	this.gridBagConstraintsCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaFlujoCaja.add(this.jPanelid_empresaCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);



	if(iXPanelCamposOcultosCuentaFlujoCaja % 1==0) {
		iXPanelCamposOcultosCuentaFlujoCaja=0;
		iYPanelCamposOcultosCuentaFlujoCaja++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesCuentaFlujoCaja.setLayout(gridaBagLayoutAccionesCuentaFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioCuentaFlujoCaja);
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaFlujoCaja.add(this.jComboBoxTiposAccionesFormularioCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaFlujoCaja.add(this.jCheckBoxPostAccionNuevoCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaFlujoCaja.add(this.jCheckBoxPostAccionSinMensajeCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaFlujoCaja.add(this.jButtonModificarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);							

		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsCuentaFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaFlujoCaja.add(this.jButtonEliminarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
			
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaFlujoCaja.add(this.jButtonActualizarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);


		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaFlujoCaja.add(this.jButtonGuardarCambiosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);	
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaFlujoCaja.add(this.jButtonCancelarCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaFlujoCaja.gridx =0;
		this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaFlujoCaja = new CuentaFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Flujo Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Flujo Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Flujo Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaFlujoCajaModel cuentaflujocajaModel=new CuentaFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaFlujoCajaModel.CuentaFlujoCajaFocusTraversalPolicy cuentaflujocajaFocusTraversalPolicy = cuentaflujocajaModel.new CuentaFlujoCajaFocusTraversalPolicy(this);
			
			//cuentaflujocajaFocusTraversalPolicy.setcuentaflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentaflujocajaModel);
			
			
			this.jContentPaneDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutDetalleCuentaFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaFlujoCaja.add(jTtoolBarDetalleCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaFlujoCaja=   new JScrollPane(jContentPaneDetalleCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetalleCuentaFlujoCaja.add(jPanelCamposCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);
			
			
			
			
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
						&& cuentaflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleCuentaFlujoCaja(this.puedeCargarPorParteDetalleCuentaFlujoCaja,false,-1);
					
					if(this.cuentaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
						this.jContentPaneDetalleCuentaFlujoCaja.add(this.jTabbedPaneRelacionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaFlujoCaja.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleCuentaFlujoCaja(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsCuentaFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaFlujoCaja.add(jPanelCamposOcultosCuentaFlujoCaja, gridBagConstraintsCuentaFlujoCaja);
				
					this.jPanelCamposOcultosCuentaFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	        this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaFlujoCaja.add(this.jPanelAccionesFormularioCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);							
			
			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaFlujoCaja.add(this.jPanelAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaFlujoCaja=   new JScrollPane(this.jPanelCamposCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
			this.gridBagConstraintsCuentaFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);			
			
			this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
			
			
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		
			
		this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsCuentaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaFlujoCaja, this.gridBagConstraintsCuentaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaFlujoCaja;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleCuentaFlujoCaja(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(false);
		this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(true);

		this.detallecuentaflujocajaBeanSwingJInternalFrame=null;//new DetalleCuentaFlujoCajaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallecuentaflujocajaBeanSwingJInternalFramePopup=new DetalleCuentaFlujoCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallecuentaflujocajaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {

				DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(true);

				this.detallecuentaflujocajaBeanSwingJInternalFrame=new DetalleCuentaFlujoCajaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallecuentaflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallecuentaflujocajaBeanSwingJInternalFrame.setdetallecuentaflujocajaSessionBean(this.detallecuentaflujocajaSessionBean);

				//this.gridBagConstraintsCuentaFlujoCaja = new GridBagConstraints();
				//this.gridBagConstraintsCuentaFlujoCaja.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCuentaFlujoCaja.gridx = 0;
				//this.jContentPaneDetalleCuentaFlujoCaja.add(this.detallecuentaflujocajaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCuentaFlujoCaja);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCuentaFlujoCaja.add("Detalle Cuenta Flujo Cajas",this.detallecuentaflujocajaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCuentaFlujoCaja.setComponentAt(iIndexTab,this.detallecuentaflujocajaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(false);
				this.detallecuentaflujocajaBeanSwingJInternalFrame=null;//new DetalleCuentaFlujoCajaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleCuentaFlujoCaja) {
					this.jTabbedPaneRelacionesCuentaFlujoCaja.add("Detalle Cuenta Flujo Cajas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleCuentaFlujoCajaBeanSwingJInternalFrame(List<CuentaFlujoCaja> cuentaflujocajas,CuentaFlujoCaja cuentaflujocaja,DetalleCuentaFlujoCajaBeanSwingJInternalFrame detallecuentaflujocajaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallecuentaflujocajaBeanSwingJInternalFrame=new DetalleCuentaFlujoCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallecuentaflujocajaBeanSwingJInternalFrame.getDetalleCuentaFlujoCajaLogic().setConnexion(this.cuentaflujocajaLogic.getConnexion());

					detallecuentaflujocajaBeanSwingJInternalFrame.setcuentaflujocajasForeignKey(cuentaflujocajas);
					detallecuentaflujocajaBeanSwingJInternalFrame.setcuentaflujocajaForeignKey(cuentaflujocaja);
					detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionCuentaFlujoCaja(true);
					detallecuentaflujocajaBeanSwingJInternalFrame.detallecuentaflujocajaSessionBean.setlidCuentaFlujoCajaActual(cuentaflujocaja.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallecuentaflujocajaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleCuentaFlujoCaja(detallecuentaflujocajaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallecuentaflujocajaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCuentaFlujoCaja(true);
					detallecuentaflujocajaBeanSwingJInternalFrame.setid_cuenta_flujo_cajaFK_IdCuentaFlujoCaja(cuentaflujocaja.getId());

					if(!this.conCargarFormDetalle) {
						detallecuentaflujocajaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallecuentaflujocajaBeanSwingJInternalFrame.setSelectedItemCombosFrameCuentaFlujoCajaForeignKey(cuentaflujocaja,1,false,true,true);
					detallecuentaflujocajaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallecuentaflujocajaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCuentaFlujoCaja");
					detallecuentaflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCuentaFlujoCaja");
					detallecuentaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCuentaFlujoCaja(true);
					detallecuentaflujocajaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleCuentaFlujoCaja("n",detallecuentaflujocajaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallecuentaflujocajaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallecuentaflujocajaBeanSwingJInternalFrame.setAutoscrolls(true);
					detallecuentaflujocajaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallecuentaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCuentaFlujoCaja("relacionado");
					} else {
						detallecuentaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCuentaFlujoCaja("no_relacionado");
					}

					detallecuentaflujocajaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleCuentaFlujoCaja().setVisible(false);

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
