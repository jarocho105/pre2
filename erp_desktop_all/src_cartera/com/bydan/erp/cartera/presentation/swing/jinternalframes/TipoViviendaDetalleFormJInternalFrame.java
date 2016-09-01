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
import com.bydan.erp.cartera.util.TipoViviendaConstantesFunciones;

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
public class TipoViviendaDetalleFormJInternalFrame extends TipoViviendaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoVivienda;
	
	protected JMenuBar jmenuBarDetalleTipoVivienda;
	
	protected JMenu jmenuDetalleTipoVivienda;
	protected JMenu jmenuDetalleArchivoTipoVivienda;
	protected JMenu jmenuDetalleAccionesTipoVivienda;
	protected JMenu jmenuDetalleDatosTipoVivienda;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoVivienda;	
	protected GridBagConstraints gridBagConstraintsTipoVivienda;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoViviendaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoVivienda;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoViviendaSessionBean tipoviviendaSessionBean;
	
	

	public DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame=null;
	public DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDireccion=false;
	public DireccionSessionBean direccionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoViviendaLogic tipoviviendaLogic;
	
	public JScrollPane jScrollPanelDatosTipoVivienda;
	public JScrollPane jScrollPanelDatosEdicionTipoVivienda;
	public JScrollPane jScrollPanelDatosGeneralTipoVivienda;
	
	protected JPanel jPanelCamposTipoVivienda;    
	protected JPanel jPanelCamposOcultosTipoVivienda;    	
	protected JPanel jPanelAccionesTipoVivienda;
	protected JPanel jPanelAccionesFormularioTipoVivienda;
    
	
	
	protected Integer iXPanelCamposTipoVivienda=0;
	protected Integer iYPanelCamposTipoVivienda=0;
	
	protected Integer iXPanelCamposOcultosTipoVivienda=0;
	protected Integer iYPanelCamposOcultosTipoVivienda=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoVivienda;
	public JButton jButtonModificarTipoVivienda;
	public JButton jButtonActualizarTipoVivienda;
    public JButton jButtonEliminarTipoVivienda;
	public JButton jButtonCancelarTipoVivienda;
    public JButton jButtonGuardarCambiosTipoVivienda;
	public JButton jButtonGuardarCambiosTablaTipoVivienda;
	protected JButton jButtonCerrarTipoVivienda;
	
	
	protected JButton jButtonProcesarInformacionTipoVivienda;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoVivienda;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoVivienda;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoVivienda;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoVivienda;
	protected JButton jButtonModificarToolBarTipoVivienda;
	protected JButton jButtonActualizarToolBarTipoVivienda;
    protected JButton jButtonEliminarToolBarTipoVivienda;
	protected JButton jButtonCancelarToolBarTipoVivienda;
    protected JButton jButtonGuardarCambiosToolBarTipoVivienda;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoVivienda;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoVivienda;
	protected JButton jButtonCerrarToolBarTipoVivienda;
	
	protected JButton jButtonProcesarInformacionToolBarTipoVivienda;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoVivienda;
	protected JMenuItem jMenuItemModificarTipoVivienda;
	protected JMenuItem jMenuItemActualizarTipoVivienda;
    protected JMenuItem jMenuItemEliminarTipoVivienda;
	protected JMenuItem jMenuItemCancelarTipoVivienda;
    protected JMenuItem jMenuItemGuardarCambiosTipoVivienda;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoVivienda;
	protected JMenuItem jMenuItemCerrarTipoVivienda;
	protected JMenuItem jMenuItemDetalleCerrarTipoVivienda;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoVivienda;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoVivienda;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoVivienda;
	protected JMenuItem jMenuItemMostrarOcultarTipoVivienda;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoVivienda;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoVivienda;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoVivienda;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoVivienda;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoVivienda;
	public JLabel jLabelIdTipoVivienda;
	public JLabel jLabelidTipoVivienda;
	public JButton jButtonidTipoViviendaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoVivienda;
	public JLabel jLabelcodigoTipoVivienda;
	public JTextField jTextFieldcodigoTipoVivienda;
	public JButton jButtoncodigoTipoViviendaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoVivienda;
	public JLabel jLabelnombreTipoVivienda;
	public JTextArea jTextAreanombreTipoVivienda;
	public JScrollPane jscrollPanenombreTipoVivienda;
	public JButton jButtonnombreTipoViviendaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoVivienda;
	public JLabel jLabelid_empresaTipoVivienda;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoVivienda;
	public JButton jButtonid_empresaTipoVivienda= new JButtonMe();
	public JButton jButtonid_empresaTipoViviendaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoViviendaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoVivienda;
	
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
	
	public TipoViviendaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoVivienda=new JPanel();
				this.jPanelAccionesFormularioTipoVivienda=new JPanel();
				this.jmenuBarDetalleTipoVivienda=new JMenuBar();
				this.jTtoolBarDetalleTipoVivienda=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoViviendaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViviendaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoVivienda No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoVivienda() {
		return this.jButtonActualizarToolBarTipoVivienda;
	}
	
	public JButton getjButtonEliminarToolBarTipoVivienda() {
		return this.jButtonEliminarToolBarTipoVivienda;
	}
	
	public JButton getjButtonCancelarToolBarTipoVivienda() {
		return this.jButtonCancelarToolBarTipoVivienda;
	}		
	
	public JButton getjButtonProcesarInformacionTipoVivienda() {
		return this.jButtonProcesarInformacionTipoVivienda;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoVivienda)	{
		this.jButtonProcesarInformacionTipoVivienda = jButtonProcesarInformacionTipoVivienda;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoVivienda() {
		return this.jComboBoxTiposAccionesTipoVivienda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoVivienda(
			JComboBox jComboBoxTiposRelacionesTipoVivienda) {
		this.jComboBoxTiposRelacionesTipoVivienda = jComboBoxTiposRelacionesTipoVivienda;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoVivienda(
			JComboBox jComboBoxTiposAccionesTipoVivienda) {
		this.jComboBoxTiposAccionesTipoVivienda = jComboBoxTiposAccionesTipoVivienda;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoVivienda() {
		return this.jComboBoxTiposAccionesFormularioTipoVivienda;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoVivienda(
			JComboBox jComboBoxTiposAccionesFormularioTipoVivienda) {
		this.jComboBoxTiposAccionesFormularioTipoVivienda = jComboBoxTiposAccionesFormularioTipoVivienda;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
		
		this.tipoviviendaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoviviendaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoviviendaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.direccionSessionBean=new DireccionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoViviendaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Vivienda MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoViviendaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoVivienda= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoVivienda=new JButtonMe();
				this.jButtonModificarToolBarTipoVivienda=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoVivienda,this.jTtoolBarDetalleTipoVivienda,
							"actualizar","actualizar","Actualizar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoVivienda,this.jTtoolBarDetalleTipoVivienda,
							"eliminar","eliminar","Eliminar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoVivienda,this.jTtoolBarDetalleTipoVivienda,
							"cancelar","cancelar","Cancelar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoVivienda=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoVivienda,this.jTtoolBarDetalleTipoVivienda,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoVivienda=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoVivienda=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoVivienda=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoVivienda=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoVivienda=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoVivienda= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoVivienda.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoVivienda,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoVivienda= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoVivienda.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoVivienda,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoVivienda= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoVivienda.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoVivienda,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoVivienda= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoVivienda.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoVivienda,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoVivienda= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoVivienda.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoVivienda,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoVivienda= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoVivienda.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoVivienda,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoVivienda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoVivienda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoVivienda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoVivienda= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoVivienda.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoVivienda,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoVivienda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoVivienda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoVivienda,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoVivienda= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoVivienda.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoVivienda,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoVivienda.add(this.jMenuItemDetalleCerrarTipoVivienda);
		
		this.jmenuDetalleAccionesTipoVivienda.add(this.jMenuItemActualizarTipoVivienda);
		this.jmenuDetalleAccionesTipoVivienda.add(this.jMenuItemEliminarTipoVivienda);
		this.jmenuDetalleAccionesTipoVivienda.add(this.jMenuItemCancelarTipoVivienda);		
		
		//this.jmenuDetalleDatosTipoVivienda.add(this.jMenuItemDetalleAbrirOrderByTipoVivienda);				
		this.jmenuDetalleDatosTipoVivienda.add(this.jMenuItemDetalleMostarOcultarTipoVivienda);				
				
		//this.jmenuDetalleAccionesTipoVivienda.add(this.jMenuItemGuardarCambiosTipoVivienda);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoVivienda.add(this.jmenuDetalleArchivoTipoVivienda);		
		this.jmenuBarDetalleTipoVivienda.add(this.jmenuDetalleAccionesTipoVivienda);		
		this.jmenuBarDetalleTipoVivienda.add(this.jmenuDetalleDatosTipoVivienda);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoVivienda.add(this.jmenuDetalleTipoVivienda);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoVivienda);				
	}
	
	
	public void inicializarElementosCamposTipoVivienda() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoVivienda = new JLabelMe();
		jLabelIdTipoVivienda.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoVivienda = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoVivienda.setToolTipText(TipoViviendaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoVivienda= new GridBagLayout();

		this.jPanelidTipoVivienda.setLayout(this.gridaBagLayoutTipoVivienda);

		jLabelidTipoVivienda = new JLabel();
		jLabelidTipoVivienda.setText("Id");

		jLabelidTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoVivienda = new JLabelMe();
		this.jLabelcodigoTipoVivienda.setText(""+TipoViviendaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoVivienda.setToolTipText("Codigo");
		this.jLabelcodigoTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoVivienda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoVivienda.setToolTipText(TipoViviendaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoVivienda = new GridBagLayout();
		this.jPanelcodigoTipoVivienda.setLayout(this.gridaBagLayoutTipoVivienda);


		jTextFieldcodigoTipoVivienda= new JTextFieldMe();

		jTextFieldcodigoTipoVivienda.setEnabled(false);
		jTextFieldcodigoTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoViviendaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoViviendaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoViviendaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoViviendaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoViviendaBusqueda.setText("U");
		this.jButtoncodigoTipoViviendaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoViviendaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoViviendaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoViviendaBusqueda"));

		if(this.tipoviviendaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoViviendaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoVivienda = new JLabelMe();
		this.jLabelnombreTipoVivienda.setText(""+TipoViviendaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoVivienda.setToolTipText("Nombre");
		this.jLabelnombreTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoVivienda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoVivienda.setToolTipText(TipoViviendaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoVivienda = new GridBagLayout();
		this.jPanelnombreTipoVivienda.setLayout(this.gridaBagLayoutTipoVivienda);


		jTextAreanombreTipoVivienda= new JTextAreaMe();
		jTextAreanombreTipoVivienda.setEnabled(false);
		jTextAreanombreTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoVivienda.setLineWrap(true);
		jTextAreanombreTipoVivienda.setWrapStyleWord(true);
		jTextAreanombreTipoVivienda.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoVivienda.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoVivienda = new JScrollPane(jTextAreanombreTipoVivienda);
		jscrollPanenombreTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoViviendaBusqueda= new JButtonMe();
		this.jButtonnombreTipoViviendaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoViviendaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoViviendaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoViviendaBusqueda.setText("U");
		this.jButtonnombreTipoViviendaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoViviendaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoViviendaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoViviendaBusqueda"));

		if(this.tipoviviendaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoViviendaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoVivienda() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoVivienda = new JLabelMe();
		this.jLabelid_empresaTipoVivienda.setText(""+TipoViviendaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoVivienda.setToolTipText("Empresa");
		this.jLabelid_empresaTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoVivienda=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoVivienda.setToolTipText(TipoViviendaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoVivienda = new GridBagLayout();
		this.jPanelid_empresaTipoVivienda.setLayout(this.gridaBagLayoutTipoVivienda);


		jComboBoxid_empresaTipoVivienda= new JComboBoxMe();
		jComboBoxid_empresaTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoVivienda.setEnabled(false);

		this.jButtonid_empresaTipoVivienda= new JButtonMe();
		this.jButtonid_empresaTipoVivienda.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVivienda.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVivienda.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoVivienda.setText("Buscar");
		this.jButtonid_empresaTipoVivienda.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoVivienda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoVivienda,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoVivienda"));

		this.jButtonid_empresaTipoViviendaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoViviendaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoViviendaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoViviendaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoViviendaBusqueda.setText("U");
		this.jButtonid_empresaTipoViviendaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoViviendaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoViviendaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoViviendaBusqueda"));

		if(this.tipoviviendaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoViviendaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoViviendaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoViviendaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoViviendaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoViviendaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoViviendaUpdate.setText("U");
		this.jButtonid_empresaTipoViviendaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoViviendaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoViviendaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoViviendaUpdate"));



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
		//this.jInternalFrameDetalleTipoVivienda = new TipoViviendaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Vivienda DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoVivienda= new GridBagLayout();
		

		
		String sToolTipTipoVivienda="";
		sToolTipTipoVivienda=TipoViviendaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoVivienda+="(Cartera.TipoVivienda)";
		}
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoVivienda+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoVivienda = new JButtonMe();
		this.jButtonModificarTipoVivienda = new JButtonMe();
        this.jButtonActualizarTipoVivienda = new JButtonMe();
        this.jButtonEliminarTipoVivienda = new JButtonMe();
        this.jButtonCancelarTipoVivienda = new JButtonMe();
        this.jButtonGuardarCambiosTipoVivienda = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoVivienda = new JButtonMe();
		this.jButtonCerrarTipoVivienda = new JButtonMe();
		
		this.jScrollPanelDatosTipoVivienda = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoVivienda = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoVivienda = new JScrollPane();
				
		
		
		this.jPanelCamposTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Vivienda";
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Viviendas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoVivienda.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoVivienda.setName("jPanelCamposTipoVivienda"); 

		this.jPanelCamposOcultosTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoVivienda.setName("jPanelCamposOcultosTipoVivienda"); 

        this.jPanelAccionesTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoVivienda.setToolTipText("Acciones");
        this.jPanelAccionesTipoVivienda.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoVivienda.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoVivienda.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoVivienda.setText("Nuevo");
		this.jButtonModificarTipoVivienda.setText("Editar");
        this.jButtonActualizarTipoVivienda.setText("Actualizar");
        this.jButtonEliminarTipoVivienda.setText("Eliminar");
        this.jButtonCancelarTipoVivienda.setText("Cancelar");
        this.jButtonGuardarCambiosTipoVivienda.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoVivienda.setText("Guardar");
		this.jButtonCerrarTipoVivienda.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoVivienda,"nuevo_button","Nuevo",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoVivienda,"modificar_button","Editar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoVivienda,"actualizar_button","Actualizar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoVivienda,"eliminar_button","Eliminar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoVivienda,"cancelar_button","Cancelar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoVivienda,"guardarcambios_button","Guardar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoVivienda,"guardarcambiostabla_button","Guardar",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoVivienda,"cerrar_button","Salir",this.tipoviviendaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoVivienda.setToolTipText("Nuevo"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoVivienda.setToolTipText("Editar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoVivienda.setToolTipText("Actualizar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoVivienda.setToolTipText("Eliminar)"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoVivienda.setToolTipText("Cancelar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoVivienda.setToolTipText("Guardar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoVivienda.setToolTipText("Guardar"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoVivienda.setToolTipText("Salir"+" "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoVivienda";
		inputMap = this.jButtonNuevoTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoVivienda.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoVivienda"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoVivienda";
		inputMap = this.jButtonActualizarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoVivienda"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoVivienda";
		inputMap = this.jButtonEliminarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoVivienda"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoVivienda";
		inputMap = this.jButtonCancelarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoVivienda"));
		
		//CERRAR		
		sMapKey = "CerrarTipoVivienda";
		inputMap = this.jButtonCerrarTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoVivienda"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoVivienda";
		inputMap = this.jButtonGuardarCambiosTablaTipoVivienda.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoVivienda.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoVivienda"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoVivienda = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoVivienda.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoVivienda.setToolTipText("Nuevo TipoVivienda");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoVivienda = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoVivienda.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoVivienda.setToolTipText("Sin Cerrar Ventana TipoVivienda");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoVivienda = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoVivienda.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoVivienda.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoVivienda.setText("Accion");
		this.jComboBoxTiposAccionesTipoVivienda.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoVivienda = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoVivienda.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoVivienda.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoVivienda = new JLabelMe();
		
		this.jLabelAccionesTipoVivienda.setText("Acciones");		
		this.jLabelAccionesTipoVivienda.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVivienda.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoVivienda.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoVivienda();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoVivienda();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoVivienda=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoVivienda.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoVivienda,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoVivienda.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVivienda.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoVivienda.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoVivienda, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoVivienda.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVivienda.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoVivienda.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoVivienda, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoVivienda = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoVivienda = new GridBagLayout();
		
		this.jPanelCamposTipoVivienda.setLayout(gridaBagLayoutCamposTipoVivienda);
		this.jPanelCamposOcultosTipoVivienda.setLayout(gridaBagLayoutCamposOcultosTipoVivienda);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 0;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoVivienda.add(jLabelIdTipoVivienda, this.gridBagConstraintsTipoVivienda);



	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 1;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoVivienda.add(jLabelidTipoVivienda, this.gridBagConstraintsTipoVivienda);


	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 0;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoVivienda.add(jLabelid_empresaTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		//this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx = 2;
		this.gridBagConstraintsTipoVivienda.ipadx = 0;
		this.gridBagConstraintsTipoVivienda.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoVivienda.add(jButtonid_empresaTipoViviendaBusqueda, this.gridBagConstraintsTipoVivienda);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		//this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx = 3;
		this.gridBagConstraintsTipoVivienda.ipadx = 0;
		this.gridBagConstraintsTipoVivienda.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoVivienda.add(jButtonid_empresaTipoViviendaUpdate, this.gridBagConstraintsTipoVivienda);
	}

	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 1;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoVivienda.add(jComboBoxid_empresaTipoVivienda, this.gridBagConstraintsTipoVivienda);


	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 0;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoVivienda.add(jLabelcodigoTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		//this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx = 2;
		this.gridBagConstraintsTipoVivienda.ipadx = 0;
		this.gridBagConstraintsTipoVivienda.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoVivienda.add(jButtoncodigoTipoViviendaBusqueda, this.gridBagConstraintsTipoVivienda);
	}

	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 1;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoVivienda.add(jTextFieldcodigoTipoVivienda, this.gridBagConstraintsTipoVivienda);


	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 0;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoVivienda.add(jLabelnombreTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		//this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx = 2;
		this.gridBagConstraintsTipoVivienda.ipadx = 0;
		this.gridBagConstraintsTipoVivienda.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoVivienda.add(jButtonnombreTipoViviendaBusqueda, this.gridBagConstraintsTipoVivienda);
	}

	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoVivienda.gridy = 0;
	this.gridBagConstraintsTipoVivienda.gridx = 1;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoVivienda.add(jscrollPanenombreTipoVivienda, this.gridBagConstraintsTipoVivienda);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVivienda.gridy = iYPanelCamposTipoVivienda;
	this.gridBagConstraintsTipoVivienda.gridx = iXPanelCamposTipoVivienda++;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVivienda.add(this.jPanelidTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(iXPanelCamposTipoVivienda % 1==0) {
		iXPanelCamposTipoVivienda=0;
		iYPanelCamposTipoVivienda++;
	}
	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVivienda.gridy = iYPanelCamposTipoVivienda;
	this.gridBagConstraintsTipoVivienda.gridx = iXPanelCamposTipoVivienda++;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVivienda.add(this.jPanelcodigoTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(iXPanelCamposTipoVivienda % 1==0) {
		iXPanelCamposTipoVivienda=0;
		iYPanelCamposTipoVivienda++;
	}
	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVivienda.gridy = iYPanelCamposTipoVivienda;
	this.gridBagConstraintsTipoVivienda.gridx = iXPanelCamposTipoVivienda++;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoVivienda.add(this.jPanelnombreTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(iXPanelCamposTipoVivienda % 1==0) {
		iXPanelCamposTipoVivienda=0;
		iYPanelCamposTipoVivienda++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoVivienda.gridy = iYPanelCamposOcultosTipoVivienda;
	this.gridBagConstraintsTipoVivienda.gridx = iXPanelCamposOcultosTipoVivienda++;
	this.gridBagConstraintsTipoVivienda.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoVivienda.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoVivienda.add(this.jPanelid_empresaTipoVivienda, this.gridBagConstraintsTipoVivienda);



	if(iXPanelCamposOcultosTipoVivienda % 1==0) {
		iXPanelCamposOcultosTipoVivienda=0;
		iYPanelCamposOcultosTipoVivienda++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoVivienda= new GridBagLayout();
		this.jPanelAccionesTipoVivienda.setLayout(gridaBagLayoutAccionesTipoVivienda);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoVivienda= new GridBagLayout();
		this.jPanelAccionesFormularioTipoVivienda.setLayout(gridaBagLayoutAccionesFormularioTipoVivienda);
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVivienda.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVivienda.add(this.jComboBoxTiposAccionesFormularioTipoVivienda, this.gridBagConstraintsTipoVivienda);

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoVivienda.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoVivienda.add(this.jCheckBoxPostAccionNuevoTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVivienda.add(this.jCheckBoxPostAccionSinCerrarTipoVivienda, this.gridBagConstraintsTipoVivienda);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoVivienda.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoVivienda.add(this.jCheckBoxPostAccionSinMensajeTipoVivienda, this.gridBagConstraintsTipoVivienda);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoVivienda.add(this.jButtonModificarTipoVivienda, this.gridBagConstraintsTipoVivienda);							

		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoVivienda.gridy = 0;
		this.gridBagConstraintsTipoVivienda.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoVivienda.add(this.jButtonEliminarTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
			
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = 0;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVivienda.add(this.jButtonActualizarTipoVivienda, this.gridBagConstraintsTipoVivienda);


		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = 0;		
		this.gridBagConstraintsTipoVivienda.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoVivienda.add(this.jButtonGuardarCambiosTipoVivienda, this.gridBagConstraintsTipoVivienda);	
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = 0;		
		this.gridBagConstraintsTipoVivienda.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoVivienda.add(this.jButtonCancelarTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoVivienda = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoVivienda);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();						
			this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoVivienda.gridx = 0;		
			//this.gridBagConstraintsTipoVivienda.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoVivienda.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoVivienda.gridx =0;
		this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoVivienda.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoVivienda, this.gridBagConstraintsTipoVivienda);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoVivienda = new TipoViviendaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Vivienda DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Vivienda DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Vivienda Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoViviendaModel tipoviviendaModel=new TipoViviendaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoViviendaModel.TipoViviendaFocusTraversalPolicy tipoviviendaFocusTraversalPolicy = tipoviviendaModel.new TipoViviendaFocusTraversalPolicy(this);
			
			//tipoviviendaFocusTraversalPolicy.settipoviviendaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoviviendaModel);
			
			
			this.jContentPaneDetalleTipoVivienda = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoVivienda = new GridBagLayout();	
			this.jContentPaneDetalleTipoVivienda.setLayout(gridaBagLayoutDetalleTipoVivienda);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoVivienda = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
				this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoVivienda.gridx = 0;
					
				
				this.jContentPaneDetalleTipoVivienda.add(jTtoolBarDetalleTipoVivienda, gridBagConstraintsTipoVivienda);								
				
}
			
			this.jScrollPanelDatosEdicionTipoVivienda=   new JScrollPane(jContentPaneDetalleTipoVivienda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVivienda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVivienda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVivienda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoVivienda=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoVivienda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVivienda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoVivienda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoVivienda.gridx = 0;
	        
			this.jContentPaneDetalleTipoVivienda.add(jPanelCamposTipoVivienda, gridBagConstraintsTipoVivienda);
			
			
			
			
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
						&& tipoviviendaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDireccion(this.puedeCargarPorParteDireccion,false,-1);
					
					if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoVivienda= new GridBagConstraints();
						this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoVivienda.gridx = 0;
						this.jContentPaneDetalleTipoVivienda.add(this.jTabbedPaneRelacionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoVivienda.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDireccion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoVivienda.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
					this.gridBagConstraintsTipoVivienda.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoVivienda.gridx = 0;
					
				
					this.jContentPaneDetalleTipoVivienda.add(jPanelCamposOcultosTipoVivienda, gridBagConstraintsTipoVivienda);
				
					this.jPanelCamposOcultosTipoVivienda.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoVivienda.gridx = 0;
	        this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoVivienda.add(this.jPanelAccionesFormularioTipoVivienda, this.gridBagConstraintsTipoVivienda);							
			
			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
	        this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoVivienda.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoVivienda.add(this.jPanelAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoVivienda);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoVivienda=   new JScrollPane(this.jPanelCamposTipoVivienda,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoVivienda.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVivienda.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoVivienda.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoVivienda.gridx = 0;
			this.gridBagConstraintsTipoVivienda.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoVivienda.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoVivienda.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVivienda.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoVivienda, this.gridBagConstraintsTipoVivienda);			
			
			this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
			this.gridBagConstraintsTipoVivienda.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoVivienda.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoVivienda, this.gridBagConstraintsTipoVivienda);
			
			
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoVivienda, this.gridBagConstraintsTipoVivienda);
		
			
		this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
		this.gridBagConstraintsTipoVivienda.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoVivienda.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoVivienda, this.gridBagConstraintsTipoVivienda);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoVivienda;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoVivienda;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDireccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.direccionSessionBean=new DireccionSessionBean();
		this.direccionSessionBean.setConGuardarRelaciones(false);
		this.direccionSessionBean.setEsGuardarRelacionado(true);

		this.direccionBeanSwingJInternalFrame=null;//new DireccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.direccionBeanSwingJInternalFramePopup=new DireccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.direccionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.direccionSessionBean.getEsGuardarRelacionado()) {

				DireccionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DireccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoViviendaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.direccionSessionBean.setEsGuardarRelacionado(true);

				this.direccionBeanSwingJInternalFrame=new DireccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.direccionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.direccionBeanSwingJInternalFrame.setdireccionSessionBean(this.direccionSessionBean);

				//this.gridBagConstraintsTipoVivienda = new GridBagConstraints();
				//this.gridBagConstraintsTipoVivienda.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoVivienda.gridx = 0;
				//this.jContentPaneDetalleTipoVivienda.add(this.direccionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoVivienda);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoVivienda.add("Direcciones",this.direccionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoVivienda.setComponentAt(iIndexTab,this.direccionBeanSwingJInternalFrame.getContentPane());
				}

				//DireccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.direccionSessionBean.setEsGuardarRelacionado(false);
				this.direccionBeanSwingJInternalFrame=null;//new DireccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.direccionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDireccion) {
					this.jTabbedPaneRelacionesTipoVivienda.add("Direcciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDireccionBeanSwingJInternalFrame(List<TipoVivienda> tipoviviendas,TipoVivienda tipovivienda,DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//direccionBeanSwingJInternalFrame=new DireccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					direccionBeanSwingJInternalFrame.getDireccionLogic().setConnexion(this.tipoviviendaLogic.getConnexion());

					direccionBeanSwingJInternalFrame.settipoviviendasForeignKey(tipoviviendas);
					direccionBeanSwingJInternalFrame.settipoviviendaForeignKey(tipovivienda);
					direccionBeanSwingJInternalFrame.direccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoVivienda(true);
					direccionBeanSwingJInternalFrame.direccionSessionBean.setlidTipoViviendaActual(tipovivienda.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					direccionBeanSwingJInternalFrame.cargarCombosForeignKeyDireccion(direccionBeanSwingJInternalFrame.isCargarCombosDependencia);
					direccionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoVivienda(true);
					direccionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					direccionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoVivienda");
					direccionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoVivienda");
					direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(true);
					direccionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDireccion("n",direccionBeanSwingJInternalFrame.isGuardarCambiosEnLote, direccionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					direccionBeanSwingJInternalFrame.setAutoscrolls(true);
					direccionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("relacionado");
					} else {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("no_relacionado");
					}

					direccionBeanSwingJInternalFrame.getjButtonRecargarInformacionDireccion().setVisible(false);

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
