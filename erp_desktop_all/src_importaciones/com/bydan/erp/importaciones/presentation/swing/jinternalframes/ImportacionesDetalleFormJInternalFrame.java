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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;



import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ImportacionesConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ImportacionesDetalleFormJInternalFrame extends ImportacionesBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleImportaciones;
	
	protected JMenuBar jmenuBarDetalleImportaciones;
	
	protected JMenu jmenuDetalleImportaciones;
	protected JMenu jmenuDetalleArchivoImportaciones;
	protected JMenu jmenuDetalleAccionesImportaciones;
	protected JMenu jmenuDetalleDatosImportaciones;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutImportaciones;	
	protected GridBagConstraints gridBagConstraintsImportaciones;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ImportacionesBeanSwingJInternalFrameAdditional jInternalFrameDetalleImportaciones;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ImportacionesSessionBean importacionesSessionBean;
	
	
	
		
	
	public ImportacionesLogic importacionesLogic;
	
	public JScrollPane jScrollPanelDatosImportaciones;
	public JScrollPane jScrollPanelDatosEdicionImportaciones;
	public JScrollPane jScrollPanelDatosGeneralImportaciones;
	
	protected JPanel jPanelCamposImportaciones;    
	protected JPanel jPanelCamposOcultosImportaciones;    	
	protected JPanel jPanelAccionesImportaciones;
	protected JPanel jPanelAccionesFormularioImportaciones;
    
	
	
	protected Integer iXPanelCamposImportaciones=0;
	protected Integer iYPanelCamposImportaciones=0;
	
	protected Integer iXPanelCamposOcultosImportaciones=0;
	protected Integer iYPanelCamposOcultosImportaciones=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoImportaciones;
	public JButton jButtonModificarImportaciones;
	public JButton jButtonActualizarImportaciones;
    public JButton jButtonEliminarImportaciones;
	public JButton jButtonCancelarImportaciones;
    public JButton jButtonGuardarCambiosImportaciones;
	public JButton jButtonGuardarCambiosTablaImportaciones;
	protected JButton jButtonCerrarImportaciones;
	
	
	protected JButton jButtonProcesarInformacionImportaciones;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoImportaciones;
	protected JCheckBox jCheckBoxPostAccionSinCerrarImportaciones;
	protected JCheckBox jCheckBoxPostAccionSinMensajeImportaciones;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarImportaciones;
	protected JButton jButtonModificarToolBarImportaciones;
	protected JButton jButtonActualizarToolBarImportaciones;
    protected JButton jButtonEliminarToolBarImportaciones;
	protected JButton jButtonCancelarToolBarImportaciones;
    protected JButton jButtonGuardarCambiosToolBarImportaciones;
	protected JButton jButtonGuardarCambiosTablaToolBarImportaciones;
	protected JButton jButtonMostrarOcultarTablaToolBarImportaciones;
	protected JButton jButtonCerrarToolBarImportaciones;
	
	protected JButton jButtonProcesarInformacionToolBarImportaciones;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoImportaciones;
	protected JMenuItem jMenuItemModificarImportaciones;
	protected JMenuItem jMenuItemActualizarImportaciones;
    protected JMenuItem jMenuItemEliminarImportaciones;
	protected JMenuItem jMenuItemCancelarImportaciones;
    protected JMenuItem jMenuItemGuardarCambiosImportaciones;
	protected JMenuItem jMenuItemGuardarCambiosTablaImportaciones;
	protected JMenuItem jMenuItemCerrarImportaciones;
	protected JMenuItem jMenuItemDetalleCerrarImportaciones;
	protected JMenuItem jMenuItemDetalleMostarOcultarImportaciones;
	
	protected JMenuItem jMenuItemProcesarInformacionImportaciones;
	protected JMenuItem jMenuItemNuevoGuardarCambiosImportaciones;
	protected JMenuItem jMenuItemMostrarOcultarImportaciones;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesImportaciones;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesImportaciones;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesImportaciones;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioImportaciones;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidImportaciones;
	public JLabel jLabelIdImportaciones;
	public JLabel jLabelidImportaciones;
	public JButton jButtonidImportacionesBusqueda= new JButtonMe();

	public JPanel jPanelcodigoImportaciones;
	public JLabel jLabelcodigoImportaciones;
	public JTextField jTextFieldcodigoImportaciones;
	public JButton jButtoncodigoImportacionesBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesImportaciones;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ImportacionesDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposImportaciones=new JPanel();
				this.jPanelAccionesFormularioImportaciones=new JPanel();
				this.jmenuBarDetalleImportaciones=new JMenuBar();
				this.jTtoolBarDetalleImportaciones=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ImportacionesDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ImportacionesDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Importaciones No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarImportaciones() {
		return this.jButtonActualizarToolBarImportaciones;
	}
	
	public JButton getjButtonEliminarToolBarImportaciones() {
		return this.jButtonEliminarToolBarImportaciones;
	}
	
	public JButton getjButtonCancelarToolBarImportaciones() {
		return this.jButtonCancelarToolBarImportaciones;
	}		
	
	public JButton getjButtonProcesarInformacionImportaciones() {
		return this.jButtonProcesarInformacionImportaciones;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionImportaciones)	{
		this.jButtonProcesarInformacionImportaciones = jButtonProcesarInformacionImportaciones;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesImportaciones() {
		return this.jComboBoxTiposAccionesImportaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesImportaciones(
			JComboBox jComboBoxTiposRelacionesImportaciones) {
		this.jComboBoxTiposRelacionesImportaciones = jComboBoxTiposRelacionesImportaciones;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesImportaciones(
			JComboBox jComboBoxTiposAccionesImportaciones) {
		this.jComboBoxTiposAccionesImportaciones = jComboBoxTiposAccionesImportaciones;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioImportaciones() {
		return this.jComboBoxTiposAccionesFormularioImportaciones;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioImportaciones(
			JComboBox jComboBoxTiposAccionesFormularioImportaciones) {
		this.jComboBoxTiposAccionesFormularioImportaciones = jComboBoxTiposAccionesFormularioImportaciones;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.importacionesSessionBean=new ImportacionesSessionBean();
		
		this.importacionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.importacionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.importacionesSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ImportacionesJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ImportacionesJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ImportacionesJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Importaciones MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
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
	
		ImportacionesJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleImportaciones= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarImportaciones=new JButtonMe();
				this.jButtonModificarToolBarImportaciones=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarImportaciones,this.jTtoolBarDetalleImportaciones,
							"actualizar","actualizar","Actualizar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarImportaciones,this.jTtoolBarDetalleImportaciones,
							"eliminar","eliminar","Eliminar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarImportaciones,this.jTtoolBarDetalleImportaciones,
							"cancelar","cancelar","Cancelar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarImportaciones=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarImportaciones,this.jTtoolBarDetalleImportaciones,
							"guardarcambios","guardarcambios","Guardar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleImportaciones=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleImportaciones=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoImportaciones=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesImportaciones=new JMenuMe("Acciones");
		this.jmenuDetalleDatosImportaciones=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoImportaciones= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoImportaciones.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoImportaciones,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarImportaciones= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarImportaciones.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarImportaciones,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarImportaciones= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarImportaciones.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarImportaciones,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarImportaciones= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarImportaciones.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarImportaciones,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarImportaciones= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarImportaciones.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarImportaciones,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosImportaciones= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosImportaciones.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosImportaciones,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarImportaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarImportaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarImportaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarImportaciones= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarImportaciones.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarImportaciones,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarImportaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarImportaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarImportaciones,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarImportaciones= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarImportaciones.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarImportaciones,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoImportaciones.add(this.jMenuItemDetalleCerrarImportaciones);
		
		this.jmenuDetalleAccionesImportaciones.add(this.jMenuItemActualizarImportaciones);
		this.jmenuDetalleAccionesImportaciones.add(this.jMenuItemEliminarImportaciones);
		this.jmenuDetalleAccionesImportaciones.add(this.jMenuItemCancelarImportaciones);		
		
		//this.jmenuDetalleDatosImportaciones.add(this.jMenuItemDetalleAbrirOrderByImportaciones);				
		this.jmenuDetalleDatosImportaciones.add(this.jMenuItemDetalleMostarOcultarImportaciones);				
				
		//this.jmenuDetalleAccionesImportaciones.add(this.jMenuItemGuardarCambiosImportaciones);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleImportaciones.add(this.jmenuDetalleArchivoImportaciones);		
		this.jmenuBarDetalleImportaciones.add(this.jmenuDetalleAccionesImportaciones);		
		this.jmenuBarDetalleImportaciones.add(this.jmenuDetalleDatosImportaciones);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleImportaciones);				
	}
	
	
	public void inicializarElementosCamposImportaciones() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdImportaciones = new JLabelMe();
		jLabelIdImportaciones.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidImportaciones = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidImportaciones.setToolTipText(ImportacionesConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutImportaciones= new GridBagLayout();

		this.jPanelidImportaciones.setLayout(this.gridaBagLayoutImportaciones);

		jLabelidImportaciones = new JLabel();
		jLabelidImportaciones.setText("Id");

		jLabelidImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoImportaciones = new JLabelMe();
		this.jLabelcodigoImportaciones.setText(""+ImportacionesConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoImportaciones.setToolTipText("Codigo");
		this.jLabelcodigoImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoImportaciones=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoImportaciones.setToolTipText(ImportacionesConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutImportaciones = new GridBagLayout();
		this.jPanelcodigoImportaciones.setLayout(this.gridaBagLayoutImportaciones);


		jTextFieldcodigoImportaciones= new JTextFieldMe();

		jTextFieldcodigoImportaciones.setEnabled(false);
		jTextFieldcodigoImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoImportacionesBusqueda= new JButtonMe();
		this.jButtoncodigoImportacionesBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoImportacionesBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoImportacionesBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoImportacionesBusqueda.setText("U");
		this.jButtoncodigoImportacionesBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoImportacionesBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoImportacionesBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoImportaciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoImportaciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoImportacionesBusqueda"));

		if(this.importacionesSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoImportacionesBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysImportaciones() {
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
		//this.jInternalFrameDetalleImportaciones = new ImportacionesBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Importaciones DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutImportaciones= new GridBagLayout();
		

		
		String sToolTipImportaciones="";
		sToolTipImportaciones=ImportacionesConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipImportaciones+="(Importaciones.Importaciones)";
		}
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			sToolTipImportaciones+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoImportaciones = new JButtonMe();
		this.jButtonModificarImportaciones = new JButtonMe();
        this.jButtonActualizarImportaciones = new JButtonMe();
        this.jButtonEliminarImportaciones = new JButtonMe();
        this.jButtonCancelarImportaciones = new JButtonMe();
        this.jButtonGuardarCambiosImportaciones = new JButtonMe();
		this.jButtonGuardarCambiosTablaImportaciones = new JButtonMe();
		this.jButtonCerrarImportaciones = new JButtonMe();
		
		this.jScrollPanelDatosImportaciones = new JScrollPane();   
        this.jScrollPanelDatosEdicionImportaciones = new JScrollPane();
		this.jScrollPanelDatosGeneralImportaciones = new JScrollPane();
				
		
		
		this.jPanelCamposImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Importaciones";
		
		if(!this.importacionesSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Importacioneses" + this.sPath));
		} else {
			this.jScrollPanelDatosImportaciones.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposImportaciones.setName("jPanelCamposImportaciones"); 

		this.jPanelCamposOcultosImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosImportaciones.setName("jPanelCamposOcultosImportaciones"); 

        this.jPanelAccionesImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesImportaciones.setToolTipText("Acciones");
        this.jPanelAccionesImportaciones.setName("Acciones"); 

		this.jPanelAccionesFormularioImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioImportaciones.setToolTipText("Acciones");
        this.jPanelAccionesFormularioImportaciones.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoImportaciones.setText("Nuevo");
		this.jButtonModificarImportaciones.setText("Editar");
        this.jButtonActualizarImportaciones.setText("Actualizar");
        this.jButtonEliminarImportaciones.setText("Eliminar");
        this.jButtonCancelarImportaciones.setText("Cancelar");
        this.jButtonGuardarCambiosImportaciones.setText("Guardar");
		this.jButtonGuardarCambiosTablaImportaciones.setText("Guardar");
		this.jButtonCerrarImportaciones.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoImportaciones,"nuevo_button","Nuevo",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarImportaciones,"modificar_button","Editar",this.importacionesSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarImportaciones,"actualizar_button","Actualizar",this.importacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarImportaciones,"eliminar_button","Eliminar",this.importacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarImportaciones,"cancelar_button","Cancelar",this.importacionesSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosImportaciones,"guardarcambios_button","Guardar",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaImportaciones,"guardarcambiostabla_button","Guardar",this.importacionesSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportaciones,"cerrar_button","Salir",this.importacionesSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoImportaciones.setToolTipText("Nuevo"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarImportaciones.setToolTipText("Editar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarImportaciones.setToolTipText("Actualizar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarImportaciones.setToolTipText("Eliminar)"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarImportaciones.setToolTipText("Cancelar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosImportaciones.setToolTipText("Guardar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaImportaciones.setToolTipText("Guardar"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarImportaciones.setToolTipText("Salir"+" "+ImportacionesConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoImportaciones";
		inputMap = this.jButtonNuevoImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoImportaciones.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoImportaciones"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarImportaciones";
		inputMap = this.jButtonActualizarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarImportaciones"));
		
		//ELIMINAR
		sMapKey = "EliminarImportaciones";
		inputMap = this.jButtonEliminarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarImportaciones"));
		
		//CANCELAR	
		sMapKey = "CancelarImportaciones";
		inputMap = this.jButtonCancelarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarImportaciones"));
		
		//CERRAR		
		sMapKey = "CerrarImportaciones";
		inputMap = this.jButtonCerrarImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarImportaciones"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaImportaciones";
		inputMap = this.jButtonGuardarCambiosTablaImportaciones.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaImportaciones.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaImportaciones"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoImportaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoImportaciones.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoImportaciones.setToolTipText("Nuevo Importaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarImportaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarImportaciones.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarImportaciones.setToolTipText("Sin Cerrar Ventana Importaciones");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeImportaciones = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeImportaciones.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeImportaciones.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesImportaciones.setText("Accion");
		this.jComboBoxTiposAccionesImportaciones.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioImportaciones = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioImportaciones.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioImportaciones.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesImportaciones = new JLabelMe();
		
		this.jLabelAccionesImportaciones.setText("Acciones");		
		this.jLabelAccionesImportaciones.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportaciones.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesImportaciones.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposImportaciones();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysImportaciones();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesImportaciones=new JTabbedPane();
		this.jTabbedPaneRelacionesImportaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesImportaciones,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesImportaciones.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportaciones.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesImportaciones.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesImportaciones, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioImportaciones.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImportaciones.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioImportaciones.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioImportaciones, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposImportaciones = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosImportaciones = new GridBagLayout();
		
		this.jPanelCamposImportaciones.setLayout(gridaBagLayoutCamposImportaciones);
		this.jPanelCamposOcultosImportaciones.setLayout(gridaBagLayoutCamposOcultosImportaciones);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsImportaciones = new GridBagConstraints();
	this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportaciones.gridy = 0;
	this.gridBagConstraintsImportaciones.gridx = 0;
	this.gridBagConstraintsImportaciones.ipadx = 0;
	this.gridBagConstraintsImportaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidImportaciones.add(jLabelIdImportaciones, this.gridBagConstraintsImportaciones);



	this.gridBagConstraintsImportaciones = new GridBagConstraints();
	this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportaciones.gridy = 0;
	this.gridBagConstraintsImportaciones.gridx = 1;
	this.gridBagConstraintsImportaciones.ipadx = 0;
	this.gridBagConstraintsImportaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidImportaciones.add(jLabelidImportaciones, this.gridBagConstraintsImportaciones);


	this.gridBagConstraintsImportaciones = new GridBagConstraints();
	this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportaciones.gridy = 0;
	this.gridBagConstraintsImportaciones.gridx = 0;
	this.gridBagConstraintsImportaciones.ipadx = 0;
	this.gridBagConstraintsImportaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoImportaciones.add(jLabelcodigoImportaciones, this.gridBagConstraintsImportaciones);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		//this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsImportaciones.gridy = 0;
		this.gridBagConstraintsImportaciones.gridx = 2;
		this.gridBagConstraintsImportaciones.ipadx = 0;
		this.gridBagConstraintsImportaciones.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoImportaciones.add(jButtoncodigoImportacionesBusqueda, this.gridBagConstraintsImportaciones);
	}

	this.gridBagConstraintsImportaciones = new GridBagConstraints();
	this.gridBagConstraintsImportaciones.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsImportaciones.gridy = 0;
	this.gridBagConstraintsImportaciones.gridx = 1;
	this.gridBagConstraintsImportaciones.ipadx = 0;
	this.gridBagConstraintsImportaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoImportaciones.add(jTextFieldcodigoImportaciones, this.gridBagConstraintsImportaciones);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsImportaciones = new GridBagConstraints();
	this.gridBagConstraintsImportaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportaciones.gridy = iYPanelCamposImportaciones;
	this.gridBagConstraintsImportaciones.gridx = iXPanelCamposImportaciones++;
	this.gridBagConstraintsImportaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImportaciones.add(this.jPanelidImportaciones, this.gridBagConstraintsImportaciones);



	if(iXPanelCamposImportaciones % 1==0) {
		iXPanelCamposImportaciones=0;
		iYPanelCamposImportaciones++;
	}
	this.gridBagConstraintsImportaciones = new GridBagConstraints();
	this.gridBagConstraintsImportaciones.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsImportaciones.gridy = iYPanelCamposImportaciones;
	this.gridBagConstraintsImportaciones.gridx = iXPanelCamposImportaciones++;
	this.gridBagConstraintsImportaciones.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsImportaciones.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposImportaciones.add(this.jPanelcodigoImportaciones, this.gridBagConstraintsImportaciones);



	if(iXPanelCamposImportaciones % 1==0) {
		iXPanelCamposImportaciones=0;
		iYPanelCamposImportaciones++;
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
			
		GridBagLayout gridaBagLayoutAccionesImportaciones= new GridBagLayout();
		this.jPanelAccionesImportaciones.setLayout(gridaBagLayoutAccionesImportaciones);
		
		GridBagLayout gridaBagLayoutAccionesFormularioImportaciones= new GridBagLayout();
		this.jPanelAccionesFormularioImportaciones.setLayout(gridaBagLayoutAccionesFormularioImportaciones);
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsImportaciones.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioImportaciones.add(this.jComboBoxTiposAccionesFormularioImportaciones, this.gridBagConstraintsImportaciones);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = 0;
		this.gridBagConstraintsImportaciones.gridx = iPosXAccion++;
			
		this.jPanelAccionesImportaciones.add(this.jButtonModificarImportaciones, this.gridBagConstraintsImportaciones);							

		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsImportaciones.gridy = 0;
		this.gridBagConstraintsImportaciones.gridx =iPosXAccion++;
			
		this.jPanelAccionesImportaciones.add(this.jButtonEliminarImportaciones, this.gridBagConstraintsImportaciones);
		
			
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = 0;		
		this.gridBagConstraintsImportaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesImportaciones.add(this.jButtonActualizarImportaciones, this.gridBagConstraintsImportaciones);


		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = 0;		
		this.gridBagConstraintsImportaciones.gridx = iPosXAccion++;
		
		this.jPanelAccionesImportaciones.add(this.jButtonGuardarCambiosImportaciones, this.gridBagConstraintsImportaciones);	
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = 0;		
		this.gridBagConstraintsImportaciones.gridx =iPosXAccion++;
		
		this.jPanelAccionesImportaciones.add(this.jButtonCancelarImportaciones, this.gridBagConstraintsImportaciones);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutImportaciones = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutImportaciones);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.importacionesSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsImportaciones = new GridBagConstraints();						
			this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;
			this.gridBagConstraintsImportaciones.gridx = 0;		
			//this.gridBagConstraintsImportaciones.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsImportaciones.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy =iGridyPrincipal++;
		this.gridBagConstraintsImportaciones.gridx =0;
		this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsImportaciones.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosImportaciones, this.gridBagConstraintsImportaciones);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ImportacionesJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleImportaciones = new ImportacionesBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Importaciones DATOS");
			
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
			
	        //this.setTitle("[FOR] - Importaciones DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Importaciones Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ImportacionesModel importacionesModel=new ImportacionesModel(this);
			
			//SI USARA CLASE INTERNA
			//ImportacionesModel.ImportacionesFocusTraversalPolicy importacionesFocusTraversalPolicy = importacionesModel.new ImportacionesFocusTraversalPolicy(this);
			
			//importacionesFocusTraversalPolicy.setimportacionesJInternalFrame(this);
			
			this.setFocusTraversalPolicy(importacionesModel);
			
			
			this.jContentPaneDetalleImportaciones = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleImportaciones = new GridBagLayout();	
			this.jContentPaneDetalleImportaciones.setLayout(gridaBagLayoutDetalleImportaciones);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosImportaciones = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsImportaciones = new GridBagConstraints();
				this.gridBagConstraintsImportaciones.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsImportaciones.gridx = 0;
					
				
				this.jContentPaneDetalleImportaciones.add(jTtoolBarDetalleImportaciones, gridBagConstraintsImportaciones);								
				
}
			
			this.jScrollPanelDatosEdicionImportaciones=   new JScrollPane(jContentPaneDetalleImportaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImportaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralImportaciones=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralImportaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralImportaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			
			
	        this.gridBagConstraintsImportaciones.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsImportaciones.gridx = 0;
	        
			this.jContentPaneDetalleImportaciones.add(jPanelCamposImportaciones, gridBagConstraintsImportaciones);
			
			
			
			
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
						&& importacionesSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.importacionesSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsImportaciones= new GridBagConstraints();
						this.gridBagConstraintsImportaciones.gridy = iGridyRelaciones++;
						this.gridBagConstraintsImportaciones.gridx = 0;
						this.jContentPaneDetalleImportaciones.add(this.jTabbedPaneRelacionesImportaciones, this.gridBagConstraintsImportaciones);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesImportaciones.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosImportaciones.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsImportaciones = new GridBagConstraints();
					this.gridBagConstraintsImportaciones.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsImportaciones.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsImportaciones.gridx = 0;
					
				
					this.jContentPaneDetalleImportaciones.add(jPanelCamposOcultosImportaciones, gridBagConstraintsImportaciones);
				
					this.jPanelCamposOcultosImportaciones.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsImportaciones.gridx = 0;
	        this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleImportaciones.add(this.jPanelAccionesFormularioImportaciones, this.gridBagConstraintsImportaciones);							
			
			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
	        this.gridBagConstraintsImportaciones.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsImportaciones.gridx = 0;
	        
			
			this.jContentPaneDetalleImportaciones.add(this.jPanelAccionesImportaciones, this.gridBagConstraintsImportaciones);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionImportaciones);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionImportaciones=   new JScrollPane(this.jPanelCamposImportaciones,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionImportaciones.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportaciones.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionImportaciones.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsImportaciones.gridx = 0;
			this.gridBagConstraintsImportaciones.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsImportaciones.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsImportaciones.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionImportaciones, this.gridBagConstraintsImportaciones);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImportaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioImportaciones, this.gridBagConstraintsImportaciones);			
			
			this.gridBagConstraintsImportaciones = new GridBagConstraints();
			this.gridBagConstraintsImportaciones.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsImportaciones.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesImportaciones, this.gridBagConstraintsImportaciones);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposImportaciones, this.gridBagConstraintsImportaciones);
			
			
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosImportaciones, this.gridBagConstraintsImportaciones);
		
			
		this.gridBagConstraintsImportaciones = new GridBagConstraints();
		this.gridBagConstraintsImportaciones.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsImportaciones.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesImportaciones, this.gridBagConstraintsImportaciones);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralImportaciones;//jContentPane;
		
		return jScrollPanelDatosEdicionImportaciones;
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
