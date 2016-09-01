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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ContabilidadConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ContabilidadDetalleFormJInternalFrame extends ContabilidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleContabilidad;
	
	protected JMenuBar jmenuBarDetalleContabilidad;
	
	protected JMenu jmenuDetalleContabilidad;
	protected JMenu jmenuDetalleArchivoContabilidad;
	protected JMenu jmenuDetalleAccionesContabilidad;
	protected JMenu jmenuDetalleDatosContabilidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContabilidad;	
	protected GridBagConstraints gridBagConstraintsContabilidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ContabilidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleContabilidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ContabilidadSessionBean contabilidadSessionBean;
	
	
	
		
	
	public ContabilidadLogic contabilidadLogic;
	
	public JScrollPane jScrollPanelDatosContabilidad;
	public JScrollPane jScrollPanelDatosEdicionContabilidad;
	public JScrollPane jScrollPanelDatosGeneralContabilidad;
	
	protected JPanel jPanelCamposContabilidad;    
	protected JPanel jPanelCamposOcultosContabilidad;    	
	protected JPanel jPanelAccionesContabilidad;
	protected JPanel jPanelAccionesFormularioContabilidad;
    
	
	
	protected Integer iXPanelCamposContabilidad=0;
	protected Integer iYPanelCamposContabilidad=0;
	
	protected Integer iXPanelCamposOcultosContabilidad=0;
	protected Integer iYPanelCamposOcultosContabilidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoContabilidad;
	public JButton jButtonModificarContabilidad;
	public JButton jButtonActualizarContabilidad;
    public JButton jButtonEliminarContabilidad;
	public JButton jButtonCancelarContabilidad;
    public JButton jButtonGuardarCambiosContabilidad;
	public JButton jButtonGuardarCambiosTablaContabilidad;
	protected JButton jButtonCerrarContabilidad;
	
	
	protected JButton jButtonProcesarInformacionContabilidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoContabilidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarContabilidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeContabilidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContabilidad;
	protected JButton jButtonModificarToolBarContabilidad;
	protected JButton jButtonActualizarToolBarContabilidad;
    protected JButton jButtonEliminarToolBarContabilidad;
	protected JButton jButtonCancelarToolBarContabilidad;
    protected JButton jButtonGuardarCambiosToolBarContabilidad;
	protected JButton jButtonGuardarCambiosTablaToolBarContabilidad;
	protected JButton jButtonMostrarOcultarTablaToolBarContabilidad;
	protected JButton jButtonCerrarToolBarContabilidad;
	
	protected JButton jButtonProcesarInformacionToolBarContabilidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContabilidad;
	protected JMenuItem jMenuItemModificarContabilidad;
	protected JMenuItem jMenuItemActualizarContabilidad;
    protected JMenuItem jMenuItemEliminarContabilidad;
	protected JMenuItem jMenuItemCancelarContabilidad;
    protected JMenuItem jMenuItemGuardarCambiosContabilidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaContabilidad;
	protected JMenuItem jMenuItemCerrarContabilidad;
	protected JMenuItem jMenuItemDetalleCerrarContabilidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarContabilidad;
	
	protected JMenuItem jMenuItemProcesarInformacionContabilidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContabilidad;
	protected JMenuItem jMenuItemMostrarOcultarContabilidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContabilidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContabilidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContabilidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioContabilidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidContabilidad;
	public JLabel jLabelIdContabilidad;
	public JTextFieldMe jTextFieldidContabilidad;
	public JButton jButtonidContabilidadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoContabilidad;
	public JLabel jLabelcodigoContabilidad;
	public JTextField jTextFieldcodigoContabilidad;
	public JButton jButtoncodigoContabilidadBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesContabilidad;
	
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
	
	public ContabilidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposContabilidad=new JPanel();
				this.jPanelAccionesFormularioContabilidad=new JPanel();
				this.jmenuBarDetalleContabilidad=new JMenuBar();
				this.jTtoolBarDetalleContabilidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ContabilidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContabilidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Contabilidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarContabilidad() {
		return this.jButtonActualizarToolBarContabilidad;
	}
	
	public JButton getjButtonEliminarToolBarContabilidad() {
		return this.jButtonEliminarToolBarContabilidad;
	}
	
	public JButton getjButtonCancelarToolBarContabilidad() {
		return this.jButtonCancelarToolBarContabilidad;
	}		
	
	public JButton getjButtonProcesarInformacionContabilidad() {
		return this.jButtonProcesarInformacionContabilidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContabilidad)	{
		this.jButtonProcesarInformacionContabilidad = jButtonProcesarInformacionContabilidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContabilidad() {
		return this.jComboBoxTiposAccionesContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContabilidad(
			JComboBox jComboBoxTiposRelacionesContabilidad) {
		this.jComboBoxTiposRelacionesContabilidad = jComboBoxTiposRelacionesContabilidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContabilidad(
			JComboBox jComboBoxTiposAccionesContabilidad) {
		this.jComboBoxTiposAccionesContabilidad = jComboBoxTiposAccionesContabilidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioContabilidad() {
		return this.jComboBoxTiposAccionesFormularioContabilidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioContabilidad(
			JComboBox jComboBoxTiposAccionesFormularioContabilidad) {
		this.jComboBoxTiposAccionesFormularioContabilidad = jComboBoxTiposAccionesFormularioContabilidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.contabilidadSessionBean=new ContabilidadSessionBean();
		
		this.contabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.contabilidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContabilidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContabilidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Contabilidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
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
	
		ContabilidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleContabilidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarContabilidad=new JButtonMe();
				this.jButtonModificarToolBarContabilidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarContabilidad,this.jTtoolBarDetalleContabilidad,
							"actualizar","actualizar","Actualizar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarContabilidad,this.jTtoolBarDetalleContabilidad,
							"eliminar","eliminar","Eliminar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarContabilidad,this.jTtoolBarDetalleContabilidad,
							"cancelar","cancelar","Cancelar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarContabilidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarContabilidad,this.jTtoolBarDetalleContabilidad,
							"guardarcambios","guardarcambios","Guardar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleContabilidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleContabilidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoContabilidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesContabilidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosContabilidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContabilidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContabilidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContabilidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarContabilidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarContabilidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarContabilidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarContabilidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarContabilidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarContabilidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarContabilidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarContabilidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarContabilidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarContabilidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarContabilidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarContabilidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosContabilidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContabilidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContabilidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContabilidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContabilidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContabilidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarContabilidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarContabilidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarContabilidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContabilidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContabilidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContabilidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoContabilidad.add(this.jMenuItemDetalleCerrarContabilidad);
		
		this.jmenuDetalleAccionesContabilidad.add(this.jMenuItemActualizarContabilidad);
		this.jmenuDetalleAccionesContabilidad.add(this.jMenuItemEliminarContabilidad);
		this.jmenuDetalleAccionesContabilidad.add(this.jMenuItemCancelarContabilidad);		
		
		//this.jmenuDetalleDatosContabilidad.add(this.jMenuItemDetalleAbrirOrderByContabilidad);				
		this.jmenuDetalleDatosContabilidad.add(this.jMenuItemDetalleMostarOcultarContabilidad);				
				
		//this.jmenuDetalleAccionesContabilidad.add(this.jMenuItemGuardarCambiosContabilidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleContabilidad.add(this.jmenuDetalleArchivoContabilidad);		
		this.jmenuBarDetalleContabilidad.add(this.jmenuDetalleAccionesContabilidad);		
		this.jmenuBarDetalleContabilidad.add(this.jmenuDetalleDatosContabilidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleContabilidad);				
	}
	
	
	public void inicializarElementosCamposContabilidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdContabilidad = new JLabelMe();
		jLabelIdContabilidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidContabilidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidContabilidad.setToolTipText(ContabilidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutContabilidad= new GridBagLayout();

		this.jPanelidContabilidad.setLayout(this.gridaBagLayoutContabilidad);

		jTextFieldidContabilidad = new JTextFieldMe();
		jTextFieldidContabilidad.setText("Id");

		jTextFieldidContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoContabilidad = new JLabelMe();
		this.jLabelcodigoContabilidad.setText(""+ContabilidadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoContabilidad.setToolTipText("Codigo");
		this.jLabelcodigoContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoContabilidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoContabilidad.setToolTipText(ContabilidadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutContabilidad = new GridBagLayout();
		this.jPanelcodigoContabilidad.setLayout(this.gridaBagLayoutContabilidad);


		jTextFieldcodigoContabilidad= new JTextFieldMe();

		jTextFieldcodigoContabilidad.setEnabled(false);
		jTextFieldcodigoContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoContabilidadBusqueda= new JButtonMe();
		this.jButtoncodigoContabilidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoContabilidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoContabilidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoContabilidadBusqueda.setText("U");
		this.jButtoncodigoContabilidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoContabilidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoContabilidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoContabilidadBusqueda"));

		if(this.contabilidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoContabilidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysContabilidad() {
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
		//this.jInternalFrameDetalleContabilidad = new ContabilidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Contabilidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContabilidad= new GridBagLayout();
		

		
		String sToolTipContabilidad="";
		sToolTipContabilidad=ContabilidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContabilidad+="(Contabilidad.Contabilidad)";
		}
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipContabilidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoContabilidad = new JButtonMe();
		this.jButtonModificarContabilidad = new JButtonMe();
        this.jButtonActualizarContabilidad = new JButtonMe();
        this.jButtonEliminarContabilidad = new JButtonMe();
        this.jButtonCancelarContabilidad = new JButtonMe();
        this.jButtonGuardarCambiosContabilidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaContabilidad = new JButtonMe();
		this.jButtonCerrarContabilidad = new JButtonMe();
		
		this.jScrollPanelDatosContabilidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionContabilidad = new JScrollPane();
		this.jScrollPanelDatosGeneralContabilidad = new JScrollPane();
				
		
		
		this.jPanelCamposContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Contabilidad";
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contabilidads" + this.sPath));
		} else {
			this.jScrollPanelDatosContabilidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposContabilidad.setName("jPanelCamposContabilidad"); 

		this.jPanelCamposOcultosContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosContabilidad.setName("jPanelCamposOcultosContabilidad"); 

        this.jPanelAccionesContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContabilidad.setToolTipText("Acciones");
        this.jPanelAccionesContabilidad.setName("Acciones"); 

		this.jPanelAccionesFormularioContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioContabilidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioContabilidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoContabilidad.setText("Nuevo");
		this.jButtonModificarContabilidad.setText("Editar");
        this.jButtonActualizarContabilidad.setText("Actualizar");
        this.jButtonEliminarContabilidad.setText("Eliminar");
        this.jButtonCancelarContabilidad.setText("Cancelar");
        this.jButtonGuardarCambiosContabilidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaContabilidad.setText("Guardar");
		this.jButtonCerrarContabilidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContabilidad,"nuevo_button","Nuevo",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarContabilidad,"modificar_button","Editar",this.contabilidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarContabilidad,"actualizar_button","Actualizar",this.contabilidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarContabilidad,"eliminar_button","Eliminar",this.contabilidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarContabilidad,"cancelar_button","Cancelar",this.contabilidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosContabilidad,"guardarcambios_button","Guardar",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContabilidad,"guardarcambiostabla_button","Guardar",this.contabilidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContabilidad,"cerrar_button","Salir",this.contabilidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoContabilidad.setToolTipText("Nuevo"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarContabilidad.setToolTipText("Editar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarContabilidad.setToolTipText("Actualizar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarContabilidad.setToolTipText("Eliminar)"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarContabilidad.setToolTipText("Cancelar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosContabilidad.setToolTipText("Guardar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaContabilidad.setToolTipText("Guardar"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContabilidad.setToolTipText("Salir"+" "+ContabilidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContabilidad";
		inputMap = this.jButtonNuevoContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContabilidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContabilidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarContabilidad";
		inputMap = this.jButtonActualizarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarContabilidad"));
		
		//ELIMINAR
		sMapKey = "EliminarContabilidad";
		inputMap = this.jButtonEliminarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarContabilidad"));
		
		//CANCELAR	
		sMapKey = "CancelarContabilidad";
		inputMap = this.jButtonCancelarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarContabilidad"));
		
		//CERRAR		
		sMapKey = "CerrarContabilidad";
		inputMap = this.jButtonCerrarContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContabilidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContabilidad";
		inputMap = this.jButtonGuardarCambiosTablaContabilidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContabilidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContabilidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoContabilidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoContabilidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoContabilidad.setToolTipText("Nuevo Contabilidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarContabilidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarContabilidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarContabilidad.setToolTipText("Sin Cerrar Ventana Contabilidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeContabilidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeContabilidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeContabilidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContabilidad.setText("Accion");
		this.jComboBoxTiposAccionesContabilidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioContabilidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioContabilidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioContabilidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesContabilidad = new JLabelMe();
		
		this.jLabelAccionesContabilidad.setText("Acciones");		
		this.jLabelAccionesContabilidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContabilidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContabilidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposContabilidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysContabilidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesContabilidad=new JTabbedPane();
		this.jTabbedPaneRelacionesContabilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesContabilidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesContabilidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContabilidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContabilidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContabilidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioContabilidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContabilidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContabilidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioContabilidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposContabilidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosContabilidad = new GridBagLayout();
		
		this.jPanelCamposContabilidad.setLayout(gridaBagLayoutCamposContabilidad);
		this.jPanelCamposOcultosContabilidad.setLayout(gridaBagLayoutCamposOcultosContabilidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsContabilidad = new GridBagConstraints();
	this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContabilidad.gridy = 0;
	this.gridBagConstraintsContabilidad.gridx = 0;
	this.gridBagConstraintsContabilidad.ipadx = 0;
	this.gridBagConstraintsContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidContabilidad.add(jLabelIdContabilidad, this.gridBagConstraintsContabilidad);



	this.gridBagConstraintsContabilidad = new GridBagConstraints();
	this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContabilidad.gridy = 0;
	this.gridBagConstraintsContabilidad.gridx = 1;
	this.gridBagConstraintsContabilidad.ipadx = 0;
	this.gridBagConstraintsContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidContabilidad.add(jTextFieldidContabilidad, this.gridBagConstraintsContabilidad);


	this.gridBagConstraintsContabilidad = new GridBagConstraints();
	this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContabilidad.gridy = 0;
	this.gridBagConstraintsContabilidad.gridx = 0;
	this.gridBagConstraintsContabilidad.ipadx = 0;
	this.gridBagConstraintsContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoContabilidad.add(jLabelcodigoContabilidad, this.gridBagConstraintsContabilidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		//this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContabilidad.gridy = 0;
		this.gridBagConstraintsContabilidad.gridx = 2;
		this.gridBagConstraintsContabilidad.ipadx = 0;
		this.gridBagConstraintsContabilidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoContabilidad.add(jButtoncodigoContabilidadBusqueda, this.gridBagConstraintsContabilidad);
	}

	this.gridBagConstraintsContabilidad = new GridBagConstraints();
	this.gridBagConstraintsContabilidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContabilidad.gridy = 0;
	this.gridBagConstraintsContabilidad.gridx = 1;
	this.gridBagConstraintsContabilidad.ipadx = 0;
	this.gridBagConstraintsContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoContabilidad.add(jTextFieldcodigoContabilidad, this.gridBagConstraintsContabilidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsContabilidad = new GridBagConstraints();
	this.gridBagConstraintsContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContabilidad.gridy = iYPanelCamposContabilidad;
	this.gridBagConstraintsContabilidad.gridx = iXPanelCamposContabilidad++;
	this.gridBagConstraintsContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContabilidad.add(this.jPanelidContabilidad, this.gridBagConstraintsContabilidad);



	if(iXPanelCamposContabilidad % 1==0) {
		iXPanelCamposContabilidad=0;
		iYPanelCamposContabilidad++;
	}
	this.gridBagConstraintsContabilidad = new GridBagConstraints();
	this.gridBagConstraintsContabilidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContabilidad.gridy = iYPanelCamposContabilidad;
	this.gridBagConstraintsContabilidad.gridx = iXPanelCamposContabilidad++;
	this.gridBagConstraintsContabilidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContabilidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContabilidad.add(this.jPanelcodigoContabilidad, this.gridBagConstraintsContabilidad);



	if(iXPanelCamposContabilidad % 1==0) {
		iXPanelCamposContabilidad=0;
		iYPanelCamposContabilidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesContabilidad= new GridBagLayout();
		this.jPanelAccionesContabilidad.setLayout(gridaBagLayoutAccionesContabilidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioContabilidad= new GridBagLayout();
		this.jPanelAccionesFormularioContabilidad.setLayout(gridaBagLayoutAccionesFormularioContabilidad);
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContabilidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContabilidad.add(this.jComboBoxTiposAccionesFormularioContabilidad, this.gridBagConstraintsContabilidad);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = 0;
		this.gridBagConstraintsContabilidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesContabilidad.add(this.jButtonModificarContabilidad, this.gridBagConstraintsContabilidad);							

		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContabilidad.gridy = 0;
		this.gridBagConstraintsContabilidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesContabilidad.add(this.jButtonEliminarContabilidad, this.gridBagConstraintsContabilidad);
		
			
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = 0;		
		this.gridBagConstraintsContabilidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesContabilidad.add(this.jButtonActualizarContabilidad, this.gridBagConstraintsContabilidad);


		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = 0;		
		this.gridBagConstraintsContabilidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesContabilidad.add(this.jButtonGuardarCambiosContabilidad, this.gridBagConstraintsContabilidad);	
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = 0;		
		this.gridBagConstraintsContabilidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesContabilidad.add(this.jButtonCancelarContabilidad, this.gridBagConstraintsContabilidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContabilidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContabilidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContabilidad = new GridBagConstraints();						
			this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContabilidad.gridx = 0;		
			//this.gridBagConstraintsContabilidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContabilidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContabilidad.gridx =0;
		this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContabilidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContabilidad, this.gridBagConstraintsContabilidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleContabilidad = new ContabilidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Contabilidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Contabilidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Contabilidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ContabilidadModel contabilidadModel=new ContabilidadModel(this);
			
			//SI USARA CLASE INTERNA
			//ContabilidadModel.ContabilidadFocusTraversalPolicy contabilidadFocusTraversalPolicy = contabilidadModel.new ContabilidadFocusTraversalPolicy(this);
			
			//contabilidadFocusTraversalPolicy.setcontabilidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(contabilidadModel);
			
			
			this.jContentPaneDetalleContabilidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleContabilidad = new GridBagLayout();	
			this.jContentPaneDetalleContabilidad.setLayout(gridaBagLayoutDetalleContabilidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContabilidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsContabilidad = new GridBagConstraints();
				this.gridBagConstraintsContabilidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsContabilidad.gridx = 0;
					
				
				this.jContentPaneDetalleContabilidad.add(jTtoolBarDetalleContabilidad, gridBagConstraintsContabilidad);								
				
}
			
			this.jScrollPanelDatosEdicionContabilidad=   new JScrollPane(jContentPaneDetalleContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralContabilidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsContabilidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsContabilidad.gridx = 0;
	        
			this.jContentPaneDetalleContabilidad.add(jPanelCamposContabilidad, gridBagConstraintsContabilidad);
			
			
			
			
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
						&& contabilidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsContabilidad= new GridBagConstraints();
						this.gridBagConstraintsContabilidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsContabilidad.gridx = 0;
						this.jContentPaneDetalleContabilidad.add(this.jTabbedPaneRelacionesContabilidad, this.gridBagConstraintsContabilidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesContabilidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosContabilidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsContabilidad = new GridBagConstraints();
					this.gridBagConstraintsContabilidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsContabilidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsContabilidad.gridx = 0;
					
				
					this.jContentPaneDetalleContabilidad.add(jPanelCamposOcultosContabilidad, gridBagConstraintsContabilidad);
				
					this.jPanelCamposOcultosContabilidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsContabilidad.gridx = 0;
	        this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleContabilidad.add(this.jPanelAccionesFormularioContabilidad, this.gridBagConstraintsContabilidad);							
			
			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
	        this.gridBagConstraintsContabilidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsContabilidad.gridx = 0;
	        
			
			this.jContentPaneDetalleContabilidad.add(this.jPanelAccionesContabilidad, this.gridBagConstraintsContabilidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionContabilidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionContabilidad=   new JScrollPane(this.jPanelCamposContabilidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContabilidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContabilidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContabilidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsContabilidad.gridx = 0;
			this.gridBagConstraintsContabilidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsContabilidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsContabilidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionContabilidad, this.gridBagConstraintsContabilidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContabilidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioContabilidad, this.gridBagConstraintsContabilidad);			
			
			this.gridBagConstraintsContabilidad = new GridBagConstraints();
			this.gridBagConstraintsContabilidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContabilidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesContabilidad, this.gridBagConstraintsContabilidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContabilidad, this.gridBagConstraintsContabilidad);
			
			
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContabilidad, this.gridBagConstraintsContabilidad);
		
			
		this.gridBagConstraintsContabilidad = new GridBagConstraints();
		this.gridBagConstraintsContabilidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContabilidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContabilidad, this.gridBagConstraintsContabilidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralContabilidad;//jContentPane;
		
		return jScrollPanelDatosEdicionContabilidad;
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
