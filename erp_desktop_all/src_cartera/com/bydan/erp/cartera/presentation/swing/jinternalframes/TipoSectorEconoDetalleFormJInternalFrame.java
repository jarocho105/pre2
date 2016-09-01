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
import com.bydan.erp.cartera.util.TipoSectorEconoConstantesFunciones;

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
public class TipoSectorEconoDetalleFormJInternalFrame extends TipoSectorEconoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoSectorEcono;
	
	protected JMenuBar jmenuBarDetalleTipoSectorEcono;
	
	protected JMenu jmenuDetalleTipoSectorEcono;
	protected JMenu jmenuDetalleArchivoTipoSectorEcono;
	protected JMenu jmenuDetalleAccionesTipoSectorEcono;
	protected JMenu jmenuDetalleDatosTipoSectorEcono;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoSectorEcono;	
	protected GridBagConstraints gridBagConstraintsTipoSectorEcono;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoSectorEconoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoSectorEcono;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoSectorEconoSessionBean tiposectoreconoSessionBean;
	
	

	public ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame=null;
	public ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaComercial=false;
	public ReferenciaComercialSessionBean referenciacomercialSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoSectorEconoLogic tiposectoreconoLogic;
	
	public JScrollPane jScrollPanelDatosTipoSectorEcono;
	public JScrollPane jScrollPanelDatosEdicionTipoSectorEcono;
	public JScrollPane jScrollPanelDatosGeneralTipoSectorEcono;
	
	protected JPanel jPanelCamposTipoSectorEcono;    
	protected JPanel jPanelCamposOcultosTipoSectorEcono;    	
	protected JPanel jPanelAccionesTipoSectorEcono;
	protected JPanel jPanelAccionesFormularioTipoSectorEcono;
    
	
	
	protected Integer iXPanelCamposTipoSectorEcono=0;
	protected Integer iYPanelCamposTipoSectorEcono=0;
	
	protected Integer iXPanelCamposOcultosTipoSectorEcono=0;
	protected Integer iYPanelCamposOcultosTipoSectorEcono=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoSectorEcono;
	public JButton jButtonModificarTipoSectorEcono;
	public JButton jButtonActualizarTipoSectorEcono;
    public JButton jButtonEliminarTipoSectorEcono;
	public JButton jButtonCancelarTipoSectorEcono;
    public JButton jButtonGuardarCambiosTipoSectorEcono;
	public JButton jButtonGuardarCambiosTablaTipoSectorEcono;
	protected JButton jButtonCerrarTipoSectorEcono;
	
	
	protected JButton jButtonProcesarInformacionTipoSectorEcono;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoSectorEcono;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoSectorEcono;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoSectorEcono;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoSectorEcono;
	protected JButton jButtonModificarToolBarTipoSectorEcono;
	protected JButton jButtonActualizarToolBarTipoSectorEcono;
    protected JButton jButtonEliminarToolBarTipoSectorEcono;
	protected JButton jButtonCancelarToolBarTipoSectorEcono;
    protected JButton jButtonGuardarCambiosToolBarTipoSectorEcono;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoSectorEcono;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoSectorEcono;
	protected JButton jButtonCerrarToolBarTipoSectorEcono;
	
	protected JButton jButtonProcesarInformacionToolBarTipoSectorEcono;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoSectorEcono;
	protected JMenuItem jMenuItemModificarTipoSectorEcono;
	protected JMenuItem jMenuItemActualizarTipoSectorEcono;
    protected JMenuItem jMenuItemEliminarTipoSectorEcono;
	protected JMenuItem jMenuItemCancelarTipoSectorEcono;
    protected JMenuItem jMenuItemGuardarCambiosTipoSectorEcono;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoSectorEcono;
	protected JMenuItem jMenuItemCerrarTipoSectorEcono;
	protected JMenuItem jMenuItemDetalleCerrarTipoSectorEcono;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoSectorEcono;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoSectorEcono;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoSectorEcono;
	protected JMenuItem jMenuItemMostrarOcultarTipoSectorEcono;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoSectorEcono;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoSectorEcono;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoSectorEcono;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoSectorEcono;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoSectorEcono;
	public JLabel jLabelIdTipoSectorEcono;
	public JLabel jLabelidTipoSectorEcono;
	public JButton jButtonidTipoSectorEconoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoSectorEcono;
	public JLabel jLabelcodigoTipoSectorEcono;
	public JTextField jTextFieldcodigoTipoSectorEcono;
	public JButton jButtoncodigoTipoSectorEconoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoSectorEcono;
	public JLabel jLabelnombreTipoSectorEcono;
	public JTextArea jTextAreanombreTipoSectorEcono;
	public JScrollPane jscrollPanenombreTipoSectorEcono;
	public JButton jButtonnombreTipoSectorEconoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoSectorEcono;
	public JLabel jLabelid_empresaTipoSectorEcono;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoSectorEcono;
	public JButton jButtonid_empresaTipoSectorEcono= new JButtonMe();
	public JButton jButtonid_empresaTipoSectorEconoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoSectorEconoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoSectorEcono;
	
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
	
	public TipoSectorEconoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoSectorEcono=new JPanel();
				this.jPanelAccionesFormularioTipoSectorEcono=new JPanel();
				this.jmenuBarDetalleTipoSectorEcono=new JMenuBar();
				this.jTtoolBarDetalleTipoSectorEcono=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoSectorEconoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoSectorEconoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoSectorEcono No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoSectorEcono() {
		return this.jButtonActualizarToolBarTipoSectorEcono;
	}
	
	public JButton getjButtonEliminarToolBarTipoSectorEcono() {
		return this.jButtonEliminarToolBarTipoSectorEcono;
	}
	
	public JButton getjButtonCancelarToolBarTipoSectorEcono() {
		return this.jButtonCancelarToolBarTipoSectorEcono;
	}		
	
	public JButton getjButtonProcesarInformacionTipoSectorEcono() {
		return this.jButtonProcesarInformacionTipoSectorEcono;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoSectorEcono)	{
		this.jButtonProcesarInformacionTipoSectorEcono = jButtonProcesarInformacionTipoSectorEcono;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoSectorEcono() {
		return this.jComboBoxTiposAccionesTipoSectorEcono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoSectorEcono(
			JComboBox jComboBoxTiposRelacionesTipoSectorEcono) {
		this.jComboBoxTiposRelacionesTipoSectorEcono = jComboBoxTiposRelacionesTipoSectorEcono;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoSectorEcono(
			JComboBox jComboBoxTiposAccionesTipoSectorEcono) {
		this.jComboBoxTiposAccionesTipoSectorEcono = jComboBoxTiposAccionesTipoSectorEcono;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoSectorEcono() {
		return this.jComboBoxTiposAccionesFormularioTipoSectorEcono;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoSectorEcono(
			JComboBox jComboBoxTiposAccionesFormularioTipoSectorEcono) {
		this.jComboBoxTiposAccionesFormularioTipoSectorEcono = jComboBoxTiposAccionesFormularioTipoSectorEcono;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiposectoreconoSessionBean=new TipoSectorEconoSessionBean();
		
		this.tiposectoreconoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposectoreconoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiposectoreconoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoSectorEconoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Sector Econo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoSectorEconoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoSectorEcono= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoSectorEcono=new JButtonMe();
				this.jButtonModificarToolBarTipoSectorEcono=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoSectorEcono,this.jTtoolBarDetalleTipoSectorEcono,
							"actualizar","actualizar","Actualizar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoSectorEcono,this.jTtoolBarDetalleTipoSectorEcono,
							"eliminar","eliminar","Eliminar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoSectorEcono,this.jTtoolBarDetalleTipoSectorEcono,
							"cancelar","cancelar","Cancelar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoSectorEcono=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoSectorEcono,this.jTtoolBarDetalleTipoSectorEcono,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoSectorEcono=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoSectorEcono=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoSectorEcono=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoSectorEcono=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoSectorEcono=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoSectorEcono= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoSectorEcono.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoSectorEcono,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoSectorEcono= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoSectorEcono.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoSectorEcono,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoSectorEcono= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoSectorEcono.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoSectorEcono,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoSectorEcono= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoSectorEcono.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoSectorEcono,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoSectorEcono= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoSectorEcono.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoSectorEcono,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoSectorEcono= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoSectorEcono.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoSectorEcono,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoSectorEcono= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoSectorEcono.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoSectorEcono,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoSectorEcono= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoSectorEcono.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoSectorEcono,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoSectorEcono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoSectorEcono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoSectorEcono,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoSectorEcono= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoSectorEcono.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoSectorEcono,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoSectorEcono.add(this.jMenuItemDetalleCerrarTipoSectorEcono);
		
		this.jmenuDetalleAccionesTipoSectorEcono.add(this.jMenuItemActualizarTipoSectorEcono);
		this.jmenuDetalleAccionesTipoSectorEcono.add(this.jMenuItemEliminarTipoSectorEcono);
		this.jmenuDetalleAccionesTipoSectorEcono.add(this.jMenuItemCancelarTipoSectorEcono);		
		
		//this.jmenuDetalleDatosTipoSectorEcono.add(this.jMenuItemDetalleAbrirOrderByTipoSectorEcono);				
		this.jmenuDetalleDatosTipoSectorEcono.add(this.jMenuItemDetalleMostarOcultarTipoSectorEcono);				
				
		//this.jmenuDetalleAccionesTipoSectorEcono.add(this.jMenuItemGuardarCambiosTipoSectorEcono);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoSectorEcono.add(this.jmenuDetalleArchivoTipoSectorEcono);		
		this.jmenuBarDetalleTipoSectorEcono.add(this.jmenuDetalleAccionesTipoSectorEcono);		
		this.jmenuBarDetalleTipoSectorEcono.add(this.jmenuDetalleDatosTipoSectorEcono);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoSectorEcono.add(this.jmenuDetalleTipoSectorEcono);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoSectorEcono);				
	}
	
	
	public void inicializarElementosCamposTipoSectorEcono() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoSectorEcono = new JLabelMe();
		jLabelIdTipoSectorEcono.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoSectorEcono = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoSectorEcono.setToolTipText(TipoSectorEconoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoSectorEcono= new GridBagLayout();

		this.jPanelidTipoSectorEcono.setLayout(this.gridaBagLayoutTipoSectorEcono);

		jLabelidTipoSectorEcono = new JLabel();
		jLabelidTipoSectorEcono.setText("Id");

		jLabelidTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoSectorEcono = new JLabelMe();
		this.jLabelcodigoTipoSectorEcono.setText(""+TipoSectorEconoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoSectorEcono.setToolTipText("Codigo");
		this.jLabelcodigoTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoSectorEcono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoSectorEcono.setToolTipText(TipoSectorEconoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoSectorEcono = new GridBagLayout();
		this.jPanelcodigoTipoSectorEcono.setLayout(this.gridaBagLayoutTipoSectorEcono);


		jTextFieldcodigoTipoSectorEcono= new JTextFieldMe();

		jTextFieldcodigoTipoSectorEcono.setEnabled(false);
		jTextFieldcodigoTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoSectorEconoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoSectorEconoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSectorEconoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoSectorEconoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoSectorEconoBusqueda.setText("U");
		this.jButtoncodigoTipoSectorEconoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoSectorEconoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoSectorEconoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoSectorEconoBusqueda"));

		if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoSectorEconoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoSectorEcono = new JLabelMe();
		this.jLabelnombreTipoSectorEcono.setText(""+TipoSectorEconoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoSectorEcono.setToolTipText("Nombre");
		this.jLabelnombreTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoSectorEcono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoSectorEcono.setToolTipText(TipoSectorEconoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoSectorEcono = new GridBagLayout();
		this.jPanelnombreTipoSectorEcono.setLayout(this.gridaBagLayoutTipoSectorEcono);


		jTextAreanombreTipoSectorEcono= new JTextAreaMe();
		jTextAreanombreTipoSectorEcono.setEnabled(false);
		jTextAreanombreTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoSectorEcono.setLineWrap(true);
		jTextAreanombreTipoSectorEcono.setWrapStyleWord(true);
		jTextAreanombreTipoSectorEcono.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoSectorEcono.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoSectorEcono = new JScrollPane(jTextAreanombreTipoSectorEcono);
		jscrollPanenombreTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoSectorEconoBusqueda= new JButtonMe();
		this.jButtonnombreTipoSectorEconoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSectorEconoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoSectorEconoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoSectorEconoBusqueda.setText("U");
		this.jButtonnombreTipoSectorEconoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoSectorEconoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoSectorEconoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoSectorEconoBusqueda"));

		if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoSectorEconoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoSectorEcono() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoSectorEcono = new JLabelMe();
		this.jLabelid_empresaTipoSectorEcono.setText(""+TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoSectorEcono.setToolTipText("Empresa");
		this.jLabelid_empresaTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoSectorEcono=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoSectorEcono.setToolTipText(TipoSectorEconoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoSectorEcono = new GridBagLayout();
		this.jPanelid_empresaTipoSectorEcono.setLayout(this.gridaBagLayoutTipoSectorEcono);


		jComboBoxid_empresaTipoSectorEcono= new JComboBoxMe();
		jComboBoxid_empresaTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoSectorEcono.setEnabled(false);

		this.jButtonid_empresaTipoSectorEcono= new JButtonMe();
		this.jButtonid_empresaTipoSectorEcono.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSectorEcono.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSectorEcono.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoSectorEcono.setText("Buscar");
		this.jButtonid_empresaTipoSectorEcono.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoSectorEcono.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSectorEcono,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSectorEcono"));

		this.jButtonid_empresaTipoSectorEconoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoSectorEconoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSectorEconoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSectorEconoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSectorEconoBusqueda.setText("U");
		this.jButtonid_empresaTipoSectorEconoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoSectorEconoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSectorEconoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSectorEconoBusqueda"));

		if(this.tiposectoreconoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoSectorEconoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoSectorEconoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoSectorEconoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSectorEconoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoSectorEconoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoSectorEconoUpdate.setText("U");
		this.jButtonid_empresaTipoSectorEconoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoSectorEconoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoSectorEconoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoSectorEcono.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoSectorEcono.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoSectorEconoUpdate"));



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
		//this.jInternalFrameDetalleTipoSectorEcono = new TipoSectorEconoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Sector Econo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoSectorEcono= new GridBagLayout();
		

		
		String sToolTipTipoSectorEcono="";
		sToolTipTipoSectorEcono=TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoSectorEcono+="(Cartera.TipoSectorEcono)";
		}
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoSectorEcono+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoSectorEcono = new JButtonMe();
		this.jButtonModificarTipoSectorEcono = new JButtonMe();
        this.jButtonActualizarTipoSectorEcono = new JButtonMe();
        this.jButtonEliminarTipoSectorEcono = new JButtonMe();
        this.jButtonCancelarTipoSectorEcono = new JButtonMe();
        this.jButtonGuardarCambiosTipoSectorEcono = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoSectorEcono = new JButtonMe();
		this.jButtonCerrarTipoSectorEcono = new JButtonMe();
		
		this.jScrollPanelDatosTipoSectorEcono = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoSectorEcono = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoSectorEcono = new JScrollPane();
				
		
		
		this.jPanelCamposTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Sector Econo";
		
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Sector Econos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoSectorEcono.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoSectorEcono.setName("jPanelCamposTipoSectorEcono"); 

		this.jPanelCamposOcultosTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoSectorEcono.setName("jPanelCamposOcultosTipoSectorEcono"); 

        this.jPanelAccionesTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoSectorEcono.setToolTipText("Acciones");
        this.jPanelAccionesTipoSectorEcono.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoSectorEcono.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoSectorEcono.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoSectorEcono.setText("Nuevo");
		this.jButtonModificarTipoSectorEcono.setText("Editar");
        this.jButtonActualizarTipoSectorEcono.setText("Actualizar");
        this.jButtonEliminarTipoSectorEcono.setText("Eliminar");
        this.jButtonCancelarTipoSectorEcono.setText("Cancelar");
        this.jButtonGuardarCambiosTipoSectorEcono.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoSectorEcono.setText("Guardar");
		this.jButtonCerrarTipoSectorEcono.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoSectorEcono,"nuevo_button","Nuevo",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoSectorEcono,"modificar_button","Editar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoSectorEcono,"actualizar_button","Actualizar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoSectorEcono,"eliminar_button","Eliminar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoSectorEcono,"cancelar_button","Cancelar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoSectorEcono,"guardarcambios_button","Guardar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoSectorEcono,"guardarcambiostabla_button","Guardar",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoSectorEcono,"cerrar_button","Salir",this.tiposectoreconoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoSectorEcono.setToolTipText("Nuevo"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoSectorEcono.setToolTipText("Editar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoSectorEcono.setToolTipText("Actualizar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoSectorEcono.setToolTipText("Eliminar)"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoSectorEcono.setToolTipText("Cancelar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoSectorEcono.setToolTipText("Guardar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoSectorEcono.setToolTipText("Guardar"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoSectorEcono.setToolTipText("Salir"+" "+TipoSectorEconoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoSectorEcono";
		inputMap = this.jButtonNuevoTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoSectorEcono.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoSectorEcono"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoSectorEcono";
		inputMap = this.jButtonActualizarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoSectorEcono"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoSectorEcono";
		inputMap = this.jButtonEliminarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoSectorEcono"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoSectorEcono";
		inputMap = this.jButtonCancelarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoSectorEcono"));
		
		//CERRAR		
		sMapKey = "CerrarTipoSectorEcono";
		inputMap = this.jButtonCerrarTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoSectorEcono"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoSectorEcono";
		inputMap = this.jButtonGuardarCambiosTablaTipoSectorEcono.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoSectorEcono.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoSectorEcono"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoSectorEcono = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoSectorEcono.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoSectorEcono.setToolTipText("Nuevo TipoSectorEcono");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoSectorEcono = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoSectorEcono.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoSectorEcono.setToolTipText("Sin Cerrar Ventana TipoSectorEcono");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoSectorEcono = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoSectorEcono.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoSectorEcono.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoSectorEcono.setText("Accion");
		this.jComboBoxTiposAccionesTipoSectorEcono.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoSectorEcono = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoSectorEcono.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoSectorEcono.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoSectorEcono = new JLabelMe();
		
		this.jLabelAccionesTipoSectorEcono.setText("Acciones");		
		this.jLabelAccionesTipoSectorEcono.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSectorEcono.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoSectorEcono.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoSectorEcono();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoSectorEcono();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoSectorEcono=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoSectorEcono.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoSectorEcono,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoSectorEcono.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSectorEcono.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoSectorEcono.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoSectorEcono.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSectorEcono.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoSectorEcono.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoSectorEcono, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoSectorEcono = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoSectorEcono = new GridBagLayout();
		
		this.jPanelCamposTipoSectorEcono.setLayout(gridaBagLayoutCamposTipoSectorEcono);
		this.jPanelCamposOcultosTipoSectorEcono.setLayout(gridaBagLayoutCamposOcultosTipoSectorEcono);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoSectorEcono.add(jLabelIdTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 1;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoSectorEcono.add(jLabelidTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);


	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoSectorEcono.add(jLabelid_empresaTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		//this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx = 2;
		this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
		this.gridBagConstraintsTipoSectorEcono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSectorEcono.add(jButtonid_empresaTipoSectorEconoBusqueda, this.gridBagConstraintsTipoSectorEcono);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		//this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx = 3;
		this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
		this.gridBagConstraintsTipoSectorEcono.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoSectorEcono.add(jButtonid_empresaTipoSectorEconoUpdate, this.gridBagConstraintsTipoSectorEcono);
	}

	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 1;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoSectorEcono.add(jComboBoxid_empresaTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);


	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoSectorEcono.add(jLabelcodigoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		//this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx = 2;
		this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
		this.gridBagConstraintsTipoSectorEcono.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoSectorEcono.add(jButtoncodigoTipoSectorEconoBusqueda, this.gridBagConstraintsTipoSectorEcono);
	}

	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 1;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoSectorEcono.add(jTextFieldcodigoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);


	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoSectorEcono.add(jLabelnombreTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		//this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx = 2;
		this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
		this.gridBagConstraintsTipoSectorEcono.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoSectorEcono.add(jButtonnombreTipoSectorEconoBusqueda, this.gridBagConstraintsTipoSectorEcono);
	}

	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoSectorEcono.gridy = 0;
	this.gridBagConstraintsTipoSectorEcono.gridx = 1;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoSectorEcono.add(jscrollPanenombreTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSectorEcono.gridy = iYPanelCamposTipoSectorEcono;
	this.gridBagConstraintsTipoSectorEcono.gridx = iXPanelCamposTipoSectorEcono++;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSectorEcono.add(this.jPanelidTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(iXPanelCamposTipoSectorEcono % 1==0) {
		iXPanelCamposTipoSectorEcono=0;
		iYPanelCamposTipoSectorEcono++;
	}
	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSectorEcono.gridy = iYPanelCamposTipoSectorEcono;
	this.gridBagConstraintsTipoSectorEcono.gridx = iXPanelCamposTipoSectorEcono++;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSectorEcono.add(this.jPanelcodigoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(iXPanelCamposTipoSectorEcono % 1==0) {
		iXPanelCamposTipoSectorEcono=0;
		iYPanelCamposTipoSectorEcono++;
	}
	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSectorEcono.gridy = iYPanelCamposTipoSectorEcono;
	this.gridBagConstraintsTipoSectorEcono.gridx = iXPanelCamposTipoSectorEcono++;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoSectorEcono.add(this.jPanelnombreTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(iXPanelCamposTipoSectorEcono % 1==0) {
		iXPanelCamposTipoSectorEcono=0;
		iYPanelCamposTipoSectorEcono++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoSectorEcono.gridy = iYPanelCamposOcultosTipoSectorEcono;
	this.gridBagConstraintsTipoSectorEcono.gridx = iXPanelCamposOcultosTipoSectorEcono++;
	this.gridBagConstraintsTipoSectorEcono.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoSectorEcono.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoSectorEcono.add(this.jPanelid_empresaTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);



	if(iXPanelCamposOcultosTipoSectorEcono % 1==0) {
		iXPanelCamposOcultosTipoSectorEcono=0;
		iYPanelCamposOcultosTipoSectorEcono++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoSectorEcono= new GridBagLayout();
		this.jPanelAccionesTipoSectorEcono.setLayout(gridaBagLayoutAccionesTipoSectorEcono);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoSectorEcono= new GridBagLayout();
		this.jPanelAccionesFormularioTipoSectorEcono.setLayout(gridaBagLayoutAccionesFormularioTipoSectorEcono);
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSectorEcono.add(this.jComboBoxTiposAccionesFormularioTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoSectorEcono.add(this.jCheckBoxPostAccionNuevoTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSectorEcono.add(this.jCheckBoxPostAccionSinCerrarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiposectoreconoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiposectoreconoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoSectorEcono.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoSectorEcono.add(this.jCheckBoxPostAccionSinMensajeTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoSectorEcono.add(this.jButtonModificarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);							

		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;
		this.gridBagConstraintsTipoSectorEcono.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoSectorEcono.add(this.jButtonEliminarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
			
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSectorEcono.add(this.jButtonActualizarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);


		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;		
		this.gridBagConstraintsTipoSectorEcono.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoSectorEcono.add(this.jButtonGuardarCambiosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);	
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = 0;		
		this.gridBagConstraintsTipoSectorEcono.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoSectorEcono.add(this.jButtonCancelarTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoSectorEcono = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoSectorEcono);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiposectoreconoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();						
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;		
			//this.gridBagConstraintsTipoSectorEcono.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoSectorEcono.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoSectorEcono.gridx =0;
		this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoSectorEcono.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoSectorEconoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoSectorEcono = new TipoSectorEconoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Sector Econo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Sector Econo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Sector Econo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoSectorEconoModel tiposectoreconoModel=new TipoSectorEconoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoSectorEconoModel.TipoSectorEconoFocusTraversalPolicy tiposectoreconoFocusTraversalPolicy = tiposectoreconoModel.new TipoSectorEconoFocusTraversalPolicy(this);
			
			//tiposectoreconoFocusTraversalPolicy.settiposectoreconoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiposectoreconoModel);
			
			
			this.jContentPaneDetalleTipoSectorEcono = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoSectorEcono = new GridBagLayout();	
			this.jContentPaneDetalleTipoSectorEcono.setLayout(gridaBagLayoutDetalleTipoSectorEcono);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoSectorEcono = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
				this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoSectorEcono.gridx = 0;
					
				
				this.jContentPaneDetalleTipoSectorEcono.add(jTtoolBarDetalleTipoSectorEcono, gridBagConstraintsTipoSectorEcono);								
				
}
			
			this.jScrollPanelDatosEdicionTipoSectorEcono=   new JScrollPane(jContentPaneDetalleTipoSectorEcono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSectorEcono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSectorEcono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSectorEcono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoSectorEcono=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoSectorEcono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSectorEcono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoSectorEcono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	        
			this.jContentPaneDetalleTipoSectorEcono.add(jPanelCamposTipoSectorEcono, gridBagConstraintsTipoSectorEcono);
			
			
			
			
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
						&& tiposectoreconoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(this.puedeCargarPorParteReferenciaComercial,false,-1);
					
					if(this.tiposectoreconoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoSectorEcono= new GridBagConstraints();
						this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoSectorEcono.gridx = 0;
						this.jContentPaneDetalleTipoSectorEcono.add(this.jTabbedPaneRelacionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoSectorEcono.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoSectorEcono.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
					this.gridBagConstraintsTipoSectorEcono.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoSectorEcono.gridx = 0;
					
				
					this.jContentPaneDetalleTipoSectorEcono.add(jPanelCamposOcultosTipoSectorEcono, gridBagConstraintsTipoSectorEcono);
				
					this.jPanelCamposOcultosTipoSectorEcono.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	        this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoSectorEcono.add(this.jPanelAccionesFormularioTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);							
			
			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
	        this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoSectorEcono.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoSectorEcono.add(this.jPanelAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoSectorEcono);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoSectorEcono=   new JScrollPane(this.jPanelCamposTipoSectorEcono,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoSectorEcono.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSectorEcono.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoSectorEcono.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;
			this.gridBagConstraintsTipoSectorEcono.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoSectorEcono.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoSectorEcono.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);			
			
			this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
			this.gridBagConstraintsTipoSectorEcono.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoSectorEcono.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
			
			
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		
			
		this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
		this.gridBagConstraintsTipoSectorEcono.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoSectorEcono.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoSectorEcono, this.gridBagConstraintsTipoSectorEcono);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoSectorEcono;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoSectorEcono;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameReferenciaComercial(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		this.referenciacomercialSessionBean.setConGuardarRelaciones(false);
		this.referenciacomercialSessionBean.setEsGuardarRelacionado(true);

		this.referenciacomercialBeanSwingJInternalFrame=null;//new ReferenciaComercialBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciacomercialBeanSwingJInternalFramePopup=new ReferenciaComercialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciacomercialBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {

				ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL=TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoSectorEconoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciacomercialSessionBean.setEsGuardarRelacionado(true);

				this.referenciacomercialBeanSwingJInternalFrame=new ReferenciaComercialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciacomercialBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciacomercialBeanSwingJInternalFrame.setreferenciacomercialSessionBean(this.referenciacomercialSessionBean);

				//this.gridBagConstraintsTipoSectorEcono = new GridBagConstraints();
				//this.gridBagConstraintsTipoSectorEcono.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoSectorEcono.gridx = 0;
				//this.jContentPaneDetalleTipoSectorEcono.add(this.referenciacomercialBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoSectorEcono);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoSectorEcono.add("Referencia Comerciales",this.referenciacomercialBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoSectorEcono.setComponentAt(iIndexTab,this.referenciacomercialBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
				this.referenciacomercialBeanSwingJInternalFrame=null;//new ReferenciaComercialBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaComercial) {
					this.jTabbedPaneRelacionesTipoSectorEcono.add("Referencia Comerciales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarReferenciaComercialBeanSwingJInternalFrame(List<TipoSectorEcono> tiposectoreconos,TipoSectorEcono tiposectorecono,ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciacomercialBeanSwingJInternalFrame=new ReferenciaComercialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciacomercialBeanSwingJInternalFrame.getReferenciaComercialLogic().setConnexion(this.tiposectoreconoLogic.getConnexion());

					referenciacomercialBeanSwingJInternalFrame.settiposectoreconosForeignKey(tiposectoreconos);
					referenciacomercialBeanSwingJInternalFrame.settiposectoreconoForeignKey(tiposectorecono);
					referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setisBusquedaDesdeForeignKeySesionTipoSectorEcono(true);
					referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setlidTipoSectorEconoActual(tiposectorecono.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciacomercialBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaComercial(referenciacomercialBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciacomercialBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoSectorEcono(true);
					referenciacomercialBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciacomercialBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoSectorEcono");
					referenciacomercialBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoSectorEcono");
					referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(true);
					referenciacomercialBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaComercial("n",referenciacomercialBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciacomercialBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciacomercialBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciacomercialBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("relacionado");
					} else {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("no_relacionado");
					}

					referenciacomercialBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaComercial().setVisible(false);

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
