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
import com.bydan.erp.seguridad.util.TipoFondoControlConstantesFunciones;

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
public class TipoFondoControlDetalleFormJInternalFrame extends TipoFondoControlBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoFondoControl;
	
	protected JMenuBar jmenuBarDetalleTipoFondoControl;
	
	protected JMenu jmenuDetalleTipoFondoControl;
	protected JMenu jmenuDetalleArchivoTipoFondoControl;
	protected JMenu jmenuDetalleAccionesTipoFondoControl;
	protected JMenu jmenuDetalleDatosTipoFondoControl;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoFondoControl;	
	protected GridBagConstraints gridBagConstraintsTipoFondoControl;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoFondoControlBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoFondoControl;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoFondoControlSessionBean tipofondocontrolSessionBean;
	
	
	
		
	
	public TipoFondoControlLogic tipofondocontrolLogic;
	
	public JScrollPane jScrollPanelDatosTipoFondoControl;
	public JScrollPane jScrollPanelDatosEdicionTipoFondoControl;
	public JScrollPane jScrollPanelDatosGeneralTipoFondoControl;
	
	protected JPanel jPanelCamposTipoFondoControl;    
	protected JPanel jPanelCamposOcultosTipoFondoControl;    	
	protected JPanel jPanelAccionesTipoFondoControl;
	protected JPanel jPanelAccionesFormularioTipoFondoControl;
    
	
	
	protected Integer iXPanelCamposTipoFondoControl=0;
	protected Integer iYPanelCamposTipoFondoControl=0;
	
	protected Integer iXPanelCamposOcultosTipoFondoControl=0;
	protected Integer iYPanelCamposOcultosTipoFondoControl=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoFondoControl;
	public JButton jButtonModificarTipoFondoControl;
	public JButton jButtonActualizarTipoFondoControl;
    public JButton jButtonEliminarTipoFondoControl;
	public JButton jButtonCancelarTipoFondoControl;
    public JButton jButtonGuardarCambiosTipoFondoControl;
	public JButton jButtonGuardarCambiosTablaTipoFondoControl;
	protected JButton jButtonCerrarTipoFondoControl;
	
	
	protected JButton jButtonProcesarInformacionTipoFondoControl;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoFondoControl;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoFondoControl;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoFondoControl;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoFondoControl;
	protected JButton jButtonModificarToolBarTipoFondoControl;
	protected JButton jButtonActualizarToolBarTipoFondoControl;
    protected JButton jButtonEliminarToolBarTipoFondoControl;
	protected JButton jButtonCancelarToolBarTipoFondoControl;
    protected JButton jButtonGuardarCambiosToolBarTipoFondoControl;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoFondoControl;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoFondoControl;
	protected JButton jButtonCerrarToolBarTipoFondoControl;
	
	protected JButton jButtonProcesarInformacionToolBarTipoFondoControl;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoFondoControl;
	protected JMenuItem jMenuItemModificarTipoFondoControl;
	protected JMenuItem jMenuItemActualizarTipoFondoControl;
    protected JMenuItem jMenuItemEliminarTipoFondoControl;
	protected JMenuItem jMenuItemCancelarTipoFondoControl;
    protected JMenuItem jMenuItemGuardarCambiosTipoFondoControl;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoFondoControl;
	protected JMenuItem jMenuItemCerrarTipoFondoControl;
	protected JMenuItem jMenuItemDetalleCerrarTipoFondoControl;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoFondoControl;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoFondoControl;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoFondoControl;
	protected JMenuItem jMenuItemMostrarOcultarTipoFondoControl;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoFondoControl;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoFondoControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoFondoControl;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoFondoControl;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoFondoControl;
	public JLabel jLabelIdTipoFondoControl;
	public JTextFieldMe jTextFieldidTipoFondoControl;
	public JButton jButtonidTipoFondoControlBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoFondoControl;
	public JLabel jLabelcodigoTipoFondoControl;
	public JTextField jTextFieldcodigoTipoFondoControl;
	public JButton jButtoncodigoTipoFondoControlBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoFondoControl;
	public JLabel jLabelnombreTipoFondoControl;
	public JTextArea jTextAreanombreTipoFondoControl;
	public JScrollPane jscrollPanenombreTipoFondoControl;
	public JButton jButtonnombreTipoFondoControlBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoFondoControl;
	
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
	
	public TipoFondoControlDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoFondoControl=new JPanel();
				this.jPanelAccionesFormularioTipoFondoControl=new JPanel();
				this.jmenuBarDetalleTipoFondoControl=new JMenuBar();
				this.jTtoolBarDetalleTipoFondoControl=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoFondoControlDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoFondoControlDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoFondoControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoFondoControl() {
		return this.jButtonActualizarToolBarTipoFondoControl;
	}
	
	public JButton getjButtonEliminarToolBarTipoFondoControl() {
		return this.jButtonEliminarToolBarTipoFondoControl;
	}
	
	public JButton getjButtonCancelarToolBarTipoFondoControl() {
		return this.jButtonCancelarToolBarTipoFondoControl;
	}		
	
	public JButton getjButtonProcesarInformacionTipoFondoControl() {
		return this.jButtonProcesarInformacionTipoFondoControl;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoFondoControl)	{
		this.jButtonProcesarInformacionTipoFondoControl = jButtonProcesarInformacionTipoFondoControl;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoFondoControl() {
		return this.jComboBoxTiposAccionesTipoFondoControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoFondoControl(
			JComboBox jComboBoxTiposRelacionesTipoFondoControl) {
		this.jComboBoxTiposRelacionesTipoFondoControl = jComboBoxTiposRelacionesTipoFondoControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoFondoControl(
			JComboBox jComboBoxTiposAccionesTipoFondoControl) {
		this.jComboBoxTiposAccionesTipoFondoControl = jComboBoxTiposAccionesTipoFondoControl;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoFondoControl() {
		return this.jComboBoxTiposAccionesFormularioTipoFondoControl;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoFondoControl(
			JComboBox jComboBoxTiposAccionesFormularioTipoFondoControl) {
		this.jComboBoxTiposAccionesFormularioTipoFondoControl = jComboBoxTiposAccionesFormularioTipoFondoControl;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipofondocontrolSessionBean=new TipoFondoControlSessionBean();
		
		this.tipofondocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofondocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipofondocontrolSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoFondoControlJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoFondoControlJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoFondoControlJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Fondo Control MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoFondoControlJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoFondoControl= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoFondoControl=new JButtonMe();
				this.jButtonModificarToolBarTipoFondoControl=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoFondoControl,this.jTtoolBarDetalleTipoFondoControl,
							"actualizar","actualizar","Actualizar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoFondoControl,this.jTtoolBarDetalleTipoFondoControl,
							"eliminar","eliminar","Eliminar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoFondoControl,this.jTtoolBarDetalleTipoFondoControl,
							"cancelar","cancelar","Cancelar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoFondoControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoFondoControl,this.jTtoolBarDetalleTipoFondoControl,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoFondoControl=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoFondoControl=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoFondoControl=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoFondoControl=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoFondoControl=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoFondoControl= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoFondoControl.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoFondoControl,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoFondoControl= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoFondoControl.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoFondoControl,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoFondoControl= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoFondoControl.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoFondoControl,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoFondoControl= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoFondoControl.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoFondoControl,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoFondoControl= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoFondoControl.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoFondoControl,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoFondoControl= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoFondoControl.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoFondoControl,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoFondoControl= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoFondoControl.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoFondoControl,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoFondoControl= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoFondoControl.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoFondoControl,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoFondoControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoFondoControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoFondoControl,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoFondoControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoFondoControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoFondoControl,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoFondoControl.add(this.jMenuItemDetalleCerrarTipoFondoControl);
		
		this.jmenuDetalleAccionesTipoFondoControl.add(this.jMenuItemActualizarTipoFondoControl);
		this.jmenuDetalleAccionesTipoFondoControl.add(this.jMenuItemEliminarTipoFondoControl);
		this.jmenuDetalleAccionesTipoFondoControl.add(this.jMenuItemCancelarTipoFondoControl);		
		
		//this.jmenuDetalleDatosTipoFondoControl.add(this.jMenuItemDetalleAbrirOrderByTipoFondoControl);				
		this.jmenuDetalleDatosTipoFondoControl.add(this.jMenuItemDetalleMostarOcultarTipoFondoControl);				
				
		//this.jmenuDetalleAccionesTipoFondoControl.add(this.jMenuItemGuardarCambiosTipoFondoControl);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoFondoControl.add(this.jmenuDetalleArchivoTipoFondoControl);		
		this.jmenuBarDetalleTipoFondoControl.add(this.jmenuDetalleAccionesTipoFondoControl);		
		this.jmenuBarDetalleTipoFondoControl.add(this.jmenuDetalleDatosTipoFondoControl);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoFondoControl);				
	}
	
	
	public void inicializarElementosCamposTipoFondoControl() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoFondoControl = new JLabelMe();
		jLabelIdTipoFondoControl.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoFondoControl = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoFondoControl.setToolTipText(TipoFondoControlConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoFondoControl= new GridBagLayout();

		this.jPanelidTipoFondoControl.setLayout(this.gridaBagLayoutTipoFondoControl);

		jTextFieldidTipoFondoControl = new JTextFieldMe();
		jTextFieldidTipoFondoControl.setText("Id");

		jTextFieldidTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoFondoControl = new JLabelMe();
		this.jLabelcodigoTipoFondoControl.setText(""+TipoFondoControlConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoFondoControl.setToolTipText("Codigo");
		this.jLabelcodigoTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoFondoControl=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoFondoControl.setToolTipText(TipoFondoControlConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoFondoControl = new GridBagLayout();
		this.jPanelcodigoTipoFondoControl.setLayout(this.gridaBagLayoutTipoFondoControl);


		jTextFieldcodigoTipoFondoControl= new JTextFieldMe();

		jTextFieldcodigoTipoFondoControl.setEnabled(false);
		jTextFieldcodigoTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoFondoControlBusqueda= new JButtonMe();
		this.jButtoncodigoTipoFondoControlBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFondoControlBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoFondoControlBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoFondoControlBusqueda.setText("U");
		this.jButtoncodigoTipoFondoControlBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoFondoControlBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoFondoControlBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoFondoControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoFondoControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoFondoControlBusqueda"));

		if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoFondoControlBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoFondoControl = new JLabelMe();
		this.jLabelnombreTipoFondoControl.setText(""+TipoFondoControlConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoFondoControl.setToolTipText("Nombre");
		this.jLabelnombreTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoFondoControl=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoFondoControl.setToolTipText(TipoFondoControlConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoFondoControl = new GridBagLayout();
		this.jPanelnombreTipoFondoControl.setLayout(this.gridaBagLayoutTipoFondoControl);


		jTextAreanombreTipoFondoControl= new JTextAreaMe();
		jTextAreanombreTipoFondoControl.setEnabled(false);
		jTextAreanombreTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoFondoControl.setLineWrap(true);
		jTextAreanombreTipoFondoControl.setWrapStyleWord(true);
		jTextAreanombreTipoFondoControl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoFondoControl.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoFondoControl = new JScrollPane(jTextAreanombreTipoFondoControl);
		jscrollPanenombreTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoFondoControlBusqueda= new JButtonMe();
		this.jButtonnombreTipoFondoControlBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFondoControlBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoFondoControlBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoFondoControlBusqueda.setText("U");
		this.jButtonnombreTipoFondoControlBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoFondoControlBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoFondoControlBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoFondoControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoFondoControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoFondoControlBusqueda"));

		if(this.tipofondocontrolSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoFondoControlBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoFondoControl() {
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
		//this.jInternalFrameDetalleTipoFondoControl = new TipoFondoControlBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Fondo Control DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoFondoControl= new GridBagLayout();
		

		
		String sToolTipTipoFondoControl="";
		sToolTipTipoFondoControl=TipoFondoControlConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoFondoControl+="(Seguridad.TipoFondoControl)";
		}
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoFondoControl+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoFondoControl = new JButtonMe();
		this.jButtonModificarTipoFondoControl = new JButtonMe();
        this.jButtonActualizarTipoFondoControl = new JButtonMe();
        this.jButtonEliminarTipoFondoControl = new JButtonMe();
        this.jButtonCancelarTipoFondoControl = new JButtonMe();
        this.jButtonGuardarCambiosTipoFondoControl = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoFondoControl = new JButtonMe();
		this.jButtonCerrarTipoFondoControl = new JButtonMe();
		
		this.jScrollPanelDatosTipoFondoControl = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoFondoControl = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoFondoControl = new JScrollPane();
				
		
		
		this.jPanelCamposTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Fondo Control";
		
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Fondo Controls" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoFondoControl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoFondoControl.setName("jPanelCamposTipoFondoControl"); 

		this.jPanelCamposOcultosTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoFondoControl.setName("jPanelCamposOcultosTipoFondoControl"); 

        this.jPanelAccionesTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoFondoControl.setToolTipText("Acciones");
        this.jPanelAccionesTipoFondoControl.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoFondoControl.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoFondoControl.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoFondoControl.setText("Nuevo");
		this.jButtonModificarTipoFondoControl.setText("Editar");
        this.jButtonActualizarTipoFondoControl.setText("Actualizar");
        this.jButtonEliminarTipoFondoControl.setText("Eliminar");
        this.jButtonCancelarTipoFondoControl.setText("Cancelar");
        this.jButtonGuardarCambiosTipoFondoControl.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoFondoControl.setText("Guardar");
		this.jButtonCerrarTipoFondoControl.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoFondoControl,"nuevo_button","Nuevo",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoFondoControl,"modificar_button","Editar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoFondoControl,"actualizar_button","Actualizar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoFondoControl,"eliminar_button","Eliminar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoFondoControl,"cancelar_button","Cancelar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoFondoControl,"guardarcambios_button","Guardar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoFondoControl,"guardarcambiostabla_button","Guardar",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoFondoControl,"cerrar_button","Salir",this.tipofondocontrolSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoFondoControl.setToolTipText("Nuevo"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoFondoControl.setToolTipText("Editar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoFondoControl.setToolTipText("Actualizar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoFondoControl.setToolTipText("Eliminar)"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoFondoControl.setToolTipText("Cancelar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoFondoControl.setToolTipText("Guardar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoFondoControl.setToolTipText("Guardar"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoFondoControl.setToolTipText("Salir"+" "+TipoFondoControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoFondoControl";
		inputMap = this.jButtonNuevoTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoFondoControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoFondoControl"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoFondoControl";
		inputMap = this.jButtonActualizarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoFondoControl"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoFondoControl";
		inputMap = this.jButtonEliminarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoFondoControl"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoFondoControl";
		inputMap = this.jButtonCancelarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoFondoControl"));
		
		//CERRAR		
		sMapKey = "CerrarTipoFondoControl";
		inputMap = this.jButtonCerrarTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoFondoControl"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoFondoControl";
		inputMap = this.jButtonGuardarCambiosTablaTipoFondoControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoFondoControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoFondoControl"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoFondoControl = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoFondoControl.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoFondoControl.setToolTipText("Nuevo TipoFondoControl");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoFondoControl = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoFondoControl.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoFondoControl.setToolTipText("Sin Cerrar Ventana TipoFondoControl");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoFondoControl = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoFondoControl.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoFondoControl.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoFondoControl.setText("Accion");
		this.jComboBoxTiposAccionesTipoFondoControl.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoFondoControl = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoFondoControl.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoFondoControl.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoFondoControl = new JLabelMe();
		
		this.jLabelAccionesTipoFondoControl.setText("Acciones");		
		this.jLabelAccionesTipoFondoControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondoControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoFondoControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoFondoControl();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoFondoControl();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoFondoControl=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoFondoControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoFondoControl,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoFondoControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondoControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoFondoControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoFondoControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoFondoControl.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFondoControl.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoFondoControl.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoFondoControl, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoFondoControl = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoFondoControl = new GridBagLayout();
		
		this.jPanelCamposTipoFondoControl.setLayout(gridaBagLayoutCamposTipoFondoControl);
		this.jPanelCamposOcultosTipoFondoControl.setLayout(gridaBagLayoutCamposOcultosTipoFondoControl);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondoControl.gridy = 0;
	this.gridBagConstraintsTipoFondoControl.gridx = 0;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoFondoControl.add(jLabelIdTipoFondoControl, this.gridBagConstraintsTipoFondoControl);



	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondoControl.gridy = 0;
	this.gridBagConstraintsTipoFondoControl.gridx = 1;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoFondoControl.add(jTextFieldidTipoFondoControl, this.gridBagConstraintsTipoFondoControl);


	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondoControl.gridy = 0;
	this.gridBagConstraintsTipoFondoControl.gridx = 0;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoFondoControl.add(jLabelcodigoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = 0;
		this.gridBagConstraintsTipoFondoControl.gridx = 2;
		this.gridBagConstraintsTipoFondoControl.ipadx = 0;
		this.gridBagConstraintsTipoFondoControl.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoFondoControl.add(jButtoncodigoTipoFondoControlBusqueda, this.gridBagConstraintsTipoFondoControl);
	}

	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondoControl.gridy = 0;
	this.gridBagConstraintsTipoFondoControl.gridx = 1;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoFondoControl.add(jTextFieldcodigoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);


	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondoControl.gridy = 0;
	this.gridBagConstraintsTipoFondoControl.gridx = 0;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoFondoControl.add(jLabelnombreTipoFondoControl, this.gridBagConstraintsTipoFondoControl);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoFondoControl.gridy = 0;
		this.gridBagConstraintsTipoFondoControl.gridx = 2;
		this.gridBagConstraintsTipoFondoControl.ipadx = 0;
		this.gridBagConstraintsTipoFondoControl.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoFondoControl.add(jButtonnombreTipoFondoControlBusqueda, this.gridBagConstraintsTipoFondoControl);
	}

	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoFondoControl.gridy = 0;
	this.gridBagConstraintsTipoFondoControl.gridx = 1;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoFondoControl.add(jscrollPanenombreTipoFondoControl, this.gridBagConstraintsTipoFondoControl);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFondoControl.gridy = iYPanelCamposTipoFondoControl;
	this.gridBagConstraintsTipoFondoControl.gridx = iXPanelCamposTipoFondoControl++;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFondoControl.add(this.jPanelidTipoFondoControl, this.gridBagConstraintsTipoFondoControl);



	if(iXPanelCamposTipoFondoControl % 1==0) {
		iXPanelCamposTipoFondoControl=0;
		iYPanelCamposTipoFondoControl++;
	}
	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFondoControl.gridy = iYPanelCamposTipoFondoControl;
	this.gridBagConstraintsTipoFondoControl.gridx = iXPanelCamposTipoFondoControl++;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFondoControl.add(this.jPanelcodigoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);



	if(iXPanelCamposTipoFondoControl % 1==0) {
		iXPanelCamposTipoFondoControl=0;
		iYPanelCamposTipoFondoControl++;
	}
	this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoFondoControl.gridy = iYPanelCamposTipoFondoControl;
	this.gridBagConstraintsTipoFondoControl.gridx = iXPanelCamposTipoFondoControl++;
	this.gridBagConstraintsTipoFondoControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoFondoControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoFondoControl.add(this.jPanelnombreTipoFondoControl, this.gridBagConstraintsTipoFondoControl);



	if(iXPanelCamposTipoFondoControl % 1==0) {
		iXPanelCamposTipoFondoControl=0;
		iYPanelCamposTipoFondoControl++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoFondoControl= new GridBagLayout();
		this.jPanelAccionesTipoFondoControl.setLayout(gridaBagLayoutAccionesTipoFondoControl);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoFondoControl= new GridBagLayout();
		this.jPanelAccionesFormularioTipoFondoControl.setLayout(gridaBagLayoutAccionesFormularioTipoFondoControl);
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFondoControl.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFondoControl.add(this.jComboBoxTiposAccionesFormularioTipoFondoControl, this.gridBagConstraintsTipoFondoControl);

		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoFondoControl.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoFondoControl.add(this.jCheckBoxPostAccionNuevoTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFondoControl.add(this.jCheckBoxPostAccionSinCerrarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipofondocontrolSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipofondocontrolSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoFondoControl.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoFondoControl.add(this.jCheckBoxPostAccionSinMensajeTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = 0;
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoFondoControl.add(this.jButtonModificarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);							

		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoFondoControl.gridy = 0;
		this.gridBagConstraintsTipoFondoControl.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoFondoControl.add(this.jButtonEliminarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
			
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = 0;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFondoControl.add(this.jButtonActualizarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);


		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = 0;		
		this.gridBagConstraintsTipoFondoControl.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoFondoControl.add(this.jButtonGuardarCambiosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);	
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = 0;		
		this.gridBagConstraintsTipoFondoControl.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoFondoControl.add(this.jButtonCancelarTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoFondoControl = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoFondoControl);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipofondocontrolSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();						
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoFondoControl.gridx = 0;		
			//this.gridBagConstraintsTipoFondoControl.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoFondoControl.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoFondoControl.gridx =0;
		this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoFondoControl.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoFondoControlJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoFondoControl = new TipoFondoControlBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Fondo Control DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Fondo Control DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Fondo Control Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoFondoControlModel tipofondocontrolModel=new TipoFondoControlModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoFondoControlModel.TipoFondoControlFocusTraversalPolicy tipofondocontrolFocusTraversalPolicy = tipofondocontrolModel.new TipoFondoControlFocusTraversalPolicy(this);
			
			//tipofondocontrolFocusTraversalPolicy.settipofondocontrolJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipofondocontrolModel);
			
			
			this.jContentPaneDetalleTipoFondoControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoFondoControl = new GridBagLayout();	
			this.jContentPaneDetalleTipoFondoControl.setLayout(gridaBagLayoutDetalleTipoFondoControl);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoFondoControl = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
				this.gridBagConstraintsTipoFondoControl.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoFondoControl.gridx = 0;
					
				
				this.jContentPaneDetalleTipoFondoControl.add(jTtoolBarDetalleTipoFondoControl, gridBagConstraintsTipoFondoControl);								
				
}
			
			this.jScrollPanelDatosEdicionTipoFondoControl=   new JScrollPane(jContentPaneDetalleTipoFondoControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFondoControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondoControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondoControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoFondoControl=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoFondoControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondoControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoFondoControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoFondoControl.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoFondoControl.gridx = 0;
	        
			this.jContentPaneDetalleTipoFondoControl.add(jPanelCamposTipoFondoControl, gridBagConstraintsTipoFondoControl);
			
			
			
			
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
						&& tipofondocontrolSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipofondocontrolSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoFondoControl= new GridBagConstraints();
						this.gridBagConstraintsTipoFondoControl.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoFondoControl.gridx = 0;
						this.jContentPaneDetalleTipoFondoControl.add(this.jTabbedPaneRelacionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoFondoControl.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoFondoControl.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
					this.gridBagConstraintsTipoFondoControl.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoFondoControl.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoFondoControl.gridx = 0;
					
				
					this.jContentPaneDetalleTipoFondoControl.add(jPanelCamposOcultosTipoFondoControl, gridBagConstraintsTipoFondoControl);
				
					this.jPanelCamposOcultosTipoFondoControl.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoFondoControl.gridx = 0;
	        this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoFondoControl.add(this.jPanelAccionesFormularioTipoFondoControl, this.gridBagConstraintsTipoFondoControl);							
			
			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
	        this.gridBagConstraintsTipoFondoControl.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoFondoControl.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoFondoControl.add(this.jPanelAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoFondoControl);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoFondoControl=   new JScrollPane(this.jPanelCamposTipoFondoControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoFondoControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondoControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoFondoControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoFondoControl.gridx = 0;
			this.gridBagConstraintsTipoFondoControl.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoFondoControl.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoFondoControl.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFondoControl.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoFondoControl, this.gridBagConstraintsTipoFondoControl);			
			
			this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
			this.gridBagConstraintsTipoFondoControl.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoFondoControl.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
			
			
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		
			
		this.gridBagConstraintsTipoFondoControl = new GridBagConstraints();
		this.gridBagConstraintsTipoFondoControl.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoFondoControl.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoFondoControl, this.gridBagConstraintsTipoFondoControl);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoFondoControl;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoFondoControl;
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
