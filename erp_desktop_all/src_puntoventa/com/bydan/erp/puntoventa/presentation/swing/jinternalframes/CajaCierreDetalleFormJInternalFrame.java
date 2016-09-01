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
import com.bydan.erp.puntoventa.util.CajaCierreConstantesFunciones;

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
public class CajaCierreDetalleFormJInternalFrame extends CajaCierreBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCajaCierre;
	
	protected JMenuBar jmenuBarDetalleCajaCierre;
	
	protected JMenu jmenuDetalleCajaCierre;
	protected JMenu jmenuDetalleArchivoCajaCierre;
	protected JMenu jmenuDetalleAccionesCajaCierre;
	protected JMenu jmenuDetalleDatosCajaCierre;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCajaCierre;	
	protected GridBagConstraints gridBagConstraintsCajaCierre;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CajaCierreBeanSwingJInternalFrameAdditional jInternalFrameDetalleCajaCierre;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";
	
	public CajaCierreSessionBean cajacierreSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public CajaSessionBean cajaSessionBean;	
	
	public CajaCierreLogic cajacierreLogic;
	
	public JScrollPane jScrollPanelDatosCajaCierre;
	public JScrollPane jScrollPanelDatosEdicionCajaCierre;
	public JScrollPane jScrollPanelDatosGeneralCajaCierre;
	
	protected JPanel jPanelCamposCajaCierre;    
	protected JPanel jPanelCamposOcultosCajaCierre;    	
	protected JPanel jPanelAccionesCajaCierre;
	protected JPanel jPanelAccionesFormularioCajaCierre;
    
	
	
	protected Integer iXPanelCamposCajaCierre=0;
	protected Integer iYPanelCamposCajaCierre=0;
	
	protected Integer iXPanelCamposOcultosCajaCierre=0;
	protected Integer iYPanelCamposOcultosCajaCierre=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCajaCierre;
	public JButton jButtonModificarCajaCierre;
	public JButton jButtonActualizarCajaCierre;
    public JButton jButtonEliminarCajaCierre;
	public JButton jButtonCancelarCajaCierre;
    public JButton jButtonGuardarCambiosCajaCierre;
	public JButton jButtonGuardarCambiosTablaCajaCierre;
	protected JButton jButtonCerrarCajaCierre;
	
	
	protected JButton jButtonProcesarInformacionCajaCierre;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCajaCierre;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCajaCierre;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCajaCierre;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCajaCierre;
	protected JButton jButtonModificarToolBarCajaCierre;
	protected JButton jButtonActualizarToolBarCajaCierre;
    protected JButton jButtonEliminarToolBarCajaCierre;
	protected JButton jButtonCancelarToolBarCajaCierre;
    protected JButton jButtonGuardarCambiosToolBarCajaCierre;
	protected JButton jButtonGuardarCambiosTablaToolBarCajaCierre;
	protected JButton jButtonMostrarOcultarTablaToolBarCajaCierre;
	protected JButton jButtonCerrarToolBarCajaCierre;
	
	protected JButton jButtonProcesarInformacionToolBarCajaCierre;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCajaCierre;
	protected JMenuItem jMenuItemModificarCajaCierre;
	protected JMenuItem jMenuItemActualizarCajaCierre;
    protected JMenuItem jMenuItemEliminarCajaCierre;
	protected JMenuItem jMenuItemCancelarCajaCierre;
    protected JMenuItem jMenuItemGuardarCambiosCajaCierre;
	protected JMenuItem jMenuItemGuardarCambiosTablaCajaCierre;
	protected JMenuItem jMenuItemCerrarCajaCierre;
	protected JMenuItem jMenuItemDetalleCerrarCajaCierre;
	protected JMenuItem jMenuItemDetalleMostarOcultarCajaCierre;
	
	protected JMenuItem jMenuItemProcesarInformacionCajaCierre;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCajaCierre;
	protected JMenuItem jMenuItemMostrarOcultarCajaCierre;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCajaCierre;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCajaCierre;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCajaCierre;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCajaCierre;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCajaCierre;
	public JLabel jLabelIdCajaCierre;
	public JLabel jLabelidCajaCierre;
	public JButton jButtonidCajaCierreBusqueda= new JButtonMe();

	public JPanel jPanelfecha_cierreCajaCierre;
	public JLabel jLabelfecha_cierreCajaCierre;
	//public JFormattedTextField jDateChooserfecha_cierreCajaCierre;

	public JDateChooser jDateChooserfecha_cierreCajaCierre;
	public JButton jButtonfecha_cierreCajaCierreBusqueda= new JButtonMe();

	public JPanel jPanelhora_cierreCajaCierre;
	public JLabel jLabelhora_cierreCajaCierre;
	public JSpinner jSpinnerhora_cierreCajaCierre= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_cierreCajaCierreBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoCajaCierre;
	public JLabel jLabelesta_activoCajaCierre;
	public JCheckBox jCheckBoxesta_activoCajaCierre;
	public JButton jButtonesta_activoCajaCierreBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCajaCierre;
	public JLabel jLabelid_empresaCajaCierre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCajaCierre;
	public JButton jButtonid_empresaCajaCierre= new JButtonMe();
	public JButton jButtonid_empresaCajaCierreUpdate= new JButtonMe();
	public JButton jButtonid_empresaCajaCierreBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCajaCierre;
	public JLabel jLabelid_sucursalCajaCierre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCajaCierre;
	public JButton jButtonid_sucursalCajaCierre= new JButtonMe();
	public JButton jButtonid_sucursalCajaCierreUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCajaCierreBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaCajaCierre;
	public JLabel jLabelid_cajaCajaCierre;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaCajaCierre;
	public JButton jButtonid_cajaCajaCierre= new JButtonMe();
	public JButton jButtonid_cajaCajaCierreUpdate= new JButtonMe();
	public JButton jButtonid_cajaCajaCierreBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCajaCierre;
	
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
	
	public CajaCierreDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCajaCierre=new JPanel();
				this.jPanelAccionesFormularioCajaCierre=new JPanel();
				this.jmenuBarDetalleCajaCierre=new JMenuBar();
				this.jTtoolBarDetalleCajaCierre=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CajaCierreDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CajaCierreDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CajaCierre No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCajaCierre() {
		return this.jButtonActualizarToolBarCajaCierre;
	}
	
	public JButton getjButtonEliminarToolBarCajaCierre() {
		return this.jButtonEliminarToolBarCajaCierre;
	}
	
	public JButton getjButtonCancelarToolBarCajaCierre() {
		return this.jButtonCancelarToolBarCajaCierre;
	}		
	
	public JButton getjButtonProcesarInformacionCajaCierre() {
		return this.jButtonProcesarInformacionCajaCierre;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCajaCierre)	{
		this.jButtonProcesarInformacionCajaCierre = jButtonProcesarInformacionCajaCierre;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCajaCierre() {
		return this.jComboBoxTiposAccionesCajaCierre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCajaCierre(
			JComboBox jComboBoxTiposRelacionesCajaCierre) {
		this.jComboBoxTiposRelacionesCajaCierre = jComboBoxTiposRelacionesCajaCierre;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCajaCierre(
			JComboBox jComboBoxTiposAccionesCajaCierre) {
		this.jComboBoxTiposAccionesCajaCierre = jComboBoxTiposAccionesCajaCierre;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCajaCierre() {
		return this.jComboBoxTiposAccionesFormularioCajaCierre;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCajaCierre(
			JComboBox jComboBoxTiposAccionesFormularioCajaCierre) {
		this.jComboBoxTiposAccionesFormularioCajaCierre = jComboBoxTiposAccionesFormularioCajaCierre;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cajacierreSessionBean=new CajaCierreSessionBean();
		
		this.cajacierreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajacierreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cajacierreSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CajaCierreJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CajaCierreJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Caja Cierre MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
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
	
		CajaCierreJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCajaCierre= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCajaCierre=new JButtonMe();
				this.jButtonModificarToolBarCajaCierre=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCajaCierre,this.jTtoolBarDetalleCajaCierre,
							"actualizar","actualizar","Actualizar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCajaCierre,this.jTtoolBarDetalleCajaCierre,
							"eliminar","eliminar","Eliminar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCajaCierre,this.jTtoolBarDetalleCajaCierre,
							"cancelar","cancelar","Cancelar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCajaCierre=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCajaCierre,this.jTtoolBarDetalleCajaCierre,
							"guardarcambios","guardarcambios","Guardar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCajaCierre=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCajaCierre=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCajaCierre=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCajaCierre=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCajaCierre=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCajaCierre= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCajaCierre.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCajaCierre,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCajaCierre= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCajaCierre.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCajaCierre,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCajaCierre= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCajaCierre.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCajaCierre,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCajaCierre= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCajaCierre.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCajaCierre,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCajaCierre= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCajaCierre.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCajaCierre,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCajaCierre= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCajaCierre.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCajaCierre,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCajaCierre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCajaCierre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCajaCierre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCajaCierre= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCajaCierre.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCajaCierre,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCajaCierre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCajaCierre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCajaCierre,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCajaCierre= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCajaCierre.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCajaCierre,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCajaCierre.add(this.jMenuItemDetalleCerrarCajaCierre);
		
		this.jmenuDetalleAccionesCajaCierre.add(this.jMenuItemActualizarCajaCierre);
		this.jmenuDetalleAccionesCajaCierre.add(this.jMenuItemEliminarCajaCierre);
		this.jmenuDetalleAccionesCajaCierre.add(this.jMenuItemCancelarCajaCierre);		
		
		//this.jmenuDetalleDatosCajaCierre.add(this.jMenuItemDetalleAbrirOrderByCajaCierre);				
		this.jmenuDetalleDatosCajaCierre.add(this.jMenuItemDetalleMostarOcultarCajaCierre);				
				
		//this.jmenuDetalleAccionesCajaCierre.add(this.jMenuItemGuardarCambiosCajaCierre);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCajaCierre.add(this.jmenuDetalleArchivoCajaCierre);		
		this.jmenuBarDetalleCajaCierre.add(this.jmenuDetalleAccionesCajaCierre);		
		this.jmenuBarDetalleCajaCierre.add(this.jmenuDetalleDatosCajaCierre);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCajaCierre);				
	}
	
	
	public void inicializarElementosCamposCajaCierre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCajaCierre = new JLabelMe();
		jLabelIdCajaCierre.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCajaCierre = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCajaCierre= new GridBagLayout();

		this.jPanelidCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);

		jLabelidCajaCierre = new JLabel();
		jLabelidCajaCierre.setText("Id");

		jLabelidCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_cierreCajaCierre = new JLabelMe();
		this.jLabelfecha_cierreCajaCierre.setText(""+CajaCierreConstantesFunciones.LABEL_FECHACIERRE+" : *");
		this.jLabelfecha_cierreCajaCierre.setToolTipText("Fecha Cierre");
		this.jLabelfecha_cierreCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_cierreCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_cierreCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_cierreCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_cierreCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_cierreCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_FECHACIERRE);
		this.gridaBagLayoutCajaCierre = new GridBagLayout();
		this.jPanelfecha_cierreCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);


		//jFormattedTextFieldfecha_cierreCajaCierre= new JFormattedTextFieldMe();

		jDateChooserfecha_cierreCajaCierre= new JDateChooser();
		jDateChooserfecha_cierreCajaCierre.setEnabled(false);
		jDateChooserfecha_cierreCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cierreCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cierreCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_cierreCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_cierreCajaCierre.setDate(new Date());
		jDateChooserfecha_cierreCajaCierre.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_cierreCajaCierre.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_cierreCajaCierreBusqueda= new JButtonMe();
		this.jButtonfecha_cierreCajaCierreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cierreCajaCierreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cierreCajaCierreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_cierreCajaCierreBusqueda.setText("U");
		this.jButtonfecha_cierreCajaCierreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_cierreCajaCierreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_cierreCajaCierreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_cierreCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_cierreCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_cierreCajaCierreBusqueda"));

		if(this.cajacierreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_cierreCajaCierreBusqueda.setVisible(false);		}


					
		this.jLabelhora_cierreCajaCierre = new JLabelMe();
		this.jLabelhora_cierreCajaCierre.setText(""+CajaCierreConstantesFunciones.LABEL_HORACIERRE+" : *");
		this.jLabelhora_cierreCajaCierre.setToolTipText("Hora Cierre");
		this.jLabelhora_cierreCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_cierreCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_cierreCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_cierreCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_cierreCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_cierreCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_HORACIERRE);
		this.gridaBagLayoutCajaCierre = new GridBagLayout();
		this.jPanelhora_cierreCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);


		//jFormattedTextFieldhora_cierreCajaCierre= new JFormattedTextFieldMe();

		jSpinnerhora_cierreCajaCierre= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_cierreCajaCierre.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_cierreCajaCierre = new JSpinner.DateEditor(jSpinnerhora_cierreCajaCierre, "HH:mm:ss");

		jSpinnerhora_cierreCajaCierre.setEditor(timeEditorhora_cierreCajaCierre);

		jSpinnerhora_cierreCajaCierre.setValue(new Date());

		jSpinnerhora_cierreCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_cierreCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_cierreCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_cierreCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_cierreCajaCierre.setValue(new Date());
		//jSpinnerhora_cierreCajaCierre.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_cierreCajaCierre.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_cierreCajaCierreBusqueda= new JButtonMe();
		this.jButtonhora_cierreCajaCierreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_cierreCajaCierreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_cierreCajaCierreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_cierreCajaCierreBusqueda.setText("U");
		this.jButtonhora_cierreCajaCierreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_cierreCajaCierreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_cierreCajaCierreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_cierreCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_cierreCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_cierreCajaCierreBusqueda"));

		if(this.cajacierreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_cierreCajaCierreBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoCajaCierre = new JLabelMe();
		this.jLabelesta_activoCajaCierre.setText(""+CajaCierreConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoCajaCierre.setToolTipText("Esta Activo");
		this.jLabelesta_activoCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutCajaCierre = new GridBagLayout();
		this.jPanelesta_activoCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);


		jCheckBoxesta_activoCajaCierre= new JCheckBoxMe();
		jCheckBoxesta_activoCajaCierre.setEnabled(false);

		jCheckBoxesta_activoCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoCajaCierreBusqueda= new JButtonMe();
		this.jButtonesta_activoCajaCierreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCajaCierreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoCajaCierreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoCajaCierreBusqueda.setText("U");
		this.jButtonesta_activoCajaCierreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoCajaCierreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoCajaCierreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoCajaCierreBusqueda"));

		if(this.cajacierreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoCajaCierreBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCajaCierre() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCajaCierre = new JLabelMe();
		this.jLabelid_empresaCajaCierre.setText(""+CajaCierreConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCajaCierre.setToolTipText("Empresa");
		this.jLabelid_empresaCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCajaCierre = new GridBagLayout();
		this.jPanelid_empresaCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);


		jComboBoxid_empresaCajaCierre= new JComboBoxMe();
		jComboBoxid_empresaCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCajaCierre.setEnabled(false);

		this.jButtonid_empresaCajaCierre= new JButtonMe();
		this.jButtonid_empresaCajaCierre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaCierre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaCierre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCajaCierre.setText("Buscar");
		this.jButtonid_empresaCajaCierre.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCajaCierre.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaCierre,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaCierre"));

		this.jButtonid_empresaCajaCierreBusqueda= new JButtonMe();
		this.jButtonid_empresaCajaCierreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaCierreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaCierreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaCierreBusqueda.setText("U");
		this.jButtonid_empresaCajaCierreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCajaCierreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaCierreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaCierreBusqueda"));

		if(this.cajacierreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCajaCierreBusqueda.setVisible(false);		}

		this.jButtonid_empresaCajaCierreUpdate= new JButtonMe();
		this.jButtonid_empresaCajaCierreUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaCierreUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCajaCierreUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCajaCierreUpdate.setText("U");
		this.jButtonid_empresaCajaCierreUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCajaCierreUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCajaCierreUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCajaCierreUpdate"));



					
		this.jLabelid_sucursalCajaCierre = new JLabelMe();
		this.jLabelid_sucursalCajaCierre.setText(""+CajaCierreConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCajaCierre.setToolTipText("Sucursal");
		this.jLabelid_sucursalCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCajaCierre = new GridBagLayout();
		this.jPanelid_sucursalCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);


		jComboBoxid_sucursalCajaCierre= new JComboBoxMe();
		jComboBoxid_sucursalCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCajaCierre.setEnabled(false);

		this.jButtonid_sucursalCajaCierre= new JButtonMe();
		this.jButtonid_sucursalCajaCierre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaCierre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaCierre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCajaCierre.setText("Buscar");
		this.jButtonid_sucursalCajaCierre.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCajaCierre.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaCierre,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaCierre"));

		this.jButtonid_sucursalCajaCierreBusqueda= new JButtonMe();
		this.jButtonid_sucursalCajaCierreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaCierreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaCierreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaCierreBusqueda.setText("U");
		this.jButtonid_sucursalCajaCierreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCajaCierreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaCierreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaCierreBusqueda"));

		if(this.cajacierreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCajaCierreBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCajaCierreUpdate= new JButtonMe();
		this.jButtonid_sucursalCajaCierreUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaCierreUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCajaCierreUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCajaCierreUpdate.setText("U");
		this.jButtonid_sucursalCajaCierreUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCajaCierreUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCajaCierreUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCajaCierreUpdate"));



					
		this.jLabelid_cajaCajaCierre = new JLabelMe();
		this.jLabelid_cajaCajaCierre.setText(""+CajaCierreConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaCajaCierre.setToolTipText("Caja");
		this.jLabelid_cajaCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaCajaCierre=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaCajaCierre.setToolTipText(CajaCierreConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutCajaCierre = new GridBagLayout();
		this.jPanelid_cajaCajaCierre.setLayout(this.gridaBagLayoutCajaCierre);


		jComboBoxid_cajaCajaCierre= new JComboBoxMe();
		jComboBoxid_cajaCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaCajaCierre= new JButtonMe();
		this.jButtonid_cajaCajaCierre.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaCierre.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaCierre.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaCajaCierre.setText("Buscar");
		this.jButtonid_cajaCajaCierre.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaCajaCierre.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaCierre,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaCierre"));

		this.jButtonid_cajaCajaCierreBusqueda= new JButtonMe();
		this.jButtonid_cajaCajaCierreBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaCierreBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaCierreBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaCierreBusqueda.setText("U");
		this.jButtonid_cajaCajaCierreBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaCajaCierreBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaCierreBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaCierreBusqueda"));

		if(this.cajacierreSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaCajaCierreBusqueda.setVisible(false);		}

		this.jButtonid_cajaCajaCierreUpdate= new JButtonMe();
		this.jButtonid_cajaCajaCierreUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaCierreUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaCajaCierreUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaCajaCierreUpdate.setText("U");
		this.jButtonid_cajaCajaCierreUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaCajaCierreUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaCajaCierreUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaCajaCierre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaCajaCierre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaCajaCierreUpdate"));



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
		//this.jInternalFrameDetalleCajaCierre = new CajaCierreBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Caja Cierre DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCajaCierre= new GridBagLayout();
		

		
		String sToolTipCajaCierre="";
		sToolTipCajaCierre=CajaCierreConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCajaCierre+="(PuntoVenta.CajaCierre)";
		}
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			sToolTipCajaCierre+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCajaCierre = new JButtonMe();
		this.jButtonModificarCajaCierre = new JButtonMe();
        this.jButtonActualizarCajaCierre = new JButtonMe();
        this.jButtonEliminarCajaCierre = new JButtonMe();
        this.jButtonCancelarCajaCierre = new JButtonMe();
        this.jButtonGuardarCambiosCajaCierre = new JButtonMe();
		this.jButtonGuardarCambiosTablaCajaCierre = new JButtonMe();
		this.jButtonCerrarCajaCierre = new JButtonMe();
		
		this.jScrollPanelDatosCajaCierre = new JScrollPane();   
        this.jScrollPanelDatosEdicionCajaCierre = new JScrollPane();
		this.jScrollPanelDatosGeneralCajaCierre = new JScrollPane();
				
		
		
		this.jPanelCamposCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Caja Cierre";
		
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Caja Cierres" + this.sPath));
		} else {
			this.jScrollPanelDatosCajaCierre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCajaCierre.setName("jPanelCamposCajaCierre"); 

		this.jPanelCamposOcultosCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCajaCierre.setName("jPanelCamposOcultosCajaCierre"); 

        this.jPanelAccionesCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCajaCierre.setToolTipText("Acciones");
        this.jPanelAccionesCajaCierre.setName("Acciones"); 

		this.jPanelAccionesFormularioCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCajaCierre.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCajaCierre.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCajaCierre.setText("Nuevo");
		this.jButtonModificarCajaCierre.setText("Editar");
        this.jButtonActualizarCajaCierre.setText("Actualizar");
        this.jButtonEliminarCajaCierre.setText("Eliminar");
        this.jButtonCancelarCajaCierre.setText("Cancelar");
        this.jButtonGuardarCambiosCajaCierre.setText("Guardar");
		this.jButtonGuardarCambiosTablaCajaCierre.setText("Guardar");
		this.jButtonCerrarCajaCierre.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCajaCierre,"nuevo_button","Nuevo",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCajaCierre,"modificar_button","Editar",this.cajacierreSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCajaCierre,"actualizar_button","Actualizar",this.cajacierreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCajaCierre,"eliminar_button","Eliminar",this.cajacierreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCajaCierre,"cancelar_button","Cancelar",this.cajacierreSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCajaCierre,"guardarcambios_button","Guardar",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCajaCierre,"guardarcambiostabla_button","Guardar",this.cajacierreSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCajaCierre,"cerrar_button","Salir",this.cajacierreSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCajaCierre.setToolTipText("Nuevo"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCajaCierre.setToolTipText("Editar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCajaCierre.setToolTipText("Actualizar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCajaCierre.setToolTipText("Eliminar)"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCajaCierre.setToolTipText("Cancelar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCajaCierre.setToolTipText("Guardar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCajaCierre.setToolTipText("Guardar"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCajaCierre.setToolTipText("Salir"+" "+CajaCierreConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCajaCierre";
		inputMap = this.jButtonNuevoCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCajaCierre.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCajaCierre"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCajaCierre";
		inputMap = this.jButtonActualizarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCajaCierre"));
		
		//ELIMINAR
		sMapKey = "EliminarCajaCierre";
		inputMap = this.jButtonEliminarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCajaCierre"));
		
		//CANCELAR	
		sMapKey = "CancelarCajaCierre";
		inputMap = this.jButtonCancelarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCajaCierre"));
		
		//CERRAR		
		sMapKey = "CerrarCajaCierre";
		inputMap = this.jButtonCerrarCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCajaCierre"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCajaCierre";
		inputMap = this.jButtonGuardarCambiosTablaCajaCierre.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCajaCierre.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCajaCierre"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCajaCierre = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCajaCierre.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCajaCierre.setToolTipText("Nuevo CajaCierre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCajaCierre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCajaCierre.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCajaCierre.setToolTipText("Sin Cerrar Ventana CajaCierre");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCajaCierre = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCajaCierre.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCajaCierre.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCajaCierre.setText("Accion");
		this.jComboBoxTiposAccionesCajaCierre.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCajaCierre = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCajaCierre.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCajaCierre.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCajaCierre = new JLabelMe();
		
		this.jLabelAccionesCajaCierre.setText("Acciones");		
		this.jLabelAccionesCajaCierre.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaCierre.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCajaCierre.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCajaCierre();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCajaCierre();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCajaCierre=new JTabbedPane();
		this.jTabbedPaneRelacionesCajaCierre.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCajaCierre,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCajaCierre.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaCierre.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCajaCierre.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCajaCierre, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCajaCierre.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaCierre.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCajaCierre.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCajaCierre, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCajaCierre = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCajaCierre = new GridBagLayout();
		
		this.jPanelCamposCajaCierre.setLayout(gridaBagLayoutCamposCajaCierre);
		this.jPanelCamposOcultosCajaCierre.setLayout(gridaBagLayoutCamposOcultosCajaCierre);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCajaCierre.add(jLabelIdCajaCierre, this.gridBagConstraintsCajaCierre);



	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCajaCierre.add(jLabelidCajaCierre, this.gridBagConstraintsCajaCierre);


	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCajaCierre.add(jLabelid_empresaCajaCierre, this.gridBagConstraintsCajaCierre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 2;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaCierre.add(jButtonid_empresaCajaCierreBusqueda, this.gridBagConstraintsCajaCierre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 3;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCajaCierre.add(jButtonid_empresaCajaCierreUpdate, this.gridBagConstraintsCajaCierre);
	}

	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCajaCierre.add(jComboBoxid_empresaCajaCierre, this.gridBagConstraintsCajaCierre);


	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalCajaCierre.add(jLabelid_sucursalCajaCierre, this.gridBagConstraintsCajaCierre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 2;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaCierre.add(jButtonid_sucursalCajaCierreBusqueda, this.gridBagConstraintsCajaCierre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 3;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCajaCierre.add(jButtonid_sucursalCajaCierreUpdate, this.gridBagConstraintsCajaCierre);
	}

	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalCajaCierre.add(jComboBoxid_sucursalCajaCierre, this.gridBagConstraintsCajaCierre);


	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cajaCajaCierre.add(jLabelid_cajaCajaCierre, this.gridBagConstraintsCajaCierre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 2;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaCierre.add(jButtonid_cajaCajaCierreBusqueda, this.gridBagConstraintsCajaCierre);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 3;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaCajaCierre.add(jButtonid_cajaCajaCierreUpdate, this.gridBagConstraintsCajaCierre);
	}

	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cajaCajaCierre.add(jComboBoxid_cajaCajaCierre, this.gridBagConstraintsCajaCierre);


	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_cierreCajaCierre.add(jLabelfecha_cierreCajaCierre, this.gridBagConstraintsCajaCierre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 2;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_cierreCajaCierre.add(jButtonfecha_cierreCajaCierreBusqueda, this.gridBagConstraintsCajaCierre);
	}

	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_cierreCajaCierre.add(jDateChooserfecha_cierreCajaCierre, this.gridBagConstraintsCajaCierre);


	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_cierreCajaCierre.add(jLabelhora_cierreCajaCierre, this.gridBagConstraintsCajaCierre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 2;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_cierreCajaCierre.add(jButtonhora_cierreCajaCierreBusqueda, this.gridBagConstraintsCajaCierre);
	}

	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_cierreCajaCierre.add(jSpinnerhora_cierreCajaCierre, this.gridBagConstraintsCajaCierre);


	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 0;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoCajaCierre.add(jLabelesta_activoCajaCierre, this.gridBagConstraintsCajaCierre);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		//this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = 2;
		this.gridBagConstraintsCajaCierre.ipadx = 0;
		this.gridBagConstraintsCajaCierre.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoCajaCierre.add(jButtonesta_activoCajaCierreBusqueda, this.gridBagConstraintsCajaCierre);
	}

	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCajaCierre.gridy = 0;
	this.gridBagConstraintsCajaCierre.gridx = 1;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoCajaCierre.add(jCheckBoxesta_activoCajaCierre, this.gridBagConstraintsCajaCierre);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaCierre.add(this.jPanelidCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposCajaCierre % 1==0) {
		iXPanelCamposCajaCierre=0;
		iYPanelCamposCajaCierre++;
	}
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaCierre.add(this.jPanelid_cajaCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposCajaCierre % 1==0) {
		iXPanelCamposCajaCierre=0;
		iYPanelCamposCajaCierre++;
	}
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaCierre.add(this.jPanelfecha_cierreCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposCajaCierre % 1==0) {
		iXPanelCamposCajaCierre=0;
		iYPanelCamposCajaCierre++;
	}
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaCierre.add(this.jPanelhora_cierreCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposCajaCierre % 1==0) {
		iXPanelCamposCajaCierre=0;
		iYPanelCamposCajaCierre++;
	}
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCajaCierre.add(this.jPanelesta_activoCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposCajaCierre % 1==0) {
		iXPanelCamposCajaCierre=0;
		iYPanelCamposCajaCierre++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposOcultosCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposOcultosCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaCierre.add(this.jPanelid_empresaCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposOcultosCajaCierre % 1==0) {
		iXPanelCamposOcultosCajaCierre=0;
		iYPanelCamposOcultosCajaCierre++;
	}
	this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCajaCierre.gridy = iYPanelCamposOcultosCajaCierre;
	this.gridBagConstraintsCajaCierre.gridx = iXPanelCamposOcultosCajaCierre++;
	this.gridBagConstraintsCajaCierre.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCajaCierre.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCajaCierre.add(this.jPanelid_sucursalCajaCierre, this.gridBagConstraintsCajaCierre);



	if(iXPanelCamposOcultosCajaCierre % 1==0) {
		iXPanelCamposOcultosCajaCierre=0;
		iYPanelCamposOcultosCajaCierre++;
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
			
		GridBagLayout gridaBagLayoutAccionesCajaCierre= new GridBagLayout();
		this.jPanelAccionesCajaCierre.setLayout(gridaBagLayoutAccionesCajaCierre);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCajaCierre= new GridBagLayout();
		this.jPanelAccionesFormularioCajaCierre.setLayout(gridaBagLayoutAccionesFormularioCajaCierre);
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaCierre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaCierre.add(this.jComboBoxTiposAccionesFormularioCajaCierre, this.gridBagConstraintsCajaCierre);

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCajaCierre.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCajaCierre.add(this.jCheckBoxPostAccionNuevoCajaCierre, this.gridBagConstraintsCajaCierre);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaCierre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaCierre.add(this.jCheckBoxPostAccionSinCerrarCajaCierre, this.gridBagConstraintsCajaCierre);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cajacierreSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cajacierreSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCajaCierre.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCajaCierre.add(this.jCheckBoxPostAccionSinMensajeCajaCierre, this.gridBagConstraintsCajaCierre);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx = iPosXAccion++;
			
		this.jPanelAccionesCajaCierre.add(this.jButtonModificarCajaCierre, this.gridBagConstraintsCajaCierre);							

		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCajaCierre.gridy = 0;
		this.gridBagConstraintsCajaCierre.gridx =iPosXAccion++;
			
		this.jPanelAccionesCajaCierre.add(this.jButtonEliminarCajaCierre, this.gridBagConstraintsCajaCierre);
		
			
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = 0;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaCierre.add(this.jButtonActualizarCajaCierre, this.gridBagConstraintsCajaCierre);


		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = 0;		
		this.gridBagConstraintsCajaCierre.gridx = iPosXAccion++;
		
		this.jPanelAccionesCajaCierre.add(this.jButtonGuardarCambiosCajaCierre, this.gridBagConstraintsCajaCierre);	
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = 0;		
		this.gridBagConstraintsCajaCierre.gridx =iPosXAccion++;
		
		this.jPanelAccionesCajaCierre.add(this.jButtonCancelarCajaCierre, this.gridBagConstraintsCajaCierre);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCajaCierre = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCajaCierre);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cajacierreSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();						
			this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCajaCierre.gridx = 0;		
			//this.gridBagConstraintsCajaCierre.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCajaCierre.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCajaCierre.gridx =0;
		this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCajaCierre.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCajaCierre, this.gridBagConstraintsCajaCierre);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CajaCierreJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCajaCierre = new CajaCierreBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Caja Cierre DATOS");
			
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
			
	        //this.setTitle("[FOR] - Caja Cierre DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Cierre Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CajaCierreModel cajacierreModel=new CajaCierreModel(this);
			
			//SI USARA CLASE INTERNA
			//CajaCierreModel.CajaCierreFocusTraversalPolicy cajacierreFocusTraversalPolicy = cajacierreModel.new CajaCierreFocusTraversalPolicy(this);
			
			//cajacierreFocusTraversalPolicy.setcajacierreJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cajacierreModel);
			
			
			this.jContentPaneDetalleCajaCierre = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCajaCierre = new GridBagLayout();	
			this.jContentPaneDetalleCajaCierre.setLayout(gridaBagLayoutDetalleCajaCierre);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCajaCierre = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCajaCierre = new GridBagConstraints();
				this.gridBagConstraintsCajaCierre.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCajaCierre.gridx = 0;
					
				
				this.jContentPaneDetalleCajaCierre.add(jTtoolBarDetalleCajaCierre, gridBagConstraintsCajaCierre);								
				
}
			
			this.jScrollPanelDatosEdicionCajaCierre=   new JScrollPane(jContentPaneDetalleCajaCierre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaCierre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaCierre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaCierre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCajaCierre=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCajaCierre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaCierre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCajaCierre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCajaCierre.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCajaCierre.gridx = 0;
	        
			this.jContentPaneDetalleCajaCierre.add(jPanelCamposCajaCierre, gridBagConstraintsCajaCierre);
			
			
			
			
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
						&& cajacierreSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cajacierreSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCajaCierre= new GridBagConstraints();
						this.gridBagConstraintsCajaCierre.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCajaCierre.gridx = 0;
						this.jContentPaneDetalleCajaCierre.add(this.jTabbedPaneRelacionesCajaCierre, this.gridBagConstraintsCajaCierre);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCajaCierre.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCajaCierre.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCajaCierre = new GridBagConstraints();
					this.gridBagConstraintsCajaCierre.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCajaCierre.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCajaCierre.gridx = 0;
					
				
					this.jContentPaneDetalleCajaCierre.add(jPanelCamposOcultosCajaCierre, gridBagConstraintsCajaCierre);
				
					this.jPanelCamposOcultosCajaCierre.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCajaCierre.gridx = 0;
	        this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCajaCierre.add(this.jPanelAccionesFormularioCajaCierre, this.gridBagConstraintsCajaCierre);							
			
			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
	        this.gridBagConstraintsCajaCierre.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCajaCierre.gridx = 0;
	        
			
			this.jContentPaneDetalleCajaCierre.add(this.jPanelAccionesCajaCierre, this.gridBagConstraintsCajaCierre);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCajaCierre);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCajaCierre=   new JScrollPane(this.jPanelCamposCajaCierre,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCajaCierre.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaCierre.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCajaCierre.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCajaCierre.gridx = 0;
			this.gridBagConstraintsCajaCierre.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCajaCierre.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCajaCierre.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCajaCierre, this.gridBagConstraintsCajaCierre);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaCierre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCajaCierre, this.gridBagConstraintsCajaCierre);			
			
			this.gridBagConstraintsCajaCierre = new GridBagConstraints();
			this.gridBagConstraintsCajaCierre.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCajaCierre.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCajaCierre, this.gridBagConstraintsCajaCierre);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCajaCierre, this.gridBagConstraintsCajaCierre);
			
			
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCajaCierre, this.gridBagConstraintsCajaCierre);
		
			
		this.gridBagConstraintsCajaCierre = new GridBagConstraints();
		this.gridBagConstraintsCajaCierre.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCajaCierre.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCajaCierre, this.gridBagConstraintsCajaCierre);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCajaCierre;//jContentPane;
		
		return jScrollPanelDatosEdicionCajaCierre;
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
