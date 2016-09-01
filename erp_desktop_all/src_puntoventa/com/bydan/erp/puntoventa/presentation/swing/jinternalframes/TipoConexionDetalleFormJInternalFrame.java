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



import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.puntoventa.util.TipoConexionConstantesFunciones;

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
public class TipoConexionDetalleFormJInternalFrame extends TipoConexionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoConexion;
	
	protected JMenuBar jmenuBarDetalleTipoConexion;
	
	protected JMenu jmenuDetalleTipoConexion;
	protected JMenu jmenuDetalleArchivoTipoConexion;
	protected JMenu jmenuDetalleAccionesTipoConexion;
	protected JMenu jmenuDetalleDatosTipoConexion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoConexion;	
	protected GridBagConstraints gridBagConstraintsTipoConexion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoConexionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoConexion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoConexionSessionBean tipoconexionSessionBean;
	
	

	public ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame=null;
	public ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConexion=false;
	public ConexionSessionBean conexionSessionBean;
	
		
	
	public TipoConexionLogic tipoconexionLogic;
	
	public JScrollPane jScrollPanelDatosTipoConexion;
	public JScrollPane jScrollPanelDatosEdicionTipoConexion;
	public JScrollPane jScrollPanelDatosGeneralTipoConexion;
	
	protected JPanel jPanelCamposTipoConexion;    
	protected JPanel jPanelCamposOcultosTipoConexion;    	
	protected JPanel jPanelAccionesTipoConexion;
	protected JPanel jPanelAccionesFormularioTipoConexion;
    
	
	
	protected Integer iXPanelCamposTipoConexion=0;
	protected Integer iYPanelCamposTipoConexion=0;
	
	protected Integer iXPanelCamposOcultosTipoConexion=0;
	protected Integer iYPanelCamposOcultosTipoConexion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoConexion;
	public JButton jButtonModificarTipoConexion;
	public JButton jButtonActualizarTipoConexion;
    public JButton jButtonEliminarTipoConexion;
	public JButton jButtonCancelarTipoConexion;
    public JButton jButtonGuardarCambiosTipoConexion;
	public JButton jButtonGuardarCambiosTablaTipoConexion;
	protected JButton jButtonCerrarTipoConexion;
	
	
	protected JButton jButtonProcesarInformacionTipoConexion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoConexion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoConexion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoConexion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoConexion;
	protected JButton jButtonModificarToolBarTipoConexion;
	protected JButton jButtonActualizarToolBarTipoConexion;
    protected JButton jButtonEliminarToolBarTipoConexion;
	protected JButton jButtonCancelarToolBarTipoConexion;
    protected JButton jButtonGuardarCambiosToolBarTipoConexion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoConexion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoConexion;
	protected JButton jButtonCerrarToolBarTipoConexion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoConexion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoConexion;
	protected JMenuItem jMenuItemModificarTipoConexion;
	protected JMenuItem jMenuItemActualizarTipoConexion;
    protected JMenuItem jMenuItemEliminarTipoConexion;
	protected JMenuItem jMenuItemCancelarTipoConexion;
    protected JMenuItem jMenuItemGuardarCambiosTipoConexion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoConexion;
	protected JMenuItem jMenuItemCerrarTipoConexion;
	protected JMenuItem jMenuItemDetalleCerrarTipoConexion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoConexion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoConexion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoConexion;
	protected JMenuItem jMenuItemMostrarOcultarTipoConexion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoConexion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoConexion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoConexion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoConexion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoConexion;
	public JLabel jLabelIdTipoConexion;
	public JTextFieldMe jTextFieldidTipoConexion;
	public JButton jButtonidTipoConexionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoConexion;
	public JLabel jLabelnombreTipoConexion;
	public JTextArea jTextAreanombreTipoConexion;
	public JScrollPane jscrollPanenombreTipoConexion;
	public JButton jButtonnombreTipoConexionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoConexion;
	public JLabel jLabeldescripcionTipoConexion;
	public JTextArea jTextAreadescripcionTipoConexion;
	public JScrollPane jscrollPanedescripcionTipoConexion;
	public JButton jButtondescripcionTipoConexionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoConexion;
	
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
	
	public TipoConexionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoConexion=new JPanel();
				this.jPanelAccionesFormularioTipoConexion=new JPanel();
				this.jmenuBarDetalleTipoConexion=new JMenuBar();
				this.jTtoolBarDetalleTipoConexion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoConexionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoConexionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoConexion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoConexion() {
		return this.jButtonActualizarToolBarTipoConexion;
	}
	
	public JButton getjButtonEliminarToolBarTipoConexion() {
		return this.jButtonEliminarToolBarTipoConexion;
	}
	
	public JButton getjButtonCancelarToolBarTipoConexion() {
		return this.jButtonCancelarToolBarTipoConexion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoConexion() {
		return this.jButtonProcesarInformacionTipoConexion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoConexion)	{
		this.jButtonProcesarInformacionTipoConexion = jButtonProcesarInformacionTipoConexion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoConexion() {
		return this.jComboBoxTiposAccionesTipoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoConexion(
			JComboBox jComboBoxTiposRelacionesTipoConexion) {
		this.jComboBoxTiposRelacionesTipoConexion = jComboBoxTiposRelacionesTipoConexion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoConexion(
			JComboBox jComboBoxTiposAccionesTipoConexion) {
		this.jComboBoxTiposAccionesTipoConexion = jComboBoxTiposAccionesTipoConexion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoConexion() {
		return this.jComboBoxTiposAccionesFormularioTipoConexion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoConexion(
			JComboBox jComboBoxTiposAccionesFormularioTipoConexion) {
		this.jComboBoxTiposAccionesFormularioTipoConexion = jComboBoxTiposAccionesFormularioTipoConexion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoconexionSessionBean=new TipoConexionSessionBean();
		
		this.tipoconexionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconexionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoconexionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.conexionSessionBean=new ConexionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoConexionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Conexion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoConexion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoConexion=new JButtonMe();
				this.jButtonModificarToolBarTipoConexion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoConexion,this.jTtoolBarDetalleTipoConexion,
							"actualizar","actualizar","Actualizar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoConexion,this.jTtoolBarDetalleTipoConexion,
							"eliminar","eliminar","Eliminar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoConexion,this.jTtoolBarDetalleTipoConexion,
							"cancelar","cancelar","Cancelar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoConexion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoConexion,this.jTtoolBarDetalleTipoConexion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoConexion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoConexion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoConexion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoConexion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoConexion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoConexion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoConexion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoConexion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoConexion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoConexion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoConexion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoConexion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoConexion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoConexion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoConexion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoConexion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoConexion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoConexion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoConexion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoConexion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoConexion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoConexion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoConexion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoConexion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoConexion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoConexion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoConexion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoConexion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoConexion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoConexion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoConexion.add(this.jMenuItemDetalleCerrarTipoConexion);
		
		this.jmenuDetalleAccionesTipoConexion.add(this.jMenuItemActualizarTipoConexion);
		this.jmenuDetalleAccionesTipoConexion.add(this.jMenuItemEliminarTipoConexion);
		this.jmenuDetalleAccionesTipoConexion.add(this.jMenuItemCancelarTipoConexion);		
		
		//this.jmenuDetalleDatosTipoConexion.add(this.jMenuItemDetalleAbrirOrderByTipoConexion);				
		this.jmenuDetalleDatosTipoConexion.add(this.jMenuItemDetalleMostarOcultarTipoConexion);				
				
		//this.jmenuDetalleAccionesTipoConexion.add(this.jMenuItemGuardarCambiosTipoConexion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoConexion.add(this.jmenuDetalleArchivoTipoConexion);		
		this.jmenuBarDetalleTipoConexion.add(this.jmenuDetalleAccionesTipoConexion);		
		this.jmenuBarDetalleTipoConexion.add(this.jmenuDetalleDatosTipoConexion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoConexion.add(this.jmenuDetalleTipoConexion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoConexion);				
	}
	
	
	public void inicializarElementosCamposTipoConexion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoConexion = new JLabelMe();
		jLabelIdTipoConexion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoConexion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoConexion.setToolTipText(TipoConexionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoConexion= new GridBagLayout();

		this.jPanelidTipoConexion.setLayout(this.gridaBagLayoutTipoConexion);

		jTextFieldidTipoConexion = new JTextFieldMe();
		jTextFieldidTipoConexion.setText("Id");

		jTextFieldidTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoConexion = new JLabelMe();
		this.jLabelnombreTipoConexion.setText(""+TipoConexionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoConexion.setToolTipText("Nombre");
		this.jLabelnombreTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoConexion.setToolTipText(TipoConexionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoConexion = new GridBagLayout();
		this.jPanelnombreTipoConexion.setLayout(this.gridaBagLayoutTipoConexion);


		jTextAreanombreTipoConexion= new JTextAreaMe();
		jTextAreanombreTipoConexion.setEnabled(false);
		jTextAreanombreTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoConexion.setLineWrap(true);
		jTextAreanombreTipoConexion.setWrapStyleWord(true);
		jTextAreanombreTipoConexion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoConexion.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoConexion = new JScrollPane(jTextAreanombreTipoConexion);
		jscrollPanenombreTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoConexionBusqueda= new JButtonMe();
		this.jButtonnombreTipoConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoConexionBusqueda.setText("U");
		this.jButtonnombreTipoConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoConexionBusqueda"));

		if(this.tipoconexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoConexionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoConexion = new JLabelMe();
		this.jLabeldescripcionTipoConexion.setText(""+TipoConexionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoConexion.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoConexion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoConexion.setToolTipText(TipoConexionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoConexion = new GridBagLayout();
		this.jPaneldescripcionTipoConexion.setLayout(this.gridaBagLayoutTipoConexion);


		jTextAreadescripcionTipoConexion= new JTextAreaMe();
		jTextAreadescripcionTipoConexion.setEnabled(false);
		jTextAreadescripcionTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoConexion.setLineWrap(true);
		jTextAreadescripcionTipoConexion.setWrapStyleWord(true);
		jTextAreadescripcionTipoConexion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoConexion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoConexion = new JScrollPane(jTextAreadescripcionTipoConexion);
		jscrollPanedescripcionTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoConexionBusqueda= new JButtonMe();
		this.jButtondescripcionTipoConexionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoConexionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoConexionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoConexionBusqueda.setText("U");
		this.jButtondescripcionTipoConexionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoConexionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoConexionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoConexion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoConexion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoConexionBusqueda"));

		if(this.tipoconexionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoConexionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoConexion() {
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
		//this.jInternalFrameDetalleTipoConexion = new TipoConexionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Conexion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoConexion= new GridBagLayout();
		

		
		String sToolTipTipoConexion="";
		sToolTipTipoConexion=TipoConexionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoConexion+="(PuntoVenta.TipoConexion)";
		}
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoConexion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoConexion = new JButtonMe();
		this.jButtonModificarTipoConexion = new JButtonMe();
        this.jButtonActualizarTipoConexion = new JButtonMe();
        this.jButtonEliminarTipoConexion = new JButtonMe();
        this.jButtonCancelarTipoConexion = new JButtonMe();
        this.jButtonGuardarCambiosTipoConexion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoConexion = new JButtonMe();
		this.jButtonCerrarTipoConexion = new JButtonMe();
		
		this.jScrollPanelDatosTipoConexion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoConexion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoConexion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Conexion";
		
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Conexions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoConexion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoConexion.setName("jPanelCamposTipoConexion"); 

		this.jPanelCamposOcultosTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoConexion.setName("jPanelCamposOcultosTipoConexion"); 

        this.jPanelAccionesTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoConexion.setToolTipText("Acciones");
        this.jPanelAccionesTipoConexion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoConexion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoConexion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoConexion.setText("Nuevo");
		this.jButtonModificarTipoConexion.setText("Editar");
        this.jButtonActualizarTipoConexion.setText("Actualizar");
        this.jButtonEliminarTipoConexion.setText("Eliminar");
        this.jButtonCancelarTipoConexion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoConexion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoConexion.setText("Guardar");
		this.jButtonCerrarTipoConexion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoConexion,"nuevo_button","Nuevo",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoConexion,"modificar_button","Editar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoConexion,"actualizar_button","Actualizar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoConexion,"eliminar_button","Eliminar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoConexion,"cancelar_button","Cancelar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoConexion,"guardarcambios_button","Guardar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoConexion,"guardarcambiostabla_button","Guardar",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoConexion,"cerrar_button","Salir",this.tipoconexionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoConexion.setToolTipText("Nuevo"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoConexion.setToolTipText("Editar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoConexion.setToolTipText("Actualizar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoConexion.setToolTipText("Eliminar)"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoConexion.setToolTipText("Cancelar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoConexion.setToolTipText("Guardar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoConexion.setToolTipText("Guardar"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoConexion.setToolTipText("Salir"+" "+TipoConexionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoConexion";
		inputMap = this.jButtonNuevoTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoConexion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoConexion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoConexion";
		inputMap = this.jButtonActualizarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoConexion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoConexion";
		inputMap = this.jButtonEliminarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoConexion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoConexion";
		inputMap = this.jButtonCancelarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoConexion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoConexion";
		inputMap = this.jButtonCerrarTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoConexion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoConexion";
		inputMap = this.jButtonGuardarCambiosTablaTipoConexion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoConexion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoConexion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoConexion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoConexion.setToolTipText("Nuevo TipoConexion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoConexion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoConexion.setToolTipText("Sin Cerrar Ventana TipoConexion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoConexion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoConexion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoConexion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoConexion.setText("Accion");
		this.jComboBoxTiposAccionesTipoConexion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoConexion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoConexion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoConexion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoConexion = new JLabelMe();
		
		this.jLabelAccionesTipoConexion.setText("Acciones");		
		this.jLabelAccionesTipoConexion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConexion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoConexion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoConexion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoConexion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoConexion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoConexion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoConexion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoConexion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConexion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoConexion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoConexion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoConexion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConexion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoConexion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoConexion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoConexion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoConexion = new GridBagLayout();
		
		this.jPanelCamposTipoConexion.setLayout(gridaBagLayoutCamposTipoConexion);
		this.jPanelCamposOcultosTipoConexion.setLayout(gridaBagLayoutCamposOcultosTipoConexion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConexion.gridy = 0;
	this.gridBagConstraintsTipoConexion.gridx = 0;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoConexion.add(jLabelIdTipoConexion, this.gridBagConstraintsTipoConexion);



	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConexion.gridy = 0;
	this.gridBagConstraintsTipoConexion.gridx = 1;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoConexion.add(jTextFieldidTipoConexion, this.gridBagConstraintsTipoConexion);


	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConexion.gridy = 0;
	this.gridBagConstraintsTipoConexion.gridx = 0;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoConexion.add(jLabelnombreTipoConexion, this.gridBagConstraintsTipoConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = 0;
		this.gridBagConstraintsTipoConexion.gridx = 2;
		this.gridBagConstraintsTipoConexion.ipadx = 0;
		this.gridBagConstraintsTipoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoConexion.add(jButtonnombreTipoConexionBusqueda, this.gridBagConstraintsTipoConexion);
	}

	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConexion.gridy = 0;
	this.gridBagConstraintsTipoConexion.gridx = 1;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoConexion.add(jscrollPanenombreTipoConexion, this.gridBagConstraintsTipoConexion);


	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConexion.gridy = 0;
	this.gridBagConstraintsTipoConexion.gridx = 0;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoConexion.add(jLabeldescripcionTipoConexion, this.gridBagConstraintsTipoConexion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		//this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoConexion.gridy = 0;
		this.gridBagConstraintsTipoConexion.gridx = 2;
		this.gridBagConstraintsTipoConexion.ipadx = 0;
		this.gridBagConstraintsTipoConexion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoConexion.add(jButtondescripcionTipoConexionBusqueda, this.gridBagConstraintsTipoConexion);
	}

	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoConexion.gridy = 0;
	this.gridBagConstraintsTipoConexion.gridx = 1;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoConexion.add(jscrollPanedescripcionTipoConexion, this.gridBagConstraintsTipoConexion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConexion.gridy = iYPanelCamposTipoConexion;
	this.gridBagConstraintsTipoConexion.gridx = iXPanelCamposTipoConexion++;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConexion.add(this.jPanelidTipoConexion, this.gridBagConstraintsTipoConexion);



	if(iXPanelCamposTipoConexion % 1==0) {
		iXPanelCamposTipoConexion=0;
		iYPanelCamposTipoConexion++;
	}
	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConexion.gridy = iYPanelCamposTipoConexion;
	this.gridBagConstraintsTipoConexion.gridx = iXPanelCamposTipoConexion++;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConexion.add(this.jPanelnombreTipoConexion, this.gridBagConstraintsTipoConexion);



	if(iXPanelCamposTipoConexion % 1==0) {
		iXPanelCamposTipoConexion=0;
		iYPanelCamposTipoConexion++;
	}
	this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoConexion.gridy = iYPanelCamposTipoConexion;
	this.gridBagConstraintsTipoConexion.gridx = iXPanelCamposTipoConexion++;
	this.gridBagConstraintsTipoConexion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoConexion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoConexion.add(this.jPaneldescripcionTipoConexion, this.gridBagConstraintsTipoConexion);



	if(iXPanelCamposTipoConexion % 1==0) {
		iXPanelCamposTipoConexion=0;
		iYPanelCamposTipoConexion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoConexion= new GridBagLayout();
		this.jPanelAccionesTipoConexion.setLayout(gridaBagLayoutAccionesTipoConexion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoConexion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoConexion.setLayout(gridaBagLayoutAccionesFormularioTipoConexion);
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConexion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConexion.add(this.jComboBoxTiposAccionesFormularioTipoConexion, this.gridBagConstraintsTipoConexion);

		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoConexion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoConexion.add(this.jCheckBoxPostAccionNuevoTipoConexion, this.gridBagConstraintsTipoConexion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConexion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConexion.add(this.jCheckBoxPostAccionSinCerrarTipoConexion, this.gridBagConstraintsTipoConexion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoconexionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoconexionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoConexion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoConexion.add(this.jCheckBoxPostAccionSinMensajeTipoConexion, this.gridBagConstraintsTipoConexion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = 0;
		this.gridBagConstraintsTipoConexion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoConexion.add(this.jButtonModificarTipoConexion, this.gridBagConstraintsTipoConexion);							

		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoConexion.gridy = 0;
		this.gridBagConstraintsTipoConexion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoConexion.add(this.jButtonEliminarTipoConexion, this.gridBagConstraintsTipoConexion);
		
			
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = 0;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConexion.add(this.jButtonActualizarTipoConexion, this.gridBagConstraintsTipoConexion);


		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = 0;		
		this.gridBagConstraintsTipoConexion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoConexion.add(this.jButtonGuardarCambiosTipoConexion, this.gridBagConstraintsTipoConexion);	
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = 0;		
		this.gridBagConstraintsTipoConexion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoConexion.add(this.jButtonCancelarTipoConexion, this.gridBagConstraintsTipoConexion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoConexion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoConexion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoconexionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();						
			this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoConexion.gridx = 0;		
			//this.gridBagConstraintsTipoConexion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoConexion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoConexion.gridx =0;
		this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoConexion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoConexion, this.gridBagConstraintsTipoConexion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoConexionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoConexion = new TipoConexionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Conexion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Conexion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Conexion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoConexionModel tipoconexionModel=new TipoConexionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoConexionModel.TipoConexionFocusTraversalPolicy tipoconexionFocusTraversalPolicy = tipoconexionModel.new TipoConexionFocusTraversalPolicy(this);
			
			//tipoconexionFocusTraversalPolicy.settipoconexionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoconexionModel);
			
			
			this.jContentPaneDetalleTipoConexion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoConexion = new GridBagLayout();	
			this.jContentPaneDetalleTipoConexion.setLayout(gridaBagLayoutDetalleTipoConexion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoConexion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoConexion = new GridBagConstraints();
				this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoConexion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoConexion.add(jTtoolBarDetalleTipoConexion, gridBagConstraintsTipoConexion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoConexion=   new JScrollPane(jContentPaneDetalleTipoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoConexion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoConexion.gridx = 0;
	        
			this.jContentPaneDetalleTipoConexion.add(jPanelCamposTipoConexion, gridBagConstraintsTipoConexion);
			
			
			
			
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
						&& tipoconexionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConexion(this.puedeCargarPorParteConexion,false,-1);
					
					if(this.tipoconexionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoConexion= new GridBagConstraints();
						this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoConexion.gridx = 0;
						this.jContentPaneDetalleTipoConexion.add(this.jTabbedPaneRelacionesTipoConexion, this.gridBagConstraintsTipoConexion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoConexion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConexion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoConexion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoConexion = new GridBagConstraints();
					this.gridBagConstraintsTipoConexion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoConexion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoConexion.add(jPanelCamposOcultosTipoConexion, gridBagConstraintsTipoConexion);
				
					this.jPanelCamposOcultosTipoConexion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoConexion.gridx = 0;
	        this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoConexion.add(this.jPanelAccionesFormularioTipoConexion, this.gridBagConstraintsTipoConexion);							
			
			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
	        this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoConexion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoConexion.add(this.jPanelAccionesTipoConexion, this.gridBagConstraintsTipoConexion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoConexion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoConexion=   new JScrollPane(this.jPanelCamposTipoConexion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoConexion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConexion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoConexion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoConexion.gridx = 0;
			this.gridBagConstraintsTipoConexion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoConexion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoConexion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoConexion, this.gridBagConstraintsTipoConexion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConexion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoConexion, this.gridBagConstraintsTipoConexion);			
			
			this.gridBagConstraintsTipoConexion = new GridBagConstraints();
			this.gridBagConstraintsTipoConexion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoConexion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoConexion, this.gridBagConstraintsTipoConexion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoConexion, this.gridBagConstraintsTipoConexion);
			
			
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoConexion, this.gridBagConstraintsTipoConexion);
		
			
		this.gridBagConstraintsTipoConexion = new GridBagConstraints();
		this.gridBagConstraintsTipoConexion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoConexion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoConexion, this.gridBagConstraintsTipoConexion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoConexion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoConexion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConexion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.conexionSessionBean=new ConexionSessionBean();
		this.conexionSessionBean.setConGuardarRelaciones(false);
		this.conexionSessionBean.setEsGuardarRelacionado(true);

		this.conexionBeanSwingJInternalFrame=null;//new ConexionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.conexionBeanSwingJInternalFramePopup=new ConexionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.conexionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.conexionSessionBean.getEsGuardarRelacionado()) {

				ConexionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConexionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoConexionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.conexionSessionBean.setEsGuardarRelacionado(true);

				this.conexionBeanSwingJInternalFrame=new ConexionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.conexionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.conexionBeanSwingJInternalFrame.setconexionSessionBean(this.conexionSessionBean);

				//this.gridBagConstraintsTipoConexion = new GridBagConstraints();
				//this.gridBagConstraintsTipoConexion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoConexion.gridx = 0;
				//this.jContentPaneDetalleTipoConexion.add(this.conexionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoConexion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoConexion.add("Conexiones",this.conexionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoConexion.setComponentAt(iIndexTab,this.conexionBeanSwingJInternalFrame.getContentPane());
				}

				//ConexionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.conexionSessionBean.setEsGuardarRelacionado(false);
				this.conexionBeanSwingJInternalFrame=null;//new ConexionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.conexionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConexion) {
					this.jTabbedPaneRelacionesTipoConexion.add("Conexiones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarConexionBeanSwingJInternalFrame(List<TipoConexion> tipoconexions,TipoConexion tipoconexion,ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//conexionBeanSwingJInternalFrame=new ConexionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					conexionBeanSwingJInternalFrame.getConexionLogic().setConnexion(this.tipoconexionLogic.getConnexion());

					conexionBeanSwingJInternalFrame.settipoconexionsForeignKey(tipoconexions);
					conexionBeanSwingJInternalFrame.settipoconexionForeignKey(tipoconexion);
					conexionBeanSwingJInternalFrame.conexionSessionBean.setisBusquedaDesdeForeignKeySesionTipoConexion(true);
					conexionBeanSwingJInternalFrame.conexionSessionBean.setlidTipoConexionActual(tipoconexion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					conexionBeanSwingJInternalFrame.cargarCombosForeignKeyConexion(conexionBeanSwingJInternalFrame.isCargarCombosDependencia);
					conexionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoConexion(true);
					conexionBeanSwingJInternalFrame.setid_tipo_conexionFK_IdTipoConexion(tipoconexion.getId());

					if(!this.conCargarFormDetalle) {
						conexionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					conexionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoConexionForeignKey(tipoconexion,1,false,true,true);
					conexionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					conexionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoConexion");
					conexionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoConexion");
					conexionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConexion(true);
					conexionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConexion("n",conexionBeanSwingJInternalFrame.isGuardarCambiosEnLote, conexionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					conexionBeanSwingJInternalFrame.setAutoscrolls(true);
					conexionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						conexionBeanSwingJInternalFrame.actualizarEstadoPanelsConexion("relacionado");
					} else {
						conexionBeanSwingJInternalFrame.actualizarEstadoPanelsConexion("no_relacionado");
					}

					conexionBeanSwingJInternalFrame.getjButtonRecargarInformacionConexion().setVisible(false);

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
