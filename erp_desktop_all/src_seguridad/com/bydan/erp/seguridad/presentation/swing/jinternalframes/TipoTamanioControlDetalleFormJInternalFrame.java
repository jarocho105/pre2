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
import com.bydan.erp.seguridad.util.TipoTamanioControlConstantesFunciones;

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
public class TipoTamanioControlDetalleFormJInternalFrame extends TipoTamanioControlBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTamanioControl;
	
	protected JMenuBar jmenuBarDetalleTipoTamanioControl;
	
	protected JMenu jmenuDetalleTipoTamanioControl;
	protected JMenu jmenuDetalleArchivoTipoTamanioControl;
	protected JMenu jmenuDetalleAccionesTipoTamanioControl;
	protected JMenu jmenuDetalleDatosTipoTamanioControl;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTamanioControl;	
	protected GridBagConstraints gridBagConstraintsTipoTamanioControl;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTamanioControlBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTamanioControl;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTamanioControlSessionBean tipotamaniocontrolSessionBean;
	
	
	
		
	
	public TipoTamanioControlLogic tipotamaniocontrolLogic;
	
	public JScrollPane jScrollPanelDatosTipoTamanioControl;
	public JScrollPane jScrollPanelDatosEdicionTipoTamanioControl;
	public JScrollPane jScrollPanelDatosGeneralTipoTamanioControl;
	
	protected JPanel jPanelCamposTipoTamanioControl;    
	protected JPanel jPanelCamposOcultosTipoTamanioControl;    	
	protected JPanel jPanelAccionesTipoTamanioControl;
	protected JPanel jPanelAccionesFormularioTipoTamanioControl;
    
	
	
	protected Integer iXPanelCamposTipoTamanioControl=0;
	protected Integer iYPanelCamposTipoTamanioControl=0;
	
	protected Integer iXPanelCamposOcultosTipoTamanioControl=0;
	protected Integer iYPanelCamposOcultosTipoTamanioControl=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTamanioControl;
	public JButton jButtonModificarTipoTamanioControl;
	public JButton jButtonActualizarTipoTamanioControl;
    public JButton jButtonEliminarTipoTamanioControl;
	public JButton jButtonCancelarTipoTamanioControl;
    public JButton jButtonGuardarCambiosTipoTamanioControl;
	public JButton jButtonGuardarCambiosTablaTipoTamanioControl;
	protected JButton jButtonCerrarTipoTamanioControl;
	
	
	protected JButton jButtonProcesarInformacionTipoTamanioControl;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTamanioControl;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTamanioControl;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTamanioControl;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTamanioControl;
	protected JButton jButtonModificarToolBarTipoTamanioControl;
	protected JButton jButtonActualizarToolBarTipoTamanioControl;
    protected JButton jButtonEliminarToolBarTipoTamanioControl;
	protected JButton jButtonCancelarToolBarTipoTamanioControl;
    protected JButton jButtonGuardarCambiosToolBarTipoTamanioControl;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTamanioControl;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTamanioControl;
	protected JButton jButtonCerrarToolBarTipoTamanioControl;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTamanioControl;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTamanioControl;
	protected JMenuItem jMenuItemModificarTipoTamanioControl;
	protected JMenuItem jMenuItemActualizarTipoTamanioControl;
    protected JMenuItem jMenuItemEliminarTipoTamanioControl;
	protected JMenuItem jMenuItemCancelarTipoTamanioControl;
    protected JMenuItem jMenuItemGuardarCambiosTipoTamanioControl;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTamanioControl;
	protected JMenuItem jMenuItemCerrarTipoTamanioControl;
	protected JMenuItem jMenuItemDetalleCerrarTipoTamanioControl;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTamanioControl;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTamanioControl;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTamanioControl;
	protected JMenuItem jMenuItemMostrarOcultarTipoTamanioControl;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTamanioControl;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTamanioControl;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTamanioControl;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTamanioControl;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTamanioControl;
	public JLabel jLabelIdTipoTamanioControl;
	public JTextFieldMe jTextFieldidTipoTamanioControl;
	public JButton jButtonidTipoTamanioControlBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoTamanioControl;
	public JLabel jLabelcodigoTipoTamanioControl;
	public JTextField jTextFieldcodigoTipoTamanioControl;
	public JButton jButtoncodigoTipoTamanioControlBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTamanioControl;
	public JLabel jLabelnombreTipoTamanioControl;
	public JTextArea jTextAreanombreTipoTamanioControl;
	public JScrollPane jscrollPanenombreTipoTamanioControl;
	public JButton jButtonnombreTipoTamanioControlBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoTamanioControl;
	public JLabel jLabeldescripcionTipoTamanioControl;
	public JTextArea jTextAreadescripcionTipoTamanioControl;
	public JScrollPane jscrollPanedescripcionTipoTamanioControl;
	public JButton jButtondescripcionTipoTamanioControlBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTamanioControl;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoTamanioControlDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTamanioControl=new JPanel();
				this.jPanelAccionesFormularioTipoTamanioControl=new JPanel();
				this.jmenuBarDetalleTipoTamanioControl=new JMenuBar();
				this.jTtoolBarDetalleTipoTamanioControl=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTamanioControlDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTamanioControlDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTamanioControl No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTamanioControl() {
		return this.jButtonActualizarToolBarTipoTamanioControl;
	}
	
	public JButton getjButtonEliminarToolBarTipoTamanioControl() {
		return this.jButtonEliminarToolBarTipoTamanioControl;
	}
	
	public JButton getjButtonCancelarToolBarTipoTamanioControl() {
		return this.jButtonCancelarToolBarTipoTamanioControl;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTamanioControl() {
		return this.jButtonProcesarInformacionTipoTamanioControl;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTamanioControl)	{
		this.jButtonProcesarInformacionTipoTamanioControl = jButtonProcesarInformacionTipoTamanioControl;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTamanioControl() {
		return this.jComboBoxTiposAccionesTipoTamanioControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTamanioControl(
			JComboBox jComboBoxTiposRelacionesTipoTamanioControl) {
		this.jComboBoxTiposRelacionesTipoTamanioControl = jComboBoxTiposRelacionesTipoTamanioControl;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTamanioControl(
			JComboBox jComboBoxTiposAccionesTipoTamanioControl) {
		this.jComboBoxTiposAccionesTipoTamanioControl = jComboBoxTiposAccionesTipoTamanioControl;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTamanioControl() {
		return this.jComboBoxTiposAccionesFormularioTipoTamanioControl;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTamanioControl(
			JComboBox jComboBoxTiposAccionesFormularioTipoTamanioControl) {
		this.jComboBoxTiposAccionesFormularioTipoTamanioControl = jComboBoxTiposAccionesFormularioTipoTamanioControl;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipotamaniocontrolSessionBean=new TipoTamanioControlSessionBean();
		
		this.tipotamaniocontrolSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotamaniocontrolSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTamanioControlJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTamanioControlJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTamanioControlJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Tamanio Control MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTamanioControlJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTamanioControl= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTamanioControl=new JButtonMe();
				this.jButtonModificarToolBarTipoTamanioControl=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTamanioControl,this.jTtoolBarDetalleTipoTamanioControl,
							"actualizar","actualizar","Actualizar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTamanioControl,this.jTtoolBarDetalleTipoTamanioControl,
							"eliminar","eliminar","Eliminar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTamanioControl,this.jTtoolBarDetalleTipoTamanioControl,
							"cancelar","cancelar","Cancelar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTamanioControl=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTamanioControl,this.jTtoolBarDetalleTipoTamanioControl,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTamanioControl=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTamanioControl=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTamanioControl=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTamanioControl=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTamanioControl=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTamanioControl= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTamanioControl.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTamanioControl,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTamanioControl= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTamanioControl.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTamanioControl,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTamanioControl= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTamanioControl.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTamanioControl,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTamanioControl= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTamanioControl.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTamanioControl,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTamanioControl= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTamanioControl.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTamanioControl,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTamanioControl= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTamanioControl.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTamanioControl,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTamanioControl= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTamanioControl.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTamanioControl,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTamanioControl= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTamanioControl.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTamanioControl,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTamanioControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTamanioControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTamanioControl,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTamanioControl= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTamanioControl.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTamanioControl,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTamanioControl.add(this.jMenuItemDetalleCerrarTipoTamanioControl);
		
		this.jmenuDetalleAccionesTipoTamanioControl.add(this.jMenuItemActualizarTipoTamanioControl);
		this.jmenuDetalleAccionesTipoTamanioControl.add(this.jMenuItemEliminarTipoTamanioControl);
		this.jmenuDetalleAccionesTipoTamanioControl.add(this.jMenuItemCancelarTipoTamanioControl);		
		
		//this.jmenuDetalleDatosTipoTamanioControl.add(this.jMenuItemDetalleAbrirOrderByTipoTamanioControl);				
		this.jmenuDetalleDatosTipoTamanioControl.add(this.jMenuItemDetalleMostarOcultarTipoTamanioControl);				
				
		//this.jmenuDetalleAccionesTipoTamanioControl.add(this.jMenuItemGuardarCambiosTipoTamanioControl);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTamanioControl.add(this.jmenuDetalleArchivoTipoTamanioControl);		
		this.jmenuBarDetalleTipoTamanioControl.add(this.jmenuDetalleAccionesTipoTamanioControl);		
		this.jmenuBarDetalleTipoTamanioControl.add(this.jmenuDetalleDatosTipoTamanioControl);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTamanioControl);				
	}
	
	
	public void inicializarElementosCamposTipoTamanioControl() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTamanioControl = new JLabelMe();
		jLabelIdTipoTamanioControl.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTamanioControl = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTamanioControl.setToolTipText(TipoTamanioControlConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTamanioControl= new GridBagLayout();

		this.jPanelidTipoTamanioControl.setLayout(this.gridaBagLayoutTipoTamanioControl);

		jTextFieldidTipoTamanioControl = new JTextFieldMe();
		jTextFieldidTipoTamanioControl.setText("Id");

		jTextFieldidTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoTamanioControl = new JLabelMe();
		this.jLabelcodigoTipoTamanioControl.setText(""+TipoTamanioControlConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoTamanioControl.setToolTipText("Codigo");
		this.jLabelcodigoTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoTamanioControl=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoTamanioControl.setToolTipText(TipoTamanioControlConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoTamanioControl = new GridBagLayout();
		this.jPanelcodigoTipoTamanioControl.setLayout(this.gridaBagLayoutTipoTamanioControl);


		jTextFieldcodigoTipoTamanioControl= new JTextFieldMe();

		jTextFieldcodigoTipoTamanioControl.setEnabled(false);
		jTextFieldcodigoTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoTamanioControlBusqueda= new JButtonMe();
		this.jButtoncodigoTipoTamanioControlBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTamanioControlBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTamanioControlBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoTamanioControlBusqueda.setText("U");
		this.jButtoncodigoTipoTamanioControlBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoTamanioControlBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoTamanioControlBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoTamanioControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoTamanioControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoTamanioControlBusqueda"));

		if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoTamanioControlBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoTamanioControl = new JLabelMe();
		this.jLabelnombreTipoTamanioControl.setText(""+TipoTamanioControlConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTamanioControl.setToolTipText("Nombre");
		this.jLabelnombreTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTamanioControl=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTamanioControl.setToolTipText(TipoTamanioControlConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTamanioControl = new GridBagLayout();
		this.jPanelnombreTipoTamanioControl.setLayout(this.gridaBagLayoutTipoTamanioControl);


		jTextAreanombreTipoTamanioControl= new JTextAreaMe();
		jTextAreanombreTipoTamanioControl.setEnabled(false);
		jTextAreanombreTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTamanioControl.setLineWrap(true);
		jTextAreanombreTipoTamanioControl.setWrapStyleWord(true);
		jTextAreanombreTipoTamanioControl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTamanioControl.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTamanioControl = new JScrollPane(jTextAreanombreTipoTamanioControl);
		jscrollPanenombreTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoTamanioControlBusqueda= new JButtonMe();
		this.jButtonnombreTipoTamanioControlBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTamanioControlBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTamanioControlBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTamanioControlBusqueda.setText("U");
		this.jButtonnombreTipoTamanioControlBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTamanioControlBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTamanioControlBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTamanioControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTamanioControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTamanioControlBusqueda"));

		if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTamanioControlBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoTamanioControl = new JLabelMe();
		this.jLabeldescripcionTipoTamanioControl.setText(""+TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTipoTamanioControl.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoTamanioControl=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoTamanioControl.setToolTipText(TipoTamanioControlConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoTamanioControl = new GridBagLayout();
		this.jPaneldescripcionTipoTamanioControl.setLayout(this.gridaBagLayoutTipoTamanioControl);


		jTextAreadescripcionTipoTamanioControl= new JTextAreaMe();
		jTextAreadescripcionTipoTamanioControl.setEnabled(false);
		jTextAreadescripcionTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoTamanioControl.setLineWrap(true);
		jTextAreadescripcionTipoTamanioControl.setWrapStyleWord(true);
		jTextAreadescripcionTipoTamanioControl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoTamanioControl.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoTamanioControl = new JScrollPane(jTextAreadescripcionTipoTamanioControl);
		jscrollPanedescripcionTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoTamanioControlBusqueda= new JButtonMe();
		this.jButtondescripcionTipoTamanioControlBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoTamanioControlBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoTamanioControlBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoTamanioControlBusqueda.setText("U");
		this.jButtondescripcionTipoTamanioControlBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoTamanioControlBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoTamanioControlBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoTamanioControl.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoTamanioControl.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoTamanioControlBusqueda"));

		if(this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoTamanioControlBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTamanioControl() {
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
		//this.jInternalFrameDetalleTipoTamanioControl = new TipoTamanioControlBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Tamanio Control DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTamanioControl= new GridBagLayout();
		

		
		String sToolTipTipoTamanioControl="";
		sToolTipTipoTamanioControl=TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTamanioControl+="(Seguridad.TipoTamanioControl)";
		}
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTamanioControl+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTamanioControl = new JButtonMe();
		this.jButtonModificarTipoTamanioControl = new JButtonMe();
        this.jButtonActualizarTipoTamanioControl = new JButtonMe();
        this.jButtonEliminarTipoTamanioControl = new JButtonMe();
        this.jButtonCancelarTipoTamanioControl = new JButtonMe();
        this.jButtonGuardarCambiosTipoTamanioControl = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTamanioControl = new JButtonMe();
		this.jButtonCerrarTipoTamanioControl = new JButtonMe();
		
		this.jScrollPanelDatosTipoTamanioControl = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTamanioControl = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTamanioControl = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Tamanio Control";
		
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tamanio Controls" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTamanioControl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTamanioControl.setName("jPanelCamposTipoTamanioControl"); 

		this.jPanelCamposOcultosTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTamanioControl.setName("jPanelCamposOcultosTipoTamanioControl"); 

        this.jPanelAccionesTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTamanioControl.setToolTipText("Acciones");
        this.jPanelAccionesTipoTamanioControl.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTamanioControl.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTamanioControl.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTamanioControl.setText("Nuevo");
		this.jButtonModificarTipoTamanioControl.setText("Editar");
        this.jButtonActualizarTipoTamanioControl.setText("Actualizar");
        this.jButtonEliminarTipoTamanioControl.setText("Eliminar");
        this.jButtonCancelarTipoTamanioControl.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTamanioControl.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTamanioControl.setText("Guardar");
		this.jButtonCerrarTipoTamanioControl.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTamanioControl,"nuevo_button","Nuevo",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTamanioControl,"modificar_button","Editar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTamanioControl,"actualizar_button","Actualizar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTamanioControl,"eliminar_button","Eliminar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTamanioControl,"cancelar_button","Cancelar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTamanioControl,"guardarcambios_button","Guardar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTamanioControl,"guardarcambiostabla_button","Guardar",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTamanioControl,"cerrar_button","Salir",this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTamanioControl.setToolTipText("Nuevo"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTamanioControl.setToolTipText("Editar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTamanioControl.setToolTipText("Actualizar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTamanioControl.setToolTipText("Eliminar)"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTamanioControl.setToolTipText("Cancelar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTamanioControl.setToolTipText("Guardar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTamanioControl.setToolTipText("Guardar"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTamanioControl.setToolTipText("Salir"+" "+TipoTamanioControlConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTamanioControl";
		inputMap = this.jButtonNuevoTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTamanioControl.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTamanioControl"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTamanioControl";
		inputMap = this.jButtonActualizarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTamanioControl"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTamanioControl";
		inputMap = this.jButtonEliminarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTamanioControl"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTamanioControl";
		inputMap = this.jButtonCancelarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTamanioControl"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTamanioControl";
		inputMap = this.jButtonCerrarTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTamanioControl"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTamanioControl";
		inputMap = this.jButtonGuardarCambiosTablaTipoTamanioControl.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTamanioControl.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTamanioControl"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTamanioControl = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTamanioControl.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTamanioControl.setToolTipText("Nuevo TipoTamanioControl");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTamanioControl = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTamanioControl.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTamanioControl.setToolTipText("Sin Cerrar Ventana TipoTamanioControl");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTamanioControl = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTamanioControl.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTamanioControl.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTamanioControl.setText("Accion");
		this.jComboBoxTiposAccionesTipoTamanioControl.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTamanioControl = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTamanioControl.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTamanioControl.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTamanioControl = new JLabelMe();
		
		this.jLabelAccionesTipoTamanioControl.setText("Acciones");		
		this.jLabelAccionesTipoTamanioControl.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTamanioControl.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTamanioControl.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTamanioControl();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTamanioControl();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTamanioControl=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTamanioControl.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTamanioControl,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTamanioControl.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTamanioControl.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTamanioControl.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTamanioControl.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTamanioControl.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTamanioControl.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTamanioControl, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTamanioControl = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTamanioControl = new GridBagLayout();
		
		this.jPanelCamposTipoTamanioControl.setLayout(gridaBagLayoutCamposTipoTamanioControl);
		this.jPanelCamposOcultosTipoTamanioControl.setLayout(gridaBagLayoutCamposOcultosTipoTamanioControl);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTamanioControl.add(jLabelIdTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 1;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTamanioControl.add(jTextFieldidTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);


	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoTamanioControl.add(jLabelcodigoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;
		this.gridBagConstraintsTipoTamanioControl.gridx = 2;
		this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
		this.gridBagConstraintsTipoTamanioControl.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoTamanioControl.add(jButtoncodigoTipoTamanioControlBusqueda, this.gridBagConstraintsTipoTamanioControl);
	}

	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 1;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoTamanioControl.add(jTextFieldcodigoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);


	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTamanioControl.add(jLabelnombreTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;
		this.gridBagConstraintsTipoTamanioControl.gridx = 2;
		this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
		this.gridBagConstraintsTipoTamanioControl.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTamanioControl.add(jButtonnombreTipoTamanioControlBusqueda, this.gridBagConstraintsTipoTamanioControl);
	}

	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 1;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTamanioControl.add(jscrollPanenombreTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);


	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoTamanioControl.add(jLabeldescripcionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		//this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;
		this.gridBagConstraintsTipoTamanioControl.gridx = 2;
		this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
		this.gridBagConstraintsTipoTamanioControl.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoTamanioControl.add(jButtondescripcionTipoTamanioControlBusqueda, this.gridBagConstraintsTipoTamanioControl);
	}

	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTamanioControl.gridy = 0;
	this.gridBagConstraintsTipoTamanioControl.gridx = 1;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoTamanioControl.add(jscrollPanedescripcionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTamanioControl.gridy = iYPanelCamposTipoTamanioControl;
	this.gridBagConstraintsTipoTamanioControl.gridx = iXPanelCamposTipoTamanioControl++;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTamanioControl.add(this.jPanelidTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(iXPanelCamposTipoTamanioControl % 1==0) {
		iXPanelCamposTipoTamanioControl=0;
		iYPanelCamposTipoTamanioControl++;
	}
	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTamanioControl.gridy = iYPanelCamposTipoTamanioControl;
	this.gridBagConstraintsTipoTamanioControl.gridx = iXPanelCamposTipoTamanioControl++;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTamanioControl.add(this.jPanelcodigoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(iXPanelCamposTipoTamanioControl % 1==0) {
		iXPanelCamposTipoTamanioControl=0;
		iYPanelCamposTipoTamanioControl++;
	}
	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTamanioControl.gridy = iYPanelCamposTipoTamanioControl;
	this.gridBagConstraintsTipoTamanioControl.gridx = iXPanelCamposTipoTamanioControl++;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTamanioControl.add(this.jPanelnombreTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(iXPanelCamposTipoTamanioControl % 1==0) {
		iXPanelCamposTipoTamanioControl=0;
		iYPanelCamposTipoTamanioControl++;
	}
	this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTamanioControl.gridy = iYPanelCamposTipoTamanioControl;
	this.gridBagConstraintsTipoTamanioControl.gridx = iXPanelCamposTipoTamanioControl++;
	this.gridBagConstraintsTipoTamanioControl.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTamanioControl.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTamanioControl.add(this.jPaneldescripcionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);



	if(iXPanelCamposTipoTamanioControl % 1==0) {
		iXPanelCamposTipoTamanioControl=0;
		iYPanelCamposTipoTamanioControl++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTamanioControl= new GridBagLayout();
		this.jPanelAccionesTipoTamanioControl.setLayout(gridaBagLayoutAccionesTipoTamanioControl);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTamanioControl= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTamanioControl.setLayout(gridaBagLayoutAccionesFormularioTipoTamanioControl);
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTamanioControl.add(this.jComboBoxTiposAccionesFormularioTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);

		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTamanioControl.add(this.jCheckBoxPostAccionNuevoTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTamanioControl.add(this.jCheckBoxPostAccionSinCerrarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipotamaniocontrolSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTamanioControl.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTamanioControl.add(this.jCheckBoxPostAccionSinMensajeTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTamanioControl.add(this.jButtonModificarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);							

		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;
		this.gridBagConstraintsTipoTamanioControl.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTamanioControl.add(this.jButtonEliminarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
			
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTamanioControl.add(this.jButtonActualizarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);


		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;		
		this.gridBagConstraintsTipoTamanioControl.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTamanioControl.add(this.jButtonGuardarCambiosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);	
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = 0;		
		this.gridBagConstraintsTipoTamanioControl.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTamanioControl.add(this.jButtonCancelarTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTamanioControl = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTamanioControl);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotamaniocontrolSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();						
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTamanioControl.gridx = 0;		
			//this.gridBagConstraintsTipoTamanioControl.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTamanioControl.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTamanioControl.gridx =0;
		this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTamanioControl.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTamanioControlJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTamanioControl = new TipoTamanioControlBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Tamanio Control DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Tamanio Control DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Tamanio Control Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTamanioControlModel tipotamaniocontrolModel=new TipoTamanioControlModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTamanioControlModel.TipoTamanioControlFocusTraversalPolicy tipotamaniocontrolFocusTraversalPolicy = tipotamaniocontrolModel.new TipoTamanioControlFocusTraversalPolicy(this);
			
			//tipotamaniocontrolFocusTraversalPolicy.settipotamaniocontrolJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipotamaniocontrolModel);
			
			
			this.jContentPaneDetalleTipoTamanioControl = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTamanioControl = new GridBagLayout();	
			this.jContentPaneDetalleTipoTamanioControl.setLayout(gridaBagLayoutDetalleTipoTamanioControl);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTamanioControl = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
				this.gridBagConstraintsTipoTamanioControl.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTamanioControl.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTamanioControl.add(jTtoolBarDetalleTipoTamanioControl, gridBagConstraintsTipoTamanioControl);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTamanioControl=   new JScrollPane(jContentPaneDetalleTipoTamanioControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTamanioControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTamanioControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTamanioControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTamanioControl=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTamanioControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTamanioControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTamanioControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTamanioControl.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	        
			this.jContentPaneDetalleTipoTamanioControl.add(jPanelCamposTipoTamanioControl, gridBagConstraintsTipoTamanioControl);
			
			
			
			
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
						&& tipotamaniocontrolSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipotamaniocontrolSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTamanioControl= new GridBagConstraints();
						this.gridBagConstraintsTipoTamanioControl.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTamanioControl.gridx = 0;
						this.jContentPaneDetalleTipoTamanioControl.add(this.jTabbedPaneRelacionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTamanioControl.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTamanioControl.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
					this.gridBagConstraintsTipoTamanioControl.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTamanioControl.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTamanioControl.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTamanioControl.add(jPanelCamposOcultosTipoTamanioControl, gridBagConstraintsTipoTamanioControl);
				
					this.jPanelCamposOcultosTipoTamanioControl.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	        this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTamanioControl.add(this.jPanelAccionesFormularioTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);							
			
			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
	        this.gridBagConstraintsTipoTamanioControl.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoTamanioControl.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTamanioControl.add(this.jPanelAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTamanioControl);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTamanioControl=   new JScrollPane(this.jPanelCamposTipoTamanioControl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTamanioControl.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTamanioControl.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTamanioControl.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTamanioControl.gridx = 0;
			this.gridBagConstraintsTipoTamanioControl.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTamanioControl.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTamanioControl.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTamanioControl.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);			
			
			this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
			this.gridBagConstraintsTipoTamanioControl.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTamanioControl.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
			
			
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		
			
		this.gridBagConstraintsTipoTamanioControl = new GridBagConstraints();
		this.gridBagConstraintsTipoTamanioControl.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTamanioControl.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTamanioControl, this.gridBagConstraintsTipoTamanioControl);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTamanioControl;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTamanioControl;
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
