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
import com.bydan.erp.cartera.util.TipoReteConstantesFunciones;

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
public class TipoReteDetalleFormJInternalFrame extends TipoReteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRete;
	
	protected JMenuBar jmenuBarDetalleTipoRete;
	
	protected JMenu jmenuDetalleTipoRete;
	protected JMenu jmenuDetalleArchivoTipoRete;
	protected JMenu jmenuDetalleAccionesTipoRete;
	protected JMenu jmenuDetalleDatosTipoRete;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRete;	
	protected GridBagConstraints gridBagConstraintsTipoRete;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoReteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRete;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoReteSessionBean tiporeteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoReteLogic tiporeteLogic;
	
	public JScrollPane jScrollPanelDatosTipoRete;
	public JScrollPane jScrollPanelDatosEdicionTipoRete;
	public JScrollPane jScrollPanelDatosGeneralTipoRete;
	
	protected JPanel jPanelCamposTipoRete;    
	protected JPanel jPanelCamposOcultosTipoRete;    	
	protected JPanel jPanelAccionesTipoRete;
	protected JPanel jPanelAccionesFormularioTipoRete;
    
	
	
	protected Integer iXPanelCamposTipoRete=0;
	protected Integer iYPanelCamposTipoRete=0;
	
	protected Integer iXPanelCamposOcultosTipoRete=0;
	protected Integer iYPanelCamposOcultosTipoRete=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRete;
	public JButton jButtonModificarTipoRete;
	public JButton jButtonActualizarTipoRete;
    public JButton jButtonEliminarTipoRete;
	public JButton jButtonCancelarTipoRete;
    public JButton jButtonGuardarCambiosTipoRete;
	public JButton jButtonGuardarCambiosTablaTipoRete;
	protected JButton jButtonCerrarTipoRete;
	
	
	protected JButton jButtonProcesarInformacionTipoRete;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRete;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRete;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRete;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRete;
	protected JButton jButtonModificarToolBarTipoRete;
	protected JButton jButtonActualizarToolBarTipoRete;
    protected JButton jButtonEliminarToolBarTipoRete;
	protected JButton jButtonCancelarToolBarTipoRete;
    protected JButton jButtonGuardarCambiosToolBarTipoRete;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRete;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRete;
	protected JButton jButtonCerrarToolBarTipoRete;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRete;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRete;
	protected JMenuItem jMenuItemModificarTipoRete;
	protected JMenuItem jMenuItemActualizarTipoRete;
    protected JMenuItem jMenuItemEliminarTipoRete;
	protected JMenuItem jMenuItemCancelarTipoRete;
    protected JMenuItem jMenuItemGuardarCambiosTipoRete;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRete;
	protected JMenuItem jMenuItemCerrarTipoRete;
	protected JMenuItem jMenuItemDetalleCerrarTipoRete;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRete;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRete;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRete;
	protected JMenuItem jMenuItemMostrarOcultarTipoRete;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRete;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRete;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRete;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRete;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRete;
	public JLabel jLabelIdTipoRete;
	public JLabel jLabelidTipoRete;
	public JButton jButtonidTipoReteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRete;
	public JLabel jLabelcodigoTipoRete;
	public JTextField jTextFieldcodigoTipoRete;
	public JButton jButtoncodigoTipoReteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRete;
	public JLabel jLabelnombreTipoRete;
	public JTextArea jTextAreanombreTipoRete;
	public JScrollPane jscrollPanenombreTipoRete;
	public JButton jButtonnombreTipoReteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRete;
	public JLabel jLabelid_empresaTipoRete;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRete;
	public JButton jButtonid_empresaTipoRete= new JButtonMe();
	public JButton jButtonid_empresaTipoReteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoReteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRete;
	
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
	
	public TipoReteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRete=new JPanel();
				this.jPanelAccionesFormularioTipoRete=new JPanel();
				this.jmenuBarDetalleTipoRete=new JMenuBar();
				this.jTtoolBarDetalleTipoRete=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoReteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoReteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRete No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRete() {
		return this.jButtonActualizarToolBarTipoRete;
	}
	
	public JButton getjButtonEliminarToolBarTipoRete() {
		return this.jButtonEliminarToolBarTipoRete;
	}
	
	public JButton getjButtonCancelarToolBarTipoRete() {
		return this.jButtonCancelarToolBarTipoRete;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRete() {
		return this.jButtonProcesarInformacionTipoRete;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRete)	{
		this.jButtonProcesarInformacionTipoRete = jButtonProcesarInformacionTipoRete;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRete() {
		return this.jComboBoxTiposAccionesTipoRete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRete(
			JComboBox jComboBoxTiposRelacionesTipoRete) {
		this.jComboBoxTiposRelacionesTipoRete = jComboBoxTiposRelacionesTipoRete;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRete(
			JComboBox jComboBoxTiposAccionesTipoRete) {
		this.jComboBoxTiposAccionesTipoRete = jComboBoxTiposAccionesTipoRete;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRete() {
		return this.jComboBoxTiposAccionesFormularioTipoRete;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRete(
			JComboBox jComboBoxTiposAccionesFormularioTipoRete) {
		this.jComboBoxTiposAccionesFormularioTipoRete = jComboBoxTiposAccionesFormularioTipoRete;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporeteSessionBean=new TipoReteSessionBean();
		
		this.tiporeteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporeteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporeteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoReteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoReteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoReteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Rete(temporal) MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoReteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRete= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRete=new JButtonMe();
				this.jButtonModificarToolBarTipoRete=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRete,this.jTtoolBarDetalleTipoRete,
							"actualizar","actualizar","Actualizar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRete,this.jTtoolBarDetalleTipoRete,
							"eliminar","eliminar","Eliminar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRete,this.jTtoolBarDetalleTipoRete,
							"cancelar","cancelar","Cancelar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRete=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRete,this.jTtoolBarDetalleTipoRete,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRete=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRete=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRete=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRete=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRete=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRete= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRete.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRete,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRete= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRete.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRete,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRete= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRete.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRete,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRete= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRete.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRete,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRete= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRete.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRete,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRete= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRete.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRete,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRete= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRete.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRete,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRete= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRete.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRete,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRete,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRete= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRete.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRete,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRete.add(this.jMenuItemDetalleCerrarTipoRete);
		
		this.jmenuDetalleAccionesTipoRete.add(this.jMenuItemActualizarTipoRete);
		this.jmenuDetalleAccionesTipoRete.add(this.jMenuItemEliminarTipoRete);
		this.jmenuDetalleAccionesTipoRete.add(this.jMenuItemCancelarTipoRete);		
		
		//this.jmenuDetalleDatosTipoRete.add(this.jMenuItemDetalleAbrirOrderByTipoRete);				
		this.jmenuDetalleDatosTipoRete.add(this.jMenuItemDetalleMostarOcultarTipoRete);				
				
		//this.jmenuDetalleAccionesTipoRete.add(this.jMenuItemGuardarCambiosTipoRete);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRete.add(this.jmenuDetalleArchivoTipoRete);		
		this.jmenuBarDetalleTipoRete.add(this.jmenuDetalleAccionesTipoRete);		
		this.jmenuBarDetalleTipoRete.add(this.jmenuDetalleDatosTipoRete);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRete);				
	}
	
	
	public void inicializarElementosCamposTipoRete() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRete = new JLabelMe();
		jLabelIdTipoRete.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRete = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRete.setToolTipText(TipoReteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRete= new GridBagLayout();

		this.jPanelidTipoRete.setLayout(this.gridaBagLayoutTipoRete);

		jLabelidTipoRete = new JLabel();
		jLabelidTipoRete.setText("Id");

		jLabelidTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRete = new JLabelMe();
		this.jLabelcodigoTipoRete.setText(""+TipoReteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRete.setToolTipText("Codigo");
		this.jLabelcodigoTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRete.setToolTipText(TipoReteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRete = new GridBagLayout();
		this.jPanelcodigoTipoRete.setLayout(this.gridaBagLayoutTipoRete);


		jTextFieldcodigoTipoRete= new JTextFieldMe();

		jTextFieldcodigoTipoRete.setEnabled(false);
		jTextFieldcodigoTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoReteBusqueda= new JButtonMe();
		this.jButtoncodigoTipoReteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoReteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoReteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoReteBusqueda.setText("U");
		this.jButtoncodigoTipoReteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoReteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoReteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoReteBusqueda"));

		if(this.tiporeteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoReteBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRete = new JLabelMe();
		this.jLabelnombreTipoRete.setText(""+TipoReteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRete.setToolTipText("Nombre");
		this.jLabelnombreTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRete.setToolTipText(TipoReteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRete = new GridBagLayout();
		this.jPanelnombreTipoRete.setLayout(this.gridaBagLayoutTipoRete);


		jTextAreanombreTipoRete= new JTextAreaMe();
		jTextAreanombreTipoRete.setEnabled(false);
		jTextAreanombreTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRete.setLineWrap(true);
		jTextAreanombreTipoRete.setWrapStyleWord(true);
		jTextAreanombreTipoRete.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRete.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRete = new JScrollPane(jTextAreanombreTipoRete);
		jscrollPanenombreTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoReteBusqueda= new JButtonMe();
		this.jButtonnombreTipoReteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoReteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoReteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoReteBusqueda.setText("U");
		this.jButtonnombreTipoReteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoReteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoReteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoReteBusqueda"));

		if(this.tiporeteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoReteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRete() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRete = new JLabelMe();
		this.jLabelid_empresaTipoRete.setText(""+TipoReteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRete.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRete=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRete.setToolTipText(TipoReteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRete = new GridBagLayout();
		this.jPanelid_empresaTipoRete.setLayout(this.gridaBagLayoutTipoRete);


		jComboBoxid_empresaTipoRete= new JComboBoxMe();
		jComboBoxid_empresaTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRete.setEnabled(false);

		this.jButtonid_empresaTipoRete= new JButtonMe();
		this.jButtonid_empresaTipoRete.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRete.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRete.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRete.setText("Buscar");
		this.jButtonid_empresaTipoRete.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRete.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRete,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRete"));

		this.jButtonid_empresaTipoReteBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoReteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoReteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoReteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoReteBusqueda.setText("U");
		this.jButtonid_empresaTipoReteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoReteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoReteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoReteBusqueda"));

		if(this.tiporeteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoReteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoReteUpdate= new JButtonMe();
		this.jButtonid_empresaTipoReteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoReteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoReteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoReteUpdate.setText("U");
		this.jButtonid_empresaTipoReteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoReteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoReteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRete.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRete.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoReteUpdate"));



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
		//this.jInternalFrameDetalleTipoRete = new TipoReteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Rete(temporal) DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRete= new GridBagLayout();
		

		
		String sToolTipTipoRete="";
		sToolTipTipoRete=TipoReteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRete+="(Cartera.TipoRete)";
		}
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRete+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRete = new JButtonMe();
		this.jButtonModificarTipoRete = new JButtonMe();
        this.jButtonActualizarTipoRete = new JButtonMe();
        this.jButtonEliminarTipoRete = new JButtonMe();
        this.jButtonCancelarTipoRete = new JButtonMe();
        this.jButtonGuardarCambiosTipoRete = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRete = new JButtonMe();
		this.jButtonCerrarTipoRete = new JButtonMe();
		
		this.jScrollPanelDatosTipoRete = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRete = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRete = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Rete(temporal)";
		
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Rete(temporal)s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRete.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRete.setName("jPanelCamposTipoRete"); 

		this.jPanelCamposOcultosTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRete.setName("jPanelCamposOcultosTipoRete"); 

        this.jPanelAccionesTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRete.setToolTipText("Acciones");
        this.jPanelAccionesTipoRete.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRete.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRete.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRete.setText("Nuevo");
		this.jButtonModificarTipoRete.setText("Editar");
        this.jButtonActualizarTipoRete.setText("Actualizar");
        this.jButtonEliminarTipoRete.setText("Eliminar");
        this.jButtonCancelarTipoRete.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRete.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRete.setText("Guardar");
		this.jButtonCerrarTipoRete.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRete,"nuevo_button","Nuevo",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRete,"modificar_button","Editar",this.tiporeteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRete,"actualizar_button","Actualizar",this.tiporeteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRete,"eliminar_button","Eliminar",this.tiporeteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRete,"cancelar_button","Cancelar",this.tiporeteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRete,"guardarcambios_button","Guardar",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRete,"guardarcambiostabla_button","Guardar",this.tiporeteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRete,"cerrar_button","Salir",this.tiporeteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRete.setToolTipText("Nuevo"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRete.setToolTipText("Editar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRete.setToolTipText("Actualizar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRete.setToolTipText("Eliminar)"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRete.setToolTipText("Cancelar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRete.setToolTipText("Guardar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRete.setToolTipText("Guardar"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRete.setToolTipText("Salir"+" "+TipoReteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRete";
		inputMap = this.jButtonNuevoTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRete.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRete"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRete";
		inputMap = this.jButtonActualizarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRete"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRete";
		inputMap = this.jButtonEliminarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRete"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRete";
		inputMap = this.jButtonCancelarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRete"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRete";
		inputMap = this.jButtonCerrarTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRete"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRete";
		inputMap = this.jButtonGuardarCambiosTablaTipoRete.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRete.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRete"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRete = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRete.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRete.setToolTipText("Nuevo TipoRete");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRete = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRete.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRete.setToolTipText("Sin Cerrar Ventana TipoRete");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRete = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRete.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRete.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRete.setText("Accion");
		this.jComboBoxTiposAccionesTipoRete.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRete = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRete.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRete.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRete = new JLabelMe();
		
		this.jLabelAccionesTipoRete.setText("Acciones");		
		this.jLabelAccionesTipoRete.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRete.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRete.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRete();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRete();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRete=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRete.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRete,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRete.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRete.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRete.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRete, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRete.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRete.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRete.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRete, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRete = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRete = new GridBagLayout();
		
		this.jPanelCamposTipoRete.setLayout(gridaBagLayoutCamposTipoRete);
		this.jPanelCamposOcultosTipoRete.setLayout(gridaBagLayoutCamposOcultosTipoRete);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 0;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRete.add(jLabelIdTipoRete, this.gridBagConstraintsTipoRete);



	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 1;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRete.add(jLabelidTipoRete, this.gridBagConstraintsTipoRete);


	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 0;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRete.add(jLabelid_empresaTipoRete, this.gridBagConstraintsTipoRete);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		//this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx = 2;
		this.gridBagConstraintsTipoRete.ipadx = 0;
		this.gridBagConstraintsTipoRete.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRete.add(jButtonid_empresaTipoReteBusqueda, this.gridBagConstraintsTipoRete);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		//this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx = 3;
		this.gridBagConstraintsTipoRete.ipadx = 0;
		this.gridBagConstraintsTipoRete.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRete.add(jButtonid_empresaTipoReteUpdate, this.gridBagConstraintsTipoRete);
	}

	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 1;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRete.add(jComboBoxid_empresaTipoRete, this.gridBagConstraintsTipoRete);


	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 0;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRete.add(jLabelcodigoTipoRete, this.gridBagConstraintsTipoRete);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		//this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx = 2;
		this.gridBagConstraintsTipoRete.ipadx = 0;
		this.gridBagConstraintsTipoRete.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRete.add(jButtoncodigoTipoReteBusqueda, this.gridBagConstraintsTipoRete);
	}

	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 1;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRete.add(jTextFieldcodigoTipoRete, this.gridBagConstraintsTipoRete);


	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 0;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRete.add(jLabelnombreTipoRete, this.gridBagConstraintsTipoRete);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		//this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx = 2;
		this.gridBagConstraintsTipoRete.ipadx = 0;
		this.gridBagConstraintsTipoRete.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRete.add(jButtonnombreTipoReteBusqueda, this.gridBagConstraintsTipoRete);
	}

	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRete.gridy = 0;
	this.gridBagConstraintsTipoRete.gridx = 1;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRete.add(jscrollPanenombreTipoRete, this.gridBagConstraintsTipoRete);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRete.gridy = iYPanelCamposTipoRete;
	this.gridBagConstraintsTipoRete.gridx = iXPanelCamposTipoRete++;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRete.add(this.jPanelidTipoRete, this.gridBagConstraintsTipoRete);



	if(iXPanelCamposTipoRete % 1==0) {
		iXPanelCamposTipoRete=0;
		iYPanelCamposTipoRete++;
	}
	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRete.gridy = iYPanelCamposTipoRete;
	this.gridBagConstraintsTipoRete.gridx = iXPanelCamposTipoRete++;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRete.add(this.jPanelcodigoTipoRete, this.gridBagConstraintsTipoRete);



	if(iXPanelCamposTipoRete % 1==0) {
		iXPanelCamposTipoRete=0;
		iYPanelCamposTipoRete++;
	}
	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRete.gridy = iYPanelCamposTipoRete;
	this.gridBagConstraintsTipoRete.gridx = iXPanelCamposTipoRete++;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRete.add(this.jPanelnombreTipoRete, this.gridBagConstraintsTipoRete);



	if(iXPanelCamposTipoRete % 1==0) {
		iXPanelCamposTipoRete=0;
		iYPanelCamposTipoRete++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRete = new GridBagConstraints();
	this.gridBagConstraintsTipoRete.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRete.gridy = iYPanelCamposOcultosTipoRete;
	this.gridBagConstraintsTipoRete.gridx = iXPanelCamposOcultosTipoRete++;
	this.gridBagConstraintsTipoRete.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRete.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRete.add(this.jPanelid_empresaTipoRete, this.gridBagConstraintsTipoRete);



	if(iXPanelCamposOcultosTipoRete % 1==0) {
		iXPanelCamposOcultosTipoRete=0;
		iYPanelCamposOcultosTipoRete++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRete= new GridBagLayout();
		this.jPanelAccionesTipoRete.setLayout(gridaBagLayoutAccionesTipoRete);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRete= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRete.setLayout(gridaBagLayoutAccionesFormularioTipoRete);
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRete.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRete.add(this.jComboBoxTiposAccionesFormularioTipoRete, this.gridBagConstraintsTipoRete);

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRete.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRete.add(this.jCheckBoxPostAccionNuevoTipoRete, this.gridBagConstraintsTipoRete);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRete.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRete.add(this.jCheckBoxPostAccionSinCerrarTipoRete, this.gridBagConstraintsTipoRete);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporeteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporeteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRete.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRete.add(this.jCheckBoxPostAccionSinMensajeTipoRete, this.gridBagConstraintsTipoRete);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRete.add(this.jButtonModificarTipoRete, this.gridBagConstraintsTipoRete);							

		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRete.gridy = 0;
		this.gridBagConstraintsTipoRete.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRete.add(this.jButtonEliminarTipoRete, this.gridBagConstraintsTipoRete);
		
			
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = 0;		
		this.gridBagConstraintsTipoRete.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRete.add(this.jButtonActualizarTipoRete, this.gridBagConstraintsTipoRete);


		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = 0;		
		this.gridBagConstraintsTipoRete.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRete.add(this.jButtonGuardarCambiosTipoRete, this.gridBagConstraintsTipoRete);	
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = 0;		
		this.gridBagConstraintsTipoRete.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRete.add(this.jButtonCancelarTipoRete, this.gridBagConstraintsTipoRete);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRete = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRete);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporeteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRete = new GridBagConstraints();						
			this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRete.gridx = 0;		
			//this.gridBagConstraintsTipoRete.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRete.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRete.gridx =0;
		this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRete.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRete, this.gridBagConstraintsTipoRete);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoReteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRete = new TipoReteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Rete(temporal) DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Rete(temporal) DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rete(temporal) Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoReteModel tiporeteModel=new TipoReteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoReteModel.TipoReteFocusTraversalPolicy tiporeteFocusTraversalPolicy = tiporeteModel.new TipoReteFocusTraversalPolicy(this);
			
			//tiporeteFocusTraversalPolicy.settiporeteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporeteModel);
			
			
			this.jContentPaneDetalleTipoRete = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRete = new GridBagLayout();	
			this.jContentPaneDetalleTipoRete.setLayout(gridaBagLayoutDetalleTipoRete);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRete = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRete = new GridBagConstraints();
				this.gridBagConstraintsTipoRete.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRete.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRete.add(jTtoolBarDetalleTipoRete, gridBagConstraintsTipoRete);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRete=   new JScrollPane(jContentPaneDetalleTipoRete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRete=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRete.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRete.gridx = 0;
	        
			this.jContentPaneDetalleTipoRete.add(jPanelCamposTipoRete, gridBagConstraintsTipoRete);
			
			
			
			
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
						&& tiporeteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiporeteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRete= new GridBagConstraints();
						this.gridBagConstraintsTipoRete.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRete.gridx = 0;
						this.jContentPaneDetalleTipoRete.add(this.jTabbedPaneRelacionesTipoRete, this.gridBagConstraintsTipoRete);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRete.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRete.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRete = new GridBagConstraints();
					this.gridBagConstraintsTipoRete.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRete.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRete.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRete.add(jPanelCamposOcultosTipoRete, gridBagConstraintsTipoRete);
				
					this.jPanelCamposOcultosTipoRete.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoRete.gridx = 0;
	        this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRete.add(this.jPanelAccionesFormularioTipoRete, this.gridBagConstraintsTipoRete);							
			
			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
	        this.gridBagConstraintsTipoRete.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoRete.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRete.add(this.jPanelAccionesTipoRete, this.gridBagConstraintsTipoRete);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRete);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRete=   new JScrollPane(this.jPanelCamposTipoRete,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRete.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRete.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRete.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRete.gridx = 0;
			this.gridBagConstraintsTipoRete.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRete.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRete.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRete, this.gridBagConstraintsTipoRete);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRete.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRete, this.gridBagConstraintsTipoRete);			
			
			this.gridBagConstraintsTipoRete = new GridBagConstraints();
			this.gridBagConstraintsTipoRete.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRete.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRete, this.gridBagConstraintsTipoRete);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRete, this.gridBagConstraintsTipoRete);
			
			
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRete, this.gridBagConstraintsTipoRete);
		
			
		this.gridBagConstraintsTipoRete = new GridBagConstraints();
		this.gridBagConstraintsTipoRete.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRete.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRete, this.gridBagConstraintsTipoRete);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRete;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRete;
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
