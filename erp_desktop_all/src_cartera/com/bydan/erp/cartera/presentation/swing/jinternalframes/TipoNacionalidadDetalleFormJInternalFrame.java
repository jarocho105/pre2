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
import com.bydan.erp.cartera.util.TipoNacionalidadConstantesFunciones;

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
public class TipoNacionalidadDetalleFormJInternalFrame extends TipoNacionalidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoNacionalidad;
	
	protected JMenuBar jmenuBarDetalleTipoNacionalidad;
	
	protected JMenu jmenuDetalleTipoNacionalidad;
	protected JMenu jmenuDetalleArchivoTipoNacionalidad;
	protected JMenu jmenuDetalleAccionesTipoNacionalidad;
	protected JMenu jmenuDetalleDatosTipoNacionalidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoNacionalidad;	
	protected GridBagConstraints gridBagConstraintsTipoNacionalidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoNacionalidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoNacionalidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoNacionalidadSessionBean tiponacionalidadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoNacionalidadLogic tiponacionalidadLogic;
	
	public JScrollPane jScrollPanelDatosTipoNacionalidad;
	public JScrollPane jScrollPanelDatosEdicionTipoNacionalidad;
	public JScrollPane jScrollPanelDatosGeneralTipoNacionalidad;
	
	protected JPanel jPanelCamposTipoNacionalidad;    
	protected JPanel jPanelCamposOcultosTipoNacionalidad;    	
	protected JPanel jPanelAccionesTipoNacionalidad;
	protected JPanel jPanelAccionesFormularioTipoNacionalidad;
    
	
	
	protected Integer iXPanelCamposTipoNacionalidad=0;
	protected Integer iYPanelCamposTipoNacionalidad=0;
	
	protected Integer iXPanelCamposOcultosTipoNacionalidad=0;
	protected Integer iYPanelCamposOcultosTipoNacionalidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoNacionalidad;
	public JButton jButtonModificarTipoNacionalidad;
	public JButton jButtonActualizarTipoNacionalidad;
    public JButton jButtonEliminarTipoNacionalidad;
	public JButton jButtonCancelarTipoNacionalidad;
    public JButton jButtonGuardarCambiosTipoNacionalidad;
	public JButton jButtonGuardarCambiosTablaTipoNacionalidad;
	protected JButton jButtonCerrarTipoNacionalidad;
	
	
	protected JButton jButtonProcesarInformacionTipoNacionalidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoNacionalidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoNacionalidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoNacionalidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoNacionalidad;
	protected JButton jButtonModificarToolBarTipoNacionalidad;
	protected JButton jButtonActualizarToolBarTipoNacionalidad;
    protected JButton jButtonEliminarToolBarTipoNacionalidad;
	protected JButton jButtonCancelarToolBarTipoNacionalidad;
    protected JButton jButtonGuardarCambiosToolBarTipoNacionalidad;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoNacionalidad;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoNacionalidad;
	protected JButton jButtonCerrarToolBarTipoNacionalidad;
	
	protected JButton jButtonProcesarInformacionToolBarTipoNacionalidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoNacionalidad;
	protected JMenuItem jMenuItemModificarTipoNacionalidad;
	protected JMenuItem jMenuItemActualizarTipoNacionalidad;
    protected JMenuItem jMenuItemEliminarTipoNacionalidad;
	protected JMenuItem jMenuItemCancelarTipoNacionalidad;
    protected JMenuItem jMenuItemGuardarCambiosTipoNacionalidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoNacionalidad;
	protected JMenuItem jMenuItemCerrarTipoNacionalidad;
	protected JMenuItem jMenuItemDetalleCerrarTipoNacionalidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoNacionalidad;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoNacionalidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoNacionalidad;
	protected JMenuItem jMenuItemMostrarOcultarTipoNacionalidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoNacionalidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoNacionalidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoNacionalidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoNacionalidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoNacionalidad;
	public JLabel jLabelIdTipoNacionalidad;
	public JLabel jLabelidTipoNacionalidad;
	public JButton jButtonidTipoNacionalidadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoNacionalidad;
	public JLabel jLabelcodigoTipoNacionalidad;
	public JTextField jTextFieldcodigoTipoNacionalidad;
	public JButton jButtoncodigoTipoNacionalidadBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoNacionalidad;
	public JLabel jLabelnombreTipoNacionalidad;
	public JTextArea jTextAreanombreTipoNacionalidad;
	public JScrollPane jscrollPanenombreTipoNacionalidad;
	public JButton jButtonnombreTipoNacionalidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoNacionalidad;
	public JLabel jLabelid_empresaTipoNacionalidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoNacionalidad;
	public JButton jButtonid_empresaTipoNacionalidad= new JButtonMe();
	public JButton jButtonid_empresaTipoNacionalidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoNacionalidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoNacionalidad;
	
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
	
	public TipoNacionalidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoNacionalidad=new JPanel();
				this.jPanelAccionesFormularioTipoNacionalidad=new JPanel();
				this.jmenuBarDetalleTipoNacionalidad=new JMenuBar();
				this.jTtoolBarDetalleTipoNacionalidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoNacionalidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoNacionalidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoNacionalidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoNacionalidad() {
		return this.jButtonActualizarToolBarTipoNacionalidad;
	}
	
	public JButton getjButtonEliminarToolBarTipoNacionalidad() {
		return this.jButtonEliminarToolBarTipoNacionalidad;
	}
	
	public JButton getjButtonCancelarToolBarTipoNacionalidad() {
		return this.jButtonCancelarToolBarTipoNacionalidad;
	}		
	
	public JButton getjButtonProcesarInformacionTipoNacionalidad() {
		return this.jButtonProcesarInformacionTipoNacionalidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoNacionalidad)	{
		this.jButtonProcesarInformacionTipoNacionalidad = jButtonProcesarInformacionTipoNacionalidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoNacionalidad() {
		return this.jComboBoxTiposAccionesTipoNacionalidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoNacionalidad(
			JComboBox jComboBoxTiposRelacionesTipoNacionalidad) {
		this.jComboBoxTiposRelacionesTipoNacionalidad = jComboBoxTiposRelacionesTipoNacionalidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoNacionalidad(
			JComboBox jComboBoxTiposAccionesTipoNacionalidad) {
		this.jComboBoxTiposAccionesTipoNacionalidad = jComboBoxTiposAccionesTipoNacionalidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoNacionalidad() {
		return this.jComboBoxTiposAccionesFormularioTipoNacionalidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoNacionalidad(
			JComboBox jComboBoxTiposAccionesFormularioTipoNacionalidad) {
		this.jComboBoxTiposAccionesFormularioTipoNacionalidad = jComboBoxTiposAccionesFormularioTipoNacionalidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
		
		this.tiponacionalidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponacionalidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiponacionalidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoNacionalidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoNacionalidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoNacionalidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Nacionalidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoNacionalidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoNacionalidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoNacionalidad=new JButtonMe();
				this.jButtonModificarToolBarTipoNacionalidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoNacionalidad,this.jTtoolBarDetalleTipoNacionalidad,
							"actualizar","actualizar","Actualizar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoNacionalidad,this.jTtoolBarDetalleTipoNacionalidad,
							"eliminar","eliminar","Eliminar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoNacionalidad,this.jTtoolBarDetalleTipoNacionalidad,
							"cancelar","cancelar","Cancelar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoNacionalidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoNacionalidad,this.jTtoolBarDetalleTipoNacionalidad,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoNacionalidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoNacionalidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoNacionalidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoNacionalidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoNacionalidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoNacionalidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoNacionalidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoNacionalidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoNacionalidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoNacionalidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoNacionalidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoNacionalidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoNacionalidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoNacionalidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoNacionalidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoNacionalidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoNacionalidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoNacionalidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoNacionalidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoNacionalidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoNacionalidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoNacionalidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoNacionalidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoNacionalidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoNacionalidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoNacionalidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoNacionalidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoNacionalidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoNacionalidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoNacionalidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoNacionalidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoNacionalidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoNacionalidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoNacionalidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoNacionalidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoNacionalidad.add(this.jMenuItemDetalleCerrarTipoNacionalidad);
		
		this.jmenuDetalleAccionesTipoNacionalidad.add(this.jMenuItemActualizarTipoNacionalidad);
		this.jmenuDetalleAccionesTipoNacionalidad.add(this.jMenuItemEliminarTipoNacionalidad);
		this.jmenuDetalleAccionesTipoNacionalidad.add(this.jMenuItemCancelarTipoNacionalidad);		
		
		//this.jmenuDetalleDatosTipoNacionalidad.add(this.jMenuItemDetalleAbrirOrderByTipoNacionalidad);				
		this.jmenuDetalleDatosTipoNacionalidad.add(this.jMenuItemDetalleMostarOcultarTipoNacionalidad);				
				
		//this.jmenuDetalleAccionesTipoNacionalidad.add(this.jMenuItemGuardarCambiosTipoNacionalidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoNacionalidad.add(this.jmenuDetalleArchivoTipoNacionalidad);		
		this.jmenuBarDetalleTipoNacionalidad.add(this.jmenuDetalleAccionesTipoNacionalidad);		
		this.jmenuBarDetalleTipoNacionalidad.add(this.jmenuDetalleDatosTipoNacionalidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoNacionalidad);				
	}
	
	
	public void inicializarElementosCamposTipoNacionalidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoNacionalidad = new JLabelMe();
		jLabelIdTipoNacionalidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoNacionalidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoNacionalidad.setToolTipText(TipoNacionalidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoNacionalidad= new GridBagLayout();

		this.jPanelidTipoNacionalidad.setLayout(this.gridaBagLayoutTipoNacionalidad);

		jLabelidTipoNacionalidad = new JLabel();
		jLabelidTipoNacionalidad.setText("Id");

		jLabelidTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoNacionalidad = new JLabelMe();
		this.jLabelcodigoTipoNacionalidad.setText(""+TipoNacionalidadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoNacionalidad.setToolTipText("Codigo");
		this.jLabelcodigoTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoNacionalidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoNacionalidad.setToolTipText(TipoNacionalidadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoNacionalidad = new GridBagLayout();
		this.jPanelcodigoTipoNacionalidad.setLayout(this.gridaBagLayoutTipoNacionalidad);


		jTextFieldcodigoTipoNacionalidad= new JTextFieldMe();

		jTextFieldcodigoTipoNacionalidad.setEnabled(false);
		jTextFieldcodigoTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoNacionalidadBusqueda= new JButtonMe();
		this.jButtoncodigoTipoNacionalidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNacionalidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoNacionalidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoNacionalidadBusqueda.setText("U");
		this.jButtoncodigoTipoNacionalidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoNacionalidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoNacionalidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoNacionalidadBusqueda"));

		if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoNacionalidadBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoNacionalidad = new JLabelMe();
		this.jLabelnombreTipoNacionalidad.setText(""+TipoNacionalidadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoNacionalidad.setToolTipText("Nombre");
		this.jLabelnombreTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoNacionalidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoNacionalidad.setToolTipText(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoNacionalidad = new GridBagLayout();
		this.jPanelnombreTipoNacionalidad.setLayout(this.gridaBagLayoutTipoNacionalidad);


		jTextAreanombreTipoNacionalidad= new JTextAreaMe();
		jTextAreanombreTipoNacionalidad.setEnabled(false);
		jTextAreanombreTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoNacionalidad.setLineWrap(true);
		jTextAreanombreTipoNacionalidad.setWrapStyleWord(true);
		jTextAreanombreTipoNacionalidad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoNacionalidad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoNacionalidad = new JScrollPane(jTextAreanombreTipoNacionalidad);
		jscrollPanenombreTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoNacionalidadBusqueda= new JButtonMe();
		this.jButtonnombreTipoNacionalidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNacionalidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoNacionalidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoNacionalidadBusqueda.setText("U");
		this.jButtonnombreTipoNacionalidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoNacionalidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoNacionalidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoNacionalidadBusqueda"));

		if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoNacionalidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoNacionalidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoNacionalidad = new JLabelMe();
		this.jLabelid_empresaTipoNacionalidad.setText(""+TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoNacionalidad.setToolTipText("Empresa");
		this.jLabelid_empresaTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoNacionalidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoNacionalidad.setToolTipText(TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoNacionalidad = new GridBagLayout();
		this.jPanelid_empresaTipoNacionalidad.setLayout(this.gridaBagLayoutTipoNacionalidad);


		jComboBoxid_empresaTipoNacionalidad= new JComboBoxMe();
		jComboBoxid_empresaTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoNacionalidad.setEnabled(false);

		this.jButtonid_empresaTipoNacionalidad= new JButtonMe();
		this.jButtonid_empresaTipoNacionalidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoNacionalidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoNacionalidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoNacionalidad.setText("Buscar");
		this.jButtonid_empresaTipoNacionalidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoNacionalidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoNacionalidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoNacionalidad"));

		this.jButtonid_empresaTipoNacionalidadBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoNacionalidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNacionalidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNacionalidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoNacionalidadBusqueda.setText("U");
		this.jButtonid_empresaTipoNacionalidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoNacionalidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoNacionalidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoNacionalidadBusqueda"));

		if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoNacionalidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoNacionalidadUpdate= new JButtonMe();
		this.jButtonid_empresaTipoNacionalidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNacionalidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoNacionalidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoNacionalidadUpdate.setText("U");
		this.jButtonid_empresaTipoNacionalidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoNacionalidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoNacionalidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoNacionalidadUpdate"));



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
		//this.jInternalFrameDetalleTipoNacionalidad = new TipoNacionalidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Nacionalidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoNacionalidad= new GridBagLayout();
		

		
		String sToolTipTipoNacionalidad="";
		sToolTipTipoNacionalidad=TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoNacionalidad+="(Cartera.TipoNacionalidad)";
		}
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoNacionalidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoNacionalidad = new JButtonMe();
		this.jButtonModificarTipoNacionalidad = new JButtonMe();
        this.jButtonActualizarTipoNacionalidad = new JButtonMe();
        this.jButtonEliminarTipoNacionalidad = new JButtonMe();
        this.jButtonCancelarTipoNacionalidad = new JButtonMe();
        this.jButtonGuardarCambiosTipoNacionalidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoNacionalidad = new JButtonMe();
		this.jButtonCerrarTipoNacionalidad = new JButtonMe();
		
		this.jScrollPanelDatosTipoNacionalidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoNacionalidad = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoNacionalidad = new JScrollPane();
				
		
		
		this.jPanelCamposTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Nacionalidad";
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Nacionalidades" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoNacionalidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoNacionalidad.setName("jPanelCamposTipoNacionalidad"); 

		this.jPanelCamposOcultosTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoNacionalidad.setName("jPanelCamposOcultosTipoNacionalidad"); 

        this.jPanelAccionesTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoNacionalidad.setToolTipText("Acciones");
        this.jPanelAccionesTipoNacionalidad.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoNacionalidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoNacionalidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoNacionalidad.setText("Nuevo");
		this.jButtonModificarTipoNacionalidad.setText("Editar");
        this.jButtonActualizarTipoNacionalidad.setText("Actualizar");
        this.jButtonEliminarTipoNacionalidad.setText("Eliminar");
        this.jButtonCancelarTipoNacionalidad.setText("Cancelar");
        this.jButtonGuardarCambiosTipoNacionalidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoNacionalidad.setText("Guardar");
		this.jButtonCerrarTipoNacionalidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoNacionalidad,"nuevo_button","Nuevo",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoNacionalidad,"modificar_button","Editar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoNacionalidad,"actualizar_button","Actualizar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoNacionalidad,"eliminar_button","Eliminar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoNacionalidad,"cancelar_button","Cancelar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoNacionalidad,"guardarcambios_button","Guardar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoNacionalidad,"guardarcambiostabla_button","Guardar",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoNacionalidad,"cerrar_button","Salir",this.tiponacionalidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoNacionalidad.setToolTipText("Nuevo"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoNacionalidad.setToolTipText("Editar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoNacionalidad.setToolTipText("Actualizar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoNacionalidad.setToolTipText("Eliminar)"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoNacionalidad.setToolTipText("Cancelar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoNacionalidad.setToolTipText("Guardar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoNacionalidad.setToolTipText("Guardar"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoNacionalidad.setToolTipText("Salir"+" "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoNacionalidad";
		inputMap = this.jButtonNuevoTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoNacionalidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoNacionalidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoNacionalidad";
		inputMap = this.jButtonActualizarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoNacionalidad"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoNacionalidad";
		inputMap = this.jButtonEliminarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoNacionalidad"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoNacionalidad";
		inputMap = this.jButtonCancelarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoNacionalidad"));
		
		//CERRAR		
		sMapKey = "CerrarTipoNacionalidad";
		inputMap = this.jButtonCerrarTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoNacionalidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoNacionalidad";
		inputMap = this.jButtonGuardarCambiosTablaTipoNacionalidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoNacionalidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoNacionalidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoNacionalidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoNacionalidad.setToolTipText("Nuevo TipoNacionalidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoNacionalidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoNacionalidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoNacionalidad.setToolTipText("Sin Cerrar Ventana TipoNacionalidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoNacionalidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoNacionalidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoNacionalidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoNacionalidad.setText("Accion");
		this.jComboBoxTiposAccionesTipoNacionalidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoNacionalidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoNacionalidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoNacionalidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoNacionalidad = new JLabelMe();
		
		this.jLabelAccionesTipoNacionalidad.setText("Acciones");		
		this.jLabelAccionesTipoNacionalidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNacionalidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoNacionalidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoNacionalidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoNacionalidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoNacionalidad=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoNacionalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoNacionalidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoNacionalidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNacionalidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoNacionalidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoNacionalidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNacionalidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoNacionalidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoNacionalidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoNacionalidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoNacionalidad = new GridBagLayout();
		
		this.jPanelCamposTipoNacionalidad.setLayout(gridaBagLayoutCamposTipoNacionalidad);
		this.jPanelCamposOcultosTipoNacionalidad.setLayout(gridaBagLayoutCamposOcultosTipoNacionalidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoNacionalidad.add(jLabelIdTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 1;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoNacionalidad.add(jLabelidTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);


	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoNacionalidad.add(jLabelid_empresaTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx = 2;
		this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
		this.gridBagConstraintsTipoNacionalidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoNacionalidad.add(jButtonid_empresaTipoNacionalidadBusqueda, this.gridBagConstraintsTipoNacionalidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx = 3;
		this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
		this.gridBagConstraintsTipoNacionalidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoNacionalidad.add(jButtonid_empresaTipoNacionalidadUpdate, this.gridBagConstraintsTipoNacionalidad);
	}

	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 1;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoNacionalidad.add(jComboBoxid_empresaTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);


	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoNacionalidad.add(jLabelcodigoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx = 2;
		this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
		this.gridBagConstraintsTipoNacionalidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoNacionalidad.add(jButtoncodigoTipoNacionalidadBusqueda, this.gridBagConstraintsTipoNacionalidad);
	}

	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 1;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoNacionalidad.add(jTextFieldcodigoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);


	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoNacionalidad.add(jLabelnombreTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		//this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx = 2;
		this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
		this.gridBagConstraintsTipoNacionalidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoNacionalidad.add(jButtonnombreTipoNacionalidadBusqueda, this.gridBagConstraintsTipoNacionalidad);
	}

	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoNacionalidad.gridy = 0;
	this.gridBagConstraintsTipoNacionalidad.gridx = 1;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoNacionalidad.add(jscrollPanenombreTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNacionalidad.gridy = iYPanelCamposTipoNacionalidad;
	this.gridBagConstraintsTipoNacionalidad.gridx = iXPanelCamposTipoNacionalidad++;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNacionalidad.add(this.jPanelidTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(iXPanelCamposTipoNacionalidad % 1==0) {
		iXPanelCamposTipoNacionalidad=0;
		iYPanelCamposTipoNacionalidad++;
	}
	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNacionalidad.gridy = iYPanelCamposTipoNacionalidad;
	this.gridBagConstraintsTipoNacionalidad.gridx = iXPanelCamposTipoNacionalidad++;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNacionalidad.add(this.jPanelcodigoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(iXPanelCamposTipoNacionalidad % 1==0) {
		iXPanelCamposTipoNacionalidad=0;
		iYPanelCamposTipoNacionalidad++;
	}
	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNacionalidad.gridy = iYPanelCamposTipoNacionalidad;
	this.gridBagConstraintsTipoNacionalidad.gridx = iXPanelCamposTipoNacionalidad++;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoNacionalidad.add(this.jPanelnombreTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(iXPanelCamposTipoNacionalidad % 1==0) {
		iXPanelCamposTipoNacionalidad=0;
		iYPanelCamposTipoNacionalidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoNacionalidad.gridy = iYPanelCamposOcultosTipoNacionalidad;
	this.gridBagConstraintsTipoNacionalidad.gridx = iXPanelCamposOcultosTipoNacionalidad++;
	this.gridBagConstraintsTipoNacionalidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoNacionalidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoNacionalidad.add(this.jPanelid_empresaTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);



	if(iXPanelCamposOcultosTipoNacionalidad % 1==0) {
		iXPanelCamposOcultosTipoNacionalidad=0;
		iYPanelCamposOcultosTipoNacionalidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoNacionalidad= new GridBagLayout();
		this.jPanelAccionesTipoNacionalidad.setLayout(gridaBagLayoutAccionesTipoNacionalidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoNacionalidad= new GridBagLayout();
		this.jPanelAccionesFormularioTipoNacionalidad.setLayout(gridaBagLayoutAccionesFormularioTipoNacionalidad);
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNacionalidad.add(this.jComboBoxTiposAccionesFormularioTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoNacionalidad.add(this.jCheckBoxPostAccionNuevoTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNacionalidad.add(this.jCheckBoxPostAccionSinCerrarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoNacionalidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoNacionalidad.add(this.jCheckBoxPostAccionSinMensajeTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoNacionalidad.add(this.jButtonModificarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);							

		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;
		this.gridBagConstraintsTipoNacionalidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoNacionalidad.add(this.jButtonEliminarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
			
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNacionalidad.add(this.jButtonActualizarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);


		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;		
		this.gridBagConstraintsTipoNacionalidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoNacionalidad.add(this.jButtonGuardarCambiosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);	
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = 0;		
		this.gridBagConstraintsTipoNacionalidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoNacionalidad.add(this.jButtonCancelarTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoNacionalidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoNacionalidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();						
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoNacionalidad.gridx = 0;		
			//this.gridBagConstraintsTipoNacionalidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoNacionalidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoNacionalidad.gridx =0;
		this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoNacionalidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoNacionalidad = new TipoNacionalidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Nacionalidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Nacionalidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Nacionalidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoNacionalidadModel tiponacionalidadModel=new TipoNacionalidadModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoNacionalidadModel.TipoNacionalidadFocusTraversalPolicy tiponacionalidadFocusTraversalPolicy = tiponacionalidadModel.new TipoNacionalidadFocusTraversalPolicy(this);
			
			//tiponacionalidadFocusTraversalPolicy.settiponacionalidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiponacionalidadModel);
			
			
			this.jContentPaneDetalleTipoNacionalidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoNacionalidad = new GridBagLayout();	
			this.jContentPaneDetalleTipoNacionalidad.setLayout(gridaBagLayoutDetalleTipoNacionalidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoNacionalidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
				this.gridBagConstraintsTipoNacionalidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoNacionalidad.gridx = 0;
					
				
				this.jContentPaneDetalleTipoNacionalidad.add(jTtoolBarDetalleTipoNacionalidad, gridBagConstraintsTipoNacionalidad);								
				
}
			
			this.jScrollPanelDatosEdicionTipoNacionalidad=   new JScrollPane(jContentPaneDetalleTipoNacionalidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNacionalidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNacionalidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNacionalidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoNacionalidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoNacionalidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNacionalidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoNacionalidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoNacionalidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	        
			this.jContentPaneDetalleTipoNacionalidad.add(jPanelCamposTipoNacionalidad, gridBagConstraintsTipoNacionalidad);
			
			
			
			
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
						&& tiponacionalidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoNacionalidad= new GridBagConstraints();
						this.gridBagConstraintsTipoNacionalidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoNacionalidad.gridx = 0;
						this.jContentPaneDetalleTipoNacionalidad.add(this.jTabbedPaneRelacionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoNacionalidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoNacionalidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
					this.gridBagConstraintsTipoNacionalidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoNacionalidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoNacionalidad.gridx = 0;
					
				
					this.jContentPaneDetalleTipoNacionalidad.add(jPanelCamposOcultosTipoNacionalidad, gridBagConstraintsTipoNacionalidad);
				
					this.jPanelCamposOcultosTipoNacionalidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	        this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoNacionalidad.add(this.jPanelAccionesFormularioTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);							
			
			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
	        this.gridBagConstraintsTipoNacionalidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoNacionalidad.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoNacionalidad.add(this.jPanelAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoNacionalidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoNacionalidad=   new JScrollPane(this.jPanelCamposTipoNacionalidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoNacionalidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNacionalidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoNacionalidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoNacionalidad.gridx = 0;
			this.gridBagConstraintsTipoNacionalidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoNacionalidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoNacionalidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNacionalidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);			
			
			this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
			this.gridBagConstraintsTipoNacionalidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoNacionalidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
			
			
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		
			
		this.gridBagConstraintsTipoNacionalidad = new GridBagConstraints();
		this.gridBagConstraintsTipoNacionalidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoNacionalidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoNacionalidad, this.gridBagConstraintsTipoNacionalidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoNacionalidad;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoNacionalidad;
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
