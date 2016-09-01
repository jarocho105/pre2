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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.CampoConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class CampoDetalleFormJInternalFrame extends CampoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCampo;
	
	protected JMenuBar jmenuBarDetalleCampo;
	
	protected JMenu jmenuDetalleCampo;
	protected JMenu jmenuDetalleArchivoCampo;
	protected JMenu jmenuDetalleAccionesCampo;
	protected JMenu jmenuDetalleDatosCampo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCampo;	
	protected GridBagConstraints gridBagConstraintsCampo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CampoBeanSwingJInternalFrameAdditional jInternalFrameDetalleCampo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected OpcionBeanSwingJInternalFrame opcionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_opcion="";
	
	public CampoSessionBean campoSessionBean;
	
	

	public PerfilCampoBeanSwingJInternalFrame perfilcampoBeanSwingJInternalFrame=null;
	public PerfilCampoBeanSwingJInternalFrame perfilcampoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePerfilCampo=false;
	public PerfilCampoSessionBean perfilcampoSessionBean;
	
	
	public OpcionSessionBean opcionSessionBean;	
	
	public CampoLogic campoLogic;
	
	public JScrollPane jScrollPanelDatosCampo;
	public JScrollPane jScrollPanelDatosEdicionCampo;
	public JScrollPane jScrollPanelDatosGeneralCampo;
	
	protected JPanel jPanelCamposCampo;    
	protected JPanel jPanelCamposOcultosCampo;    	
	protected JPanel jPanelAccionesCampo;
	protected JPanel jPanelAccionesFormularioCampo;
    
	
	
	protected Integer iXPanelCamposCampo=0;
	protected Integer iYPanelCamposCampo=0;
	
	protected Integer iXPanelCamposOcultosCampo=0;
	protected Integer iYPanelCamposOcultosCampo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCampo;
	public JButton jButtonModificarCampo;
	public JButton jButtonActualizarCampo;
    public JButton jButtonEliminarCampo;
	public JButton jButtonCancelarCampo;
    public JButton jButtonGuardarCambiosCampo;
	public JButton jButtonGuardarCambiosTablaCampo;
	protected JButton jButtonCerrarCampo;
	
	
	protected JButton jButtonProcesarInformacionCampo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCampo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCampo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCampo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCampo;
	protected JButton jButtonModificarToolBarCampo;
	protected JButton jButtonActualizarToolBarCampo;
    protected JButton jButtonEliminarToolBarCampo;
	protected JButton jButtonCancelarToolBarCampo;
    protected JButton jButtonGuardarCambiosToolBarCampo;
	protected JButton jButtonGuardarCambiosTablaToolBarCampo;
	protected JButton jButtonMostrarOcultarTablaToolBarCampo;
	protected JButton jButtonCerrarToolBarCampo;
	
	protected JButton jButtonProcesarInformacionToolBarCampo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCampo;
	protected JMenuItem jMenuItemModificarCampo;
	protected JMenuItem jMenuItemActualizarCampo;
    protected JMenuItem jMenuItemEliminarCampo;
	protected JMenuItem jMenuItemCancelarCampo;
    protected JMenuItem jMenuItemGuardarCambiosCampo;
	protected JMenuItem jMenuItemGuardarCambiosTablaCampo;
	protected JMenuItem jMenuItemCerrarCampo;
	protected JMenuItem jMenuItemDetalleCerrarCampo;
	protected JMenuItem jMenuItemDetalleMostarOcultarCampo;
	
	protected JMenuItem jMenuItemProcesarInformacionCampo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCampo;
	protected JMenuItem jMenuItemMostrarOcultarCampo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCampo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCampo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCampo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCampo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCampo;
	public JLabel jLabelIdCampo;
	public JLabel jLabelidCampo;
	public JButton jButtonidCampoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCampo;
	public JLabel jLabelcodigoCampo;
	public JTextField jTextFieldcodigoCampo;
	public JButton jButtoncodigoCampoBusqueda= new JButtonMe();

	public JPanel jPanelnombreCampo;
	public JLabel jLabelnombreCampo;
	public JTextArea jTextAreanombreCampo;
	public JScrollPane jscrollPanenombreCampo;
	public JButton jButtonnombreCampoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCampo;
	public JLabel jLabeldescripcionCampo;
	public JTextArea jTextAreadescripcionCampo;
	public JScrollPane jscrollPanedescripcionCampo;
	public JButton jButtondescripcionCampoBusqueda= new JButtonMe();

	public JPanel jPanelestadoCampo;
	public JLabel jLabelestadoCampo;
	public JCheckBox jCheckBoxestadoCampo;
	public JButton jButtonestadoCampoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_opcionCampo;
	public JLabel jLabelid_opcionCampo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_opcionCampo;
	public JButton jButtonid_opcionCampo= new JButtonMe();
	public JButton jButtonid_opcionCampoUpdate= new JButtonMe();
	public JButton jButtonid_opcionCampoBusqueda= new JButtonMe();
	public JButton jButtonid_opcionCampoArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCampo;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CampoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCampo=new JPanel();
				this.jPanelAccionesFormularioCampo=new JPanel();
				this.jmenuBarDetalleCampo=new JMenuBar();
				this.jTtoolBarDetalleCampo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CampoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CampoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Campo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCampo() {
		return this.jButtonActualizarToolBarCampo;
	}
	
	public JButton getjButtonEliminarToolBarCampo() {
		return this.jButtonEliminarToolBarCampo;
	}
	
	public JButton getjButtonCancelarToolBarCampo() {
		return this.jButtonCancelarToolBarCampo;
	}		
	
	public JButton getjButtonProcesarInformacionCampo() {
		return this.jButtonProcesarInformacionCampo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCampo)	{
		this.jButtonProcesarInformacionCampo = jButtonProcesarInformacionCampo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCampo() {
		return this.jComboBoxTiposAccionesCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCampo(
			JComboBox jComboBoxTiposRelacionesCampo) {
		this.jComboBoxTiposRelacionesCampo = jComboBoxTiposRelacionesCampo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCampo(
			JComboBox jComboBoxTiposAccionesCampo) {
		this.jComboBoxTiposAccionesCampo = jComboBoxTiposAccionesCampo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCampo() {
		return this.jComboBoxTiposAccionesFormularioCampo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCampo(
			JComboBox jComboBoxTiposAccionesFormularioCampo) {
		this.jComboBoxTiposAccionesFormularioCampo = jComboBoxTiposAccionesFormularioCampo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.campoSessionBean=new CampoSessionBean();
		
		this.campoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.campoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.campoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.perfilcampoSessionBean=new PerfilCampoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CampoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CampoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Campo MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
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
	
		CampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCampo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCampo=new JButtonMe();
				this.jButtonModificarToolBarCampo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCampo,this.jTtoolBarDetalleCampo,
							"actualizar","actualizar","Actualizar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCampo,this.jTtoolBarDetalleCampo,
							"eliminar","eliminar","Eliminar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCampo,this.jTtoolBarDetalleCampo,
							"cancelar","cancelar","Cancelar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCampo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCampo,this.jTtoolBarDetalleCampo,
							"guardarcambios","guardarcambios","Guardar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCampo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCampo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCampo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCampo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCampo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCampo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCampo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCampo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCampo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCampo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCampo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCampo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCampo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCampo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCampo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCampo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCampo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCampo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCampo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCampo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCampo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCampo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCampo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCampo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCampo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCampo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCampo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCampo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCampo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCampo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCampo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCampo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCampo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCampo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCampo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCampo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCampo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCampo.add(this.jMenuItemDetalleCerrarCampo);
		
		this.jmenuDetalleAccionesCampo.add(this.jMenuItemActualizarCampo);
		this.jmenuDetalleAccionesCampo.add(this.jMenuItemEliminarCampo);
		this.jmenuDetalleAccionesCampo.add(this.jMenuItemCancelarCampo);		
		
		//this.jmenuDetalleDatosCampo.add(this.jMenuItemDetalleAbrirOrderByCampo);				
		this.jmenuDetalleDatosCampo.add(this.jMenuItemDetalleMostarOcultarCampo);				
				
		//this.jmenuDetalleAccionesCampo.add(this.jMenuItemGuardarCambiosCampo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCampo.add(this.jmenuDetalleArchivoCampo);		
		this.jmenuBarDetalleCampo.add(this.jmenuDetalleAccionesCampo);		
		this.jmenuBarDetalleCampo.add(this.jmenuDetalleDatosCampo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCampo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCampo.add(this.jmenuDetalleCampo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCampo);				
	}
	
	
	public void inicializarElementosCamposCampo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCampo = new JLabelMe();
		jLabelIdCampo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCampo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCampo.setToolTipText(CampoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCampo= new GridBagLayout();

		this.jPanelidCampo.setLayout(this.gridaBagLayoutCampo);

		jLabelidCampo = new JLabel();
		jLabelidCampo.setText("Id");

		jLabelidCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCampo = new JLabelMe();
		this.jLabelcodigoCampo.setText(""+CampoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCampo.setToolTipText("Codigo");
		this.jLabelcodigoCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCampo.setToolTipText(CampoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCampo = new GridBagLayout();
		this.jPanelcodigoCampo.setLayout(this.gridaBagLayoutCampo);


		jTextFieldcodigoCampo= new JTextFieldMe();

		jTextFieldcodigoCampo.setEnabled(false);
		jTextFieldcodigoCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCampoBusqueda= new JButtonMe();
		this.jButtoncodigoCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCampoBusqueda.setText("U");
		this.jButtoncodigoCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCampoBusqueda"));

		if(this.campoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCampoBusqueda.setVisible(false);		}


					
		this.jLabelnombreCampo = new JLabelMe();
		this.jLabelnombreCampo.setText(""+CampoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCampo.setToolTipText("Nombre");
		this.jLabelnombreCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCampo.setToolTipText(CampoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCampo = new GridBagLayout();
		this.jPanelnombreCampo.setLayout(this.gridaBagLayoutCampo);


		jTextAreanombreCampo= new JTextAreaMe();
		jTextAreanombreCampo.setEnabled(false);
		jTextAreanombreCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCampo.setLineWrap(true);
		jTextAreanombreCampo.setWrapStyleWord(true);
		jTextAreanombreCampo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCampo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCampo = new JScrollPane(jTextAreanombreCampo);
		jscrollPanenombreCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreCampoBusqueda= new JButtonMe();
		this.jButtonnombreCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCampoBusqueda.setText("U");
		this.jButtonnombreCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCampoBusqueda"));

		if(this.campoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCampoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCampo = new JLabelMe();
		this.jLabeldescripcionCampo.setText(""+CampoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionCampo.setToolTipText("Descripcion");
		this.jLabeldescripcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCampo.setToolTipText(CampoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCampo = new GridBagLayout();
		this.jPaneldescripcionCampo.setLayout(this.gridaBagLayoutCampo);


		jTextAreadescripcionCampo= new JTextAreaMe();
		jTextAreadescripcionCampo.setEnabled(false);
		jTextAreadescripcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCampo.setLineWrap(true);
		jTextAreadescripcionCampo.setWrapStyleWord(true);
		jTextAreadescripcionCampo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCampo.setRows(9);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCampo = new JScrollPane(jTextAreadescripcionCampo);
		jscrollPanedescripcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionCampoBusqueda= new JButtonMe();
		this.jButtondescripcionCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCampoBusqueda.setText("U");
		this.jButtondescripcionCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCampoBusqueda"));

		if(this.campoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCampoBusqueda.setVisible(false);		}


					
		this.jLabelestadoCampo = new JLabelMe();
		this.jLabelestadoCampo.setText(""+CampoConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoCampo.setToolTipText("Estado");
		this.jLabelestadoCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoCampo.setToolTipText(CampoConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutCampo = new GridBagLayout();
		this.jPanelestadoCampo.setLayout(this.gridaBagLayoutCampo);


		jCheckBoxestadoCampo= new JCheckBoxMe();
		jCheckBoxestadoCampo.setEnabled(false);

		jCheckBoxestadoCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoCampoBusqueda= new JButtonMe();
		this.jButtonestadoCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoCampoBusqueda.setText("U");
		this.jButtonestadoCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoCampoBusqueda"));

		if(this.campoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoCampoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCampo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_opcionCampo = new JLabelMe();
		this.jLabelid_opcionCampo.setText(""+CampoConstantesFunciones.LABEL_IDOPCION+" : *");
		this.jLabelid_opcionCampo.setToolTipText("Opcion");
		this.jLabelid_opcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_opcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_opcionCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_opcionCampo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_opcionCampo.setToolTipText(CampoConstantesFunciones.LABEL_IDOPCION);
		this.gridaBagLayoutCampo = new GridBagLayout();
		this.jPanelid_opcionCampo.setLayout(this.gridaBagLayoutCampo);


		jComboBoxid_opcionCampo= new JComboBoxMe();
		jComboBoxid_opcionCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_opcionCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_opcionCampo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_opcionCampo= new JButtonMe();
		this.jButtonid_opcionCampo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionCampo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionCampo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_opcionCampo.setText("Buscar");
		this.jButtonid_opcionCampo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_opcionCampo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionCampo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_opcionCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionCampo"));

		this.jButtonid_opcionCampoBusqueda= new JButtonMe();
		this.jButtonid_opcionCampoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionCampoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionCampoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionCampoBusqueda.setText("U");
		this.jButtonid_opcionCampoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_opcionCampoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionCampoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_opcionCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionCampoBusqueda"));

		if(this.campoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_opcionCampoBusqueda.setVisible(false);		}

		this.jButtonid_opcionCampoUpdate= new JButtonMe();
		this.jButtonid_opcionCampoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionCampoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_opcionCampoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_opcionCampoUpdate.setText("U");
		this.jButtonid_opcionCampoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_opcionCampoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionCampoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_opcionCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionCampoUpdate"));


		jButtonid_opcionCampoArbol= new JButtonMe();
		jButtonid_opcionCampoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionCampoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionCampoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_opcionCampoArbol.setText("Arbol");
		jButtonid_opcionCampoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_opcionCampoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_opcionCampoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_opcionCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_opcionCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_opcionCampoArbol"));



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
		//this.jInternalFrameDetalleCampo = new CampoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Campo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCampo= new GridBagLayout();
		

		
		String sToolTipCampo="";
		sToolTipCampo=CampoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCampo+="(Seguridad.Campo)";
		}
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			sToolTipCampo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCampo = new JButtonMe();
		this.jButtonModificarCampo = new JButtonMe();
        this.jButtonActualizarCampo = new JButtonMe();
        this.jButtonEliminarCampo = new JButtonMe();
        this.jButtonCancelarCampo = new JButtonMe();
        this.jButtonGuardarCambiosCampo = new JButtonMe();
		this.jButtonGuardarCambiosTablaCampo = new JButtonMe();
		this.jButtonCerrarCampo = new JButtonMe();
		
		this.jScrollPanelDatosCampo = new JScrollPane();   
        this.jScrollPanelDatosEdicionCampo = new JScrollPane();
		this.jScrollPanelDatosGeneralCampo = new JScrollPane();
				
		
		
		this.jPanelCamposCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Campo";
		
		if(!this.campoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Campos" + this.sPath));
		} else {
			this.jScrollPanelDatosCampo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCampo.setName("jPanelCamposCampo"); 

		this.jPanelCamposOcultosCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCampo.setName("jPanelCamposOcultosCampo"); 

        this.jPanelAccionesCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCampo.setToolTipText("Acciones");
        this.jPanelAccionesCampo.setName("Acciones"); 

		this.jPanelAccionesFormularioCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCampo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCampo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCampo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCampo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCampo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCampo.setText("Nuevo");
		this.jButtonModificarCampo.setText("Editar");
        this.jButtonActualizarCampo.setText("Actualizar");
        this.jButtonEliminarCampo.setText("Eliminar");
        this.jButtonCancelarCampo.setText("Cancelar");
        this.jButtonGuardarCambiosCampo.setText("Guardar");
		this.jButtonGuardarCambiosTablaCampo.setText("Guardar");
		this.jButtonCerrarCampo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCampo,"nuevo_button","Nuevo",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCampo,"modificar_button","Editar",this.campoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCampo,"actualizar_button","Actualizar",this.campoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCampo,"eliminar_button","Eliminar",this.campoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCampo,"cancelar_button","Cancelar",this.campoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCampo,"guardarcambios_button","Guardar",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCampo,"guardarcambiostabla_button","Guardar",this.campoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCampo,"cerrar_button","Salir",this.campoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCampo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCampo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCampo.setToolTipText("Nuevo"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCampo.setToolTipText("Editar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCampo.setToolTipText("Actualizar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCampo.setToolTipText("Eliminar)"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCampo.setToolTipText("Cancelar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCampo.setToolTipText("Guardar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCampo.setToolTipText("Guardar"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCampo.setToolTipText("Salir"+" "+CampoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCampo";
		inputMap = this.jButtonNuevoCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCampo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCampo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCampo";
		inputMap = this.jButtonActualizarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCampo"));
		
		//ELIMINAR
		sMapKey = "EliminarCampo";
		inputMap = this.jButtonEliminarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCampo"));
		
		//CANCELAR	
		sMapKey = "CancelarCampo";
		inputMap = this.jButtonCancelarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCampo"));
		
		//CERRAR		
		sMapKey = "CerrarCampo";
		inputMap = this.jButtonCerrarCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCampo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCampo";
		inputMap = this.jButtonGuardarCambiosTablaCampo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCampo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCampo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCampo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCampo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCampo.setToolTipText("Nuevo Campo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCampo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCampo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCampo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCampo.setToolTipText("Sin Cerrar Ventana Campo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCampo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCampo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCampo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCampo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCampo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCampo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCampo.setText("Accion");
		this.jComboBoxTiposAccionesCampo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCampo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCampo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCampo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCampo = new JLabelMe();
		
		this.jLabelAccionesCampo.setText("Acciones");		
		this.jLabelAccionesCampo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCampo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCampo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCampo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCampo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCampo=new JTabbedPane();
		this.jTabbedPaneRelacionesCampo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCampo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCampo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCampo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCampo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCampo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCampo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCampo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCampo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCampo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCampo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCampo = new GridBagLayout();
		
		this.jPanelCamposCampo.setLayout(gridaBagLayoutCamposCampo);
		this.jPanelCamposOcultosCampo.setLayout(gridaBagLayoutCamposOcultosCampo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 0;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCampo.add(jLabelIdCampo, this.gridBagConstraintsCampo);



	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 1;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCampo.add(jLabelidCampo, this.gridBagConstraintsCampo);


	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 0;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_opcionCampo.add(jLabelid_opcionCampo, this.gridBagConstraintsCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 2;
		this.gridBagConstraintsCampo.ipadx = 0;
		this.gridBagConstraintsCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionCampo.add(jButtonid_opcionCampoBusqueda, this.gridBagConstraintsCampo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 3;
		this.gridBagConstraintsCampo.ipadx = 0;
		this.gridBagConstraintsCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_opcionCampo.add(jButtonid_opcionCampoUpdate, this.gridBagConstraintsCampo);
	}

	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 1;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_opcionCampo.add(jComboBoxid_opcionCampo, this.gridBagConstraintsCampo);


	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 0;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCampo.add(jLabelcodigoCampo, this.gridBagConstraintsCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 2;
		this.gridBagConstraintsCampo.ipadx = 0;
		this.gridBagConstraintsCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCampo.add(jButtoncodigoCampoBusqueda, this.gridBagConstraintsCampo);
	}

	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 1;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCampo.add(jTextFieldcodigoCampo, this.gridBagConstraintsCampo);


	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 0;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCampo.add(jLabelnombreCampo, this.gridBagConstraintsCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 2;
		this.gridBagConstraintsCampo.ipadx = 0;
		this.gridBagConstraintsCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCampo.add(jButtonnombreCampoBusqueda, this.gridBagConstraintsCampo);
	}

	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 1;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCampo.add(jscrollPanenombreCampo, this.gridBagConstraintsCampo);


	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 0;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCampo.add(jLabeldescripcionCampo, this.gridBagConstraintsCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 2;
		this.gridBagConstraintsCampo.ipadx = 0;
		this.gridBagConstraintsCampo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCampo.add(jButtondescripcionCampoBusqueda, this.gridBagConstraintsCampo);
	}

	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 1;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCampo.add(jscrollPanedescripcionCampo, this.gridBagConstraintsCampo);


	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 0;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoCampo.add(jLabelestadoCampo, this.gridBagConstraintsCampo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCampo = new GridBagConstraints();
		//this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = 2;
		this.gridBagConstraintsCampo.ipadx = 0;
		this.gridBagConstraintsCampo.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoCampo.add(jButtonestadoCampoBusqueda, this.gridBagConstraintsCampo);
	}

	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCampo.gridy = 0;
	this.gridBagConstraintsCampo.gridx = 1;
	this.gridBagConstraintsCampo.ipadx = 0;
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoCampo.add(jCheckBoxestadoCampo, this.gridBagConstraintsCampo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCampo.gridy = iYPanelCamposCampo;
	this.gridBagConstraintsCampo.gridx = iXPanelCamposCampo++;
	this.gridBagConstraintsCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCampo.add(this.jPanelidCampo, this.gridBagConstraintsCampo);



	if(iXPanelCamposCampo % 1==0) {
		iXPanelCamposCampo=0;
		iYPanelCamposCampo++;
	}
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCampo.gridy = iYPanelCamposCampo;
	this.gridBagConstraintsCampo.gridx = iXPanelCamposCampo++;
	this.gridBagConstraintsCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCampo.add(this.jPanelid_opcionCampo, this.gridBagConstraintsCampo);



	if(iXPanelCamposCampo % 1==0) {
		iXPanelCamposCampo=0;
		iYPanelCamposCampo++;
	}
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCampo.gridy = iYPanelCamposCampo;
	this.gridBagConstraintsCampo.gridx = iXPanelCamposCampo++;
	this.gridBagConstraintsCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCampo.add(this.jPanelcodigoCampo, this.gridBagConstraintsCampo);



	if(iXPanelCamposCampo % 1==0) {
		iXPanelCamposCampo=0;
		iYPanelCamposCampo++;
	}
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCampo.gridy = iYPanelCamposCampo;
	this.gridBagConstraintsCampo.gridx = iXPanelCamposCampo++;
	this.gridBagConstraintsCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCampo.add(this.jPanelnombreCampo, this.gridBagConstraintsCampo);



	if(iXPanelCamposCampo % 1==0) {
		iXPanelCamposCampo=0;
		iYPanelCamposCampo++;
	}
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCampo.gridy = iYPanelCamposCampo;
	this.gridBagConstraintsCampo.gridx = iXPanelCamposCampo++;
	this.gridBagConstraintsCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCampo.add(this.jPaneldescripcionCampo, this.gridBagConstraintsCampo);



	if(iXPanelCamposCampo % 1==0) {
		iXPanelCamposCampo=0;
		iYPanelCamposCampo++;
	}
	this.gridBagConstraintsCampo = new GridBagConstraints();
	this.gridBagConstraintsCampo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCampo.gridy = iYPanelCamposCampo;
	this.gridBagConstraintsCampo.gridx = iXPanelCamposCampo++;
	this.gridBagConstraintsCampo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCampo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCampo.add(this.jPanelestadoCampo, this.gridBagConstraintsCampo);



	if(iXPanelCamposCampo % 1==0) {
		iXPanelCamposCampo=0;
		iYPanelCamposCampo++;
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
			
		GridBagLayout gridaBagLayoutAccionesCampo= new GridBagLayout();
		this.jPanelAccionesCampo.setLayout(gridaBagLayoutAccionesCampo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCampo= new GridBagLayout();
		this.jPanelAccionesFormularioCampo.setLayout(gridaBagLayoutAccionesFormularioCampo);
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCampo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCampo.add(this.jComboBoxTiposAccionesFormularioCampo, this.gridBagConstraintsCampo);

		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCampo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCampo.add(this.jCheckBoxPostAccionNuevoCampo, this.gridBagConstraintsCampo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.campoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCampo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCampo.add(this.jCheckBoxPostAccionSinCerrarCampo, this.gridBagConstraintsCampo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.campoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.campoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCampo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCampo.add(this.jCheckBoxPostAccionSinMensajeCampo, this.gridBagConstraintsCampo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx = iPosXAccion++;
			
		this.jPanelAccionesCampo.add(this.jButtonModificarCampo, this.gridBagConstraintsCampo);							

		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCampo.gridy = 0;
		this.gridBagConstraintsCampo.gridx =iPosXAccion++;
			
		this.jPanelAccionesCampo.add(this.jButtonEliminarCampo, this.gridBagConstraintsCampo);
		
			
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = 0;		
		this.gridBagConstraintsCampo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCampo.add(this.jButtonActualizarCampo, this.gridBagConstraintsCampo);


		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = 0;		
		this.gridBagConstraintsCampo.gridx = iPosXAccion++;
		
		this.jPanelAccionesCampo.add(this.jButtonGuardarCambiosCampo, this.gridBagConstraintsCampo);	
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = 0;		
		this.gridBagConstraintsCampo.gridx =iPosXAccion++;
		
		this.jPanelAccionesCampo.add(this.jButtonCancelarCampo, this.gridBagConstraintsCampo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCampo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCampo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.campoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCampo = new GridBagConstraints();						
			this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCampo.gridx = 0;		
			//this.gridBagConstraintsCampo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCampo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCampo.gridx =0;
		this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCampo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCampo, this.gridBagConstraintsCampo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CampoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCampo = new CampoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Campo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Campo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Campo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CampoModel campoModel=new CampoModel(this);
			
			//SI USARA CLASE INTERNA
			//CampoModel.CampoFocusTraversalPolicy campoFocusTraversalPolicy = campoModel.new CampoFocusTraversalPolicy(this);
			
			//campoFocusTraversalPolicy.setcampoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(campoModel);
			
			
			this.jContentPaneDetalleCampo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCampo = new GridBagLayout();	
			this.jContentPaneDetalleCampo.setLayout(gridaBagLayoutDetalleCampo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCampo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCampo = new GridBagConstraints();
				this.gridBagConstraintsCampo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCampo.gridx = 0;
					
				
				this.jContentPaneDetalleCampo.add(jTtoolBarDetalleCampo, gridBagConstraintsCampo);								
				
}
			
			this.jScrollPanelDatosEdicionCampo=   new JScrollPane(jContentPaneDetalleCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCampo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCampo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCampo.gridx = 0;
	        
			this.jContentPaneDetalleCampo.add(jPanelCamposCampo, gridBagConstraintsCampo);
			
			
			
			
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
						&& campoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePerfilCampo(this.puedeCargarPorPartePerfilCampo,false,-1);
					
					if(this.campoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCampo= new GridBagConstraints();
						this.gridBagConstraintsCampo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCampo.gridx = 0;
						this.jContentPaneDetalleCampo.add(this.jTabbedPaneRelacionesCampo, this.gridBagConstraintsCampo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCampo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePerfilCampo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCampo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCampo = new GridBagConstraints();
					this.gridBagConstraintsCampo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCampo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCampo.gridx = 0;
					
				
					this.jContentPaneDetalleCampo.add(jPanelCamposOcultosCampo, gridBagConstraintsCampo);
				
					this.jPanelCamposOcultosCampo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsCampo.gridx = 0;
	        this.gridBagConstraintsCampo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCampo.add(this.jPanelAccionesFormularioCampo, this.gridBagConstraintsCampo);							
			
			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
	        this.gridBagConstraintsCampo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsCampo.gridx = 0;
	        
			
			this.jContentPaneDetalleCampo.add(this.jPanelAccionesCampo, this.gridBagConstraintsCampo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCampo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCampo=   new JScrollPane(this.jPanelCamposCampo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCampo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCampo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCampo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCampo.gridx = 0;
			this.gridBagConstraintsCampo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCampo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCampo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCampo, this.gridBagConstraintsCampo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCampo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCampo, this.gridBagConstraintsCampo);			
			
			this.gridBagConstraintsCampo = new GridBagConstraints();
			this.gridBagConstraintsCampo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCampo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCampo, this.gridBagConstraintsCampo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCampo, this.gridBagConstraintsCampo);
			
			
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCampo, this.gridBagConstraintsCampo);
		
			
		this.gridBagConstraintsCampo = new GridBagConstraints();
		this.gridBagConstraintsCampo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCampo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCampo, this.gridBagConstraintsCampo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCampo;//jContentPane;
		
		return jScrollPanelDatosEdicionCampo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePerfilCampo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.perfilcampoSessionBean=new PerfilCampoSessionBean();
		this.perfilcampoSessionBean.setConGuardarRelaciones(false);
		this.perfilcampoSessionBean.setEsGuardarRelacionado(true);

		this.perfilcampoBeanSwingJInternalFrame=null;//new PerfilCampoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.perfilcampoBeanSwingJInternalFramePopup=new PerfilCampoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.perfilcampoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {

				PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL=CampoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PerfilCampoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CampoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.perfilcampoSessionBean.setEsGuardarRelacionado(true);

				this.perfilcampoBeanSwingJInternalFrame=new PerfilCampoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.perfilcampoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.perfilcampoBeanSwingJInternalFrame.setperfilcampoSessionBean(this.perfilcampoSessionBean);

				//this.gridBagConstraintsCampo = new GridBagConstraints();
				//this.gridBagConstraintsCampo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCampo.gridx = 0;
				//this.jContentPaneDetalleCampo.add(this.perfilcampoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCampo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCampo.add("Perfil Campos",this.perfilcampoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCampo.setComponentAt(iIndexTab,this.perfilcampoBeanSwingJInternalFrame.getContentPane());
				}

				//PerfilCampoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.perfilcampoSessionBean.setEsGuardarRelacionado(false);
				this.perfilcampoBeanSwingJInternalFrame=null;//new PerfilCampoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePerfilCampo) {
					this.jTabbedPaneRelacionesCampo.add("Perfil Campos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPerfilCampoBeanSwingJInternalFrame(List<Campo> campos,Campo campo,PerfilCampoBeanSwingJInternalFrame perfilcampoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//perfilcampoBeanSwingJInternalFrame=new PerfilCampoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					perfilcampoBeanSwingJInternalFrame.getPerfilCampoLogic().setConnexion(this.campoLogic.getConnexion());

					perfilcampoBeanSwingJInternalFrame.setcamposForeignKey(campos);
					perfilcampoBeanSwingJInternalFrame.setcampoForeignKey(campo);
					perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.setisBusquedaDesdeForeignKeySesionCampo(true);
					perfilcampoBeanSwingJInternalFrame.perfilcampoSessionBean.setlidCampoActual(campo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					perfilcampoBeanSwingJInternalFrame.cargarCombosForeignKeyPerfilCampo(perfilcampoBeanSwingJInternalFrame.isCargarCombosDependencia);
					perfilcampoBeanSwingJInternalFrame.setVisibilidadBusquedasParaCampo(true);
					perfilcampoBeanSwingJInternalFrame.setid_campoFK_IdCampo(campo.getId());

					if(!this.conCargarFormDetalle) {
						perfilcampoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					perfilcampoBeanSwingJInternalFrame.setSelectedItemCombosFrameCampoForeignKey(campo,1,false,true,true);
					perfilcampoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					perfilcampoBeanSwingJInternalFrame.procesarBusqueda("FK_IdCampo");
					perfilcampoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCampo");
					perfilcampoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfilCampo(true);
					perfilcampoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPerfilCampo("n",perfilcampoBeanSwingJInternalFrame.isGuardarCambiosEnLote, perfilcampoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					perfilcampoBeanSwingJInternalFrame.setAutoscrolls(true);
					perfilcampoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						perfilcampoBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilCampo("relacionado");
					} else {
						perfilcampoBeanSwingJInternalFrame.actualizarEstadoPanelsPerfilCampo("no_relacionado");
					}

					perfilcampoBeanSwingJInternalFrame.getjButtonRecargarInformacionPerfilCampo().setVisible(false);

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
