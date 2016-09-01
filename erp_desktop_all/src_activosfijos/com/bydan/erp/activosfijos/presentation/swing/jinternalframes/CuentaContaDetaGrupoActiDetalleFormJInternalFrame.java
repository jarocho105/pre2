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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.CuentaContaDetaGrupoActiConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class CuentaContaDetaGrupoActiDetalleFormJInternalFrame extends CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaContaDetaGrupoActi;
	
	protected JMenuBar jmenuBarDetalleCuentaContaDetaGrupoActi;
	
	protected JMenu jmenuDetalleCuentaContaDetaGrupoActi;
	protected JMenu jmenuDetalleArchivoCuentaContaDetaGrupoActi;
	protected JMenu jmenuDetalleAccionesCuentaContaDetaGrupoActi;
	protected JMenu jmenuDetalleDatosCuentaContaDetaGrupoActi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContaDetaGrupoActi;	
	protected GridBagConstraints gridBagConstraintsCuentaContaDetaGrupoActi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaContaDetaGrupoActi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallegrupoactivofijo="";
	
	public CuentaContaDetaGrupoActiSessionBean cuentacontadetagrupoactiSessionBean;
	
	
	
	
	public CuentaContableSessionBean cuentacontableSessionBean;
	public DetalleGrupoActivoFijoSessionBean detallegrupoactivofijoSessionBean;	
	
	public CuentaContaDetaGrupoActiLogic cuentacontadetagrupoactiLogic;
	
	public JScrollPane jScrollPanelDatosCuentaContaDetaGrupoActi;
	public JScrollPane jScrollPanelDatosEdicionCuentaContaDetaGrupoActi;
	public JScrollPane jScrollPanelDatosGeneralCuentaContaDetaGrupoActi;
	
	protected JPanel jPanelCamposCuentaContaDetaGrupoActi;    
	protected JPanel jPanelCamposOcultosCuentaContaDetaGrupoActi;    	
	protected JPanel jPanelAccionesCuentaContaDetaGrupoActi;
	protected JPanel jPanelAccionesFormularioCuentaContaDetaGrupoActi;
    
	
	
	protected Integer iXPanelCamposCuentaContaDetaGrupoActi=0;
	protected Integer iYPanelCamposCuentaContaDetaGrupoActi=0;
	
	protected Integer iXPanelCamposOcultosCuentaContaDetaGrupoActi=0;
	protected Integer iYPanelCamposOcultosCuentaContaDetaGrupoActi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaContaDetaGrupoActi;
	public JButton jButtonModificarCuentaContaDetaGrupoActi;
	public JButton jButtonActualizarCuentaContaDetaGrupoActi;
    public JButton jButtonEliminarCuentaContaDetaGrupoActi;
	public JButton jButtonCancelarCuentaContaDetaGrupoActi;
    public JButton jButtonGuardarCambiosCuentaContaDetaGrupoActi;
	public JButton jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi;
	protected JButton jButtonCerrarCuentaContaDetaGrupoActi;
	
	
	protected JButton jButtonProcesarInformacionCuentaContaDetaGrupoActi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonModificarToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonActualizarToolBarCuentaContaDetaGrupoActi;
    protected JButton jButtonEliminarToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonCancelarToolBarCuentaContaDetaGrupoActi;
    protected JButton jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContaDetaGrupoActi;
	protected JButton jButtonCerrarToolBarCuentaContaDetaGrupoActi;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaContaDetaGrupoActi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemModificarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemActualizarCuentaContaDetaGrupoActi;
    protected JMenuItem jMenuItemEliminarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemCancelarCuentaContaDetaGrupoActi;
    protected JMenuItem jMenuItemGuardarCambiosCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemCerrarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContaDetaGrupoActi;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContaDetaGrupoActi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaContaDetaGrupoActi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContaDetaGrupoActi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaContaDetaGrupoActi;
	public JLabel jLabelIdCuentaContaDetaGrupoActi;
	public JLabel jLabelidCuentaContaDetaGrupoActi;
	public JButton jButtonidCuentaContaDetaGrupoActiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableCuentaContaDetaGrupoActi;
	public JLabel jLabelid_cuenta_contableCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi;
	public JButton jButtonid_cuenta_contableCuentaContaDetaGrupoActi= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol= new JButtonMe();

	public JPanel jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi;
	public JLabel jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi;
	public JButton jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate= new JButtonMe();
	public JButton jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaContaDetaGrupoActi;
	
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
	public int iHeightFormulario=242;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaContaDetaGrupoActi=new JPanel();
				this.jPanelAccionesFormularioCuentaContaDetaGrupoActi=new JPanel();
				this.jmenuBarDetalleCuentaContaDetaGrupoActi=new JMenuBar();
				this.jTtoolBarDetalleCuentaContaDetaGrupoActi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaDetaGrupoActiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContaDetaGrupoActi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaContaDetaGrupoActi() {
		return this.jButtonActualizarToolBarCuentaContaDetaGrupoActi;
	}
	
	public JButton getjButtonEliminarToolBarCuentaContaDetaGrupoActi() {
		return this.jButtonEliminarToolBarCuentaContaDetaGrupoActi;
	}
	
	public JButton getjButtonCancelarToolBarCuentaContaDetaGrupoActi() {
		return this.jButtonCancelarToolBarCuentaContaDetaGrupoActi;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaContaDetaGrupoActi() {
		return this.jButtonProcesarInformacionCuentaContaDetaGrupoActi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContaDetaGrupoActi)	{
		this.jButtonProcesarInformacionCuentaContaDetaGrupoActi = jButtonProcesarInformacionCuentaContaDetaGrupoActi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposRelacionesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposRelacionesCuentaContaDetaGrupoActi = jComboBoxTiposRelacionesCuentaContaDetaGrupoActi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposAccionesCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi = jComboBoxTiposAccionesCuentaContaDetaGrupoActi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi() {
		return this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi(
			JComboBox jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi) {
		this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi = jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentacontadetagrupoactiSessionBean=new CuentaContaDetaGrupoActiSessionBean();
		
		this.cuentacontadetagrupoactiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontadetagrupoactiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContaDetaGrupoActiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContaDetaGrupoActiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Conta Deta Grupo Acti MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaContaDetaGrupoActiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaContaDetaGrupoActi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaContaDetaGrupoActi=new JButtonMe();
				this.jButtonModificarToolBarCuentaContaDetaGrupoActi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaContaDetaGrupoActi,this.jTtoolBarDetalleCuentaContaDetaGrupoActi,
							"actualizar","actualizar","Actualizar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaContaDetaGrupoActi,this.jTtoolBarDetalleCuentaContaDetaGrupoActi,
							"eliminar","eliminar","Eliminar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaContaDetaGrupoActi,this.jTtoolBarDetalleCuentaContaDetaGrupoActi,
							"cancelar","cancelar","Cancelar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaContaDetaGrupoActi,this.jTtoolBarDetalleCuentaContaDetaGrupoActi,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaContaDetaGrupoActi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaContaDetaGrupoActi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaContaDetaGrupoActi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaContaDetaGrupoActi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaContaDetaGrupoActi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContaDetaGrupoActi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContaDetaGrupoActi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContaDetaGrupoActi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaContaDetaGrupoActi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaContaDetaGrupoActi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaContaDetaGrupoActi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaContaDetaGrupoActi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaContaDetaGrupoActi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaContaDetaGrupoActi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaContaDetaGrupoActi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaContaDetaGrupoActi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaContaDetaGrupoActi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaContaDetaGrupoActi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaContaDetaGrupoActi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaContaDetaGrupoActi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContaDetaGrupoActi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContaDetaGrupoActi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContaDetaGrupoActi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaContaDetaGrupoActi.add(this.jMenuItemDetalleCerrarCuentaContaDetaGrupoActi);
		
		this.jmenuDetalleAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemActualizarCuentaContaDetaGrupoActi);
		this.jmenuDetalleAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemEliminarCuentaContaDetaGrupoActi);
		this.jmenuDetalleAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemCancelarCuentaContaDetaGrupoActi);		
		
		//this.jmenuDetalleDatosCuentaContaDetaGrupoActi.add(this.jMenuItemDetalleAbrirOrderByCuentaContaDetaGrupoActi);				
		this.jmenuDetalleDatosCuentaContaDetaGrupoActi.add(this.jMenuItemDetalleMostarOcultarCuentaContaDetaGrupoActi);				
				
		//this.jmenuDetalleAccionesCuentaContaDetaGrupoActi.add(this.jMenuItemGuardarCambiosCuentaContaDetaGrupoActi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaContaDetaGrupoActi.add(this.jmenuDetalleArchivoCuentaContaDetaGrupoActi);		
		this.jmenuBarDetalleCuentaContaDetaGrupoActi.add(this.jmenuDetalleAccionesCuentaContaDetaGrupoActi);		
		this.jmenuBarDetalleCuentaContaDetaGrupoActi.add(this.jmenuDetalleDatosCuentaContaDetaGrupoActi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaContaDetaGrupoActi);				
	}
	
	
	public void inicializarElementosCamposCuentaContaDetaGrupoActi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaContaDetaGrupoActi = new JLabelMe();
		jLabelIdCuentaContaDetaGrupoActi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaContaDetaGrupoActi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaContaDetaGrupoActi.setToolTipText(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaContaDetaGrupoActi= new GridBagLayout();

		this.jPanelidCuentaContaDetaGrupoActi.setLayout(this.gridaBagLayoutCuentaContaDetaGrupoActi);

		jLabelidCuentaContaDetaGrupoActi = new JLabel();
		jLabelidCuentaContaDetaGrupoActi.setText("Id");

		jLabelidCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysCuentaContaDetaGrupoActi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_cuenta_contableCuentaContaDetaGrupoActi = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaContaDetaGrupoActi.setText(""+CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCuentaContaDetaGrupoActi.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.setToolTipText(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaContaDetaGrupoActi = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.setLayout(this.gridaBagLayoutCuentaContaDetaGrupoActi);


		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaDetaGrupoActi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaDetaGrupoActi"));

		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaDetaGrupoActiBusqueda"));

		if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaDetaGrupoActiUpdate"));


		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaDetaGrupoActiArbol"));



					
		this.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi = new JLabelMe();
		this.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setText(""+CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO+" : *");
		this.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setToolTipText("Detalle Grupo Activo Fijo");
		this.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setToolTipText(CuentaContaDetaGrupoActiConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		this.gridaBagLayoutCuentaContaDetaGrupoActi = new GridBagLayout();
		this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setLayout(this.gridaBagLayoutCuentaContaDetaGrupoActi);


		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi= new JComboBoxMe();
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setText("Buscar");
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi"));

		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda"));

		if(this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda.setVisible(false);		}

		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate= new JButtonMe();
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.setText("U");
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate"));



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
		//this.jInternalFrameDetalleCuentaContaDetaGrupoActi = new CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Conta Deta Grupo Acti DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContaDetaGrupoActi= new GridBagLayout();
		

		
		String sToolTipCuentaContaDetaGrupoActi="";
		sToolTipCuentaContaDetaGrupoActi=CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContaDetaGrupoActi+="(ActivosFijos.CuentaContaDetaGrupoActi)";
		}
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContaDetaGrupoActi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonModificarCuentaContaDetaGrupoActi = new JButtonMe();
        this.jButtonActualizarCuentaContaDetaGrupoActi = new JButtonMe();
        this.jButtonEliminarCuentaContaDetaGrupoActi = new JButtonMe();
        this.jButtonCancelarCuentaContaDetaGrupoActi = new JButtonMe();
        this.jButtonGuardarCambiosCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi = new JButtonMe();
		this.jButtonCerrarCuentaContaDetaGrupoActi = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContaDetaGrupoActi = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Conta Deta Grupo Acti";
		
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Deta Grupo Actis" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContaDetaGrupoActi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaContaDetaGrupoActi.setName("jPanelCamposCuentaContaDetaGrupoActi"); 

		this.jPanelCamposOcultosCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaContaDetaGrupoActi.setName("jPanelCamposOcultosCuentaContaDetaGrupoActi"); 

        this.jPanelAccionesCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContaDetaGrupoActi.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContaDetaGrupoActi.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaContaDetaGrupoActi.setText("Nuevo");
		this.jButtonModificarCuentaContaDetaGrupoActi.setText("Editar");
        this.jButtonActualizarCuentaContaDetaGrupoActi.setText("Actualizar");
        this.jButtonEliminarCuentaContaDetaGrupoActi.setText("Eliminar");
        this.jButtonCancelarCuentaContaDetaGrupoActi.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaContaDetaGrupoActi.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.setText("Guardar");
		this.jButtonCerrarCuentaContaDetaGrupoActi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContaDetaGrupoActi,"nuevo_button","Nuevo",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaContaDetaGrupoActi,"modificar_button","Editar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaContaDetaGrupoActi,"actualizar_button","Actualizar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaContaDetaGrupoActi,"eliminar_button","Eliminar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaContaDetaGrupoActi,"cancelar_button","Cancelar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaContaDetaGrupoActi,"guardarcambios_button","Guardar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi,"guardarcambiostabla_button","Guardar",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContaDetaGrupoActi,"cerrar_button","Salir",this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaContaDetaGrupoActi.setToolTipText("Nuevo"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaContaDetaGrupoActi.setToolTipText("Editar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaContaDetaGrupoActi.setToolTipText("Actualizar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaContaDetaGrupoActi.setToolTipText("Eliminar)"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaContaDetaGrupoActi.setToolTipText("Cancelar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaContaDetaGrupoActi.setToolTipText("Guardar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.setToolTipText("Guardar"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContaDetaGrupoActi.setToolTipText("Salir"+" "+CuentaContaDetaGrupoActiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContaDetaGrupoActi";
		inputMap = this.jButtonNuevoCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContaDetaGrupoActi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContaDetaGrupoActi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonActualizarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaContaDetaGrupoActi"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonEliminarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaContaDetaGrupoActi"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonCancelarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaContaDetaGrupoActi"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaContaDetaGrupoActi";
		inputMap = this.jButtonCerrarCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContaDetaGrupoActi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContaDetaGrupoActi";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContaDetaGrupoActi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContaDetaGrupoActi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi.setToolTipText("Nuevo CuentaContaDetaGrupoActi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi.setToolTipText("Sin Cerrar Ventana CuentaContaDetaGrupoActi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaContaDetaGrupoActi = new JLabelMe();
		
		this.jLabelAccionesCuentaContaDetaGrupoActi.setText("Acciones");		
		this.jLabelAccionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaContaDetaGrupoActi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaContaDetaGrupoActi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaContaDetaGrupoActi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaContaDetaGrupoActi = new GridBagLayout();
		
		this.jPanelCamposCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutCamposCuentaContaDetaGrupoActi);
		this.jPanelCamposOcultosCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutCamposOcultosCuentaContaDetaGrupoActi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaContaDetaGrupoActi.add(jLabelIdCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);



	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 1;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaContaDetaGrupoActi.add(jLabelidCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);


	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.add(jLabelid_cuenta_contableCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 2;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.add(jButtonid_cuenta_contableCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 3;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.add(jButtonid_cuenta_contableCuentaContaDetaGrupoActiArbol, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 4;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.add(jButtonid_cuenta_contableCuentaContaDetaGrupoActiBusqueda, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 5;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.add(jButtonid_cuenta_contableCuentaContaDetaGrupoActiUpdate, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	}

	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 1;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi.add(jComboBoxid_cuenta_contableCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);


	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.add(jLabelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 2;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.add(jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiBusqueda, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 3;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.add(jButtonid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActiUpdate, this.gridBagConstraintsCuentaContaDetaGrupoActi);
	}

	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 1;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi.add(jComboBoxid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iYPanelCamposCuentaContaDetaGrupoActi;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iXPanelCamposCuentaContaDetaGrupoActi++;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContaDetaGrupoActi.add(this.jPanelidCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);



	if(iXPanelCamposCuentaContaDetaGrupoActi % 1==0) {
		iXPanelCamposCuentaContaDetaGrupoActi=0;
		iYPanelCamposCuentaContaDetaGrupoActi++;
	}
	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iYPanelCamposCuentaContaDetaGrupoActi;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iXPanelCamposCuentaContaDetaGrupoActi++;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContaDetaGrupoActi.add(this.jPanelid_cuenta_contableCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);



	if(iXPanelCamposCuentaContaDetaGrupoActi % 1==0) {
		iXPanelCamposCuentaContaDetaGrupoActi=0;
		iYPanelCamposCuentaContaDetaGrupoActi++;
	}
	this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iYPanelCamposCuentaContaDetaGrupoActi;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iXPanelCamposCuentaContaDetaGrupoActi++;
	this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContaDetaGrupoActi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContaDetaGrupoActi.add(this.jPanelid_detalle_grupo_activo_fijoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);



	if(iXPanelCamposCuentaContaDetaGrupoActi % 1==0) {
		iXPanelCamposCuentaContaDetaGrupoActi=0;
		iYPanelCamposCuentaContaDetaGrupoActi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaContaDetaGrupoActi= new GridBagLayout();
		this.jPanelAccionesCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutAccionesCuentaContaDetaGrupoActi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaContaDetaGrupoActi= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutAccionesFormularioCuentaContaDetaGrupoActi);
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.add(this.jComboBoxTiposAccionesFormularioCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.add(this.jCheckBoxPostAccionNuevoCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.add(this.jCheckBoxPostAccionSinCerrarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentacontadetagrupoactiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContaDetaGrupoActi.add(this.jCheckBoxPostAccionSinMensajeCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaContaDetaGrupoActi.add(this.jButtonModificarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);							

		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaContaDetaGrupoActi.add(this.jButtonEliminarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
			
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContaDetaGrupoActi.add(this.jButtonActualizarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);


		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContaDetaGrupoActi.add(this.jButtonGuardarCambiosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);	
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = 0;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaContaDetaGrupoActi.add(this.jButtonCancelarCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContaDetaGrupoActi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContaDetaGrupoActi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontadetagrupoactiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;		
			//this.gridBagConstraintsCuentaContaDetaGrupoActi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContaDetaGrupoActi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =0;
		this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContaDetaGrupoActi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaContaDetaGrupoActiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaContaDetaGrupoActi = new CuentaContaDetaGrupoActiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Conta Deta Grupo Acti DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Conta Deta Grupo Acti DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Conta Deta Grupo Acti Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaContaDetaGrupoActiModel cuentacontadetagrupoactiModel=new CuentaContaDetaGrupoActiModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaContaDetaGrupoActiModel.CuentaContaDetaGrupoActiFocusTraversalPolicy cuentacontadetagrupoactiFocusTraversalPolicy = cuentacontadetagrupoactiModel.new CuentaContaDetaGrupoActiFocusTraversalPolicy(this);
			
			//cuentacontadetagrupoactiFocusTraversalPolicy.setcuentacontadetagrupoactiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentacontadetagrupoactiModel);
			
			
			this.jContentPaneDetalleCuentaContaDetaGrupoActi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaContaDetaGrupoActi = new GridBagLayout();	
			this.jContentPaneDetalleCuentaContaDetaGrupoActi.setLayout(gridaBagLayoutDetalleCuentaContaDetaGrupoActi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContaDetaGrupoActi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
				this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaContaDetaGrupoActi.add(jTtoolBarDetalleCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi=   new JScrollPane(jContentPaneDetalleCuentaContaDetaGrupoActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
	        
			this.jContentPaneDetalleCuentaContaDetaGrupoActi.add(jPanelCamposCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);
			
			
			
			
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
						&& cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentacontadetagrupoactiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaContaDetaGrupoActi= new GridBagConstraints();
						this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
						this.jContentPaneDetalleCuentaContaDetaGrupoActi.add(this.jTabbedPaneRelacionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaContaDetaGrupoActi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaContaDetaGrupoActi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
					this.gridBagConstraintsCuentaContaDetaGrupoActi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaContaDetaGrupoActi.add(jPanelCamposOcultosCuentaContaDetaGrupoActi, gridBagConstraintsCuentaContaDetaGrupoActi);
				
					this.jPanelCamposOcultosCuentaContaDetaGrupoActi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
	        this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaContaDetaGrupoActi.add(this.jPanelAccionesFormularioCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);							
			
			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
	        this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaContaDetaGrupoActi.add(this.jPanelAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaContaDetaGrupoActi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi=   new JScrollPane(this.jPanelCamposCuentaContaDetaGrupoActi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaContaDetaGrupoActi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);			
			
			this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
			
			
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		
			
		this.gridBagConstraintsCuentaContaDetaGrupoActi = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaDetaGrupoActi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContaDetaGrupoActi, this.gridBagConstraintsCuentaContaDetaGrupoActi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaContaDetaGrupoActi;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaContaDetaGrupoActi;
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
