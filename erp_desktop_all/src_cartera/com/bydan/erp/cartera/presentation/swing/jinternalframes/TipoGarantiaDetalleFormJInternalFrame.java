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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoGarantiaConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoGarantiaDetalleFormJInternalFrame extends TipoGarantiaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGarantia;
	
	protected JMenuBar jmenuBarDetalleTipoGarantia;
	
	protected JMenu jmenuDetalleTipoGarantia;
	protected JMenu jmenuDetalleArchivoTipoGarantia;
	protected JMenu jmenuDetalleAccionesTipoGarantia;
	protected JMenu jmenuDetalleDatosTipoGarantia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGarantia;	
	protected GridBagConstraints gridBagConstraintsTipoGarantia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGarantiaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGarantia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGarantiaSessionBean tipogarantiaSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoGarantiaLogic tipogarantiaLogic;
	
	public JScrollPane jScrollPanelDatosTipoGarantia;
	public JScrollPane jScrollPanelDatosEdicionTipoGarantia;
	public JScrollPane jScrollPanelDatosGeneralTipoGarantia;
	
	protected JPanel jPanelCamposTipoGarantia;    
	protected JPanel jPanelCamposOcultosTipoGarantia;    	
	protected JPanel jPanelAccionesTipoGarantia;
	protected JPanel jPanelAccionesFormularioTipoGarantia;
    
	
	
	protected Integer iXPanelCamposTipoGarantia=0;
	protected Integer iYPanelCamposTipoGarantia=0;
	
	protected Integer iXPanelCamposOcultosTipoGarantia=0;
	protected Integer iYPanelCamposOcultosTipoGarantia=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGarantia;
	public JButton jButtonModificarTipoGarantia;
	public JButton jButtonActualizarTipoGarantia;
    public JButton jButtonEliminarTipoGarantia;
	public JButton jButtonCancelarTipoGarantia;
    public JButton jButtonGuardarCambiosTipoGarantia;
	public JButton jButtonGuardarCambiosTablaTipoGarantia;
	protected JButton jButtonCerrarTipoGarantia;
	
	
	protected JButton jButtonProcesarInformacionTipoGarantia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGarantia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGarantia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGarantia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGarantia;
	protected JButton jButtonModificarToolBarTipoGarantia;
	protected JButton jButtonActualizarToolBarTipoGarantia;
    protected JButton jButtonEliminarToolBarTipoGarantia;
	protected JButton jButtonCancelarToolBarTipoGarantia;
    protected JButton jButtonGuardarCambiosToolBarTipoGarantia;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGarantia;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGarantia;
	protected JButton jButtonCerrarToolBarTipoGarantia;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGarantia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGarantia;
	protected JMenuItem jMenuItemModificarTipoGarantia;
	protected JMenuItem jMenuItemActualizarTipoGarantia;
    protected JMenuItem jMenuItemEliminarTipoGarantia;
	protected JMenuItem jMenuItemCancelarTipoGarantia;
    protected JMenuItem jMenuItemGuardarCambiosTipoGarantia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGarantia;
	protected JMenuItem jMenuItemCerrarTipoGarantia;
	protected JMenuItem jMenuItemDetalleCerrarTipoGarantia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGarantia;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGarantia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGarantia;
	protected JMenuItem jMenuItemMostrarOcultarTipoGarantia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGarantia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGarantia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGarantia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGarantia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGarantia;
	public JLabel jLabelIdTipoGarantia;
	public JTextFieldMe jTextFieldidTipoGarantia;
	public JButton jButtonidTipoGarantiaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoGarantia;
	public JLabel jLabelcodigoTipoGarantia;
	public JTextField jTextFieldcodigoTipoGarantia;
	public JButton jButtoncodigoTipoGarantiaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGarantia;
	public JLabel jLabelnombreTipoGarantia;
	public JTextArea jTextAreanombreTipoGarantia;
	public JScrollPane jscrollPanenombreTipoGarantia;
	public JButton jButtonnombreTipoGarantiaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoGarantia;
	public JLabel jLabelid_paisTipoGarantia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoGarantia;
	public JButton jButtonid_paisTipoGarantia= new JButtonMe();
	public JButton jButtonid_paisTipoGarantiaUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoGarantiaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGarantia;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGarantiaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGarantia=new JPanel();
				this.jPanelAccionesFormularioTipoGarantia=new JPanel();
				this.jmenuBarDetalleTipoGarantia=new JMenuBar();
				this.jTtoolBarDetalleTipoGarantia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGarantiaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGarantiaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGarantia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGarantia() {
		return this.jButtonActualizarToolBarTipoGarantia;
	}
	
	public JButton getjButtonEliminarToolBarTipoGarantia() {
		return this.jButtonEliminarToolBarTipoGarantia;
	}
	
	public JButton getjButtonCancelarToolBarTipoGarantia() {
		return this.jButtonCancelarToolBarTipoGarantia;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGarantia() {
		return this.jButtonProcesarInformacionTipoGarantia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGarantia)	{
		this.jButtonProcesarInformacionTipoGarantia = jButtonProcesarInformacionTipoGarantia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGarantia() {
		return this.jComboBoxTiposAccionesTipoGarantia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGarantia(
			JComboBox jComboBoxTiposRelacionesTipoGarantia) {
		this.jComboBoxTiposRelacionesTipoGarantia = jComboBoxTiposRelacionesTipoGarantia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGarantia(
			JComboBox jComboBoxTiposAccionesTipoGarantia) {
		this.jComboBoxTiposAccionesTipoGarantia = jComboBoxTiposAccionesTipoGarantia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGarantia() {
		return this.jComboBoxTiposAccionesFormularioTipoGarantia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGarantia(
			JComboBox jComboBoxTiposAccionesFormularioTipoGarantia) {
		this.jComboBoxTiposAccionesFormularioTipoGarantia = jComboBoxTiposAccionesFormularioTipoGarantia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogarantiaSessionBean=new TipoGarantiaSessionBean();
		
		this.tipogarantiaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogarantiaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogarantiaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGarantiaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGarantiaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGarantiaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Garantia MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGarantiaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGarantia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGarantia=new JButtonMe();
				this.jButtonModificarToolBarTipoGarantia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGarantia,this.jTtoolBarDetalleTipoGarantia,
							"actualizar","actualizar","Actualizar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGarantia,this.jTtoolBarDetalleTipoGarantia,
							"eliminar","eliminar","Eliminar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGarantia,this.jTtoolBarDetalleTipoGarantia,
							"cancelar","cancelar","Cancelar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGarantia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGarantia,this.jTtoolBarDetalleTipoGarantia,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGarantia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGarantia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGarantia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGarantia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGarantia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGarantia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGarantia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGarantia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGarantia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGarantia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGarantia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGarantia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGarantia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGarantia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGarantia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGarantia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGarantia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGarantia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGarantia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGarantia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGarantia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGarantia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGarantia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGarantia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGarantia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGarantia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGarantia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGarantia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGarantia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGarantia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGarantia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGarantia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGarantia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGarantia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGarantia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGarantia.add(this.jMenuItemDetalleCerrarTipoGarantia);
		
		this.jmenuDetalleAccionesTipoGarantia.add(this.jMenuItemActualizarTipoGarantia);
		this.jmenuDetalleAccionesTipoGarantia.add(this.jMenuItemEliminarTipoGarantia);
		this.jmenuDetalleAccionesTipoGarantia.add(this.jMenuItemCancelarTipoGarantia);		
		
		//this.jmenuDetalleDatosTipoGarantia.add(this.jMenuItemDetalleAbrirOrderByTipoGarantia);				
		this.jmenuDetalleDatosTipoGarantia.add(this.jMenuItemDetalleMostarOcultarTipoGarantia);				
				
		//this.jmenuDetalleAccionesTipoGarantia.add(this.jMenuItemGuardarCambiosTipoGarantia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGarantia.add(this.jmenuDetalleArchivoTipoGarantia);		
		this.jmenuBarDetalleTipoGarantia.add(this.jmenuDetalleAccionesTipoGarantia);		
		this.jmenuBarDetalleTipoGarantia.add(this.jmenuDetalleDatosTipoGarantia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGarantia);				
	}
	
	
	public void inicializarElementosCamposTipoGarantia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGarantia = new JLabelMe();
		jLabelIdTipoGarantia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGarantia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGarantia.setToolTipText(TipoGarantiaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGarantia= new GridBagLayout();

		this.jPanelidTipoGarantia.setLayout(this.gridaBagLayoutTipoGarantia);

		jTextFieldidTipoGarantia = new JTextFieldMe();
		jTextFieldidTipoGarantia.setText("Id");

		jTextFieldidTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoGarantia = new JLabelMe();
		this.jLabelcodigoTipoGarantia.setText(""+TipoGarantiaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoGarantia.setToolTipText("Codigo");
		this.jLabelcodigoTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoGarantia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoGarantia.setToolTipText(TipoGarantiaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoGarantia = new GridBagLayout();
		this.jPanelcodigoTipoGarantia.setLayout(this.gridaBagLayoutTipoGarantia);


		jTextFieldcodigoTipoGarantia= new JTextFieldMe();

		jTextFieldcodigoTipoGarantia.setEnabled(false);
		jTextFieldcodigoTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoGarantiaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoGarantiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGarantiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGarantiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoGarantiaBusqueda.setText("U");
		this.jButtoncodigoTipoGarantiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoGarantiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoGarantiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoGarantiaBusqueda"));

		if(this.tipogarantiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoGarantiaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoGarantia = new JLabelMe();
		this.jLabelnombreTipoGarantia.setText(""+TipoGarantiaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGarantia.setToolTipText("Nombre");
		this.jLabelnombreTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGarantia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGarantia.setToolTipText(TipoGarantiaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGarantia = new GridBagLayout();
		this.jPanelnombreTipoGarantia.setLayout(this.gridaBagLayoutTipoGarantia);


		jTextAreanombreTipoGarantia= new JTextAreaMe();
		jTextAreanombreTipoGarantia.setEnabled(false);
		jTextAreanombreTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGarantia.setLineWrap(true);
		jTextAreanombreTipoGarantia.setWrapStyleWord(true);
		jTextAreanombreTipoGarantia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGarantia.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGarantia = new JScrollPane(jTextAreanombreTipoGarantia);
		jscrollPanenombreTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGarantiaBusqueda= new JButtonMe();
		this.jButtonnombreTipoGarantiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGarantiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGarantiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGarantiaBusqueda.setText("U");
		this.jButtonnombreTipoGarantiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGarantiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGarantiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGarantiaBusqueda"));

		if(this.tipogarantiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGarantiaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGarantia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoGarantia = new JLabelMe();
		this.jLabelid_paisTipoGarantia.setText(""+TipoGarantiaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoGarantia.setToolTipText("Pais");
		this.jLabelid_paisTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoGarantia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoGarantia.setToolTipText(TipoGarantiaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoGarantia = new GridBagLayout();
		this.jPanelid_paisTipoGarantia.setLayout(this.gridaBagLayoutTipoGarantia);


		jComboBoxid_paisTipoGarantia= new JComboBoxMe();
		jComboBoxid_paisTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoGarantia= new JButtonMe();
		this.jButtonid_paisTipoGarantia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGarantia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGarantia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGarantia.setText("Buscar");
		this.jButtonid_paisTipoGarantia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoGarantia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGarantia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGarantia"));

		this.jButtonid_paisTipoGarantiaBusqueda= new JButtonMe();
		this.jButtonid_paisTipoGarantiaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGarantiaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGarantiaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGarantiaBusqueda.setText("U");
		this.jButtonid_paisTipoGarantiaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoGarantiaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGarantiaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGarantiaBusqueda"));

		if(this.tipogarantiaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoGarantiaBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoGarantiaUpdate= new JButtonMe();
		this.jButtonid_paisTipoGarantiaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGarantiaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGarantiaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGarantiaUpdate.setText("U");
		this.jButtonid_paisTipoGarantiaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoGarantiaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGarantiaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoGarantia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGarantia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGarantiaUpdate"));



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
		//this.jInternalFrameDetalleTipoGarantia = new TipoGarantiaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Garantia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGarantia= new GridBagLayout();
		

		
		String sToolTipTipoGarantia="";
		sToolTipTipoGarantia=TipoGarantiaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGarantia+="(Cartera.TipoGarantia)";
		}
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGarantia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGarantia = new JButtonMe();
		this.jButtonModificarTipoGarantia = new JButtonMe();
        this.jButtonActualizarTipoGarantia = new JButtonMe();
        this.jButtonEliminarTipoGarantia = new JButtonMe();
        this.jButtonCancelarTipoGarantia = new JButtonMe();
        this.jButtonGuardarCambiosTipoGarantia = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGarantia = new JButtonMe();
		this.jButtonCerrarTipoGarantia = new JButtonMe();
		
		this.jScrollPanelDatosTipoGarantia = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGarantia = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGarantia = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Garantia";
		
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Garantias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGarantia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGarantia.setName("jPanelCamposTipoGarantia"); 

		this.jPanelCamposOcultosTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGarantia.setName("jPanelCamposOcultosTipoGarantia"); 

        this.jPanelAccionesTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGarantia.setToolTipText("Acciones");
        this.jPanelAccionesTipoGarantia.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGarantia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGarantia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGarantia.setText("Nuevo");
		this.jButtonModificarTipoGarantia.setText("Editar");
        this.jButtonActualizarTipoGarantia.setText("Actualizar");
        this.jButtonEliminarTipoGarantia.setText("Eliminar");
        this.jButtonCancelarTipoGarantia.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGarantia.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGarantia.setText("Guardar");
		this.jButtonCerrarTipoGarantia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGarantia,"nuevo_button","Nuevo",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGarantia,"modificar_button","Editar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGarantia,"actualizar_button","Actualizar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGarantia,"eliminar_button","Eliminar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGarantia,"cancelar_button","Cancelar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGarantia,"guardarcambios_button","Guardar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGarantia,"guardarcambiostabla_button","Guardar",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGarantia,"cerrar_button","Salir",this.tipogarantiaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGarantia.setToolTipText("Nuevo"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGarantia.setToolTipText("Editar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGarantia.setToolTipText("Actualizar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGarantia.setToolTipText("Eliminar)"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGarantia.setToolTipText("Cancelar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGarantia.setToolTipText("Guardar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGarantia.setToolTipText("Guardar"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGarantia.setToolTipText("Salir"+" "+TipoGarantiaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGarantia";
		inputMap = this.jButtonNuevoTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGarantia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGarantia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGarantia";
		inputMap = this.jButtonActualizarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGarantia"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGarantia";
		inputMap = this.jButtonEliminarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGarantia"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGarantia";
		inputMap = this.jButtonCancelarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGarantia"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGarantia";
		inputMap = this.jButtonCerrarTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGarantia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGarantia";
		inputMap = this.jButtonGuardarCambiosTablaTipoGarantia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGarantia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGarantia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGarantia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGarantia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGarantia.setToolTipText("Nuevo TipoGarantia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGarantia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGarantia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGarantia.setToolTipText("Sin Cerrar Ventana TipoGarantia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGarantia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGarantia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGarantia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGarantia.setText("Accion");
		this.jComboBoxTiposAccionesTipoGarantia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGarantia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGarantia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGarantia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGarantia = new JLabelMe();
		
		this.jLabelAccionesTipoGarantia.setText("Acciones");		
		this.jLabelAccionesTipoGarantia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGarantia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGarantia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGarantia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGarantia=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGarantia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGarantia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGarantia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGarantia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGarantia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGarantia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGarantia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGarantia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGarantia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGarantia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGarantia = new GridBagLayout();
		
		this.jPanelCamposTipoGarantia.setLayout(gridaBagLayoutCamposTipoGarantia);
		this.jPanelCamposOcultosTipoGarantia.setLayout(gridaBagLayoutCamposOcultosTipoGarantia);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 0;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGarantia.add(jLabelIdTipoGarantia, this.gridBagConstraintsTipoGarantia);



	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 1;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGarantia.add(jTextFieldidTipoGarantia, this.gridBagConstraintsTipoGarantia);


	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 0;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoGarantia.add(jLabelid_paisTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx = 2;
		this.gridBagConstraintsTipoGarantia.ipadx = 0;
		this.gridBagConstraintsTipoGarantia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGarantia.add(jButtonid_paisTipoGarantiaBusqueda, this.gridBagConstraintsTipoGarantia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx = 3;
		this.gridBagConstraintsTipoGarantia.ipadx = 0;
		this.gridBagConstraintsTipoGarantia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGarantia.add(jButtonid_paisTipoGarantiaUpdate, this.gridBagConstraintsTipoGarantia);
	}

	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 1;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoGarantia.add(jComboBoxid_paisTipoGarantia, this.gridBagConstraintsTipoGarantia);


	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 0;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoGarantia.add(jLabelcodigoTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx = 2;
		this.gridBagConstraintsTipoGarantia.ipadx = 0;
		this.gridBagConstraintsTipoGarantia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoGarantia.add(jButtoncodigoTipoGarantiaBusqueda, this.gridBagConstraintsTipoGarantia);
	}

	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 1;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoGarantia.add(jTextFieldcodigoTipoGarantia, this.gridBagConstraintsTipoGarantia);


	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 0;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGarantia.add(jLabelnombreTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		//this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx = 2;
		this.gridBagConstraintsTipoGarantia.ipadx = 0;
		this.gridBagConstraintsTipoGarantia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGarantia.add(jButtonnombreTipoGarantiaBusqueda, this.gridBagConstraintsTipoGarantia);
	}

	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGarantia.gridy = 0;
	this.gridBagConstraintsTipoGarantia.gridx = 1;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGarantia.add(jscrollPanenombreTipoGarantia, this.gridBagConstraintsTipoGarantia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantia.gridy = iYPanelCamposTipoGarantia;
	this.gridBagConstraintsTipoGarantia.gridx = iXPanelCamposTipoGarantia++;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantia.add(this.jPanelidTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(iXPanelCamposTipoGarantia % 1==0) {
		iXPanelCamposTipoGarantia=0;
		iYPanelCamposTipoGarantia++;
	}
	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantia.gridy = iYPanelCamposTipoGarantia;
	this.gridBagConstraintsTipoGarantia.gridx = iXPanelCamposTipoGarantia++;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantia.add(this.jPanelid_paisTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(iXPanelCamposTipoGarantia % 1==0) {
		iXPanelCamposTipoGarantia=0;
		iYPanelCamposTipoGarantia++;
	}
	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantia.gridy = iYPanelCamposTipoGarantia;
	this.gridBagConstraintsTipoGarantia.gridx = iXPanelCamposTipoGarantia++;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantia.add(this.jPanelcodigoTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(iXPanelCamposTipoGarantia % 1==0) {
		iXPanelCamposTipoGarantia=0;
		iYPanelCamposTipoGarantia++;
	}
	this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGarantia.gridy = iYPanelCamposTipoGarantia;
	this.gridBagConstraintsTipoGarantia.gridx = iXPanelCamposTipoGarantia++;
	this.gridBagConstraintsTipoGarantia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGarantia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGarantia.add(this.jPanelnombreTipoGarantia, this.gridBagConstraintsTipoGarantia);



	if(iXPanelCamposTipoGarantia % 1==0) {
		iXPanelCamposTipoGarantia=0;
		iYPanelCamposTipoGarantia++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGarantia= new GridBagLayout();
		this.jPanelAccionesTipoGarantia.setLayout(gridaBagLayoutAccionesTipoGarantia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGarantia= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGarantia.setLayout(gridaBagLayoutAccionesFormularioTipoGarantia);
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGarantia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGarantia.add(this.jComboBoxTiposAccionesFormularioTipoGarantia, this.gridBagConstraintsTipoGarantia);

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGarantia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGarantia.add(this.jCheckBoxPostAccionNuevoTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGarantia.add(this.jCheckBoxPostAccionSinCerrarTipoGarantia, this.gridBagConstraintsTipoGarantia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogarantiaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogarantiaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGarantia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGarantia.add(this.jCheckBoxPostAccionSinMensajeTipoGarantia, this.gridBagConstraintsTipoGarantia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGarantia.add(this.jButtonModificarTipoGarantia, this.gridBagConstraintsTipoGarantia);							

		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGarantia.gridy = 0;
		this.gridBagConstraintsTipoGarantia.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGarantia.add(this.jButtonEliminarTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
			
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = 0;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGarantia.add(this.jButtonActualizarTipoGarantia, this.gridBagConstraintsTipoGarantia);


		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = 0;		
		this.gridBagConstraintsTipoGarantia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGarantia.add(this.jButtonGuardarCambiosTipoGarantia, this.gridBagConstraintsTipoGarantia);	
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = 0;		
		this.gridBagConstraintsTipoGarantia.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGarantia.add(this.jButtonCancelarTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGarantia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGarantia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogarantiaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();						
			this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGarantia.gridx = 0;		
			//this.gridBagConstraintsTipoGarantia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGarantia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGarantia.gridx =0;
		this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGarantia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGarantia, this.gridBagConstraintsTipoGarantia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGarantiaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGarantia = new TipoGarantiaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Garantia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Garantia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Garantia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGarantiaModel tipogarantiaModel=new TipoGarantiaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGarantiaModel.TipoGarantiaFocusTraversalPolicy tipogarantiaFocusTraversalPolicy = tipogarantiaModel.new TipoGarantiaFocusTraversalPolicy(this);
			
			//tipogarantiaFocusTraversalPolicy.settipogarantiaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogarantiaModel);
			
			
			this.jContentPaneDetalleTipoGarantia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGarantia = new GridBagLayout();	
			this.jContentPaneDetalleTipoGarantia.setLayout(gridaBagLayoutDetalleTipoGarantia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGarantia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
				this.gridBagConstraintsTipoGarantia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGarantia.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGarantia.add(jTtoolBarDetalleTipoGarantia, gridBagConstraintsTipoGarantia);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGarantia=   new JScrollPane(jContentPaneDetalleTipoGarantia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGarantia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGarantia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGarantia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGarantia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGarantia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGarantia.gridx = 0;
	        
			this.jContentPaneDetalleTipoGarantia.add(jPanelCamposTipoGarantia, gridBagConstraintsTipoGarantia);
			
			
			
			
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
						&& tipogarantiaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipogarantiaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGarantia= new GridBagConstraints();
						this.gridBagConstraintsTipoGarantia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGarantia.gridx = 0;
						this.jContentPaneDetalleTipoGarantia.add(this.jTabbedPaneRelacionesTipoGarantia, this.gridBagConstraintsTipoGarantia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGarantia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGarantia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
					this.gridBagConstraintsTipoGarantia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGarantia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGarantia.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGarantia.add(jPanelCamposOcultosTipoGarantia, gridBagConstraintsTipoGarantia);
				
					this.jPanelCamposOcultosTipoGarantia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGarantia.gridx = 0;
	        this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGarantia.add(this.jPanelAccionesFormularioTipoGarantia, this.gridBagConstraintsTipoGarantia);							
			
			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
	        this.gridBagConstraintsTipoGarantia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGarantia.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGarantia.add(this.jPanelAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGarantia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGarantia=   new JScrollPane(this.jPanelCamposTipoGarantia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGarantia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGarantia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGarantia.gridx = 0;
			this.gridBagConstraintsTipoGarantia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGarantia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGarantia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGarantia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGarantia, this.gridBagConstraintsTipoGarantia);			
			
			this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
			this.gridBagConstraintsTipoGarantia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGarantia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGarantia, this.gridBagConstraintsTipoGarantia);
			
			
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGarantia, this.gridBagConstraintsTipoGarantia);
		
			
		this.gridBagConstraintsTipoGarantia = new GridBagConstraints();
		this.gridBagConstraintsTipoGarantia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGarantia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGarantia, this.gridBagConstraintsTipoGarantia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGarantia;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGarantia;
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
