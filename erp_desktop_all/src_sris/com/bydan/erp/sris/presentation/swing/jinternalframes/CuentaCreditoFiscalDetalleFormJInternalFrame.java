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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.CuentaCreditoFiscalConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class CuentaCreditoFiscalDetalleFormJInternalFrame extends CuentaCreditoFiscalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCuentaCreditoFiscal;
	
	protected JMenuBar jmenuBarDetalleCuentaCreditoFiscal;
	
	protected JMenu jmenuDetalleCuentaCreditoFiscal;
	protected JMenu jmenuDetalleArchivoCuentaCreditoFiscal;
	protected JMenu jmenuDetalleAccionesCuentaCreditoFiscal;
	protected JMenu jmenuDetalleDatosCuentaCreditoFiscal;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCuentaCreditoFiscal;	
	protected GridBagConstraints gridBagConstraintsCuentaCreditoFiscal;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CuentaCreditoFiscalBeanSwingJInternalFrameAdditional jInternalFrameDetalleCuentaCreditoFiscal;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public CuentaCreditoFiscalSessionBean cuentacreditofiscalSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public CuentaCreditoFiscalLogic cuentacreditofiscalLogic;
	
	public JScrollPane jScrollPanelDatosCuentaCreditoFiscal;
	public JScrollPane jScrollPanelDatosEdicionCuentaCreditoFiscal;
	public JScrollPane jScrollPanelDatosGeneralCuentaCreditoFiscal;
	
	protected JPanel jPanelCamposCuentaCreditoFiscal;    
	protected JPanel jPanelCamposOcultosCuentaCreditoFiscal;    	
	protected JPanel jPanelAccionesCuentaCreditoFiscal;
	protected JPanel jPanelAccionesFormularioCuentaCreditoFiscal;
    
	
	
	protected Integer iXPanelCamposCuentaCreditoFiscal=0;
	protected Integer iYPanelCamposCuentaCreditoFiscal=0;
	
	protected Integer iXPanelCamposOcultosCuentaCreditoFiscal=0;
	protected Integer iYPanelCamposOcultosCuentaCreditoFiscal=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCuentaCreditoFiscal;
	public JButton jButtonModificarCuentaCreditoFiscal;
	public JButton jButtonActualizarCuentaCreditoFiscal;
    public JButton jButtonEliminarCuentaCreditoFiscal;
	public JButton jButtonCancelarCuentaCreditoFiscal;
    public JButton jButtonGuardarCambiosCuentaCreditoFiscal;
	public JButton jButtonGuardarCambiosTablaCuentaCreditoFiscal;
	protected JButton jButtonCerrarCuentaCreditoFiscal;
	
	
	protected JButton jButtonProcesarInformacionCuentaCreditoFiscal;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCuentaCreditoFiscal;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCuentaCreditoFiscal;
	protected JButton jButtonModificarToolBarCuentaCreditoFiscal;
	protected JButton jButtonActualizarToolBarCuentaCreditoFiscal;
    protected JButton jButtonEliminarToolBarCuentaCreditoFiscal;
	protected JButton jButtonCancelarToolBarCuentaCreditoFiscal;
    protected JButton jButtonGuardarCambiosToolBarCuentaCreditoFiscal;
	protected JButton jButtonGuardarCambiosTablaToolBarCuentaCreditoFiscal;
	protected JButton jButtonMostrarOcultarTablaToolBarCuentaCreditoFiscal;
	protected JButton jButtonCerrarToolBarCuentaCreditoFiscal;
	
	protected JButton jButtonProcesarInformacionToolBarCuentaCreditoFiscal;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCuentaCreditoFiscal;
	protected JMenuItem jMenuItemModificarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemActualizarCuentaCreditoFiscal;
    protected JMenuItem jMenuItemEliminarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemCancelarCuentaCreditoFiscal;
    protected JMenuItem jMenuItemGuardarCambiosCuentaCreditoFiscal;
	protected JMenuItem jMenuItemGuardarCambiosTablaCuentaCreditoFiscal;
	protected JMenuItem jMenuItemCerrarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemDetalleCerrarCuentaCreditoFiscal;
	protected JMenuItem jMenuItemDetalleMostarOcultarCuentaCreditoFiscal;
	
	protected JMenuItem jMenuItemProcesarInformacionCuentaCreditoFiscal;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCuentaCreditoFiscal;
	protected JMenuItem jMenuItemMostrarOcultarCuentaCreditoFiscal;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCuentaCreditoFiscal;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCuentaCreditoFiscal;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCuentaCreditoFiscal;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCuentaCreditoFiscal;
	public JLabel jLabelIdCuentaCreditoFiscal;
	public JLabel jLabelidCuentaCreditoFiscal;
	public JButton jButtonidCuentaCreditoFiscalBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoCuentaCreditoFiscal;
	public JLabel jLabelesta_activoCuentaCreditoFiscal;
	public JCheckBox jCheckBoxesta_activoCuentaCreditoFiscal;
	public JButton jButtonesta_activoCuentaCreditoFiscalBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCuentaCreditoFiscal;
	public JLabel jLabelid_empresaCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCuentaCreditoFiscal;
	public JButton jButtonid_empresaCuentaCreditoFiscal= new JButtonMe();
	public JButton jButtonid_empresaCuentaCreditoFiscalUpdate= new JButtonMe();
	public JButton jButtonid_empresaCuentaCreditoFiscalBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCuentaCreditoFiscal;
	public JLabel jLabelid_cuenta_contableCuentaCreditoFiscal;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCuentaCreditoFiscal;
	public JButton jButtonid_cuenta_contableCuentaCreditoFiscal= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaCreditoFiscalUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCuentaCreditoFiscalArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCuentaCreditoFiscal;
	
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
	
	public CuentaCreditoFiscalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCuentaCreditoFiscal=new JPanel();
				this.jPanelAccionesFormularioCuentaCreditoFiscal=new JPanel();
				this.jmenuBarDetalleCuentaCreditoFiscal=new JMenuBar();
				this.jTtoolBarDetalleCuentaCreditoFiscal=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CuentaCreditoFiscalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CuentaCreditoFiscalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CuentaCreditoFiscal No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCuentaCreditoFiscal() {
		return this.jButtonActualizarToolBarCuentaCreditoFiscal;
	}
	
	public JButton getjButtonEliminarToolBarCuentaCreditoFiscal() {
		return this.jButtonEliminarToolBarCuentaCreditoFiscal;
	}
	
	public JButton getjButtonCancelarToolBarCuentaCreditoFiscal() {
		return this.jButtonCancelarToolBarCuentaCreditoFiscal;
	}		
	
	public JButton getjButtonProcesarInformacionCuentaCreditoFiscal() {
		return this.jButtonProcesarInformacionCuentaCreditoFiscal;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCuentaCreditoFiscal)	{
		this.jButtonProcesarInformacionCuentaCreditoFiscal = jButtonProcesarInformacionCuentaCreditoFiscal;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCuentaCreditoFiscal() {
		return this.jComboBoxTiposAccionesCuentaCreditoFiscal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposRelacionesCuentaCreditoFiscal) {
		this.jComboBoxTiposRelacionesCuentaCreditoFiscal = jComboBoxTiposRelacionesCuentaCreditoFiscal;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCuentaCreditoFiscal(
			JComboBox jComboBoxTiposAccionesCuentaCreditoFiscal) {
		this.jComboBoxTiposAccionesCuentaCreditoFiscal = jComboBoxTiposAccionesCuentaCreditoFiscal;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCuentaCreditoFiscal() {
		return this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCuentaCreditoFiscal(
			JComboBox jComboBoxTiposAccionesFormularioCuentaCreditoFiscal) {
		this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal = jComboBoxTiposAccionesFormularioCuentaCreditoFiscal;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cuentacreditofiscalSessionBean=new CuentaCreditoFiscalSessionBean();
		
		this.cuentacreditofiscalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cuentacreditofiscalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CuentaCreditoFiscalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CuentaCreditoFiscalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CuentaCreditoFiscalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cuenta Credito Fiscal MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
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
	
		CuentaCreditoFiscalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCuentaCreditoFiscal= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCuentaCreditoFiscal=new JButtonMe();
				this.jButtonModificarToolBarCuentaCreditoFiscal=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCuentaCreditoFiscal,this.jTtoolBarDetalleCuentaCreditoFiscal,
							"actualizar","actualizar","Actualizar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCuentaCreditoFiscal,this.jTtoolBarDetalleCuentaCreditoFiscal,
							"eliminar","eliminar","Eliminar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCuentaCreditoFiscal,this.jTtoolBarDetalleCuentaCreditoFiscal,
							"cancelar","cancelar","Cancelar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCuentaCreditoFiscal=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCuentaCreditoFiscal,this.jTtoolBarDetalleCuentaCreditoFiscal,
							"guardarcambios","guardarcambios","Guardar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCuentaCreditoFiscal=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCuentaCreditoFiscal=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCuentaCreditoFiscal=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCuentaCreditoFiscal=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCuentaCreditoFiscal=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCuentaCreditoFiscal= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCuentaCreditoFiscal.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCuentaCreditoFiscal,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCuentaCreditoFiscal= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCuentaCreditoFiscal.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCuentaCreditoFiscal,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCuentaCreditoFiscal= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCuentaCreditoFiscal.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCuentaCreditoFiscal,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCuentaCreditoFiscal= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCuentaCreditoFiscal.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCuentaCreditoFiscal,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCuentaCreditoFiscal= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCuentaCreditoFiscal.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCuentaCreditoFiscal,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCuentaCreditoFiscal= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCuentaCreditoFiscal.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCuentaCreditoFiscal,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCuentaCreditoFiscal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCuentaCreditoFiscal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCuentaCreditoFiscal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCuentaCreditoFiscal= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCuentaCreditoFiscal.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCuentaCreditoFiscal,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCuentaCreditoFiscal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCuentaCreditoFiscal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCuentaCreditoFiscal,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCuentaCreditoFiscal.add(this.jMenuItemDetalleCerrarCuentaCreditoFiscal);
		
		this.jmenuDetalleAccionesCuentaCreditoFiscal.add(this.jMenuItemActualizarCuentaCreditoFiscal);
		this.jmenuDetalleAccionesCuentaCreditoFiscal.add(this.jMenuItemEliminarCuentaCreditoFiscal);
		this.jmenuDetalleAccionesCuentaCreditoFiscal.add(this.jMenuItemCancelarCuentaCreditoFiscal);		
		
		//this.jmenuDetalleDatosCuentaCreditoFiscal.add(this.jMenuItemDetalleAbrirOrderByCuentaCreditoFiscal);				
		this.jmenuDetalleDatosCuentaCreditoFiscal.add(this.jMenuItemDetalleMostarOcultarCuentaCreditoFiscal);				
				
		//this.jmenuDetalleAccionesCuentaCreditoFiscal.add(this.jMenuItemGuardarCambiosCuentaCreditoFiscal);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCuentaCreditoFiscal.add(this.jmenuDetalleArchivoCuentaCreditoFiscal);		
		this.jmenuBarDetalleCuentaCreditoFiscal.add(this.jmenuDetalleAccionesCuentaCreditoFiscal);		
		this.jmenuBarDetalleCuentaCreditoFiscal.add(this.jmenuDetalleDatosCuentaCreditoFiscal);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCuentaCreditoFiscal);				
	}
	
	
	public void inicializarElementosCamposCuentaCreditoFiscal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCuentaCreditoFiscal = new JLabelMe();
		jLabelIdCuentaCreditoFiscal.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCuentaCreditoFiscal = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCuentaCreditoFiscal.setToolTipText(CuentaCreditoFiscalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCuentaCreditoFiscal= new GridBagLayout();

		this.jPanelidCuentaCreditoFiscal.setLayout(this.gridaBagLayoutCuentaCreditoFiscal);

		jLabelidCuentaCreditoFiscal = new JLabel();
		jLabelidCuentaCreditoFiscal.setText("Id");

		jLabelidCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelesta_activoCuentaCreditoFiscal = new JLabelMe();
		this.jLabelesta_activoCuentaCreditoFiscal.setText(""+CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoCuentaCreditoFiscal.setToolTipText("Esta Activo");
		this.jLabelesta_activoCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoCuentaCreditoFiscal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoCuentaCreditoFiscal.setToolTipText(CuentaCreditoFiscalConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutCuentaCreditoFiscal = new GridBagLayout();
		this.jPanelesta_activoCuentaCreditoFiscal.setLayout(this.gridaBagLayoutCuentaCreditoFiscal);


		jCheckBoxesta_activoCuentaCreditoFiscal= new JCheckBoxMe();
		jCheckBoxesta_activoCuentaCreditoFiscal.setEnabled(false);

		jCheckBoxesta_activoCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoCuentaCreditoFiscalBusqueda= new JButtonMe();
		this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setText("U");
		this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoCuentaCreditoFiscalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoCuentaCreditoFiscalBusqueda"));

		if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoCuentaCreditoFiscalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCuentaCreditoFiscal() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCuentaCreditoFiscal = new JLabelMe();
		this.jLabelid_empresaCuentaCreditoFiscal.setText(""+CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCuentaCreditoFiscal.setToolTipText("Empresa");
		this.jLabelid_empresaCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCuentaCreditoFiscal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCuentaCreditoFiscal.setToolTipText(CuentaCreditoFiscalConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCuentaCreditoFiscal = new GridBagLayout();
		this.jPanelid_empresaCuentaCreditoFiscal.setLayout(this.gridaBagLayoutCuentaCreditoFiscal);


		jComboBoxid_empresaCuentaCreditoFiscal= new JComboBoxMe();
		jComboBoxid_empresaCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCuentaCreditoFiscal.setEnabled(false);

		this.jButtonid_empresaCuentaCreditoFiscal= new JButtonMe();
		this.jButtonid_empresaCuentaCreditoFiscal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaCreditoFiscal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaCreditoFiscal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCuentaCreditoFiscal.setText("Buscar");
		this.jButtonid_empresaCuentaCreditoFiscal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCuentaCreditoFiscal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaCreditoFiscal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaCreditoFiscal"));

		this.jButtonid_empresaCuentaCreditoFiscalBusqueda= new JButtonMe();
		this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setText("U");
		this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaCreditoFiscalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaCreditoFiscalBusqueda"));

		if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCuentaCreditoFiscalBusqueda.setVisible(false);		}

		this.jButtonid_empresaCuentaCreditoFiscalUpdate= new JButtonMe();
		this.jButtonid_empresaCuentaCreditoFiscalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaCreditoFiscalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCuentaCreditoFiscalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCuentaCreditoFiscalUpdate.setText("U");
		this.jButtonid_empresaCuentaCreditoFiscalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCuentaCreditoFiscalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCuentaCreditoFiscalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCuentaCreditoFiscalUpdate"));



					
		this.jLabelid_cuenta_contableCuentaCreditoFiscal = new JLabelMe();
		this.jLabelid_cuenta_contableCuentaCreditoFiscal.setText(""+CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCuentaCreditoFiscal.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCuentaCreditoFiscal=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCuentaCreditoFiscal.setToolTipText(CuentaCreditoFiscalConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCuentaCreditoFiscal = new GridBagLayout();
		this.jPanelid_cuenta_contableCuentaCreditoFiscal.setLayout(this.gridaBagLayoutCuentaCreditoFiscal);


		jComboBoxid_cuenta_contableCuentaCreditoFiscal= new JComboBoxMe();
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCuentaCreditoFiscal= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaCreditoFiscal.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaCreditoFiscal.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaCreditoFiscal.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCuentaCreditoFiscal.setText("Buscar");
		this.jButtonid_cuenta_contableCuentaCreditoFiscal.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCuentaCreditoFiscal.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaCreditoFiscal,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaCreditoFiscal"));

		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setText("U");
		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaCreditoFiscalBusqueda"));

		if(this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.setText("U");
		this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaCreditoFiscalUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaCreditoFiscalUpdate"));


		jButtonid_cuenta_contableCuentaCreditoFiscalArbol= new JButtonMe();
		jButtonid_cuenta_contableCuentaCreditoFiscalArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaCreditoFiscalArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaCreditoFiscalArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCuentaCreditoFiscalArbol.setText("Arbol");
		jButtonid_cuenta_contableCuentaCreditoFiscalArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCuentaCreditoFiscalArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCuentaCreditoFiscalArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCuentaCreditoFiscal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCuentaCreditoFiscalArbol"));



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
		//this.jInternalFrameDetalleCuentaCreditoFiscal = new CuentaCreditoFiscalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cuenta Credito Fiscal DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCuentaCreditoFiscal= new GridBagLayout();
		

		
		String sToolTipCuentaCreditoFiscal="";
		sToolTipCuentaCreditoFiscal=CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCuentaCreditoFiscal+="(Sris.CuentaCreditoFiscal)";
		}
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			sToolTipCuentaCreditoFiscal+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCuentaCreditoFiscal = new JButtonMe();
		this.jButtonModificarCuentaCreditoFiscal = new JButtonMe();
        this.jButtonActualizarCuentaCreditoFiscal = new JButtonMe();
        this.jButtonEliminarCuentaCreditoFiscal = new JButtonMe();
        this.jButtonCancelarCuentaCreditoFiscal = new JButtonMe();
        this.jButtonGuardarCambiosCuentaCreditoFiscal = new JButtonMe();
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal = new JButtonMe();
		this.jButtonCerrarCuentaCreditoFiscal = new JButtonMe();
		
		this.jScrollPanelDatosCuentaCreditoFiscal = new JScrollPane();   
        this.jScrollPanelDatosEdicionCuentaCreditoFiscal = new JScrollPane();
		this.jScrollPanelDatosGeneralCuentaCreditoFiscal = new JScrollPane();
				
		
		
		this.jPanelCamposCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cuenta Credito Fiscal";
		
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cuenta Credito Fiscales" + this.sPath));
		} else {
			this.jScrollPanelDatosCuentaCreditoFiscal.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCuentaCreditoFiscal.setName("jPanelCamposCuentaCreditoFiscal"); 

		this.jPanelCamposOcultosCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCuentaCreditoFiscal.setName("jPanelCamposOcultosCuentaCreditoFiscal"); 

        this.jPanelAccionesCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCuentaCreditoFiscal.setToolTipText("Acciones");
        this.jPanelAccionesCuentaCreditoFiscal.setName("Acciones"); 

		this.jPanelAccionesFormularioCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCuentaCreditoFiscal.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCuentaCreditoFiscal.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCuentaCreditoFiscal.setText("Nuevo");
		this.jButtonModificarCuentaCreditoFiscal.setText("Editar");
        this.jButtonActualizarCuentaCreditoFiscal.setText("Actualizar");
        this.jButtonEliminarCuentaCreditoFiscal.setText("Eliminar");
        this.jButtonCancelarCuentaCreditoFiscal.setText("Cancelar");
        this.jButtonGuardarCambiosCuentaCreditoFiscal.setText("Guardar");
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.setText("Guardar");
		this.jButtonCerrarCuentaCreditoFiscal.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCuentaCreditoFiscal,"nuevo_button","Nuevo",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCuentaCreditoFiscal,"modificar_button","Editar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCuentaCreditoFiscal,"actualizar_button","Actualizar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCuentaCreditoFiscal,"eliminar_button","Eliminar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCuentaCreditoFiscal,"cancelar_button","Cancelar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCuentaCreditoFiscal,"guardarcambios_button","Guardar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCuentaCreditoFiscal,"guardarcambiostabla_button","Guardar",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCuentaCreditoFiscal,"cerrar_button","Salir",this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCuentaCreditoFiscal.setToolTipText("Nuevo"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCuentaCreditoFiscal.setToolTipText("Editar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCuentaCreditoFiscal.setToolTipText("Actualizar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCuentaCreditoFiscal.setToolTipText("Eliminar)"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCuentaCreditoFiscal.setToolTipText("Cancelar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCuentaCreditoFiscal.setToolTipText("Guardar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.setToolTipText("Guardar"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCuentaCreditoFiscal.setToolTipText("Salir"+" "+CuentaCreditoFiscalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCuentaCreditoFiscal";
		inputMap = this.jButtonNuevoCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCuentaCreditoFiscal.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCuentaCreditoFiscal"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCuentaCreditoFiscal";
		inputMap = this.jButtonActualizarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCuentaCreditoFiscal"));
		
		//ELIMINAR
		sMapKey = "EliminarCuentaCreditoFiscal";
		inputMap = this.jButtonEliminarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCuentaCreditoFiscal"));
		
		//CANCELAR	
		sMapKey = "CancelarCuentaCreditoFiscal";
		inputMap = this.jButtonCancelarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCuentaCreditoFiscal"));
		
		//CERRAR		
		sMapKey = "CerrarCuentaCreditoFiscal";
		inputMap = this.jButtonCerrarCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCuentaCreditoFiscal"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCuentaCreditoFiscal";
		inputMap = this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCuentaCreditoFiscal.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCuentaCreditoFiscal"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCuentaCreditoFiscal = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCuentaCreditoFiscal.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCuentaCreditoFiscal.setToolTipText("Nuevo CuentaCreditoFiscal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal.setToolTipText("Sin Cerrar Ventana CuentaCreditoFiscal");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCuentaCreditoFiscal.setText("Accion");
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCuentaCreditoFiscal = new JLabelMe();
		
		this.jLabelAccionesCuentaCreditoFiscal.setText("Acciones");		
		this.jLabelAccionesCuentaCreditoFiscal.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaCreditoFiscal.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCuentaCreditoFiscal.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCuentaCreditoFiscal();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCuentaCreditoFiscal();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCuentaCreditoFiscal=new JTabbedPane();
		this.jTabbedPaneRelacionesCuentaCreditoFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCuentaCreditoFiscal,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCuentaCreditoFiscal.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCuentaCreditoFiscal = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCuentaCreditoFiscal = new GridBagLayout();
		
		this.jPanelCamposCuentaCreditoFiscal.setLayout(gridaBagLayoutCamposCuentaCreditoFiscal);
		this.jPanelCamposOcultosCuentaCreditoFiscal.setLayout(gridaBagLayoutCamposOcultosCuentaCreditoFiscal);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCuentaCreditoFiscal.add(jLabelIdCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 1;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCuentaCreditoFiscal.add(jLabelidCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);


	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCuentaCreditoFiscal.add(jLabelid_empresaCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		//this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 2;
		this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaCreditoFiscal.add(jButtonid_empresaCuentaCreditoFiscalBusqueda, this.gridBagConstraintsCuentaCreditoFiscal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		//this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 3;
		this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCuentaCreditoFiscal.add(jButtonid_empresaCuentaCreditoFiscalUpdate, this.gridBagConstraintsCuentaCreditoFiscal);
	}

	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 1;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCuentaCreditoFiscal.add(jComboBoxid_empresaCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);


	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCuentaCreditoFiscal.add(jLabelid_cuenta_contableCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		//this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 2;
		this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaCreditoFiscal.add(jButtonid_cuenta_contableCuentaCreditoFiscalBusqueda, this.gridBagConstraintsCuentaCreditoFiscal);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		//this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 3;
		this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCuentaCreditoFiscal.add(jButtonid_cuenta_contableCuentaCreditoFiscalUpdate, this.gridBagConstraintsCuentaCreditoFiscal);
	}

	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 1;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCuentaCreditoFiscal.add(jComboBoxid_cuenta_contableCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);


	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoCuentaCreditoFiscal.add(jLabelesta_activoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		//this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 2;
		this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoCuentaCreditoFiscal.add(jButtonesta_activoCuentaCreditoFiscalBusqueda, this.gridBagConstraintsCuentaCreditoFiscal);
	}

	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = 1;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoCuentaCreditoFiscal.add(jCheckBoxesta_activoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = iYPanelCamposCuentaCreditoFiscal;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = iXPanelCamposCuentaCreditoFiscal++;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaCreditoFiscal.add(this.jPanelidCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(iXPanelCamposCuentaCreditoFiscal % 1==0) {
		iXPanelCamposCuentaCreditoFiscal=0;
		iYPanelCamposCuentaCreditoFiscal++;
	}
	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = iYPanelCamposCuentaCreditoFiscal;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = iXPanelCamposCuentaCreditoFiscal++;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaCreditoFiscal.add(this.jPanelid_cuenta_contableCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(iXPanelCamposCuentaCreditoFiscal % 1==0) {
		iXPanelCamposCuentaCreditoFiscal=0;
		iYPanelCamposCuentaCreditoFiscal++;
	}
	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = iYPanelCamposCuentaCreditoFiscal;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = iXPanelCamposCuentaCreditoFiscal++;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCuentaCreditoFiscal.add(this.jPanelesta_activoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(iXPanelCamposCuentaCreditoFiscal % 1==0) {
		iXPanelCamposCuentaCreditoFiscal=0;
		iYPanelCamposCuentaCreditoFiscal++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCuentaCreditoFiscal.gridy = iYPanelCamposOcultosCuentaCreditoFiscal;
	this.gridBagConstraintsCuentaCreditoFiscal.gridx = iXPanelCamposOcultosCuentaCreditoFiscal++;
	this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCuentaCreditoFiscal.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCuentaCreditoFiscal.add(this.jPanelid_empresaCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);



	if(iXPanelCamposOcultosCuentaCreditoFiscal % 1==0) {
		iXPanelCamposOcultosCuentaCreditoFiscal=0;
		iYPanelCamposOcultosCuentaCreditoFiscal++;
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
			
		GridBagLayout gridaBagLayoutAccionesCuentaCreditoFiscal= new GridBagLayout();
		this.jPanelAccionesCuentaCreditoFiscal.setLayout(gridaBagLayoutAccionesCuentaCreditoFiscal);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCuentaCreditoFiscal= new GridBagLayout();
		this.jPanelAccionesFormularioCuentaCreditoFiscal.setLayout(gridaBagLayoutAccionesFormularioCuentaCreditoFiscal);
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaCreditoFiscal.add(this.jComboBoxTiposAccionesFormularioCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCuentaCreditoFiscal.add(this.jCheckBoxPostAccionNuevoCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaCreditoFiscal.add(this.jCheckBoxPostAccionSinCerrarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cuentacreditofiscalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCuentaCreditoFiscal.add(this.jCheckBoxPostAccionSinMensajeCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccion++;
			
		this.jPanelAccionesCuentaCreditoFiscal.add(this.jButtonModificarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);							

		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =iPosXAccion++;
			
		this.jPanelAccionesCuentaCreditoFiscal.add(this.jButtonEliminarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
			
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaCreditoFiscal.add(this.jButtonActualizarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);


		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = iPosXAccion++;
		
		this.jPanelAccionesCuentaCreditoFiscal.add(this.jButtonGuardarCambiosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);	
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = 0;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =iPosXAccion++;
		
		this.jPanelAccionesCuentaCreditoFiscal.add(this.jButtonCancelarCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCuentaCreditoFiscal = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCuentaCreditoFiscal);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cuentacreditofiscalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();						
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;		
			//this.gridBagConstraintsCuentaCreditoFiscal.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCuentaCreditoFiscal.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =0;
		this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCuentaCreditoFiscal.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CuentaCreditoFiscalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCuentaCreditoFiscal = new CuentaCreditoFiscalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cuenta Credito Fiscal DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cuenta Credito Fiscal DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cuenta Credito Fiscal Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CuentaCreditoFiscalModel cuentacreditofiscalModel=new CuentaCreditoFiscalModel(this);
			
			//SI USARA CLASE INTERNA
			//CuentaCreditoFiscalModel.CuentaCreditoFiscalFocusTraversalPolicy cuentacreditofiscalFocusTraversalPolicy = cuentacreditofiscalModel.new CuentaCreditoFiscalFocusTraversalPolicy(this);
			
			//cuentacreditofiscalFocusTraversalPolicy.setcuentacreditofiscalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cuentacreditofiscalModel);
			
			
			this.jContentPaneDetalleCuentaCreditoFiscal = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCuentaCreditoFiscal = new GridBagLayout();	
			this.jContentPaneDetalleCuentaCreditoFiscal.setLayout(gridaBagLayoutDetalleCuentaCreditoFiscal);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCuentaCreditoFiscal = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
				this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
					
				
				this.jContentPaneDetalleCuentaCreditoFiscal.add(jTtoolBarDetalleCuentaCreditoFiscal, gridBagConstraintsCuentaCreditoFiscal);								
				
}
			
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal=   new JScrollPane(jContentPaneDetalleCuentaCreditoFiscal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	        
			this.jContentPaneDetalleCuentaCreditoFiscal.add(jPanelCamposCuentaCreditoFiscal, gridBagConstraintsCuentaCreditoFiscal);
			
			
			
			
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
						&& cuentacreditofiscalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cuentacreditofiscalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCuentaCreditoFiscal= new GridBagConstraints();
						this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
						this.jContentPaneDetalleCuentaCreditoFiscal.add(this.jTabbedPaneRelacionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCuentaCreditoFiscal.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCuentaCreditoFiscal.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
					this.gridBagConstraintsCuentaCreditoFiscal.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
					
				
					this.jContentPaneDetalleCuentaCreditoFiscal.add(jPanelCamposOcultosCuentaCreditoFiscal, gridBagConstraintsCuentaCreditoFiscal);
				
					this.jPanelCamposOcultosCuentaCreditoFiscal.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	        this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCuentaCreditoFiscal.add(this.jPanelAccionesFormularioCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);							
			
			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
	        this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
	        
			
			this.jContentPaneDetalleCuentaCreditoFiscal.add(this.jPanelAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCuentaCreditoFiscal);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal=   new JScrollPane(this.jPanelCamposCuentaCreditoFiscal,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCuentaCreditoFiscal.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
			this.gridBagConstraintsCuentaCreditoFiscal.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCuentaCreditoFiscal.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCuentaCreditoFiscal.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);			
			
			this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
			this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
			
			
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		
			
		this.gridBagConstraintsCuentaCreditoFiscal = new GridBagConstraints();
		this.gridBagConstraintsCuentaCreditoFiscal.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCuentaCreditoFiscal.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCuentaCreditoFiscal, this.gridBagConstraintsCuentaCreditoFiscal);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCuentaCreditoFiscal;//jContentPane;
		
		return jScrollPanelDatosEdicionCuentaCreditoFiscal;
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
