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


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.CantonConstantesFunciones;

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
public class CantonDetalleFormJInternalFrame extends CantonBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCanton;
	
	protected JMenuBar jmenuBarDetalleCanton;
	
	protected JMenu jmenuDetalleCanton;
	protected JMenu jmenuDetalleArchivoCanton;
	protected JMenu jmenuDetalleAccionesCanton;
	protected JMenu jmenuDetalleDatosCanton;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCanton;	
	protected GridBagConstraints gridBagConstraintsCanton;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CantonBeanSwingJInternalFrameAdditional jInternalFrameDetalleCanton;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";
	
	public CantonSessionBean cantonSessionBean;
	
	

	public BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame=null;
	public BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteBarrio=false;
	public BarrioSessionBean barrioSessionBean;

	public ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame=null;
	public ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParroquia=false;
	public ParroquiaSessionBean parroquiaSessionBean;
	
	
	public ProvinciaSessionBean provinciaSessionBean;	
	
	public CantonLogic cantonLogic;
	
	public JScrollPane jScrollPanelDatosCanton;
	public JScrollPane jScrollPanelDatosEdicionCanton;
	public JScrollPane jScrollPanelDatosGeneralCanton;
	
	protected JPanel jPanelCamposCanton;    
	protected JPanel jPanelCamposOcultosCanton;    	
	protected JPanel jPanelAccionesCanton;
	protected JPanel jPanelAccionesFormularioCanton;
    
	
	
	protected Integer iXPanelCamposCanton=0;
	protected Integer iYPanelCamposCanton=0;
	
	protected Integer iXPanelCamposOcultosCanton=0;
	protected Integer iYPanelCamposOcultosCanton=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCanton;
	public JButton jButtonModificarCanton;
	public JButton jButtonActualizarCanton;
    public JButton jButtonEliminarCanton;
	public JButton jButtonCancelarCanton;
    public JButton jButtonGuardarCambiosCanton;
	public JButton jButtonGuardarCambiosTablaCanton;
	protected JButton jButtonCerrarCanton;
	
	
	protected JButton jButtonProcesarInformacionCanton;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCanton;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCanton;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCanton;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCanton;
	protected JButton jButtonModificarToolBarCanton;
	protected JButton jButtonActualizarToolBarCanton;
    protected JButton jButtonEliminarToolBarCanton;
	protected JButton jButtonCancelarToolBarCanton;
    protected JButton jButtonGuardarCambiosToolBarCanton;
	protected JButton jButtonGuardarCambiosTablaToolBarCanton;
	protected JButton jButtonMostrarOcultarTablaToolBarCanton;
	protected JButton jButtonCerrarToolBarCanton;
	
	protected JButton jButtonProcesarInformacionToolBarCanton;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCanton;
	protected JMenuItem jMenuItemModificarCanton;
	protected JMenuItem jMenuItemActualizarCanton;
    protected JMenuItem jMenuItemEliminarCanton;
	protected JMenuItem jMenuItemCancelarCanton;
    protected JMenuItem jMenuItemGuardarCambiosCanton;
	protected JMenuItem jMenuItemGuardarCambiosTablaCanton;
	protected JMenuItem jMenuItemCerrarCanton;
	protected JMenuItem jMenuItemDetalleCerrarCanton;
	protected JMenuItem jMenuItemDetalleMostarOcultarCanton;
	
	protected JMenuItem jMenuItemProcesarInformacionCanton;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCanton;
	protected JMenuItem jMenuItemMostrarOcultarCanton;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCanton;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCanton;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCanton;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCanton;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCanton;
	public JLabel jLabelIdCanton;
	public JLabel jLabelidCanton;
	public JButton jButtonidCantonBusqueda= new JButtonMe();

	public JPanel jPanelcodigoCanton;
	public JLabel jLabelcodigoCanton;
	public JTextField jTextFieldcodigoCanton;
	public JButton jButtoncodigoCantonBusqueda= new JButtonMe();

	public JPanel jPanelnombreCanton;
	public JLabel jLabelnombreCanton;
	public JTextArea jTextAreanombreCanton;
	public JScrollPane jscrollPanenombreCanton;
	public JButton jButtonnombreCantonBusqueda= new JButtonMe();

	public JPanel jPaneles_activoCanton;
	public JLabel jLabeles_activoCanton;
	public JCheckBox jCheckBoxes_activoCanton;
	public JButton jButtones_activoCantonBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaCanton;
	public JLabel jLabelid_provinciaCanton;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaCanton;
	public JButton jButtonid_provinciaCanton= new JButtonMe();
	public JButton jButtonid_provinciaCantonUpdate= new JButtonMe();
	public JButton jButtonid_provinciaCantonBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCanton;
	
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
	
	public CantonDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCanton=new JPanel();
				this.jPanelAccionesFormularioCanton=new JPanel();
				this.jmenuBarDetalleCanton=new JMenuBar();
				this.jTtoolBarDetalleCanton=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CantonDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CantonDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Canton No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCanton() {
		return this.jButtonActualizarToolBarCanton;
	}
	
	public JButton getjButtonEliminarToolBarCanton() {
		return this.jButtonEliminarToolBarCanton;
	}
	
	public JButton getjButtonCancelarToolBarCanton() {
		return this.jButtonCancelarToolBarCanton;
	}		
	
	public JButton getjButtonProcesarInformacionCanton() {
		return this.jButtonProcesarInformacionCanton;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCanton)	{
		this.jButtonProcesarInformacionCanton = jButtonProcesarInformacionCanton;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCanton() {
		return this.jComboBoxTiposAccionesCanton;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCanton(
			JComboBox jComboBoxTiposRelacionesCanton) {
		this.jComboBoxTiposRelacionesCanton = jComboBoxTiposRelacionesCanton;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCanton(
			JComboBox jComboBoxTiposAccionesCanton) {
		this.jComboBoxTiposAccionesCanton = jComboBoxTiposAccionesCanton;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCanton() {
		return this.jComboBoxTiposAccionesFormularioCanton;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCanton(
			JComboBox jComboBoxTiposAccionesFormularioCanton) {
		this.jComboBoxTiposAccionesFormularioCanton = jComboBoxTiposAccionesFormularioCanton;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cantonSessionBean=new CantonSessionBean();
		
		this.cantonSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cantonSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cantonSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.barrioSessionBean=new BarrioSessionBean();
		//this.parroquiaSessionBean=new ParroquiaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CantonJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CantonJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CantonJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Canton MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
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
	
		CantonJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCanton= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCanton=new JButtonMe();
				this.jButtonModificarToolBarCanton=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCanton,this.jTtoolBarDetalleCanton,
							"actualizar","actualizar","Actualizar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCanton,this.jTtoolBarDetalleCanton,
							"eliminar","eliminar","Eliminar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCanton,this.jTtoolBarDetalleCanton,
							"cancelar","cancelar","Cancelar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCanton=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCanton,this.jTtoolBarDetalleCanton,
							"guardarcambios","guardarcambios","Guardar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCanton,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCanton,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCanton,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCanton=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCanton=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCanton=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCanton=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCanton=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCanton= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCanton.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCanton,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCanton= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCanton.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCanton,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCanton= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCanton.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCanton,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCanton= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCanton.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCanton,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCanton= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCanton.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCanton,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCanton= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCanton.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCanton,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCanton= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCanton.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCanton,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCanton= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCanton.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCanton,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCanton= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCanton.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCanton,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCanton= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCanton.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCanton,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCanton, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCanton.add(this.jMenuItemDetalleCerrarCanton);
		
		this.jmenuDetalleAccionesCanton.add(this.jMenuItemActualizarCanton);
		this.jmenuDetalleAccionesCanton.add(this.jMenuItemEliminarCanton);
		this.jmenuDetalleAccionesCanton.add(this.jMenuItemCancelarCanton);		
		
		//this.jmenuDetalleDatosCanton.add(this.jMenuItemDetalleAbrirOrderByCanton);				
		this.jmenuDetalleDatosCanton.add(this.jMenuItemDetalleMostarOcultarCanton);				
				
		//this.jmenuDetalleAccionesCanton.add(this.jMenuItemGuardarCambiosCanton);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCanton.add(this.jmenuDetalleArchivoCanton);		
		this.jmenuBarDetalleCanton.add(this.jmenuDetalleAccionesCanton);		
		this.jmenuBarDetalleCanton.add(this.jmenuDetalleDatosCanton);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCanton, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCanton.add(this.jmenuDetalleCanton);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCanton);				
	}
	
	
	public void inicializarElementosCamposCanton() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCanton = new JLabelMe();
		jLabelIdCanton.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCanton = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCanton.setToolTipText(CantonConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCanton= new GridBagLayout();

		this.jPanelidCanton.setLayout(this.gridaBagLayoutCanton);

		jLabelidCanton = new JLabel();
		jLabelidCanton.setText("Id");

		jLabelidCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoCanton = new JLabelMe();
		this.jLabelcodigoCanton.setText(""+CantonConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoCanton.setToolTipText("Codigo");
		this.jLabelcodigoCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoCanton=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoCanton.setToolTipText(CantonConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutCanton = new GridBagLayout();
		this.jPanelcodigoCanton.setLayout(this.gridaBagLayoutCanton);


		jTextFieldcodigoCanton= new JTextFieldMe();

		jTextFieldcodigoCanton.setEnabled(false);
		jTextFieldcodigoCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoCantonBusqueda= new JButtonMe();
		this.jButtoncodigoCantonBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCantonBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoCantonBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoCantonBusqueda.setText("U");
		this.jButtoncodigoCantonBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoCantonBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoCantonBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoCantonBusqueda"));

		if(this.cantonSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoCantonBusqueda.setVisible(false);		}


					
		this.jLabelnombreCanton = new JLabelMe();
		this.jLabelnombreCanton.setText(""+CantonConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCanton.setToolTipText("Nombre");
		this.jLabelnombreCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCanton=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCanton.setToolTipText(CantonConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCanton = new GridBagLayout();
		this.jPanelnombreCanton.setLayout(this.gridaBagLayoutCanton);


		jTextAreanombreCanton= new JTextAreaMe();
		jTextAreanombreCanton.setEnabled(false);
		jTextAreanombreCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreCanton.setLineWrap(true);
		jTextAreanombreCanton.setWrapStyleWord(true);
		jTextAreanombreCanton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreCanton.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreCanton = new JScrollPane(jTextAreanombreCanton);
		jscrollPanenombreCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreCantonBusqueda= new JButtonMe();
		this.jButtonnombreCantonBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCantonBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCantonBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCantonBusqueda.setText("U");
		this.jButtonnombreCantonBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCantonBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCantonBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCantonBusqueda"));

		if(this.cantonSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCantonBusqueda.setVisible(false);		}


					
		this.jLabeles_activoCanton = new JLabelMe();
		this.jLabeles_activoCanton.setText(""+CantonConstantesFunciones.LABEL_ESACTIVO+" : *");
		this.jLabeles_activoCanton.setToolTipText("Es Activo");
		this.jLabeles_activoCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_activoCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_activoCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_activoCanton=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_activoCanton.setToolTipText(CantonConstantesFunciones.LABEL_ESACTIVO);
		this.gridaBagLayoutCanton = new GridBagLayout();
		this.jPaneles_activoCanton.setLayout(this.gridaBagLayoutCanton);


		jCheckBoxes_activoCanton= new JCheckBoxMe();
		jCheckBoxes_activoCanton.setEnabled(false);

		jCheckBoxes_activoCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_activoCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_activoCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_activoCantonBusqueda= new JButtonMe();
		this.jButtones_activoCantonBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoCantonBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_activoCantonBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_activoCantonBusqueda.setText("U");
		this.jButtones_activoCantonBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_activoCantonBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_activoCantonBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_activoCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_activoCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_activoCantonBusqueda"));

		if(this.cantonSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_activoCantonBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCanton() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_provinciaCanton = new JLabelMe();
		this.jLabelid_provinciaCanton.setText(""+CantonConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaCanton.setToolTipText("Provincia");
		this.jLabelid_provinciaCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaCanton=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaCanton.setToolTipText(CantonConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutCanton = new GridBagLayout();
		this.jPanelid_provinciaCanton.setLayout(this.gridaBagLayoutCanton);


		jComboBoxid_provinciaCanton= new JComboBoxMe();
		jComboBoxid_provinciaCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaCanton,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaCanton= new JButtonMe();
		this.jButtonid_provinciaCanton.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCanton.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCanton.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaCanton.setText("Buscar");
		this.jButtonid_provinciaCanton.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaCanton.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCanton,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCanton"));

		this.jButtonid_provinciaCantonBusqueda= new JButtonMe();
		this.jButtonid_provinciaCantonBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCantonBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCantonBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCantonBusqueda.setText("U");
		this.jButtonid_provinciaCantonBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaCantonBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCantonBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCantonBusqueda"));

		if(this.cantonSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaCantonBusqueda.setVisible(false);		}

		this.jButtonid_provinciaCantonUpdate= new JButtonMe();
		this.jButtonid_provinciaCantonUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCantonUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaCantonUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaCantonUpdate.setText("U");
		this.jButtonid_provinciaCantonUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaCantonUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaCantonUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaCanton.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaCanton.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaCantonUpdate"));



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
		//this.jInternalFrameDetalleCanton = new CantonBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Canton DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCanton= new GridBagLayout();
		

		
		String sToolTipCanton="";
		sToolTipCanton=CantonConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCanton+="(Seguridad.Canton)";
		}
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			sToolTipCanton+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCanton = new JButtonMe();
		this.jButtonModificarCanton = new JButtonMe();
        this.jButtonActualizarCanton = new JButtonMe();
        this.jButtonEliminarCanton = new JButtonMe();
        this.jButtonCancelarCanton = new JButtonMe();
        this.jButtonGuardarCambiosCanton = new JButtonMe();
		this.jButtonGuardarCambiosTablaCanton = new JButtonMe();
		this.jButtonCerrarCanton = new JButtonMe();
		
		this.jScrollPanelDatosCanton = new JScrollPane();   
        this.jScrollPanelDatosEdicionCanton = new JScrollPane();
		this.jScrollPanelDatosGeneralCanton = new JScrollPane();
				
		
		
		this.jPanelCamposCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Canton";
		
		if(!this.cantonSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cantones" + this.sPath));
		} else {
			this.jScrollPanelDatosCanton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCanton.setName("jPanelCamposCanton"); 

		this.jPanelCamposOcultosCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCanton.setName("jPanelCamposOcultosCanton"); 

        this.jPanelAccionesCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCanton.setToolTipText("Acciones");
        this.jPanelAccionesCanton.setName("Acciones"); 

		this.jPanelAccionesFormularioCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCanton.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCanton.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCanton, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCanton, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCanton, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCanton.setText("Nuevo");
		this.jButtonModificarCanton.setText("Editar");
        this.jButtonActualizarCanton.setText("Actualizar");
        this.jButtonEliminarCanton.setText("Eliminar");
        this.jButtonCancelarCanton.setText("Cancelar");
        this.jButtonGuardarCambiosCanton.setText("Guardar");
		this.jButtonGuardarCambiosTablaCanton.setText("Guardar");
		this.jButtonCerrarCanton.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCanton,"nuevo_button","Nuevo",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCanton,"modificar_button","Editar",this.cantonSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCanton,"actualizar_button","Actualizar",this.cantonSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCanton,"eliminar_button","Eliminar",this.cantonSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCanton,"cancelar_button","Cancelar",this.cantonSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCanton,"guardarcambios_button","Guardar",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCanton,"guardarcambiostabla_button","Guardar",this.cantonSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCanton,"cerrar_button","Salir",this.cantonSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCanton, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCanton, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCanton.setToolTipText("Nuevo"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCanton.setToolTipText("Editar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCanton.setToolTipText("Actualizar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCanton.setToolTipText("Eliminar)"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCanton.setToolTipText("Cancelar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCanton.setToolTipText("Guardar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCanton.setToolTipText("Guardar"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCanton.setToolTipText("Salir"+" "+CantonConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCanton";
		inputMap = this.jButtonNuevoCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCanton.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCanton"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCanton";
		inputMap = this.jButtonActualizarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCanton"));
		
		//ELIMINAR
		sMapKey = "EliminarCanton";
		inputMap = this.jButtonEliminarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCanton"));
		
		//CANCELAR	
		sMapKey = "CancelarCanton";
		inputMap = this.jButtonCancelarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCanton"));
		
		//CERRAR		
		sMapKey = "CerrarCanton";
		inputMap = this.jButtonCerrarCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCanton"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCanton";
		inputMap = this.jButtonGuardarCambiosTablaCanton.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCanton.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCanton"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCanton = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCanton.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCanton.setToolTipText("Nuevo Canton");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCanton, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCanton = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCanton.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCanton.setToolTipText("Sin Cerrar Ventana Canton");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCanton, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCanton = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCanton.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCanton.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCanton, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCanton = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCanton.setText("Accion");
		this.jComboBoxTiposAccionesCanton.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCanton = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCanton.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCanton.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCanton = new JLabelMe();
		
		this.jLabelAccionesCanton.setText("Acciones");		
		this.jLabelAccionesCanton.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCanton.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCanton.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCanton();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCanton();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCanton=new JTabbedPane();
		this.jTabbedPaneRelacionesCanton.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCanton,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCanton.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCanton.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCanton.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCanton, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCanton.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCanton.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCanton.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCanton, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCanton = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCanton = new GridBagLayout();
		
		this.jPanelCamposCanton.setLayout(gridaBagLayoutCamposCanton);
		this.jPanelCamposOcultosCanton.setLayout(gridaBagLayoutCamposOcultosCanton);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 0;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCanton.add(jLabelIdCanton, this.gridBagConstraintsCanton);



	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 1;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCanton.add(jLabelidCanton, this.gridBagConstraintsCanton);


	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 0;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaCanton.add(jLabelid_provinciaCanton, this.gridBagConstraintsCanton);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCanton = new GridBagConstraints();
		//this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = 2;
		this.gridBagConstraintsCanton.ipadx = 0;
		this.gridBagConstraintsCanton.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCanton.add(jButtonid_provinciaCantonBusqueda, this.gridBagConstraintsCanton);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCanton = new GridBagConstraints();
		//this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = 3;
		this.gridBagConstraintsCanton.ipadx = 0;
		this.gridBagConstraintsCanton.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaCanton.add(jButtonid_provinciaCantonUpdate, this.gridBagConstraintsCanton);
	}

	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 1;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaCanton.add(jComboBoxid_provinciaCanton, this.gridBagConstraintsCanton);


	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 0;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoCanton.add(jLabelcodigoCanton, this.gridBagConstraintsCanton);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCanton = new GridBagConstraints();
		//this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = 2;
		this.gridBagConstraintsCanton.ipadx = 0;
		this.gridBagConstraintsCanton.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoCanton.add(jButtoncodigoCantonBusqueda, this.gridBagConstraintsCanton);
	}

	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 1;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoCanton.add(jTextFieldcodigoCanton, this.gridBagConstraintsCanton);


	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 0;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCanton.add(jLabelnombreCanton, this.gridBagConstraintsCanton);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCanton = new GridBagConstraints();
		//this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = 2;
		this.gridBagConstraintsCanton.ipadx = 0;
		this.gridBagConstraintsCanton.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCanton.add(jButtonnombreCantonBusqueda, this.gridBagConstraintsCanton);
	}

	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 1;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCanton.add(jscrollPanenombreCanton, this.gridBagConstraintsCanton);


	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 0;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_activoCanton.add(jLabeles_activoCanton, this.gridBagConstraintsCanton);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCanton = new GridBagConstraints();
		//this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = 2;
		this.gridBagConstraintsCanton.ipadx = 0;
		this.gridBagConstraintsCanton.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_activoCanton.add(jButtones_activoCantonBusqueda, this.gridBagConstraintsCanton);
	}

	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCanton.gridy = 0;
	this.gridBagConstraintsCanton.gridx = 1;
	this.gridBagConstraintsCanton.ipadx = 0;
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_activoCanton.add(jCheckBoxes_activoCanton, this.gridBagConstraintsCanton);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCanton.gridy = iYPanelCamposCanton;
	this.gridBagConstraintsCanton.gridx = iXPanelCamposCanton++;
	this.gridBagConstraintsCanton.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCanton.add(this.jPanelidCanton, this.gridBagConstraintsCanton);



	if(iXPanelCamposCanton % 1==0) {
		iXPanelCamposCanton=0;
		iYPanelCamposCanton++;
	}
	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCanton.gridy = iYPanelCamposCanton;
	this.gridBagConstraintsCanton.gridx = iXPanelCamposCanton++;
	this.gridBagConstraintsCanton.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCanton.add(this.jPanelid_provinciaCanton, this.gridBagConstraintsCanton);



	if(iXPanelCamposCanton % 1==0) {
		iXPanelCamposCanton=0;
		iYPanelCamposCanton++;
	}
	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCanton.gridy = iYPanelCamposCanton;
	this.gridBagConstraintsCanton.gridx = iXPanelCamposCanton++;
	this.gridBagConstraintsCanton.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCanton.add(this.jPanelcodigoCanton, this.gridBagConstraintsCanton);



	if(iXPanelCamposCanton % 1==0) {
		iXPanelCamposCanton=0;
		iYPanelCamposCanton++;
	}
	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCanton.gridy = iYPanelCamposCanton;
	this.gridBagConstraintsCanton.gridx = iXPanelCamposCanton++;
	this.gridBagConstraintsCanton.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCanton.add(this.jPanelnombreCanton, this.gridBagConstraintsCanton);



	if(iXPanelCamposCanton % 1==0) {
		iXPanelCamposCanton=0;
		iYPanelCamposCanton++;
	}
	this.gridBagConstraintsCanton = new GridBagConstraints();
	this.gridBagConstraintsCanton.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCanton.gridy = iYPanelCamposCanton;
	this.gridBagConstraintsCanton.gridx = iXPanelCamposCanton++;
	this.gridBagConstraintsCanton.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCanton.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCanton.add(this.jPaneles_activoCanton, this.gridBagConstraintsCanton);



	if(iXPanelCamposCanton % 1==0) {
		iXPanelCamposCanton=0;
		iYPanelCamposCanton++;
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
			
		GridBagLayout gridaBagLayoutAccionesCanton= new GridBagLayout();
		this.jPanelAccionesCanton.setLayout(gridaBagLayoutAccionesCanton);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCanton= new GridBagLayout();
		this.jPanelAccionesFormularioCanton.setLayout(gridaBagLayoutAccionesFormularioCanton);
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCanton.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCanton.add(this.jComboBoxTiposAccionesFormularioCanton, this.gridBagConstraintsCanton);

		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCanton.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCanton.add(this.jCheckBoxPostAccionNuevoCanton, this.gridBagConstraintsCanton);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cantonSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCanton.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCanton.add(this.jCheckBoxPostAccionSinCerrarCanton, this.gridBagConstraintsCanton);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cantonSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cantonSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCanton.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCanton.add(this.jCheckBoxPostAccionSinMensajeCanton, this.gridBagConstraintsCanton);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx = iPosXAccion++;
			
		this.jPanelAccionesCanton.add(this.jButtonModificarCanton, this.gridBagConstraintsCanton);							

		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCanton.gridy = 0;
		this.gridBagConstraintsCanton.gridx =iPosXAccion++;
			
		this.jPanelAccionesCanton.add(this.jButtonEliminarCanton, this.gridBagConstraintsCanton);
		
			
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = 0;		
		this.gridBagConstraintsCanton.gridx = iPosXAccion++;
		
		this.jPanelAccionesCanton.add(this.jButtonActualizarCanton, this.gridBagConstraintsCanton);


		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = 0;		
		this.gridBagConstraintsCanton.gridx = iPosXAccion++;
		
		this.jPanelAccionesCanton.add(this.jButtonGuardarCambiosCanton, this.gridBagConstraintsCanton);	
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = 0;		
		this.gridBagConstraintsCanton.gridx =iPosXAccion++;
		
		this.jPanelAccionesCanton.add(this.jButtonCancelarCanton, this.gridBagConstraintsCanton);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCanton = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCanton);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cantonSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCanton = new GridBagConstraints();						
			this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCanton.gridx = 0;		
			//this.gridBagConstraintsCanton.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCanton.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCanton.gridx =0;
		this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCanton.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCanton, this.gridBagConstraintsCanton);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CantonJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCanton = new CantonBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Canton DATOS");
			
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
			
	        //this.setTitle("[FOR] - Canton DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Canton Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CantonModel cantonModel=new CantonModel(this);
			
			//SI USARA CLASE INTERNA
			//CantonModel.CantonFocusTraversalPolicy cantonFocusTraversalPolicy = cantonModel.new CantonFocusTraversalPolicy(this);
			
			//cantonFocusTraversalPolicy.setcantonJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cantonModel);
			
			
			this.jContentPaneDetalleCanton = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCanton = new GridBagLayout();	
			this.jContentPaneDetalleCanton.setLayout(gridaBagLayoutDetalleCanton);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCanton = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCanton = new GridBagConstraints();
				this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCanton.gridx = 0;
					
				
				this.jContentPaneDetalleCanton.add(jTtoolBarDetalleCanton, gridBagConstraintsCanton);								
				
}
			
			this.jScrollPanelDatosEdicionCanton=   new JScrollPane(jContentPaneDetalleCanton,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCanton.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCanton.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCanton.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCanton=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCanton.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCanton.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCanton.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCanton.gridx = 0;
	        
			this.jContentPaneDetalleCanton.add(jPanelCamposCanton, gridBagConstraintsCanton);
			
			
			
			
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
						&& cantonSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameBarrio(this.puedeCargarPorParteBarrio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParroquia(this.puedeCargarPorParteParroquia,false,-1);
					
					if(this.cantonSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCanton= new GridBagConstraints();
						this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCanton.gridx = 0;
						this.jContentPaneDetalleCanton.add(this.jTabbedPaneRelacionesCanton, this.gridBagConstraintsCanton);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCanton.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameBarrio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParroquia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCanton.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCanton = new GridBagConstraints();
					this.gridBagConstraintsCanton.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCanton.gridx = 0;
					
				
					this.jContentPaneDetalleCanton.add(jPanelCamposOcultosCanton, gridBagConstraintsCanton);
				
					this.jPanelCamposOcultosCanton.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsCanton.gridx = 0;
	        this.gridBagConstraintsCanton.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCanton.add(this.jPanelAccionesFormularioCanton, this.gridBagConstraintsCanton);							
			
			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
	        this.gridBagConstraintsCanton.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsCanton.gridx = 0;
	        
			
			this.jContentPaneDetalleCanton.add(this.jPanelAccionesCanton, this.gridBagConstraintsCanton);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCanton);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCanton=   new JScrollPane(this.jPanelCamposCanton,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCanton.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCanton.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCanton.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCanton.gridx = 0;
			this.gridBagConstraintsCanton.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCanton.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCanton.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCanton, this.gridBagConstraintsCanton);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCanton.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCanton, this.gridBagConstraintsCanton);			
			
			this.gridBagConstraintsCanton = new GridBagConstraints();
			this.gridBagConstraintsCanton.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCanton.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCanton, this.gridBagConstraintsCanton);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCanton, this.gridBagConstraintsCanton);
			
			
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCanton, this.gridBagConstraintsCanton);
		
			
		this.gridBagConstraintsCanton = new GridBagConstraints();
		this.gridBagConstraintsCanton.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCanton.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCanton, this.gridBagConstraintsCanton);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCanton;//jContentPane;
		
		return jScrollPanelDatosEdicionCanton;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameBarrio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.barrioSessionBean=new BarrioSessionBean();
		this.barrioSessionBean.setConGuardarRelaciones(false);
		this.barrioSessionBean.setEsGuardarRelacionado(true);

		this.barrioBeanSwingJInternalFrame=null;//new BarrioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.barrioBeanSwingJInternalFramePopup=new BarrioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.barrioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.barrioSessionBean.getEsGuardarRelacionado()) {

				BarrioJInternalFrame.STIPO_TAMANIO_GENERAL=CantonJInternalFrame.STIPO_TAMANIO_GENERAL;
				BarrioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CantonJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.barrioSessionBean.setEsGuardarRelacionado(true);

				this.barrioBeanSwingJInternalFrame=new BarrioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.barrioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.barrioBeanSwingJInternalFrame.setbarrioSessionBean(this.barrioSessionBean);

				//this.gridBagConstraintsCanton = new GridBagConstraints();
				//this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCanton.gridx = 0;
				//this.jContentPaneDetalleCanton.add(this.barrioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCanton);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCanton.add("Barrios",this.barrioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCanton.setComponentAt(iIndexTab,this.barrioBeanSwingJInternalFrame.getContentPane());
				}

				//BarrioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.barrioSessionBean.setEsGuardarRelacionado(false);
				this.barrioBeanSwingJInternalFrame=null;//new BarrioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.barrioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteBarrio) {
					this.jTabbedPaneRelacionesCanton.add("Barrios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParroquia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parroquiaSessionBean=new ParroquiaSessionBean();
		this.parroquiaSessionBean.setConGuardarRelaciones(false);
		this.parroquiaSessionBean.setEsGuardarRelacionado(true);

		this.parroquiaBeanSwingJInternalFrame=null;//new ParroquiaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parroquiaBeanSwingJInternalFramePopup=new ParroquiaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parroquiaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {

				ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL=CantonJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParroquiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CantonJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parroquiaSessionBean.setEsGuardarRelacionado(true);

				this.parroquiaBeanSwingJInternalFrame=new ParroquiaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parroquiaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parroquiaBeanSwingJInternalFrame.setparroquiaSessionBean(this.parroquiaSessionBean);

				//this.gridBagConstraintsCanton = new GridBagConstraints();
				//this.gridBagConstraintsCanton.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCanton.gridx = 0;
				//this.jContentPaneDetalleCanton.add(this.parroquiaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCanton);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCanton.add("Parroquias",this.parroquiaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCanton.setComponentAt(iIndexTab,this.parroquiaBeanSwingJInternalFrame.getContentPane());
				}

				//ParroquiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parroquiaSessionBean.setEsGuardarRelacionado(false);
				this.parroquiaBeanSwingJInternalFrame=null;//new ParroquiaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parroquiaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParroquia) {
					this.jTabbedPaneRelacionesCanton.add("Parroquias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarBarrioBeanSwingJInternalFrame(List<Canton> cantons,Canton canton,BarrioBeanSwingJInternalFrame barrioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//barrioBeanSwingJInternalFrame=new BarrioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					barrioBeanSwingJInternalFrame.getBarrioLogic().setConnexion(this.cantonLogic.getConnexion());

					barrioBeanSwingJInternalFrame.setcantonsForeignKey(cantons);
					barrioBeanSwingJInternalFrame.setcantonForeignKey(canton);
					barrioBeanSwingJInternalFrame.barrioSessionBean.setisBusquedaDesdeForeignKeySesionCanton(true);
					barrioBeanSwingJInternalFrame.barrioSessionBean.setlidCantonActual(canton.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					barrioBeanSwingJInternalFrame.cargarCombosForeignKeyBarrio(barrioBeanSwingJInternalFrame.isCargarCombosDependencia);
					barrioBeanSwingJInternalFrame.setVisibilidadBusquedasParaCanton(true);
					barrioBeanSwingJInternalFrame.setid_cantonFK_IdCanton(canton.getId());

					if(!this.conCargarFormDetalle) {
						barrioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					barrioBeanSwingJInternalFrame.setSelectedItemCombosFrameCantonForeignKey(canton,1,false,true,true);
					barrioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					barrioBeanSwingJInternalFrame.procesarBusqueda("FK_IdCanton");
					barrioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCanton");
					barrioBeanSwingJInternalFrame.inicializarActualizarBindingTablaBarrio(true);
					barrioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesBarrio("n",barrioBeanSwingJInternalFrame.isGuardarCambiosEnLote, barrioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					barrioBeanSwingJInternalFrame.setAutoscrolls(true);
					barrioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						barrioBeanSwingJInternalFrame.actualizarEstadoPanelsBarrio("relacionado");
					} else {
						barrioBeanSwingJInternalFrame.actualizarEstadoPanelsBarrio("no_relacionado");
					}

					barrioBeanSwingJInternalFrame.getjButtonRecargarInformacionBarrio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParroquiaBeanSwingJInternalFrame(List<Canton> cantons,Canton canton,ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parroquiaBeanSwingJInternalFrame=new ParroquiaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parroquiaBeanSwingJInternalFrame.getParroquiaLogic().setConnexion(this.cantonLogic.getConnexion());

					parroquiaBeanSwingJInternalFrame.setcantonsForeignKey(cantons);
					parroquiaBeanSwingJInternalFrame.setcantonForeignKey(canton);
					parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.setisBusquedaDesdeForeignKeySesionCanton(true);
					parroquiaBeanSwingJInternalFrame.parroquiaSessionBean.setlidCantonActual(canton.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parroquiaBeanSwingJInternalFrame.cargarCombosForeignKeyParroquia(parroquiaBeanSwingJInternalFrame.isCargarCombosDependencia);
					parroquiaBeanSwingJInternalFrame.setVisibilidadBusquedasParaCanton(true);
					parroquiaBeanSwingJInternalFrame.setid_cantonFK_IdCanton(canton.getId());

					if(!this.conCargarFormDetalle) {
						parroquiaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parroquiaBeanSwingJInternalFrame.setSelectedItemCombosFrameCantonForeignKey(canton,1,false,true,true);
					parroquiaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parroquiaBeanSwingJInternalFrame.procesarBusqueda("FK_IdCanton");
					parroquiaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCanton");
					parroquiaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParroquia(true);
					parroquiaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParroquia("n",parroquiaBeanSwingJInternalFrame.isGuardarCambiosEnLote, parroquiaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parroquiaBeanSwingJInternalFrame.setAutoscrolls(true);
					parroquiaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parroquiaBeanSwingJInternalFrame.actualizarEstadoPanelsParroquia("relacionado");
					} else {
						parroquiaBeanSwingJInternalFrame.actualizarEstadoPanelsParroquia("no_relacionado");
					}

					parroquiaBeanSwingJInternalFrame.getjButtonRecargarInformacionParroquia().setVisible(false);

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
