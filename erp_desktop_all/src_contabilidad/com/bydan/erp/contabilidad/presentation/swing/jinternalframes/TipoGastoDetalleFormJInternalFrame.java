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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoGastoConstantesFunciones;

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
public class TipoGastoDetalleFormJInternalFrame extends TipoGastoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGasto;
	
	protected JMenuBar jmenuBarDetalleTipoGasto;
	
	protected JMenu jmenuDetalleTipoGasto;
	protected JMenu jmenuDetalleArchivoTipoGasto;
	protected JMenu jmenuDetalleAccionesTipoGasto;
	protected JMenu jmenuDetalleDatosTipoGasto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGasto;	
	protected GridBagConstraints gridBagConstraintsTipoGasto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGastoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGasto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGastoSessionBean tipogastoSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoGastoLogic tipogastoLogic;
	
	public JScrollPane jScrollPanelDatosTipoGasto;
	public JScrollPane jScrollPanelDatosEdicionTipoGasto;
	public JScrollPane jScrollPanelDatosGeneralTipoGasto;
	
	protected JPanel jPanelCamposTipoGasto;    
	protected JPanel jPanelCamposOcultosTipoGasto;    	
	protected JPanel jPanelAccionesTipoGasto;
	protected JPanel jPanelAccionesFormularioTipoGasto;
    
	
	
	protected Integer iXPanelCamposTipoGasto=0;
	protected Integer iYPanelCamposTipoGasto=0;
	
	protected Integer iXPanelCamposOcultosTipoGasto=0;
	protected Integer iYPanelCamposOcultosTipoGasto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGasto;
	public JButton jButtonModificarTipoGasto;
	public JButton jButtonActualizarTipoGasto;
    public JButton jButtonEliminarTipoGasto;
	public JButton jButtonCancelarTipoGasto;
    public JButton jButtonGuardarCambiosTipoGasto;
	public JButton jButtonGuardarCambiosTablaTipoGasto;
	protected JButton jButtonCerrarTipoGasto;
	
	
	protected JButton jButtonProcesarInformacionTipoGasto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGasto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGasto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGasto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGasto;
	protected JButton jButtonModificarToolBarTipoGasto;
	protected JButton jButtonActualizarToolBarTipoGasto;
    protected JButton jButtonEliminarToolBarTipoGasto;
	protected JButton jButtonCancelarToolBarTipoGasto;
    protected JButton jButtonGuardarCambiosToolBarTipoGasto;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGasto;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGasto;
	protected JButton jButtonCerrarToolBarTipoGasto;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGasto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGasto;
	protected JMenuItem jMenuItemModificarTipoGasto;
	protected JMenuItem jMenuItemActualizarTipoGasto;
    protected JMenuItem jMenuItemEliminarTipoGasto;
	protected JMenuItem jMenuItemCancelarTipoGasto;
    protected JMenuItem jMenuItemGuardarCambiosTipoGasto;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGasto;
	protected JMenuItem jMenuItemCerrarTipoGasto;
	protected JMenuItem jMenuItemDetalleCerrarTipoGasto;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGasto;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGasto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGasto;
	protected JMenuItem jMenuItemMostrarOcultarTipoGasto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGasto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGasto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGasto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGasto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGasto;
	public JLabel jLabelIdTipoGasto;
	public JLabel jLabelidTipoGasto;
	public JButton jButtonidTipoGastoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGasto;
	public JLabel jLabelnombreTipoGasto;
	public JTextArea jTextAreanombreTipoGasto;
	public JScrollPane jscrollPanenombreTipoGasto;
	public JButton jButtonnombreTipoGastoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoGasto;
	public JLabel jLabelid_paisTipoGasto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoGasto;
	public JButton jButtonid_paisTipoGasto= new JButtonMe();
	public JButton jButtonid_paisTipoGastoUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoGastoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGasto;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGastoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGasto=new JPanel();
				this.jPanelAccionesFormularioTipoGasto=new JPanel();
				this.jmenuBarDetalleTipoGasto=new JMenuBar();
				this.jTtoolBarDetalleTipoGasto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGastoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGasto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGasto() {
		return this.jButtonActualizarToolBarTipoGasto;
	}
	
	public JButton getjButtonEliminarToolBarTipoGasto() {
		return this.jButtonEliminarToolBarTipoGasto;
	}
	
	public JButton getjButtonCancelarToolBarTipoGasto() {
		return this.jButtonCancelarToolBarTipoGasto;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGasto() {
		return this.jButtonProcesarInformacionTipoGasto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGasto)	{
		this.jButtonProcesarInformacionTipoGasto = jButtonProcesarInformacionTipoGasto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGasto() {
		return this.jComboBoxTiposAccionesTipoGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGasto(
			JComboBox jComboBoxTiposRelacionesTipoGasto) {
		this.jComboBoxTiposRelacionesTipoGasto = jComboBoxTiposRelacionesTipoGasto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGasto(
			JComboBox jComboBoxTiposAccionesTipoGasto) {
		this.jComboBoxTiposAccionesTipoGasto = jComboBoxTiposAccionesTipoGasto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGasto() {
		return this.jComboBoxTiposAccionesFormularioTipoGasto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGasto(
			JComboBox jComboBoxTiposAccionesFormularioTipoGasto) {
		this.jComboBoxTiposAccionesFormularioTipoGasto = jComboBoxTiposAccionesFormularioTipoGasto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogastoSessionBean=new TipoGastoSessionBean();
		
		this.tipogastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto  MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGastoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGasto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGasto=new JButtonMe();
				this.jButtonModificarToolBarTipoGasto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGasto,this.jTtoolBarDetalleTipoGasto,
							"actualizar","actualizar","Actualizar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGasto,this.jTtoolBarDetalleTipoGasto,
							"eliminar","eliminar","Eliminar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGasto,this.jTtoolBarDetalleTipoGasto,
							"cancelar","cancelar","Cancelar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGasto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGasto,this.jTtoolBarDetalleTipoGasto,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGasto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGasto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGasto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGasto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGasto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGasto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGasto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGasto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGasto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGasto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGasto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGasto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGasto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGasto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGasto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGasto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGasto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGasto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGasto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGasto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGasto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGasto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGasto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGasto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGasto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGasto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGasto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGasto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGasto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGasto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGasto.add(this.jMenuItemDetalleCerrarTipoGasto);
		
		this.jmenuDetalleAccionesTipoGasto.add(this.jMenuItemActualizarTipoGasto);
		this.jmenuDetalleAccionesTipoGasto.add(this.jMenuItemEliminarTipoGasto);
		this.jmenuDetalleAccionesTipoGasto.add(this.jMenuItemCancelarTipoGasto);		
		
		//this.jmenuDetalleDatosTipoGasto.add(this.jMenuItemDetalleAbrirOrderByTipoGasto);				
		this.jmenuDetalleDatosTipoGasto.add(this.jMenuItemDetalleMostarOcultarTipoGasto);				
				
		//this.jmenuDetalleAccionesTipoGasto.add(this.jMenuItemGuardarCambiosTipoGasto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGasto.add(this.jmenuDetalleArchivoTipoGasto);		
		this.jmenuBarDetalleTipoGasto.add(this.jmenuDetalleAccionesTipoGasto);		
		this.jmenuBarDetalleTipoGasto.add(this.jmenuDetalleDatosTipoGasto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGasto);				
	}
	
	
	public void inicializarElementosCamposTipoGasto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGasto = new JLabelMe();
		jLabelIdTipoGasto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGasto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGasto.setToolTipText(TipoGastoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGasto= new GridBagLayout();

		this.jPanelidTipoGasto.setLayout(this.gridaBagLayoutTipoGasto);

		jLabelidTipoGasto = new JLabel();
		jLabelidTipoGasto.setText("Id");

		jLabelidTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoGasto = new JLabelMe();
		this.jLabelnombreTipoGasto.setText(""+TipoGastoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGasto.setToolTipText("Nombre");
		this.jLabelnombreTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGasto.setToolTipText(TipoGastoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGasto = new GridBagLayout();
		this.jPanelnombreTipoGasto.setLayout(this.gridaBagLayoutTipoGasto);


		jTextAreanombreTipoGasto= new JTextAreaMe();
		jTextAreanombreTipoGasto.setEnabled(false);
		jTextAreanombreTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGasto.setLineWrap(true);
		jTextAreanombreTipoGasto.setWrapStyleWord(true);
		jTextAreanombreTipoGasto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGasto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGasto = new JScrollPane(jTextAreanombreTipoGasto);
		jscrollPanenombreTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoGastoBusqueda= new JButtonMe();
		this.jButtonnombreTipoGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGastoBusqueda.setText("U");
		this.jButtonnombreTipoGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGastoBusqueda"));

		if(this.tipogastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGastoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGasto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoGasto = new JLabelMe();
		this.jLabelid_paisTipoGasto.setText(""+TipoGastoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoGasto.setToolTipText("Pais");
		this.jLabelid_paisTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoGasto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoGasto.setToolTipText(TipoGastoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoGasto = new GridBagLayout();
		this.jPanelid_paisTipoGasto.setLayout(this.gridaBagLayoutTipoGasto);


		jComboBoxid_paisTipoGasto= new JComboBoxMe();
		jComboBoxid_paisTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoGasto= new JButtonMe();
		this.jButtonid_paisTipoGasto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGasto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGasto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGasto.setText("Buscar");
		this.jButtonid_paisTipoGasto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoGasto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGasto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGasto"));

		this.jButtonid_paisTipoGastoBusqueda= new JButtonMe();
		this.jButtonid_paisTipoGastoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGastoBusqueda.setText("U");
		this.jButtonid_paisTipoGastoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoGastoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGastoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGastoBusqueda"));

		if(this.tipogastoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoGastoBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoGastoUpdate= new JButtonMe();
		this.jButtonid_paisTipoGastoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGastoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGastoUpdate.setText("U");
		this.jButtonid_paisTipoGastoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoGastoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGastoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGastoUpdate"));



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
		//this.jInternalFrameDetalleTipoGasto = new TipoGastoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Gasto  DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGasto= new GridBagLayout();
		

		
		String sToolTipTipoGasto="";
		sToolTipTipoGasto=TipoGastoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGasto+="(Contabilidad.TipoGasto)";
		}
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGasto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGasto = new JButtonMe();
		this.jButtonModificarTipoGasto = new JButtonMe();
        this.jButtonActualizarTipoGasto = new JButtonMe();
        this.jButtonEliminarTipoGasto = new JButtonMe();
        this.jButtonCancelarTipoGasto = new JButtonMe();
        this.jButtonGuardarCambiosTipoGasto = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGasto = new JButtonMe();
		this.jButtonCerrarTipoGasto = new JButtonMe();
		
		this.jScrollPanelDatosTipoGasto = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGasto = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGasto = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto ";
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto s" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGasto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGasto.setName("jPanelCamposTipoGasto"); 

		this.jPanelCamposOcultosTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGasto.setName("jPanelCamposOcultosTipoGasto"); 

        this.jPanelAccionesTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGasto.setToolTipText("Acciones");
        this.jPanelAccionesTipoGasto.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGasto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGasto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGasto.setText("Nuevo");
		this.jButtonModificarTipoGasto.setText("Editar");
        this.jButtonActualizarTipoGasto.setText("Actualizar");
        this.jButtonEliminarTipoGasto.setText("Eliminar");
        this.jButtonCancelarTipoGasto.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGasto.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGasto.setText("Guardar");
		this.jButtonCerrarTipoGasto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGasto,"nuevo_button","Nuevo",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGasto,"modificar_button","Editar",this.tipogastoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGasto,"actualizar_button","Actualizar",this.tipogastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGasto,"eliminar_button","Eliminar",this.tipogastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGasto,"cancelar_button","Cancelar",this.tipogastoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGasto,"guardarcambios_button","Guardar",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGasto,"guardarcambiostabla_button","Guardar",this.tipogastoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGasto,"cerrar_button","Salir",this.tipogastoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGasto.setToolTipText("Nuevo"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGasto.setToolTipText("Editar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGasto.setToolTipText("Actualizar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGasto.setToolTipText("Eliminar)"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGasto.setToolTipText("Cancelar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGasto.setToolTipText("Guardar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGasto.setToolTipText("Guardar"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGasto.setToolTipText("Salir"+" "+TipoGastoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGasto";
		inputMap = this.jButtonNuevoTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGasto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGasto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGasto";
		inputMap = this.jButtonActualizarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGasto"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGasto";
		inputMap = this.jButtonEliminarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGasto"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGasto";
		inputMap = this.jButtonCancelarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGasto"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGasto";
		inputMap = this.jButtonCerrarTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGasto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGasto";
		inputMap = this.jButtonGuardarCambiosTablaTipoGasto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGasto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGasto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGasto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGasto.setToolTipText("Nuevo TipoGasto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGasto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGasto.setToolTipText("Sin Cerrar Ventana TipoGasto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGasto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGasto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGasto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGasto.setText("Accion");
		this.jComboBoxTiposAccionesTipoGasto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGasto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGasto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGasto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGasto = new JLabelMe();
		
		this.jLabelAccionesTipoGasto.setText("Acciones");		
		this.jLabelAccionesTipoGasto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGasto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGasto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGasto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGasto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGasto=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGasto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGasto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGasto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGasto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGasto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGasto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGasto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGasto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGasto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGasto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGasto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGasto = new GridBagLayout();
		
		this.jPanelCamposTipoGasto.setLayout(gridaBagLayoutCamposTipoGasto);
		this.jPanelCamposOcultosTipoGasto.setLayout(gridaBagLayoutCamposOcultosTipoGasto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGasto.gridy = 0;
	this.gridBagConstraintsTipoGasto.gridx = 0;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGasto.add(jLabelIdTipoGasto, this.gridBagConstraintsTipoGasto);



	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGasto.gridy = 0;
	this.gridBagConstraintsTipoGasto.gridx = 1;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGasto.add(jLabelidTipoGasto, this.gridBagConstraintsTipoGasto);


	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGasto.gridy = 0;
	this.gridBagConstraintsTipoGasto.gridx = 0;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoGasto.add(jLabelid_paisTipoGasto, this.gridBagConstraintsTipoGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		//this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = 0;
		this.gridBagConstraintsTipoGasto.gridx = 2;
		this.gridBagConstraintsTipoGasto.ipadx = 0;
		this.gridBagConstraintsTipoGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGasto.add(jButtonid_paisTipoGastoBusqueda, this.gridBagConstraintsTipoGasto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		//this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = 0;
		this.gridBagConstraintsTipoGasto.gridx = 3;
		this.gridBagConstraintsTipoGasto.ipadx = 0;
		this.gridBagConstraintsTipoGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGasto.add(jButtonid_paisTipoGastoUpdate, this.gridBagConstraintsTipoGasto);
	}

	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGasto.gridy = 0;
	this.gridBagConstraintsTipoGasto.gridx = 1;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoGasto.add(jComboBoxid_paisTipoGasto, this.gridBagConstraintsTipoGasto);


	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGasto.gridy = 0;
	this.gridBagConstraintsTipoGasto.gridx = 0;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGasto.add(jLabelnombreTipoGasto, this.gridBagConstraintsTipoGasto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		//this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGasto.gridy = 0;
		this.gridBagConstraintsTipoGasto.gridx = 2;
		this.gridBagConstraintsTipoGasto.ipadx = 0;
		this.gridBagConstraintsTipoGasto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGasto.add(jButtonnombreTipoGastoBusqueda, this.gridBagConstraintsTipoGasto);
	}

	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGasto.gridy = 0;
	this.gridBagConstraintsTipoGasto.gridx = 1;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGasto.add(jscrollPanenombreTipoGasto, this.gridBagConstraintsTipoGasto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGasto.gridy = iYPanelCamposTipoGasto;
	this.gridBagConstraintsTipoGasto.gridx = iXPanelCamposTipoGasto++;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGasto.add(this.jPanelidTipoGasto, this.gridBagConstraintsTipoGasto);



	if(iXPanelCamposTipoGasto % 1==0) {
		iXPanelCamposTipoGasto=0;
		iYPanelCamposTipoGasto++;
	}
	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGasto.gridy = iYPanelCamposTipoGasto;
	this.gridBagConstraintsTipoGasto.gridx = iXPanelCamposTipoGasto++;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGasto.add(this.jPanelid_paisTipoGasto, this.gridBagConstraintsTipoGasto);



	if(iXPanelCamposTipoGasto % 1==0) {
		iXPanelCamposTipoGasto=0;
		iYPanelCamposTipoGasto++;
	}
	this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGasto.gridy = iYPanelCamposTipoGasto;
	this.gridBagConstraintsTipoGasto.gridx = iXPanelCamposTipoGasto++;
	this.gridBagConstraintsTipoGasto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGasto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGasto.add(this.jPanelnombreTipoGasto, this.gridBagConstraintsTipoGasto);



	if(iXPanelCamposTipoGasto % 1==0) {
		iXPanelCamposTipoGasto=0;
		iYPanelCamposTipoGasto++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGasto= new GridBagLayout();
		this.jPanelAccionesTipoGasto.setLayout(gridaBagLayoutAccionesTipoGasto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGasto= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGasto.setLayout(gridaBagLayoutAccionesFormularioTipoGasto);
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGasto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGasto.add(this.jComboBoxTiposAccionesFormularioTipoGasto, this.gridBagConstraintsTipoGasto);

		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGasto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGasto.add(this.jCheckBoxPostAccionNuevoTipoGasto, this.gridBagConstraintsTipoGasto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGasto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGasto.add(this.jCheckBoxPostAccionSinCerrarTipoGasto, this.gridBagConstraintsTipoGasto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGasto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGasto.add(this.jCheckBoxPostAccionSinMensajeTipoGasto, this.gridBagConstraintsTipoGasto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = 0;
		this.gridBagConstraintsTipoGasto.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGasto.add(this.jButtonModificarTipoGasto, this.gridBagConstraintsTipoGasto);							

		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGasto.gridy = 0;
		this.gridBagConstraintsTipoGasto.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGasto.add(this.jButtonEliminarTipoGasto, this.gridBagConstraintsTipoGasto);
		
			
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = 0;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGasto.add(this.jButtonActualizarTipoGasto, this.gridBagConstraintsTipoGasto);


		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = 0;		
		this.gridBagConstraintsTipoGasto.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGasto.add(this.jButtonGuardarCambiosTipoGasto, this.gridBagConstraintsTipoGasto);	
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = 0;		
		this.gridBagConstraintsTipoGasto.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGasto.add(this.jButtonCancelarTipoGasto, this.gridBagConstraintsTipoGasto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGasto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGasto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();						
			this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGasto.gridx = 0;		
			//this.gridBagConstraintsTipoGasto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGasto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGasto.gridx =0;
		this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGasto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGasto, this.gridBagConstraintsTipoGasto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGasto = new TipoGastoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Gasto  DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Gasto  DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto  Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGastoModel tipogastoModel=new TipoGastoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGastoModel.TipoGastoFocusTraversalPolicy tipogastoFocusTraversalPolicy = tipogastoModel.new TipoGastoFocusTraversalPolicy(this);
			
			//tipogastoFocusTraversalPolicy.settipogastoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogastoModel);
			
			
			this.jContentPaneDetalleTipoGasto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGasto = new GridBagLayout();	
			this.jContentPaneDetalleTipoGasto.setLayout(gridaBagLayoutDetalleTipoGasto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGasto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGasto = new GridBagConstraints();
				this.gridBagConstraintsTipoGasto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGasto.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGasto.add(jTtoolBarDetalleTipoGasto, gridBagConstraintsTipoGasto);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGasto=   new JScrollPane(jContentPaneDetalleTipoGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGasto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGasto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGasto.gridx = 0;
	        
			this.jContentPaneDetalleTipoGasto.add(jPanelCamposTipoGasto, gridBagConstraintsTipoGasto);
			
			
			
			
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
						&& tipogastoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGasto= new GridBagConstraints();
						this.gridBagConstraintsTipoGasto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGasto.gridx = 0;
						this.jContentPaneDetalleTipoGasto.add(this.jTabbedPaneRelacionesTipoGasto, this.gridBagConstraintsTipoGasto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGasto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGasto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGasto = new GridBagConstraints();
					this.gridBagConstraintsTipoGasto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGasto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGasto.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGasto.add(jPanelCamposOcultosTipoGasto, gridBagConstraintsTipoGasto);
				
					this.jPanelCamposOcultosTipoGasto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGasto.gridx = 0;
	        this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGasto.add(this.jPanelAccionesFormularioTipoGasto, this.gridBagConstraintsTipoGasto);							
			
			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
	        this.gridBagConstraintsTipoGasto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGasto.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGasto.add(this.jPanelAccionesTipoGasto, this.gridBagConstraintsTipoGasto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGasto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGasto=   new JScrollPane(this.jPanelCamposTipoGasto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGasto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGasto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGasto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGasto.gridx = 0;
			this.gridBagConstraintsTipoGasto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGasto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGasto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGasto, this.gridBagConstraintsTipoGasto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGasto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGasto, this.gridBagConstraintsTipoGasto);			
			
			this.gridBagConstraintsTipoGasto = new GridBagConstraints();
			this.gridBagConstraintsTipoGasto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGasto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGasto, this.gridBagConstraintsTipoGasto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGasto, this.gridBagConstraintsTipoGasto);
			
			
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGasto, this.gridBagConstraintsTipoGasto);
		
			
		this.gridBagConstraintsTipoGasto = new GridBagConstraints();
		this.gridBagConstraintsTipoGasto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGasto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGasto, this.gridBagConstraintsTipoGasto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGasto;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGasto;
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
