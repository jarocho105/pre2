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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoCalculoConstantesFunciones;

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
public class TipoCalculoDetalleFormJInternalFrame extends TipoCalculoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCalculo;
	
	protected JMenuBar jmenuBarDetalleTipoCalculo;
	
	protected JMenu jmenuDetalleTipoCalculo;
	protected JMenu jmenuDetalleArchivoTipoCalculo;
	protected JMenu jmenuDetalleAccionesTipoCalculo;
	protected JMenu jmenuDetalleDatosTipoCalculo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCalculo;	
	protected GridBagConstraints gridBagConstraintsTipoCalculo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCalculoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCalculo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCalculoSessionBean tipocalculoSessionBean;
	
	
	
		
	
	public TipoCalculoLogic tipocalculoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCalculo;
	public JScrollPane jScrollPanelDatosEdicionTipoCalculo;
	public JScrollPane jScrollPanelDatosGeneralTipoCalculo;
	
	protected JPanel jPanelCamposTipoCalculo;    
	protected JPanel jPanelCamposOcultosTipoCalculo;    	
	protected JPanel jPanelAccionesTipoCalculo;
	protected JPanel jPanelAccionesFormularioTipoCalculo;
    
	
	
	protected Integer iXPanelCamposTipoCalculo=0;
	protected Integer iYPanelCamposTipoCalculo=0;
	
	protected Integer iXPanelCamposOcultosTipoCalculo=0;
	protected Integer iYPanelCamposOcultosTipoCalculo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCalculo;
	public JButton jButtonModificarTipoCalculo;
	public JButton jButtonActualizarTipoCalculo;
    public JButton jButtonEliminarTipoCalculo;
	public JButton jButtonCancelarTipoCalculo;
    public JButton jButtonGuardarCambiosTipoCalculo;
	public JButton jButtonGuardarCambiosTablaTipoCalculo;
	protected JButton jButtonCerrarTipoCalculo;
	
	
	protected JButton jButtonProcesarInformacionTipoCalculo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCalculo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCalculo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCalculo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCalculo;
	protected JButton jButtonModificarToolBarTipoCalculo;
	protected JButton jButtonActualizarToolBarTipoCalculo;
    protected JButton jButtonEliminarToolBarTipoCalculo;
	protected JButton jButtonCancelarToolBarTipoCalculo;
    protected JButton jButtonGuardarCambiosToolBarTipoCalculo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCalculo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCalculo;
	protected JButton jButtonCerrarToolBarTipoCalculo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCalculo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCalculo;
	protected JMenuItem jMenuItemModificarTipoCalculo;
	protected JMenuItem jMenuItemActualizarTipoCalculo;
    protected JMenuItem jMenuItemEliminarTipoCalculo;
	protected JMenuItem jMenuItemCancelarTipoCalculo;
    protected JMenuItem jMenuItemGuardarCambiosTipoCalculo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCalculo;
	protected JMenuItem jMenuItemCerrarTipoCalculo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCalculo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCalculo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCalculo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCalculo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCalculo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCalculo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCalculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCalculo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCalculo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCalculo;
	public JLabel jLabelIdTipoCalculo;
	public JTextFieldMe jTextFieldidTipoCalculo;
	public JButton jButtonidTipoCalculoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCalculo;
	public JLabel jLabelcodigoTipoCalculo;
	public JTextField jTextFieldcodigoTipoCalculo;
	public JButton jButtoncodigoTipoCalculoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCalculo;
	public JLabel jLabelnombreTipoCalculo;
	public JTextArea jTextAreanombreTipoCalculo;
	public JScrollPane jscrollPanenombreTipoCalculo;
	public JButton jButtonnombreTipoCalculoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCalculo;
	
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
	
	public TipoCalculoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCalculo=new JPanel();
				this.jPanelAccionesFormularioTipoCalculo=new JPanel();
				this.jmenuBarDetalleTipoCalculo=new JMenuBar();
				this.jTtoolBarDetalleTipoCalculo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCalculoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCalculoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCalculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCalculo() {
		return this.jButtonActualizarToolBarTipoCalculo;
	}
	
	public JButton getjButtonEliminarToolBarTipoCalculo() {
		return this.jButtonEliminarToolBarTipoCalculo;
	}
	
	public JButton getjButtonCancelarToolBarTipoCalculo() {
		return this.jButtonCancelarToolBarTipoCalculo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCalculo() {
		return this.jButtonProcesarInformacionTipoCalculo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCalculo)	{
		this.jButtonProcesarInformacionTipoCalculo = jButtonProcesarInformacionTipoCalculo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCalculo() {
		return this.jComboBoxTiposAccionesTipoCalculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCalculo(
			JComboBox jComboBoxTiposRelacionesTipoCalculo) {
		this.jComboBoxTiposRelacionesTipoCalculo = jComboBoxTiposRelacionesTipoCalculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCalculo(
			JComboBox jComboBoxTiposAccionesTipoCalculo) {
		this.jComboBoxTiposAccionesTipoCalculo = jComboBoxTiposAccionesTipoCalculo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCalculo() {
		return this.jComboBoxTiposAccionesFormularioTipoCalculo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCalculo(
			JComboBox jComboBoxTiposAccionesFormularioTipoCalculo) {
		this.jComboBoxTiposAccionesFormularioTipoCalculo = jComboBoxTiposAccionesFormularioTipoCalculo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocalculoSessionBean=new TipoCalculoSessionBean();
		
		this.tipocalculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocalculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocalculoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCalculoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCalculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCalculoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Calculo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCalculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCalculo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCalculo=new JButtonMe();
				this.jButtonModificarToolBarTipoCalculo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCalculo,this.jTtoolBarDetalleTipoCalculo,
							"actualizar","actualizar","Actualizar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCalculo,this.jTtoolBarDetalleTipoCalculo,
							"eliminar","eliminar","Eliminar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCalculo,this.jTtoolBarDetalleTipoCalculo,
							"cancelar","cancelar","Cancelar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCalculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCalculo,this.jTtoolBarDetalleTipoCalculo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCalculo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCalculo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCalculo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCalculo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCalculo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCalculo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCalculo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCalculo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCalculo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCalculo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCalculo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCalculo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCalculo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCalculo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCalculo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCalculo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCalculo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCalculo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCalculo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCalculo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCalculo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCalculo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCalculo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCalculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCalculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCalculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCalculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCalculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCalculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCalculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCalculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCalculo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCalculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCalculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCalculo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCalculo.add(this.jMenuItemDetalleCerrarTipoCalculo);
		
		this.jmenuDetalleAccionesTipoCalculo.add(this.jMenuItemActualizarTipoCalculo);
		this.jmenuDetalleAccionesTipoCalculo.add(this.jMenuItemEliminarTipoCalculo);
		this.jmenuDetalleAccionesTipoCalculo.add(this.jMenuItemCancelarTipoCalculo);		
		
		//this.jmenuDetalleDatosTipoCalculo.add(this.jMenuItemDetalleAbrirOrderByTipoCalculo);				
		this.jmenuDetalleDatosTipoCalculo.add(this.jMenuItemDetalleMostarOcultarTipoCalculo);				
				
		//this.jmenuDetalleAccionesTipoCalculo.add(this.jMenuItemGuardarCambiosTipoCalculo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCalculo.add(this.jmenuDetalleArchivoTipoCalculo);		
		this.jmenuBarDetalleTipoCalculo.add(this.jmenuDetalleAccionesTipoCalculo);		
		this.jmenuBarDetalleTipoCalculo.add(this.jmenuDetalleDatosTipoCalculo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCalculo);				
	}
	
	
	public void inicializarElementosCamposTipoCalculo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCalculo = new JLabelMe();
		jLabelIdTipoCalculo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCalculo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCalculo.setToolTipText(TipoCalculoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCalculo= new GridBagLayout();

		this.jPanelidTipoCalculo.setLayout(this.gridaBagLayoutTipoCalculo);

		jTextFieldidTipoCalculo = new JTextFieldMe();
		jTextFieldidTipoCalculo.setText("Id");

		jTextFieldidTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCalculo = new JLabelMe();
		this.jLabelcodigoTipoCalculo.setText(""+TipoCalculoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCalculo.setToolTipText("Codigo");
		this.jLabelcodigoTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCalculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCalculo.setToolTipText(TipoCalculoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCalculo = new GridBagLayout();
		this.jPanelcodigoTipoCalculo.setLayout(this.gridaBagLayoutTipoCalculo);


		jTextFieldcodigoTipoCalculo= new JTextFieldMe();

		jTextFieldcodigoTipoCalculo.setEnabled(false);
		jTextFieldcodigoTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCalculoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCalculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCalculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCalculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCalculoBusqueda.setText("U");
		this.jButtoncodigoTipoCalculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCalculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCalculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCalculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCalculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCalculoBusqueda"));

		if(this.tipocalculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCalculoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCalculo = new JLabelMe();
		this.jLabelnombreTipoCalculo.setText(""+TipoCalculoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCalculo.setToolTipText("Nombre");
		this.jLabelnombreTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCalculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCalculo.setToolTipText(TipoCalculoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCalculo = new GridBagLayout();
		this.jPanelnombreTipoCalculo.setLayout(this.gridaBagLayoutTipoCalculo);


		jTextAreanombreTipoCalculo= new JTextAreaMe();
		jTextAreanombreTipoCalculo.setEnabled(false);
		jTextAreanombreTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCalculo.setLineWrap(true);
		jTextAreanombreTipoCalculo.setWrapStyleWord(true);
		jTextAreanombreTipoCalculo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCalculo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCalculo = new JScrollPane(jTextAreanombreTipoCalculo);
		jscrollPanenombreTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCalculoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCalculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCalculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCalculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCalculoBusqueda.setText("U");
		this.jButtonnombreTipoCalculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCalculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCalculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCalculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCalculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCalculoBusqueda"));

		if(this.tipocalculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCalculoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCalculo() {
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
		//this.jInternalFrameDetalleTipoCalculo = new TipoCalculoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Calculo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCalculo= new GridBagLayout();
		

		
		String sToolTipTipoCalculo="";
		sToolTipTipoCalculo=TipoCalculoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCalculo+="(Nomina.TipoCalculo)";
		}
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCalculo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCalculo = new JButtonMe();
		this.jButtonModificarTipoCalculo = new JButtonMe();
        this.jButtonActualizarTipoCalculo = new JButtonMe();
        this.jButtonEliminarTipoCalculo = new JButtonMe();
        this.jButtonCancelarTipoCalculo = new JButtonMe();
        this.jButtonGuardarCambiosTipoCalculo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCalculo = new JButtonMe();
		this.jButtonCerrarTipoCalculo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCalculo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCalculo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCalculo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Calculo";
		
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Calculos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCalculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCalculo.setName("jPanelCamposTipoCalculo"); 

		this.jPanelCamposOcultosTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCalculo.setName("jPanelCamposOcultosTipoCalculo"); 

        this.jPanelAccionesTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCalculo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCalculo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCalculo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCalculo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCalculo.setText("Nuevo");
		this.jButtonModificarTipoCalculo.setText("Editar");
        this.jButtonActualizarTipoCalculo.setText("Actualizar");
        this.jButtonEliminarTipoCalculo.setText("Eliminar");
        this.jButtonCancelarTipoCalculo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCalculo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCalculo.setText("Guardar");
		this.jButtonCerrarTipoCalculo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCalculo,"nuevo_button","Nuevo",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCalculo,"modificar_button","Editar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCalculo,"actualizar_button","Actualizar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCalculo,"eliminar_button","Eliminar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCalculo,"cancelar_button","Cancelar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCalculo,"guardarcambios_button","Guardar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCalculo,"guardarcambiostabla_button","Guardar",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCalculo,"cerrar_button","Salir",this.tipocalculoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCalculo.setToolTipText("Nuevo"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCalculo.setToolTipText("Editar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCalculo.setToolTipText("Actualizar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCalculo.setToolTipText("Eliminar)"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCalculo.setToolTipText("Cancelar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCalculo.setToolTipText("Guardar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCalculo.setToolTipText("Guardar"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCalculo.setToolTipText("Salir"+" "+TipoCalculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCalculo";
		inputMap = this.jButtonNuevoTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCalculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCalculo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCalculo";
		inputMap = this.jButtonActualizarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCalculo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCalculo";
		inputMap = this.jButtonEliminarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCalculo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCalculo";
		inputMap = this.jButtonCancelarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCalculo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCalculo";
		inputMap = this.jButtonCerrarTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCalculo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCalculo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCalculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCalculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCalculo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCalculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCalculo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCalculo.setToolTipText("Nuevo TipoCalculo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCalculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCalculo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCalculo.setToolTipText("Sin Cerrar Ventana TipoCalculo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCalculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCalculo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCalculo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCalculo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCalculo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCalculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCalculo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCalculo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCalculo = new JLabelMe();
		
		this.jLabelAccionesTipoCalculo.setText("Acciones");		
		this.jLabelAccionesTipoCalculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCalculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCalculo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCalculo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCalculo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCalculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCalculo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCalculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCalculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCalculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCalculo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCalculo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCalculo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCalculo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCalculo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCalculo = new GridBagLayout();
		
		this.jPanelCamposTipoCalculo.setLayout(gridaBagLayoutCamposTipoCalculo);
		this.jPanelCamposOcultosTipoCalculo.setLayout(gridaBagLayoutCamposOcultosTipoCalculo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculo.gridy = 0;
	this.gridBagConstraintsTipoCalculo.gridx = 0;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCalculo.add(jLabelIdTipoCalculo, this.gridBagConstraintsTipoCalculo);



	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculo.gridy = 0;
	this.gridBagConstraintsTipoCalculo.gridx = 1;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCalculo.add(jTextFieldidTipoCalculo, this.gridBagConstraintsTipoCalculo);


	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculo.gridy = 0;
	this.gridBagConstraintsTipoCalculo.gridx = 0;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCalculo.add(jLabelcodigoTipoCalculo, this.gridBagConstraintsTipoCalculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = 0;
		this.gridBagConstraintsTipoCalculo.gridx = 2;
		this.gridBagConstraintsTipoCalculo.ipadx = 0;
		this.gridBagConstraintsTipoCalculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCalculo.add(jButtoncodigoTipoCalculoBusqueda, this.gridBagConstraintsTipoCalculo);
	}

	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculo.gridy = 0;
	this.gridBagConstraintsTipoCalculo.gridx = 1;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCalculo.add(jTextFieldcodigoTipoCalculo, this.gridBagConstraintsTipoCalculo);


	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculo.gridy = 0;
	this.gridBagConstraintsTipoCalculo.gridx = 0;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCalculo.add(jLabelnombreTipoCalculo, this.gridBagConstraintsTipoCalculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCalculo.gridy = 0;
		this.gridBagConstraintsTipoCalculo.gridx = 2;
		this.gridBagConstraintsTipoCalculo.ipadx = 0;
		this.gridBagConstraintsTipoCalculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCalculo.add(jButtonnombreTipoCalculoBusqueda, this.gridBagConstraintsTipoCalculo);
	}

	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCalculo.gridy = 0;
	this.gridBagConstraintsTipoCalculo.gridx = 1;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCalculo.add(jscrollPanenombreTipoCalculo, this.gridBagConstraintsTipoCalculo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalculo.gridy = iYPanelCamposTipoCalculo;
	this.gridBagConstraintsTipoCalculo.gridx = iXPanelCamposTipoCalculo++;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalculo.add(this.jPanelidTipoCalculo, this.gridBagConstraintsTipoCalculo);



	if(iXPanelCamposTipoCalculo % 1==0) {
		iXPanelCamposTipoCalculo=0;
		iYPanelCamposTipoCalculo++;
	}
	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalculo.gridy = iYPanelCamposTipoCalculo;
	this.gridBagConstraintsTipoCalculo.gridx = iXPanelCamposTipoCalculo++;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalculo.add(this.jPanelcodigoTipoCalculo, this.gridBagConstraintsTipoCalculo);



	if(iXPanelCamposTipoCalculo % 1==0) {
		iXPanelCamposTipoCalculo=0;
		iYPanelCamposTipoCalculo++;
	}
	this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCalculo.gridy = iYPanelCamposTipoCalculo;
	this.gridBagConstraintsTipoCalculo.gridx = iXPanelCamposTipoCalculo++;
	this.gridBagConstraintsTipoCalculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCalculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCalculo.add(this.jPanelnombreTipoCalculo, this.gridBagConstraintsTipoCalculo);



	if(iXPanelCamposTipoCalculo % 1==0) {
		iXPanelCamposTipoCalculo=0;
		iYPanelCamposTipoCalculo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCalculo= new GridBagLayout();
		this.jPanelAccionesTipoCalculo.setLayout(gridaBagLayoutAccionesTipoCalculo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCalculo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCalculo.setLayout(gridaBagLayoutAccionesFormularioTipoCalculo);
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCalculo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCalculo.add(this.jComboBoxTiposAccionesFormularioTipoCalculo, this.gridBagConstraintsTipoCalculo);

		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCalculo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCalculo.add(this.jCheckBoxPostAccionNuevoTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocalculoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCalculo.add(this.jCheckBoxPostAccionSinCerrarTipoCalculo, this.gridBagConstraintsTipoCalculo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocalculoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocalculoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCalculo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCalculo.add(this.jCheckBoxPostAccionSinMensajeTipoCalculo, this.gridBagConstraintsTipoCalculo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = 0;
		this.gridBagConstraintsTipoCalculo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCalculo.add(this.jButtonModificarTipoCalculo, this.gridBagConstraintsTipoCalculo);							

		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCalculo.gridy = 0;
		this.gridBagConstraintsTipoCalculo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCalculo.add(this.jButtonEliminarTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
			
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = 0;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCalculo.add(this.jButtonActualizarTipoCalculo, this.gridBagConstraintsTipoCalculo);


		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = 0;		
		this.gridBagConstraintsTipoCalculo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCalculo.add(this.jButtonGuardarCambiosTipoCalculo, this.gridBagConstraintsTipoCalculo);	
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = 0;		
		this.gridBagConstraintsTipoCalculo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCalculo.add(this.jButtonCancelarTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCalculo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCalculo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocalculoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCalculo.gridx = 0;		
			//this.gridBagConstraintsTipoCalculo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCalculo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCalculo.gridx =0;
		this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCalculo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCalculo, this.gridBagConstraintsTipoCalculo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCalculoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCalculo = new TipoCalculoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Calculo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Calculo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Calculo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCalculoModel tipocalculoModel=new TipoCalculoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCalculoModel.TipoCalculoFocusTraversalPolicy tipocalculoFocusTraversalPolicy = tipocalculoModel.new TipoCalculoFocusTraversalPolicy(this);
			
			//tipocalculoFocusTraversalPolicy.settipocalculoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocalculoModel);
			
			
			this.jContentPaneDetalleTipoCalculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCalculo = new GridBagLayout();	
			this.jContentPaneDetalleTipoCalculo.setLayout(gridaBagLayoutDetalleTipoCalculo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCalculo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
				this.gridBagConstraintsTipoCalculo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCalculo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCalculo.add(jTtoolBarDetalleTipoCalculo, gridBagConstraintsTipoCalculo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCalculo=   new JScrollPane(jContentPaneDetalleTipoCalculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCalculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCalculo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCalculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCalculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCalculo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCalculo.gridx = 0;
	        
			this.jContentPaneDetalleTipoCalculo.add(jPanelCamposTipoCalculo, gridBagConstraintsTipoCalculo);
			
			
			
			
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
						&& tipocalculoSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipocalculoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCalculo= new GridBagConstraints();
						this.gridBagConstraintsTipoCalculo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCalculo.gridx = 0;
						this.jContentPaneDetalleTipoCalculo.add(this.jTabbedPaneRelacionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCalculo.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCalculo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
					this.gridBagConstraintsTipoCalculo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCalculo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCalculo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCalculo.add(jPanelCamposOcultosTipoCalculo, gridBagConstraintsTipoCalculo);
				
					this.jPanelCamposOcultosTipoCalculo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCalculo.gridx = 0;
	        this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCalculo.add(this.jPanelAccionesFormularioTipoCalculo, this.gridBagConstraintsTipoCalculo);							
			
			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
	        this.gridBagConstraintsTipoCalculo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCalculo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCalculo.add(this.jPanelAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCalculo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCalculo=   new JScrollPane(this.jPanelCamposTipoCalculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCalculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCalculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalculo.gridx = 0;
			this.gridBagConstraintsTipoCalculo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCalculo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCalculo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalculo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCalculo, this.gridBagConstraintsTipoCalculo);			
			
			this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
			this.gridBagConstraintsTipoCalculo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCalculo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCalculo, this.gridBagConstraintsTipoCalculo);
			
			
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCalculo, this.gridBagConstraintsTipoCalculo);
		
			
		this.gridBagConstraintsTipoCalculo = new GridBagConstraints();
		this.gridBagConstraintsTipoCalculo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCalculo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCalculo, this.gridBagConstraintsTipoCalculo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCalculo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCalculo;
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
