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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.TipoImagenPersonaConstantesFunciones;

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
public class TipoImagenPersonaDetalleFormJInternalFrame extends TipoImagenPersonaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoImagenPersona;
	
	protected JMenuBar jmenuBarDetalleTipoImagenPersona;
	
	protected JMenu jmenuDetalleTipoImagenPersona;
	protected JMenu jmenuDetalleArchivoTipoImagenPersona;
	protected JMenu jmenuDetalleAccionesTipoImagenPersona;
	protected JMenu jmenuDetalleDatosTipoImagenPersona;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoImagenPersona;	
	protected GridBagConstraints gridBagConstraintsTipoImagenPersona;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoImagenPersonaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoImagenPersona;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean;
	
	
	
		
	
	public TipoImagenPersonaLogic tipoimagenpersonaLogic;
	
	public JScrollPane jScrollPanelDatosTipoImagenPersona;
	public JScrollPane jScrollPanelDatosEdicionTipoImagenPersona;
	public JScrollPane jScrollPanelDatosGeneralTipoImagenPersona;
	
	protected JPanel jPanelCamposTipoImagenPersona;    
	protected JPanel jPanelCamposOcultosTipoImagenPersona;    	
	protected JPanel jPanelAccionesTipoImagenPersona;
	protected JPanel jPanelAccionesFormularioTipoImagenPersona;
    
	
	
	protected Integer iXPanelCamposTipoImagenPersona=0;
	protected Integer iYPanelCamposTipoImagenPersona=0;
	
	protected Integer iXPanelCamposOcultosTipoImagenPersona=0;
	protected Integer iYPanelCamposOcultosTipoImagenPersona=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoImagenPersona;
	public JButton jButtonModificarTipoImagenPersona;
	public JButton jButtonActualizarTipoImagenPersona;
    public JButton jButtonEliminarTipoImagenPersona;
	public JButton jButtonCancelarTipoImagenPersona;
    public JButton jButtonGuardarCambiosTipoImagenPersona;
	public JButton jButtonGuardarCambiosTablaTipoImagenPersona;
	protected JButton jButtonCerrarTipoImagenPersona;
	
	
	protected JButton jButtonProcesarInformacionTipoImagenPersona;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoImagenPersona;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoImagenPersona;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoImagenPersona;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoImagenPersona;
	protected JButton jButtonModificarToolBarTipoImagenPersona;
	protected JButton jButtonActualizarToolBarTipoImagenPersona;
    protected JButton jButtonEliminarToolBarTipoImagenPersona;
	protected JButton jButtonCancelarToolBarTipoImagenPersona;
    protected JButton jButtonGuardarCambiosToolBarTipoImagenPersona;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoImagenPersona;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoImagenPersona;
	protected JButton jButtonCerrarToolBarTipoImagenPersona;
	
	protected JButton jButtonProcesarInformacionToolBarTipoImagenPersona;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoImagenPersona;
	protected JMenuItem jMenuItemModificarTipoImagenPersona;
	protected JMenuItem jMenuItemActualizarTipoImagenPersona;
    protected JMenuItem jMenuItemEliminarTipoImagenPersona;
	protected JMenuItem jMenuItemCancelarTipoImagenPersona;
    protected JMenuItem jMenuItemGuardarCambiosTipoImagenPersona;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoImagenPersona;
	protected JMenuItem jMenuItemCerrarTipoImagenPersona;
	protected JMenuItem jMenuItemDetalleCerrarTipoImagenPersona;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoImagenPersona;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoImagenPersona;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoImagenPersona;
	protected JMenuItem jMenuItemMostrarOcultarTipoImagenPersona;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoImagenPersona;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoImagenPersona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoImagenPersona;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoImagenPersona;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoImagenPersona;
	public JLabel jLabelIdTipoImagenPersona;
	public JTextFieldMe jTextFieldidTipoImagenPersona;
	public JButton jButtonidTipoImagenPersonaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoImagenPersona;
	public JLabel jLabelcodigoTipoImagenPersona;
	public JTextField jTextFieldcodigoTipoImagenPersona;
	public JButton jButtoncodigoTipoImagenPersonaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoImagenPersona;
	public JLabel jLabelnombreTipoImagenPersona;
	public JTextArea jTextAreanombreTipoImagenPersona;
	public JScrollPane jscrollPanenombreTipoImagenPersona;
	public JButton jButtonnombreTipoImagenPersonaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoImagenPersona;
	
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
	
	public TipoImagenPersonaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoImagenPersona=new JPanel();
				this.jPanelAccionesFormularioTipoImagenPersona=new JPanel();
				this.jmenuBarDetalleTipoImagenPersona=new JMenuBar();
				this.jTtoolBarDetalleTipoImagenPersona=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoImagenPersonaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoImagenPersonaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoImagenPersona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoImagenPersona() {
		return this.jButtonActualizarToolBarTipoImagenPersona;
	}
	
	public JButton getjButtonEliminarToolBarTipoImagenPersona() {
		return this.jButtonEliminarToolBarTipoImagenPersona;
	}
	
	public JButton getjButtonCancelarToolBarTipoImagenPersona() {
		return this.jButtonCancelarToolBarTipoImagenPersona;
	}		
	
	public JButton getjButtonProcesarInformacionTipoImagenPersona() {
		return this.jButtonProcesarInformacionTipoImagenPersona;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoImagenPersona)	{
		this.jButtonProcesarInformacionTipoImagenPersona = jButtonProcesarInformacionTipoImagenPersona;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoImagenPersona() {
		return this.jComboBoxTiposAccionesTipoImagenPersona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoImagenPersona(
			JComboBox jComboBoxTiposRelacionesTipoImagenPersona) {
		this.jComboBoxTiposRelacionesTipoImagenPersona = jComboBoxTiposRelacionesTipoImagenPersona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoImagenPersona(
			JComboBox jComboBoxTiposAccionesTipoImagenPersona) {
		this.jComboBoxTiposAccionesTipoImagenPersona = jComboBoxTiposAccionesTipoImagenPersona;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoImagenPersona() {
		return this.jComboBoxTiposAccionesFormularioTipoImagenPersona;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoImagenPersona(
			JComboBox jComboBoxTiposAccionesFormularioTipoImagenPersona) {
		this.jComboBoxTiposAccionesFormularioTipoImagenPersona = jComboBoxTiposAccionesFormularioTipoImagenPersona;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
		
		this.tipoimagenpersonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimagenpersonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoImagenPersonaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoImagenPersonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoImagenPersonaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Imagen Persona MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoImagenPersonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoImagenPersona= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoImagenPersona=new JButtonMe();
				this.jButtonModificarToolBarTipoImagenPersona=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoImagenPersona,this.jTtoolBarDetalleTipoImagenPersona,
							"actualizar","actualizar","Actualizar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoImagenPersona,this.jTtoolBarDetalleTipoImagenPersona,
							"eliminar","eliminar","Eliminar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoImagenPersona,this.jTtoolBarDetalleTipoImagenPersona,
							"cancelar","cancelar","Cancelar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoImagenPersona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoImagenPersona,this.jTtoolBarDetalleTipoImagenPersona,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoImagenPersona=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoImagenPersona=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoImagenPersona=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoImagenPersona=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoImagenPersona=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoImagenPersona= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoImagenPersona.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoImagenPersona,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoImagenPersona= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoImagenPersona.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoImagenPersona,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoImagenPersona= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoImagenPersona.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoImagenPersona,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoImagenPersona= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoImagenPersona.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoImagenPersona,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoImagenPersona= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoImagenPersona.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoImagenPersona,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoImagenPersona= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoImagenPersona.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoImagenPersona,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoImagenPersona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoImagenPersona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoImagenPersona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoImagenPersona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoImagenPersona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoImagenPersona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoImagenPersona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoImagenPersona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoImagenPersona,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoImagenPersona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoImagenPersona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoImagenPersona,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoImagenPersona.add(this.jMenuItemDetalleCerrarTipoImagenPersona);
		
		this.jmenuDetalleAccionesTipoImagenPersona.add(this.jMenuItemActualizarTipoImagenPersona);
		this.jmenuDetalleAccionesTipoImagenPersona.add(this.jMenuItemEliminarTipoImagenPersona);
		this.jmenuDetalleAccionesTipoImagenPersona.add(this.jMenuItemCancelarTipoImagenPersona);		
		
		//this.jmenuDetalleDatosTipoImagenPersona.add(this.jMenuItemDetalleAbrirOrderByTipoImagenPersona);				
		this.jmenuDetalleDatosTipoImagenPersona.add(this.jMenuItemDetalleMostarOcultarTipoImagenPersona);				
				
		//this.jmenuDetalleAccionesTipoImagenPersona.add(this.jMenuItemGuardarCambiosTipoImagenPersona);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoImagenPersona.add(this.jmenuDetalleArchivoTipoImagenPersona);		
		this.jmenuBarDetalleTipoImagenPersona.add(this.jmenuDetalleAccionesTipoImagenPersona);		
		this.jmenuBarDetalleTipoImagenPersona.add(this.jmenuDetalleDatosTipoImagenPersona);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoImagenPersona);				
	}
	
	
	public void inicializarElementosCamposTipoImagenPersona() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoImagenPersona = new JLabelMe();
		jLabelIdTipoImagenPersona.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoImagenPersona = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoImagenPersona.setToolTipText(TipoImagenPersonaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoImagenPersona= new GridBagLayout();

		this.jPanelidTipoImagenPersona.setLayout(this.gridaBagLayoutTipoImagenPersona);

		jTextFieldidTipoImagenPersona = new JTextFieldMe();
		jTextFieldidTipoImagenPersona.setText("Id");

		jTextFieldidTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoImagenPersona = new JLabelMe();
		this.jLabelcodigoTipoImagenPersona.setText(""+TipoImagenPersonaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoImagenPersona.setToolTipText("Codigo");
		this.jLabelcodigoTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoImagenPersona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoImagenPersona.setToolTipText(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoImagenPersona = new GridBagLayout();
		this.jPanelcodigoTipoImagenPersona.setLayout(this.gridaBagLayoutTipoImagenPersona);


		jTextFieldcodigoTipoImagenPersona= new JTextFieldMe();

		jTextFieldcodigoTipoImagenPersona.setEnabled(false);
		jTextFieldcodigoTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoImagenPersonaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoImagenPersonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoImagenPersonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoImagenPersonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoImagenPersonaBusqueda.setText("U");
		this.jButtoncodigoTipoImagenPersonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoImagenPersonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoImagenPersonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoImagenPersona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoImagenPersona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoImagenPersonaBusqueda"));

		if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoImagenPersonaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoImagenPersona = new JLabelMe();
		this.jLabelnombreTipoImagenPersona.setText(""+TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoImagenPersona.setToolTipText("Nombre");
		this.jLabelnombreTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoImagenPersona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoImagenPersona.setToolTipText(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoImagenPersona = new GridBagLayout();
		this.jPanelnombreTipoImagenPersona.setLayout(this.gridaBagLayoutTipoImagenPersona);


		jTextAreanombreTipoImagenPersona= new JTextAreaMe();
		jTextAreanombreTipoImagenPersona.setEnabled(false);
		jTextAreanombreTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoImagenPersona.setLineWrap(true);
		jTextAreanombreTipoImagenPersona.setWrapStyleWord(true);
		jTextAreanombreTipoImagenPersona.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoImagenPersona.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoImagenPersona = new JScrollPane(jTextAreanombreTipoImagenPersona);
		jscrollPanenombreTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoImagenPersonaBusqueda= new JButtonMe();
		this.jButtonnombreTipoImagenPersonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoImagenPersonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoImagenPersonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoImagenPersonaBusqueda.setText("U");
		this.jButtonnombreTipoImagenPersonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoImagenPersonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoImagenPersonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoImagenPersona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoImagenPersona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoImagenPersonaBusqueda"));

		if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoImagenPersonaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoImagenPersona() {
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
		//this.jInternalFrameDetalleTipoImagenPersona = new TipoImagenPersonaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Imagen Persona DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoImagenPersona= new GridBagLayout();
		

		
		String sToolTipTipoImagenPersona="";
		sToolTipTipoImagenPersona=TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoImagenPersona+="(Seguridad.TipoImagenPersona)";
		}
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoImagenPersona+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoImagenPersona = new JButtonMe();
		this.jButtonModificarTipoImagenPersona = new JButtonMe();
        this.jButtonActualizarTipoImagenPersona = new JButtonMe();
        this.jButtonEliminarTipoImagenPersona = new JButtonMe();
        this.jButtonCancelarTipoImagenPersona = new JButtonMe();
        this.jButtonGuardarCambiosTipoImagenPersona = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoImagenPersona = new JButtonMe();
		this.jButtonCerrarTipoImagenPersona = new JButtonMe();
		
		this.jScrollPanelDatosTipoImagenPersona = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoImagenPersona = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoImagenPersona = new JScrollPane();
				
		
		
		this.jPanelCamposTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Imagen Persona";
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Imagen Personas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoImagenPersona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoImagenPersona.setName("jPanelCamposTipoImagenPersona"); 

		this.jPanelCamposOcultosTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoImagenPersona.setName("jPanelCamposOcultosTipoImagenPersona"); 

        this.jPanelAccionesTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoImagenPersona.setToolTipText("Acciones");
        this.jPanelAccionesTipoImagenPersona.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoImagenPersona.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoImagenPersona.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoImagenPersona.setText("Nuevo");
		this.jButtonModificarTipoImagenPersona.setText("Editar");
        this.jButtonActualizarTipoImagenPersona.setText("Actualizar");
        this.jButtonEliminarTipoImagenPersona.setText("Eliminar");
        this.jButtonCancelarTipoImagenPersona.setText("Cancelar");
        this.jButtonGuardarCambiosTipoImagenPersona.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoImagenPersona.setText("Guardar");
		this.jButtonCerrarTipoImagenPersona.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoImagenPersona,"nuevo_button","Nuevo",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoImagenPersona,"modificar_button","Editar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoImagenPersona,"actualizar_button","Actualizar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoImagenPersona,"eliminar_button","Eliminar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoImagenPersona,"cancelar_button","Cancelar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoImagenPersona,"guardarcambios_button","Guardar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoImagenPersona,"guardarcambiostabla_button","Guardar",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoImagenPersona,"cerrar_button","Salir",this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoImagenPersona.setToolTipText("Nuevo"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoImagenPersona.setToolTipText("Editar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoImagenPersona.setToolTipText("Actualizar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoImagenPersona.setToolTipText("Eliminar)"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoImagenPersona.setToolTipText("Cancelar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoImagenPersona.setToolTipText("Guardar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoImagenPersona.setToolTipText("Guardar"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoImagenPersona.setToolTipText("Salir"+" "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoImagenPersona";
		inputMap = this.jButtonNuevoTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoImagenPersona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoImagenPersona"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoImagenPersona";
		inputMap = this.jButtonActualizarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoImagenPersona"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoImagenPersona";
		inputMap = this.jButtonEliminarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoImagenPersona"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoImagenPersona";
		inputMap = this.jButtonCancelarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoImagenPersona"));
		
		//CERRAR		
		sMapKey = "CerrarTipoImagenPersona";
		inputMap = this.jButtonCerrarTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoImagenPersona"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoImagenPersona";
		inputMap = this.jButtonGuardarCambiosTablaTipoImagenPersona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoImagenPersona"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoImagenPersona = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoImagenPersona.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoImagenPersona.setToolTipText("Nuevo TipoImagenPersona");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoImagenPersona = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoImagenPersona.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoImagenPersona.setToolTipText("Sin Cerrar Ventana TipoImagenPersona");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoImagenPersona = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoImagenPersona.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoImagenPersona.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoImagenPersona.setText("Accion");
		this.jComboBoxTiposAccionesTipoImagenPersona.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoImagenPersona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoImagenPersona.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoImagenPersona.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoImagenPersona = new JLabelMe();
		
		this.jLabelAccionesTipoImagenPersona.setText("Acciones");		
		this.jLabelAccionesTipoImagenPersona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagenPersona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoImagenPersona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoImagenPersona();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoImagenPersona();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoImagenPersona=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoImagenPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoImagenPersona,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoImagenPersona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagenPersona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoImagenPersona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoImagenPersona.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoImagenPersona.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoImagenPersona.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoImagenPersona, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoImagenPersona = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoImagenPersona = new GridBagLayout();
		
		this.jPanelCamposTipoImagenPersona.setLayout(gridaBagLayoutCamposTipoImagenPersona);
		this.jPanelCamposOcultosTipoImagenPersona.setLayout(gridaBagLayoutCamposOcultosTipoImagenPersona);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagenPersona.gridy = 0;
	this.gridBagConstraintsTipoImagenPersona.gridx = 0;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoImagenPersona.add(jLabelIdTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);



	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagenPersona.gridy = 0;
	this.gridBagConstraintsTipoImagenPersona.gridx = 1;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoImagenPersona.add(jTextFieldidTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);


	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagenPersona.gridy = 0;
	this.gridBagConstraintsTipoImagenPersona.gridx = 0;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoImagenPersona.add(jLabelcodigoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		//this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;
		this.gridBagConstraintsTipoImagenPersona.gridx = 2;
		this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
		this.gridBagConstraintsTipoImagenPersona.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoImagenPersona.add(jButtoncodigoTipoImagenPersonaBusqueda, this.gridBagConstraintsTipoImagenPersona);
	}

	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagenPersona.gridy = 0;
	this.gridBagConstraintsTipoImagenPersona.gridx = 1;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoImagenPersona.add(jTextFieldcodigoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);


	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagenPersona.gridy = 0;
	this.gridBagConstraintsTipoImagenPersona.gridx = 0;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoImagenPersona.add(jLabelnombreTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		//this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;
		this.gridBagConstraintsTipoImagenPersona.gridx = 2;
		this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
		this.gridBagConstraintsTipoImagenPersona.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoImagenPersona.add(jButtonnombreTipoImagenPersonaBusqueda, this.gridBagConstraintsTipoImagenPersona);
	}

	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoImagenPersona.gridy = 0;
	this.gridBagConstraintsTipoImagenPersona.gridx = 1;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoImagenPersona.add(jscrollPanenombreTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImagenPersona.gridy = iYPanelCamposTipoImagenPersona;
	this.gridBagConstraintsTipoImagenPersona.gridx = iXPanelCamposTipoImagenPersona++;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImagenPersona.add(this.jPanelidTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);



	if(iXPanelCamposTipoImagenPersona % 1==0) {
		iXPanelCamposTipoImagenPersona=0;
		iYPanelCamposTipoImagenPersona++;
	}
	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImagenPersona.gridy = iYPanelCamposTipoImagenPersona;
	this.gridBagConstraintsTipoImagenPersona.gridx = iXPanelCamposTipoImagenPersona++;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImagenPersona.add(this.jPanelcodigoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);



	if(iXPanelCamposTipoImagenPersona % 1==0) {
		iXPanelCamposTipoImagenPersona=0;
		iYPanelCamposTipoImagenPersona++;
	}
	this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoImagenPersona.gridy = iYPanelCamposTipoImagenPersona;
	this.gridBagConstraintsTipoImagenPersona.gridx = iXPanelCamposTipoImagenPersona++;
	this.gridBagConstraintsTipoImagenPersona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoImagenPersona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoImagenPersona.add(this.jPanelnombreTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);



	if(iXPanelCamposTipoImagenPersona % 1==0) {
		iXPanelCamposTipoImagenPersona=0;
		iYPanelCamposTipoImagenPersona++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoImagenPersona= new GridBagLayout();
		this.jPanelAccionesTipoImagenPersona.setLayout(gridaBagLayoutAccionesTipoImagenPersona);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoImagenPersona= new GridBagLayout();
		this.jPanelAccionesFormularioTipoImagenPersona.setLayout(gridaBagLayoutAccionesFormularioTipoImagenPersona);
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoImagenPersona.add(this.jComboBoxTiposAccionesFormularioTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);

		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoImagenPersona.add(this.jCheckBoxPostAccionNuevoTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoImagenPersona.add(this.jCheckBoxPostAccionSinCerrarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoImagenPersona.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoImagenPersona.add(this.jCheckBoxPostAccionSinMensajeTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoImagenPersona.add(this.jButtonModificarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);							

		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;
		this.gridBagConstraintsTipoImagenPersona.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoImagenPersona.add(this.jButtonEliminarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
			
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoImagenPersona.add(this.jButtonActualizarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);


		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;		
		this.gridBagConstraintsTipoImagenPersona.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoImagenPersona.add(this.jButtonGuardarCambiosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);	
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = 0;		
		this.gridBagConstraintsTipoImagenPersona.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoImagenPersona.add(this.jButtonCancelarTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoImagenPersona = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoImagenPersona);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();						
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoImagenPersona.gridx = 0;		
			//this.gridBagConstraintsTipoImagenPersona.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoImagenPersona.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoImagenPersona.gridx =0;
		this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoImagenPersona.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoImagenPersona = new TipoImagenPersonaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Imagen Persona DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Imagen Persona DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Imagen Persona Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoImagenPersonaModel tipoimagenpersonaModel=new TipoImagenPersonaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoImagenPersonaModel.TipoImagenPersonaFocusTraversalPolicy tipoimagenpersonaFocusTraversalPolicy = tipoimagenpersonaModel.new TipoImagenPersonaFocusTraversalPolicy(this);
			
			//tipoimagenpersonaFocusTraversalPolicy.settipoimagenpersonaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoimagenpersonaModel);
			
			
			this.jContentPaneDetalleTipoImagenPersona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoImagenPersona = new GridBagLayout();	
			this.jContentPaneDetalleTipoImagenPersona.setLayout(gridaBagLayoutDetalleTipoImagenPersona);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoImagenPersona = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
				this.gridBagConstraintsTipoImagenPersona.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoImagenPersona.gridx = 0;
					
				
				this.jContentPaneDetalleTipoImagenPersona.add(jTtoolBarDetalleTipoImagenPersona, gridBagConstraintsTipoImagenPersona);								
				
}
			
			this.jScrollPanelDatosEdicionTipoImagenPersona=   new JScrollPane(jContentPaneDetalleTipoImagenPersona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoImagenPersona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagenPersona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagenPersona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoImagenPersona=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoImagenPersona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagenPersona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoImagenPersona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoImagenPersona.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoImagenPersona.gridx = 0;
	        
			this.jContentPaneDetalleTipoImagenPersona.add(jPanelCamposTipoImagenPersona, gridBagConstraintsTipoImagenPersona);
			
			
			
			
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
						&& tipoimagenpersonaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoImagenPersona= new GridBagConstraints();
						this.gridBagConstraintsTipoImagenPersona.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoImagenPersona.gridx = 0;
						this.jContentPaneDetalleTipoImagenPersona.add(this.jTabbedPaneRelacionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoImagenPersona.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoImagenPersona.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
					this.gridBagConstraintsTipoImagenPersona.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoImagenPersona.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoImagenPersona.gridx = 0;
					
				
					this.jContentPaneDetalleTipoImagenPersona.add(jPanelCamposOcultosTipoImagenPersona, gridBagConstraintsTipoImagenPersona);
				
					this.jPanelCamposOcultosTipoImagenPersona.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoImagenPersona.gridx = 0;
	        this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoImagenPersona.add(this.jPanelAccionesFormularioTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);							
			
			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
	        this.gridBagConstraintsTipoImagenPersona.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoImagenPersona.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoImagenPersona.add(this.jPanelAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoImagenPersona);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoImagenPersona=   new JScrollPane(this.jPanelCamposTipoImagenPersona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoImagenPersona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagenPersona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoImagenPersona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoImagenPersona.gridx = 0;
			this.gridBagConstraintsTipoImagenPersona.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoImagenPersona.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoImagenPersona.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoImagenPersona.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);			
			
			this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
			this.gridBagConstraintsTipoImagenPersona.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoImagenPersona.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
			
			
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		
			
		this.gridBagConstraintsTipoImagenPersona = new GridBagConstraints();
		this.gridBagConstraintsTipoImagenPersona.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoImagenPersona.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoImagenPersona, this.gridBagConstraintsTipoImagenPersona);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoImagenPersona;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoImagenPersona;
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
