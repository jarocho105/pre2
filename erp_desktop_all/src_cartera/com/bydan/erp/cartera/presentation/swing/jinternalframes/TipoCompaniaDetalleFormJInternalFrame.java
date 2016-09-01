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
import com.bydan.erp.cartera.util.TipoCompaniaConstantesFunciones;

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
public class TipoCompaniaDetalleFormJInternalFrame extends TipoCompaniaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCompania;
	
	protected JMenuBar jmenuBarDetalleTipoCompania;
	
	protected JMenu jmenuDetalleTipoCompania;
	protected JMenu jmenuDetalleArchivoTipoCompania;
	protected JMenu jmenuDetalleAccionesTipoCompania;
	protected JMenu jmenuDetalleDatosTipoCompania;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCompania;	
	protected GridBagConstraints gridBagConstraintsTipoCompania;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCompaniaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCompania;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCompaniaSessionBean tipocompaniaSessionBean;
	
	

	public DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFrame=null;
	public DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoConstitucion=false;
	public DatoConstitucionSessionBean datoconstitucionSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoCompaniaLogic tipocompaniaLogic;
	
	public JScrollPane jScrollPanelDatosTipoCompania;
	public JScrollPane jScrollPanelDatosEdicionTipoCompania;
	public JScrollPane jScrollPanelDatosGeneralTipoCompania;
	
	protected JPanel jPanelCamposTipoCompania;    
	protected JPanel jPanelCamposOcultosTipoCompania;    	
	protected JPanel jPanelAccionesTipoCompania;
	protected JPanel jPanelAccionesFormularioTipoCompania;
    
	
	
	protected Integer iXPanelCamposTipoCompania=0;
	protected Integer iYPanelCamposTipoCompania=0;
	
	protected Integer iXPanelCamposOcultosTipoCompania=0;
	protected Integer iYPanelCamposOcultosTipoCompania=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCompania;
	public JButton jButtonModificarTipoCompania;
	public JButton jButtonActualizarTipoCompania;
    public JButton jButtonEliminarTipoCompania;
	public JButton jButtonCancelarTipoCompania;
    public JButton jButtonGuardarCambiosTipoCompania;
	public JButton jButtonGuardarCambiosTablaTipoCompania;
	protected JButton jButtonCerrarTipoCompania;
	
	
	protected JButton jButtonProcesarInformacionTipoCompania;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCompania;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCompania;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCompania;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCompania;
	protected JButton jButtonModificarToolBarTipoCompania;
	protected JButton jButtonActualizarToolBarTipoCompania;
    protected JButton jButtonEliminarToolBarTipoCompania;
	protected JButton jButtonCancelarToolBarTipoCompania;
    protected JButton jButtonGuardarCambiosToolBarTipoCompania;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCompania;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCompania;
	protected JButton jButtonCerrarToolBarTipoCompania;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCompania;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCompania;
	protected JMenuItem jMenuItemModificarTipoCompania;
	protected JMenuItem jMenuItemActualizarTipoCompania;
    protected JMenuItem jMenuItemEliminarTipoCompania;
	protected JMenuItem jMenuItemCancelarTipoCompania;
    protected JMenuItem jMenuItemGuardarCambiosTipoCompania;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCompania;
	protected JMenuItem jMenuItemCerrarTipoCompania;
	protected JMenuItem jMenuItemDetalleCerrarTipoCompania;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCompania;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCompania;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCompania;
	protected JMenuItem jMenuItemMostrarOcultarTipoCompania;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCompania;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCompania;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCompania;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCompania;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCompania;
	public JLabel jLabelIdTipoCompania;
	public JLabel jLabelidTipoCompania;
	public JButton jButtonidTipoCompaniaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCompania;
	public JLabel jLabelcodigoTipoCompania;
	public JTextField jTextFieldcodigoTipoCompania;
	public JButton jButtoncodigoTipoCompaniaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCompania;
	public JLabel jLabelnombreTipoCompania;
	public JTextArea jTextAreanombreTipoCompania;
	public JScrollPane jscrollPanenombreTipoCompania;
	public JButton jButtonnombreTipoCompaniaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCompania;
	public JLabel jLabelid_empresaTipoCompania;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCompania;
	public JButton jButtonid_empresaTipoCompania= new JButtonMe();
	public JButton jButtonid_empresaTipoCompaniaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCompaniaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCompania;
	
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
	
	public TipoCompaniaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCompania=new JPanel();
				this.jPanelAccionesFormularioTipoCompania=new JPanel();
				this.jmenuBarDetalleTipoCompania=new JMenuBar();
				this.jTtoolBarDetalleTipoCompania=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCompaniaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCompaniaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCompania No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCompania() {
		return this.jButtonActualizarToolBarTipoCompania;
	}
	
	public JButton getjButtonEliminarToolBarTipoCompania() {
		return this.jButtonEliminarToolBarTipoCompania;
	}
	
	public JButton getjButtonCancelarToolBarTipoCompania() {
		return this.jButtonCancelarToolBarTipoCompania;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCompania() {
		return this.jButtonProcesarInformacionTipoCompania;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCompania)	{
		this.jButtonProcesarInformacionTipoCompania = jButtonProcesarInformacionTipoCompania;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCompania() {
		return this.jComboBoxTiposAccionesTipoCompania;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCompania(
			JComboBox jComboBoxTiposRelacionesTipoCompania) {
		this.jComboBoxTiposRelacionesTipoCompania = jComboBoxTiposRelacionesTipoCompania;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCompania(
			JComboBox jComboBoxTiposAccionesTipoCompania) {
		this.jComboBoxTiposAccionesTipoCompania = jComboBoxTiposAccionesTipoCompania;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCompania() {
		return this.jComboBoxTiposAccionesFormularioTipoCompania;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCompania(
			JComboBox jComboBoxTiposAccionesFormularioTipoCompania) {
		this.jComboBoxTiposAccionesFormularioTipoCompania = jComboBoxTiposAccionesFormularioTipoCompania;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocompaniaSessionBean=new TipoCompaniaSessionBean();
		
		this.tipocompaniaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocompaniaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocompaniaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCompaniaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Compania MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCompaniaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCompania= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCompania=new JButtonMe();
				this.jButtonModificarToolBarTipoCompania=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCompania,this.jTtoolBarDetalleTipoCompania,
							"actualizar","actualizar","Actualizar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCompania,this.jTtoolBarDetalleTipoCompania,
							"eliminar","eliminar","Eliminar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCompania,this.jTtoolBarDetalleTipoCompania,
							"cancelar","cancelar","Cancelar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCompania=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCompania,this.jTtoolBarDetalleTipoCompania,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCompania=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCompania=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCompania=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCompania=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCompania=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCompania= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCompania.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCompania,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCompania= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCompania.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCompania,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCompania= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCompania.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCompania,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCompania= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCompania.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCompania,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCompania= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCompania.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCompania,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCompania= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCompania.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCompania,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCompania= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCompania.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCompania,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCompania= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCompania.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCompania,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCompania= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCompania.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCompania,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCompania= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCompania.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCompania,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCompania.add(this.jMenuItemDetalleCerrarTipoCompania);
		
		this.jmenuDetalleAccionesTipoCompania.add(this.jMenuItemActualizarTipoCompania);
		this.jmenuDetalleAccionesTipoCompania.add(this.jMenuItemEliminarTipoCompania);
		this.jmenuDetalleAccionesTipoCompania.add(this.jMenuItemCancelarTipoCompania);		
		
		//this.jmenuDetalleDatosTipoCompania.add(this.jMenuItemDetalleAbrirOrderByTipoCompania);				
		this.jmenuDetalleDatosTipoCompania.add(this.jMenuItemDetalleMostarOcultarTipoCompania);				
				
		//this.jmenuDetalleAccionesTipoCompania.add(this.jMenuItemGuardarCambiosTipoCompania);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCompania.add(this.jmenuDetalleArchivoTipoCompania);		
		this.jmenuBarDetalleTipoCompania.add(this.jmenuDetalleAccionesTipoCompania);		
		this.jmenuBarDetalleTipoCompania.add(this.jmenuDetalleDatosTipoCompania);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCompania.add(this.jmenuDetalleTipoCompania);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCompania);				
	}
	
	
	public void inicializarElementosCamposTipoCompania() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCompania = new JLabelMe();
		jLabelIdTipoCompania.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCompania = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCompania.setToolTipText(TipoCompaniaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCompania= new GridBagLayout();

		this.jPanelidTipoCompania.setLayout(this.gridaBagLayoutTipoCompania);

		jLabelidTipoCompania = new JLabel();
		jLabelidTipoCompania.setText("Id");

		jLabelidTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCompania = new JLabelMe();
		this.jLabelcodigoTipoCompania.setText(""+TipoCompaniaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCompania.setToolTipText("Codigo");
		this.jLabelcodigoTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCompania=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCompania.setToolTipText(TipoCompaniaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCompania = new GridBagLayout();
		this.jPanelcodigoTipoCompania.setLayout(this.gridaBagLayoutTipoCompania);


		jTextFieldcodigoTipoCompania= new JTextFieldMe();

		jTextFieldcodigoTipoCompania.setEnabled(false);
		jTextFieldcodigoTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCompaniaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCompaniaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCompaniaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCompaniaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCompaniaBusqueda.setText("U");
		this.jButtoncodigoTipoCompaniaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCompaniaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCompaniaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCompaniaBusqueda"));

		if(this.tipocompaniaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCompaniaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCompania = new JLabelMe();
		this.jLabelnombreTipoCompania.setText(""+TipoCompaniaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCompania.setToolTipText("Nombre");
		this.jLabelnombreTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCompania=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCompania.setToolTipText(TipoCompaniaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCompania = new GridBagLayout();
		this.jPanelnombreTipoCompania.setLayout(this.gridaBagLayoutTipoCompania);


		jTextAreanombreTipoCompania= new JTextAreaMe();
		jTextAreanombreTipoCompania.setEnabled(false);
		jTextAreanombreTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCompania.setLineWrap(true);
		jTextAreanombreTipoCompania.setWrapStyleWord(true);
		jTextAreanombreTipoCompania.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCompania.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCompania = new JScrollPane(jTextAreanombreTipoCompania);
		jscrollPanenombreTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCompaniaBusqueda= new JButtonMe();
		this.jButtonnombreTipoCompaniaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCompaniaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCompaniaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCompaniaBusqueda.setText("U");
		this.jButtonnombreTipoCompaniaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCompaniaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCompaniaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCompaniaBusqueda"));

		if(this.tipocompaniaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCompaniaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCompania() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCompania = new JLabelMe();
		this.jLabelid_empresaTipoCompania.setText(""+TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCompania.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCompania=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCompania.setToolTipText(TipoCompaniaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCompania = new GridBagLayout();
		this.jPanelid_empresaTipoCompania.setLayout(this.gridaBagLayoutTipoCompania);


		jComboBoxid_empresaTipoCompania= new JComboBoxMe();
		jComboBoxid_empresaTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCompania.setEnabled(false);

		this.jButtonid_empresaTipoCompania= new JButtonMe();
		this.jButtonid_empresaTipoCompania.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCompania.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCompania.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCompania.setText("Buscar");
		this.jButtonid_empresaTipoCompania.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCompania.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCompania,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCompania"));

		this.jButtonid_empresaTipoCompaniaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCompaniaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCompaniaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCompaniaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCompaniaBusqueda.setText("U");
		this.jButtonid_empresaTipoCompaniaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCompaniaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCompaniaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCompaniaBusqueda"));

		if(this.tipocompaniaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCompaniaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCompaniaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCompaniaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCompaniaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCompaniaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCompaniaUpdate.setText("U");
		this.jButtonid_empresaTipoCompaniaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCompaniaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCompaniaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCompania.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCompania.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCompaniaUpdate"));



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
		//this.jInternalFrameDetalleTipoCompania = new TipoCompaniaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Compania DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCompania= new GridBagLayout();
		

		
		String sToolTipTipoCompania="";
		sToolTipTipoCompania=TipoCompaniaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCompania+="(Cartera.TipoCompania)";
		}
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCompania+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCompania = new JButtonMe();
		this.jButtonModificarTipoCompania = new JButtonMe();
        this.jButtonActualizarTipoCompania = new JButtonMe();
        this.jButtonEliminarTipoCompania = new JButtonMe();
        this.jButtonCancelarTipoCompania = new JButtonMe();
        this.jButtonGuardarCambiosTipoCompania = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCompania = new JButtonMe();
		this.jButtonCerrarTipoCompania = new JButtonMe();
		
		this.jScrollPanelDatosTipoCompania = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCompania = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCompania = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Compania";
		
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Companias" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCompania.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCompania.setName("jPanelCamposTipoCompania"); 

		this.jPanelCamposOcultosTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCompania.setName("jPanelCamposOcultosTipoCompania"); 

        this.jPanelAccionesTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCompania.setToolTipText("Acciones");
        this.jPanelAccionesTipoCompania.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCompania.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCompania.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCompania.setText("Nuevo");
		this.jButtonModificarTipoCompania.setText("Editar");
        this.jButtonActualizarTipoCompania.setText("Actualizar");
        this.jButtonEliminarTipoCompania.setText("Eliminar");
        this.jButtonCancelarTipoCompania.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCompania.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCompania.setText("Guardar");
		this.jButtonCerrarTipoCompania.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCompania,"nuevo_button","Nuevo",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCompania,"modificar_button","Editar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCompania,"actualizar_button","Actualizar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCompania,"eliminar_button","Eliminar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCompania,"cancelar_button","Cancelar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCompania,"guardarcambios_button","Guardar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCompania,"guardarcambiostabla_button","Guardar",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCompania,"cerrar_button","Salir",this.tipocompaniaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCompania.setToolTipText("Nuevo"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCompania.setToolTipText("Editar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCompania.setToolTipText("Actualizar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCompania.setToolTipText("Eliminar)"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCompania.setToolTipText("Cancelar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCompania.setToolTipText("Guardar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCompania.setToolTipText("Guardar"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCompania.setToolTipText("Salir"+" "+TipoCompaniaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCompania";
		inputMap = this.jButtonNuevoTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCompania.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCompania"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCompania";
		inputMap = this.jButtonActualizarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCompania"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCompania";
		inputMap = this.jButtonEliminarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCompania"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCompania";
		inputMap = this.jButtonCancelarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCompania"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCompania";
		inputMap = this.jButtonCerrarTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCompania"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCompania";
		inputMap = this.jButtonGuardarCambiosTablaTipoCompania.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCompania.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCompania"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCompania = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCompania.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCompania.setToolTipText("Nuevo TipoCompania");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCompania = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCompania.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCompania.setToolTipText("Sin Cerrar Ventana TipoCompania");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCompania = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCompania.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCompania.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCompania.setText("Accion");
		this.jComboBoxTiposAccionesTipoCompania.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCompania = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCompania.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCompania.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCompania = new JLabelMe();
		
		this.jLabelAccionesTipoCompania.setText("Acciones");		
		this.jLabelAccionesTipoCompania.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompania.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompania.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCompania();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCompania();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCompania=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCompania.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCompania,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCompania.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompania.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompania.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCompania, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCompania.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCompania.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCompania.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCompania, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCompania = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCompania = new GridBagLayout();
		
		this.jPanelCamposTipoCompania.setLayout(gridaBagLayoutCamposTipoCompania);
		this.jPanelCamposOcultosTipoCompania.setLayout(gridaBagLayoutCamposOcultosTipoCompania);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 0;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCompania.add(jLabelIdTipoCompania, this.gridBagConstraintsTipoCompania);



	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 1;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCompania.add(jLabelidTipoCompania, this.gridBagConstraintsTipoCompania);


	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 0;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCompania.add(jLabelid_empresaTipoCompania, this.gridBagConstraintsTipoCompania);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx = 2;
		this.gridBagConstraintsTipoCompania.ipadx = 0;
		this.gridBagConstraintsTipoCompania.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCompania.add(jButtonid_empresaTipoCompaniaBusqueda, this.gridBagConstraintsTipoCompania);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx = 3;
		this.gridBagConstraintsTipoCompania.ipadx = 0;
		this.gridBagConstraintsTipoCompania.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCompania.add(jButtonid_empresaTipoCompaniaUpdate, this.gridBagConstraintsTipoCompania);
	}

	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 1;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCompania.add(jComboBoxid_empresaTipoCompania, this.gridBagConstraintsTipoCompania);


	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 0;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCompania.add(jLabelcodigoTipoCompania, this.gridBagConstraintsTipoCompania);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx = 2;
		this.gridBagConstraintsTipoCompania.ipadx = 0;
		this.gridBagConstraintsTipoCompania.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCompania.add(jButtoncodigoTipoCompaniaBusqueda, this.gridBagConstraintsTipoCompania);
	}

	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 1;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCompania.add(jTextFieldcodigoTipoCompania, this.gridBagConstraintsTipoCompania);


	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 0;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCompania.add(jLabelnombreTipoCompania, this.gridBagConstraintsTipoCompania);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx = 2;
		this.gridBagConstraintsTipoCompania.ipadx = 0;
		this.gridBagConstraintsTipoCompania.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCompania.add(jButtonnombreTipoCompaniaBusqueda, this.gridBagConstraintsTipoCompania);
	}

	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompania.gridy = 0;
	this.gridBagConstraintsTipoCompania.gridx = 1;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCompania.add(jscrollPanenombreTipoCompania, this.gridBagConstraintsTipoCompania);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompania.gridy = iYPanelCamposTipoCompania;
	this.gridBagConstraintsTipoCompania.gridx = iXPanelCamposTipoCompania++;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCompania.add(this.jPanelidTipoCompania, this.gridBagConstraintsTipoCompania);



	if(iXPanelCamposTipoCompania % 1==0) {
		iXPanelCamposTipoCompania=0;
		iYPanelCamposTipoCompania++;
	}
	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompania.gridy = iYPanelCamposTipoCompania;
	this.gridBagConstraintsTipoCompania.gridx = iXPanelCamposTipoCompania++;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCompania.add(this.jPanelcodigoTipoCompania, this.gridBagConstraintsTipoCompania);



	if(iXPanelCamposTipoCompania % 1==0) {
		iXPanelCamposTipoCompania=0;
		iYPanelCamposTipoCompania++;
	}
	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompania.gridy = iYPanelCamposTipoCompania;
	this.gridBagConstraintsTipoCompania.gridx = iXPanelCamposTipoCompania++;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCompania.add(this.jPanelnombreTipoCompania, this.gridBagConstraintsTipoCompania);



	if(iXPanelCamposTipoCompania % 1==0) {
		iXPanelCamposTipoCompania=0;
		iYPanelCamposTipoCompania++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompania.gridy = iYPanelCamposOcultosTipoCompania;
	this.gridBagConstraintsTipoCompania.gridx = iXPanelCamposOcultosTipoCompania++;
	this.gridBagConstraintsTipoCompania.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompania.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCompania.add(this.jPanelid_empresaTipoCompania, this.gridBagConstraintsTipoCompania);



	if(iXPanelCamposOcultosTipoCompania % 1==0) {
		iXPanelCamposOcultosTipoCompania=0;
		iYPanelCamposOcultosTipoCompania++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCompania= new GridBagLayout();
		this.jPanelAccionesTipoCompania.setLayout(gridaBagLayoutAccionesTipoCompania);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCompania= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCompania.setLayout(gridaBagLayoutAccionesFormularioTipoCompania);
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCompania.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCompania.add(this.jComboBoxTiposAccionesFormularioTipoCompania, this.gridBagConstraintsTipoCompania);

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCompania.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCompania.add(this.jCheckBoxPostAccionNuevoTipoCompania, this.gridBagConstraintsTipoCompania);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCompania.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCompania.add(this.jCheckBoxPostAccionSinCerrarTipoCompania, this.gridBagConstraintsTipoCompania);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocompaniaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocompaniaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCompania.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCompania.add(this.jCheckBoxPostAccionSinMensajeTipoCompania, this.gridBagConstraintsTipoCompania);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCompania.add(this.jButtonModificarTipoCompania, this.gridBagConstraintsTipoCompania);							

		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompania.gridy = 0;
		this.gridBagConstraintsTipoCompania.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCompania.add(this.jButtonEliminarTipoCompania, this.gridBagConstraintsTipoCompania);
		
			
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = 0;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCompania.add(this.jButtonActualizarTipoCompania, this.gridBagConstraintsTipoCompania);


		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = 0;		
		this.gridBagConstraintsTipoCompania.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCompania.add(this.jButtonGuardarCambiosTipoCompania, this.gridBagConstraintsTipoCompania);	
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = 0;		
		this.gridBagConstraintsTipoCompania.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCompania.add(this.jButtonCancelarTipoCompania, this.gridBagConstraintsTipoCompania);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCompania = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCompania);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocompaniaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();						
			this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCompania.gridx = 0;		
			//this.gridBagConstraintsTipoCompania.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCompania.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCompania.gridx =0;
		this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCompania.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCompania, this.gridBagConstraintsTipoCompania);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCompaniaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCompania = new TipoCompaniaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Compania DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Compania DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Compania Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCompaniaModel tipocompaniaModel=new TipoCompaniaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCompaniaModel.TipoCompaniaFocusTraversalPolicy tipocompaniaFocusTraversalPolicy = tipocompaniaModel.new TipoCompaniaFocusTraversalPolicy(this);
			
			//tipocompaniaFocusTraversalPolicy.settipocompaniaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocompaniaModel);
			
			
			this.jContentPaneDetalleTipoCompania = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCompania = new GridBagLayout();	
			this.jContentPaneDetalleTipoCompania.setLayout(gridaBagLayoutDetalleTipoCompania);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCompania = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCompania = new GridBagConstraints();
				this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCompania.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCompania.add(jTtoolBarDetalleTipoCompania, gridBagConstraintsTipoCompania);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCompania=   new JScrollPane(jContentPaneDetalleTipoCompania,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCompania.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompania.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompania.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCompania=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCompania.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompania.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompania.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCompania.gridx = 0;
	        
			this.jContentPaneDetalleTipoCompania.add(jPanelCamposTipoCompania, gridBagConstraintsTipoCompania);
			
			
			
			
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
						&& tipocompaniaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDatoConstitucion(this.puedeCargarPorParteDatoConstitucion,false,-1);
					
					if(this.tipocompaniaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCompania= new GridBagConstraints();
						this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCompania.gridx = 0;
						this.jContentPaneDetalleTipoCompania.add(this.jTabbedPaneRelacionesTipoCompania, this.gridBagConstraintsTipoCompania);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCompania.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDatoConstitucion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCompania.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCompania = new GridBagConstraints();
					this.gridBagConstraintsTipoCompania.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCompania.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCompania.add(jPanelCamposOcultosTipoCompania, gridBagConstraintsTipoCompania);
				
					this.jPanelCamposOcultosTipoCompania.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCompania.gridx = 0;
	        this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCompania.add(this.jPanelAccionesFormularioTipoCompania, this.gridBagConstraintsTipoCompania);							
			
			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
	        this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCompania.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCompania.add(this.jPanelAccionesTipoCompania, this.gridBagConstraintsTipoCompania);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCompania);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCompania=   new JScrollPane(this.jPanelCamposTipoCompania,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCompania.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompania.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompania.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCompania.gridx = 0;
			this.gridBagConstraintsTipoCompania.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCompania.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCompania.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCompania, this.gridBagConstraintsTipoCompania);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCompania.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCompania, this.gridBagConstraintsTipoCompania);			
			
			this.gridBagConstraintsTipoCompania = new GridBagConstraints();
			this.gridBagConstraintsTipoCompania.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCompania.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCompania, this.gridBagConstraintsTipoCompania);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCompania, this.gridBagConstraintsTipoCompania);
			
			
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCompania, this.gridBagConstraintsTipoCompania);
		
			
		this.gridBagConstraintsTipoCompania = new GridBagConstraints();
		this.gridBagConstraintsTipoCompania.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompania.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCompania, this.gridBagConstraintsTipoCompania);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCompania;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCompania;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDatoConstitucion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		this.datoconstitucionSessionBean.setConGuardarRelaciones(false);
		this.datoconstitucionSessionBean.setEsGuardarRelacionado(true);

		this.datoconstitucionBeanSwingJInternalFrame=null;//new DatoConstitucionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datoconstitucionBeanSwingJInternalFramePopup=new DatoConstitucionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datoconstitucionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {

				DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoConstitucionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCompaniaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datoconstitucionSessionBean.setEsGuardarRelacionado(true);

				this.datoconstitucionBeanSwingJInternalFrame=new DatoConstitucionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datoconstitucionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datoconstitucionBeanSwingJInternalFrame.setdatoconstitucionSessionBean(this.datoconstitucionSessionBean);

				//this.gridBagConstraintsTipoCompania = new GridBagConstraints();
				//this.gridBagConstraintsTipoCompania.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCompania.gridx = 0;
				//this.jContentPaneDetalleTipoCompania.add(this.datoconstitucionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCompania);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCompania.add("Dato Constituciones",this.datoconstitucionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCompania.setComponentAt(iIndexTab,this.datoconstitucionBeanSwingJInternalFrame.getContentPane());
				}

				//DatoConstitucionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datoconstitucionSessionBean.setEsGuardarRelacionado(false);
				this.datoconstitucionBeanSwingJInternalFrame=null;//new DatoConstitucionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoConstitucion) {
					this.jTabbedPaneRelacionesTipoCompania.add("Dato Constituciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDatoConstitucionBeanSwingJInternalFrame(List<TipoCompania> tipocompanias,TipoCompania tipocompania,DatoConstitucionBeanSwingJInternalFrame datoconstitucionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datoconstitucionBeanSwingJInternalFrame=new DatoConstitucionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datoconstitucionBeanSwingJInternalFrame.getDatoConstitucionLogic().setConnexion(this.tipocompaniaLogic.getConnexion());

					datoconstitucionBeanSwingJInternalFrame.settipocompaniasForeignKey(tipocompanias);
					datoconstitucionBeanSwingJInternalFrame.settipocompaniaForeignKey(tipocompania);
					datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setisBusquedaDesdeForeignKeySesionTipoCompania(true);
					datoconstitucionBeanSwingJInternalFrame.datoconstitucionSessionBean.setlidTipoCompaniaActual(tipocompania.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datoconstitucionBeanSwingJInternalFrame.cargarCombosForeignKeyDatoConstitucion(datoconstitucionBeanSwingJInternalFrame.isCargarCombosDependencia);
					datoconstitucionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCompania(true);
					datoconstitucionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datoconstitucionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCompania");
					datoconstitucionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCompania");
					datoconstitucionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoConstitucion(true);
					datoconstitucionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoConstitucion("n",datoconstitucionBeanSwingJInternalFrame.isGuardarCambiosEnLote, datoconstitucionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datoconstitucionBeanSwingJInternalFrame.setAutoscrolls(true);
					datoconstitucionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datoconstitucionBeanSwingJInternalFrame.actualizarEstadoPanelsDatoConstitucion("relacionado");
					} else {
						datoconstitucionBeanSwingJInternalFrame.actualizarEstadoPanelsDatoConstitucion("no_relacionado");
					}

					datoconstitucionBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoConstitucion().setVisible(false);

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
