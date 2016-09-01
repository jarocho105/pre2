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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoMoviFinanConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoMoviFinanDetalleFormJInternalFrame extends TipoMoviFinanBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMoviFinan;
	
	protected JMenuBar jmenuBarDetalleTipoMoviFinan;
	
	protected JMenu jmenuDetalleTipoMoviFinan;
	protected JMenu jmenuDetalleArchivoTipoMoviFinan;
	protected JMenu jmenuDetalleAccionesTipoMoviFinan;
	protected JMenu jmenuDetalleDatosTipoMoviFinan;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMoviFinan;	
	protected GridBagConstraints gridBagConstraintsTipoMoviFinan;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMoviFinanBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMoviFinan;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoMoviFinanSessionBean tipomovifinanSessionBean;
	
	

	public InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFrame=null;
	public InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteInformacionFinanciera=false;
	public InformacionFinancieraSessionBean informacionfinancieraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoMoviFinanLogic tipomovifinanLogic;
	
	public JScrollPane jScrollPanelDatosTipoMoviFinan;
	public JScrollPane jScrollPanelDatosEdicionTipoMoviFinan;
	public JScrollPane jScrollPanelDatosGeneralTipoMoviFinan;
	
	protected JPanel jPanelCamposTipoMoviFinan;    
	protected JPanel jPanelCamposOcultosTipoMoviFinan;    	
	protected JPanel jPanelAccionesTipoMoviFinan;
	protected JPanel jPanelAccionesFormularioTipoMoviFinan;
    
	
	
	protected Integer iXPanelCamposTipoMoviFinan=0;
	protected Integer iYPanelCamposTipoMoviFinan=0;
	
	protected Integer iXPanelCamposOcultosTipoMoviFinan=0;
	protected Integer iYPanelCamposOcultosTipoMoviFinan=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMoviFinan;
	public JButton jButtonModificarTipoMoviFinan;
	public JButton jButtonActualizarTipoMoviFinan;
    public JButton jButtonEliminarTipoMoviFinan;
	public JButton jButtonCancelarTipoMoviFinan;
    public JButton jButtonGuardarCambiosTipoMoviFinan;
	public JButton jButtonGuardarCambiosTablaTipoMoviFinan;
	protected JButton jButtonCerrarTipoMoviFinan;
	
	
	protected JButton jButtonProcesarInformacionTipoMoviFinan;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMoviFinan;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMoviFinan;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMoviFinan;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMoviFinan;
	protected JButton jButtonModificarToolBarTipoMoviFinan;
	protected JButton jButtonActualizarToolBarTipoMoviFinan;
    protected JButton jButtonEliminarToolBarTipoMoviFinan;
	protected JButton jButtonCancelarToolBarTipoMoviFinan;
    protected JButton jButtonGuardarCambiosToolBarTipoMoviFinan;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMoviFinan;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMoviFinan;
	protected JButton jButtonCerrarToolBarTipoMoviFinan;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMoviFinan;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMoviFinan;
	protected JMenuItem jMenuItemModificarTipoMoviFinan;
	protected JMenuItem jMenuItemActualizarTipoMoviFinan;
    protected JMenuItem jMenuItemEliminarTipoMoviFinan;
	protected JMenuItem jMenuItemCancelarTipoMoviFinan;
    protected JMenuItem jMenuItemGuardarCambiosTipoMoviFinan;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMoviFinan;
	protected JMenuItem jMenuItemCerrarTipoMoviFinan;
	protected JMenuItem jMenuItemDetalleCerrarTipoMoviFinan;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMoviFinan;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMoviFinan;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMoviFinan;
	protected JMenuItem jMenuItemMostrarOcultarTipoMoviFinan;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMoviFinan;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMoviFinan;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMoviFinan;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMoviFinan;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMoviFinan;
	public JLabel jLabelIdTipoMoviFinan;
	public JLabel jLabelidTipoMoviFinan;
	public JButton jButtonidTipoMoviFinanBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoMoviFinan;
	public JLabel jLabelcodigoTipoMoviFinan;
	public JTextField jTextFieldcodigoTipoMoviFinan;
	public JButton jButtoncodigoTipoMoviFinanBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMoviFinan;
	public JLabel jLabelnombreTipoMoviFinan;
	public JTextArea jTextAreanombreTipoMoviFinan;
	public JScrollPane jscrollPanenombreTipoMoviFinan;
	public JButton jButtonnombreTipoMoviFinanBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoMoviFinan;
	public JLabel jLabelid_empresaTipoMoviFinan;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoMoviFinan;
	public JButton jButtonid_empresaTipoMoviFinan= new JButtonMe();
	public JButton jButtonid_empresaTipoMoviFinanUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoMoviFinanBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMoviFinan;
	
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
	
	public TipoMoviFinanDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMoviFinan=new JPanel();
				this.jPanelAccionesFormularioTipoMoviFinan=new JPanel();
				this.jmenuBarDetalleTipoMoviFinan=new JMenuBar();
				this.jTtoolBarDetalleTipoMoviFinan=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMoviFinanDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMoviFinanDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMoviFinan No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMoviFinan() {
		return this.jButtonActualizarToolBarTipoMoviFinan;
	}
	
	public JButton getjButtonEliminarToolBarTipoMoviFinan() {
		return this.jButtonEliminarToolBarTipoMoviFinan;
	}
	
	public JButton getjButtonCancelarToolBarTipoMoviFinan() {
		return this.jButtonCancelarToolBarTipoMoviFinan;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMoviFinan() {
		return this.jButtonProcesarInformacionTipoMoviFinan;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMoviFinan)	{
		this.jButtonProcesarInformacionTipoMoviFinan = jButtonProcesarInformacionTipoMoviFinan;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMoviFinan() {
		return this.jComboBoxTiposAccionesTipoMoviFinan;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMoviFinan(
			JComboBox jComboBoxTiposRelacionesTipoMoviFinan) {
		this.jComboBoxTiposRelacionesTipoMoviFinan = jComboBoxTiposRelacionesTipoMoviFinan;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMoviFinan(
			JComboBox jComboBoxTiposAccionesTipoMoviFinan) {
		this.jComboBoxTiposAccionesTipoMoviFinan = jComboBoxTiposAccionesTipoMoviFinan;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMoviFinan() {
		return this.jComboBoxTiposAccionesFormularioTipoMoviFinan;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMoviFinan(
			JComboBox jComboBoxTiposAccionesFormularioTipoMoviFinan) {
		this.jComboBoxTiposAccionesFormularioTipoMoviFinan = jComboBoxTiposAccionesFormularioTipoMoviFinan;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomovifinanSessionBean=new TipoMoviFinanSessionBean();
		
		this.tipomovifinanSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovifinanSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovifinanSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMoviFinanJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movi Finan MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMoviFinanJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMoviFinan= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMoviFinan=new JButtonMe();
				this.jButtonModificarToolBarTipoMoviFinan=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMoviFinan,this.jTtoolBarDetalleTipoMoviFinan,
							"actualizar","actualizar","Actualizar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMoviFinan,this.jTtoolBarDetalleTipoMoviFinan,
							"eliminar","eliminar","Eliminar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMoviFinan,this.jTtoolBarDetalleTipoMoviFinan,
							"cancelar","cancelar","Cancelar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMoviFinan=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMoviFinan,this.jTtoolBarDetalleTipoMoviFinan,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMoviFinan=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMoviFinan=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMoviFinan=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMoviFinan=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMoviFinan=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMoviFinan= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMoviFinan.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMoviFinan,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMoviFinan= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMoviFinan.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMoviFinan,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMoviFinan= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMoviFinan.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMoviFinan,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMoviFinan= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMoviFinan.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMoviFinan,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMoviFinan= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMoviFinan.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMoviFinan,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMoviFinan= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMoviFinan.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMoviFinan,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMoviFinan= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMoviFinan.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMoviFinan,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMoviFinan= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMoviFinan.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMoviFinan,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMoviFinan= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMoviFinan.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMoviFinan,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMoviFinan= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMoviFinan.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMoviFinan,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMoviFinan.add(this.jMenuItemDetalleCerrarTipoMoviFinan);
		
		this.jmenuDetalleAccionesTipoMoviFinan.add(this.jMenuItemActualizarTipoMoviFinan);
		this.jmenuDetalleAccionesTipoMoviFinan.add(this.jMenuItemEliminarTipoMoviFinan);
		this.jmenuDetalleAccionesTipoMoviFinan.add(this.jMenuItemCancelarTipoMoviFinan);		
		
		//this.jmenuDetalleDatosTipoMoviFinan.add(this.jMenuItemDetalleAbrirOrderByTipoMoviFinan);				
		this.jmenuDetalleDatosTipoMoviFinan.add(this.jMenuItemDetalleMostarOcultarTipoMoviFinan);				
				
		//this.jmenuDetalleAccionesTipoMoviFinan.add(this.jMenuItemGuardarCambiosTipoMoviFinan);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMoviFinan.add(this.jmenuDetalleArchivoTipoMoviFinan);		
		this.jmenuBarDetalleTipoMoviFinan.add(this.jmenuDetalleAccionesTipoMoviFinan);		
		this.jmenuBarDetalleTipoMoviFinan.add(this.jmenuDetalleDatosTipoMoviFinan);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoMoviFinan.add(this.jmenuDetalleTipoMoviFinan);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMoviFinan);				
	}
	
	
	public void inicializarElementosCamposTipoMoviFinan() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMoviFinan = new JLabelMe();
		jLabelIdTipoMoviFinan.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMoviFinan = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMoviFinan.setToolTipText(TipoMoviFinanConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMoviFinan= new GridBagLayout();

		this.jPanelidTipoMoviFinan.setLayout(this.gridaBagLayoutTipoMoviFinan);

		jLabelidTipoMoviFinan = new JLabel();
		jLabelidTipoMoviFinan.setText("Id");

		jLabelidTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoMoviFinan = new JLabelMe();
		this.jLabelcodigoTipoMoviFinan.setText(""+TipoMoviFinanConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoMoviFinan.setToolTipText("Codigo");
		this.jLabelcodigoTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoMoviFinan=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoMoviFinan.setToolTipText(TipoMoviFinanConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoMoviFinan = new GridBagLayout();
		this.jPanelcodigoTipoMoviFinan.setLayout(this.gridaBagLayoutTipoMoviFinan);


		jTextFieldcodigoTipoMoviFinan= new JTextFieldMe();

		jTextFieldcodigoTipoMoviFinan.setEnabled(false);
		jTextFieldcodigoTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoMoviFinanBusqueda= new JButtonMe();
		this.jButtoncodigoTipoMoviFinanBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMoviFinanBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMoviFinanBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoMoviFinanBusqueda.setText("U");
		this.jButtoncodigoTipoMoviFinanBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoMoviFinanBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoMoviFinanBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoMoviFinanBusqueda"));

		if(this.tipomovifinanSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoMoviFinanBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoMoviFinan = new JLabelMe();
		this.jLabelnombreTipoMoviFinan.setText(""+TipoMoviFinanConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMoviFinan.setToolTipText("Nombre");
		this.jLabelnombreTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMoviFinan=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMoviFinan.setToolTipText(TipoMoviFinanConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMoviFinan = new GridBagLayout();
		this.jPanelnombreTipoMoviFinan.setLayout(this.gridaBagLayoutTipoMoviFinan);


		jTextAreanombreTipoMoviFinan= new JTextAreaMe();
		jTextAreanombreTipoMoviFinan.setEnabled(false);
		jTextAreanombreTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMoviFinan.setLineWrap(true);
		jTextAreanombreTipoMoviFinan.setWrapStyleWord(true);
		jTextAreanombreTipoMoviFinan.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMoviFinan.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMoviFinan = new JScrollPane(jTextAreanombreTipoMoviFinan);
		jscrollPanenombreTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMoviFinanBusqueda= new JButtonMe();
		this.jButtonnombreTipoMoviFinanBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMoviFinanBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMoviFinanBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMoviFinanBusqueda.setText("U");
		this.jButtonnombreTipoMoviFinanBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMoviFinanBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMoviFinanBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMoviFinanBusqueda"));

		if(this.tipomovifinanSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMoviFinanBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMoviFinan() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoMoviFinan = new JLabelMe();
		this.jLabelid_empresaTipoMoviFinan.setText(""+TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoMoviFinan.setToolTipText("Empresa");
		this.jLabelid_empresaTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoMoviFinan=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoMoviFinan.setToolTipText(TipoMoviFinanConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoMoviFinan = new GridBagLayout();
		this.jPanelid_empresaTipoMoviFinan.setLayout(this.gridaBagLayoutTipoMoviFinan);


		jComboBoxid_empresaTipoMoviFinan= new JComboBoxMe();
		jComboBoxid_empresaTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoMoviFinan.setEnabled(false);

		this.jButtonid_empresaTipoMoviFinan= new JButtonMe();
		this.jButtonid_empresaTipoMoviFinan.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMoviFinan.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMoviFinan.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMoviFinan.setText("Buscar");
		this.jButtonid_empresaTipoMoviFinan.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoMoviFinan.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMoviFinan,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMoviFinan"));

		this.jButtonid_empresaTipoMoviFinanBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoMoviFinanBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMoviFinanBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMoviFinanBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMoviFinanBusqueda.setText("U");
		this.jButtonid_empresaTipoMoviFinanBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoMoviFinanBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMoviFinanBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMoviFinanBusqueda"));

		if(this.tipomovifinanSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoMoviFinanBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoMoviFinanUpdate= new JButtonMe();
		this.jButtonid_empresaTipoMoviFinanUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMoviFinanUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMoviFinanUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMoviFinanUpdate.setText("U");
		this.jButtonid_empresaTipoMoviFinanUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoMoviFinanUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMoviFinanUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoMoviFinan.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMoviFinan.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMoviFinanUpdate"));



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
		//this.jInternalFrameDetalleTipoMoviFinan = new TipoMoviFinanBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Movi Finan DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMoviFinan= new GridBagLayout();
		

		
		String sToolTipTipoMoviFinan="";
		sToolTipTipoMoviFinan=TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMoviFinan+="(Cartera.TipoMoviFinan)";
		}
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMoviFinan+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMoviFinan = new JButtonMe();
		this.jButtonModificarTipoMoviFinan = new JButtonMe();
        this.jButtonActualizarTipoMoviFinan = new JButtonMe();
        this.jButtonEliminarTipoMoviFinan = new JButtonMe();
        this.jButtonCancelarTipoMoviFinan = new JButtonMe();
        this.jButtonGuardarCambiosTipoMoviFinan = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMoviFinan = new JButtonMe();
		this.jButtonCerrarTipoMoviFinan = new JButtonMe();
		
		this.jScrollPanelDatosTipoMoviFinan = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMoviFinan = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMoviFinan = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movi Finan";
		
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movi Finanes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMoviFinan.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMoviFinan.setName("jPanelCamposTipoMoviFinan"); 

		this.jPanelCamposOcultosTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMoviFinan.setName("jPanelCamposOcultosTipoMoviFinan"); 

        this.jPanelAccionesTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMoviFinan.setToolTipText("Acciones");
        this.jPanelAccionesTipoMoviFinan.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMoviFinan.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMoviFinan.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMoviFinan.setText("Nuevo");
		this.jButtonModificarTipoMoviFinan.setText("Editar");
        this.jButtonActualizarTipoMoviFinan.setText("Actualizar");
        this.jButtonEliminarTipoMoviFinan.setText("Eliminar");
        this.jButtonCancelarTipoMoviFinan.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMoviFinan.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMoviFinan.setText("Guardar");
		this.jButtonCerrarTipoMoviFinan.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMoviFinan,"nuevo_button","Nuevo",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMoviFinan,"modificar_button","Editar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMoviFinan,"actualizar_button","Actualizar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMoviFinan,"eliminar_button","Eliminar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMoviFinan,"cancelar_button","Cancelar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMoviFinan,"guardarcambios_button","Guardar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMoviFinan,"guardarcambiostabla_button","Guardar",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMoviFinan,"cerrar_button","Salir",this.tipomovifinanSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMoviFinan.setToolTipText("Nuevo"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMoviFinan.setToolTipText("Editar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMoviFinan.setToolTipText("Actualizar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMoviFinan.setToolTipText("Eliminar)"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMoviFinan.setToolTipText("Cancelar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMoviFinan.setToolTipText("Guardar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMoviFinan.setToolTipText("Guardar"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMoviFinan.setToolTipText("Salir"+" "+TipoMoviFinanConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMoviFinan";
		inputMap = this.jButtonNuevoTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMoviFinan.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMoviFinan"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMoviFinan";
		inputMap = this.jButtonActualizarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMoviFinan"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMoviFinan";
		inputMap = this.jButtonEliminarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMoviFinan"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMoviFinan";
		inputMap = this.jButtonCancelarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMoviFinan"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMoviFinan";
		inputMap = this.jButtonCerrarTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMoviFinan"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMoviFinan";
		inputMap = this.jButtonGuardarCambiosTablaTipoMoviFinan.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMoviFinan.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMoviFinan"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMoviFinan = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMoviFinan.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMoviFinan.setToolTipText("Nuevo TipoMoviFinan");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMoviFinan = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMoviFinan.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMoviFinan.setToolTipText("Sin Cerrar Ventana TipoMoviFinan");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMoviFinan = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMoviFinan.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMoviFinan.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMoviFinan.setText("Accion");
		this.jComboBoxTiposAccionesTipoMoviFinan.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMoviFinan = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMoviFinan.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMoviFinan.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMoviFinan = new JLabelMe();
		
		this.jLabelAccionesTipoMoviFinan.setText("Acciones");		
		this.jLabelAccionesTipoMoviFinan.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoviFinan.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMoviFinan.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMoviFinan();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMoviFinan();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMoviFinan=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMoviFinan.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMoviFinan,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMoviFinan.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoviFinan.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMoviFinan.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMoviFinan.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMoviFinan.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMoviFinan.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMoviFinan, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMoviFinan = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMoviFinan = new GridBagLayout();
		
		this.jPanelCamposTipoMoviFinan.setLayout(gridaBagLayoutCamposTipoMoviFinan);
		this.jPanelCamposOcultosTipoMoviFinan.setLayout(gridaBagLayoutCamposOcultosTipoMoviFinan);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMoviFinan.add(jLabelIdTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 1;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMoviFinan.add(jLabelidTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);


	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoMoviFinan.add(jLabelid_empresaTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx = 2;
		this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
		this.gridBagConstraintsTipoMoviFinan.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMoviFinan.add(jButtonid_empresaTipoMoviFinanBusqueda, this.gridBagConstraintsTipoMoviFinan);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx = 3;
		this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
		this.gridBagConstraintsTipoMoviFinan.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMoviFinan.add(jButtonid_empresaTipoMoviFinanUpdate, this.gridBagConstraintsTipoMoviFinan);
	}

	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 1;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoMoviFinan.add(jComboBoxid_empresaTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);


	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoMoviFinan.add(jLabelcodigoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx = 2;
		this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
		this.gridBagConstraintsTipoMoviFinan.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoMoviFinan.add(jButtoncodigoTipoMoviFinanBusqueda, this.gridBagConstraintsTipoMoviFinan);
	}

	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 1;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoMoviFinan.add(jTextFieldcodigoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);


	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMoviFinan.add(jLabelnombreTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		//this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx = 2;
		this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
		this.gridBagConstraintsTipoMoviFinan.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMoviFinan.add(jButtonnombreTipoMoviFinanBusqueda, this.gridBagConstraintsTipoMoviFinan);
	}

	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMoviFinan.gridy = 0;
	this.gridBagConstraintsTipoMoviFinan.gridx = 1;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMoviFinan.add(jscrollPanenombreTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoviFinan.gridy = iYPanelCamposTipoMoviFinan;
	this.gridBagConstraintsTipoMoviFinan.gridx = iXPanelCamposTipoMoviFinan++;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoviFinan.add(this.jPanelidTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(iXPanelCamposTipoMoviFinan % 1==0) {
		iXPanelCamposTipoMoviFinan=0;
		iYPanelCamposTipoMoviFinan++;
	}
	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoviFinan.gridy = iYPanelCamposTipoMoviFinan;
	this.gridBagConstraintsTipoMoviFinan.gridx = iXPanelCamposTipoMoviFinan++;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoviFinan.add(this.jPanelcodigoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(iXPanelCamposTipoMoviFinan % 1==0) {
		iXPanelCamposTipoMoviFinan=0;
		iYPanelCamposTipoMoviFinan++;
	}
	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoviFinan.gridy = iYPanelCamposTipoMoviFinan;
	this.gridBagConstraintsTipoMoviFinan.gridx = iXPanelCamposTipoMoviFinan++;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMoviFinan.add(this.jPanelnombreTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(iXPanelCamposTipoMoviFinan % 1==0) {
		iXPanelCamposTipoMoviFinan=0;
		iYPanelCamposTipoMoviFinan++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMoviFinan.gridy = iYPanelCamposOcultosTipoMoviFinan;
	this.gridBagConstraintsTipoMoviFinan.gridx = iXPanelCamposOcultosTipoMoviFinan++;
	this.gridBagConstraintsTipoMoviFinan.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMoviFinan.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoMoviFinan.add(this.jPanelid_empresaTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);



	if(iXPanelCamposOcultosTipoMoviFinan % 1==0) {
		iXPanelCamposOcultosTipoMoviFinan=0;
		iYPanelCamposOcultosTipoMoviFinan++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMoviFinan= new GridBagLayout();
		this.jPanelAccionesTipoMoviFinan.setLayout(gridaBagLayoutAccionesTipoMoviFinan);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMoviFinan= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMoviFinan.setLayout(gridaBagLayoutAccionesFormularioTipoMoviFinan);
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMoviFinan.add(this.jComboBoxTiposAccionesFormularioTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMoviFinan.add(this.jCheckBoxPostAccionNuevoTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMoviFinan.add(this.jCheckBoxPostAccionSinCerrarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomovifinanSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomovifinanSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMoviFinan.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMoviFinan.add(this.jCheckBoxPostAccionSinMensajeTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMoviFinan.add(this.jButtonModificarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);							

		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;
		this.gridBagConstraintsTipoMoviFinan.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMoviFinan.add(this.jButtonEliminarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
			
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMoviFinan.add(this.jButtonActualizarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);


		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;		
		this.gridBagConstraintsTipoMoviFinan.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMoviFinan.add(this.jButtonGuardarCambiosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);	
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = 0;		
		this.gridBagConstraintsTipoMoviFinan.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMoviFinan.add(this.jButtonCancelarTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMoviFinan = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMoviFinan);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovifinanSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();						
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMoviFinan.gridx = 0;		
			//this.gridBagConstraintsTipoMoviFinan.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMoviFinan.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMoviFinan.gridx =0;
		this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMoviFinan.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMoviFinanJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMoviFinan = new TipoMoviFinanBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Movi Finan DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Movi Finan DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movi Finan Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMoviFinanModel tipomovifinanModel=new TipoMoviFinanModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMoviFinanModel.TipoMoviFinanFocusTraversalPolicy tipomovifinanFocusTraversalPolicy = tipomovifinanModel.new TipoMoviFinanFocusTraversalPolicy(this);
			
			//tipomovifinanFocusTraversalPolicy.settipomovifinanJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomovifinanModel);
			
			
			this.jContentPaneDetalleTipoMoviFinan = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMoviFinan = new GridBagLayout();	
			this.jContentPaneDetalleTipoMoviFinan.setLayout(gridaBagLayoutDetalleTipoMoviFinan);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMoviFinan = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
				this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMoviFinan.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMoviFinan.add(jTtoolBarDetalleTipoMoviFinan, gridBagConstraintsTipoMoviFinan);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMoviFinan=   new JScrollPane(jContentPaneDetalleTipoMoviFinan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMoviFinan.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoviFinan.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoviFinan.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMoviFinan=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMoviFinan.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoviFinan.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMoviFinan.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	        
			this.jContentPaneDetalleTipoMoviFinan.add(jPanelCamposTipoMoviFinan, gridBagConstraintsTipoMoviFinan);
			
			
			
			
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
						&& tipomovifinanSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(this.puedeCargarPorParteInformacionFinanciera,false,-1);
					
					if(this.tipomovifinanSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMoviFinan= new GridBagConstraints();
						this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMoviFinan.gridx = 0;
						this.jContentPaneDetalleTipoMoviFinan.add(this.jTabbedPaneRelacionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMoviFinan.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMoviFinan.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
					this.gridBagConstraintsTipoMoviFinan.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMoviFinan.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMoviFinan.add(jPanelCamposOcultosTipoMoviFinan, gridBagConstraintsTipoMoviFinan);
				
					this.jPanelCamposOcultosTipoMoviFinan.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	        this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMoviFinan.add(this.jPanelAccionesFormularioTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);							
			
			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
	        this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoMoviFinan.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMoviFinan.add(this.jPanelAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMoviFinan);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMoviFinan=   new JScrollPane(this.jPanelCamposTipoMoviFinan,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMoviFinan.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoviFinan.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMoviFinan.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMoviFinan.gridx = 0;
			this.gridBagConstraintsTipoMoviFinan.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMoviFinan.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMoviFinan.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMoviFinan.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);			
			
			this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
			this.gridBagConstraintsTipoMoviFinan.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMoviFinan.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
			
			
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		
			
		this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
		this.gridBagConstraintsTipoMoviFinan.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMoviFinan.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMoviFinan, this.gridBagConstraintsTipoMoviFinan);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMoviFinan;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMoviFinan;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameInformacionFinanciera(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.informacionfinancieraSessionBean=new InformacionFinancieraSessionBean();
		this.informacionfinancieraSessionBean.setConGuardarRelaciones(false);
		this.informacionfinancieraSessionBean.setEsGuardarRelacionado(true);

		this.informacionfinancieraBeanSwingJInternalFrame=null;//new InformacionFinancieraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.informacionfinancieraBeanSwingJInternalFramePopup=new InformacionFinancieraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.informacionfinancieraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {

				InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL=TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL;
				InformacionFinancieraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoMoviFinanJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.informacionfinancieraSessionBean.setEsGuardarRelacionado(true);

				this.informacionfinancieraBeanSwingJInternalFrame=new InformacionFinancieraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.informacionfinancieraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.informacionfinancieraBeanSwingJInternalFrame.setinformacionfinancieraSessionBean(this.informacionfinancieraSessionBean);

				//this.gridBagConstraintsTipoMoviFinan = new GridBagConstraints();
				//this.gridBagConstraintsTipoMoviFinan.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoMoviFinan.gridx = 0;
				//this.jContentPaneDetalleTipoMoviFinan.add(this.informacionfinancieraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoMoviFinan);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoMoviFinan.add("Informacion Financieras",this.informacionfinancieraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoMoviFinan.setComponentAt(iIndexTab,this.informacionfinancieraBeanSwingJInternalFrame.getContentPane());
				}

				//InformacionFinancieraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.informacionfinancieraSessionBean.setEsGuardarRelacionado(false);
				this.informacionfinancieraBeanSwingJInternalFrame=null;//new InformacionFinancieraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.informacionfinancieraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteInformacionFinanciera) {
					this.jTabbedPaneRelacionesTipoMoviFinan.add("Informacion Financieras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarInformacionFinancieraBeanSwingJInternalFrame(List<TipoMoviFinan> tipomovifinans,TipoMoviFinan tipomovifinan,InformacionFinancieraBeanSwingJInternalFrame informacionfinancieraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//informacionfinancieraBeanSwingJInternalFrame=new InformacionFinancieraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					informacionfinancieraBeanSwingJInternalFrame.getInformacionFinancieraLogic().setConnexion(this.tipomovifinanLogic.getConnexion());

					informacionfinancieraBeanSwingJInternalFrame.settipomovifinansForeignKey(tipomovifinans);
					informacionfinancieraBeanSwingJInternalFrame.settipomovifinanForeignKey(tipomovifinan);
					informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setisBusquedaDesdeForeignKeySesionTipoMoviFinan(true);
					informacionfinancieraBeanSwingJInternalFrame.informacionfinancieraSessionBean.setlidTipoMoviFinanActual(tipomovifinan.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					informacionfinancieraBeanSwingJInternalFrame.cargarCombosForeignKeyInformacionFinanciera(informacionfinancieraBeanSwingJInternalFrame.isCargarCombosDependencia);
					informacionfinancieraBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoMoviFinan(true);
					informacionfinancieraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					informacionfinancieraBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoMoviFinan");
					informacionfinancieraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoMoviFinan");
					informacionfinancieraBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionFinanciera(true);
					informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesInformacionFinanciera("n",informacionfinancieraBeanSwingJInternalFrame.isGuardarCambiosEnLote, informacionfinancieraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					informacionfinancieraBeanSwingJInternalFrame.setAutoscrolls(true);
					informacionfinancieraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionFinanciera("relacionado");
					} else {
						informacionfinancieraBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionFinanciera("no_relacionado");
					}

					informacionfinancieraBeanSwingJInternalFrame.getjButtonRecargarInformacionInformacionFinanciera().setVisible(false);

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
