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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.TipoPruebaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class TipoPruebaDetalleFormJInternalFrame extends TipoPruebaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoPrueba;
	
	protected JMenuBar jmenuBarDetalleTipoPrueba;
	
	protected JMenu jmenuDetalleTipoPrueba;
	protected JMenu jmenuDetalleArchivoTipoPrueba;
	protected JMenu jmenuDetalleAccionesTipoPrueba;
	protected JMenu jmenuDetalleDatosTipoPrueba;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoPrueba;	
	protected GridBagConstraints gridBagConstraintsTipoPrueba;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoPruebaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoPrueba;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoPruebaSessionBean tipopruebaSessionBean;
	
	
	
		
	
	public TipoPruebaLogic tipopruebaLogic;
	
	public JScrollPane jScrollPanelDatosTipoPrueba;
	public JScrollPane jScrollPanelDatosEdicionTipoPrueba;
	public JScrollPane jScrollPanelDatosGeneralTipoPrueba;
	
	protected JPanel jPanelCamposTipoPrueba;    
	protected JPanel jPanelCamposOcultosTipoPrueba;    	
	protected JPanel jPanelAccionesTipoPrueba;
	protected JPanel jPanelAccionesFormularioTipoPrueba;
    
	
	
	protected Integer iXPanelCamposTipoPrueba=0;
	protected Integer iYPanelCamposTipoPrueba=0;
	
	protected Integer iXPanelCamposOcultosTipoPrueba=0;
	protected Integer iYPanelCamposOcultosTipoPrueba=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoPrueba;
	public JButton jButtonModificarTipoPrueba;
	public JButton jButtonActualizarTipoPrueba;
    public JButton jButtonEliminarTipoPrueba;
	public JButton jButtonCancelarTipoPrueba;
    public JButton jButtonGuardarCambiosTipoPrueba;
	public JButton jButtonGuardarCambiosTablaTipoPrueba;
	protected JButton jButtonCerrarTipoPrueba;
	
	
	protected JButton jButtonProcesarInformacionTipoPrueba;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoPrueba;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoPrueba;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoPrueba;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoPrueba;
	protected JButton jButtonModificarToolBarTipoPrueba;
	protected JButton jButtonActualizarToolBarTipoPrueba;
    protected JButton jButtonEliminarToolBarTipoPrueba;
	protected JButton jButtonCancelarToolBarTipoPrueba;
    protected JButton jButtonGuardarCambiosToolBarTipoPrueba;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoPrueba;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoPrueba;
	protected JButton jButtonCerrarToolBarTipoPrueba;
	
	protected JButton jButtonProcesarInformacionToolBarTipoPrueba;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoPrueba;
	protected JMenuItem jMenuItemModificarTipoPrueba;
	protected JMenuItem jMenuItemActualizarTipoPrueba;
    protected JMenuItem jMenuItemEliminarTipoPrueba;
	protected JMenuItem jMenuItemCancelarTipoPrueba;
    protected JMenuItem jMenuItemGuardarCambiosTipoPrueba;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoPrueba;
	protected JMenuItem jMenuItemCerrarTipoPrueba;
	protected JMenuItem jMenuItemDetalleCerrarTipoPrueba;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoPrueba;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoPrueba;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoPrueba;
	protected JMenuItem jMenuItemMostrarOcultarTipoPrueba;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoPrueba;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoPrueba;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoPrueba;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoPrueba;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoPrueba;
	public JLabel jLabelIdTipoPrueba;
	public JTextFieldMe jTextFieldidTipoPrueba;
	public JButton jButtonidTipoPruebaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoPrueba;
	public JLabel jLabelcodigoTipoPrueba;
	public JTextField jTextFieldcodigoTipoPrueba;
	public JButton jButtoncodigoTipoPruebaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoPrueba;
	public JLabel jLabelnombreTipoPrueba;
	public JTextArea jTextAreanombreTipoPrueba;
	public JScrollPane jscrollPanenombreTipoPrueba;
	public JButton jButtonnombreTipoPruebaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoPrueba;
	
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
	
	public TipoPruebaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoPrueba=new JPanel();
				this.jPanelAccionesFormularioTipoPrueba=new JPanel();
				this.jmenuBarDetalleTipoPrueba=new JMenuBar();
				this.jTtoolBarDetalleTipoPrueba=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoPruebaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoPruebaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoPrueba No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoPrueba() {
		return this.jButtonActualizarToolBarTipoPrueba;
	}
	
	public JButton getjButtonEliminarToolBarTipoPrueba() {
		return this.jButtonEliminarToolBarTipoPrueba;
	}
	
	public JButton getjButtonCancelarToolBarTipoPrueba() {
		return this.jButtonCancelarToolBarTipoPrueba;
	}		
	
	public JButton getjButtonProcesarInformacionTipoPrueba() {
		return this.jButtonProcesarInformacionTipoPrueba;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoPrueba)	{
		this.jButtonProcesarInformacionTipoPrueba = jButtonProcesarInformacionTipoPrueba;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoPrueba() {
		return this.jComboBoxTiposAccionesTipoPrueba;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoPrueba(
			JComboBox jComboBoxTiposRelacionesTipoPrueba) {
		this.jComboBoxTiposRelacionesTipoPrueba = jComboBoxTiposRelacionesTipoPrueba;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoPrueba(
			JComboBox jComboBoxTiposAccionesTipoPrueba) {
		this.jComboBoxTiposAccionesTipoPrueba = jComboBoxTiposAccionesTipoPrueba;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoPrueba() {
		return this.jComboBoxTiposAccionesFormularioTipoPrueba;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoPrueba(
			JComboBox jComboBoxTiposAccionesFormularioTipoPrueba) {
		this.jComboBoxTiposAccionesFormularioTipoPrueba = jComboBoxTiposAccionesFormularioTipoPrueba;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipopruebaSessionBean=new TipoPruebaSessionBean();
		
		this.tipopruebaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipopruebaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipopruebaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoPruebaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoPruebaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoPruebaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Prueba MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoPruebaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoPrueba= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoPrueba=new JButtonMe();
				this.jButtonModificarToolBarTipoPrueba=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoPrueba,this.jTtoolBarDetalleTipoPrueba,
							"actualizar","actualizar","Actualizar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoPrueba,this.jTtoolBarDetalleTipoPrueba,
							"eliminar","eliminar","Eliminar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoPrueba,this.jTtoolBarDetalleTipoPrueba,
							"cancelar","cancelar","Cancelar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoPrueba=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoPrueba,this.jTtoolBarDetalleTipoPrueba,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoPrueba=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoPrueba=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoPrueba=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoPrueba=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoPrueba=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoPrueba= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoPrueba.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoPrueba,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoPrueba= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoPrueba.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoPrueba,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoPrueba= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoPrueba.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoPrueba,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoPrueba= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoPrueba.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoPrueba,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoPrueba= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoPrueba.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoPrueba,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoPrueba= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoPrueba.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoPrueba,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoPrueba= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoPrueba.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoPrueba,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoPrueba= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoPrueba.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoPrueba,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoPrueba= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoPrueba.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoPrueba,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoPrueba= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoPrueba.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoPrueba,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoPrueba.add(this.jMenuItemDetalleCerrarTipoPrueba);
		
		this.jmenuDetalleAccionesTipoPrueba.add(this.jMenuItemActualizarTipoPrueba);
		this.jmenuDetalleAccionesTipoPrueba.add(this.jMenuItemEliminarTipoPrueba);
		this.jmenuDetalleAccionesTipoPrueba.add(this.jMenuItemCancelarTipoPrueba);		
		
		//this.jmenuDetalleDatosTipoPrueba.add(this.jMenuItemDetalleAbrirOrderByTipoPrueba);				
		this.jmenuDetalleDatosTipoPrueba.add(this.jMenuItemDetalleMostarOcultarTipoPrueba);				
				
		//this.jmenuDetalleAccionesTipoPrueba.add(this.jMenuItemGuardarCambiosTipoPrueba);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoPrueba.add(this.jmenuDetalleArchivoTipoPrueba);		
		this.jmenuBarDetalleTipoPrueba.add(this.jmenuDetalleAccionesTipoPrueba);		
		this.jmenuBarDetalleTipoPrueba.add(this.jmenuDetalleDatosTipoPrueba);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoPrueba);				
	}
	
	
	public void inicializarElementosCamposTipoPrueba() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoPrueba = new JLabelMe();
		jLabelIdTipoPrueba.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoPrueba = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoPrueba.setToolTipText(TipoPruebaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoPrueba= new GridBagLayout();

		this.jPanelidTipoPrueba.setLayout(this.gridaBagLayoutTipoPrueba);

		jTextFieldidTipoPrueba = new JTextFieldMe();
		jTextFieldidTipoPrueba.setText("Id");

		jTextFieldidTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoPrueba = new JLabelMe();
		this.jLabelcodigoTipoPrueba.setText(""+TipoPruebaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoPrueba.setToolTipText("Codigo");
		this.jLabelcodigoTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoPrueba=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoPrueba.setToolTipText(TipoPruebaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoPrueba = new GridBagLayout();
		this.jPanelcodigoTipoPrueba.setLayout(this.gridaBagLayoutTipoPrueba);


		jTextFieldcodigoTipoPrueba= new JTextFieldMe();

		jTextFieldcodigoTipoPrueba.setEnabled(false);
		jTextFieldcodigoTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoPruebaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoPruebaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPruebaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoPruebaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoPruebaBusqueda.setText("U");
		this.jButtoncodigoTipoPruebaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoPruebaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoPruebaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoPrueba.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoPrueba.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoPruebaBusqueda"));

		if(this.tipopruebaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoPruebaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoPrueba = new JLabelMe();
		this.jLabelnombreTipoPrueba.setText(""+TipoPruebaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoPrueba.setToolTipText("Nombre");
		this.jLabelnombreTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoPrueba=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoPrueba.setToolTipText(TipoPruebaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoPrueba = new GridBagLayout();
		this.jPanelnombreTipoPrueba.setLayout(this.gridaBagLayoutTipoPrueba);


		jTextAreanombreTipoPrueba= new JTextAreaMe();
		jTextAreanombreTipoPrueba.setEnabled(false);
		jTextAreanombreTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoPrueba.setLineWrap(true);
		jTextAreanombreTipoPrueba.setWrapStyleWord(true);
		jTextAreanombreTipoPrueba.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoPrueba.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoPrueba = new JScrollPane(jTextAreanombreTipoPrueba);
		jscrollPanenombreTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoPruebaBusqueda= new JButtonMe();
		this.jButtonnombreTipoPruebaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPruebaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoPruebaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoPruebaBusqueda.setText("U");
		this.jButtonnombreTipoPruebaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoPruebaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoPruebaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoPrueba.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoPrueba.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoPruebaBusqueda"));

		if(this.tipopruebaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoPruebaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoPrueba() {
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
		//this.jInternalFrameDetalleTipoPrueba = new TipoPruebaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Prueba DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoPrueba= new GridBagLayout();
		

		
		String sToolTipTipoPrueba="";
		sToolTipTipoPrueba=TipoPruebaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoPrueba+="(Nomina.TipoPrueba)";
		}
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoPrueba+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoPrueba = new JButtonMe();
		this.jButtonModificarTipoPrueba = new JButtonMe();
        this.jButtonActualizarTipoPrueba = new JButtonMe();
        this.jButtonEliminarTipoPrueba = new JButtonMe();
        this.jButtonCancelarTipoPrueba = new JButtonMe();
        this.jButtonGuardarCambiosTipoPrueba = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoPrueba = new JButtonMe();
		this.jButtonCerrarTipoPrueba = new JButtonMe();
		
		this.jScrollPanelDatosTipoPrueba = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoPrueba = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoPrueba = new JScrollPane();
				
		
		
		this.jPanelCamposTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Prueba";
		
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Pruebas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoPrueba.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoPrueba.setName("jPanelCamposTipoPrueba"); 

		this.jPanelCamposOcultosTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoPrueba.setName("jPanelCamposOcultosTipoPrueba"); 

        this.jPanelAccionesTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoPrueba.setToolTipText("Acciones");
        this.jPanelAccionesTipoPrueba.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoPrueba.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoPrueba.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoPrueba.setText("Nuevo");
		this.jButtonModificarTipoPrueba.setText("Editar");
        this.jButtonActualizarTipoPrueba.setText("Actualizar");
        this.jButtonEliminarTipoPrueba.setText("Eliminar");
        this.jButtonCancelarTipoPrueba.setText("Cancelar");
        this.jButtonGuardarCambiosTipoPrueba.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoPrueba.setText("Guardar");
		this.jButtonCerrarTipoPrueba.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoPrueba,"nuevo_button","Nuevo",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoPrueba,"modificar_button","Editar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoPrueba,"actualizar_button","Actualizar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoPrueba,"eliminar_button","Eliminar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoPrueba,"cancelar_button","Cancelar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoPrueba,"guardarcambios_button","Guardar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoPrueba,"guardarcambiostabla_button","Guardar",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoPrueba,"cerrar_button","Salir",this.tipopruebaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoPrueba.setToolTipText("Nuevo"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoPrueba.setToolTipText("Editar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoPrueba.setToolTipText("Actualizar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoPrueba.setToolTipText("Eliminar)"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoPrueba.setToolTipText("Cancelar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoPrueba.setToolTipText("Guardar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoPrueba.setToolTipText("Guardar"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoPrueba.setToolTipText("Salir"+" "+TipoPruebaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoPrueba";
		inputMap = this.jButtonNuevoTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoPrueba.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoPrueba"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoPrueba";
		inputMap = this.jButtonActualizarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoPrueba"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoPrueba";
		inputMap = this.jButtonEliminarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoPrueba"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoPrueba";
		inputMap = this.jButtonCancelarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoPrueba"));
		
		//CERRAR		
		sMapKey = "CerrarTipoPrueba";
		inputMap = this.jButtonCerrarTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoPrueba"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoPrueba";
		inputMap = this.jButtonGuardarCambiosTablaTipoPrueba.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoPrueba.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoPrueba"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoPrueba = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoPrueba.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoPrueba.setToolTipText("Nuevo TipoPrueba");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoPrueba = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoPrueba.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoPrueba.setToolTipText("Sin Cerrar Ventana TipoPrueba");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoPrueba = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoPrueba.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoPrueba.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoPrueba.setText("Accion");
		this.jComboBoxTiposAccionesTipoPrueba.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoPrueba = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoPrueba.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoPrueba.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoPrueba = new JLabelMe();
		
		this.jLabelAccionesTipoPrueba.setText("Acciones");		
		this.jLabelAccionesTipoPrueba.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrueba.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoPrueba.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoPrueba();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoPrueba();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoPrueba=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoPrueba.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoPrueba,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoPrueba.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrueba.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoPrueba.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoPrueba, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoPrueba.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrueba.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoPrueba.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoPrueba, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoPrueba = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoPrueba = new GridBagLayout();
		
		this.jPanelCamposTipoPrueba.setLayout(gridaBagLayoutCamposTipoPrueba);
		this.jPanelCamposOcultosTipoPrueba.setLayout(gridaBagLayoutCamposOcultosTipoPrueba);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrueba.gridy = 0;
	this.gridBagConstraintsTipoPrueba.gridx = 0;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoPrueba.add(jLabelIdTipoPrueba, this.gridBagConstraintsTipoPrueba);



	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrueba.gridy = 0;
	this.gridBagConstraintsTipoPrueba.gridx = 1;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoPrueba.add(jTextFieldidTipoPrueba, this.gridBagConstraintsTipoPrueba);


	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrueba.gridy = 0;
	this.gridBagConstraintsTipoPrueba.gridx = 0;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoPrueba.add(jLabelcodigoTipoPrueba, this.gridBagConstraintsTipoPrueba);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = 0;
		this.gridBagConstraintsTipoPrueba.gridx = 2;
		this.gridBagConstraintsTipoPrueba.ipadx = 0;
		this.gridBagConstraintsTipoPrueba.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoPrueba.add(jButtoncodigoTipoPruebaBusqueda, this.gridBagConstraintsTipoPrueba);
	}

	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrueba.gridy = 0;
	this.gridBagConstraintsTipoPrueba.gridx = 1;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoPrueba.add(jTextFieldcodigoTipoPrueba, this.gridBagConstraintsTipoPrueba);


	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrueba.gridy = 0;
	this.gridBagConstraintsTipoPrueba.gridx = 0;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoPrueba.add(jLabelnombreTipoPrueba, this.gridBagConstraintsTipoPrueba);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		//this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoPrueba.gridy = 0;
		this.gridBagConstraintsTipoPrueba.gridx = 2;
		this.gridBagConstraintsTipoPrueba.ipadx = 0;
		this.gridBagConstraintsTipoPrueba.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoPrueba.add(jButtonnombreTipoPruebaBusqueda, this.gridBagConstraintsTipoPrueba);
	}

	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoPrueba.gridy = 0;
	this.gridBagConstraintsTipoPrueba.gridx = 1;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoPrueba.add(jscrollPanenombreTipoPrueba, this.gridBagConstraintsTipoPrueba);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrueba.gridy = iYPanelCamposTipoPrueba;
	this.gridBagConstraintsTipoPrueba.gridx = iXPanelCamposTipoPrueba++;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrueba.add(this.jPanelidTipoPrueba, this.gridBagConstraintsTipoPrueba);



	if(iXPanelCamposTipoPrueba % 1==0) {
		iXPanelCamposTipoPrueba=0;
		iYPanelCamposTipoPrueba++;
	}
	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrueba.gridy = iYPanelCamposTipoPrueba;
	this.gridBagConstraintsTipoPrueba.gridx = iXPanelCamposTipoPrueba++;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrueba.add(this.jPanelcodigoTipoPrueba, this.gridBagConstraintsTipoPrueba);



	if(iXPanelCamposTipoPrueba % 1==0) {
		iXPanelCamposTipoPrueba=0;
		iYPanelCamposTipoPrueba++;
	}
	this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoPrueba.gridy = iYPanelCamposTipoPrueba;
	this.gridBagConstraintsTipoPrueba.gridx = iXPanelCamposTipoPrueba++;
	this.gridBagConstraintsTipoPrueba.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoPrueba.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoPrueba.add(this.jPanelnombreTipoPrueba, this.gridBagConstraintsTipoPrueba);



	if(iXPanelCamposTipoPrueba % 1==0) {
		iXPanelCamposTipoPrueba=0;
		iYPanelCamposTipoPrueba++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoPrueba= new GridBagLayout();
		this.jPanelAccionesTipoPrueba.setLayout(gridaBagLayoutAccionesTipoPrueba);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoPrueba= new GridBagLayout();
		this.jPanelAccionesFormularioTipoPrueba.setLayout(gridaBagLayoutAccionesFormularioTipoPrueba);
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrueba.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrueba.add(this.jComboBoxTiposAccionesFormularioTipoPrueba, this.gridBagConstraintsTipoPrueba);

		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoPrueba.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoPrueba.add(this.jCheckBoxPostAccionNuevoTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrueba.add(this.jCheckBoxPostAccionSinCerrarTipoPrueba, this.gridBagConstraintsTipoPrueba);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipopruebaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipopruebaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoPrueba.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoPrueba.add(this.jCheckBoxPostAccionSinMensajeTipoPrueba, this.gridBagConstraintsTipoPrueba);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = 0;
		this.gridBagConstraintsTipoPrueba.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoPrueba.add(this.jButtonModificarTipoPrueba, this.gridBagConstraintsTipoPrueba);							

		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoPrueba.gridy = 0;
		this.gridBagConstraintsTipoPrueba.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoPrueba.add(this.jButtonEliminarTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
			
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = 0;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrueba.add(this.jButtonActualizarTipoPrueba, this.gridBagConstraintsTipoPrueba);


		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = 0;		
		this.gridBagConstraintsTipoPrueba.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoPrueba.add(this.jButtonGuardarCambiosTipoPrueba, this.gridBagConstraintsTipoPrueba);	
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = 0;		
		this.gridBagConstraintsTipoPrueba.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoPrueba.add(this.jButtonCancelarTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoPrueba = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoPrueba);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipopruebaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();						
			this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoPrueba.gridx = 0;		
			//this.gridBagConstraintsTipoPrueba.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoPrueba.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoPrueba.gridx =0;
		this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoPrueba.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoPrueba, this.gridBagConstraintsTipoPrueba);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoPruebaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoPrueba = new TipoPruebaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Prueba DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Prueba DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prueba Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoPruebaModel tipopruebaModel=new TipoPruebaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoPruebaModel.TipoPruebaFocusTraversalPolicy tipopruebaFocusTraversalPolicy = tipopruebaModel.new TipoPruebaFocusTraversalPolicy(this);
			
			//tipopruebaFocusTraversalPolicy.settipopruebaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipopruebaModel);
			
			
			this.jContentPaneDetalleTipoPrueba = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoPrueba = new GridBagLayout();	
			this.jContentPaneDetalleTipoPrueba.setLayout(gridaBagLayoutDetalleTipoPrueba);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoPrueba = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
				this.gridBagConstraintsTipoPrueba.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoPrueba.gridx = 0;
					
				
				this.jContentPaneDetalleTipoPrueba.add(jTtoolBarDetalleTipoPrueba, gridBagConstraintsTipoPrueba);								
				
}
			
			this.jScrollPanelDatosEdicionTipoPrueba=   new JScrollPane(jContentPaneDetalleTipoPrueba,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrueba.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrueba.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrueba.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoPrueba=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoPrueba.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrueba.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoPrueba.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoPrueba.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoPrueba.gridx = 0;
	        
			this.jContentPaneDetalleTipoPrueba.add(jPanelCamposTipoPrueba, gridBagConstraintsTipoPrueba);
			
			
			
			
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
						&& tipopruebaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipopruebaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoPrueba= new GridBagConstraints();
						this.gridBagConstraintsTipoPrueba.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoPrueba.gridx = 0;
						this.jContentPaneDetalleTipoPrueba.add(this.jTabbedPaneRelacionesTipoPrueba, this.gridBagConstraintsTipoPrueba);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoPrueba.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoPrueba.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
					this.gridBagConstraintsTipoPrueba.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoPrueba.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoPrueba.gridx = 0;
					
				
					this.jContentPaneDetalleTipoPrueba.add(jPanelCamposOcultosTipoPrueba, gridBagConstraintsTipoPrueba);
				
					this.jPanelCamposOcultosTipoPrueba.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoPrueba.gridx = 0;
	        this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoPrueba.add(this.jPanelAccionesFormularioTipoPrueba, this.gridBagConstraintsTipoPrueba);							
			
			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
	        this.gridBagConstraintsTipoPrueba.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoPrueba.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoPrueba.add(this.jPanelAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoPrueba);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoPrueba=   new JScrollPane(this.jPanelCamposTipoPrueba,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoPrueba.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrueba.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoPrueba.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrueba.gridx = 0;
			this.gridBagConstraintsTipoPrueba.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoPrueba.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoPrueba.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrueba.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoPrueba, this.gridBagConstraintsTipoPrueba);			
			
			this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
			this.gridBagConstraintsTipoPrueba.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoPrueba.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoPrueba, this.gridBagConstraintsTipoPrueba);
			
			
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoPrueba, this.gridBagConstraintsTipoPrueba);
		
			
		this.gridBagConstraintsTipoPrueba = new GridBagConstraints();
		this.gridBagConstraintsTipoPrueba.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoPrueba.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoPrueba, this.gridBagConstraintsTipoPrueba);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoPrueba;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoPrueba;
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
