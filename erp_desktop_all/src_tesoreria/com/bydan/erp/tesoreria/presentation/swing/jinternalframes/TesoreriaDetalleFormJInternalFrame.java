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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TesoreriaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TesoreriaDetalleFormJInternalFrame extends TesoreriaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTesoreria;
	
	protected JMenuBar jmenuBarDetalleTesoreria;
	
	protected JMenu jmenuDetalleTesoreria;
	protected JMenu jmenuDetalleArchivoTesoreria;
	protected JMenu jmenuDetalleAccionesTesoreria;
	protected JMenu jmenuDetalleDatosTesoreria;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTesoreria;	
	protected GridBagConstraints gridBagConstraintsTesoreria;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TesoreriaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTesoreria;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TesoreriaSessionBean tesoreriaSessionBean;
	
	
	
		
	
	public TesoreriaLogic tesoreriaLogic;
	
	public JScrollPane jScrollPanelDatosTesoreria;
	public JScrollPane jScrollPanelDatosEdicionTesoreria;
	public JScrollPane jScrollPanelDatosGeneralTesoreria;
	
	protected JPanel jPanelCamposTesoreria;    
	protected JPanel jPanelCamposOcultosTesoreria;    	
	protected JPanel jPanelAccionesTesoreria;
	protected JPanel jPanelAccionesFormularioTesoreria;
    
	
	
	protected Integer iXPanelCamposTesoreria=0;
	protected Integer iYPanelCamposTesoreria=0;
	
	protected Integer iXPanelCamposOcultosTesoreria=0;
	protected Integer iYPanelCamposOcultosTesoreria=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTesoreria;
	public JButton jButtonModificarTesoreria;
	public JButton jButtonActualizarTesoreria;
    public JButton jButtonEliminarTesoreria;
	public JButton jButtonCancelarTesoreria;
    public JButton jButtonGuardarCambiosTesoreria;
	public JButton jButtonGuardarCambiosTablaTesoreria;
	protected JButton jButtonCerrarTesoreria;
	
	
	protected JButton jButtonProcesarInformacionTesoreria;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTesoreria;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTesoreria;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTesoreria;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTesoreria;
	protected JButton jButtonModificarToolBarTesoreria;
	protected JButton jButtonActualizarToolBarTesoreria;
    protected JButton jButtonEliminarToolBarTesoreria;
	protected JButton jButtonCancelarToolBarTesoreria;
    protected JButton jButtonGuardarCambiosToolBarTesoreria;
	protected JButton jButtonGuardarCambiosTablaToolBarTesoreria;
	protected JButton jButtonMostrarOcultarTablaToolBarTesoreria;
	protected JButton jButtonCerrarToolBarTesoreria;
	
	protected JButton jButtonProcesarInformacionToolBarTesoreria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTesoreria;
	protected JMenuItem jMenuItemModificarTesoreria;
	protected JMenuItem jMenuItemActualizarTesoreria;
    protected JMenuItem jMenuItemEliminarTesoreria;
	protected JMenuItem jMenuItemCancelarTesoreria;
    protected JMenuItem jMenuItemGuardarCambiosTesoreria;
	protected JMenuItem jMenuItemGuardarCambiosTablaTesoreria;
	protected JMenuItem jMenuItemCerrarTesoreria;
	protected JMenuItem jMenuItemDetalleCerrarTesoreria;
	protected JMenuItem jMenuItemDetalleMostarOcultarTesoreria;
	
	protected JMenuItem jMenuItemProcesarInformacionTesoreria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTesoreria;
	protected JMenuItem jMenuItemMostrarOcultarTesoreria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTesoreria;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTesoreria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTesoreria;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTesoreria;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTesoreria;
	public JLabel jLabelIdTesoreria;
	public JLabel jLabelidTesoreria;
	public JButton jButtonidTesoreriaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTesoreria;
	public JLabel jLabelcodigoTesoreria;
	public JTextField jTextFieldcodigoTesoreria;
	public JButton jButtoncodigoTesoreriaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTesoreria;
	
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
	
	public TesoreriaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTesoreria=new JPanel();
				this.jPanelAccionesFormularioTesoreria=new JPanel();
				this.jmenuBarDetalleTesoreria=new JMenuBar();
				this.jTtoolBarDetalleTesoreria=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TesoreriaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TesoreriaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Tesoreria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTesoreria() {
		return this.jButtonActualizarToolBarTesoreria;
	}
	
	public JButton getjButtonEliminarToolBarTesoreria() {
		return this.jButtonEliminarToolBarTesoreria;
	}
	
	public JButton getjButtonCancelarToolBarTesoreria() {
		return this.jButtonCancelarToolBarTesoreria;
	}		
	
	public JButton getjButtonProcesarInformacionTesoreria() {
		return this.jButtonProcesarInformacionTesoreria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTesoreria)	{
		this.jButtonProcesarInformacionTesoreria = jButtonProcesarInformacionTesoreria;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTesoreria() {
		return this.jComboBoxTiposAccionesTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTesoreria(
			JComboBox jComboBoxTiposRelacionesTesoreria) {
		this.jComboBoxTiposRelacionesTesoreria = jComboBoxTiposRelacionesTesoreria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTesoreria(
			JComboBox jComboBoxTiposAccionesTesoreria) {
		this.jComboBoxTiposAccionesTesoreria = jComboBoxTiposAccionesTesoreria;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTesoreria() {
		return this.jComboBoxTiposAccionesFormularioTesoreria;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTesoreria(
			JComboBox jComboBoxTiposAccionesFormularioTesoreria) {
		this.jComboBoxTiposAccionesFormularioTesoreria = jComboBoxTiposAccionesFormularioTesoreria;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tesoreriaSessionBean=new TesoreriaSessionBean();
		
		this.tesoreriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tesoreriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tesoreriaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TesoreriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TesoreriaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tesoreria MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
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
	
		TesoreriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTesoreria= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTesoreria=new JButtonMe();
				this.jButtonModificarToolBarTesoreria=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTesoreria,this.jTtoolBarDetalleTesoreria,
							"actualizar","actualizar","Actualizar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTesoreria,this.jTtoolBarDetalleTesoreria,
							"eliminar","eliminar","Eliminar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTesoreria,this.jTtoolBarDetalleTesoreria,
							"cancelar","cancelar","Cancelar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTesoreria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTesoreria,this.jTtoolBarDetalleTesoreria,
							"guardarcambios","guardarcambios","Guardar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTesoreria=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTesoreria=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTesoreria=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTesoreria=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTesoreria=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTesoreria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTesoreria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTesoreria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTesoreria= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTesoreria.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTesoreria,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTesoreria= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTesoreria.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTesoreria,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTesoreria= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTesoreria.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTesoreria,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTesoreria= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTesoreria.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTesoreria,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTesoreria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTesoreria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTesoreria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTesoreria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTesoreria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTesoreria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTesoreria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTesoreria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTesoreria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTesoreria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTesoreria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTesoreria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTesoreria.add(this.jMenuItemDetalleCerrarTesoreria);
		
		this.jmenuDetalleAccionesTesoreria.add(this.jMenuItemActualizarTesoreria);
		this.jmenuDetalleAccionesTesoreria.add(this.jMenuItemEliminarTesoreria);
		this.jmenuDetalleAccionesTesoreria.add(this.jMenuItemCancelarTesoreria);		
		
		//this.jmenuDetalleDatosTesoreria.add(this.jMenuItemDetalleAbrirOrderByTesoreria);				
		this.jmenuDetalleDatosTesoreria.add(this.jMenuItemDetalleMostarOcultarTesoreria);				
				
		//this.jmenuDetalleAccionesTesoreria.add(this.jMenuItemGuardarCambiosTesoreria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTesoreria.add(this.jmenuDetalleArchivoTesoreria);		
		this.jmenuBarDetalleTesoreria.add(this.jmenuDetalleAccionesTesoreria);		
		this.jmenuBarDetalleTesoreria.add(this.jmenuDetalleDatosTesoreria);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTesoreria);				
	}
	
	
	public void inicializarElementosCamposTesoreria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTesoreria = new JLabelMe();
		jLabelIdTesoreria.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTesoreria = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTesoreria.setToolTipText(TesoreriaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTesoreria= new GridBagLayout();

		this.jPanelidTesoreria.setLayout(this.gridaBagLayoutTesoreria);

		jLabelidTesoreria = new JLabel();
		jLabelidTesoreria.setText("Id");

		jLabelidTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTesoreria = new JLabelMe();
		this.jLabelcodigoTesoreria.setText(""+TesoreriaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTesoreria.setToolTipText("Codigo");
		this.jLabelcodigoTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTesoreria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTesoreria.setToolTipText(TesoreriaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTesoreria = new GridBagLayout();
		this.jPanelcodigoTesoreria.setLayout(this.gridaBagLayoutTesoreria);


		jTextFieldcodigoTesoreria= new JTextFieldMe();

		jTextFieldcodigoTesoreria.setEnabled(false);
		jTextFieldcodigoTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTesoreriaBusqueda= new JButtonMe();
		this.jButtoncodigoTesoreriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTesoreriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTesoreriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTesoreriaBusqueda.setText("U");
		this.jButtoncodigoTesoreriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTesoreriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTesoreriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTesoreria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTesoreria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTesoreriaBusqueda"));

		if(this.tesoreriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTesoreriaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTesoreria() {
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
		//this.jInternalFrameDetalleTesoreria = new TesoreriaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tesoreria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTesoreria= new GridBagLayout();
		

		
		String sToolTipTesoreria="";
		sToolTipTesoreria=TesoreriaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTesoreria+="(Tesoreria.Tesoreria)";
		}
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTesoreria+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTesoreria = new JButtonMe();
		this.jButtonModificarTesoreria = new JButtonMe();
        this.jButtonActualizarTesoreria = new JButtonMe();
        this.jButtonEliminarTesoreria = new JButtonMe();
        this.jButtonCancelarTesoreria = new JButtonMe();
        this.jButtonGuardarCambiosTesoreria = new JButtonMe();
		this.jButtonGuardarCambiosTablaTesoreria = new JButtonMe();
		this.jButtonCerrarTesoreria = new JButtonMe();
		
		this.jScrollPanelDatosTesoreria = new JScrollPane();   
        this.jScrollPanelDatosEdicionTesoreria = new JScrollPane();
		this.jScrollPanelDatosGeneralTesoreria = new JScrollPane();
				
		
		
		this.jPanelCamposTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tesoreria";
		
		if(!this.tesoreriaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tesorerias" + this.sPath));
		} else {
			this.jScrollPanelDatosTesoreria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTesoreria.setName("jPanelCamposTesoreria"); 

		this.jPanelCamposOcultosTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTesoreria.setName("jPanelCamposOcultosTesoreria"); 

        this.jPanelAccionesTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTesoreria.setToolTipText("Acciones");
        this.jPanelAccionesTesoreria.setName("Acciones"); 

		this.jPanelAccionesFormularioTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTesoreria.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTesoreria.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTesoreria.setText("Nuevo");
		this.jButtonModificarTesoreria.setText("Editar");
        this.jButtonActualizarTesoreria.setText("Actualizar");
        this.jButtonEliminarTesoreria.setText("Eliminar");
        this.jButtonCancelarTesoreria.setText("Cancelar");
        this.jButtonGuardarCambiosTesoreria.setText("Guardar");
		this.jButtonGuardarCambiosTablaTesoreria.setText("Guardar");
		this.jButtonCerrarTesoreria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTesoreria,"nuevo_button","Nuevo",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTesoreria,"modificar_button","Editar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTesoreria,"actualizar_button","Actualizar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTesoreria,"eliminar_button","Eliminar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTesoreria,"cancelar_button","Cancelar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTesoreria,"guardarcambios_button","Guardar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTesoreria,"guardarcambiostabla_button","Guardar",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTesoreria,"cerrar_button","Salir",this.tesoreriaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTesoreria.setToolTipText("Nuevo"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTesoreria.setToolTipText("Editar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTesoreria.setToolTipText("Actualizar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTesoreria.setToolTipText("Eliminar)"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTesoreria.setToolTipText("Cancelar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTesoreria.setToolTipText("Guardar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTesoreria.setToolTipText("Guardar"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTesoreria.setToolTipText("Salir"+" "+TesoreriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTesoreria";
		inputMap = this.jButtonNuevoTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTesoreria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTesoreria"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTesoreria";
		inputMap = this.jButtonActualizarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTesoreria"));
		
		//ELIMINAR
		sMapKey = "EliminarTesoreria";
		inputMap = this.jButtonEliminarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTesoreria"));
		
		//CANCELAR	
		sMapKey = "CancelarTesoreria";
		inputMap = this.jButtonCancelarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTesoreria"));
		
		//CERRAR		
		sMapKey = "CerrarTesoreria";
		inputMap = this.jButtonCerrarTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTesoreria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTesoreria";
		inputMap = this.jButtonGuardarCambiosTablaTesoreria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTesoreria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTesoreria"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTesoreria = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTesoreria.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTesoreria.setToolTipText("Nuevo Tesoreria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTesoreria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTesoreria.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTesoreria.setToolTipText("Sin Cerrar Ventana Tesoreria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTesoreria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTesoreria.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTesoreria.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTesoreria.setText("Accion");
		this.jComboBoxTiposAccionesTesoreria.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTesoreria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTesoreria.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTesoreria.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTesoreria = new JLabelMe();
		
		this.jLabelAccionesTesoreria.setText("Acciones");		
		this.jLabelAccionesTesoreria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTesoreria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTesoreria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTesoreria();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTesoreria();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTesoreria=new JTabbedPane();
		this.jTabbedPaneRelacionesTesoreria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTesoreria,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTesoreria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTesoreria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTesoreria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTesoreria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTesoreria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTesoreria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTesoreria.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTesoreria, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTesoreria = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTesoreria = new GridBagLayout();
		
		this.jPanelCamposTesoreria.setLayout(gridaBagLayoutCamposTesoreria);
		this.jPanelCamposOcultosTesoreria.setLayout(gridaBagLayoutCamposOcultosTesoreria);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTesoreria = new GridBagConstraints();
	this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTesoreria.gridy = 0;
	this.gridBagConstraintsTesoreria.gridx = 0;
	this.gridBagConstraintsTesoreria.ipadx = 0;
	this.gridBagConstraintsTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTesoreria.add(jLabelIdTesoreria, this.gridBagConstraintsTesoreria);



	this.gridBagConstraintsTesoreria = new GridBagConstraints();
	this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTesoreria.gridy = 0;
	this.gridBagConstraintsTesoreria.gridx = 1;
	this.gridBagConstraintsTesoreria.ipadx = 0;
	this.gridBagConstraintsTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTesoreria.add(jLabelidTesoreria, this.gridBagConstraintsTesoreria);


	this.gridBagConstraintsTesoreria = new GridBagConstraints();
	this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTesoreria.gridy = 0;
	this.gridBagConstraintsTesoreria.gridx = 0;
	this.gridBagConstraintsTesoreria.ipadx = 0;
	this.gridBagConstraintsTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTesoreria.add(jLabelcodigoTesoreria, this.gridBagConstraintsTesoreria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		//this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTesoreria.gridy = 0;
		this.gridBagConstraintsTesoreria.gridx = 2;
		this.gridBagConstraintsTesoreria.ipadx = 0;
		this.gridBagConstraintsTesoreria.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTesoreria.add(jButtoncodigoTesoreriaBusqueda, this.gridBagConstraintsTesoreria);
	}

	this.gridBagConstraintsTesoreria = new GridBagConstraints();
	this.gridBagConstraintsTesoreria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTesoreria.gridy = 0;
	this.gridBagConstraintsTesoreria.gridx = 1;
	this.gridBagConstraintsTesoreria.ipadx = 0;
	this.gridBagConstraintsTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTesoreria.add(jTextFieldcodigoTesoreria, this.gridBagConstraintsTesoreria);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTesoreria = new GridBagConstraints();
	this.gridBagConstraintsTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTesoreria.gridy = iYPanelCamposTesoreria;
	this.gridBagConstraintsTesoreria.gridx = iXPanelCamposTesoreria++;
	this.gridBagConstraintsTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTesoreria.add(this.jPanelidTesoreria, this.gridBagConstraintsTesoreria);



	if(iXPanelCamposTesoreria % 1==0) {
		iXPanelCamposTesoreria=0;
		iYPanelCamposTesoreria++;
	}
	this.gridBagConstraintsTesoreria = new GridBagConstraints();
	this.gridBagConstraintsTesoreria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTesoreria.gridy = iYPanelCamposTesoreria;
	this.gridBagConstraintsTesoreria.gridx = iXPanelCamposTesoreria++;
	this.gridBagConstraintsTesoreria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTesoreria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTesoreria.add(this.jPanelcodigoTesoreria, this.gridBagConstraintsTesoreria);



	if(iXPanelCamposTesoreria % 1==0) {
		iXPanelCamposTesoreria=0;
		iYPanelCamposTesoreria++;
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
			
		GridBagLayout gridaBagLayoutAccionesTesoreria= new GridBagLayout();
		this.jPanelAccionesTesoreria.setLayout(gridaBagLayoutAccionesTesoreria);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTesoreria= new GridBagLayout();
		this.jPanelAccionesFormularioTesoreria.setLayout(gridaBagLayoutAccionesFormularioTesoreria);
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTesoreria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTesoreria.add(this.jComboBoxTiposAccionesFormularioTesoreria, this.gridBagConstraintsTesoreria);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = 0;
		this.gridBagConstraintsTesoreria.gridx = iPosXAccion++;
			
		this.jPanelAccionesTesoreria.add(this.jButtonModificarTesoreria, this.gridBagConstraintsTesoreria);							

		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTesoreria.gridy = 0;
		this.gridBagConstraintsTesoreria.gridx =iPosXAccion++;
			
		this.jPanelAccionesTesoreria.add(this.jButtonEliminarTesoreria, this.gridBagConstraintsTesoreria);
		
			
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = 0;		
		this.gridBagConstraintsTesoreria.gridx = iPosXAccion++;
		
		this.jPanelAccionesTesoreria.add(this.jButtonActualizarTesoreria, this.gridBagConstraintsTesoreria);


		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = 0;		
		this.gridBagConstraintsTesoreria.gridx = iPosXAccion++;
		
		this.jPanelAccionesTesoreria.add(this.jButtonGuardarCambiosTesoreria, this.gridBagConstraintsTesoreria);	
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = 0;		
		this.gridBagConstraintsTesoreria.gridx =iPosXAccion++;
		
		this.jPanelAccionesTesoreria.add(this.jButtonCancelarTesoreria, this.gridBagConstraintsTesoreria);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTesoreria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTesoreria);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tesoreriaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTesoreria = new GridBagConstraints();						
			this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTesoreria.gridx = 0;		
			//this.gridBagConstraintsTesoreria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTesoreria.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTesoreria.gridx =0;
		this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTesoreria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTesoreria, this.gridBagConstraintsTesoreria);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TesoreriaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTesoreria = new TesoreriaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tesoreria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tesoreria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tesoreria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TesoreriaModel tesoreriaModel=new TesoreriaModel(this);
			
			//SI USARA CLASE INTERNA
			//TesoreriaModel.TesoreriaFocusTraversalPolicy tesoreriaFocusTraversalPolicy = tesoreriaModel.new TesoreriaFocusTraversalPolicy(this);
			
			//tesoreriaFocusTraversalPolicy.settesoreriaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tesoreriaModel);
			
			
			this.jContentPaneDetalleTesoreria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTesoreria = new GridBagLayout();	
			this.jContentPaneDetalleTesoreria.setLayout(gridaBagLayoutDetalleTesoreria);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTesoreria = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTesoreria = new GridBagConstraints();
				this.gridBagConstraintsTesoreria.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTesoreria.gridx = 0;
					
				
				this.jContentPaneDetalleTesoreria.add(jTtoolBarDetalleTesoreria, gridBagConstraintsTesoreria);								
				
}
			
			this.jScrollPanelDatosEdicionTesoreria=   new JScrollPane(jContentPaneDetalleTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTesoreria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTesoreria.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTesoreria.gridx = 0;
	        
			this.jContentPaneDetalleTesoreria.add(jPanelCamposTesoreria, gridBagConstraintsTesoreria);
			
			
			
			
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
						&& tesoreriaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tesoreriaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTesoreria= new GridBagConstraints();
						this.gridBagConstraintsTesoreria.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTesoreria.gridx = 0;
						this.jContentPaneDetalleTesoreria.add(this.jTabbedPaneRelacionesTesoreria, this.gridBagConstraintsTesoreria);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTesoreria.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTesoreria.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTesoreria = new GridBagConstraints();
					this.gridBagConstraintsTesoreria.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTesoreria.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTesoreria.gridx = 0;
					
				
					this.jContentPaneDetalleTesoreria.add(jPanelCamposOcultosTesoreria, gridBagConstraintsTesoreria);
				
					this.jPanelCamposOcultosTesoreria.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTesoreria.gridx = 0;
	        this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTesoreria.add(this.jPanelAccionesFormularioTesoreria, this.gridBagConstraintsTesoreria);							
			
			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
	        this.gridBagConstraintsTesoreria.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTesoreria.gridx = 0;
	        
			
			this.jContentPaneDetalleTesoreria.add(this.jPanelAccionesTesoreria, this.gridBagConstraintsTesoreria);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTesoreria);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTesoreria=   new JScrollPane(this.jPanelCamposTesoreria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTesoreria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTesoreria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTesoreria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTesoreria.gridx = 0;
			this.gridBagConstraintsTesoreria.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTesoreria.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTesoreria.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTesoreria, this.gridBagConstraintsTesoreria);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTesoreria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTesoreria, this.gridBagConstraintsTesoreria);			
			
			this.gridBagConstraintsTesoreria = new GridBagConstraints();
			this.gridBagConstraintsTesoreria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTesoreria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTesoreria, this.gridBagConstraintsTesoreria);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTesoreria, this.gridBagConstraintsTesoreria);
			
			
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTesoreria, this.gridBagConstraintsTesoreria);
		
			
		this.gridBagConstraintsTesoreria = new GridBagConstraints();
		this.gridBagConstraintsTesoreria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTesoreria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTesoreria, this.gridBagConstraintsTesoreria);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTesoreria;//jContentPane;
		
		return jScrollPanelDatosEdicionTesoreria;
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
