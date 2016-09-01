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
import com.bydan.erp.seguridad.util.ModuloConstantesFunciones;

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
public class ModuloDetalleFormJInternalFrame extends ModuloBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleModulo;
	
	protected JMenuBar jmenuBarDetalleModulo;
	
	protected JMenu jmenuDetalleModulo;
	protected JMenu jmenuDetalleArchivoModulo;
	protected JMenu jmenuDetalleAccionesModulo;
	protected JMenu jmenuDetalleDatosModulo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutModulo;	
	protected GridBagConstraints gridBagConstraintsModulo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ModuloBeanSwingJInternalFrameAdditional jInternalFrameDetalleModulo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected SistemaBeanSwingJInternalFrame sistemaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sistema="";

	protected PaqueteBeanSwingJInternalFrame paqueteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_paquete="";

	protected TipoTeclaMascaraBeanSwingJInternalFrame tipoteclamascaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoteclamascara="";
	
	public ModuloSessionBean moduloSessionBean;
	
	
	
	
	public SistemaSessionBean sistemaSessionBean;
	public PaqueteSessionBean paqueteSessionBean;
	public TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean;	
	
	public ModuloLogic moduloLogic;
	
	public JScrollPane jScrollPanelDatosModulo;
	public JScrollPane jScrollPanelDatosEdicionModulo;
	public JScrollPane jScrollPanelDatosGeneralModulo;
	
	protected JPanel jPanelCamposModulo;    
	protected JPanel jPanelCamposOcultosModulo;    	
	protected JPanel jPanelAccionesModulo;
	protected JPanel jPanelAccionesFormularioModulo;
    
	
	
	protected Integer iXPanelCamposModulo=0;
	protected Integer iYPanelCamposModulo=0;
	
	protected Integer iXPanelCamposOcultosModulo=0;
	protected Integer iYPanelCamposOcultosModulo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoModulo;
	public JButton jButtonModificarModulo;
	public JButton jButtonActualizarModulo;
    public JButton jButtonEliminarModulo;
	public JButton jButtonCancelarModulo;
    public JButton jButtonGuardarCambiosModulo;
	public JButton jButtonGuardarCambiosTablaModulo;
	protected JButton jButtonCerrarModulo;
	
	
	protected JButton jButtonProcesarInformacionModulo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoModulo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarModulo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeModulo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarModulo;
	protected JButton jButtonModificarToolBarModulo;
	protected JButton jButtonActualizarToolBarModulo;
    protected JButton jButtonEliminarToolBarModulo;
	protected JButton jButtonCancelarToolBarModulo;
    protected JButton jButtonGuardarCambiosToolBarModulo;
	protected JButton jButtonGuardarCambiosTablaToolBarModulo;
	protected JButton jButtonMostrarOcultarTablaToolBarModulo;
	protected JButton jButtonCerrarToolBarModulo;
	
	protected JButton jButtonProcesarInformacionToolBarModulo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoModulo;
	protected JMenuItem jMenuItemModificarModulo;
	protected JMenuItem jMenuItemActualizarModulo;
    protected JMenuItem jMenuItemEliminarModulo;
	protected JMenuItem jMenuItemCancelarModulo;
    protected JMenuItem jMenuItemGuardarCambiosModulo;
	protected JMenuItem jMenuItemGuardarCambiosTablaModulo;
	protected JMenuItem jMenuItemCerrarModulo;
	protected JMenuItem jMenuItemDetalleCerrarModulo;
	protected JMenuItem jMenuItemDetalleMostarOcultarModulo;
	
	protected JMenuItem jMenuItemProcesarInformacionModulo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosModulo;
	protected JMenuItem jMenuItemMostrarOcultarModulo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesModulo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesModulo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesModulo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioModulo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidModulo;
	public JLabel jLabelIdModulo;
	public JTextFieldMe jTextFieldidModulo;
	public JButton jButtonidModuloBusqueda= new JButtonMe();

	public JPanel jPanelcodigoModulo;
	public JLabel jLabelcodigoModulo;
	public JTextField jTextFieldcodigoModulo;
	public JButton jButtoncodigoModuloBusqueda= new JButtonMe();

	public JPanel jPanelnombreModulo;
	public JLabel jLabelnombreModulo;
	public JTextArea jTextAreanombreModulo;
	public JScrollPane jscrollPanenombreModulo;
	public JButton jButtonnombreModuloBusqueda= new JButtonMe();

	public JPanel jPanelteclaModulo;
	public JLabel jLabelteclaModulo;
	public JTextField jTextFieldteclaModulo;
	public JButton jButtonteclaModuloBusqueda= new JButtonMe();

	public JPanel jPanelestadoModulo;
	public JLabel jLabelestadoModulo;
	public JCheckBox jCheckBoxestadoModulo;
	public JButton jButtonestadoModuloBusqueda= new JButtonMe();

	public JPanel jPanelordenModulo;
	public JLabel jLabelordenModulo;
	public JTextField jTextFieldordenModulo;
	public JButton jButtonordenModuloBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionModulo;
	public JLabel jLabeldescripcionModulo;
	public JTextArea jTextAreadescripcionModulo;
	public JScrollPane jscrollPanedescripcionModulo;
	public JButton jButtondescripcionModuloBusqueda= new JButtonMe();

	
	public JPanel jPanelid_sistemaModulo;
	public JLabel jLabelid_sistemaModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sistemaModulo;
	public JButton jButtonid_sistemaModulo= new JButtonMe();
	public JButton jButtonid_sistemaModuloUpdate= new JButtonMe();
	public JButton jButtonid_sistemaModuloBusqueda= new JButtonMe();

	public JPanel jPanelid_paqueteModulo;
	public JLabel jLabelid_paqueteModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paqueteModulo;
	public JButton jButtonid_paqueteModulo= new JButtonMe();
	public JButton jButtonid_paqueteModuloUpdate= new JButtonMe();
	public JButton jButtonid_paqueteModuloBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tecla_mascaraModulo;
	public JLabel jLabelid_tipo_tecla_mascaraModulo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tecla_mascaraModulo;
	public JButton jButtonid_tipo_tecla_mascaraModulo= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraModuloUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tecla_mascaraModuloBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesModulo;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ModuloDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposModulo=new JPanel();
				this.jPanelAccionesFormularioModulo=new JPanel();
				this.jmenuBarDetalleModulo=new JMenuBar();
				this.jTtoolBarDetalleModulo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ModuloDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ModuloDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Modulo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarModulo() {
		return this.jButtonActualizarToolBarModulo;
	}
	
	public JButton getjButtonEliminarToolBarModulo() {
		return this.jButtonEliminarToolBarModulo;
	}
	
	public JButton getjButtonCancelarToolBarModulo() {
		return this.jButtonCancelarToolBarModulo;
	}		
	
	public JButton getjButtonProcesarInformacionModulo() {
		return this.jButtonProcesarInformacionModulo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionModulo)	{
		this.jButtonProcesarInformacionModulo = jButtonProcesarInformacionModulo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesModulo() {
		return this.jComboBoxTiposAccionesModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesModulo(
			JComboBox jComboBoxTiposRelacionesModulo) {
		this.jComboBoxTiposRelacionesModulo = jComboBoxTiposRelacionesModulo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesModulo(
			JComboBox jComboBoxTiposAccionesModulo) {
		this.jComboBoxTiposAccionesModulo = jComboBoxTiposAccionesModulo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioModulo() {
		return this.jComboBoxTiposAccionesFormularioModulo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioModulo(
			JComboBox jComboBoxTiposAccionesFormularioModulo) {
		this.jComboBoxTiposAccionesFormularioModulo = jComboBoxTiposAccionesFormularioModulo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.moduloSessionBean=new ModuloSessionBean();
		
		this.moduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.moduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.moduloSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ModuloJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ModuloJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ModuloJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Modulo MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
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
	
		ModuloJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleModulo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarModulo=new JButtonMe();
				this.jButtonModificarToolBarModulo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarModulo,this.jTtoolBarDetalleModulo,
							"actualizar","actualizar","Actualizar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarModulo,this.jTtoolBarDetalleModulo,
							"eliminar","eliminar","Eliminar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarModulo,this.jTtoolBarDetalleModulo,
							"cancelar","cancelar","Cancelar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarModulo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarModulo,this.jTtoolBarDetalleModulo,
							"guardarcambios","guardarcambios","Guardar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarModulo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleModulo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleModulo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoModulo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesModulo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosModulo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoModulo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoModulo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoModulo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarModulo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarModulo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarModulo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarModulo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarModulo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarModulo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarModulo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarModulo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarModulo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarModulo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarModulo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarModulo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosModulo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosModulo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosModulo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarModulo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarModulo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarModulo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarModulo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarModulo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarModulo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarModulo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarModulo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoModulo.add(this.jMenuItemDetalleCerrarModulo);
		
		this.jmenuDetalleAccionesModulo.add(this.jMenuItemActualizarModulo);
		this.jmenuDetalleAccionesModulo.add(this.jMenuItemEliminarModulo);
		this.jmenuDetalleAccionesModulo.add(this.jMenuItemCancelarModulo);		
		
		//this.jmenuDetalleDatosModulo.add(this.jMenuItemDetalleAbrirOrderByModulo);				
		this.jmenuDetalleDatosModulo.add(this.jMenuItemDetalleMostarOcultarModulo);				
				
		//this.jmenuDetalleAccionesModulo.add(this.jMenuItemGuardarCambiosModulo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleModulo.add(this.jmenuDetalleArchivoModulo);		
		this.jmenuBarDetalleModulo.add(this.jmenuDetalleAccionesModulo);		
		this.jmenuBarDetalleModulo.add(this.jmenuDetalleDatosModulo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleModulo);				
	}
	
	
	public void inicializarElementosCamposModulo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdModulo = new JLabelMe();
		jLabelIdModulo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidModulo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidModulo.setToolTipText(ModuloConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutModulo= new GridBagLayout();

		this.jPanelidModulo.setLayout(this.gridaBagLayoutModulo);

		jTextFieldidModulo = new JTextFieldMe();
		jTextFieldidModulo.setText("Id");

		jTextFieldidModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoModulo = new JLabelMe();
		this.jLabelcodigoModulo.setText(""+ModuloConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoModulo.setToolTipText("Codigo");
		this.jLabelcodigoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoModulo.setToolTipText(ModuloConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelcodigoModulo.setLayout(this.gridaBagLayoutModulo);


		jTextFieldcodigoModulo= new JTextFieldMe();

		jTextFieldcodigoModulo.setEnabled(false);
		jTextFieldcodigoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoModuloBusqueda= new JButtonMe();
		this.jButtoncodigoModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoModuloBusqueda.setText("U");
		this.jButtoncodigoModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoModuloBusqueda.setVisible(false);		}


					
		this.jLabelnombreModulo = new JLabelMe();
		this.jLabelnombreModulo.setText(""+ModuloConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreModulo.setToolTipText("Nombre");
		this.jLabelnombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreModulo.setToolTipText(ModuloConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelnombreModulo.setLayout(this.gridaBagLayoutModulo);


		jTextAreanombreModulo= new JTextAreaMe();
		jTextAreanombreModulo.setEnabled(false);
		jTextAreanombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreModulo.setLineWrap(true);
		jTextAreanombreModulo.setWrapStyleWord(true);
		jTextAreanombreModulo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreModulo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreModulo = new JScrollPane(jTextAreanombreModulo);
		jscrollPanenombreModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreModuloBusqueda= new JButtonMe();
		this.jButtonnombreModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreModuloBusqueda.setText("U");
		this.jButtonnombreModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreModuloBusqueda.setVisible(false);		}


					
		this.jLabelteclaModulo = new JLabelMe();
		this.jLabelteclaModulo.setText(""+ModuloConstantesFunciones.LABEL_TECLA+" :");
		this.jLabelteclaModulo.setToolTipText("Tecla");
		this.jLabelteclaModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelteclaModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelteclaModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelteclaModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelteclaModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelteclaModulo.setToolTipText(ModuloConstantesFunciones.LABEL_TECLA);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelteclaModulo.setLayout(this.gridaBagLayoutModulo);


		jTextFieldteclaModulo= new JTextFieldMe();

		jTextFieldteclaModulo.setEnabled(false);
		jTextFieldteclaModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldteclaModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldteclaModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldteclaModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonteclaModuloBusqueda= new JButtonMe();
		this.jButtonteclaModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonteclaModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonteclaModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonteclaModuloBusqueda.setText("U");
		this.jButtonteclaModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonteclaModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonteclaModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldteclaModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldteclaModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"teclaModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonteclaModuloBusqueda.setVisible(false);		}


					
		this.jLabelestadoModulo = new JLabelMe();
		this.jLabelestadoModulo.setText(""+ModuloConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoModulo.setToolTipText("Estado");
		this.jLabelestadoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoModulo.setToolTipText(ModuloConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelestadoModulo.setLayout(this.gridaBagLayoutModulo);


		jCheckBoxestadoModulo= new JCheckBoxMe();
		jCheckBoxestadoModulo.setEnabled(false);

		jCheckBoxestadoModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxestadoModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxestadoModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonestadoModuloBusqueda= new JButtonMe();
		this.jButtonestadoModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoModuloBusqueda.setText("U");
		this.jButtonestadoModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxestadoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxestadoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoModuloBusqueda.setVisible(false);		}


					
		this.jLabelordenModulo = new JLabelMe();
		this.jLabelordenModulo.setText(""+ModuloConstantesFunciones.LABEL_ORDEN+" : *");
		this.jLabelordenModulo.setToolTipText("Orden");
		this.jLabelordenModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenModulo.setToolTipText(ModuloConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelordenModulo.setLayout(this.gridaBagLayoutModulo);


		jTextFieldordenModulo= new JTextFieldMe();
		jTextFieldordenModulo.setEnabled(false);
		jTextFieldordenModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldordenModulo.setText("0");

		this.jButtonordenModuloBusqueda= new JButtonMe();
		this.jButtonordenModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenModuloBusqueda.setText("U");
		this.jButtonordenModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenModuloBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionModulo = new JLabelMe();
		this.jLabeldescripcionModulo.setText(""+ModuloConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionModulo.setToolTipText("Descripcion");
		this.jLabeldescripcionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionModulo.setToolTipText(ModuloConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPaneldescripcionModulo.setLayout(this.gridaBagLayoutModulo);


		jTextAreadescripcionModulo= new JTextAreaMe();
		jTextAreadescripcionModulo.setEnabled(false);
		jTextAreadescripcionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionModulo.setLineWrap(true);
		jTextAreadescripcionModulo.setWrapStyleWord(true);
		jTextAreadescripcionModulo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionModulo.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionModulo = new JScrollPane(jTextAreadescripcionModulo);
		jscrollPanedescripcionModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionModuloBusqueda= new JButtonMe();
		this.jButtondescripcionModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionModuloBusqueda.setText("U");
		this.jButtondescripcionModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionModuloBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysModulo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_sistemaModulo = new JLabelMe();
		this.jLabelid_sistemaModulo.setText(""+ModuloConstantesFunciones.LABEL_IDSISTEMA+" : *");
		this.jLabelid_sistemaModulo.setToolTipText("Sistema");
		this.jLabelid_sistemaModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sistemaModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sistemaModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sistemaModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sistemaModulo.setToolTipText(ModuloConstantesFunciones.LABEL_IDSISTEMA);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelid_sistemaModulo.setLayout(this.gridaBagLayoutModulo);


		jComboBoxid_sistemaModulo= new JComboBoxMe();
		jComboBoxid_sistemaModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sistemaModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sistemaModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sistemaModulo= new JButtonMe();
		this.jButtonid_sistemaModulo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaModulo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaModulo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sistemaModulo.setText("Buscar");
		this.jButtonid_sistemaModulo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sistemaModulo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaModulo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sistemaModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaModulo"));

		this.jButtonid_sistemaModuloBusqueda= new JButtonMe();
		this.jButtonid_sistemaModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaModuloBusqueda.setText("U");
		this.jButtonid_sistemaModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sistemaModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sistemaModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sistemaModuloBusqueda.setVisible(false);		}

		this.jButtonid_sistemaModuloUpdate= new JButtonMe();
		this.jButtonid_sistemaModuloUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaModuloUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sistemaModuloUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sistemaModuloUpdate.setText("U");
		this.jButtonid_sistemaModuloUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sistemaModuloUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sistemaModuloUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sistemaModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sistemaModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sistemaModuloUpdate"));



					
		this.jLabelid_paqueteModulo = new JLabelMe();
		this.jLabelid_paqueteModulo.setText(""+ModuloConstantesFunciones.LABEL_IDPAQUETE+" : *");
		this.jLabelid_paqueteModulo.setToolTipText("Paquete");
		this.jLabelid_paqueteModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paqueteModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paqueteModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paqueteModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paqueteModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paqueteModulo.setToolTipText(ModuloConstantesFunciones.LABEL_IDPAQUETE);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelid_paqueteModulo.setLayout(this.gridaBagLayoutModulo);


		jComboBoxid_paqueteModulo= new JComboBoxMe();
		jComboBoxid_paqueteModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paqueteModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paqueteModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paqueteModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paqueteModulo= new JButtonMe();
		this.jButtonid_paqueteModulo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paqueteModulo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paqueteModulo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paqueteModulo.setText("Buscar");
		this.jButtonid_paqueteModulo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paqueteModulo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paqueteModulo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paqueteModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paqueteModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paqueteModulo"));

		this.jButtonid_paqueteModuloBusqueda= new JButtonMe();
		this.jButtonid_paqueteModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paqueteModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paqueteModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paqueteModuloBusqueda.setText("U");
		this.jButtonid_paqueteModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paqueteModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paqueteModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paqueteModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paqueteModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paqueteModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paqueteModuloBusqueda.setVisible(false);		}

		this.jButtonid_paqueteModuloUpdate= new JButtonMe();
		this.jButtonid_paqueteModuloUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paqueteModuloUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paqueteModuloUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paqueteModuloUpdate.setText("U");
		this.jButtonid_paqueteModuloUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paqueteModuloUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paqueteModuloUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paqueteModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paqueteModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paqueteModuloUpdate"));



					
		this.jLabelid_tipo_tecla_mascaraModulo = new JLabelMe();
		this.jLabelid_tipo_tecla_mascaraModulo.setText(""+ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA+" : *");
		this.jLabelid_tipo_tecla_mascaraModulo.setToolTipText("Tipo Tecla Mascara");
		this.jLabelid_tipo_tecla_mascaraModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tecla_mascaraModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_tecla_mascaraModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tecla_mascaraModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tecla_mascaraModulo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tecla_mascaraModulo.setToolTipText(ModuloConstantesFunciones.LABEL_IDTIPOTECLAMASCARA);
		this.gridaBagLayoutModulo = new GridBagLayout();
		this.jPanelid_tipo_tecla_mascaraModulo.setLayout(this.gridaBagLayoutModulo);


		jComboBoxid_tipo_tecla_mascaraModulo= new JComboBoxMe();
		jComboBoxid_tipo_tecla_mascaraModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tecla_mascaraModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tecla_mascaraModulo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tecla_mascaraModulo= new JButtonMe();
		this.jButtonid_tipo_tecla_mascaraModulo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tecla_mascaraModulo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tecla_mascaraModulo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tecla_mascaraModulo.setText("Buscar");
		this.jButtonid_tipo_tecla_mascaraModulo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tecla_mascaraModulo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tecla_mascaraModulo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tecla_mascaraModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tecla_mascaraModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tecla_mascaraModulo"));

		this.jButtonid_tipo_tecla_mascaraModuloBusqueda= new JButtonMe();
		this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setText("U");
		this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tecla_mascaraModuloBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tecla_mascaraModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tecla_mascaraModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tecla_mascaraModuloBusqueda"));

		if(this.moduloSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tecla_mascaraModuloBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tecla_mascaraModuloUpdate= new JButtonMe();
		this.jButtonid_tipo_tecla_mascaraModuloUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraModuloUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tecla_mascaraModuloUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tecla_mascaraModuloUpdate.setText("U");
		this.jButtonid_tipo_tecla_mascaraModuloUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tecla_mascaraModuloUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tecla_mascaraModuloUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tecla_mascaraModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tecla_mascaraModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tecla_mascaraModuloUpdate"));



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
		//this.jInternalFrameDetalleModulo = new ModuloBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Modulo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutModulo= new GridBagLayout();
		

		
		String sToolTipModulo="";
		sToolTipModulo=ModuloConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipModulo+="(Seguridad.Modulo)";
		}
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			sToolTipModulo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoModulo = new JButtonMe();
		this.jButtonModificarModulo = new JButtonMe();
        this.jButtonActualizarModulo = new JButtonMe();
        this.jButtonEliminarModulo = new JButtonMe();
        this.jButtonCancelarModulo = new JButtonMe();
        this.jButtonGuardarCambiosModulo = new JButtonMe();
		this.jButtonGuardarCambiosTablaModulo = new JButtonMe();
		this.jButtonCerrarModulo = new JButtonMe();
		
		this.jScrollPanelDatosModulo = new JScrollPane();   
        this.jScrollPanelDatosEdicionModulo = new JScrollPane();
		this.jScrollPanelDatosGeneralModulo = new JScrollPane();
				
		
		
		this.jPanelCamposModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Modulo";
		
		if(!this.moduloSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Modulos" + this.sPath));
		} else {
			this.jScrollPanelDatosModulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposModulo.setName("jPanelCamposModulo"); 

		this.jPanelCamposOcultosModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosModulo.setName("jPanelCamposOcultosModulo"); 

        this.jPanelAccionesModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesModulo.setToolTipText("Acciones");
        this.jPanelAccionesModulo.setName("Acciones"); 

		this.jPanelAccionesFormularioModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioModulo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioModulo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosModulo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposModulo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosModulo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoModulo.setText("Nuevo");
		this.jButtonModificarModulo.setText("Editar");
        this.jButtonActualizarModulo.setText("Actualizar");
        this.jButtonEliminarModulo.setText("Eliminar");
        this.jButtonCancelarModulo.setText("Cancelar");
        this.jButtonGuardarCambiosModulo.setText("Guardar");
		this.jButtonGuardarCambiosTablaModulo.setText("Guardar");
		this.jButtonCerrarModulo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoModulo,"nuevo_button","Nuevo",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarModulo,"modificar_button","Editar",this.moduloSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarModulo,"actualizar_button","Actualizar",this.moduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarModulo,"eliminar_button","Eliminar",this.moduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarModulo,"cancelar_button","Cancelar",this.moduloSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosModulo,"guardarcambios_button","Guardar",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaModulo,"guardarcambiostabla_button","Guardar",this.moduloSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarModulo,"cerrar_button","Salir",this.moduloSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarModulo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarModulo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoModulo.setToolTipText("Nuevo"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarModulo.setToolTipText("Editar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarModulo.setToolTipText("Actualizar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarModulo.setToolTipText("Eliminar)"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarModulo.setToolTipText("Cancelar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosModulo.setToolTipText("Guardar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaModulo.setToolTipText("Guardar"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarModulo.setToolTipText("Salir"+" "+ModuloConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoModulo";
		inputMap = this.jButtonNuevoModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoModulo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoModulo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarModulo";
		inputMap = this.jButtonActualizarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarModulo"));
		
		//ELIMINAR
		sMapKey = "EliminarModulo";
		inputMap = this.jButtonEliminarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarModulo"));
		
		//CANCELAR	
		sMapKey = "CancelarModulo";
		inputMap = this.jButtonCancelarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarModulo"));
		
		//CERRAR		
		sMapKey = "CerrarModulo";
		inputMap = this.jButtonCerrarModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarModulo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaModulo";
		inputMap = this.jButtonGuardarCambiosTablaModulo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaModulo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaModulo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoModulo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoModulo.setToolTipText("Nuevo Modulo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoModulo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarModulo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarModulo.setToolTipText("Sin Cerrar Ventana Modulo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarModulo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeModulo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeModulo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeModulo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeModulo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesModulo.setText("Accion");
		this.jComboBoxTiposAccionesModulo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioModulo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioModulo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioModulo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesModulo = new JLabelMe();
		
		this.jLabelAccionesModulo.setText("Acciones");		
		this.jLabelAccionesModulo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModulo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesModulo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposModulo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysModulo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesModulo=new JTabbedPane();
		this.jTabbedPaneRelacionesModulo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesModulo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesModulo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModulo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesModulo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesModulo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioModulo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioModulo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioModulo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioModulo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposModulo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosModulo = new GridBagLayout();
		
		this.jPanelCamposModulo.setLayout(gridaBagLayoutCamposModulo);
		this.jPanelCamposOcultosModulo.setLayout(gridaBagLayoutCamposOcultosModulo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidModulo.add(jLabelIdModulo, this.gridBagConstraintsModulo);



	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidModulo.add(jTextFieldidModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sistemaModulo.add(jLabelid_sistemaModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaModulo.add(jButtonid_sistemaModuloBusqueda, this.gridBagConstraintsModulo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 3;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sistemaModulo.add(jButtonid_sistemaModuloUpdate, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sistemaModulo.add(jComboBoxid_sistemaModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paqueteModulo.add(jLabelid_paqueteModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paqueteModulo.add(jButtonid_paqueteModuloBusqueda, this.gridBagConstraintsModulo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 3;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paqueteModulo.add(jButtonid_paqueteModuloUpdate, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paqueteModulo.add(jComboBoxid_paqueteModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoModulo.add(jLabelcodigoModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoModulo.add(jButtoncodigoModuloBusqueda, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoModulo.add(jTextFieldcodigoModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreModulo.add(jLabelnombreModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreModulo.add(jButtonnombreModuloBusqueda, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreModulo.add(jscrollPanenombreModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_tecla_mascaraModulo.add(jLabelid_tipo_tecla_mascaraModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tecla_mascaraModulo.add(jButtonid_tipo_tecla_mascaraModuloBusqueda, this.gridBagConstraintsModulo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 3;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tecla_mascaraModulo.add(jButtonid_tipo_tecla_mascaraModuloUpdate, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_tecla_mascaraModulo.add(jComboBoxid_tipo_tecla_mascaraModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelteclaModulo.add(jLabelteclaModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelteclaModulo.add(jButtonteclaModuloBusqueda, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelteclaModulo.add(jTextFieldteclaModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoModulo.add(jLabelestadoModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoModulo.add(jButtonestadoModuloBusqueda, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoModulo.add(jCheckBoxestadoModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenModulo.add(jLabelordenModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenModulo.add(jButtonordenModuloBusqueda, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenModulo.add(jTextFieldordenModulo, this.gridBagConstraintsModulo);


	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 0;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionModulo.add(jLabeldescripcionModulo, this.gridBagConstraintsModulo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsModulo = new GridBagConstraints();
		//this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = 2;
		this.gridBagConstraintsModulo.ipadx = 0;
		this.gridBagConstraintsModulo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionModulo.add(jButtondescripcionModuloBusqueda, this.gridBagConstraintsModulo);
	}

	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsModulo.gridy = 0;
	this.gridBagConstraintsModulo.gridx = 1;
	this.gridBagConstraintsModulo.ipadx = 0;
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionModulo.add(jscrollPanedescripcionModulo, this.gridBagConstraintsModulo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelidModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelid_sistemaModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelid_paqueteModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelcodigoModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelnombreModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelid_tipo_tecla_mascaraModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelteclaModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelestadoModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPanelordenModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
	}
	this.gridBagConstraintsModulo = new GridBagConstraints();
	this.gridBagConstraintsModulo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsModulo.gridy = iYPanelCamposModulo;
	this.gridBagConstraintsModulo.gridx = iXPanelCamposModulo++;
	this.gridBagConstraintsModulo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsModulo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposModulo.add(this.jPaneldescripcionModulo, this.gridBagConstraintsModulo);



	if(iXPanelCamposModulo % 1==0) {
		iXPanelCamposModulo=0;
		iYPanelCamposModulo++;
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
			
		GridBagLayout gridaBagLayoutAccionesModulo= new GridBagLayout();
		this.jPanelAccionesModulo.setLayout(gridaBagLayoutAccionesModulo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioModulo= new GridBagLayout();
		this.jPanelAccionesFormularioModulo.setLayout(gridaBagLayoutAccionesFormularioModulo);
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsModulo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioModulo.add(this.jComboBoxTiposAccionesFormularioModulo, this.gridBagConstraintsModulo);

		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsModulo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioModulo.add(this.jCheckBoxPostAccionNuevoModulo, this.gridBagConstraintsModulo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.moduloSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsModulo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioModulo.add(this.jCheckBoxPostAccionSinCerrarModulo, this.gridBagConstraintsModulo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.moduloSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.moduloSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsModulo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioModulo.add(this.jCheckBoxPostAccionSinMensajeModulo, this.gridBagConstraintsModulo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx = iPosXAccion++;
			
		this.jPanelAccionesModulo.add(this.jButtonModificarModulo, this.gridBagConstraintsModulo);							

		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsModulo.gridy = 0;
		this.gridBagConstraintsModulo.gridx =iPosXAccion++;
			
		this.jPanelAccionesModulo.add(this.jButtonEliminarModulo, this.gridBagConstraintsModulo);
		
			
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = 0;		
		this.gridBagConstraintsModulo.gridx = iPosXAccion++;
		
		this.jPanelAccionesModulo.add(this.jButtonActualizarModulo, this.gridBagConstraintsModulo);


		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = 0;		
		this.gridBagConstraintsModulo.gridx = iPosXAccion++;
		
		this.jPanelAccionesModulo.add(this.jButtonGuardarCambiosModulo, this.gridBagConstraintsModulo);	
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = 0;		
		this.gridBagConstraintsModulo.gridx =iPosXAccion++;
		
		this.jPanelAccionesModulo.add(this.jButtonCancelarModulo, this.gridBagConstraintsModulo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutModulo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutModulo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.moduloSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsModulo = new GridBagConstraints();						
			this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsModulo.gridx = 0;		
			//this.gridBagConstraintsModulo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsModulo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsModulo.gridx =0;
		this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsModulo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosModulo, this.gridBagConstraintsModulo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ModuloJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleModulo = new ModuloBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Modulo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Modulo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Modulo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ModuloModel moduloModel=new ModuloModel(this);
			
			//SI USARA CLASE INTERNA
			//ModuloModel.ModuloFocusTraversalPolicy moduloFocusTraversalPolicy = moduloModel.new ModuloFocusTraversalPolicy(this);
			
			//moduloFocusTraversalPolicy.setmoduloJInternalFrame(this);
			
			this.setFocusTraversalPolicy(moduloModel);
			
			
			this.jContentPaneDetalleModulo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleModulo = new GridBagLayout();	
			this.jContentPaneDetalleModulo.setLayout(gridaBagLayoutDetalleModulo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosModulo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsModulo = new GridBagConstraints();
				this.gridBagConstraintsModulo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsModulo.gridx = 0;
					
				
				this.jContentPaneDetalleModulo.add(jTtoolBarDetalleModulo, gridBagConstraintsModulo);								
				
}
			
			this.jScrollPanelDatosEdicionModulo=   new JScrollPane(jContentPaneDetalleModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralModulo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsModulo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsModulo.gridx = 0;
	        
			this.jContentPaneDetalleModulo.add(jPanelCamposModulo, gridBagConstraintsModulo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& moduloSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.moduloSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsModulo= new GridBagConstraints();
						this.gridBagConstraintsModulo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsModulo.gridx = 0;
						this.jContentPaneDetalleModulo.add(this.jTabbedPaneRelacionesModulo, this.gridBagConstraintsModulo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesModulo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosModulo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsModulo = new GridBagConstraints();
					this.gridBagConstraintsModulo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsModulo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsModulo.gridx = 0;
					
				
					this.jContentPaneDetalleModulo.add(jPanelCamposOcultosModulo, gridBagConstraintsModulo);
				
					this.jPanelCamposOcultosModulo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsModulo.gridx = 0;
	        this.gridBagConstraintsModulo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleModulo.add(this.jPanelAccionesFormularioModulo, this.gridBagConstraintsModulo);							
			
			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
	        this.gridBagConstraintsModulo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsModulo.gridx = 0;
	        
			
			this.jContentPaneDetalleModulo.add(this.jPanelAccionesModulo, this.gridBagConstraintsModulo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionModulo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionModulo=   new JScrollPane(this.jPanelCamposModulo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionModulo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModulo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionModulo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsModulo.gridx = 0;
			this.gridBagConstraintsModulo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsModulo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsModulo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionModulo, this.gridBagConstraintsModulo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsModulo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioModulo, this.gridBagConstraintsModulo);			
			
			this.gridBagConstraintsModulo = new GridBagConstraints();
			this.gridBagConstraintsModulo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsModulo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesModulo, this.gridBagConstraintsModulo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposModulo, this.gridBagConstraintsModulo);
			
			
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosModulo, this.gridBagConstraintsModulo);
		
			
		this.gridBagConstraintsModulo = new GridBagConstraints();
		this.gridBagConstraintsModulo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsModulo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesModulo, this.gridBagConstraintsModulo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralModulo;//jContentPane;
		
		return jScrollPanelDatosEdicionModulo;
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
