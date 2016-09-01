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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoMovimiento_TSConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoMovimiento_TSDetalleFormJInternalFrame extends TipoMovimiento_TSBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMovimiento_TS;
	
	protected JMenuBar jmenuBarDetalleTipoMovimiento_TS;
	
	protected JMenu jmenuDetalleTipoMovimiento_TS;
	protected JMenu jmenuDetalleArchivoTipoMovimiento_TS;
	protected JMenu jmenuDetalleAccionesTipoMovimiento_TS;
	protected JMenu jmenuDetalleDatosTipoMovimiento_TS;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMovimiento_TS;	
	protected GridBagConstraints gridBagConstraintsTipoMovimiento_TS;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMovimiento_TSBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMovimiento_TS;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoMovimiento_TSSessionBean tipomovimiento_tsSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoMovimiento_TSLogic tipomovimiento_tsLogic;
	
	public JScrollPane jScrollPanelDatosTipoMovimiento_TS;
	public JScrollPane jScrollPanelDatosEdicionTipoMovimiento_TS;
	public JScrollPane jScrollPanelDatosGeneralTipoMovimiento_TS;
	
	protected JPanel jPanelCamposTipoMovimiento_TS;    
	protected JPanel jPanelCamposOcultosTipoMovimiento_TS;    	
	protected JPanel jPanelAccionesTipoMovimiento_TS;
	protected JPanel jPanelAccionesFormularioTipoMovimiento_TS;
    
	
	
	protected Integer iXPanelCamposTipoMovimiento_TS=0;
	protected Integer iYPanelCamposTipoMovimiento_TS=0;
	
	protected Integer iXPanelCamposOcultosTipoMovimiento_TS=0;
	protected Integer iYPanelCamposOcultosTipoMovimiento_TS=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMovimiento_TS;
	public JButton jButtonModificarTipoMovimiento_TS;
	public JButton jButtonActualizarTipoMovimiento_TS;
    public JButton jButtonEliminarTipoMovimiento_TS;
	public JButton jButtonCancelarTipoMovimiento_TS;
    public JButton jButtonGuardarCambiosTipoMovimiento_TS;
	public JButton jButtonGuardarCambiosTablaTipoMovimiento_TS;
	protected JButton jButtonCerrarTipoMovimiento_TS;
	
	
	protected JButton jButtonProcesarInformacionTipoMovimiento_TS;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMovimiento_TS;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMovimiento_TS;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMovimiento_TS;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMovimiento_TS;
	protected JButton jButtonModificarToolBarTipoMovimiento_TS;
	protected JButton jButtonActualizarToolBarTipoMovimiento_TS;
    protected JButton jButtonEliminarToolBarTipoMovimiento_TS;
	protected JButton jButtonCancelarToolBarTipoMovimiento_TS;
    protected JButton jButtonGuardarCambiosToolBarTipoMovimiento_TS;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMovimiento_TS;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMovimiento_TS;
	protected JButton jButtonCerrarToolBarTipoMovimiento_TS;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMovimiento_TS;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMovimiento_TS;
	protected JMenuItem jMenuItemModificarTipoMovimiento_TS;
	protected JMenuItem jMenuItemActualizarTipoMovimiento_TS;
    protected JMenuItem jMenuItemEliminarTipoMovimiento_TS;
	protected JMenuItem jMenuItemCancelarTipoMovimiento_TS;
    protected JMenuItem jMenuItemGuardarCambiosTipoMovimiento_TS;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMovimiento_TS;
	protected JMenuItem jMenuItemCerrarTipoMovimiento_TS;
	protected JMenuItem jMenuItemDetalleCerrarTipoMovimiento_TS;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMovimiento_TS;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMovimiento_TS;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMovimiento_TS;
	protected JMenuItem jMenuItemMostrarOcultarTipoMovimiento_TS;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMovimiento_TS;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMovimiento_TS;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMovimiento_TS;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMovimiento_TS;
	public JLabel jLabelIdTipoMovimiento_TS;
	public JLabel jLabelidTipoMovimiento_TS;
	public JButton jButtonidTipoMovimiento_TSBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoMovimiento_TS;
	public JLabel jLabelcodigoTipoMovimiento_TS;
	public JTextField jTextFieldcodigoTipoMovimiento_TS;
	public JButton jButtoncodigoTipoMovimiento_TSBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMovimiento_TS;
	public JLabel jLabelnombreTipoMovimiento_TS;
	public JTextArea jTextAreanombreTipoMovimiento_TS;
	public JScrollPane jscrollPanenombreTipoMovimiento_TS;
	public JButton jButtonnombreTipoMovimiento_TSBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoMovimiento_TS;
	public JLabel jLabelid_empresaTipoMovimiento_TS;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoMovimiento_TS;
	public JButton jButtonid_empresaTipoMovimiento_TS= new JButtonMe();
	public JButton jButtonid_empresaTipoMovimiento_TSUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoMovimiento_TSBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMovimiento_TS;
	
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
	
	public TipoMovimiento_TSDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMovimiento_TS=new JPanel();
				this.jPanelAccionesFormularioTipoMovimiento_TS=new JPanel();
				this.jmenuBarDetalleTipoMovimiento_TS=new JMenuBar();
				this.jTtoolBarDetalleTipoMovimiento_TS=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMovimiento_TSDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMovimiento_TSDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMovimiento_TS No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMovimiento_TS() {
		return this.jButtonActualizarToolBarTipoMovimiento_TS;
	}
	
	public JButton getjButtonEliminarToolBarTipoMovimiento_TS() {
		return this.jButtonEliminarToolBarTipoMovimiento_TS;
	}
	
	public JButton getjButtonCancelarToolBarTipoMovimiento_TS() {
		return this.jButtonCancelarToolBarTipoMovimiento_TS;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMovimiento_TS() {
		return this.jButtonProcesarInformacionTipoMovimiento_TS;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMovimiento_TS)	{
		this.jButtonProcesarInformacionTipoMovimiento_TS = jButtonProcesarInformacionTipoMovimiento_TS;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMovimiento_TS() {
		return this.jComboBoxTiposAccionesTipoMovimiento_TS;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMovimiento_TS(
			JComboBox jComboBoxTiposRelacionesTipoMovimiento_TS) {
		this.jComboBoxTiposRelacionesTipoMovimiento_TS = jComboBoxTiposRelacionesTipoMovimiento_TS;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMovimiento_TS(
			JComboBox jComboBoxTiposAccionesTipoMovimiento_TS) {
		this.jComboBoxTiposAccionesTipoMovimiento_TS = jComboBoxTiposAccionesTipoMovimiento_TS;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMovimiento_TS() {
		return this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMovimiento_TS(
			JComboBox jComboBoxTiposAccionesFormularioTipoMovimiento_TS) {
		this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS = jComboBoxTiposAccionesFormularioTipoMovimiento_TS;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomovimiento_tsSessionBean=new TipoMovimiento_TSSessionBean();
		
		this.tipomovimiento_tsSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimiento_tsSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMovimiento_TSJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMovimiento_TSJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMovimiento_TSJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Movimiento_ T S MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMovimiento_TSJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMovimiento_TS= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMovimiento_TS=new JButtonMe();
				this.jButtonModificarToolBarTipoMovimiento_TS=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMovimiento_TS,this.jTtoolBarDetalleTipoMovimiento_TS,
							"actualizar","actualizar","Actualizar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMovimiento_TS,this.jTtoolBarDetalleTipoMovimiento_TS,
							"eliminar","eliminar","Eliminar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMovimiento_TS,this.jTtoolBarDetalleTipoMovimiento_TS,
							"cancelar","cancelar","Cancelar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMovimiento_TS=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMovimiento_TS,this.jTtoolBarDetalleTipoMovimiento_TS,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMovimiento_TS=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMovimiento_TS=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMovimiento_TS=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMovimiento_TS=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMovimiento_TS=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMovimiento_TS= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMovimiento_TS.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMovimiento_TS,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMovimiento_TS= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMovimiento_TS.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMovimiento_TS,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMovimiento_TS= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMovimiento_TS.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMovimiento_TS,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMovimiento_TS= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMovimiento_TS.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMovimiento_TS,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMovimiento_TS= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMovimiento_TS.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMovimiento_TS,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMovimiento_TS= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMovimiento_TS.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMovimiento_TS,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMovimiento_TS= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMovimiento_TS.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMovimiento_TS,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMovimiento_TS= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMovimiento_TS.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMovimiento_TS,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMovimiento_TS= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMovimiento_TS.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMovimiento_TS,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMovimiento_TS.add(this.jMenuItemDetalleCerrarTipoMovimiento_TS);
		
		this.jmenuDetalleAccionesTipoMovimiento_TS.add(this.jMenuItemActualizarTipoMovimiento_TS);
		this.jmenuDetalleAccionesTipoMovimiento_TS.add(this.jMenuItemEliminarTipoMovimiento_TS);
		this.jmenuDetalleAccionesTipoMovimiento_TS.add(this.jMenuItemCancelarTipoMovimiento_TS);		
		
		//this.jmenuDetalleDatosTipoMovimiento_TS.add(this.jMenuItemDetalleAbrirOrderByTipoMovimiento_TS);				
		this.jmenuDetalleDatosTipoMovimiento_TS.add(this.jMenuItemDetalleMostarOcultarTipoMovimiento_TS);				
				
		//this.jmenuDetalleAccionesTipoMovimiento_TS.add(this.jMenuItemGuardarCambiosTipoMovimiento_TS);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMovimiento_TS.add(this.jmenuDetalleArchivoTipoMovimiento_TS);		
		this.jmenuBarDetalleTipoMovimiento_TS.add(this.jmenuDetalleAccionesTipoMovimiento_TS);		
		this.jmenuBarDetalleTipoMovimiento_TS.add(this.jmenuDetalleDatosTipoMovimiento_TS);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMovimiento_TS);				
	}
	
	
	public void inicializarElementosCamposTipoMovimiento_TS() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMovimiento_TS = new JLabelMe();
		jLabelIdTipoMovimiento_TS.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMovimiento_TS = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMovimiento_TS.setToolTipText(TipoMovimiento_TSConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMovimiento_TS= new GridBagLayout();

		this.jPanelidTipoMovimiento_TS.setLayout(this.gridaBagLayoutTipoMovimiento_TS);

		jLabelidTipoMovimiento_TS = new JLabel();
		jLabelidTipoMovimiento_TS.setText("Id");

		jLabelidTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoMovimiento_TS = new JLabelMe();
		this.jLabelcodigoTipoMovimiento_TS.setText(""+TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoMovimiento_TS.setToolTipText("Codigo");
		this.jLabelcodigoTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoMovimiento_TS=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoMovimiento_TS.setToolTipText(TipoMovimiento_TSConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoMovimiento_TS = new GridBagLayout();
		this.jPanelcodigoTipoMovimiento_TS.setLayout(this.gridaBagLayoutTipoMovimiento_TS);


		jTextFieldcodigoTipoMovimiento_TS= new JTextFieldMe();

		jTextFieldcodigoTipoMovimiento_TS.setEnabled(false);
		jTextFieldcodigoTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoMovimiento_TSBusqueda= new JButtonMe();
		this.jButtoncodigoTipoMovimiento_TSBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMovimiento_TSBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMovimiento_TSBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoMovimiento_TSBusqueda.setText("U");
		this.jButtoncodigoTipoMovimiento_TSBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoMovimiento_TSBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoMovimiento_TSBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoMovimiento_TSBusqueda"));

		if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoMovimiento_TSBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoMovimiento_TS = new JLabelMe();
		this.jLabelnombreTipoMovimiento_TS.setText(""+TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMovimiento_TS.setToolTipText("Nombre");
		this.jLabelnombreTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMovimiento_TS=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMovimiento_TS.setToolTipText(TipoMovimiento_TSConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMovimiento_TS = new GridBagLayout();
		this.jPanelnombreTipoMovimiento_TS.setLayout(this.gridaBagLayoutTipoMovimiento_TS);


		jTextAreanombreTipoMovimiento_TS= new JTextAreaMe();
		jTextAreanombreTipoMovimiento_TS.setEnabled(false);
		jTextAreanombreTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMovimiento_TS.setLineWrap(true);
		jTextAreanombreTipoMovimiento_TS.setWrapStyleWord(true);
		jTextAreanombreTipoMovimiento_TS.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMovimiento_TS.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMovimiento_TS = new JScrollPane(jTextAreanombreTipoMovimiento_TS);
		jscrollPanenombreTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMovimiento_TSBusqueda= new JButtonMe();
		this.jButtonnombreTipoMovimiento_TSBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMovimiento_TSBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMovimiento_TSBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMovimiento_TSBusqueda.setText("U");
		this.jButtonnombreTipoMovimiento_TSBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMovimiento_TSBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMovimiento_TSBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMovimiento_TSBusqueda"));

		if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMovimiento_TSBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMovimiento_TS() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoMovimiento_TS = new JLabelMe();
		this.jLabelid_empresaTipoMovimiento_TS.setText(""+TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoMovimiento_TS.setToolTipText("Empresa");
		this.jLabelid_empresaTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoMovimiento_TS=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoMovimiento_TS.setToolTipText(TipoMovimiento_TSConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoMovimiento_TS = new GridBagLayout();
		this.jPanelid_empresaTipoMovimiento_TS.setLayout(this.gridaBagLayoutTipoMovimiento_TS);


		jComboBoxid_empresaTipoMovimiento_TS= new JComboBoxMe();
		jComboBoxid_empresaTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoMovimiento_TS.setEnabled(false);

		this.jButtonid_empresaTipoMovimiento_TS= new JButtonMe();
		this.jButtonid_empresaTipoMovimiento_TS.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMovimiento_TS.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMovimiento_TS.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoMovimiento_TS.setText("Buscar");
		this.jButtonid_empresaTipoMovimiento_TS.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoMovimiento_TS.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMovimiento_TS,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMovimiento_TS"));

		this.jButtonid_empresaTipoMovimiento_TSBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoMovimiento_TSBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMovimiento_TSBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMovimiento_TSBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMovimiento_TSBusqueda.setText("U");
		this.jButtonid_empresaTipoMovimiento_TSBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoMovimiento_TSBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMovimiento_TSBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMovimiento_TSBusqueda"));

		if(this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoMovimiento_TSBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoMovimiento_TSUpdate= new JButtonMe();
		this.jButtonid_empresaTipoMovimiento_TSUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMovimiento_TSUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoMovimiento_TSUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoMovimiento_TSUpdate.setText("U");
		this.jButtonid_empresaTipoMovimiento_TSUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoMovimiento_TSUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoMovimiento_TSUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoMovimiento_TS.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoMovimiento_TS.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoMovimiento_TSUpdate"));



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
		//this.jInternalFrameDetalleTipoMovimiento_TS = new TipoMovimiento_TSBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Movimiento_ T S DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMovimiento_TS= new GridBagLayout();
		

		
		String sToolTipTipoMovimiento_TS="";
		sToolTipTipoMovimiento_TS=TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMovimiento_TS+="(Tesoreria.TipoMovimiento_TS)";
		}
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMovimiento_TS+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMovimiento_TS = new JButtonMe();
		this.jButtonModificarTipoMovimiento_TS = new JButtonMe();
        this.jButtonActualizarTipoMovimiento_TS = new JButtonMe();
        this.jButtonEliminarTipoMovimiento_TS = new JButtonMe();
        this.jButtonCancelarTipoMovimiento_TS = new JButtonMe();
        this.jButtonGuardarCambiosTipoMovimiento_TS = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS = new JButtonMe();
		this.jButtonCerrarTipoMovimiento_TS = new JButtonMe();
		
		this.jScrollPanelDatosTipoMovimiento_TS = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMovimiento_TS = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMovimiento_TS = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Movimiento_ T S";
		
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Movimiento_ T Ses" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMovimiento_TS.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMovimiento_TS.setName("jPanelCamposTipoMovimiento_TS"); 

		this.jPanelCamposOcultosTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMovimiento_TS.setName("jPanelCamposOcultosTipoMovimiento_TS"); 

        this.jPanelAccionesTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMovimiento_TS.setToolTipText("Acciones");
        this.jPanelAccionesTipoMovimiento_TS.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMovimiento_TS.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMovimiento_TS.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMovimiento_TS.setText("Nuevo");
		this.jButtonModificarTipoMovimiento_TS.setText("Editar");
        this.jButtonActualizarTipoMovimiento_TS.setText("Actualizar");
        this.jButtonEliminarTipoMovimiento_TS.setText("Eliminar");
        this.jButtonCancelarTipoMovimiento_TS.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMovimiento_TS.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.setText("Guardar");
		this.jButtonCerrarTipoMovimiento_TS.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMovimiento_TS,"nuevo_button","Nuevo",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMovimiento_TS,"modificar_button","Editar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMovimiento_TS,"actualizar_button","Actualizar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMovimiento_TS,"eliminar_button","Eliminar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMovimiento_TS,"cancelar_button","Cancelar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMovimiento_TS,"guardarcambios_button","Guardar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMovimiento_TS,"guardarcambiostabla_button","Guardar",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMovimiento_TS,"cerrar_button","Salir",this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMovimiento_TS.setToolTipText("Nuevo"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMovimiento_TS.setToolTipText("Editar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMovimiento_TS.setToolTipText("Actualizar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMovimiento_TS.setToolTipText("Eliminar)"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMovimiento_TS.setToolTipText("Cancelar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMovimiento_TS.setToolTipText("Guardar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.setToolTipText("Guardar"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMovimiento_TS.setToolTipText("Salir"+" "+TipoMovimiento_TSConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMovimiento_TS";
		inputMap = this.jButtonNuevoTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMovimiento_TS.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMovimiento_TS"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMovimiento_TS";
		inputMap = this.jButtonActualizarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMovimiento_TS"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMovimiento_TS";
		inputMap = this.jButtonEliminarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMovimiento_TS"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMovimiento_TS";
		inputMap = this.jButtonCancelarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMovimiento_TS"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMovimiento_TS";
		inputMap = this.jButtonCerrarTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMovimiento_TS"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMovimiento_TS";
		inputMap = this.jButtonGuardarCambiosTablaTipoMovimiento_TS.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMovimiento_TS.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMovimiento_TS"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMovimiento_TS = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMovimiento_TS.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMovimiento_TS.setToolTipText("Nuevo TipoMovimiento_TS");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS.setToolTipText("Sin Cerrar Ventana TipoMovimiento_TS");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMovimiento_TS.setText("Accion");
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMovimiento_TS = new JLabelMe();
		
		this.jLabelAccionesTipoMovimiento_TS.setText("Acciones");		
		this.jLabelAccionesTipoMovimiento_TS.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento_TS.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMovimiento_TS.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMovimiento_TS();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMovimiento_TS();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMovimiento_TS=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMovimiento_TS.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMovimiento_TS,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMovimiento_TS.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMovimiento_TS = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMovimiento_TS = new GridBagLayout();
		
		this.jPanelCamposTipoMovimiento_TS.setLayout(gridaBagLayoutCamposTipoMovimiento_TS);
		this.jPanelCamposOcultosTipoMovimiento_TS.setLayout(gridaBagLayoutCamposOcultosTipoMovimiento_TS);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMovimiento_TS.add(jLabelIdTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 1;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMovimiento_TS.add(jLabelidTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);


	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoMovimiento_TS.add(jLabelcodigoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 2;
		this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
		this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoMovimiento_TS.add(jButtoncodigoTipoMovimiento_TSBusqueda, this.gridBagConstraintsTipoMovimiento_TS);
	}

	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 1;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoMovimiento_TS.add(jTextFieldcodigoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);


	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMovimiento_TS.add(jLabelnombreTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 2;
		this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
		this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMovimiento_TS.add(jButtonnombreTipoMovimiento_TSBusqueda, this.gridBagConstraintsTipoMovimiento_TS);
	}

	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 1;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMovimiento_TS.add(jscrollPanenombreTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);


	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoMovimiento_TS.add(jLabelid_empresaTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 2;
		this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
		this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMovimiento_TS.add(jButtonid_empresaTipoMovimiento_TSBusqueda, this.gridBagConstraintsTipoMovimiento_TS);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		//this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 3;
		this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
		this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoMovimiento_TS.add(jButtonid_empresaTipoMovimiento_TSUpdate, this.gridBagConstraintsTipoMovimiento_TS);
	}

	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = 1;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoMovimiento_TS.add(jComboBoxid_empresaTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = iYPanelCamposTipoMovimiento_TS;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = iXPanelCamposTipoMovimiento_TS++;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimiento_TS.add(this.jPanelidTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(iXPanelCamposTipoMovimiento_TS % 1==0) {
		iXPanelCamposTipoMovimiento_TS=0;
		iYPanelCamposTipoMovimiento_TS++;
	}
	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = iYPanelCamposTipoMovimiento_TS;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = iXPanelCamposTipoMovimiento_TS++;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimiento_TS.add(this.jPanelcodigoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(iXPanelCamposTipoMovimiento_TS % 1==0) {
		iXPanelCamposTipoMovimiento_TS=0;
		iYPanelCamposTipoMovimiento_TS++;
	}
	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = iYPanelCamposTipoMovimiento_TS;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = iXPanelCamposTipoMovimiento_TS++;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMovimiento_TS.add(this.jPanelnombreTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(iXPanelCamposTipoMovimiento_TS % 1==0) {
		iXPanelCamposTipoMovimiento_TS=0;
		iYPanelCamposTipoMovimiento_TS++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMovimiento_TS.gridy = iYPanelCamposOcultosTipoMovimiento_TS;
	this.gridBagConstraintsTipoMovimiento_TS.gridx = iXPanelCamposOcultosTipoMovimiento_TS++;
	this.gridBagConstraintsTipoMovimiento_TS.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMovimiento_TS.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoMovimiento_TS.add(this.jPanelid_empresaTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);



	if(iXPanelCamposOcultosTipoMovimiento_TS % 1==0) {
		iXPanelCamposOcultosTipoMovimiento_TS=0;
		iYPanelCamposOcultosTipoMovimiento_TS++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMovimiento_TS= new GridBagLayout();
		this.jPanelAccionesTipoMovimiento_TS.setLayout(gridaBagLayoutAccionesTipoMovimiento_TS);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMovimiento_TS= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMovimiento_TS.setLayout(gridaBagLayoutAccionesFormularioTipoMovimiento_TS);
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMovimiento_TS.add(this.jComboBoxTiposAccionesFormularioTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMovimiento_TS.add(this.jCheckBoxPostAccionNuevoTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMovimiento_TS.add(this.jCheckBoxPostAccionSinCerrarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomovimiento_tsSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMovimiento_TS.add(this.jCheckBoxPostAccionSinMensajeTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMovimiento_TS.add(this.jButtonModificarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);							

		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;
		this.gridBagConstraintsTipoMovimiento_TS.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMovimiento_TS.add(this.jButtonEliminarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
			
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMovimiento_TS.add(this.jButtonActualizarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);


		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMovimiento_TS.add(this.jButtonGuardarCambiosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);	
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = 0;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMovimiento_TS.add(this.jButtonCancelarTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMovimiento_TS = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMovimiento_TS);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomovimiento_tsSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();						
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;		
			//this.gridBagConstraintsTipoMovimiento_TS.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMovimiento_TS.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMovimiento_TS.gridx =0;
		this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMovimiento_TS.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMovimiento_TSJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMovimiento_TS = new TipoMovimiento_TSBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Movimiento_ T S DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Movimiento_ T S DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movimiento_ T S Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMovimiento_TSModel tipomovimiento_tsModel=new TipoMovimiento_TSModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMovimiento_TSModel.TipoMovimiento_TSFocusTraversalPolicy tipomovimiento_tsFocusTraversalPolicy = tipomovimiento_tsModel.new TipoMovimiento_TSFocusTraversalPolicy(this);
			
			//tipomovimiento_tsFocusTraversalPolicy.settipomovimiento_tsJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomovimiento_tsModel);
			
			
			this.jContentPaneDetalleTipoMovimiento_TS = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMovimiento_TS = new GridBagLayout();	
			this.jContentPaneDetalleTipoMovimiento_TS.setLayout(gridaBagLayoutDetalleTipoMovimiento_TS);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMovimiento_TS = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
				this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMovimiento_TS.add(jTtoolBarDetalleTipoMovimiento_TS, gridBagConstraintsTipoMovimiento_TS);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMovimiento_TS=   new JScrollPane(jContentPaneDetalleTipoMovimiento_TS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMovimiento_TS=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	        
			this.jContentPaneDetalleTipoMovimiento_TS.add(jPanelCamposTipoMovimiento_TS, gridBagConstraintsTipoMovimiento_TS);
			
			
			
			
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
						&& tipomovimiento_tsSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipomovimiento_tsSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMovimiento_TS= new GridBagConstraints();
						this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
						this.jContentPaneDetalleTipoMovimiento_TS.add(this.jTabbedPaneRelacionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMovimiento_TS.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMovimiento_TS.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
					this.gridBagConstraintsTipoMovimiento_TS.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMovimiento_TS.add(jPanelCamposOcultosTipoMovimiento_TS, gridBagConstraintsTipoMovimiento_TS);
				
					this.jPanelCamposOcultosTipoMovimiento_TS.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	        this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMovimiento_TS.add(this.jPanelAccionesFormularioTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);							
			
			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
	        this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMovimiento_TS.add(this.jPanelAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMovimiento_TS);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMovimiento_TS=   new JScrollPane(this.jPanelCamposTipoMovimiento_TS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMovimiento_TS.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento_TS.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMovimiento_TS.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
			this.gridBagConstraintsTipoMovimiento_TS.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMovimiento_TS.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMovimiento_TS.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);			
			
			this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
			this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
			
			
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		
			
		this.gridBagConstraintsTipoMovimiento_TS = new GridBagConstraints();
		this.gridBagConstraintsTipoMovimiento_TS.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMovimiento_TS.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMovimiento_TS, this.gridBagConstraintsTipoMovimiento_TS);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMovimiento_TS;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMovimiento_TS;
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
