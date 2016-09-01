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
import com.bydan.erp.seguridad.util.CiudadConstantesFunciones;

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
public class CiudadDetalleFormJInternalFrame extends CiudadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCiudad;
	
	protected JMenuBar jmenuBarDetalleCiudad;
	
	protected JMenu jmenuDetalleCiudad;
	protected JMenu jmenuDetalleArchivoCiudad;
	protected JMenu jmenuDetalleAccionesCiudad;
	protected JMenu jmenuDetalleDatosCiudad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCiudad;	
	protected GridBagConstraints gridBagConstraintsCiudad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CiudadBeanSwingJInternalFrameAdditional jInternalFrameDetalleCiudad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";
	
	public CiudadSessionBean ciudadSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;
	public ProvinciaSessionBean provinciaSessionBean;	
	
	public CiudadLogic ciudadLogic;
	
	public JScrollPane jScrollPanelDatosCiudad;
	public JScrollPane jScrollPanelDatosEdicionCiudad;
	public JScrollPane jScrollPanelDatosGeneralCiudad;
	
	protected JPanel jPanelCamposCiudad;    
	protected JPanel jPanelCamposOcultosCiudad;    	
	protected JPanel jPanelAccionesCiudad;
	protected JPanel jPanelAccionesFormularioCiudad;
    
	
	
	protected Integer iXPanelCamposCiudad=0;
	protected Integer iYPanelCamposCiudad=0;
	
	protected Integer iXPanelCamposOcultosCiudad=0;
	protected Integer iYPanelCamposOcultosCiudad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCiudad;
	public JButton jButtonModificarCiudad;
	public JButton jButtonActualizarCiudad;
    public JButton jButtonEliminarCiudad;
	public JButton jButtonCancelarCiudad;
    public JButton jButtonGuardarCambiosCiudad;
	public JButton jButtonGuardarCambiosTablaCiudad;
	protected JButton jButtonCerrarCiudad;
	
	
	protected JButton jButtonProcesarInformacionCiudad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCiudad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCiudad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCiudad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCiudad;
	protected JButton jButtonModificarToolBarCiudad;
	protected JButton jButtonActualizarToolBarCiudad;
    protected JButton jButtonEliminarToolBarCiudad;
	protected JButton jButtonCancelarToolBarCiudad;
    protected JButton jButtonGuardarCambiosToolBarCiudad;
	protected JButton jButtonGuardarCambiosTablaToolBarCiudad;
	protected JButton jButtonMostrarOcultarTablaToolBarCiudad;
	protected JButton jButtonCerrarToolBarCiudad;
	
	protected JButton jButtonProcesarInformacionToolBarCiudad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCiudad;
	protected JMenuItem jMenuItemModificarCiudad;
	protected JMenuItem jMenuItemActualizarCiudad;
    protected JMenuItem jMenuItemEliminarCiudad;
	protected JMenuItem jMenuItemCancelarCiudad;
    protected JMenuItem jMenuItemGuardarCambiosCiudad;
	protected JMenuItem jMenuItemGuardarCambiosTablaCiudad;
	protected JMenuItem jMenuItemCerrarCiudad;
	protected JMenuItem jMenuItemDetalleCerrarCiudad;
	protected JMenuItem jMenuItemDetalleMostarOcultarCiudad;
	
	protected JMenuItem jMenuItemProcesarInformacionCiudad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCiudad;
	protected JMenuItem jMenuItemMostrarOcultarCiudad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCiudad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCiudad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCiudad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCiudad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCiudad;
	public JLabel jLabelIdCiudad;
	public JLabel jLabelidCiudad;
	public JButton jButtonidCiudadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCiudad;
	public JLabel jLabelcodigoCiudad;
	public JTextField jTextFieldcodigoCiudad;
	public JButton jButtoncodigoCiudadBusqueda= new JButtonMe();

	public JPanel jPanelnombreCiudad;
	public JLabel jLabelnombreCiudad;
	public JTextArea jTextAreanombreCiudad;
	public JScrollPane jscrollPanenombreCiudad;
	public JButton jButtonnombreCiudadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisCiudad;
	public JLabel jLabelid_paisCiudad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisCiudad;
	public JButton jButtonid_paisCiudad= new JButtonMe();
	public JButton jButtonid_paisCiudadUpdate= new JButtonMe();
	public JButton jButtonid_paisCiudadBusqueda= new JButtonMe();

	public JPanel jPanelid_provinciaCiudad;
	public JLabel jLabelid_provinciaCiudad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaCiudad;
	public JButton jButtonid_provinciaCiudad= new JButtonMe();
	public JButton jButtonid_provinciaCiudadUpdate= new JButtonMe();
	public JButton jButtonid_provinciaCiudadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCiudad;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CiudadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCiudad=new JPanel();
				this.jPanelAccionesFormularioCiudad=new JPanel();
				this.jmenuBarDetalleCiudad=new JMenuBar();
				this.jTtoolBarDetalleCiudad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CiudadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CiudadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Ciudad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCiudad() {
		return this.jButtonActualizarToolBarCiudad;
	}
	
	public JButton getjButtonEliminarToolBarCiudad() {
		return this.jButtonEliminarToolBarCiudad;
	}
	
	public JButton getjButtonCancelarToolBarCiudad() {
		return this.jButtonCancelarToolBarCiudad;
	}		
	
	public JButton getjButtonProcesarInformacionCiudad() {
		return this.jButtonProcesarInformacionCiudad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCiudad)	{
		this.jButtonProcesarInformacionCiudad = jButtonProcesarInformacionCiudad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCiudad() {
		return this.jComboBoxTiposAccionesCiudad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCiudad(
			JComboBox jComboBoxTiposRelacionesCiudad) {
		this.jComboBoxTiposRelacionesCiudad = jComboBoxTiposRelacionesCiudad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCiudad(
			JComboBox jComboBoxTiposAccionesCiudad) {
		this.jComboBoxTiposAccionesCiudad = jComboBoxTiposAccionesCiudad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCiudad() {
		return this.jComboBoxTiposAccionesFormularioCiudad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCiudad(
			JComboBox jComboBoxTiposAccionesFormularioCiudad) {
		this.jComboBoxTiposAccionesFormularioCiudad = jComboBoxTiposAccionesFormularioCiudad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.ciudadSessionBean=new CiudadSessionBean();
		
		this.ciudadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ciudadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.ciudadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CiudadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CiudadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CiudadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Ciudad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
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
	
		CiudadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCiudad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCiudad=new JButtonMe();
				this.jButtonModificarToolBarCiudad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCiudad,this.jTtoolBarDetalleCiudad,
							"actualizar","actualizar","Actualizar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCiudad,this.jTtoolBarDetalleCiudad,
							"eliminar","eliminar","Eliminar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCiudad,this.jTtoolBarDetalleCiudad,
							"cancelar","cancelar","Cancelar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCiudad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCiudad,this.jTtoolBarDetalleCiudad,
							"guardarcambios","guardarcambios","Guardar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCiudad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCiudad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCiudad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCiudad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCiudad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCiudad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCiudad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCiudad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCiudad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCiudad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCiudad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCiudad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCiudad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCiudad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCiudad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCiudad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCiudad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCiudad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCiudad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCiudad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCiudad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCiudad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCiudad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCiudad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCiudad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCiudad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCiudad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCiudad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCiudad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCiudad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCiudad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCiudad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCiudad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCiudad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCiudad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCiudad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCiudad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCiudad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCiudad.add(this.jMenuItemDetalleCerrarCiudad);
		
		this.jmenuDetalleAccionesCiudad.add(this.jMenuItemActualizarCiudad);
		this.jmenuDetalleAccionesCiudad.add(this.jMenuItemEliminarCiudad);
		this.jmenuDetalleAccionesCiudad.add(this.jMenuItemCancelarCiudad);		
		
		//this.jmenuDetalleDatosCiudad.add(this.jMenuItemDetalleAbrirOrderByCiudad);				
		this.jmenuDetalleDatosCiudad.add(this.jMenuItemDetalleMostarOcultarCiudad);				
				
		//this.jmenuDetalleAccionesCiudad.add(this.jMenuItemGuardarCambiosCiudad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCiudad.add(this.jmenuDetalleArchivoCiudad);		
		this.jmenuBarDetalleCiudad.add(this.jmenuDetalleAccionesCiudad);		
		this.jmenuBarDetalleCiudad.add(this.jmenuDetalleDatosCiudad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCiudad);				
	}
	
	
	public void inicializarElementosCamposCiudad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCiudad = new JLabelMe();
		jLabelIdCiudad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCiudad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCiudad.setToolTipText(CiudadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCiudad= new GridBagLayout();

		this.jPanelidCiudad.setLayout(this.gridaBagLayoutCiudad);

		jLabelidCiudad = new JLabel();
		jLabelidCiudad.setText("Id");

		jLabelidCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCiudad = new JLabelMe();
		this.jLabelcodigoCiudad.setText(""+CiudadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCiudad.setToolTipText("Codigo");
		this.jLabelcodigoCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCiudad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCiudad.setToolTipText(CiudadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCiudad = new GridBagLayout();
		this.jPanelcodigoCiudad.setLayout(this.gridaBagLayoutCiudad);


		jTextFieldcodigoCiudad= new JTextFieldMe();

		jTextFieldcodigoCiudad.setEnabled(false);
		jTextFieldcodigoCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCiudadBusqueda= new JButtonMe();
		this.jButtoncodigoCiudadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCiudadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCiudadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCiudadBusqueda.setText("U");
		this.jButtoncodigoCiudadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCiudadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCiudadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCiudadBusqueda"));

		if(this.ciudadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCiudadBusqueda.setVisible(false);		}


					
		this.jLabelnombreCiudad = new JLabelMe();
		this.jLabelnombreCiudad.setText(""+CiudadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCiudad.setToolTipText("Nombre");
		this.jLabelnombreCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCiudad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCiudad.setToolTipText(CiudadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCiudad = new GridBagLayout();
		this.jPanelnombreCiudad.setLayout(this.gridaBagLayoutCiudad);


		jTextAreanombreCiudad= new JTextAreaMe();
		jTextAreanombreCiudad.setEnabled(false);
		jTextAreanombreCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCiudad.setLineWrap(true);
		jTextAreanombreCiudad.setWrapStyleWord(true);
		jTextAreanombreCiudad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCiudad.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCiudad = new JScrollPane(jTextAreanombreCiudad);
		jscrollPanenombreCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreCiudadBusqueda= new JButtonMe();
		this.jButtonnombreCiudadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCiudadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCiudadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCiudadBusqueda.setText("U");
		this.jButtonnombreCiudadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCiudadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCiudadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCiudadBusqueda"));

		if(this.ciudadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCiudadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCiudad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisCiudad = new JLabelMe();
		this.jLabelid_paisCiudad.setText(""+CiudadConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisCiudad.setToolTipText("Pais");
		this.jLabelid_paisCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisCiudad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisCiudad.setToolTipText(CiudadConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutCiudad = new GridBagLayout();
		this.jPanelid_paisCiudad.setLayout(this.gridaBagLayoutCiudad);


		jComboBoxid_paisCiudad= new JComboBoxMe();
		jComboBoxid_paisCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisCiudad= new JButtonMe();
		this.jButtonid_paisCiudad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCiudad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCiudad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisCiudad.setText("Buscar");
		this.jButtonid_paisCiudad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisCiudad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCiudad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCiudad"));

		this.jButtonid_paisCiudadBusqueda= new JButtonMe();
		this.jButtonid_paisCiudadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCiudadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCiudadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCiudadBusqueda.setText("U");
		this.jButtonid_paisCiudadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisCiudadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCiudadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCiudadBusqueda"));

		if(this.ciudadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisCiudadBusqueda.setVisible(false);		}

		this.jButtonid_paisCiudadUpdate= new JButtonMe();
		this.jButtonid_paisCiudadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCiudadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisCiudadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisCiudadUpdate.setText("U");
		this.jButtonid_paisCiudadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisCiudadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisCiudadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisCiudadUpdate"));



					
		this.jLabelid_provinciaCiudad = new JLabelMe();
		this.jLabelid_provinciaCiudad.setText(""+CiudadConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaCiudad.setToolTipText("Provincia");
		this.jLabelid_provinciaCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaCiudad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaCiudad.setToolTipText(CiudadConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutCiudad = new GridBagLayout();
		this.jPanelid_provinciaCiudad.setLayout(this.gridaBagLayoutCiudad);


		jComboBoxid_provinciaCiudad= new JComboBoxMe();
		jComboBoxid_provinciaCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaCiudad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaCiudad= new JButtonMe();
		this.jButtonid_provinciaCiudad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCiudad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCiudad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCiudad.setText("Buscar");
		this.jButtonid_provinciaCiudad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaCiudad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCiudad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCiudad"));

		this.jButtonid_provinciaCiudadBusqueda= new JButtonMe();
		this.jButtonid_provinciaCiudadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCiudadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCiudadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCiudadBusqueda.setText("U");
		this.jButtonid_provinciaCiudadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaCiudadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCiudadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCiudadBusqueda"));

		if(this.ciudadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaCiudadBusqueda.setVisible(false);		}

		this.jButtonid_provinciaCiudadUpdate= new JButtonMe();
		this.jButtonid_provinciaCiudadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCiudadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCiudadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCiudadUpdate.setText("U");
		this.jButtonid_provinciaCiudadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaCiudadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCiudadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCiudadUpdate"));



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
		//this.jInternalFrameDetalleCiudad = new CiudadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Ciudad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCiudad= new GridBagLayout();
		

		
		String sToolTipCiudad="";
		sToolTipCiudad=CiudadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCiudad+="(Seguridad.Ciudad)";
		}
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			sToolTipCiudad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCiudad = new JButtonMe();
		this.jButtonModificarCiudad = new JButtonMe();
        this.jButtonActualizarCiudad = new JButtonMe();
        this.jButtonEliminarCiudad = new JButtonMe();
        this.jButtonCancelarCiudad = new JButtonMe();
        this.jButtonGuardarCambiosCiudad = new JButtonMe();
		this.jButtonGuardarCambiosTablaCiudad = new JButtonMe();
		this.jButtonCerrarCiudad = new JButtonMe();
		
		this.jScrollPanelDatosCiudad = new JScrollPane();   
        this.jScrollPanelDatosEdicionCiudad = new JScrollPane();
		this.jScrollPanelDatosGeneralCiudad = new JScrollPane();
				
		
		
		this.jPanelCamposCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Ciudad";
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Ciudades" + this.sPath));
		} else {
			this.jScrollPanelDatosCiudad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCiudad.setName("jPanelCamposCiudad"); 

		this.jPanelCamposOcultosCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCiudad.setName("jPanelCamposOcultosCiudad"); 

        this.jPanelAccionesCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCiudad.setToolTipText("Acciones");
        this.jPanelAccionesCiudad.setName("Acciones"); 

		this.jPanelAccionesFormularioCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCiudad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCiudad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCiudad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCiudad.setText("Nuevo");
		this.jButtonModificarCiudad.setText("Editar");
        this.jButtonActualizarCiudad.setText("Actualizar");
        this.jButtonEliminarCiudad.setText("Eliminar");
        this.jButtonCancelarCiudad.setText("Cancelar");
        this.jButtonGuardarCambiosCiudad.setText("Guardar");
		this.jButtonGuardarCambiosTablaCiudad.setText("Guardar");
		this.jButtonCerrarCiudad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCiudad,"nuevo_button","Nuevo",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCiudad,"modificar_button","Editar",this.ciudadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCiudad,"actualizar_button","Actualizar",this.ciudadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCiudad,"eliminar_button","Eliminar",this.ciudadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCiudad,"cancelar_button","Cancelar",this.ciudadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCiudad,"guardarcambios_button","Guardar",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCiudad,"guardarcambiostabla_button","Guardar",this.ciudadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCiudad,"cerrar_button","Salir",this.ciudadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCiudad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCiudad.setToolTipText("Nuevo"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCiudad.setToolTipText("Editar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCiudad.setToolTipText("Actualizar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCiudad.setToolTipText("Eliminar)"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCiudad.setToolTipText("Cancelar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCiudad.setToolTipText("Guardar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCiudad.setToolTipText("Guardar"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCiudad.setToolTipText("Salir"+" "+CiudadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCiudad";
		inputMap = this.jButtonNuevoCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCiudad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCiudad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCiudad";
		inputMap = this.jButtonActualizarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCiudad"));
		
		//ELIMINAR
		sMapKey = "EliminarCiudad";
		inputMap = this.jButtonEliminarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCiudad"));
		
		//CANCELAR	
		sMapKey = "CancelarCiudad";
		inputMap = this.jButtonCancelarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCiudad"));
		
		//CERRAR		
		sMapKey = "CerrarCiudad";
		inputMap = this.jButtonCerrarCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCiudad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCiudad";
		inputMap = this.jButtonGuardarCambiosTablaCiudad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCiudad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCiudad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCiudad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCiudad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCiudad.setToolTipText("Nuevo Ciudad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCiudad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCiudad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCiudad.setToolTipText("Sin Cerrar Ventana Ciudad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCiudad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCiudad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCiudad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCiudad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCiudad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCiudad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCiudad.setText("Accion");
		this.jComboBoxTiposAccionesCiudad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCiudad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCiudad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCiudad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCiudad = new JLabelMe();
		
		this.jLabelAccionesCiudad.setText("Acciones");		
		this.jLabelAccionesCiudad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCiudad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCiudad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCiudad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCiudad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCiudad=new JTabbedPane();
		this.jTabbedPaneRelacionesCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCiudad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCiudad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCiudad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCiudad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCiudad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCiudad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCiudad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCiudad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCiudad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCiudad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCiudad = new GridBagLayout();
		
		this.jPanelCamposCiudad.setLayout(gridaBagLayoutCamposCiudad);
		this.jPanelCamposOcultosCiudad.setLayout(gridaBagLayoutCamposOcultosCiudad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 0;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCiudad.add(jLabelIdCiudad, this.gridBagConstraintsCiudad);



	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 1;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCiudad.add(jLabelidCiudad, this.gridBagConstraintsCiudad);


	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 0;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisCiudad.add(jLabelid_paisCiudad, this.gridBagConstraintsCiudad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 2;
		this.gridBagConstraintsCiudad.ipadx = 0;
		this.gridBagConstraintsCiudad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCiudad.add(jButtonid_paisCiudadBusqueda, this.gridBagConstraintsCiudad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 3;
		this.gridBagConstraintsCiudad.ipadx = 0;
		this.gridBagConstraintsCiudad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisCiudad.add(jButtonid_paisCiudadUpdate, this.gridBagConstraintsCiudad);
	}

	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 1;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisCiudad.add(jComboBoxid_paisCiudad, this.gridBagConstraintsCiudad);


	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 0;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaCiudad.add(jLabelid_provinciaCiudad, this.gridBagConstraintsCiudad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 2;
		this.gridBagConstraintsCiudad.ipadx = 0;
		this.gridBagConstraintsCiudad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCiudad.add(jButtonid_provinciaCiudadBusqueda, this.gridBagConstraintsCiudad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 3;
		this.gridBagConstraintsCiudad.ipadx = 0;
		this.gridBagConstraintsCiudad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCiudad.add(jButtonid_provinciaCiudadUpdate, this.gridBagConstraintsCiudad);
	}

	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 1;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaCiudad.add(jComboBoxid_provinciaCiudad, this.gridBagConstraintsCiudad);


	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 0;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCiudad.add(jLabelcodigoCiudad, this.gridBagConstraintsCiudad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 2;
		this.gridBagConstraintsCiudad.ipadx = 0;
		this.gridBagConstraintsCiudad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCiudad.add(jButtoncodigoCiudadBusqueda, this.gridBagConstraintsCiudad);
	}

	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 1;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCiudad.add(jTextFieldcodigoCiudad, this.gridBagConstraintsCiudad);


	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 0;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCiudad.add(jLabelnombreCiudad, this.gridBagConstraintsCiudad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		//this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = 2;
		this.gridBagConstraintsCiudad.ipadx = 0;
		this.gridBagConstraintsCiudad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCiudad.add(jButtonnombreCiudadBusqueda, this.gridBagConstraintsCiudad);
	}

	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCiudad.gridy = 0;
	this.gridBagConstraintsCiudad.gridx = 1;
	this.gridBagConstraintsCiudad.ipadx = 0;
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCiudad.add(jscrollPanenombreCiudad, this.gridBagConstraintsCiudad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCiudad.gridy = iYPanelCamposCiudad;
	this.gridBagConstraintsCiudad.gridx = iXPanelCamposCiudad++;
	this.gridBagConstraintsCiudad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCiudad.add(this.jPanelidCiudad, this.gridBagConstraintsCiudad);



	if(iXPanelCamposCiudad % 1==0) {
		iXPanelCamposCiudad=0;
		iYPanelCamposCiudad++;
	}
	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCiudad.gridy = iYPanelCamposCiudad;
	this.gridBagConstraintsCiudad.gridx = iXPanelCamposCiudad++;
	this.gridBagConstraintsCiudad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCiudad.add(this.jPanelid_paisCiudad, this.gridBagConstraintsCiudad);



	if(iXPanelCamposCiudad % 1==0) {
		iXPanelCamposCiudad=0;
		iYPanelCamposCiudad++;
	}
	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCiudad.gridy = iYPanelCamposCiudad;
	this.gridBagConstraintsCiudad.gridx = iXPanelCamposCiudad++;
	this.gridBagConstraintsCiudad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCiudad.add(this.jPanelid_provinciaCiudad, this.gridBagConstraintsCiudad);



	if(iXPanelCamposCiudad % 1==0) {
		iXPanelCamposCiudad=0;
		iYPanelCamposCiudad++;
	}
	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCiudad.gridy = iYPanelCamposCiudad;
	this.gridBagConstraintsCiudad.gridx = iXPanelCamposCiudad++;
	this.gridBagConstraintsCiudad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCiudad.add(this.jPanelcodigoCiudad, this.gridBagConstraintsCiudad);



	if(iXPanelCamposCiudad % 1==0) {
		iXPanelCamposCiudad=0;
		iYPanelCamposCiudad++;
	}
	this.gridBagConstraintsCiudad = new GridBagConstraints();
	this.gridBagConstraintsCiudad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCiudad.gridy = iYPanelCamposCiudad;
	this.gridBagConstraintsCiudad.gridx = iXPanelCamposCiudad++;
	this.gridBagConstraintsCiudad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCiudad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCiudad.add(this.jPanelnombreCiudad, this.gridBagConstraintsCiudad);



	if(iXPanelCamposCiudad % 1==0) {
		iXPanelCamposCiudad=0;
		iYPanelCamposCiudad++;
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
			
		GridBagLayout gridaBagLayoutAccionesCiudad= new GridBagLayout();
		this.jPanelAccionesCiudad.setLayout(gridaBagLayoutAccionesCiudad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCiudad= new GridBagLayout();
		this.jPanelAccionesFormularioCiudad.setLayout(gridaBagLayoutAccionesFormularioCiudad);
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCiudad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCiudad.add(this.jComboBoxTiposAccionesFormularioCiudad, this.gridBagConstraintsCiudad);

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCiudad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCiudad.add(this.jCheckBoxPostAccionNuevoCiudad, this.gridBagConstraintsCiudad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.ciudadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCiudad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCiudad.add(this.jCheckBoxPostAccionSinCerrarCiudad, this.gridBagConstraintsCiudad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.ciudadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCiudad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCiudad.add(this.jCheckBoxPostAccionSinMensajeCiudad, this.gridBagConstraintsCiudad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx = iPosXAccion++;
			
		this.jPanelAccionesCiudad.add(this.jButtonModificarCiudad, this.gridBagConstraintsCiudad);							

		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCiudad.gridy = 0;
		this.gridBagConstraintsCiudad.gridx =iPosXAccion++;
			
		this.jPanelAccionesCiudad.add(this.jButtonEliminarCiudad, this.gridBagConstraintsCiudad);
		
			
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = 0;		
		this.gridBagConstraintsCiudad.gridx = iPosXAccion++;
		
		this.jPanelAccionesCiudad.add(this.jButtonActualizarCiudad, this.gridBagConstraintsCiudad);


		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = 0;		
		this.gridBagConstraintsCiudad.gridx = iPosXAccion++;
		
		this.jPanelAccionesCiudad.add(this.jButtonGuardarCambiosCiudad, this.gridBagConstraintsCiudad);	
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = 0;		
		this.gridBagConstraintsCiudad.gridx =iPosXAccion++;
		
		this.jPanelAccionesCiudad.add(this.jButtonCancelarCiudad, this.gridBagConstraintsCiudad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCiudad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCiudad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCiudad = new GridBagConstraints();						
			this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCiudad.gridx = 0;		
			//this.gridBagConstraintsCiudad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCiudad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCiudad.gridx =0;
		this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCiudad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCiudad, this.gridBagConstraintsCiudad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CiudadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCiudad = new CiudadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Ciudad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Ciudad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ciudad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CiudadModel ciudadModel=new CiudadModel(this);
			
			//SI USARA CLASE INTERNA
			//CiudadModel.CiudadFocusTraversalPolicy ciudadFocusTraversalPolicy = ciudadModel.new CiudadFocusTraversalPolicy(this);
			
			//ciudadFocusTraversalPolicy.setciudadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(ciudadModel);
			
			
			this.jContentPaneDetalleCiudad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCiudad = new GridBagLayout();	
			this.jContentPaneDetalleCiudad.setLayout(gridaBagLayoutDetalleCiudad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCiudad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCiudad = new GridBagConstraints();
				this.gridBagConstraintsCiudad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCiudad.gridx = 0;
					
				
				this.jContentPaneDetalleCiudad.add(jTtoolBarDetalleCiudad, gridBagConstraintsCiudad);								
				
}
			
			this.jScrollPanelDatosEdicionCiudad=   new JScrollPane(jContentPaneDetalleCiudad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCiudad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCiudad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCiudad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCiudad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCiudad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCiudad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCiudad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCiudad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCiudad.gridx = 0;
	        
			this.jContentPaneDetalleCiudad.add(jPanelCamposCiudad, gridBagConstraintsCiudad);
			
			
			
			
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
						&& ciudadSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.ciudadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCiudad= new GridBagConstraints();
						this.gridBagConstraintsCiudad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCiudad.gridx = 0;
						this.jContentPaneDetalleCiudad.add(this.jTabbedPaneRelacionesCiudad, this.gridBagConstraintsCiudad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCiudad.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCiudad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCiudad = new GridBagConstraints();
					this.gridBagConstraintsCiudad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCiudad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCiudad.gridx = 0;
					
				
					this.jContentPaneDetalleCiudad.add(jPanelCamposOcultosCiudad, gridBagConstraintsCiudad);
				
					this.jPanelCamposOcultosCiudad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCiudad.gridx = 0;
	        this.gridBagConstraintsCiudad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCiudad.add(this.jPanelAccionesFormularioCiudad, this.gridBagConstraintsCiudad);							
			
			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
	        this.gridBagConstraintsCiudad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCiudad.gridx = 0;
	        
			
			this.jContentPaneDetalleCiudad.add(this.jPanelAccionesCiudad, this.gridBagConstraintsCiudad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCiudad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCiudad=   new JScrollPane(this.jPanelCamposCiudad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCiudad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCiudad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCiudad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCiudad.gridx = 0;
			this.gridBagConstraintsCiudad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCiudad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCiudad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCiudad, this.gridBagConstraintsCiudad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCiudad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCiudad, this.gridBagConstraintsCiudad);			
			
			this.gridBagConstraintsCiudad = new GridBagConstraints();
			this.gridBagConstraintsCiudad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCiudad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCiudad, this.gridBagConstraintsCiudad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCiudad, this.gridBagConstraintsCiudad);
			
			
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCiudad, this.gridBagConstraintsCiudad);
		
			
		this.gridBagConstraintsCiudad = new GridBagConstraints();
		this.gridBagConstraintsCiudad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCiudad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCiudad, this.gridBagConstraintsCiudad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCiudad;//jContentPane;
		
		return jScrollPanelDatosEdicionCiudad;
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
