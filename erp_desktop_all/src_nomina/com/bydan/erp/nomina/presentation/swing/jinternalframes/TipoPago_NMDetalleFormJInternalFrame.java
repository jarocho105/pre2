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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoPago_NMConstantesFunciones;

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
public class TipoPago_NMDetalleFormJInternalFrame extends TipoPago_NMBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPago_NM;
	
	protected JMenuBar jmenuBarDetalleTipoPago_NM;
	
	protected JMenu jmenuDetalleTipoPago_NM;
	protected JMenu jmenuDetalleArchivoTipoPago_NM;
	protected JMenu jmenuDetalleAccionesTipoPago_NM;
	protected JMenu jmenuDetalleDatosTipoPago_NM;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPago_NM;	
	protected GridBagConstraints gridBagConstraintsTipoPago_NM;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPago_NMBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPago_NM;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoPago_NMSessionBean tipopago_nmSessionBean;
	
	

	public EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=null;
	public EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEstructura=false;
	public EstructuraSessionBean estructuraSessionBean;

	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;
	public CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCargo=false;
	public CargoSessionBean cargoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoPago_NMLogic tipopago_nmLogic;
	
	public JScrollPane jScrollPanelDatosTipoPago_NM;
	public JScrollPane jScrollPanelDatosEdicionTipoPago_NM;
	public JScrollPane jScrollPanelDatosGeneralTipoPago_NM;
	
	protected JPanel jPanelCamposTipoPago_NM;    
	protected JPanel jPanelCamposOcultosTipoPago_NM;    	
	protected JPanel jPanelAccionesTipoPago_NM;
	protected JPanel jPanelAccionesFormularioTipoPago_NM;
    
	
	
	protected Integer iXPanelCamposTipoPago_NM=0;
	protected Integer iYPanelCamposTipoPago_NM=0;
	
	protected Integer iXPanelCamposOcultosTipoPago_NM=0;
	protected Integer iYPanelCamposOcultosTipoPago_NM=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPago_NM;
	public JButton jButtonModificarTipoPago_NM;
	public JButton jButtonActualizarTipoPago_NM;
    public JButton jButtonEliminarTipoPago_NM;
	public JButton jButtonCancelarTipoPago_NM;
    public JButton jButtonGuardarCambiosTipoPago_NM;
	public JButton jButtonGuardarCambiosTablaTipoPago_NM;
	protected JButton jButtonCerrarTipoPago_NM;
	
	
	protected JButton jButtonProcesarInformacionTipoPago_NM;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPago_NM;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPago_NM;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPago_NM;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPago_NM;
	protected JButton jButtonModificarToolBarTipoPago_NM;
	protected JButton jButtonActualizarToolBarTipoPago_NM;
    protected JButton jButtonEliminarToolBarTipoPago_NM;
	protected JButton jButtonCancelarToolBarTipoPago_NM;
    protected JButton jButtonGuardarCambiosToolBarTipoPago_NM;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPago_NM;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPago_NM;
	protected JButton jButtonCerrarToolBarTipoPago_NM;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPago_NM;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPago_NM;
	protected JMenuItem jMenuItemModificarTipoPago_NM;
	protected JMenuItem jMenuItemActualizarTipoPago_NM;
    protected JMenuItem jMenuItemEliminarTipoPago_NM;
	protected JMenuItem jMenuItemCancelarTipoPago_NM;
    protected JMenuItem jMenuItemGuardarCambiosTipoPago_NM;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPago_NM;
	protected JMenuItem jMenuItemCerrarTipoPago_NM;
	protected JMenuItem jMenuItemDetalleCerrarTipoPago_NM;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPago_NM;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPago_NM;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPago_NM;
	protected JMenuItem jMenuItemMostrarOcultarTipoPago_NM;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPago_NM;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPago_NM;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPago_NM;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPago_NM;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPago_NM;
	public JLabel jLabelIdTipoPago_NM;
	public JLabel jLabelidTipoPago_NM;
	public JButton jButtonidTipoPago_NMBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPago_NM;
	public JLabel jLabelcodigoTipoPago_NM;
	public JTextField jTextFieldcodigoTipoPago_NM;
	public JButton jButtoncodigoTipoPago_NMBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPago_NM;
	public JLabel jLabelnombreTipoPago_NM;
	public JTextArea jTextAreanombreTipoPago_NM;
	public JScrollPane jscrollPanenombreTipoPago_NM;
	public JButton jButtonnombreTipoPago_NMBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoPago_NM;
	public JLabel jLabelid_empresaTipoPago_NM;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoPago_NM;
	public JButton jButtonid_empresaTipoPago_NM= new JButtonMe();
	public JButton jButtonid_empresaTipoPago_NMUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoPago_NMBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPago_NM;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoPago_NMDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPago_NM=new JPanel();
				this.jPanelAccionesFormularioTipoPago_NM=new JPanel();
				this.jmenuBarDetalleTipoPago_NM=new JMenuBar();
				this.jTtoolBarDetalleTipoPago_NM=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPago_NMDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPago_NMDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPago_NM No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPago_NM() {
		return this.jButtonActualizarToolBarTipoPago_NM;
	}
	
	public JButton getjButtonEliminarToolBarTipoPago_NM() {
		return this.jButtonEliminarToolBarTipoPago_NM;
	}
	
	public JButton getjButtonCancelarToolBarTipoPago_NM() {
		return this.jButtonCancelarToolBarTipoPago_NM;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPago_NM() {
		return this.jButtonProcesarInformacionTipoPago_NM;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPago_NM)	{
		this.jButtonProcesarInformacionTipoPago_NM = jButtonProcesarInformacionTipoPago_NM;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPago_NM() {
		return this.jComboBoxTiposAccionesTipoPago_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPago_NM(
			JComboBox jComboBoxTiposRelacionesTipoPago_NM) {
		this.jComboBoxTiposRelacionesTipoPago_NM = jComboBoxTiposRelacionesTipoPago_NM;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPago_NM(
			JComboBox jComboBoxTiposAccionesTipoPago_NM) {
		this.jComboBoxTiposAccionesTipoPago_NM = jComboBoxTiposAccionesTipoPago_NM;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPago_NM() {
		return this.jComboBoxTiposAccionesFormularioTipoPago_NM;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPago_NM(
			JComboBox jComboBoxTiposAccionesFormularioTipoPago_NM) {
		this.jComboBoxTiposAccionesFormularioTipoPago_NM = jComboBoxTiposAccionesFormularioTipoPago_NM;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipopago_nmSessionBean=new TipoPago_NMSessionBean();
		
		this.tipopago_nmSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopago_nmSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopago_nmSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.estructuraSessionBean=new EstructuraSessionBean();
		//this.cargoSessionBean=new CargoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPago_NMJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Pago_ N M MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPago_NMJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPago_NM= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPago_NM=new JButtonMe();
				this.jButtonModificarToolBarTipoPago_NM=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPago_NM,this.jTtoolBarDetalleTipoPago_NM,
							"actualizar","actualizar","Actualizar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPago_NM,this.jTtoolBarDetalleTipoPago_NM,
							"eliminar","eliminar","Eliminar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPago_NM,this.jTtoolBarDetalleTipoPago_NM,
							"cancelar","cancelar","Cancelar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPago_NM=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPago_NM,this.jTtoolBarDetalleTipoPago_NM,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPago_NM=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPago_NM=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPago_NM=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPago_NM=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPago_NM=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPago_NM= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPago_NM.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPago_NM,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPago_NM= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPago_NM.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPago_NM,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPago_NM= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPago_NM.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPago_NM,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPago_NM= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPago_NM.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPago_NM,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPago_NM= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPago_NM.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPago_NM,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPago_NM= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPago_NM.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPago_NM,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPago_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPago_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPago_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPago_NM= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPago_NM.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPago_NM,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPago_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPago_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPago_NM,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPago_NM= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPago_NM.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPago_NM,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPago_NM.add(this.jMenuItemDetalleCerrarTipoPago_NM);
		
		this.jmenuDetalleAccionesTipoPago_NM.add(this.jMenuItemActualizarTipoPago_NM);
		this.jmenuDetalleAccionesTipoPago_NM.add(this.jMenuItemEliminarTipoPago_NM);
		this.jmenuDetalleAccionesTipoPago_NM.add(this.jMenuItemCancelarTipoPago_NM);		
		
		//this.jmenuDetalleDatosTipoPago_NM.add(this.jMenuItemDetalleAbrirOrderByTipoPago_NM);				
		this.jmenuDetalleDatosTipoPago_NM.add(this.jMenuItemDetalleMostarOcultarTipoPago_NM);				
				
		//this.jmenuDetalleAccionesTipoPago_NM.add(this.jMenuItemGuardarCambiosTipoPago_NM);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPago_NM.add(this.jmenuDetalleArchivoTipoPago_NM);		
		this.jmenuBarDetalleTipoPago_NM.add(this.jmenuDetalleAccionesTipoPago_NM);		
		this.jmenuBarDetalleTipoPago_NM.add(this.jmenuDetalleDatosTipoPago_NM);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoPago_NM.add(this.jmenuDetalleTipoPago_NM);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPago_NM);				
	}
	
	
	public void inicializarElementosCamposTipoPago_NM() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPago_NM = new JLabelMe();
		jLabelIdTipoPago_NM.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPago_NM = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPago_NM.setToolTipText(TipoPago_NMConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPago_NM= new GridBagLayout();

		this.jPanelidTipoPago_NM.setLayout(this.gridaBagLayoutTipoPago_NM);

		jLabelidTipoPago_NM = new JLabel();
		jLabelidTipoPago_NM.setText("Id");

		jLabelidTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPago_NM = new JLabelMe();
		this.jLabelcodigoTipoPago_NM.setText(""+TipoPago_NMConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPago_NM.setToolTipText("Codigo");
		this.jLabelcodigoTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPago_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPago_NM.setToolTipText(TipoPago_NMConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPago_NM = new GridBagLayout();
		this.jPanelcodigoTipoPago_NM.setLayout(this.gridaBagLayoutTipoPago_NM);


		jTextFieldcodigoTipoPago_NM= new JTextFieldMe();

		jTextFieldcodigoTipoPago_NM.setEnabled(false);
		jTextFieldcodigoTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPago_NMBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPago_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPago_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPago_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPago_NMBusqueda.setText("U");
		this.jButtoncodigoTipoPago_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPago_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPago_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPago_NMBusqueda"));

		if(this.tipopago_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPago_NMBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPago_NM = new JLabelMe();
		this.jLabelnombreTipoPago_NM.setText(""+TipoPago_NMConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPago_NM.setToolTipText("Nombre");
		this.jLabelnombreTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPago_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPago_NM.setToolTipText(TipoPago_NMConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPago_NM = new GridBagLayout();
		this.jPanelnombreTipoPago_NM.setLayout(this.gridaBagLayoutTipoPago_NM);


		jTextAreanombreTipoPago_NM= new JTextAreaMe();
		jTextAreanombreTipoPago_NM.setEnabled(false);
		jTextAreanombreTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPago_NM.setLineWrap(true);
		jTextAreanombreTipoPago_NM.setWrapStyleWord(true);
		jTextAreanombreTipoPago_NM.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPago_NM.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPago_NM = new JScrollPane(jTextAreanombreTipoPago_NM);
		jscrollPanenombreTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPago_NMBusqueda= new JButtonMe();
		this.jButtonnombreTipoPago_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPago_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPago_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPago_NMBusqueda.setText("U");
		this.jButtonnombreTipoPago_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPago_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPago_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPago_NMBusqueda"));

		if(this.tipopago_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPago_NMBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPago_NM() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoPago_NM = new JLabelMe();
		this.jLabelid_empresaTipoPago_NM.setText(""+TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoPago_NM.setToolTipText("Empresa");
		this.jLabelid_empresaTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoPago_NM=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoPago_NM.setToolTipText(TipoPago_NMConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoPago_NM = new GridBagLayout();
		this.jPanelid_empresaTipoPago_NM.setLayout(this.gridaBagLayoutTipoPago_NM);


		jComboBoxid_empresaTipoPago_NM= new JComboBoxMe();
		jComboBoxid_empresaTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoPago_NM.setEnabled(false);

		this.jButtonid_empresaTipoPago_NM= new JButtonMe();
		this.jButtonid_empresaTipoPago_NM.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPago_NM.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPago_NM.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoPago_NM.setText("Buscar");
		this.jButtonid_empresaTipoPago_NM.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoPago_NM.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPago_NM,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPago_NM"));

		this.jButtonid_empresaTipoPago_NMBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoPago_NMBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPago_NMBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPago_NMBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPago_NMBusqueda.setText("U");
		this.jButtonid_empresaTipoPago_NMBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoPago_NMBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPago_NMBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPago_NMBusqueda"));

		if(this.tipopago_nmSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoPago_NMBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoPago_NMUpdate= new JButtonMe();
		this.jButtonid_empresaTipoPago_NMUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPago_NMUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoPago_NMUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoPago_NMUpdate.setText("U");
		this.jButtonid_empresaTipoPago_NMUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoPago_NMUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoPago_NMUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoPago_NM.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoPago_NM.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoPago_NMUpdate"));



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
		//this.jInternalFrameDetalleTipoPago_NM = new TipoPago_NMBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Pago_ N M DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPago_NM= new GridBagLayout();
		

		
		String sToolTipTipoPago_NM="";
		sToolTipTipoPago_NM=TipoPago_NMConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPago_NM+="(Nomina.TipoPago_NM)";
		}
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPago_NM+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPago_NM = new JButtonMe();
		this.jButtonModificarTipoPago_NM = new JButtonMe();
        this.jButtonActualizarTipoPago_NM = new JButtonMe();
        this.jButtonEliminarTipoPago_NM = new JButtonMe();
        this.jButtonCancelarTipoPago_NM = new JButtonMe();
        this.jButtonGuardarCambiosTipoPago_NM = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPago_NM = new JButtonMe();
		this.jButtonCerrarTipoPago_NM = new JButtonMe();
		
		this.jScrollPanelDatosTipoPago_NM = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPago_NM = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPago_NM = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Pago_ N M";
		
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pago_ N Mes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPago_NM.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPago_NM.setName("jPanelCamposTipoPago_NM"); 

		this.jPanelCamposOcultosTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPago_NM.setName("jPanelCamposOcultosTipoPago_NM"); 

        this.jPanelAccionesTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPago_NM.setToolTipText("Acciones");
        this.jPanelAccionesTipoPago_NM.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPago_NM.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPago_NM.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPago_NM.setText("Nuevo");
		this.jButtonModificarTipoPago_NM.setText("Editar");
        this.jButtonActualizarTipoPago_NM.setText("Actualizar");
        this.jButtonEliminarTipoPago_NM.setText("Eliminar");
        this.jButtonCancelarTipoPago_NM.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPago_NM.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPago_NM.setText("Guardar");
		this.jButtonCerrarTipoPago_NM.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPago_NM,"nuevo_button","Nuevo",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPago_NM,"modificar_button","Editar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPago_NM,"actualizar_button","Actualizar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPago_NM,"eliminar_button","Eliminar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPago_NM,"cancelar_button","Cancelar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPago_NM,"guardarcambios_button","Guardar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPago_NM,"guardarcambiostabla_button","Guardar",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPago_NM,"cerrar_button","Salir",this.tipopago_nmSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPago_NM.setToolTipText("Nuevo"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPago_NM.setToolTipText("Editar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPago_NM.setToolTipText("Actualizar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPago_NM.setToolTipText("Eliminar)"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPago_NM.setToolTipText("Cancelar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPago_NM.setToolTipText("Guardar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPago_NM.setToolTipText("Guardar"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPago_NM.setToolTipText("Salir"+" "+TipoPago_NMConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPago_NM";
		inputMap = this.jButtonNuevoTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPago_NM.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPago_NM"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPago_NM";
		inputMap = this.jButtonActualizarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPago_NM"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPago_NM";
		inputMap = this.jButtonEliminarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPago_NM"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPago_NM";
		inputMap = this.jButtonCancelarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPago_NM"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPago_NM";
		inputMap = this.jButtonCerrarTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPago_NM"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPago_NM";
		inputMap = this.jButtonGuardarCambiosTablaTipoPago_NM.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPago_NM.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPago_NM"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPago_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPago_NM.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPago_NM.setToolTipText("Nuevo TipoPago_NM");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPago_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPago_NM.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPago_NM.setToolTipText("Sin Cerrar Ventana TipoPago_NM");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPago_NM = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPago_NM.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPago_NM.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPago_NM.setText("Accion");
		this.jComboBoxTiposAccionesTipoPago_NM.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPago_NM = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPago_NM.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPago_NM.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPago_NM = new JLabelMe();
		
		this.jLabelAccionesTipoPago_NM.setText("Acciones");		
		this.jLabelAccionesTipoPago_NM.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago_NM.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPago_NM.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPago_NM();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPago_NM();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPago_NM=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPago_NM.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPago_NM,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPago_NM.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago_NM.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPago_NM.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPago_NM, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPago_NM.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPago_NM.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPago_NM.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPago_NM, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPago_NM = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPago_NM = new GridBagLayout();
		
		this.jPanelCamposTipoPago_NM.setLayout(gridaBagLayoutCamposTipoPago_NM);
		this.jPanelCamposOcultosTipoPago_NM.setLayout(gridaBagLayoutCamposOcultosTipoPago_NM);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 0;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPago_NM.add(jLabelIdTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 1;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPago_NM.add(jLabelidTipoPago_NM, this.gridBagConstraintsTipoPago_NM);


	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 0;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoPago_NM.add(jLabelid_empresaTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx = 2;
		this.gridBagConstraintsTipoPago_NM.ipadx = 0;
		this.gridBagConstraintsTipoPago_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPago_NM.add(jButtonid_empresaTipoPago_NMBusqueda, this.gridBagConstraintsTipoPago_NM);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx = 3;
		this.gridBagConstraintsTipoPago_NM.ipadx = 0;
		this.gridBagConstraintsTipoPago_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoPago_NM.add(jButtonid_empresaTipoPago_NMUpdate, this.gridBagConstraintsTipoPago_NM);
	}

	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 1;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoPago_NM.add(jComboBoxid_empresaTipoPago_NM, this.gridBagConstraintsTipoPago_NM);


	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 0;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPago_NM.add(jLabelcodigoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx = 2;
		this.gridBagConstraintsTipoPago_NM.ipadx = 0;
		this.gridBagConstraintsTipoPago_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPago_NM.add(jButtoncodigoTipoPago_NMBusqueda, this.gridBagConstraintsTipoPago_NM);
	}

	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 1;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPago_NM.add(jTextFieldcodigoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);


	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 0;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPago_NM.add(jLabelnombreTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		//this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx = 2;
		this.gridBagConstraintsTipoPago_NM.ipadx = 0;
		this.gridBagConstraintsTipoPago_NM.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPago_NM.add(jButtonnombreTipoPago_NMBusqueda, this.gridBagConstraintsTipoPago_NM);
	}

	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPago_NM.gridy = 0;
	this.gridBagConstraintsTipoPago_NM.gridx = 1;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPago_NM.add(jscrollPanenombreTipoPago_NM, this.gridBagConstraintsTipoPago_NM);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago_NM.gridy = iYPanelCamposTipoPago_NM;
	this.gridBagConstraintsTipoPago_NM.gridx = iXPanelCamposTipoPago_NM++;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPago_NM.add(this.jPanelidTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(iXPanelCamposTipoPago_NM % 1==0) {
		iXPanelCamposTipoPago_NM=0;
		iYPanelCamposTipoPago_NM++;
	}
	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago_NM.gridy = iYPanelCamposTipoPago_NM;
	this.gridBagConstraintsTipoPago_NM.gridx = iXPanelCamposTipoPago_NM++;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPago_NM.add(this.jPanelcodigoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(iXPanelCamposTipoPago_NM % 1==0) {
		iXPanelCamposTipoPago_NM=0;
		iYPanelCamposTipoPago_NM++;
	}
	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago_NM.gridy = iYPanelCamposTipoPago_NM;
	this.gridBagConstraintsTipoPago_NM.gridx = iXPanelCamposTipoPago_NM++;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPago_NM.add(this.jPanelnombreTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(iXPanelCamposTipoPago_NM % 1==0) {
		iXPanelCamposTipoPago_NM=0;
		iYPanelCamposTipoPago_NM++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPago_NM.gridy = iYPanelCamposOcultosTipoPago_NM;
	this.gridBagConstraintsTipoPago_NM.gridx = iXPanelCamposOcultosTipoPago_NM++;
	this.gridBagConstraintsTipoPago_NM.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPago_NM.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoPago_NM.add(this.jPanelid_empresaTipoPago_NM, this.gridBagConstraintsTipoPago_NM);



	if(iXPanelCamposOcultosTipoPago_NM % 1==0) {
		iXPanelCamposOcultosTipoPago_NM=0;
		iYPanelCamposOcultosTipoPago_NM++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPago_NM= new GridBagLayout();
		this.jPanelAccionesTipoPago_NM.setLayout(gridaBagLayoutAccionesTipoPago_NM);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPago_NM= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPago_NM.setLayout(gridaBagLayoutAccionesFormularioTipoPago_NM);
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPago_NM.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPago_NM.add(this.jComboBoxTiposAccionesFormularioTipoPago_NM, this.gridBagConstraintsTipoPago_NM);

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPago_NM.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPago_NM.add(this.jCheckBoxPostAccionNuevoTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPago_NM.add(this.jCheckBoxPostAccionSinCerrarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipopago_nmSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipopago_nmSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPago_NM.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPago_NM.add(this.jCheckBoxPostAccionSinMensajeTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPago_NM.add(this.jButtonModificarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);							

		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPago_NM.gridy = 0;
		this.gridBagConstraintsTipoPago_NM.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPago_NM.add(this.jButtonEliminarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
			
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = 0;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPago_NM.add(this.jButtonActualizarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);


		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = 0;		
		this.gridBagConstraintsTipoPago_NM.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPago_NM.add(this.jButtonGuardarCambiosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);	
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = 0;		
		this.gridBagConstraintsTipoPago_NM.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPago_NM.add(this.jButtonCancelarTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPago_NM = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPago_NM);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopago_nmSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();						
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPago_NM.gridx = 0;		
			//this.gridBagConstraintsTipoPago_NM.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPago_NM.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPago_NM.gridx =0;
		this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPago_NM.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPago_NMJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPago_NM = new TipoPago_NMBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Pago_ N M DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Pago_ N M DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Pago_ N M Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPago_NMModel tipopago_nmModel=new TipoPago_NMModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPago_NMModel.TipoPago_NMFocusTraversalPolicy tipopago_nmFocusTraversalPolicy = tipopago_nmModel.new TipoPago_NMFocusTraversalPolicy(this);
			
			//tipopago_nmFocusTraversalPolicy.settipopago_nmJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipopago_nmModel);
			
			
			this.jContentPaneDetalleTipoPago_NM = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPago_NM = new GridBagLayout();	
			this.jContentPaneDetalleTipoPago_NM.setLayout(gridaBagLayoutDetalleTipoPago_NM);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPago_NM = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
				this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPago_NM.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPago_NM.add(jTtoolBarDetalleTipoPago_NM, gridBagConstraintsTipoPago_NM);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPago_NM=   new JScrollPane(jContentPaneDetalleTipoPago_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPago_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPago_NM=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPago_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPago_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPago_NM.gridx = 0;
	        
			this.jContentPaneDetalleTipoPago_NM.add(jPanelCamposTipoPago_NM, gridBagConstraintsTipoPago_NM);
			
			
			
			
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
						&& tipopago_nmSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCargo(this.puedeCargarPorParteCargo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEstructura(this.puedeCargarPorParteEstructura,false,-1);
					
					if(this.tipopago_nmSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPago_NM= new GridBagConstraints();
						this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPago_NM.gridx = 0;
						this.jContentPaneDetalleTipoPago_NM.add(this.jTabbedPaneRelacionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPago_NM.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCargo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEstructura(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPago_NM.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
					this.gridBagConstraintsTipoPago_NM.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPago_NM.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPago_NM.add(jPanelCamposOcultosTipoPago_NM, gridBagConstraintsTipoPago_NM);
				
					this.jPanelCamposOcultosTipoPago_NM.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoPago_NM.gridx = 0;
	        this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPago_NM.add(this.jPanelAccionesFormularioTipoPago_NM, this.gridBagConstraintsTipoPago_NM);							
			
			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
	        this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoPago_NM.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPago_NM.add(this.jPanelAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPago_NM);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPago_NM=   new JScrollPane(this.jPanelCamposTipoPago_NM,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPago_NM.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago_NM.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPago_NM.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPago_NM.gridx = 0;
			this.gridBagConstraintsTipoPago_NM.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPago_NM.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPago_NM.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPago_NM.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPago_NM, this.gridBagConstraintsTipoPago_NM);			
			
			this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
			this.gridBagConstraintsTipoPago_NM.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPago_NM.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
			
			
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		
			
		this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
		this.gridBagConstraintsTipoPago_NM.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPago_NM.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPago_NM, this.gridBagConstraintsTipoPago_NM);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPago_NM;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPago_NM;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCargo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cargoSessionBean=new CargoSessionBean();
		this.cargoSessionBean.setConGuardarRelaciones(false);
		this.cargoSessionBean.setEsGuardarRelacionado(true);

		this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cargoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cargoSessionBean.getEsGuardarRelacionado()) {

				CargoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL;
				CargoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cargoSessionBean.setEsGuardarRelacionado(true);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cargoBeanSwingJInternalFrame.setcargoSessionBean(this.cargoSessionBean);

				//this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
				//this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPago_NM.gridx = 0;
				//this.jContentPaneDetalleTipoPago_NM.add(this.cargoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPago_NM);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPago_NM.add("Cargos",this.cargoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPago_NM.setComponentAt(iIndexTab,this.cargoBeanSwingJInternalFrame.getContentPane());
				}

				//CargoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cargoSessionBean.setEsGuardarRelacionado(false);
				this.cargoBeanSwingJInternalFrame=null;//new CargoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCargo) {
					this.jTabbedPaneRelacionesTipoPago_NM.add("Cargos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEstructura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.estructuraSessionBean=new EstructuraSessionBean();
		this.estructuraSessionBean.setConGuardarRelaciones(false);
		this.estructuraSessionBean.setEsGuardarRelacionado(true);

		this.estructuraBeanSwingJInternalFrame=null;//new EstructuraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.estructuraBeanSwingJInternalFramePopup=new EstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.estructuraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.estructuraSessionBean.getEsGuardarRelacionado()) {

				EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL;
				EstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoPago_NMJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.estructuraSessionBean.setEsGuardarRelacionado(true);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.estructuraBeanSwingJInternalFrame.setestructuraSessionBean(this.estructuraSessionBean);

				//this.gridBagConstraintsTipoPago_NM = new GridBagConstraints();
				//this.gridBagConstraintsTipoPago_NM.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoPago_NM.gridx = 0;
				//this.jContentPaneDetalleTipoPago_NM.add(this.estructuraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoPago_NM);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoPago_NM.add("Estructuras",this.estructuraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoPago_NM.setComponentAt(iIndexTab,this.estructuraBeanSwingJInternalFrame.getContentPane());
				}

				//EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.estructuraSessionBean.setEsGuardarRelacionado(false);
				this.estructuraBeanSwingJInternalFrame=null;//new EstructuraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.estructuraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEstructura) {
					this.jTabbedPaneRelacionesTipoPago_NM.add("Estructuras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEstructuraBeanSwingJInternalFrame(List<TipoPago_NM> tipopago_nms,TipoPago_NM tipopago_nm,EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.tipopago_nmLogic.getConnexion());

					estructuraBeanSwingJInternalFrame.settipopago_nmsForeignKey(tipopago_nms);
					estructuraBeanSwingJInternalFrame.settipopago_nmForeignKey(tipopago_nm);
					estructuraBeanSwingJInternalFrame.estructuraSessionBean.setisBusquedaDesdeForeignKeySesionTipoPago_NM(true);
					estructuraBeanSwingJInternalFrame.estructuraSessionBean.setlidTipoPago_NMActual(tipopago_nm.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					estructuraBeanSwingJInternalFrame.cargarCombosForeignKeyEstructura(estructuraBeanSwingJInternalFrame.isCargarCombosDependencia);
					estructuraBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPago_NM(true);
					estructuraBeanSwingJInternalFrame.setid_tipo_pago__n_mFK_IdTipoPago_NM(tipopago_nm.getId());

					if(!this.conCargarFormDetalle) {
						estructuraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					estructuraBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPago_NMForeignKey(tipopago_nm,1,false,true,true);
					estructuraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					estructuraBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPago_NM");
					estructuraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPago_NM");
					estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(true);
					estructuraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEstructura("n",estructuraBeanSwingJInternalFrame.isGuardarCambiosEnLote, estructuraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					estructuraBeanSwingJInternalFrame.setAutoscrolls(true);
					estructuraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("relacionado");
					} else {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("no_relacionado");
					}

					estructuraBeanSwingJInternalFrame.getjButtonRecargarInformacionEstructura().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCargoBeanSwingJInternalFrame(List<TipoPago_NM> tipopago_nms,TipoPago_NM tipopago_nm,CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.tipopago_nmLogic.getConnexion());

					cargoBeanSwingJInternalFrame.settipopago_nmsForeignKey(tipopago_nms);
					cargoBeanSwingJInternalFrame.settipopago_nmForeignKey(tipopago_nm);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setisBusquedaDesdeForeignKeySesionTipoPago_NM(true);
					cargoBeanSwingJInternalFrame.cargoSessionBean.setlidTipoPago_NMActual(tipopago_nm.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cargoBeanSwingJInternalFrame.cargarCombosForeignKeyCargo(cargoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cargoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoPago_NM(true);
					cargoBeanSwingJInternalFrame.setid_tipo_pago__n_mFK_IdTipoPago_NM(tipopago_nm.getId());

					if(!this.conCargarFormDetalle) {
						cargoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cargoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoPago_NMForeignKey(tipopago_nm,1,false,true,true);
					cargoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cargoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoPago_NM");
					cargoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoPago_NM");
					cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(true);
					cargoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCargo("n",cargoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cargoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cargoBeanSwingJInternalFrame.setAutoscrolls(true);
					cargoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("relacionado");
					} else {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");
					}

					cargoBeanSwingJInternalFrame.getjButtonRecargarInformacionCargo().setVisible(false);

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
