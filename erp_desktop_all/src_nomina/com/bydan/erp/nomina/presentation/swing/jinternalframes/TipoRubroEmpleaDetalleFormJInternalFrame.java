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
import com.bydan.erp.nomina.util.TipoRubroEmpleaConstantesFunciones;

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
public class TipoRubroEmpleaDetalleFormJInternalFrame extends TipoRubroEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRubroEmplea;
	
	protected JMenuBar jmenuBarDetalleTipoRubroEmplea;
	
	protected JMenu jmenuDetalleTipoRubroEmplea;
	protected JMenu jmenuDetalleArchivoTipoRubroEmplea;
	protected JMenu jmenuDetalleAccionesTipoRubroEmplea;
	protected JMenu jmenuDetalleDatosTipoRubroEmplea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRubroEmplea;	
	protected GridBagConstraints gridBagConstraintsTipoRubroEmplea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRubroEmpleaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRubroEmplea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRubroEmpleaSessionBean tiporubroempleaSessionBean;
	
	

	public RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame=null;
	public RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRubroEmplea=false;
	public RubroEmpleaSessionBean rubroempleaSessionBean;
	
		
	
	public TipoRubroEmpleaLogic tiporubroempleaLogic;
	
	public JScrollPane jScrollPanelDatosTipoRubroEmplea;
	public JScrollPane jScrollPanelDatosEdicionTipoRubroEmplea;
	public JScrollPane jScrollPanelDatosGeneralTipoRubroEmplea;
	
	protected JPanel jPanelCamposTipoRubroEmplea;    
	protected JPanel jPanelCamposOcultosTipoRubroEmplea;    	
	protected JPanel jPanelAccionesTipoRubroEmplea;
	protected JPanel jPanelAccionesFormularioTipoRubroEmplea;
    
	
	
	protected Integer iXPanelCamposTipoRubroEmplea=0;
	protected Integer iYPanelCamposTipoRubroEmplea=0;
	
	protected Integer iXPanelCamposOcultosTipoRubroEmplea=0;
	protected Integer iYPanelCamposOcultosTipoRubroEmplea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRubroEmplea;
	public JButton jButtonModificarTipoRubroEmplea;
	public JButton jButtonActualizarTipoRubroEmplea;
    public JButton jButtonEliminarTipoRubroEmplea;
	public JButton jButtonCancelarTipoRubroEmplea;
    public JButton jButtonGuardarCambiosTipoRubroEmplea;
	public JButton jButtonGuardarCambiosTablaTipoRubroEmplea;
	protected JButton jButtonCerrarTipoRubroEmplea;
	
	
	protected JButton jButtonProcesarInformacionTipoRubroEmplea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRubroEmplea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRubroEmplea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRubroEmplea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRubroEmplea;
	protected JButton jButtonModificarToolBarTipoRubroEmplea;
	protected JButton jButtonActualizarToolBarTipoRubroEmplea;
    protected JButton jButtonEliminarToolBarTipoRubroEmplea;
	protected JButton jButtonCancelarToolBarTipoRubroEmplea;
    protected JButton jButtonGuardarCambiosToolBarTipoRubroEmplea;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRubroEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRubroEmplea;
	protected JButton jButtonCerrarToolBarTipoRubroEmplea;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRubroEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRubroEmplea;
	protected JMenuItem jMenuItemModificarTipoRubroEmplea;
	protected JMenuItem jMenuItemActualizarTipoRubroEmplea;
    protected JMenuItem jMenuItemEliminarTipoRubroEmplea;
	protected JMenuItem jMenuItemCancelarTipoRubroEmplea;
    protected JMenuItem jMenuItemGuardarCambiosTipoRubroEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRubroEmplea;
	protected JMenuItem jMenuItemCerrarTipoRubroEmplea;
	protected JMenuItem jMenuItemDetalleCerrarTipoRubroEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRubroEmplea;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRubroEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRubroEmplea;
	protected JMenuItem jMenuItemMostrarOcultarTipoRubroEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRubroEmplea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRubroEmplea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRubroEmplea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRubroEmplea;
	public JLabel jLabelIdTipoRubroEmplea;
	public JTextFieldMe jTextFieldidTipoRubroEmplea;
	public JButton jButtonidTipoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRubroEmplea;
	public JLabel jLabelcodigoTipoRubroEmplea;
	public JTextField jTextFieldcodigoTipoRubroEmplea;
	public JButton jButtoncodigoTipoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRubroEmplea;
	public JLabel jLabelnombreTipoRubroEmplea;
	public JTextField jTextFieldnombreTipoRubroEmplea;
	public JButton jButtonnombreTipoRubroEmpleaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRubroEmplea;
	
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
	
	public TipoRubroEmpleaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRubroEmplea=new JPanel();
				this.jPanelAccionesFormularioTipoRubroEmplea=new JPanel();
				this.jmenuBarDetalleTipoRubroEmplea=new JMenuBar();
				this.jTtoolBarDetalleTipoRubroEmplea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRubroEmpleaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRubroEmpleaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRubroEmplea() {
		return this.jButtonActualizarToolBarTipoRubroEmplea;
	}
	
	public JButton getjButtonEliminarToolBarTipoRubroEmplea() {
		return this.jButtonEliminarToolBarTipoRubroEmplea;
	}
	
	public JButton getjButtonCancelarToolBarTipoRubroEmplea() {
		return this.jButtonCancelarToolBarTipoRubroEmplea;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRubroEmplea() {
		return this.jButtonProcesarInformacionTipoRubroEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRubroEmplea)	{
		this.jButtonProcesarInformacionTipoRubroEmplea = jButtonProcesarInformacionTipoRubroEmplea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRubroEmplea() {
		return this.jComboBoxTiposAccionesTipoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRubroEmplea(
			JComboBox jComboBoxTiposRelacionesTipoRubroEmplea) {
		this.jComboBoxTiposRelacionesTipoRubroEmplea = jComboBoxTiposRelacionesTipoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRubroEmplea(
			JComboBox jComboBoxTiposAccionesTipoRubroEmplea) {
		this.jComboBoxTiposAccionesTipoRubroEmplea = jComboBoxTiposAccionesTipoRubroEmplea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRubroEmplea() {
		return this.jComboBoxTiposAccionesFormularioTipoRubroEmplea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRubroEmplea(
			JComboBox jComboBoxTiposAccionesFormularioTipoRubroEmplea) {
		this.jComboBoxTiposAccionesFormularioTipoRubroEmplea = jComboBoxTiposAccionesFormularioTipoRubroEmplea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporubroempleaSessionBean=new TipoRubroEmpleaSessionBean();
		
		this.tiporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporubroempleaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.rubroempleaSessionBean=new RubroEmpleaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRubroEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rubro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRubroEmplea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRubroEmplea=new JButtonMe();
				this.jButtonModificarToolBarTipoRubroEmplea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRubroEmplea,this.jTtoolBarDetalleTipoRubroEmplea,
							"actualizar","actualizar","Actualizar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRubroEmplea,this.jTtoolBarDetalleTipoRubroEmplea,
							"eliminar","eliminar","Eliminar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRubroEmplea,this.jTtoolBarDetalleTipoRubroEmplea,
							"cancelar","cancelar","Cancelar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRubroEmplea,this.jTtoolBarDetalleTipoRubroEmplea,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRubroEmplea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRubroEmplea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRubroEmplea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRubroEmplea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRubroEmplea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRubroEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRubroEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRubroEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRubroEmplea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRubroEmplea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRubroEmplea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRubroEmplea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRubroEmplea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRubroEmplea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRubroEmplea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRubroEmplea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRubroEmplea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRubroEmplea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRubroEmplea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRubroEmplea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRubroEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRubroEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRubroEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRubroEmplea.add(this.jMenuItemDetalleCerrarTipoRubroEmplea);
		
		this.jmenuDetalleAccionesTipoRubroEmplea.add(this.jMenuItemActualizarTipoRubroEmplea);
		this.jmenuDetalleAccionesTipoRubroEmplea.add(this.jMenuItemEliminarTipoRubroEmplea);
		this.jmenuDetalleAccionesTipoRubroEmplea.add(this.jMenuItemCancelarTipoRubroEmplea);		
		
		//this.jmenuDetalleDatosTipoRubroEmplea.add(this.jMenuItemDetalleAbrirOrderByTipoRubroEmplea);				
		this.jmenuDetalleDatosTipoRubroEmplea.add(this.jMenuItemDetalleMostarOcultarTipoRubroEmplea);				
				
		//this.jmenuDetalleAccionesTipoRubroEmplea.add(this.jMenuItemGuardarCambiosTipoRubroEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRubroEmplea.add(this.jmenuDetalleArchivoTipoRubroEmplea);		
		this.jmenuBarDetalleTipoRubroEmplea.add(this.jmenuDetalleAccionesTipoRubroEmplea);		
		this.jmenuBarDetalleTipoRubroEmplea.add(this.jmenuDetalleDatosTipoRubroEmplea);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRubroEmplea.add(this.jmenuDetalleTipoRubroEmplea);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRubroEmplea);				
	}
	
	
	public void inicializarElementosCamposTipoRubroEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRubroEmplea = new JLabelMe();
		jLabelIdTipoRubroEmplea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRubroEmplea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRubroEmplea.setToolTipText(TipoRubroEmpleaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRubroEmplea= new GridBagLayout();

		this.jPanelidTipoRubroEmplea.setLayout(this.gridaBagLayoutTipoRubroEmplea);

		jTextFieldidTipoRubroEmplea = new JTextFieldMe();
		jTextFieldidTipoRubroEmplea.setText("Id");

		jTextFieldidTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRubroEmplea = new JLabelMe();
		this.jLabelcodigoTipoRubroEmplea.setText(""+TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRubroEmplea.setToolTipText("Codigo");
		this.jLabelcodigoTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRubroEmplea.setToolTipText(TipoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRubroEmplea = new GridBagLayout();
		this.jPanelcodigoTipoRubroEmplea.setLayout(this.gridaBagLayoutTipoRubroEmplea);


		jTextFieldcodigoTipoRubroEmplea= new JTextFieldMe();

		jTextFieldcodigoTipoRubroEmplea.setEnabled(false);
		jTextFieldcodigoTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRubroEmpleaBusqueda.setText("U");
		this.jButtoncodigoTipoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRubroEmpleaBusqueda"));

		if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRubroEmplea = new JLabelMe();
		this.jLabelnombreTipoRubroEmplea.setText(""+TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRubroEmplea.setToolTipText("Nombre");
		this.jLabelnombreTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRubroEmplea.setToolTipText(TipoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRubroEmplea = new GridBagLayout();
		this.jPanelnombreTipoRubroEmplea.setLayout(this.gridaBagLayoutTipoRubroEmplea);


		jTextFieldnombreTipoRubroEmplea= new JTextFieldMe();

		jTextFieldnombreTipoRubroEmplea.setEnabled(false);
		jTextFieldnombreTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonnombreTipoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRubroEmpleaBusqueda.setText("U");
		this.jButtonnombreTipoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRubroEmpleaBusqueda"));

		if(this.tiporubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRubroEmpleaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRubroEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoRubroEmplea = new TipoRubroEmpleaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Rubro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRubroEmplea= new GridBagLayout();
		

		
		String sToolTipTipoRubroEmplea="";
		sToolTipTipoRubroEmplea=TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRubroEmplea+="(Nomina.TipoRubroEmplea)";
		}
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRubroEmplea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRubroEmplea = new JButtonMe();
		this.jButtonModificarTipoRubroEmplea = new JButtonMe();
        this.jButtonActualizarTipoRubroEmplea = new JButtonMe();
        this.jButtonEliminarTipoRubroEmplea = new JButtonMe();
        this.jButtonCancelarTipoRubroEmplea = new JButtonMe();
        this.jButtonGuardarCambiosTipoRubroEmplea = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRubroEmplea = new JButtonMe();
		this.jButtonCerrarTipoRubroEmplea = new JButtonMe();
		
		this.jScrollPanelDatosTipoRubroEmplea = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRubroEmplea = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRubroEmplea = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rubro";
		
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rubros" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRubroEmplea.setName("jPanelCamposTipoRubroEmplea"); 

		this.jPanelCamposOcultosTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRubroEmplea.setName("jPanelCamposOcultosTipoRubroEmplea"); 

        this.jPanelAccionesTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesTipoRubroEmplea.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRubroEmplea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRubroEmplea.setText("Nuevo");
		this.jButtonModificarTipoRubroEmplea.setText("Editar");
        this.jButtonActualizarTipoRubroEmplea.setText("Actualizar");
        this.jButtonEliminarTipoRubroEmplea.setText("Eliminar");
        this.jButtonCancelarTipoRubroEmplea.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRubroEmplea.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.setText("Guardar");
		this.jButtonCerrarTipoRubroEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRubroEmplea,"nuevo_button","Nuevo",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRubroEmplea,"modificar_button","Editar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRubroEmplea,"actualizar_button","Actualizar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRubroEmplea,"eliminar_button","Eliminar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRubroEmplea,"cancelar_button","Cancelar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRubroEmplea,"guardarcambios_button","Guardar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRubroEmplea,"guardarcambiostabla_button","Guardar",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRubroEmplea,"cerrar_button","Salir",this.tiporubroempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRubroEmplea.setToolTipText("Nuevo"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRubroEmplea.setToolTipText("Editar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRubroEmplea.setToolTipText("Actualizar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRubroEmplea.setToolTipText("Eliminar)"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRubroEmplea.setToolTipText("Cancelar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRubroEmplea.setToolTipText("Guardar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.setToolTipText("Guardar"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRubroEmplea.setToolTipText("Salir"+" "+TipoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRubroEmplea";
		inputMap = this.jButtonNuevoTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRubroEmplea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRubroEmplea";
		inputMap = this.jButtonActualizarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRubroEmplea"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRubroEmplea";
		inputMap = this.jButtonEliminarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRubroEmplea"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRubroEmplea";
		inputMap = this.jButtonCancelarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRubroEmplea"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRubroEmplea";
		inputMap = this.jButtonCerrarTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRubroEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRubroEmplea";
		inputMap = this.jButtonGuardarCambiosTablaTipoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRubroEmplea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRubroEmplea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRubroEmplea.setToolTipText("Nuevo TipoRubroEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRubroEmplea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRubroEmplea.setToolTipText("Sin Cerrar Ventana TipoRubroEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRubroEmplea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRubroEmplea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRubroEmplea.setText("Accion");
		this.jComboBoxTiposAccionesTipoRubroEmplea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRubroEmplea = new JLabelMe();
		
		this.jLabelAccionesTipoRubroEmplea.setText("Acciones");		
		this.jLabelAccionesTipoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRubroEmplea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRubroEmplea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRubroEmplea=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRubroEmplea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRubroEmplea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRubroEmplea = new GridBagLayout();
		
		this.jPanelCamposTipoRubroEmplea.setLayout(gridaBagLayoutCamposTipoRubroEmplea);
		this.jPanelCamposOcultosTipoRubroEmplea.setLayout(gridaBagLayoutCamposOcultosTipoRubroEmplea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRubroEmplea.add(jLabelIdTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);



	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoRubroEmplea.gridx = 1;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRubroEmplea.add(jTextFieldidTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);


	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRubroEmplea.add(jLabelcodigoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoRubroEmplea.gridx = 2;
		this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
		this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRubroEmplea.add(jButtoncodigoTipoRubroEmpleaBusqueda, this.gridBagConstraintsTipoRubroEmplea);
	}

	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoRubroEmplea.gridx = 1;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRubroEmplea.add(jTextFieldcodigoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);


	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRubroEmplea.add(jLabelnombreTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoRubroEmplea.gridx = 2;
		this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
		this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRubroEmplea.add(jButtonnombreTipoRubroEmpleaBusqueda, this.gridBagConstraintsTipoRubroEmplea);
	}

	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoRubroEmplea.gridx = 1;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRubroEmplea.add(jTextFieldnombreTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRubroEmplea.gridy = iYPanelCamposTipoRubroEmplea;
	this.gridBagConstraintsTipoRubroEmplea.gridx = iXPanelCamposTipoRubroEmplea++;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRubroEmplea.add(this.jPanelidTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);



	if(iXPanelCamposTipoRubroEmplea % 1==0) {
		iXPanelCamposTipoRubroEmplea=0;
		iYPanelCamposTipoRubroEmplea++;
	}
	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRubroEmplea.gridy = iYPanelCamposTipoRubroEmplea;
	this.gridBagConstraintsTipoRubroEmplea.gridx = iXPanelCamposTipoRubroEmplea++;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRubroEmplea.add(this.jPanelcodigoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);



	if(iXPanelCamposTipoRubroEmplea % 1==0) {
		iXPanelCamposTipoRubroEmplea=0;
		iYPanelCamposTipoRubroEmplea++;
	}
	this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRubroEmplea.gridy = iYPanelCamposTipoRubroEmplea;
	this.gridBagConstraintsTipoRubroEmplea.gridx = iXPanelCamposTipoRubroEmplea++;
	this.gridBagConstraintsTipoRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRubroEmplea.add(this.jPanelnombreTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);



	if(iXPanelCamposTipoRubroEmplea % 1==0) {
		iXPanelCamposTipoRubroEmplea=0;
		iYPanelCamposTipoRubroEmplea++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRubroEmplea= new GridBagLayout();
		this.jPanelAccionesTipoRubroEmplea.setLayout(gridaBagLayoutAccionesTipoRubroEmplea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRubroEmplea= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRubroEmplea.setLayout(gridaBagLayoutAccionesFormularioTipoRubroEmplea);
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRubroEmplea.add(this.jComboBoxTiposAccionesFormularioTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);

		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRubroEmplea.add(this.jCheckBoxPostAccionNuevoTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRubroEmplea.add(this.jCheckBoxPostAccionSinCerrarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporubroempleaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRubroEmplea.add(this.jCheckBoxPostAccionSinMensajeTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRubroEmplea.add(this.jButtonModificarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);							

		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoRubroEmplea.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRubroEmplea.add(this.jButtonEliminarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
			
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRubroEmplea.add(this.jButtonActualizarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);


		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRubroEmplea.add(this.jButtonGuardarCambiosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);	
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = 0;		
		this.gridBagConstraintsTipoRubroEmplea.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRubroEmplea.add(this.jButtonCancelarTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRubroEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRubroEmplea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporubroempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();						
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRubroEmplea.gridx = 0;		
			//this.gridBagConstraintsTipoRubroEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRubroEmplea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRubroEmplea.gridx =0;
		this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRubroEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRubroEmplea = new TipoRubroEmpleaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Rubro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Rubro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rubro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRubroEmpleaModel tiporubroempleaModel=new TipoRubroEmpleaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRubroEmpleaModel.TipoRubroEmpleaFocusTraversalPolicy tiporubroempleaFocusTraversalPolicy = tiporubroempleaModel.new TipoRubroEmpleaFocusTraversalPolicy(this);
			
			//tiporubroempleaFocusTraversalPolicy.settiporubroempleaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporubroempleaModel);
			
			
			this.jContentPaneDetalleTipoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRubroEmplea = new GridBagLayout();	
			this.jContentPaneDetalleTipoRubroEmplea.setLayout(gridaBagLayoutDetalleTipoRubroEmplea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRubroEmplea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRubroEmplea.add(jTtoolBarDetalleTipoRubroEmplea, gridBagConstraintsTipoRubroEmplea);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRubroEmplea=   new JScrollPane(jContentPaneDetalleTipoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRubroEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
	        
			this.jContentPaneDetalleTipoRubroEmplea.add(jPanelCamposTipoRubroEmplea, gridBagConstraintsTipoRubroEmplea);
			
			
			
			
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
						&& tiporubroempleaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameRubroEmplea(this.puedeCargarPorParteRubroEmplea,false,-1);
					
					if(this.tiporubroempleaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRubroEmplea= new GridBagConstraints();
						this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
						this.jContentPaneDetalleTipoRubroEmplea.add(this.jTabbedPaneRelacionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRubroEmplea.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameRubroEmplea(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRubroEmplea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
					this.gridBagConstraintsTipoRubroEmplea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRubroEmplea.add(jPanelCamposOcultosTipoRubroEmplea, gridBagConstraintsTipoRubroEmplea);
				
					this.jPanelCamposOcultosTipoRubroEmplea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
	        this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRubroEmplea.add(this.jPanelAccionesFormularioTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);							
			
			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
	        this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRubroEmplea.add(this.jPanelAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRubroEmplea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRubroEmplea=   new JScrollPane(this.jPanelCamposTipoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
			this.gridBagConstraintsTipoRubroEmplea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRubroEmplea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRubroEmplea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);			
			
			this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoRubroEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
			
			
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		
			
		this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoRubroEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRubroEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRubroEmplea, this.gridBagConstraintsTipoRubroEmplea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRubroEmplea;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRubroEmplea;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameRubroEmplea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.rubroempleaSessionBean=new RubroEmpleaSessionBean();
		this.rubroempleaSessionBean.setConGuardarRelaciones(false);
		this.rubroempleaSessionBean.setEsGuardarRelacionado(true);

		this.rubroempleaBeanSwingJInternalFrame=null;//new RubroEmpleaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.rubroempleaBeanSwingJInternalFramePopup=new RubroEmpleaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.rubroempleaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.rubroempleaSessionBean.getEsGuardarRelacionado()) {

				RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;
				RubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.rubroempleaSessionBean.setEsGuardarRelacionado(true);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.rubroempleaBeanSwingJInternalFrame.setrubroempleaSessionBean(this.rubroempleaSessionBean);

				//this.gridBagConstraintsTipoRubroEmplea = new GridBagConstraints();
				//this.gridBagConstraintsTipoRubroEmplea.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRubroEmplea.gridx = 0;
				//this.jContentPaneDetalleTipoRubroEmplea.add(this.rubroempleaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRubroEmplea);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRubroEmplea.add("Rubro Empleas",this.rubroempleaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRubroEmplea.setComponentAt(iIndexTab,this.rubroempleaBeanSwingJInternalFrame.getContentPane());
				}

				//RubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.rubroempleaSessionBean.setEsGuardarRelacionado(false);
				this.rubroempleaBeanSwingJInternalFrame=null;//new RubroEmpleaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.rubroempleaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRubroEmplea) {
					this.jTabbedPaneRelacionesTipoRubroEmplea.add("Rubro Empleas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRubroEmpleaBeanSwingJInternalFrame(List<TipoRubroEmplea> tiporubroempleas,TipoRubroEmplea tiporubroemplea,RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.tiporubroempleaLogic.getConnexion());

					rubroempleaBeanSwingJInternalFrame.settiporubroempleasForeignKey(tiporubroempleas);
					rubroempleaBeanSwingJInternalFrame.settiporubroempleaForeignKey(tiporubroemplea);
					rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.setisBusquedaDesdeForeignKeySesionTipoRubroEmplea(true);
					rubroempleaBeanSwingJInternalFrame.rubroempleaSessionBean.setlidTipoRubroEmpleaActual(tiporubroemplea.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					rubroempleaBeanSwingJInternalFrame.cargarCombosForeignKeyRubroEmplea(rubroempleaBeanSwingJInternalFrame.isCargarCombosDependencia);
					rubroempleaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRubroEmplea(true);
					rubroempleaBeanSwingJInternalFrame.setid_tipo_rubro_empleaFK_IdTipoRubroEmplea(tiporubroemplea.getId());

					if(!this.conCargarFormDetalle) {
						rubroempleaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					rubroempleaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRubroEmpleaForeignKey(tiporubroemplea,1,false,true,true);
					rubroempleaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					rubroempleaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRubroEmplea");
					rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRubroEmplea");
					rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea(true);
					rubroempleaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRubroEmplea("n",rubroempleaBeanSwingJInternalFrame.isGuardarCambiosEnLote, rubroempleaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					rubroempleaBeanSwingJInternalFrame.setAutoscrolls(true);
					rubroempleaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						rubroempleaBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmplea("relacionado");
					} else {
						rubroempleaBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmplea("no_relacionado");
					}

					rubroempleaBeanSwingJInternalFrame.getjButtonRecargarInformacionRubroEmplea().setVisible(false);

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
