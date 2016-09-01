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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TasaConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TasaDetalleFormJInternalFrame extends TasaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTasa;
	
	protected JMenuBar jmenuBarDetalleTasa;
	
	protected JMenu jmenuDetalleTasa;
	protected JMenu jmenuDetalleArchivoTasa;
	protected JMenu jmenuDetalleAccionesTasa;
	protected JMenu jmenuDetalleDatosTasa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTasa;	
	protected GridBagConstraints gridBagConstraintsTasa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TasaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTasa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TasaSessionBean tasaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TasaLogic tasaLogic;
	
	public JScrollPane jScrollPanelDatosTasa;
	public JScrollPane jScrollPanelDatosEdicionTasa;
	public JScrollPane jScrollPanelDatosGeneralTasa;
	
	protected JPanel jPanelCamposTasa;    
	protected JPanel jPanelCamposOcultosTasa;    	
	protected JPanel jPanelAccionesTasa;
	protected JPanel jPanelAccionesFormularioTasa;
    
	
	
	protected Integer iXPanelCamposTasa=0;
	protected Integer iYPanelCamposTasa=0;
	
	protected Integer iXPanelCamposOcultosTasa=0;
	protected Integer iYPanelCamposOcultosTasa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTasa;
	public JButton jButtonModificarTasa;
	public JButton jButtonActualizarTasa;
    public JButton jButtonEliminarTasa;
	public JButton jButtonCancelarTasa;
    public JButton jButtonGuardarCambiosTasa;
	public JButton jButtonGuardarCambiosTablaTasa;
	protected JButton jButtonCerrarTasa;
	
	
	protected JButton jButtonProcesarInformacionTasa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTasa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTasa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTasa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTasa;
	protected JButton jButtonModificarToolBarTasa;
	protected JButton jButtonActualizarToolBarTasa;
    protected JButton jButtonEliminarToolBarTasa;
	protected JButton jButtonCancelarToolBarTasa;
    protected JButton jButtonGuardarCambiosToolBarTasa;
	protected JButton jButtonGuardarCambiosTablaToolBarTasa;
	protected JButton jButtonMostrarOcultarTablaToolBarTasa;
	protected JButton jButtonCerrarToolBarTasa;
	
	protected JButton jButtonProcesarInformacionToolBarTasa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTasa;
	protected JMenuItem jMenuItemModificarTasa;
	protected JMenuItem jMenuItemActualizarTasa;
    protected JMenuItem jMenuItemEliminarTasa;
	protected JMenuItem jMenuItemCancelarTasa;
    protected JMenuItem jMenuItemGuardarCambiosTasa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTasa;
	protected JMenuItem jMenuItemCerrarTasa;
	protected JMenuItem jMenuItemDetalleCerrarTasa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTasa;
	
	protected JMenuItem jMenuItemProcesarInformacionTasa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTasa;
	protected JMenuItem jMenuItemMostrarOcultarTasa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTasa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTasa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTasa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTasa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTasa;
	public JLabel jLabelIdTasa;
	public JLabel jLabelidTasa;
	public JButton jButtonidTasaBusqueda= new JButtonMe();

	public JPanel jPanelvalorTasa;
	public JLabel jLabelvalorTasa;
	public JTextField jTextFieldvalorTasa;
	public JButton jButtonvalorTasaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTasa;
	public JLabel jLabelid_empresaTasa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTasa;
	public JButton jButtonid_empresaTasa= new JButtonMe();
	public JButton jButtonid_empresaTasaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTasaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTasa;
	
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
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TasaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTasa=new JPanel();
				this.jPanelAccionesFormularioTasa=new JPanel();
				this.jmenuBarDetalleTasa=new JMenuBar();
				this.jTtoolBarDetalleTasa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TasaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TasaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Tasa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTasa() {
		return this.jButtonActualizarToolBarTasa;
	}
	
	public JButton getjButtonEliminarToolBarTasa() {
		return this.jButtonEliminarToolBarTasa;
	}
	
	public JButton getjButtonCancelarToolBarTasa() {
		return this.jButtonCancelarToolBarTasa;
	}		
	
	public JButton getjButtonProcesarInformacionTasa() {
		return this.jButtonProcesarInformacionTasa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTasa)	{
		this.jButtonProcesarInformacionTasa = jButtonProcesarInformacionTasa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTasa() {
		return this.jComboBoxTiposAccionesTasa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTasa(
			JComboBox jComboBoxTiposRelacionesTasa) {
		this.jComboBoxTiposRelacionesTasa = jComboBoxTiposRelacionesTasa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTasa(
			JComboBox jComboBoxTiposAccionesTasa) {
		this.jComboBoxTiposAccionesTasa = jComboBoxTiposAccionesTasa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTasa() {
		return this.jComboBoxTiposAccionesFormularioTasa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTasa(
			JComboBox jComboBoxTiposAccionesFormularioTasa) {
		this.jComboBoxTiposAccionesFormularioTasa = jComboBoxTiposAccionesFormularioTasa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tasaSessionBean=new TasaSessionBean();
		
		this.tasaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tasaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tasaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TasaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TasaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TasaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tasa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
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
	
		TasaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTasa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTasa=new JButtonMe();
				this.jButtonModificarToolBarTasa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTasa,this.jTtoolBarDetalleTasa,
							"actualizar","actualizar","Actualizar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTasa,this.jTtoolBarDetalleTasa,
							"eliminar","eliminar","Eliminar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTasa,this.jTtoolBarDetalleTasa,
							"cancelar","cancelar","Cancelar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTasa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTasa,this.jTtoolBarDetalleTasa,
							"guardarcambios","guardarcambios","Guardar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTasa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTasa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTasa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTasa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTasa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTasa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTasa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTasa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTasa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTasa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTasa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTasa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTasa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTasa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTasa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTasa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTasa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTasa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTasa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTasa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTasa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTasa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTasa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTasa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTasa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTasa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTasa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTasa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTasa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTasa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTasa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTasa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTasa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTasa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTasa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTasa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTasa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTasa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTasa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTasa.add(this.jMenuItemDetalleCerrarTasa);
		
		this.jmenuDetalleAccionesTasa.add(this.jMenuItemActualizarTasa);
		this.jmenuDetalleAccionesTasa.add(this.jMenuItemEliminarTasa);
		this.jmenuDetalleAccionesTasa.add(this.jMenuItemCancelarTasa);		
		
		//this.jmenuDetalleDatosTasa.add(this.jMenuItemDetalleAbrirOrderByTasa);				
		this.jmenuDetalleDatosTasa.add(this.jMenuItemDetalleMostarOcultarTasa);				
				
		//this.jmenuDetalleAccionesTasa.add(this.jMenuItemGuardarCambiosTasa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTasa.add(this.jmenuDetalleArchivoTasa);		
		this.jmenuBarDetalleTasa.add(this.jmenuDetalleAccionesTasa);		
		this.jmenuBarDetalleTasa.add(this.jmenuDetalleDatosTasa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTasa);				
	}
	
	
	public void inicializarElementosCamposTasa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTasa = new JLabelMe();
		jLabelIdTasa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTasa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTasa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTasa.setToolTipText(TasaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTasa= new GridBagLayout();

		this.jPanelidTasa.setLayout(this.gridaBagLayoutTasa);

		jLabelidTasa = new JLabel();
		jLabelidTasa.setText("Id");

		jLabelidTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorTasa = new JLabelMe();
		this.jLabelvalorTasa.setText(""+TasaConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorTasa.setToolTipText("Valor");
		this.jLabelvalorTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorTasa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorTasa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorTasa.setToolTipText(TasaConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutTasa = new GridBagLayout();
		this.jPanelvalorTasa.setLayout(this.gridaBagLayoutTasa);


		jTextFieldvalorTasa= new JTextFieldMe();
		jTextFieldvalorTasa.setEnabled(false);
		jTextFieldvalorTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorTasa,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorTasa.setText("0.0");

		this.jButtonvalorTasaBusqueda= new JButtonMe();
		this.jButtonvalorTasaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorTasaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorTasaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorTasaBusqueda.setText("U");
		this.jButtonvalorTasaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorTasaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorTasaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorTasaBusqueda"));

		if(this.tasaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorTasaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTasa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTasa = new JLabelMe();
		this.jLabelid_empresaTasa.setText(""+TasaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTasa.setToolTipText("Empresa");
		this.jLabelid_empresaTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTasa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTasa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTasa.setToolTipText(TasaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTasa = new GridBagLayout();
		this.jPanelid_empresaTasa.setLayout(this.gridaBagLayoutTasa);


		jComboBoxid_empresaTasa= new JComboBoxMe();
		jComboBoxid_empresaTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTasa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTasa.setEnabled(false);

		this.jButtonid_empresaTasa= new JButtonMe();
		this.jButtonid_empresaTasa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTasa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTasa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTasa.setText("Buscar");
		this.jButtonid_empresaTasa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTasa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTasa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTasa"));

		this.jButtonid_empresaTasaBusqueda= new JButtonMe();
		this.jButtonid_empresaTasaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTasaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTasaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTasaBusqueda.setText("U");
		this.jButtonid_empresaTasaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTasaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTasaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTasaBusqueda"));

		if(this.tasaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTasaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTasaUpdate= new JButtonMe();
		this.jButtonid_empresaTasaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTasaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTasaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTasaUpdate.setText("U");
		this.jButtonid_empresaTasaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTasaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTasaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTasa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTasa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTasaUpdate"));



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
		//this.jInternalFrameDetalleTasa = new TasaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tasa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTasa= new GridBagLayout();
		

		
		String sToolTipTasa="";
		sToolTipTasa=TasaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTasa+="(Facturacion.Tasa)";
		}
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTasa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTasa = new JButtonMe();
		this.jButtonModificarTasa = new JButtonMe();
        this.jButtonActualizarTasa = new JButtonMe();
        this.jButtonEliminarTasa = new JButtonMe();
        this.jButtonCancelarTasa = new JButtonMe();
        this.jButtonGuardarCambiosTasa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTasa = new JButtonMe();
		this.jButtonCerrarTasa = new JButtonMe();
		
		this.jScrollPanelDatosTasa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTasa = new JScrollPane();
		this.jScrollPanelDatosGeneralTasa = new JScrollPane();
				
		
		
		this.jPanelCamposTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tasa";
		
		if(!this.tasaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tasas" + this.sPath));
		} else {
			this.jScrollPanelDatosTasa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTasa.setName("jPanelCamposTasa"); 

		this.jPanelCamposOcultosTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTasa.setName("jPanelCamposOcultosTasa"); 

        this.jPanelAccionesTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTasa.setToolTipText("Acciones");
        this.jPanelAccionesTasa.setName("Acciones"); 

		this.jPanelAccionesFormularioTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTasa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTasa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTasa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTasa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTasa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTasa.setText("Nuevo");
		this.jButtonModificarTasa.setText("Editar");
        this.jButtonActualizarTasa.setText("Actualizar");
        this.jButtonEliminarTasa.setText("Eliminar");
        this.jButtonCancelarTasa.setText("Cancelar");
        this.jButtonGuardarCambiosTasa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTasa.setText("Guardar");
		this.jButtonCerrarTasa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTasa,"nuevo_button","Nuevo",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTasa,"modificar_button","Editar",this.tasaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTasa,"actualizar_button","Actualizar",this.tasaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTasa,"eliminar_button","Eliminar",this.tasaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTasa,"cancelar_button","Cancelar",this.tasaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTasa,"guardarcambios_button","Guardar",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTasa,"guardarcambiostabla_button","Guardar",this.tasaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTasa,"cerrar_button","Salir",this.tasaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTasa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTasa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTasa.setToolTipText("Nuevo"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTasa.setToolTipText("Editar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTasa.setToolTipText("Actualizar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTasa.setToolTipText("Eliminar)"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTasa.setToolTipText("Cancelar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTasa.setToolTipText("Guardar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTasa.setToolTipText("Guardar"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTasa.setToolTipText("Salir"+" "+TasaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTasa";
		inputMap = this.jButtonNuevoTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTasa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTasa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTasa";
		inputMap = this.jButtonActualizarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTasa"));
		
		//ELIMINAR
		sMapKey = "EliminarTasa";
		inputMap = this.jButtonEliminarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTasa"));
		
		//CANCELAR	
		sMapKey = "CancelarTasa";
		inputMap = this.jButtonCancelarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTasa"));
		
		//CERRAR		
		sMapKey = "CerrarTasa";
		inputMap = this.jButtonCerrarTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTasa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTasa";
		inputMap = this.jButtonGuardarCambiosTablaTasa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTasa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTasa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTasa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTasa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTasa.setToolTipText("Nuevo Tasa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTasa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTasa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTasa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTasa.setToolTipText("Sin Cerrar Ventana Tasa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTasa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTasa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTasa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTasa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTasa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTasa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTasa.setText("Accion");
		this.jComboBoxTiposAccionesTasa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTasa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTasa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTasa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTasa = new JLabelMe();
		
		this.jLabelAccionesTasa.setText("Acciones");		
		this.jLabelAccionesTasa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTasa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTasa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTasa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTasa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTasa=new JTabbedPane();
		this.jTabbedPaneRelacionesTasa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTasa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTasa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTasa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTasa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTasa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTasa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTasa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTasa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTasa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTasa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTasa = new GridBagLayout();
		
		this.jPanelCamposTasa.setLayout(gridaBagLayoutCamposTasa);
		this.jPanelCamposOcultosTasa.setLayout(gridaBagLayoutCamposOcultosTasa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTasa.gridy = 0;
	this.gridBagConstraintsTasa.gridx = 0;
	this.gridBagConstraintsTasa.ipadx = 0;
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTasa.add(jLabelIdTasa, this.gridBagConstraintsTasa);



	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTasa.gridy = 0;
	this.gridBagConstraintsTasa.gridx = 1;
	this.gridBagConstraintsTasa.ipadx = 0;
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTasa.add(jLabelidTasa, this.gridBagConstraintsTasa);


	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTasa.gridy = 0;
	this.gridBagConstraintsTasa.gridx = 0;
	this.gridBagConstraintsTasa.ipadx = 0;
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTasa.add(jLabelid_empresaTasa, this.gridBagConstraintsTasa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTasa = new GridBagConstraints();
		//this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = 0;
		this.gridBagConstraintsTasa.gridx = 2;
		this.gridBagConstraintsTasa.ipadx = 0;
		this.gridBagConstraintsTasa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTasa.add(jButtonid_empresaTasaBusqueda, this.gridBagConstraintsTasa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTasa = new GridBagConstraints();
		//this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = 0;
		this.gridBagConstraintsTasa.gridx = 3;
		this.gridBagConstraintsTasa.ipadx = 0;
		this.gridBagConstraintsTasa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTasa.add(jButtonid_empresaTasaUpdate, this.gridBagConstraintsTasa);
	}

	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTasa.gridy = 0;
	this.gridBagConstraintsTasa.gridx = 1;
	this.gridBagConstraintsTasa.ipadx = 0;
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTasa.add(jComboBoxid_empresaTasa, this.gridBagConstraintsTasa);


	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTasa.gridy = 0;
	this.gridBagConstraintsTasa.gridx = 0;
	this.gridBagConstraintsTasa.ipadx = 0;
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorTasa.add(jLabelvalorTasa, this.gridBagConstraintsTasa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTasa = new GridBagConstraints();
		//this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTasa.gridy = 0;
		this.gridBagConstraintsTasa.gridx = 2;
		this.gridBagConstraintsTasa.ipadx = 0;
		this.gridBagConstraintsTasa.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorTasa.add(jButtonvalorTasaBusqueda, this.gridBagConstraintsTasa);
	}

	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTasa.gridy = 0;
	this.gridBagConstraintsTasa.gridx = 1;
	this.gridBagConstraintsTasa.ipadx = 0;
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorTasa.add(jTextFieldvalorTasa, this.gridBagConstraintsTasa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTasa.gridy = iYPanelCamposTasa;
	this.gridBagConstraintsTasa.gridx = iXPanelCamposTasa++;
	this.gridBagConstraintsTasa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTasa.add(this.jPanelidTasa, this.gridBagConstraintsTasa);



	if(iXPanelCamposTasa % 1==0) {
		iXPanelCamposTasa=0;
		iYPanelCamposTasa++;
	}
	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTasa.gridy = iYPanelCamposTasa;
	this.gridBagConstraintsTasa.gridx = iXPanelCamposTasa++;
	this.gridBagConstraintsTasa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTasa.add(this.jPanelvalorTasa, this.gridBagConstraintsTasa);



	if(iXPanelCamposTasa % 1==0) {
		iXPanelCamposTasa=0;
		iYPanelCamposTasa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTasa = new GridBagConstraints();
	this.gridBagConstraintsTasa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTasa.gridy = iYPanelCamposOcultosTasa;
	this.gridBagConstraintsTasa.gridx = iXPanelCamposOcultosTasa++;
	this.gridBagConstraintsTasa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTasa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTasa.add(this.jPanelid_empresaTasa, this.gridBagConstraintsTasa);



	if(iXPanelCamposOcultosTasa % 1==0) {
		iXPanelCamposOcultosTasa=0;
		iYPanelCamposOcultosTasa++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesTasa= new GridBagLayout();
		this.jPanelAccionesTasa.setLayout(gridaBagLayoutAccionesTasa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTasa= new GridBagLayout();
		this.jPanelAccionesFormularioTasa.setLayout(gridaBagLayoutAccionesFormularioTasa);
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTasa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTasa.add(this.jComboBoxTiposAccionesFormularioTasa, this.gridBagConstraintsTasa);

		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTasa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTasa.add(this.jCheckBoxPostAccionNuevoTasa, this.gridBagConstraintsTasa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tasaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTasa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTasa.add(this.jCheckBoxPostAccionSinCerrarTasa, this.gridBagConstraintsTasa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tasaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tasaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTasa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTasa.add(this.jCheckBoxPostAccionSinMensajeTasa, this.gridBagConstraintsTasa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = 0;
		this.gridBagConstraintsTasa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTasa.add(this.jButtonModificarTasa, this.gridBagConstraintsTasa);							

		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTasa.gridy = 0;
		this.gridBagConstraintsTasa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTasa.add(this.jButtonEliminarTasa, this.gridBagConstraintsTasa);
		
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = 0;		
		this.gridBagConstraintsTasa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTasa.add(this.jButtonActualizarTasa, this.gridBagConstraintsTasa);


		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = 0;		
		this.gridBagConstraintsTasa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTasa.add(this.jButtonGuardarCambiosTasa, this.gridBagConstraintsTasa);	
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = 0;		
		this.gridBagConstraintsTasa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTasa.add(this.jButtonCancelarTasa, this.gridBagConstraintsTasa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTasa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTasa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tasaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTasa = new GridBagConstraints();						
			this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTasa.gridx = 0;		
			//this.gridBagConstraintsTasa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTasa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTasa.gridx =0;
		this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTasa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTasa, this.gridBagConstraintsTasa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TasaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTasa = new TasaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tasa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tasa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tasa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TasaModel tasaModel=new TasaModel(this);
			
			//SI USARA CLASE INTERNA
			//TasaModel.TasaFocusTraversalPolicy tasaFocusTraversalPolicy = tasaModel.new TasaFocusTraversalPolicy(this);
			
			//tasaFocusTraversalPolicy.settasaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tasaModel);
			
			
			this.jContentPaneDetalleTasa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTasa = new GridBagLayout();	
			this.jContentPaneDetalleTasa.setLayout(gridaBagLayoutDetalleTasa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTasa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTasa = new GridBagConstraints();
				this.gridBagConstraintsTasa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTasa.gridx = 0;
					
				
				this.jContentPaneDetalleTasa.add(jTtoolBarDetalleTasa, gridBagConstraintsTasa);								
				
}
			
			this.jScrollPanelDatosEdicionTasa=   new JScrollPane(jContentPaneDetalleTasa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTasa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTasa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTasa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTasa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTasa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTasa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTasa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTasa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTasa.gridx = 0;
	        
			this.jContentPaneDetalleTasa.add(jPanelCamposTasa, gridBagConstraintsTasa);
			
			
			
			
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
						&& tasaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tasaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTasa= new GridBagConstraints();
						this.gridBagConstraintsTasa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTasa.gridx = 0;
						this.jContentPaneDetalleTasa.add(this.jTabbedPaneRelacionesTasa, this.gridBagConstraintsTasa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTasa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTasa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTasa = new GridBagConstraints();
					this.gridBagConstraintsTasa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTasa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTasa.gridx = 0;
					
				
					this.jContentPaneDetalleTasa.add(jPanelCamposOcultosTasa, gridBagConstraintsTasa);
				
					this.jPanelCamposOcultosTasa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTasa.gridx = 0;
	        this.gridBagConstraintsTasa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTasa.add(this.jPanelAccionesFormularioTasa, this.gridBagConstraintsTasa);							
			
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
	        this.gridBagConstraintsTasa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTasa.gridx = 0;
	        
			
			this.jContentPaneDetalleTasa.add(this.jPanelAccionesTasa, this.gridBagConstraintsTasa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTasa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTasa=   new JScrollPane(this.jPanelCamposTasa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTasa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTasa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTasa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTasa.gridx = 0;
			this.gridBagConstraintsTasa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTasa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTasa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTasa, this.gridBagConstraintsTasa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTasa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTasa, this.gridBagConstraintsTasa);			
			
			this.gridBagConstraintsTasa = new GridBagConstraints();
			this.gridBagConstraintsTasa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTasa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTasa, this.gridBagConstraintsTasa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTasa, this.gridBagConstraintsTasa);
			
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTasa, this.gridBagConstraintsTasa);
		
			
		this.gridBagConstraintsTasa = new GridBagConstraints();
		this.gridBagConstraintsTasa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTasa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTasa, this.gridBagConstraintsTasa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTasa;//jContentPane;
		
		return jScrollPanelDatosEdicionTasa;
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
