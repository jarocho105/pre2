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
import com.bydan.erp.activosfijos.util.CuentaContaGastoDepreConstantesFunciones;

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
public class CuentaContaGastoDepreDetalleFormJInternalFrame extends CuentaContaGastoDepreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaContaGastoDepre;
	
	protected JMenuBar jmenuBarDetalleCuentaContaGastoDepre;
	
	protected JMenu jmenuDetalleCuentaContaGastoDepre;
	protected JMenu jmenuDetalleArchivoCuentaContaGastoDepre;
	protected JMenu jmenuDetalleAccionesCuentaContaGastoDepre;
	protected JMenu jmenuDetalleDatosCuentaContaGastoDepre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaContaGastoDepre;	
	protected GridBagConstraints gridBagConstraintsCuentaContaGastoDepre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaContaGastoDepreBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaContaGastoDepre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected GastoDepreciacionBeanSwingJInternalFrame gastodepreciacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_gastodepreciacion="";
	
	public CuentaContaGastoDepreSessionBean cuentacontagastodepreSessionBean;
	
	
	
	
	public CuentaContableSessionBean cuentacontableSessionBean;
	public GastoDepreciacionSessionBean gastodepreciacionSessionBean;	
	
	public CuentaContaGastoDepreLogic cuentacontagastodepreLogic;
	
	public JScrollPane jScrollPanelDatosCuentaContaGastoDepre;
	public JScrollPane jScrollPanelDatosEdicionCuentaContaGastoDepre;
	public JScrollPane jScrollPanelDatosGeneralCuentaContaGastoDepre;
	
	protected JPanel jPanelCamposCuentaContaGastoDepre;    
	protected JPanel jPanelCamposOcultosCuentaContaGastoDepre;    	
	protected JPanel jPanelAccionesCuentaContaGastoDepre;
	protected JPanel jPanelAccionesFormularioCuentaContaGastoDepre;
    
	
	
	protected Integer iXPanelCamposCuentaContaGastoDepre=0;
	protected Integer iYPanelCamposCuentaContaGastoDepre=0;
	
	protected Integer iXPanelCamposOcultosCuentaContaGastoDepre=0;
	protected Integer iYPanelCamposOcultosCuentaContaGastoDepre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaContaGastoDepre;
	public JButton jButtonModificarCuentaContaGastoDepre;
	public JButton jButtonActualizarCuentaContaGastoDepre;
    public JButton jButtonEliminarCuentaContaGastoDepre;
	public JButton jButtonCancelarCuentaContaGastoDepre;
    public JButton jButtonGuardarCambiosCuentaContaGastoDepre;
	public JButton jButtonGuardarCambiosTablaCuentaContaGastoDepre;
	protected JButton jButtonCerrarCuentaContaGastoDepre;
	
	
	protected JButton jButtonProcesarInformacionCuentaContaGastoDepre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaContaGastoDepre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaContaGastoDepre;
	protected JButton jButtonModificarToolBarCuentaContaGastoDepre;
	protected JButton jButtonActualizarToolBarCuentaContaGastoDepre;
    protected JButton jButtonEliminarToolBarCuentaContaGastoDepre;
	protected JButton jButtonCancelarToolBarCuentaContaGastoDepre;
    protected JButton jButtonGuardarCambiosToolBarCuentaContaGastoDepre;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaContaGastoDepre;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaContaGastoDepre;
	protected JButton jButtonCerrarToolBarCuentaContaGastoDepre;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaContaGastoDepre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaContaGastoDepre;
	protected JMenuItem jMenuItemModificarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemActualizarCuentaContaGastoDepre;
    protected JMenuItem jMenuItemEliminarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemCancelarCuentaContaGastoDepre;
    protected JMenuItem jMenuItemGuardarCambiosCuentaContaGastoDepre;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaContaGastoDepre;
	protected JMenuItem jMenuItemCerrarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemDetalleCerrarCuentaContaGastoDepre;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaContaGastoDepre;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaContaGastoDepre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaContaGastoDepre;
	protected JMenuItem jMenuItemMostrarOcultarCuentaContaGastoDepre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaContaGastoDepre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaContaGastoDepre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaContaGastoDepre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaContaGastoDepre;
	public JLabel jLabelIdCuentaContaGastoDepre;
	public JLabel jLabelidCuentaContaGastoDepre;
	public JButton jButtonidCuentaContaGastoDepreBusqueda= new JButtonMe();

	
	public JPanel jPanelid_cuenta_contableCuentaContaGastoDepre;
	public JLabel jLabelid_cuenta_contableCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaContaGastoDepre;
	public JButton jButtonid_cuenta_contableCuentaContaGastoDepre= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContaGastoDepreUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaContaGastoDepreArbol= new JButtonMe();

	public JPanel jPanelid_gasto_depreciacionCuentaContaGastoDepre;
	public JLabel jLabelid_gasto_depreciacionCuentaContaGastoDepre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_gasto_depreciacionCuentaContaGastoDepre;
	public JButton jButtonid_gasto_depreciacionCuentaContaGastoDepre= new JButtonMe();
	public JButton jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate= new JButtonMe();
	public JButton jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaContaGastoDepre;
	
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
	
	public CuentaContaGastoDepreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaContaGastoDepre=new JPanel();
				this.jPanelAccionesFormularioCuentaContaGastoDepre=new JPanel();
				this.jmenuBarDetalleCuentaContaGastoDepre=new JMenuBar();
				this.jTtoolBarDetalleCuentaContaGastoDepre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaContaGastoDepreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaContaGastoDepreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaContaGastoDepre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaContaGastoDepre() {
		return this.jButtonActualizarToolBarCuentaContaGastoDepre;
	}
	
	public JButton getjButtonEliminarToolBarCuentaContaGastoDepre() {
		return this.jButtonEliminarToolBarCuentaContaGastoDepre;
	}
	
	public JButton getjButtonCancelarToolBarCuentaContaGastoDepre() {
		return this.jButtonCancelarToolBarCuentaContaGastoDepre;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaContaGastoDepre() {
		return this.jButtonProcesarInformacionCuentaContaGastoDepre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaContaGastoDepre)	{
		this.jButtonProcesarInformacionCuentaContaGastoDepre = jButtonProcesarInformacionCuentaContaGastoDepre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaContaGastoDepre() {
		return this.jComboBoxTiposAccionesCuentaContaGastoDepre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposRelacionesCuentaContaGastoDepre) {
		this.jComboBoxTiposRelacionesCuentaContaGastoDepre = jComboBoxTiposRelacionesCuentaContaGastoDepre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaContaGastoDepre(
			JComboBox jComboBoxTiposAccionesCuentaContaGastoDepre) {
		this.jComboBoxTiposAccionesCuentaContaGastoDepre = jComboBoxTiposAccionesCuentaContaGastoDepre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaContaGastoDepre() {
		return this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaContaGastoDepre(
			JComboBox jComboBoxTiposAccionesFormularioCuentaContaGastoDepre) {
		this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre = jComboBoxTiposAccionesFormularioCuentaContaGastoDepre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
		
		this.cuentacontagastodepreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaContaGastoDepreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaContaGastoDepreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Conta Gasto Depre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaContaGastoDepre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaContaGastoDepre=new JButtonMe();
				this.jButtonModificarToolBarCuentaContaGastoDepre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaContaGastoDepre,this.jTtoolBarDetalleCuentaContaGastoDepre,
							"actualizar","actualizar","Actualizar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaContaGastoDepre,this.jTtoolBarDetalleCuentaContaGastoDepre,
							"eliminar","eliminar","Eliminar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaContaGastoDepre,this.jTtoolBarDetalleCuentaContaGastoDepre,
							"cancelar","cancelar","Cancelar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaContaGastoDepre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaContaGastoDepre,this.jTtoolBarDetalleCuentaContaGastoDepre,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaContaGastoDepre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaContaGastoDepre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaContaGastoDepre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaContaGastoDepre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaContaGastoDepre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaContaGastoDepre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaContaGastoDepre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaContaGastoDepre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaContaGastoDepre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaContaGastoDepre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaContaGastoDepre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaContaGastoDepre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaContaGastoDepre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaContaGastoDepre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaContaGastoDepre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaContaGastoDepre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaContaGastoDepre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaContaGastoDepre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaContaGastoDepre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaContaGastoDepre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaContaGastoDepre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaContaGastoDepre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaContaGastoDepre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaContaGastoDepre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaContaGastoDepre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaContaGastoDepre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaContaGastoDepre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaContaGastoDepre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaContaGastoDepre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaContaGastoDepre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaContaGastoDepre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaContaGastoDepre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaContaGastoDepre.add(this.jMenuItemDetalleCerrarCuentaContaGastoDepre);
		
		this.jmenuDetalleAccionesCuentaContaGastoDepre.add(this.jMenuItemActualizarCuentaContaGastoDepre);
		this.jmenuDetalleAccionesCuentaContaGastoDepre.add(this.jMenuItemEliminarCuentaContaGastoDepre);
		this.jmenuDetalleAccionesCuentaContaGastoDepre.add(this.jMenuItemCancelarCuentaContaGastoDepre);		
		
		//this.jmenuDetalleDatosCuentaContaGastoDepre.add(this.jMenuItemDetalleAbrirOrderByCuentaContaGastoDepre);				
		this.jmenuDetalleDatosCuentaContaGastoDepre.add(this.jMenuItemDetalleMostarOcultarCuentaContaGastoDepre);				
				
		//this.jmenuDetalleAccionesCuentaContaGastoDepre.add(this.jMenuItemGuardarCambiosCuentaContaGastoDepre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaContaGastoDepre.add(this.jmenuDetalleArchivoCuentaContaGastoDepre);		
		this.jmenuBarDetalleCuentaContaGastoDepre.add(this.jmenuDetalleAccionesCuentaContaGastoDepre);		
		this.jmenuBarDetalleCuentaContaGastoDepre.add(this.jmenuDetalleDatosCuentaContaGastoDepre);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaContaGastoDepre);				
	}
	
	
	public void inicializarElementosCamposCuentaContaGastoDepre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaContaGastoDepre = new JLabelMe();
		jLabelIdCuentaContaGastoDepre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaContaGastoDepre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaContaGastoDepre.setToolTipText(CuentaContaGastoDepreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaContaGastoDepre= new GridBagLayout();

		this.jPanelidCuentaContaGastoDepre.setLayout(this.gridaBagLayoutCuentaContaGastoDepre);

		jLabelidCuentaContaGastoDepre = new JLabel();
		jLabelidCuentaContaGastoDepre.setText("Id");

		jLabelidCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysCuentaContaGastoDepre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_cuenta_contableCuentaContaGastoDepre = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaContaGastoDepre.setText(""+CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCuentaContaGastoDepre.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaContaGastoDepre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaContaGastoDepre.setToolTipText(CuentaContaGastoDepreConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaContaGastoDepre = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaContaGastoDepre.setLayout(this.gridaBagLayoutCuentaContaGastoDepre);


		jComboBoxid_cuenta_contableCuentaContaGastoDepre= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaContaGastoDepre= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContaGastoDepre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContaGastoDepre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContaGastoDepre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaContaGastoDepre.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaContaGastoDepre.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaContaGastoDepre.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaGastoDepre,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaGastoDepre"));

		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaGastoDepreBusqueda"));

		if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaGastoDepreUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaGastoDepreUpdate"));


		jButtonid_cuenta_contableCuentaContaGastoDepreArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaContaGastoDepreArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContaGastoDepreArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContaGastoDepreArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaContaGastoDepreArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaContaGastoDepreArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaContaGastoDepreArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaContaGastoDepreArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaContaGastoDepreArbol"));



					
		this.jLabelid_gasto_depreciacionCuentaContaGastoDepre = new JLabelMe();
		this.jLabelid_gasto_depreciacionCuentaContaGastoDepre.setText(""+CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION+" : *");
		this.jLabelid_gasto_depreciacionCuentaContaGastoDepre.setToolTipText("Gasto Depreciacion");
		this.jLabelid_gasto_depreciacionCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_gasto_depreciacionCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_gasto_depreciacionCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_gasto_depreciacionCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_gasto_depreciacionCuentaContaGastoDepre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_gasto_depreciacionCuentaContaGastoDepre.setToolTipText(CuentaContaGastoDepreConstantesFunciones.LABEL_IDGASTODEPRECIACION);
		this.gridaBagLayoutCuentaContaGastoDepre = new GridBagLayout();
		this.jPanelid_gasto_depreciacionCuentaContaGastoDepre.setLayout(this.gridaBagLayoutCuentaContaGastoDepre);


		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre= new JComboBoxMe();
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_gasto_depreciacionCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre= new JButtonMe();
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre.setText("Buscar");
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepre.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_gasto_depreciacionCuentaContaGastoDepre,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_gasto_depreciacionCuentaContaGastoDepre"));

		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda= new JButtonMe();
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setText("U");
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_gasto_depreciacionCuentaContaGastoDepreBusqueda"));

		if(this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda.setVisible(false);		}

		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate= new JButtonMe();
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.setText("U");
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_gasto_depreciacionCuentaContaGastoDepre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_gasto_depreciacionCuentaContaGastoDepreUpdate"));



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
		//this.jInternalFrameDetalleCuentaContaGastoDepre = new CuentaContaGastoDepreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Conta Gasto Depre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaContaGastoDepre= new GridBagLayout();
		

		
		String sToolTipCuentaContaGastoDepre="";
		sToolTipCuentaContaGastoDepre=CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaContaGastoDepre+="(ActivosFijos.CuentaContaGastoDepre)";
		}
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaContaGastoDepre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaContaGastoDepre = new JButtonMe();
		this.jButtonModificarCuentaContaGastoDepre = new JButtonMe();
        this.jButtonActualizarCuentaContaGastoDepre = new JButtonMe();
        this.jButtonEliminarCuentaContaGastoDepre = new JButtonMe();
        this.jButtonCancelarCuentaContaGastoDepre = new JButtonMe();
        this.jButtonGuardarCambiosCuentaContaGastoDepre = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre = new JButtonMe();
		this.jButtonCerrarCuentaContaGastoDepre = new JButtonMe();
		
		this.jScrollPanelDatosCuentaContaGastoDepre = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaContaGastoDepre = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaContaGastoDepre = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Conta Gasto Depre";
		
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Conta Gasto Depres" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaContaGastoDepre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaContaGastoDepre.setName("jPanelCamposCuentaContaGastoDepre"); 

		this.jPanelCamposOcultosCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaContaGastoDepre.setName("jPanelCamposOcultosCuentaContaGastoDepre"); 

        this.jPanelAccionesCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaContaGastoDepre.setToolTipText("Acciones");
        this.jPanelAccionesCuentaContaGastoDepre.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaContaGastoDepre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaContaGastoDepre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaContaGastoDepre.setText("Nuevo");
		this.jButtonModificarCuentaContaGastoDepre.setText("Editar");
        this.jButtonActualizarCuentaContaGastoDepre.setText("Actualizar");
        this.jButtonEliminarCuentaContaGastoDepre.setText("Eliminar");
        this.jButtonCancelarCuentaContaGastoDepre.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaContaGastoDepre.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.setText("Guardar");
		this.jButtonCerrarCuentaContaGastoDepre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaContaGastoDepre,"nuevo_button","Nuevo",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaContaGastoDepre,"modificar_button","Editar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaContaGastoDepre,"actualizar_button","Actualizar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaContaGastoDepre,"eliminar_button","Eliminar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaContaGastoDepre,"cancelar_button","Cancelar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaContaGastoDepre,"guardarcambios_button","Guardar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaContaGastoDepre,"guardarcambiostabla_button","Guardar",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaContaGastoDepre,"cerrar_button","Salir",this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaContaGastoDepre.setToolTipText("Nuevo"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaContaGastoDepre.setToolTipText("Editar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaContaGastoDepre.setToolTipText("Actualizar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaContaGastoDepre.setToolTipText("Eliminar)"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaContaGastoDepre.setToolTipText("Cancelar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaContaGastoDepre.setToolTipText("Guardar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.setToolTipText("Guardar"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaContaGastoDepre.setToolTipText("Salir"+" "+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaContaGastoDepre";
		inputMap = this.jButtonNuevoCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaContaGastoDepre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaContaGastoDepre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaContaGastoDepre";
		inputMap = this.jButtonActualizarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaContaGastoDepre"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaContaGastoDepre";
		inputMap = this.jButtonEliminarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaContaGastoDepre"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaContaGastoDepre";
		inputMap = this.jButtonCancelarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaContaGastoDepre"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaContaGastoDepre";
		inputMap = this.jButtonCerrarCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaContaGastoDepre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaContaGastoDepre";
		inputMap = this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaContaGastoDepre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaContaGastoDepre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaContaGastoDepre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaContaGastoDepre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaContaGastoDepre.setToolTipText("Nuevo CuentaContaGastoDepre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre.setToolTipText("Sin Cerrar Ventana CuentaContaGastoDepre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaContaGastoDepre.setText("Accion");
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaContaGastoDepre = new JLabelMe();
		
		this.jLabelAccionesCuentaContaGastoDepre.setText("Acciones");		
		this.jLabelAccionesCuentaContaGastoDepre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaGastoDepre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaContaGastoDepre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaContaGastoDepre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaContaGastoDepre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaContaGastoDepre=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaContaGastoDepre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaContaGastoDepre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaContaGastoDepre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaContaGastoDepre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaContaGastoDepre = new GridBagLayout();
		
		this.jPanelCamposCuentaContaGastoDepre.setLayout(gridaBagLayoutCamposCuentaContaGastoDepre);
		this.jPanelCamposOcultosCuentaContaGastoDepre.setLayout(gridaBagLayoutCamposOcultosCuentaContaGastoDepre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaContaGastoDepre.add(jLabelIdCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);



	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 1;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaContaGastoDepre.add(jLabelidCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);


	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaContaGastoDepre.add(jLabelid_cuenta_contableCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 2;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaContaGastoDepre.add(jButtonid_cuenta_contableCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 3;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCuentaContaGastoDepre.add(jButtonid_cuenta_contableCuentaContaGastoDepreArbol, this.gridBagConstraintsCuentaContaGastoDepre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 4;
		this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaContaGastoDepre.add(jButtonid_cuenta_contableCuentaContaGastoDepreBusqueda, this.gridBagConstraintsCuentaContaGastoDepre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 5;
		this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaContaGastoDepre.add(jButtonid_cuenta_contableCuentaContaGastoDepreUpdate, this.gridBagConstraintsCuentaContaGastoDepre);
	}

	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 1;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaContaGastoDepre.add(jComboBoxid_cuenta_contableCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);


	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_gasto_depreciacionCuentaContaGastoDepre.add(jLabelid_gasto_depreciacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 2;
		this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_gasto_depreciacionCuentaContaGastoDepre.add(jButtonid_gasto_depreciacionCuentaContaGastoDepreBusqueda, this.gridBagConstraintsCuentaContaGastoDepre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		//this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 3;
		this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_gasto_depreciacionCuentaContaGastoDepre.add(jButtonid_gasto_depreciacionCuentaContaGastoDepreUpdate, this.gridBagConstraintsCuentaContaGastoDepre);
	}

	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = 1;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_gasto_depreciacionCuentaContaGastoDepre.add(jComboBoxid_gasto_depreciacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = iYPanelCamposCuentaContaGastoDepre;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = iXPanelCamposCuentaContaGastoDepre++;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContaGastoDepre.add(this.jPanelidCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);



	if(iXPanelCamposCuentaContaGastoDepre % 1==0) {
		iXPanelCamposCuentaContaGastoDepre=0;
		iYPanelCamposCuentaContaGastoDepre++;
	}
	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = iYPanelCamposCuentaContaGastoDepre;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = iXPanelCamposCuentaContaGastoDepre++;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContaGastoDepre.add(this.jPanelid_cuenta_contableCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);



	if(iXPanelCamposCuentaContaGastoDepre % 1==0) {
		iXPanelCamposCuentaContaGastoDepre=0;
		iYPanelCamposCuentaContaGastoDepre++;
	}
	this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaContaGastoDepre.gridy = iYPanelCamposCuentaContaGastoDepre;
	this.gridBagConstraintsCuentaContaGastoDepre.gridx = iXPanelCamposCuentaContaGastoDepre++;
	this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaContaGastoDepre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaContaGastoDepre.add(this.jPanelid_gasto_depreciacionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);



	if(iXPanelCamposCuentaContaGastoDepre % 1==0) {
		iXPanelCamposCuentaContaGastoDepre=0;
		iYPanelCamposCuentaContaGastoDepre++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaContaGastoDepre= new GridBagLayout();
		this.jPanelAccionesCuentaContaGastoDepre.setLayout(gridaBagLayoutAccionesCuentaContaGastoDepre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaContaGastoDepre= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaContaGastoDepre.setLayout(gridaBagLayoutAccionesFormularioCuentaContaGastoDepre);
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContaGastoDepre.add(this.jComboBoxTiposAccionesFormularioCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaContaGastoDepre.add(this.jCheckBoxPostAccionNuevoCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContaGastoDepre.add(this.jCheckBoxPostAccionSinCerrarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentacontagastodepreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaContaGastoDepre.add(this.jCheckBoxPostAccionSinMensajeCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaContaGastoDepre.add(this.jButtonModificarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);							

		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaContaGastoDepre.add(this.jButtonEliminarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
			
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContaGastoDepre.add(this.jButtonActualizarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);


		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaContaGastoDepre.add(this.jButtonGuardarCambiosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);	
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = 0;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaContaGastoDepre.add(this.jButtonCancelarCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaContaGastoDepre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaContaGastoDepre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacontagastodepreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();						
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;		
			//this.gridBagConstraintsCuentaContaGastoDepre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaContaGastoDepre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =0;
		this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaContaGastoDepre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaContaGastoDepreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaContaGastoDepre = new CuentaContaGastoDepreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Conta Gasto Depre DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Conta Gasto Depre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Conta Gasto Depre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaContaGastoDepreModel cuentacontagastodepreModel=new CuentaContaGastoDepreModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaContaGastoDepreModel.CuentaContaGastoDepreFocusTraversalPolicy cuentacontagastodepreFocusTraversalPolicy = cuentacontagastodepreModel.new CuentaContaGastoDepreFocusTraversalPolicy(this);
			
			//cuentacontagastodepreFocusTraversalPolicy.setcuentacontagastodepreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentacontagastodepreModel);
			
			
			this.jContentPaneDetalleCuentaContaGastoDepre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaContaGastoDepre = new GridBagLayout();	
			this.jContentPaneDetalleCuentaContaGastoDepre.setLayout(gridaBagLayoutDetalleCuentaContaGastoDepre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaContaGastoDepre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
				this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaContaGastoDepre.add(jTtoolBarDetalleCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre=   new JScrollPane(jContentPaneDetalleCuentaContaGastoDepre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
	        
			this.jContentPaneDetalleCuentaContaGastoDepre.add(jPanelCamposCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);
			
			
			
			
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
						&& cuentacontagastodepreSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentacontagastodepreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaContaGastoDepre= new GridBagConstraints();
						this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
						this.jContentPaneDetalleCuentaContaGastoDepre.add(this.jTabbedPaneRelacionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaContaGastoDepre.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaContaGastoDepre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
					this.gridBagConstraintsCuentaContaGastoDepre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaContaGastoDepre.add(jPanelCamposOcultosCuentaContaGastoDepre, gridBagConstraintsCuentaContaGastoDepre);
				
					this.jPanelCamposOcultosCuentaContaGastoDepre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
	        this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaContaGastoDepre.add(this.jPanelAccionesFormularioCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);							
			
			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
	        this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaContaGastoDepre.add(this.jPanelAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaContaGastoDepre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre=   new JScrollPane(this.jPanelCamposCuentaContaGastoDepre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaContaGastoDepre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
			this.gridBagConstraintsCuentaContaGastoDepre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaContaGastoDepre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaContaGastoDepre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);			
			
			this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
			this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
			
			
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		
			
		this.gridBagConstraintsCuentaContaGastoDepre = new GridBagConstraints();
		this.gridBagConstraintsCuentaContaGastoDepre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaContaGastoDepre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaContaGastoDepre, this.gridBagConstraintsCuentaContaGastoDepre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaContaGastoDepre;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaContaGastoDepre;
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
