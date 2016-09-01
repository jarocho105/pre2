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
import com.bydan.erp.seguridad.util.TipoFuenteConstantesFunciones;

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
public class TipoFuenteDetalleFormJInternalFrame extends TipoFuenteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFuente;
	
	protected JMenuBar jmenuBarDetalleTipoFuente;
	
	protected JMenu jmenuDetalleTipoFuente;
	protected JMenu jmenuDetalleArchivoTipoFuente;
	protected JMenu jmenuDetalleAccionesTipoFuente;
	protected JMenu jmenuDetalleDatosTipoFuente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFuente;	
	protected GridBagConstraints gridBagConstraintsTipoFuente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFuenteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFuente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFuenteSessionBean tipofuenteSessionBean;
	
	
	
		
	
	public TipoFuenteLogic tipofuenteLogic;
	
	public JScrollPane jScrollPanelDatosTipoFuente;
	public JScrollPane jScrollPanelDatosEdicionTipoFuente;
	public JScrollPane jScrollPanelDatosGeneralTipoFuente;
	
	protected JPanel jPanelCamposTipoFuente;    
	protected JPanel jPanelCamposOcultosTipoFuente;    	
	protected JPanel jPanelAccionesTipoFuente;
	protected JPanel jPanelAccionesFormularioTipoFuente;
    
	
	
	protected Integer iXPanelCamposTipoFuente=0;
	protected Integer iYPanelCamposTipoFuente=0;
	
	protected Integer iXPanelCamposOcultosTipoFuente=0;
	protected Integer iYPanelCamposOcultosTipoFuente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFuente;
	public JButton jButtonModificarTipoFuente;
	public JButton jButtonActualizarTipoFuente;
    public JButton jButtonEliminarTipoFuente;
	public JButton jButtonCancelarTipoFuente;
    public JButton jButtonGuardarCambiosTipoFuente;
	public JButton jButtonGuardarCambiosTablaTipoFuente;
	protected JButton jButtonCerrarTipoFuente;
	
	
	protected JButton jButtonProcesarInformacionTipoFuente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFuente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFuente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFuente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFuente;
	protected JButton jButtonModificarToolBarTipoFuente;
	protected JButton jButtonActualizarToolBarTipoFuente;
    protected JButton jButtonEliminarToolBarTipoFuente;
	protected JButton jButtonCancelarToolBarTipoFuente;
    protected JButton jButtonGuardarCambiosToolBarTipoFuente;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFuente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFuente;
	protected JButton jButtonCerrarToolBarTipoFuente;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFuente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFuente;
	protected JMenuItem jMenuItemModificarTipoFuente;
	protected JMenuItem jMenuItemActualizarTipoFuente;
    protected JMenuItem jMenuItemEliminarTipoFuente;
	protected JMenuItem jMenuItemCancelarTipoFuente;
    protected JMenuItem jMenuItemGuardarCambiosTipoFuente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFuente;
	protected JMenuItem jMenuItemCerrarTipoFuente;
	protected JMenuItem jMenuItemDetalleCerrarTipoFuente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFuente;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFuente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFuente;
	protected JMenuItem jMenuItemMostrarOcultarTipoFuente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFuente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFuente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFuente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFuente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFuente;
	public JLabel jLabelIdTipoFuente;
	public JTextFieldMe jTextFieldidTipoFuente;
	public JButton jButtonidTipoFuenteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoFuente;
	public JLabel jLabelcodigoTipoFuente;
	public JTextField jTextFieldcodigoTipoFuente;
	public JButton jButtoncodigoTipoFuenteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFuente;
	public JLabel jLabelnombreTipoFuente;
	public JTextArea jTextAreanombreTipoFuente;
	public JScrollPane jscrollPanenombreTipoFuente;
	public JButton jButtonnombreTipoFuenteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFuente;
	
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
	
	public TipoFuenteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFuente=new JPanel();
				this.jPanelAccionesFormularioTipoFuente=new JPanel();
				this.jmenuBarDetalleTipoFuente=new JMenuBar();
				this.jTtoolBarDetalleTipoFuente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFuenteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFuenteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFuente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFuente() {
		return this.jButtonActualizarToolBarTipoFuente;
	}
	
	public JButton getjButtonEliminarToolBarTipoFuente() {
		return this.jButtonEliminarToolBarTipoFuente;
	}
	
	public JButton getjButtonCancelarToolBarTipoFuente() {
		return this.jButtonCancelarToolBarTipoFuente;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFuente() {
		return this.jButtonProcesarInformacionTipoFuente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFuente)	{
		this.jButtonProcesarInformacionTipoFuente = jButtonProcesarInformacionTipoFuente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFuente() {
		return this.jComboBoxTiposAccionesTipoFuente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFuente(
			JComboBox jComboBoxTiposRelacionesTipoFuente) {
		this.jComboBoxTiposRelacionesTipoFuente = jComboBoxTiposRelacionesTipoFuente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFuente(
			JComboBox jComboBoxTiposAccionesTipoFuente) {
		this.jComboBoxTiposAccionesTipoFuente = jComboBoxTiposAccionesTipoFuente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFuente() {
		return this.jComboBoxTiposAccionesFormularioTipoFuente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFuente(
			JComboBox jComboBoxTiposAccionesFormularioTipoFuente) {
		this.jComboBoxTiposAccionesFormularioTipoFuente = jComboBoxTiposAccionesFormularioTipoFuente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipofuenteSessionBean=new TipoFuenteSessionBean();
		
		this.tipofuenteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofuenteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofuenteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFuenteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFuenteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFuenteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Fuente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFuenteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFuente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFuente=new JButtonMe();
				this.jButtonModificarToolBarTipoFuente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFuente,this.jTtoolBarDetalleTipoFuente,
							"actualizar","actualizar","Actualizar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFuente,this.jTtoolBarDetalleTipoFuente,
							"eliminar","eliminar","Eliminar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFuente,this.jTtoolBarDetalleTipoFuente,
							"cancelar","cancelar","Cancelar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFuente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFuente,this.jTtoolBarDetalleTipoFuente,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFuente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFuente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFuente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFuente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFuente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFuente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFuente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFuente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFuente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFuente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFuente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFuente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFuente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFuente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFuente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFuente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFuente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFuente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFuente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFuente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFuente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFuente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFuente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFuente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFuente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFuente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFuente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFuente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFuente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFuente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFuente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFuente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFuente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFuente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFuente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFuente.add(this.jMenuItemDetalleCerrarTipoFuente);
		
		this.jmenuDetalleAccionesTipoFuente.add(this.jMenuItemActualizarTipoFuente);
		this.jmenuDetalleAccionesTipoFuente.add(this.jMenuItemEliminarTipoFuente);
		this.jmenuDetalleAccionesTipoFuente.add(this.jMenuItemCancelarTipoFuente);		
		
		//this.jmenuDetalleDatosTipoFuente.add(this.jMenuItemDetalleAbrirOrderByTipoFuente);				
		this.jmenuDetalleDatosTipoFuente.add(this.jMenuItemDetalleMostarOcultarTipoFuente);				
				
		//this.jmenuDetalleAccionesTipoFuente.add(this.jMenuItemGuardarCambiosTipoFuente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFuente.add(this.jmenuDetalleArchivoTipoFuente);		
		this.jmenuBarDetalleTipoFuente.add(this.jmenuDetalleAccionesTipoFuente);		
		this.jmenuBarDetalleTipoFuente.add(this.jmenuDetalleDatosTipoFuente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFuente);				
	}
	
	
	public void inicializarElementosCamposTipoFuente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFuente = new JLabelMe();
		jLabelIdTipoFuente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFuente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFuente.setToolTipText(TipoFuenteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFuente= new GridBagLayout();

		this.jPanelidTipoFuente.setLayout(this.gridaBagLayoutTipoFuente);

		jTextFieldidTipoFuente = new JTextFieldMe();
		jTextFieldidTipoFuente.setText("Id");

		jTextFieldidTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoFuente = new JLabelMe();
		this.jLabelcodigoTipoFuente.setText(""+TipoFuenteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoFuente.setToolTipText("Codigo");
		this.jLabelcodigoTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoFuente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoFuente.setToolTipText(TipoFuenteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoFuente = new GridBagLayout();
		this.jPanelcodigoTipoFuente.setLayout(this.gridaBagLayoutTipoFuente);


		jTextFieldcodigoTipoFuente= new JTextFieldMe();

		jTextFieldcodigoTipoFuente.setEnabled(false);
		jTextFieldcodigoTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoFuenteBusqueda= new JButtonMe();
		this.jButtoncodigoTipoFuenteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFuenteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFuenteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoFuenteBusqueda.setText("U");
		this.jButtoncodigoTipoFuenteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoFuenteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoFuenteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoFuente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoFuente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoFuenteBusqueda"));

		if(this.tipofuenteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoFuenteBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoFuente = new JLabelMe();
		this.jLabelnombreTipoFuente.setText(""+TipoFuenteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFuente.setToolTipText("Nombre");
		this.jLabelnombreTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFuente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFuente.setToolTipText(TipoFuenteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFuente = new GridBagLayout();
		this.jPanelnombreTipoFuente.setLayout(this.gridaBagLayoutTipoFuente);


		jTextAreanombreTipoFuente= new JTextAreaMe();
		jTextAreanombreTipoFuente.setEnabled(false);
		jTextAreanombreTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFuente.setLineWrap(true);
		jTextAreanombreTipoFuente.setWrapStyleWord(true);
		jTextAreanombreTipoFuente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFuente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFuente = new JScrollPane(jTextAreanombreTipoFuente);
		jscrollPanenombreTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFuenteBusqueda= new JButtonMe();
		this.jButtonnombreTipoFuenteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFuenteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFuenteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFuenteBusqueda.setText("U");
		this.jButtonnombreTipoFuenteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFuenteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFuenteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFuente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFuente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFuenteBusqueda"));

		if(this.tipofuenteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFuenteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFuente() {
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
		//this.jInternalFrameDetalleTipoFuente = new TipoFuenteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Fuente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFuente= new GridBagLayout();
		

		
		String sToolTipTipoFuente="";
		sToolTipTipoFuente=TipoFuenteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFuente+="(Seguridad.TipoFuente)";
		}
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFuente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFuente = new JButtonMe();
		this.jButtonModificarTipoFuente = new JButtonMe();
        this.jButtonActualizarTipoFuente = new JButtonMe();
        this.jButtonEliminarTipoFuente = new JButtonMe();
        this.jButtonCancelarTipoFuente = new JButtonMe();
        this.jButtonGuardarCambiosTipoFuente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFuente = new JButtonMe();
		this.jButtonCerrarTipoFuente = new JButtonMe();
		
		this.jScrollPanelDatosTipoFuente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFuente = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFuente = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Fuente";
		
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fuentes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFuente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFuente.setName("jPanelCamposTipoFuente"); 

		this.jPanelCamposOcultosTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFuente.setName("jPanelCamposOcultosTipoFuente"); 

        this.jPanelAccionesTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFuente.setToolTipText("Acciones");
        this.jPanelAccionesTipoFuente.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFuente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFuente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFuente.setText("Nuevo");
		this.jButtonModificarTipoFuente.setText("Editar");
        this.jButtonActualizarTipoFuente.setText("Actualizar");
        this.jButtonEliminarTipoFuente.setText("Eliminar");
        this.jButtonCancelarTipoFuente.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFuente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFuente.setText("Guardar");
		this.jButtonCerrarTipoFuente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFuente,"nuevo_button","Nuevo",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFuente,"modificar_button","Editar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFuente,"actualizar_button","Actualizar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFuente,"eliminar_button","Eliminar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFuente,"cancelar_button","Cancelar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFuente,"guardarcambios_button","Guardar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFuente,"guardarcambiostabla_button","Guardar",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFuente,"cerrar_button","Salir",this.tipofuenteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFuente.setToolTipText("Nuevo"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFuente.setToolTipText("Editar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFuente.setToolTipText("Actualizar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFuente.setToolTipText("Eliminar)"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFuente.setToolTipText("Cancelar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFuente.setToolTipText("Guardar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFuente.setToolTipText("Guardar"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFuente.setToolTipText("Salir"+" "+TipoFuenteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFuente";
		inputMap = this.jButtonNuevoTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFuente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFuente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFuente";
		inputMap = this.jButtonActualizarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFuente"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFuente";
		inputMap = this.jButtonEliminarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFuente"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFuente";
		inputMap = this.jButtonCancelarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFuente"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFuente";
		inputMap = this.jButtonCerrarTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFuente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFuente";
		inputMap = this.jButtonGuardarCambiosTablaTipoFuente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFuente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFuente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFuente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFuente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFuente.setToolTipText("Nuevo TipoFuente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFuente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFuente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFuente.setToolTipText("Sin Cerrar Ventana TipoFuente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFuente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFuente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFuente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFuente.setText("Accion");
		this.jComboBoxTiposAccionesTipoFuente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFuente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFuente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFuente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFuente = new JLabelMe();
		
		this.jLabelAccionesTipoFuente.setText("Acciones");		
		this.jLabelAccionesTipoFuente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFuente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFuente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFuente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFuente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFuente=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFuente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFuente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFuente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFuente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFuente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFuente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFuente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFuente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFuente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFuente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFuente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFuente = new GridBagLayout();
		
		this.jPanelCamposTipoFuente.setLayout(gridaBagLayoutCamposTipoFuente);
		this.jPanelCamposOcultosTipoFuente.setLayout(gridaBagLayoutCamposOcultosTipoFuente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFuente.gridy = 0;
	this.gridBagConstraintsTipoFuente.gridx = 0;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFuente.add(jLabelIdTipoFuente, this.gridBagConstraintsTipoFuente);



	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFuente.gridy = 0;
	this.gridBagConstraintsTipoFuente.gridx = 1;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFuente.add(jTextFieldidTipoFuente, this.gridBagConstraintsTipoFuente);


	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFuente.gridy = 0;
	this.gridBagConstraintsTipoFuente.gridx = 0;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoFuente.add(jLabelcodigoTipoFuente, this.gridBagConstraintsTipoFuente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		//this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = 0;
		this.gridBagConstraintsTipoFuente.gridx = 2;
		this.gridBagConstraintsTipoFuente.ipadx = 0;
		this.gridBagConstraintsTipoFuente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoFuente.add(jButtoncodigoTipoFuenteBusqueda, this.gridBagConstraintsTipoFuente);
	}

	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFuente.gridy = 0;
	this.gridBagConstraintsTipoFuente.gridx = 1;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoFuente.add(jTextFieldcodigoTipoFuente, this.gridBagConstraintsTipoFuente);


	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFuente.gridy = 0;
	this.gridBagConstraintsTipoFuente.gridx = 0;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFuente.add(jLabelnombreTipoFuente, this.gridBagConstraintsTipoFuente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		//this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFuente.gridy = 0;
		this.gridBagConstraintsTipoFuente.gridx = 2;
		this.gridBagConstraintsTipoFuente.ipadx = 0;
		this.gridBagConstraintsTipoFuente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFuente.add(jButtonnombreTipoFuenteBusqueda, this.gridBagConstraintsTipoFuente);
	}

	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFuente.gridy = 0;
	this.gridBagConstraintsTipoFuente.gridx = 1;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFuente.add(jscrollPanenombreTipoFuente, this.gridBagConstraintsTipoFuente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFuente.gridy = iYPanelCamposTipoFuente;
	this.gridBagConstraintsTipoFuente.gridx = iXPanelCamposTipoFuente++;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFuente.add(this.jPanelidTipoFuente, this.gridBagConstraintsTipoFuente);



	if(iXPanelCamposTipoFuente % 1==0) {
		iXPanelCamposTipoFuente=0;
		iYPanelCamposTipoFuente++;
	}
	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFuente.gridy = iYPanelCamposTipoFuente;
	this.gridBagConstraintsTipoFuente.gridx = iXPanelCamposTipoFuente++;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFuente.add(this.jPanelcodigoTipoFuente, this.gridBagConstraintsTipoFuente);



	if(iXPanelCamposTipoFuente % 1==0) {
		iXPanelCamposTipoFuente=0;
		iYPanelCamposTipoFuente++;
	}
	this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFuente.gridy = iYPanelCamposTipoFuente;
	this.gridBagConstraintsTipoFuente.gridx = iXPanelCamposTipoFuente++;
	this.gridBagConstraintsTipoFuente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFuente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFuente.add(this.jPanelnombreTipoFuente, this.gridBagConstraintsTipoFuente);



	if(iXPanelCamposTipoFuente % 1==0) {
		iXPanelCamposTipoFuente=0;
		iYPanelCamposTipoFuente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFuente= new GridBagLayout();
		this.jPanelAccionesTipoFuente.setLayout(gridaBagLayoutAccionesTipoFuente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFuente= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFuente.setLayout(gridaBagLayoutAccionesFormularioTipoFuente);
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFuente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFuente.add(this.jComboBoxTiposAccionesFormularioTipoFuente, this.gridBagConstraintsTipoFuente);

		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFuente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFuente.add(this.jCheckBoxPostAccionNuevoTipoFuente, this.gridBagConstraintsTipoFuente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipofuenteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFuente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFuente.add(this.jCheckBoxPostAccionSinCerrarTipoFuente, this.gridBagConstraintsTipoFuente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipofuenteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipofuenteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFuente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFuente.add(this.jCheckBoxPostAccionSinMensajeTipoFuente, this.gridBagConstraintsTipoFuente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = 0;
		this.gridBagConstraintsTipoFuente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFuente.add(this.jButtonModificarTipoFuente, this.gridBagConstraintsTipoFuente);							

		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFuente.gridy = 0;
		this.gridBagConstraintsTipoFuente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFuente.add(this.jButtonEliminarTipoFuente, this.gridBagConstraintsTipoFuente);
		
			
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = 0;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFuente.add(this.jButtonActualizarTipoFuente, this.gridBagConstraintsTipoFuente);


		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = 0;		
		this.gridBagConstraintsTipoFuente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFuente.add(this.jButtonGuardarCambiosTipoFuente, this.gridBagConstraintsTipoFuente);	
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = 0;		
		this.gridBagConstraintsTipoFuente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFuente.add(this.jButtonCancelarTipoFuente, this.gridBagConstraintsTipoFuente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFuente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFuente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofuenteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();						
			this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFuente.gridx = 0;		
			//this.gridBagConstraintsTipoFuente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFuente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFuente.gridx =0;
		this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFuente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFuente, this.gridBagConstraintsTipoFuente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFuenteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFuente = new TipoFuenteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Fuente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Fuente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Fuente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFuenteModel tipofuenteModel=new TipoFuenteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFuenteModel.TipoFuenteFocusTraversalPolicy tipofuenteFocusTraversalPolicy = tipofuenteModel.new TipoFuenteFocusTraversalPolicy(this);
			
			//tipofuenteFocusTraversalPolicy.settipofuenteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipofuenteModel);
			
			
			this.jContentPaneDetalleTipoFuente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFuente = new GridBagLayout();	
			this.jContentPaneDetalleTipoFuente.setLayout(gridaBagLayoutDetalleTipoFuente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFuente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFuente = new GridBagConstraints();
				this.gridBagConstraintsTipoFuente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFuente.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFuente.add(jTtoolBarDetalleTipoFuente, gridBagConstraintsTipoFuente);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFuente=   new JScrollPane(jContentPaneDetalleTipoFuente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFuente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFuente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFuente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFuente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFuente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFuente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFuente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFuente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFuente.gridx = 0;
	        
			this.jContentPaneDetalleTipoFuente.add(jPanelCamposTipoFuente, gridBagConstraintsTipoFuente);
			
			
			
			
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
						&& tipofuenteSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipofuenteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFuente= new GridBagConstraints();
						this.gridBagConstraintsTipoFuente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFuente.gridx = 0;
						this.jContentPaneDetalleTipoFuente.add(this.jTabbedPaneRelacionesTipoFuente, this.gridBagConstraintsTipoFuente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFuente.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFuente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFuente = new GridBagConstraints();
					this.gridBagConstraintsTipoFuente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFuente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFuente.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFuente.add(jPanelCamposOcultosTipoFuente, gridBagConstraintsTipoFuente);
				
					this.jPanelCamposOcultosTipoFuente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoFuente.gridx = 0;
	        this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFuente.add(this.jPanelAccionesFormularioTipoFuente, this.gridBagConstraintsTipoFuente);							
			
			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
	        this.gridBagConstraintsTipoFuente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoFuente.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFuente.add(this.jPanelAccionesTipoFuente, this.gridBagConstraintsTipoFuente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFuente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFuente=   new JScrollPane(this.jPanelCamposTipoFuente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFuente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFuente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFuente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFuente.gridx = 0;
			this.gridBagConstraintsTipoFuente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFuente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFuente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFuente, this.gridBagConstraintsTipoFuente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFuente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFuente, this.gridBagConstraintsTipoFuente);			
			
			this.gridBagConstraintsTipoFuente = new GridBagConstraints();
			this.gridBagConstraintsTipoFuente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFuente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFuente, this.gridBagConstraintsTipoFuente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFuente, this.gridBagConstraintsTipoFuente);
			
			
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFuente, this.gridBagConstraintsTipoFuente);
		
			
		this.gridBagConstraintsTipoFuente = new GridBagConstraints();
		this.gridBagConstraintsTipoFuente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFuente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFuente, this.gridBagConstraintsTipoFuente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFuente;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFuente;
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
