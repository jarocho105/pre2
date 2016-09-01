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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoInvenConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoInvenDetalleFormJInternalFrame extends TipoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoInven;
	
	protected JMenuBar jmenuBarDetalleTipoInven;
	
	protected JMenu jmenuDetalleTipoInven;
	protected JMenu jmenuDetalleArchivoTipoInven;
	protected JMenu jmenuDetalleAccionesTipoInven;
	protected JMenu jmenuDetalleDatosTipoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoInven;	
	protected GridBagConstraints gridBagConstraintsTipoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoInvenSessionBean tipoinvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoInvenLogic tipoinvenLogic;
	
	public JScrollPane jScrollPanelDatosTipoInven;
	public JScrollPane jScrollPanelDatosEdicionTipoInven;
	public JScrollPane jScrollPanelDatosGeneralTipoInven;
	
	protected JPanel jPanelCamposTipoInven;    
	protected JPanel jPanelCamposOcultosTipoInven;    	
	protected JPanel jPanelAccionesTipoInven;
	protected JPanel jPanelAccionesFormularioTipoInven;
    
	
	
	protected Integer iXPanelCamposTipoInven=0;
	protected Integer iYPanelCamposTipoInven=0;
	
	protected Integer iXPanelCamposOcultosTipoInven=0;
	protected Integer iYPanelCamposOcultosTipoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoInven;
	public JButton jButtonModificarTipoInven;
	public JButton jButtonActualizarTipoInven;
    public JButton jButtonEliminarTipoInven;
	public JButton jButtonCancelarTipoInven;
    public JButton jButtonGuardarCambiosTipoInven;
	public JButton jButtonGuardarCambiosTablaTipoInven;
	protected JButton jButtonCerrarTipoInven;
	
	
	protected JButton jButtonProcesarInformacionTipoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoInven;
	protected JButton jButtonModificarToolBarTipoInven;
	protected JButton jButtonActualizarToolBarTipoInven;
    protected JButton jButtonEliminarToolBarTipoInven;
	protected JButton jButtonCancelarToolBarTipoInven;
    protected JButton jButtonGuardarCambiosToolBarTipoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoInven;
	protected JButton jButtonCerrarToolBarTipoInven;
	
	protected JButton jButtonProcesarInformacionToolBarTipoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoInven;
	protected JMenuItem jMenuItemModificarTipoInven;
	protected JMenuItem jMenuItemActualizarTipoInven;
    protected JMenuItem jMenuItemEliminarTipoInven;
	protected JMenuItem jMenuItemCancelarTipoInven;
    protected JMenuItem jMenuItemGuardarCambiosTipoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoInven;
	protected JMenuItem jMenuItemCerrarTipoInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoInven;
	public JLabel jLabelIdTipoInven;
	public JLabel jLabelidTipoInven;
	public JButton jButtonidTipoInvenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoInven;
	public JLabel jLabelcodigoTipoInven;
	public JTextField jTextFieldcodigoTipoInven;
	public JButton jButtoncodigoTipoInvenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoInven;
	public JLabel jLabelnombreTipoInven;
	public JTextField jTextFieldnombreTipoInven;
	public JButton jButtonnombreTipoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoInven;
	public JLabel jLabelid_empresaTipoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoInven;
	public JButton jButtonid_empresaTipoInven= new JButtonMe();
	public JButton jButtonid_empresaTipoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoInven;
	
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
	
	public TipoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoInven=new JPanel();
				this.jPanelAccionesFormularioTipoInven=new JPanel();
				this.jmenuBarDetalleTipoInven=new JMenuBar();
				this.jTtoolBarDetalleTipoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoInven() {
		return this.jButtonActualizarToolBarTipoInven;
	}
	
	public JButton getjButtonEliminarToolBarTipoInven() {
		return this.jButtonEliminarToolBarTipoInven;
	}
	
	public JButton getjButtonCancelarToolBarTipoInven() {
		return this.jButtonCancelarToolBarTipoInven;
	}		
	
	public JButton getjButtonProcesarInformacionTipoInven() {
		return this.jButtonProcesarInformacionTipoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoInven)	{
		this.jButtonProcesarInformacionTipoInven = jButtonProcesarInformacionTipoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoInven() {
		return this.jComboBoxTiposAccionesTipoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoInven(
			JComboBox jComboBoxTiposRelacionesTipoInven) {
		this.jComboBoxTiposRelacionesTipoInven = jComboBoxTiposRelacionesTipoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoInven(
			JComboBox jComboBoxTiposAccionesTipoInven) {
		this.jComboBoxTiposAccionesTipoInven = jComboBoxTiposAccionesTipoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoInven() {
		return this.jComboBoxTiposAccionesFormularioTipoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoInven(
			JComboBox jComboBoxTiposAccionesFormularioTipoInven) {
		this.jComboBoxTiposAccionesFormularioTipoInven = jComboBoxTiposAccionesFormularioTipoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoinvenSessionBean=new TipoInvenSessionBean();
		
		this.tipoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Inven MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoInven=new JButtonMe();
				this.jButtonModificarToolBarTipoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoInven,this.jTtoolBarDetalleTipoInven,
							"actualizar","actualizar","Actualizar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoInven,this.jTtoolBarDetalleTipoInven,
							"eliminar","eliminar","Eliminar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoInven,this.jTtoolBarDetalleTipoInven,
							"cancelar","cancelar","Cancelar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoInven,this.jTtoolBarDetalleTipoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoInven.add(this.jMenuItemDetalleCerrarTipoInven);
		
		this.jmenuDetalleAccionesTipoInven.add(this.jMenuItemActualizarTipoInven);
		this.jmenuDetalleAccionesTipoInven.add(this.jMenuItemEliminarTipoInven);
		this.jmenuDetalleAccionesTipoInven.add(this.jMenuItemCancelarTipoInven);		
		
		//this.jmenuDetalleDatosTipoInven.add(this.jMenuItemDetalleAbrirOrderByTipoInven);				
		this.jmenuDetalleDatosTipoInven.add(this.jMenuItemDetalleMostarOcultarTipoInven);				
				
		//this.jmenuDetalleAccionesTipoInven.add(this.jMenuItemGuardarCambiosTipoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoInven.add(this.jmenuDetalleArchivoTipoInven);		
		this.jmenuBarDetalleTipoInven.add(this.jmenuDetalleAccionesTipoInven);		
		this.jmenuBarDetalleTipoInven.add(this.jmenuDetalleDatosTipoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoInven);				
	}
	
	
	public void inicializarElementosCamposTipoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoInven = new JLabelMe();
		jLabelIdTipoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoInven.setToolTipText(TipoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoInven= new GridBagLayout();

		this.jPanelidTipoInven.setLayout(this.gridaBagLayoutTipoInven);

		jLabelidTipoInven = new JLabel();
		jLabelidTipoInven.setText("Id");

		jLabelidTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoInven = new JLabelMe();
		this.jLabelcodigoTipoInven.setText(""+TipoInvenConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoInven.setToolTipText("Codigo");
		this.jLabelcodigoTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoInven.setToolTipText(TipoInvenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoInven = new GridBagLayout();
		this.jPanelcodigoTipoInven.setLayout(this.gridaBagLayoutTipoInven);


		jTextFieldcodigoTipoInven= new JTextFieldMe();

		jTextFieldcodigoTipoInven.setEnabled(false);
		jTextFieldcodigoTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoInvenBusqueda= new JButtonMe();
		this.jButtoncodigoTipoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoInvenBusqueda.setText("U");
		this.jButtoncodigoTipoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoInvenBusqueda"));

		if(this.tipoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoInvenBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoInven = new JLabelMe();
		this.jLabelnombreTipoInven.setText(""+TipoInvenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoInven.setToolTipText("Nombre");
		this.jLabelnombreTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoInven.setToolTipText(TipoInvenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoInven = new GridBagLayout();
		this.jPanelnombreTipoInven.setLayout(this.gridaBagLayoutTipoInven);


		jTextFieldnombreTipoInven= new JTextFieldMe();

		jTextFieldnombreTipoInven.setEnabled(false);
		jTextFieldnombreTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoInvenBusqueda= new JButtonMe();
		this.jButtonnombreTipoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoInvenBusqueda.setText("U");
		this.jButtonnombreTipoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoInvenBusqueda"));

		if(this.tipoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoInven = new JLabelMe();
		this.jLabelid_empresaTipoInven.setText(""+TipoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoInven.setToolTipText("Empresa");
		this.jLabelid_empresaTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoInven.setToolTipText(TipoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoInven = new GridBagLayout();
		this.jPanelid_empresaTipoInven.setLayout(this.gridaBagLayoutTipoInven);


		jComboBoxid_empresaTipoInven= new JComboBoxMe();
		jComboBoxid_empresaTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoInven.setEnabled(false);

		this.jButtonid_empresaTipoInven= new JButtonMe();
		this.jButtonid_empresaTipoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoInven.setText("Buscar");
		this.jButtonid_empresaTipoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInven"));

		this.jButtonid_empresaTipoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoInvenBusqueda.setText("U");
		this.jButtonid_empresaTipoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInvenBusqueda"));

		if(this.tipoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaTipoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoInvenUpdate.setText("U");
		this.jButtonid_empresaTipoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoInvenUpdate"));



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
		//this.jInternalFrameDetalleTipoInven = new TipoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoInven= new GridBagLayout();
		

		
		String sToolTipTipoInven="";
		sToolTipTipoInven=TipoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoInven+="(Inventario.TipoInven)";
		}
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoInven = new JButtonMe();
		this.jButtonModificarTipoInven = new JButtonMe();
        this.jButtonActualizarTipoInven = new JButtonMe();
        this.jButtonEliminarTipoInven = new JButtonMe();
        this.jButtonCancelarTipoInven = new JButtonMe();
        this.jButtonGuardarCambiosTipoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoInven = new JButtonMe();
		this.jButtonCerrarTipoInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoInven = new JScrollPane();
				
		
		
		this.jPanelCamposTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Inven";
		
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoInven.setName("jPanelCamposTipoInven"); 

		this.jPanelCamposOcultosTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoInven.setName("jPanelCamposOcultosTipoInven"); 

        this.jPanelAccionesTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoInven.setText("Nuevo");
		this.jButtonModificarTipoInven.setText("Editar");
        this.jButtonActualizarTipoInven.setText("Actualizar");
        this.jButtonEliminarTipoInven.setText("Eliminar");
        this.jButtonCancelarTipoInven.setText("Cancelar");
        this.jButtonGuardarCambiosTipoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoInven.setText("Guardar");
		this.jButtonCerrarTipoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoInven,"nuevo_button","Nuevo",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoInven,"modificar_button","Editar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoInven,"actualizar_button","Actualizar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoInven,"eliminar_button","Eliminar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoInven,"cancelar_button","Cancelar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoInven,"guardarcambios_button","Guardar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoInven,"guardarcambiostabla_button","Guardar",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoInven,"cerrar_button","Salir",this.tipoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoInven.setToolTipText("Nuevo"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoInven.setToolTipText("Editar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoInven.setToolTipText("Actualizar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoInven.setToolTipText("Eliminar)"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoInven.setToolTipText("Cancelar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoInven.setToolTipText("Guardar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoInven.setToolTipText("Guardar"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoInven.setToolTipText("Salir"+" "+TipoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoInven";
		inputMap = this.jButtonNuevoTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoInven";
		inputMap = this.jButtonActualizarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoInven";
		inputMap = this.jButtonEliminarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoInven";
		inputMap = this.jButtonCancelarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoInven"));
		
		//CERRAR		
		sMapKey = "CerrarTipoInven";
		inputMap = this.jButtonCerrarTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoInven.setToolTipText("Nuevo TipoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoInven.setToolTipText("Sin Cerrar Ventana TipoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoInven = new JLabelMe();
		
		this.jLabelAccionesTipoInven.setText("Acciones");		
		this.jLabelAccionesTipoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoInven = new GridBagLayout();
		
		this.jPanelCamposTipoInven.setLayout(gridaBagLayoutCamposTipoInven);
		this.jPanelCamposOcultosTipoInven.setLayout(gridaBagLayoutCamposOcultosTipoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 0;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoInven.add(jLabelIdTipoInven, this.gridBagConstraintsTipoInven);



	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 1;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoInven.add(jLabelidTipoInven, this.gridBagConstraintsTipoInven);


	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 0;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoInven.add(jLabelid_empresaTipoInven, this.gridBagConstraintsTipoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx = 2;
		this.gridBagConstraintsTipoInven.ipadx = 0;
		this.gridBagConstraintsTipoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoInven.add(jButtonid_empresaTipoInvenBusqueda, this.gridBagConstraintsTipoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx = 3;
		this.gridBagConstraintsTipoInven.ipadx = 0;
		this.gridBagConstraintsTipoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoInven.add(jButtonid_empresaTipoInvenUpdate, this.gridBagConstraintsTipoInven);
	}

	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 1;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoInven.add(jComboBoxid_empresaTipoInven, this.gridBagConstraintsTipoInven);


	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 0;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoInven.add(jLabelcodigoTipoInven, this.gridBagConstraintsTipoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx = 2;
		this.gridBagConstraintsTipoInven.ipadx = 0;
		this.gridBagConstraintsTipoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoInven.add(jButtoncodigoTipoInvenBusqueda, this.gridBagConstraintsTipoInven);
	}

	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 1;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoInven.add(jTextFieldcodigoTipoInven, this.gridBagConstraintsTipoInven);


	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 0;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoInven.add(jLabelnombreTipoInven, this.gridBagConstraintsTipoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx = 2;
		this.gridBagConstraintsTipoInven.ipadx = 0;
		this.gridBagConstraintsTipoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoInven.add(jButtonnombreTipoInvenBusqueda, this.gridBagConstraintsTipoInven);
	}

	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoInven.gridy = 0;
	this.gridBagConstraintsTipoInven.gridx = 1;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoInven.add(jTextFieldnombreTipoInven, this.gridBagConstraintsTipoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInven.gridy = iYPanelCamposTipoInven;
	this.gridBagConstraintsTipoInven.gridx = iXPanelCamposTipoInven++;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInven.add(this.jPanelidTipoInven, this.gridBagConstraintsTipoInven);



	if(iXPanelCamposTipoInven % 1==0) {
		iXPanelCamposTipoInven=0;
		iYPanelCamposTipoInven++;
	}
	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInven.gridy = iYPanelCamposTipoInven;
	this.gridBagConstraintsTipoInven.gridx = iXPanelCamposTipoInven++;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInven.add(this.jPanelcodigoTipoInven, this.gridBagConstraintsTipoInven);



	if(iXPanelCamposTipoInven % 1==0) {
		iXPanelCamposTipoInven=0;
		iYPanelCamposTipoInven++;
	}
	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInven.gridy = iYPanelCamposTipoInven;
	this.gridBagConstraintsTipoInven.gridx = iXPanelCamposTipoInven++;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoInven.add(this.jPanelnombreTipoInven, this.gridBagConstraintsTipoInven);



	if(iXPanelCamposTipoInven % 1==0) {
		iXPanelCamposTipoInven=0;
		iYPanelCamposTipoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoInven.gridy = iYPanelCamposOcultosTipoInven;
	this.gridBagConstraintsTipoInven.gridx = iXPanelCamposOcultosTipoInven++;
	this.gridBagConstraintsTipoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoInven.add(this.jPanelid_empresaTipoInven, this.gridBagConstraintsTipoInven);



	if(iXPanelCamposOcultosTipoInven % 1==0) {
		iXPanelCamposOcultosTipoInven=0;
		iYPanelCamposOcultosTipoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoInven= new GridBagLayout();
		this.jPanelAccionesTipoInven.setLayout(gridaBagLayoutAccionesTipoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoInven= new GridBagLayout();
		this.jPanelAccionesFormularioTipoInven.setLayout(gridaBagLayoutAccionesFormularioTipoInven);
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInven.add(this.jComboBoxTiposAccionesFormularioTipoInven, this.gridBagConstraintsTipoInven);

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoInven.add(this.jCheckBoxPostAccionNuevoTipoInven, this.gridBagConstraintsTipoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInven.add(this.jCheckBoxPostAccionSinCerrarTipoInven, this.gridBagConstraintsTipoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoInven.add(this.jCheckBoxPostAccionSinMensajeTipoInven, this.gridBagConstraintsTipoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoInven.add(this.jButtonModificarTipoInven, this.gridBagConstraintsTipoInven);							

		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoInven.gridy = 0;
		this.gridBagConstraintsTipoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoInven.add(this.jButtonEliminarTipoInven, this.gridBagConstraintsTipoInven);
		
			
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = 0;		
		this.gridBagConstraintsTipoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInven.add(this.jButtonActualizarTipoInven, this.gridBagConstraintsTipoInven);


		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = 0;		
		this.gridBagConstraintsTipoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoInven.add(this.jButtonGuardarCambiosTipoInven, this.gridBagConstraintsTipoInven);	
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = 0;		
		this.gridBagConstraintsTipoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoInven.add(this.jButtonCancelarTipoInven, this.gridBagConstraintsTipoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoInven.gridx = 0;		
			//this.gridBagConstraintsTipoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoInven.gridx =0;
		this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoInven, this.gridBagConstraintsTipoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoInven = new TipoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoInvenModel tipoinvenModel=new TipoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoInvenModel.TipoInvenFocusTraversalPolicy tipoinvenFocusTraversalPolicy = tipoinvenModel.new TipoInvenFocusTraversalPolicy(this);
			
			//tipoinvenFocusTraversalPolicy.settipoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoinvenModel);
			
			
			this.jContentPaneDetalleTipoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoInven = new GridBagLayout();	
			this.jContentPaneDetalleTipoInven.setLayout(gridaBagLayoutDetalleTipoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoInven.gridx = 0;
					
				
				this.jContentPaneDetalleTipoInven.add(jTtoolBarDetalleTipoInven, gridBagConstraintsTipoInven);								
				
}
			
			this.jScrollPanelDatosEdicionTipoInven=   new JScrollPane(jContentPaneDetalleTipoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoInven.gridx = 0;
	        
			this.jContentPaneDetalleTipoInven.add(jPanelCamposTipoInven, gridBagConstraintsTipoInven);
			
			
			
			
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
						&& tipoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoInven= new GridBagConstraints();
						this.gridBagConstraintsTipoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoInven.gridx = 0;
						this.jContentPaneDetalleTipoInven.add(this.jTabbedPaneRelacionesTipoInven, this.gridBagConstraintsTipoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoInven = new GridBagConstraints();
					this.gridBagConstraintsTipoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoInven.gridx = 0;
					
				
					this.jContentPaneDetalleTipoInven.add(jPanelCamposOcultosTipoInven, gridBagConstraintsTipoInven);
				
					this.jPanelCamposOcultosTipoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoInven.gridx = 0;
	        this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoInven.add(this.jPanelAccionesFormularioTipoInven, this.gridBagConstraintsTipoInven);							
			
			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
	        this.gridBagConstraintsTipoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoInven.add(this.jPanelAccionesTipoInven, this.gridBagConstraintsTipoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoInven=   new JScrollPane(this.jPanelCamposTipoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoInven.gridx = 0;
			this.gridBagConstraintsTipoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoInven, this.gridBagConstraintsTipoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoInven, this.gridBagConstraintsTipoInven);			
			
			this.gridBagConstraintsTipoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoInven, this.gridBagConstraintsTipoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoInven, this.gridBagConstraintsTipoInven);
			
			
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoInven, this.gridBagConstraintsTipoInven);
		
			
		this.gridBagConstraintsTipoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoInven, this.gridBagConstraintsTipoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoInven;
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
