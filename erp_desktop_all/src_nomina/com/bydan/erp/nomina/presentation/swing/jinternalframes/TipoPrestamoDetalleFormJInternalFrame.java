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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoPrestamoConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoPrestamoDetalleFormJInternalFrame extends TipoPrestamoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPrestamo;
	
	protected JMenuBar jmenuBarDetalleTipoPrestamo;
	
	protected JMenu jmenuDetalleTipoPrestamo;
	protected JMenu jmenuDetalleArchivoTipoPrestamo;
	protected JMenu jmenuDetalleAccionesTipoPrestamo;
	protected JMenu jmenuDetalleDatosTipoPrestamo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrestamo;	
	protected GridBagConstraints gridBagConstraintsTipoPrestamo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPrestamoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPrestamo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public TipoPrestamoSessionBean tipoprestamoSessionBean;
	
	

	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;
	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrestamo=false;
	public PrestamoSessionBean prestamoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public TipoPrestamoLogic tipoprestamoLogic;
	
	public JScrollPane jScrollPanelDatosTipoPrestamo;
	public JScrollPane jScrollPanelDatosEdicionTipoPrestamo;
	public JScrollPane jScrollPanelDatosGeneralTipoPrestamo;
	
	protected JPanel jPanelCamposTipoPrestamo;    
	protected JPanel jPanelCamposOcultosTipoPrestamo;    	
	protected JPanel jPanelAccionesTipoPrestamo;
	protected JPanel jPanelAccionesFormularioTipoPrestamo;
    
	
	
	protected Integer iXPanelCamposTipoPrestamo=0;
	protected Integer iYPanelCamposTipoPrestamo=0;
	
	protected Integer iXPanelCamposOcultosTipoPrestamo=0;
	protected Integer iYPanelCamposOcultosTipoPrestamo=0;
	
	;
	
	protected JTabbedPane jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo;
	protected JButton jButtonRelacionesFinformas_de_pagoTipoPrestamo;
	protected JPanel jPanelAccionesRelacionesFinTipoPrestamo;
	protected JButton jButtonRelacionesFinNormalTipoPrestamo;
	Integer iPosXAccionesRelacionesFin=0;;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPrestamo;
	public JButton jButtonModificarTipoPrestamo;
	public JButton jButtonActualizarTipoPrestamo;
    public JButton jButtonEliminarTipoPrestamo;
	public JButton jButtonCancelarTipoPrestamo;
    public JButton jButtonGuardarCambiosTipoPrestamo;
	public JButton jButtonGuardarCambiosTablaTipoPrestamo;
	protected JButton jButtonCerrarTipoPrestamo;
	
	
	protected JButton jButtonProcesarInformacionTipoPrestamo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPrestamo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPrestamo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPrestamo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrestamo;
	protected JButton jButtonModificarToolBarTipoPrestamo;
	protected JButton jButtonActualizarToolBarTipoPrestamo;
    protected JButton jButtonEliminarToolBarTipoPrestamo;
	protected JButton jButtonCancelarToolBarTipoPrestamo;
    protected JButton jButtonGuardarCambiosToolBarTipoPrestamo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPrestamo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrestamo;
	protected JButton jButtonCerrarToolBarTipoPrestamo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPrestamo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrestamo;
	protected JMenuItem jMenuItemModificarTipoPrestamo;
	protected JMenuItem jMenuItemActualizarTipoPrestamo;
    protected JMenuItem jMenuItemEliminarTipoPrestamo;
	protected JMenuItem jMenuItemCancelarTipoPrestamo;
    protected JMenuItem jMenuItemGuardarCambiosTipoPrestamo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrestamo;
	protected JMenuItem jMenuItemCerrarTipoPrestamo;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrestamo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrestamo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPrestamo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrestamo;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrestamo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrestamo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrestamo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrestamo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPrestamo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPrestamo;
	public JLabel jLabelIdTipoPrestamo;
	public JLabel jLabelidTipoPrestamo;
	public JButton jButtonidTipoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPrestamo;
	public JLabel jLabelcodigoTipoPrestamo;
	public JTextField jTextFieldcodigoTipoPrestamo;
	public JButton jButtoncodigoTipoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPrestamo;
	public JLabel jLabelnombreTipoPrestamo;
	public JTextArea jTextAreanombreTipoPrestamo;
	public JScrollPane jscrollPanenombreTipoPrestamo;
	public JButton jButtonnombreTipoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelcon_pagoTipoPrestamo;
	public JLabel jLabelcon_pagoTipoPrestamo;
	public JCheckBox jCheckBoxcon_pagoTipoPrestamo;
	public JButton jButtoncon_pagoTipoPrestamoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoPrestamo;
	public JLabel jLabelid_empresaTipoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoPrestamo;
	public JButton jButtonid_empresaTipoPrestamo= new JButtonMe();
	public JButton jButtonid_empresaTipoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaTipoPrestamo;
	public JLabel jLabelid_rubro_empleaTipoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaTipoPrestamo;
	public JButton jButtonid_rubro_empleaTipoPrestamo= new JButtonMe();
	public JButton jButtonid_rubro_empleaTipoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaTipoPrestamoBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableTipoPrestamo;
	public JLabel jLabelid_cuenta_contableTipoPrestamo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableTipoPrestamo;
	public JButton jButtonid_cuenta_contableTipoPrestamo= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoPrestamoUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoPrestamoBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableTipoPrestamoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPrestamo;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoPrestamoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPrestamo=new JPanel();
				this.jPanelAccionesFormularioTipoPrestamo=new JPanel();
				this.jmenuBarDetalleTipoPrestamo=new JMenuBar();
				this.jTtoolBarDetalleTipoPrestamo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPrestamoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPrestamoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrestamo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPrestamo() {
		return this.jButtonActualizarToolBarTipoPrestamo;
	}
	
	public JButton getjButtonEliminarToolBarTipoPrestamo() {
		return this.jButtonEliminarToolBarTipoPrestamo;
	}
	
	public JButton getjButtonCancelarToolBarTipoPrestamo() {
		return this.jButtonCancelarToolBarTipoPrestamo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPrestamo() {
		return this.jButtonProcesarInformacionTipoPrestamo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrestamo)	{
		this.jButtonProcesarInformacionTipoPrestamo = jButtonProcesarInformacionTipoPrestamo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrestamo() {
		return this.jComboBoxTiposAccionesTipoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrestamo(
			JComboBox jComboBoxTiposRelacionesTipoPrestamo) {
		this.jComboBoxTiposRelacionesTipoPrestamo = jComboBoxTiposRelacionesTipoPrestamo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrestamo(
			JComboBox jComboBoxTiposAccionesTipoPrestamo) {
		this.jComboBoxTiposAccionesTipoPrestamo = jComboBoxTiposAccionesTipoPrestamo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPrestamo() {
		return this.jComboBoxTiposAccionesFormularioTipoPrestamo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPrestamo(
			JComboBox jComboBoxTiposAccionesFormularioTipoPrestamo) {
		this.jComboBoxTiposAccionesFormularioTipoPrestamo = jComboBoxTiposAccionesFormularioTipoPrestamo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoprestamoSessionBean=new TipoPrestamoSessionBean();
		
		this.tipoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoprestamoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.prestamoSessionBean=new PrestamoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPrestamoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prestamo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPrestamo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPrestamo=new JButtonMe();
				this.jButtonModificarToolBarTipoPrestamo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPrestamo,this.jTtoolBarDetalleTipoPrestamo,
							"actualizar","actualizar","Actualizar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPrestamo,this.jTtoolBarDetalleTipoPrestamo,
							"eliminar","eliminar","Eliminar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPrestamo,this.jTtoolBarDetalleTipoPrestamo,
							"cancelar","cancelar","Cancelar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPrestamo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPrestamo,this.jTtoolBarDetalleTipoPrestamo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPrestamo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPrestamo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPrestamo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPrestamo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPrestamo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrestamo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrestamo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrestamo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPrestamo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPrestamo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPrestamo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPrestamo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPrestamo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPrestamo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPrestamo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPrestamo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPrestamo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPrestamo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPrestamo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPrestamo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPrestamo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrestamo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrestamo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPrestamo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPrestamo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPrestamo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrestamo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrestamo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrestamo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPrestamo.add(this.jMenuItemDetalleCerrarTipoPrestamo);
		
		this.jmenuDetalleAccionesTipoPrestamo.add(this.jMenuItemActualizarTipoPrestamo);
		this.jmenuDetalleAccionesTipoPrestamo.add(this.jMenuItemEliminarTipoPrestamo);
		this.jmenuDetalleAccionesTipoPrestamo.add(this.jMenuItemCancelarTipoPrestamo);		
		
		//this.jmenuDetalleDatosTipoPrestamo.add(this.jMenuItemDetalleAbrirOrderByTipoPrestamo);				
		this.jmenuDetalleDatosTipoPrestamo.add(this.jMenuItemDetalleMostarOcultarTipoPrestamo);				
				
		//this.jmenuDetalleAccionesTipoPrestamo.add(this.jMenuItemGuardarCambiosTipoPrestamo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPrestamo.add(this.jmenuDetalleArchivoTipoPrestamo);		
		this.jmenuBarDetalleTipoPrestamo.add(this.jmenuDetalleAccionesTipoPrestamo);		
		this.jmenuBarDetalleTipoPrestamo.add(this.jmenuDetalleDatosTipoPrestamo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoPrestamo.add(this.jmenuDetalleTipoPrestamo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPrestamo);				
	}
	
	
	public void inicializarElementosCamposTipoPrestamo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPrestamo = new JLabelMe();
		jLabelIdTipoPrestamo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPrestamo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPrestamo= new GridBagLayout();

		this.jPanelidTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);

		jLabelidTipoPrestamo = new JLabel();
		jLabelidTipoPrestamo.setText("Id");

		jLabelidTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPrestamo = new JLabelMe();
		this.jLabelcodigoTipoPrestamo.setText(""+TipoPrestamoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPrestamo.setToolTipText("Codigo");
		this.jLabelcodigoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPrestamo = new GridBagLayout();
		this.jPanelcodigoTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);


		jTextFieldcodigoTipoPrestamo= new JTextFieldMe();

		jTextFieldcodigoTipoPrestamo.setEnabled(false);
		jTextFieldcodigoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPrestamoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPrestamoBusqueda.setText("U");
		this.jButtoncodigoTipoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPrestamoBusqueda"));

		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPrestamo = new JLabelMe();
		this.jLabelnombreTipoPrestamo.setText(""+TipoPrestamoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPrestamo.setToolTipText("Nombre");
		this.jLabelnombreTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPrestamo = new GridBagLayout();
		this.jPanelnombreTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);


		jTextAreanombreTipoPrestamo= new JTextAreaMe();
		jTextAreanombreTipoPrestamo.setEnabled(false);
		jTextAreanombreTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrestamo.setLineWrap(true);
		jTextAreanombreTipoPrestamo.setWrapStyleWord(true);
		jTextAreanombreTipoPrestamo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPrestamo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPrestamo = new JScrollPane(jTextAreanombreTipoPrestamo);
		jscrollPanenombreTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPrestamoBusqueda= new JButtonMe();
		this.jButtonnombreTipoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPrestamoBusqueda.setText("U");
		this.jButtonnombreTipoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPrestamoBusqueda"));

		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPrestamoBusqueda.setVisible(false);		}


					
		this.jLabelcon_pagoTipoPrestamo = new JLabelMe();
		this.jLabelcon_pagoTipoPrestamo.setText(""+TipoPrestamoConstantesFunciones.LABEL_CONPAGO+" : *");
		this.jLabelcon_pagoTipoPrestamo.setToolTipText("Con Pago");
		this.jLabelcon_pagoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_pagoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_pagoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_pagoTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_pagoTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_pagoTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_CONPAGO);
		this.gridaBagLayoutTipoPrestamo = new GridBagLayout();
		this.jPanelcon_pagoTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);


		jCheckBoxcon_pagoTipoPrestamo= new JCheckBoxMe();
		jCheckBoxcon_pagoTipoPrestamo.setEnabled(false);

		jCheckBoxcon_pagoTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_pagoTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_pagoTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_pagoTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_pagoTipoPrestamoBusqueda= new JButtonMe();
		this.jButtoncon_pagoTipoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_pagoTipoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_pagoTipoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_pagoTipoPrestamoBusqueda.setText("U");
		this.jButtoncon_pagoTipoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_pagoTipoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_pagoTipoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_pagoTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_pagoTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_pagoTipoPrestamoBusqueda"));

		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_pagoTipoPrestamoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPrestamo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoPrestamo = new JLabelMe();
		this.jLabelid_empresaTipoPrestamo.setText(""+TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoPrestamo.setToolTipText("Empresa");
		this.jLabelid_empresaTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoPrestamo = new GridBagLayout();
		this.jPanelid_empresaTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);


		jComboBoxid_empresaTipoPrestamo= new JComboBoxMe();
		jComboBoxid_empresaTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoPrestamo.setEnabled(false);

		this.jButtonid_empresaTipoPrestamo= new JButtonMe();
		this.jButtonid_empresaTipoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPrestamo.setText("Buscar");
		this.jButtonid_empresaTipoPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrestamo"));

		this.jButtonid_empresaTipoPrestamoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPrestamoBusqueda.setText("U");
		this.jButtonid_empresaTipoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrestamoBusqueda"));

		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoPrestamoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPrestamoUpdate.setText("U");
		this.jButtonid_empresaTipoPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPrestamoUpdate"));



					
		this.jLabelid_rubro_empleaTipoPrestamo = new JLabelMe();
		this.jLabelid_rubro_empleaTipoPrestamo.setText(""+TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaTipoPrestamo.setToolTipText("Idrubro Emplea");
		this.jLabelid_rubro_empleaTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutTipoPrestamo = new GridBagLayout();
		this.jPanelid_rubro_empleaTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);


		jComboBoxid_rubro_empleaTipoPrestamo= new JComboBoxMe();
		jComboBoxid_rubro_empleaTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaTipoPrestamo= new JButtonMe();
		this.jButtonid_rubro_empleaTipoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaTipoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaTipoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaTipoPrestamo.setText("Buscar");
		this.jButtonid_rubro_empleaTipoPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaTipoPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaTipoPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaTipoPrestamo"));

		this.jButtonid_rubro_empleaTipoPrestamoBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setText("U");
		this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaTipoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaTipoPrestamoBusqueda"));

		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaTipoPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaTipoPrestamoUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaTipoPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaTipoPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaTipoPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaTipoPrestamoUpdate.setText("U");
		this.jButtonid_rubro_empleaTipoPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaTipoPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaTipoPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaTipoPrestamoUpdate"));



					
		this.jLabelid_cuenta_contableTipoPrestamo = new JLabelMe();
		this.jLabelid_cuenta_contableTipoPrestamo.setText(""+TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableTipoPrestamo.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableTipoPrestamo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableTipoPrestamo.setToolTipText(TipoPrestamoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutTipoPrestamo = new GridBagLayout();
		this.jPanelid_cuenta_contableTipoPrestamo.setLayout(this.gridaBagLayoutTipoPrestamo);


		jComboBoxid_cuenta_contableTipoPrestamo= new JComboBoxMe();
		jComboBoxid_cuenta_contableTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableTipoPrestamo= new JButtonMe();
		this.jButtonid_cuenta_contableTipoPrestamo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoPrestamo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoPrestamo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableTipoPrestamo.setText("Buscar");
		this.jButtonid_cuenta_contableTipoPrestamo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableTipoPrestamo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoPrestamo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoPrestamo"));

		this.jButtonid_cuenta_contableTipoPrestamoBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setText("U");
		this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoPrestamoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoPrestamoBusqueda"));

		if(this.tipoprestamoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableTipoPrestamoBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableTipoPrestamoUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableTipoPrestamoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoPrestamoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableTipoPrestamoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableTipoPrestamoUpdate.setText("U");
		this.jButtonid_cuenta_contableTipoPrestamoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableTipoPrestamoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoPrestamoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoPrestamoUpdate"));


		jButtonid_cuenta_contableTipoPrestamoArbol= new JButtonMe();
		jButtonid_cuenta_contableTipoPrestamoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoPrestamoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoPrestamoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableTipoPrestamoArbol.setText("Arbol");
		jButtonid_cuenta_contableTipoPrestamoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableTipoPrestamoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableTipoPrestamoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableTipoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableTipoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableTipoPrestamoArbol"));



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
		//this.jInternalFrameDetalleTipoPrestamo = new TipoPrestamoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Prestamo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrestamo= new GridBagLayout();
		

		
		String sToolTipTipoPrestamo="";
		sToolTipTipoPrestamo=TipoPrestamoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrestamo+="(Nomina.TipoPrestamo)";
		}
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrestamo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPrestamo = new JButtonMe();
		this.jButtonModificarTipoPrestamo = new JButtonMe();
        this.jButtonActualizarTipoPrestamo = new JButtonMe();
        this.jButtonEliminarTipoPrestamo = new JButtonMe();
        this.jButtonCancelarTipoPrestamo = new JButtonMe();
        this.jButtonGuardarCambiosTipoPrestamo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPrestamo = new JButtonMe();
		this.jButtonCerrarTipoPrestamo = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrestamo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPrestamo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPrestamo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo=new JTabbedPane();
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.add("",new JPanel());
		this.jButtonRelacionesFinformas_de_pagoTipoPrestamo=new JButtonMe();
		this.jPanelAccionesRelacionesFinTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jButtonRelacionesFinNormalTipoPrestamo=new JButtonMe();;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prestamo";
		
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Prestamos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPrestamo.setName("jPanelCamposTipoPrestamo"); 

		this.jPanelCamposOcultosTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPrestamo.setName("jPanelCamposOcultosTipoPrestamo"); 

        this.jPanelAccionesTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrestamo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPrestamo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPrestamo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("formas_de_pago"));
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setName("jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo");
		this.jButtonRelacionesFinformas_de_pagoTipoPrestamo.setText("FORMAS DE PAGO");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinformas_de_pagoTipoPrestamo,"relaciones_fin_button","FORMAS DE PAGO",true);
		this.jButtonRelacionesFinformas_de_pagoTipoPrestamo.setToolTipText("FORMAS DE PAGO");

		this.jPanelAccionesRelacionesFinTipoPrestamo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelAccionesRelacionesFinTipoPrestamo.setName("jPanelAccionesRelacionesFinTipoPrestamo");
		this.jButtonRelacionesFinNormalTipoPrestamo.setText("NORMAL");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinNormalTipoPrestamo,"relaciones_fin_button","NORMAL",true);
		this.jButtonRelacionesFinNormalTipoPrestamo.setToolTipText("NORMAL");;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPrestamo.setText("Nuevo");
		this.jButtonModificarTipoPrestamo.setText("Editar");
        this.jButtonActualizarTipoPrestamo.setText("Actualizar");
        this.jButtonEliminarTipoPrestamo.setText("Eliminar");
        this.jButtonCancelarTipoPrestamo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPrestamo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPrestamo.setText("Guardar");
		this.jButtonCerrarTipoPrestamo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrestamo,"nuevo_button","Nuevo",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPrestamo,"modificar_button","Editar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPrestamo,"actualizar_button","Actualizar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPrestamo,"eliminar_button","Eliminar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPrestamo,"cancelar_button","Cancelar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPrestamo,"guardarcambios_button","Guardar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrestamo,"guardarcambiostabla_button","Guardar",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrestamo,"cerrar_button","Salir",this.tipoprestamoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPrestamo.setToolTipText("Nuevo"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPrestamo.setToolTipText("Editar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPrestamo.setToolTipText("Actualizar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPrestamo.setToolTipText("Eliminar)"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPrestamo.setToolTipText("Cancelar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPrestamo.setToolTipText("Guardar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPrestamo.setToolTipText("Guardar"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrestamo.setToolTipText("Salir"+" "+TipoPrestamoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrestamo";
		inputMap = this.jButtonNuevoTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrestamo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrestamo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPrestamo";
		inputMap = this.jButtonActualizarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPrestamo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPrestamo";
		inputMap = this.jButtonEliminarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPrestamo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPrestamo";
		inputMap = this.jButtonCancelarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPrestamo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPrestamo";
		inputMap = this.jButtonCerrarTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrestamo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrestamo";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrestamo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrestamo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrestamo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPrestamo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPrestamo.setToolTipText("Nuevo TipoPrestamo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPrestamo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPrestamo.setToolTipText("Sin Cerrar Ventana TipoPrestamo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPrestamo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPrestamo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPrestamo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrestamo.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrestamo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPrestamo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPrestamo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPrestamo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPrestamo = new JLabelMe();
		
		this.jLabelAccionesTipoPrestamo.setText("Acciones");		
		this.jLabelAccionesTipoPrestamo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrestamo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrestamo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPrestamo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPrestamo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPrestamo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPrestamo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPrestamo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPrestamo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrestamo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrestamo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrestamo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPrestamo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrestamo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrestamo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPrestamo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPrestamo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPrestamo = new GridBagLayout();
		
		this.jPanelCamposTipoPrestamo.setLayout(gridaBagLayoutCamposTipoPrestamo);
		this.jPanelCamposOcultosTipoPrestamo.setLayout(gridaBagLayoutCamposOcultosTipoPrestamo);
		
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setMinimumSize(new Dimension(this.getWidth(),TipoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setMaximumSize(new Dimension(this.getWidth(),TipoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setPreferredSize(new Dimension(this.getWidth(),TipoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
		GridBagLayout gridaBagLayoutAccionesRelacionesFinTipoPrestamo= new GridBagLayout();
		this.jPanelAccionesRelacionesFinTipoPrestamo.setLayout(gridaBagLayoutAccionesRelacionesFinTipoPrestamo);;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPrestamo.add(jLabelIdTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPrestamo.add(jLabelidTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoPrestamo.add(jLabelid_empresaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 2;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPrestamo.add(jButtonid_empresaTipoPrestamoBusqueda, this.gridBagConstraintsTipoPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 3;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPrestamo.add(jButtonid_empresaTipoPrestamoUpdate, this.gridBagConstraintsTipoPrestamo);
	}

	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoPrestamo.add(jComboBoxid_empresaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaTipoPrestamo.add(jLabelid_rubro_empleaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 2;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaTipoPrestamo.add(jButtonid_rubro_empleaTipoPrestamoBusqueda, this.gridBagConstraintsTipoPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 3;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaTipoPrestamo.add(jButtonid_rubro_empleaTipoPrestamoUpdate, this.gridBagConstraintsTipoPrestamo);
	}

	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaTipoPrestamo.add(jComboBoxid_rubro_empleaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableTipoPrestamo.add(jLabelid_cuenta_contableTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 2;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoPrestamo.add(jButtonid_cuenta_contableTipoPrestamoBusqueda, this.gridBagConstraintsTipoPrestamo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 3;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableTipoPrestamo.add(jButtonid_cuenta_contableTipoPrestamoUpdate, this.gridBagConstraintsTipoPrestamo);
	}

	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableTipoPrestamo.add(jComboBoxid_cuenta_contableTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPrestamo.add(jLabelcodigoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 2;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPrestamo.add(jButtoncodigoTipoPrestamoBusqueda, this.gridBagConstraintsTipoPrestamo);
	}

	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPrestamo.add(jTextFieldcodigoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPrestamo.add(jLabelnombreTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 2;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPrestamo.add(jButtonnombreTipoPrestamoBusqueda, this.gridBagConstraintsTipoPrestamo);
	}

	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPrestamo.add(jscrollPanenombreTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 0;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_pagoTipoPrestamo.add(jLabelcon_pagoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = 2;
		this.gridBagConstraintsTipoPrestamo.ipadx = 0;
		this.gridBagConstraintsTipoPrestamo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_pagoTipoPrestamo.add(jButtoncon_pagoTipoPrestamoBusqueda, this.gridBagConstraintsTipoPrestamo);
	}

	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrestamo.gridy = 0;
	this.gridBagConstraintsTipoPrestamo.gridx = 1;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_pagoTipoPrestamo.add(jCheckBoxcon_pagoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrestamo.add(this.jPanelidTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposTipoPrestamo % 1==0) {
		iXPanelCamposTipoPrestamo=0;
		iYPanelCamposTipoPrestamo++;
	}
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrestamo.add(this.jPanelid_rubro_empleaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposTipoPrestamo % 1==0) {
		iXPanelCamposTipoPrestamo=0;
		iYPanelCamposTipoPrestamo++;
	}
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrestamo.add(this.jPanelid_cuenta_contableTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposTipoPrestamo % 1==0) {
		iXPanelCamposTipoPrestamo=0;
		iYPanelCamposTipoPrestamo++;
	}
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrestamo.add(this.jPanelcodigoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposTipoPrestamo % 1==0) {
		iXPanelCamposTipoPrestamo=0;
		iYPanelCamposTipoPrestamo++;
	}
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrestamo.add(this.jPanelnombreTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposTipoPrestamo % 1==0) {
		iXPanelCamposTipoPrestamo=0;
		iYPanelCamposTipoPrestamo++;
	}
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrestamo.add(this.jPanelcon_pagoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposTipoPrestamo % 1==0) {
		iXPanelCamposTipoPrestamo=0;
		iYPanelCamposTipoPrestamo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrestamo.gridy = iYPanelCamposOcultosTipoPrestamo;
	this.gridBagConstraintsTipoPrestamo.gridx = iXPanelCamposOcultosTipoPrestamo++;
	this.gridBagConstraintsTipoPrestamo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrestamo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoPrestamo.add(this.jPanelid_empresaTipoPrestamo, this.gridBagConstraintsTipoPrestamo);



	if(iXPanelCamposOcultosTipoPrestamo % 1==0) {
		iXPanelCamposOcultosTipoPrestamo=0;
		iYPanelCamposOcultosTipoPrestamo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPrestamo= new GridBagLayout();
		this.jPanelAccionesTipoPrestamo.setLayout(gridaBagLayoutAccionesTipoPrestamo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPrestamo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPrestamo.setLayout(gridaBagLayoutAccionesFormularioTipoPrestamo);
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrestamo.add(this.jComboBoxTiposAccionesFormularioTipoPrestamo, this.gridBagConstraintsTipoPrestamo);

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrestamo.add(this.jCheckBoxPostAccionNuevoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrestamo.add(this.jCheckBoxPostAccionSinCerrarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoprestamoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrestamo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrestamo.add(this.jCheckBoxPostAccionSinMensajeTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPrestamo.add(this.jButtonModificarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);							

		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrestamo.gridy = 0;
		this.gridBagConstraintsTipoPrestamo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPrestamo.add(this.jButtonEliminarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
			
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = 0;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrestamo.add(this.jButtonActualizarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);


		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = 0;		
		this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrestamo.add(this.jButtonGuardarCambiosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);	
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = 0;		
		this.gridBagConstraintsTipoPrestamo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPrestamo.add(this.jButtonCancelarTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrestamo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrestamo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoprestamoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrestamo.gridx = 0;		
			//this.gridBagConstraintsTipoPrestamo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrestamo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrestamo.gridx =0;
		this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrestamo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPrestamoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPrestamo = new TipoPrestamoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Prestamo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Prestamo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prestamo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPrestamoModel tipoprestamoModel=new TipoPrestamoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPrestamoModel.TipoPrestamoFocusTraversalPolicy tipoprestamoFocusTraversalPolicy = tipoprestamoModel.new TipoPrestamoFocusTraversalPolicy(this);
			
			//tipoprestamoFocusTraversalPolicy.settipoprestamoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoprestamoModel);
			
			
			this.jContentPaneDetalleTipoPrestamo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPrestamo = new GridBagLayout();	
			this.jContentPaneDetalleTipoPrestamo.setLayout(gridaBagLayoutDetalleTipoPrestamo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrestamo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPrestamo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPrestamo.add(jTtoolBarDetalleTipoPrestamo, gridBagConstraintsTipoPrestamo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPrestamo=   new JScrollPane(jContentPaneDetalleTipoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPrestamo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPrestamo.gridx = 0;
	        
			this.jContentPaneDetalleTipoPrestamo.add(jPanelCamposTipoPrestamo, gridBagConstraintsTipoPrestamo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrestamo.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;
				this.gridBagConstraintsTipoPrestamo.gridx = 0;

				this.jContentPaneDetalleTipoPrestamo.add(this.jPanelAccionesRelacionesFinTipoPrestamo, gridBagConstraintsTipoPrestamo);;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				

				if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.puedeCargarPorPartePrestamo=true;
				}
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoprestamoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePrestamo(this.puedeCargarPorPartePrestamo,false,-1);
					
					if(this.tipoprestamoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPrestamo= new GridBagConstraints();
						this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPrestamo.gridx = 0;
						this.jContentPaneDetalleTipoPrestamo.add(this.jTabbedPaneRelacionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrestamo.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;
				this.gridBagConstraintsTipoPrestamo.gridx = 0;

				this.jContentPaneDetalleTipoPrestamo.add(this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo, gridBagConstraintsTipoPrestamo);

				this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setVisible(false);

				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsTipoPrestamo.gridy = 0;
				this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinTipoPrestamo.add(this.jButtonRelacionesFinNormalTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
				this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				this.gridBagConstraintsTipoPrestamo.gridy = 0;
				this.gridBagConstraintsTipoPrestamo.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinTipoPrestamo.add(this.jButtonRelacionesFinformas_de_pagoTipoPrestamo, this.gridBagConstraintsTipoPrestamo);;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPrestamo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePrestamo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPrestamo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
					this.gridBagConstraintsTipoPrestamo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPrestamo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPrestamo.add(jPanelCamposOcultosTipoPrestamo, gridBagConstraintsTipoPrestamo);
				
					this.jPanelCamposOcultosTipoPrestamo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoPrestamo.gridx = 0;
	        this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPrestamo.add(this.jPanelAccionesFormularioTipoPrestamo, this.gridBagConstraintsTipoPrestamo);							
			
			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
	        this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoPrestamo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPrestamo.add(this.jPanelAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPrestamo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPrestamo=   new JScrollPane(this.jPanelCamposTipoPrestamo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrestamo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrestamo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrestamo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrestamo.gridx = 0;
			this.gridBagConstraintsTipoPrestamo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPrestamo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPrestamo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrestamo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPrestamo, this.gridBagConstraintsTipoPrestamo);			
			
			this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
			this.gridBagConstraintsTipoPrestamo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrestamo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
			
			
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		
			
		this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
		this.gridBagConstraintsTipoPrestamo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrestamo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrestamo, this.gridBagConstraintsTipoPrestamo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPrestamo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPrestamo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePrestamo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.prestamoSessionBean=new PrestamoSessionBean();
		this.prestamoSessionBean.setConGuardarRelaciones(true);
		this.prestamoSessionBean.setEsGuardarRelacionado(true);

		this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.prestamoBeanSwingJInternalFramePopup=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.prestamoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {

				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPrestamoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.prestamoSessionBean.setEsGuardarRelacionado(true);

				this.prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.prestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.prestamoBeanSwingJInternalFrame.setprestamoSessionBean(this.prestamoSessionBean);

				//this.gridBagConstraintsTipoPrestamo = new GridBagConstraints();
				//this.gridBagConstraintsTipoPrestamo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPrestamo.gridx = 0;
				//this.jContentPaneDetalleTipoPrestamo.add(this.prestamoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPrestamo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.add("Prestamos",this.prestamoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.setComponentAt(iIndexTab,this.prestamoBeanSwingJInternalFrame.getContentPane());
				}

				//PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.prestamoSessionBean.setEsGuardarRelacionado(false);
				this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrestamo) {
					this.jTabbedPaneRelacionesFinformas_de_pagoTipoPrestamo.add("Prestamos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPrestamoBeanSwingJInternalFrame(List<TipoPrestamo> tipoprestamos,TipoPrestamo tipoprestamo,PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					prestamoBeanSwingJInternalFrame.getPrestamoLogic().setConnexion(this.tipoprestamoLogic.getConnexion());

					prestamoBeanSwingJInternalFrame.settipoprestamosForeignKey(tipoprestamos);
					prestamoBeanSwingJInternalFrame.settipoprestamoForeignKey(tipoprestamo);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setisBusquedaDesdeForeignKeySesionTipoPrestamo(true);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setlidTipoPrestamoActual(tipoprestamo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					prestamoBeanSwingJInternalFrame.cargarCombosForeignKeyPrestamo(prestamoBeanSwingJInternalFrame.isCargarCombosDependencia);
					prestamoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPrestamo(true);
					prestamoBeanSwingJInternalFrame.setid_tipo_prestamoFK_IdTipoPrestamo(tipoprestamo.getId());

					if(!this.conCargarFormDetalle) {
						prestamoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					prestamoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPrestamoForeignKey(tipoprestamo,1,false,true,true);
					prestamoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					prestamoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPrestamo");
					prestamoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPrestamo");
					prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(true);
					prestamoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrestamo("n",prestamoBeanSwingJInternalFrame.isGuardarCambiosEnLote, prestamoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					prestamoBeanSwingJInternalFrame.setAutoscrolls(true);
					prestamoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("relacionado");
					} else {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("no_relacionado");
					}

					prestamoBeanSwingJInternalFrame.getjButtonRecargarInformacionPrestamo().setVisible(false);

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
