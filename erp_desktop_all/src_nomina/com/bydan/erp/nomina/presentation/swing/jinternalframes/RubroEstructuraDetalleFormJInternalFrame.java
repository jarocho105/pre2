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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.RubroEstructuraConstantesFunciones;

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
public class RubroEstructuraDetalleFormJInternalFrame extends RubroEstructuraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRubroEstructura;
	
	protected JMenuBar jmenuBarDetalleRubroEstructura;
	
	protected JMenu jmenuDetalleRubroEstructura;
	protected JMenu jmenuDetalleArchivoRubroEstructura;
	protected JMenu jmenuDetalleAccionesRubroEstructura;
	protected JMenu jmenuDetalleDatosRubroEstructura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRubroEstructura;	
	protected GridBagConstraints gridBagConstraintsRubroEstructura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RubroEstructuraBeanSwingJInternalFrameAdditional jInternalFrameDetalleRubroEstructura;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";
	
	public RubroEstructuraSessionBean rubroestructuraSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;	
	
	public RubroEstructuraLogic rubroestructuraLogic;
	
	public JScrollPane jScrollPanelDatosRubroEstructura;
	public JScrollPane jScrollPanelDatosEdicionRubroEstructura;
	public JScrollPane jScrollPanelDatosGeneralRubroEstructura;
	
	protected JPanel jPanelCamposRubroEstructura;    
	protected JPanel jPanelCamposOcultosRubroEstructura;    	
	protected JPanel jPanelAccionesRubroEstructura;
	protected JPanel jPanelAccionesFormularioRubroEstructura;
    
	
	
	protected Integer iXPanelCamposRubroEstructura=0;
	protected Integer iYPanelCamposRubroEstructura=0;
	
	protected Integer iXPanelCamposOcultosRubroEstructura=0;
	protected Integer iYPanelCamposOcultosRubroEstructura=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRubroEstructura;
	public JButton jButtonModificarRubroEstructura;
	public JButton jButtonActualizarRubroEstructura;
    public JButton jButtonEliminarRubroEstructura;
	public JButton jButtonCancelarRubroEstructura;
    public JButton jButtonGuardarCambiosRubroEstructura;
	public JButton jButtonGuardarCambiosTablaRubroEstructura;
	protected JButton jButtonCerrarRubroEstructura;
	
	
	protected JButton jButtonProcesarInformacionRubroEstructura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRubroEstructura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRubroEstructura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRubroEstructura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRubroEstructura;
	protected JButton jButtonModificarToolBarRubroEstructura;
	protected JButton jButtonActualizarToolBarRubroEstructura;
    protected JButton jButtonEliminarToolBarRubroEstructura;
	protected JButton jButtonCancelarToolBarRubroEstructura;
    protected JButton jButtonGuardarCambiosToolBarRubroEstructura;
	protected JButton jButtonGuardarCambiosTablaToolBarRubroEstructura;
	protected JButton jButtonMostrarOcultarTablaToolBarRubroEstructura;
	protected JButton jButtonCerrarToolBarRubroEstructura;
	
	protected JButton jButtonProcesarInformacionToolBarRubroEstructura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRubroEstructura;
	protected JMenuItem jMenuItemModificarRubroEstructura;
	protected JMenuItem jMenuItemActualizarRubroEstructura;
    protected JMenuItem jMenuItemEliminarRubroEstructura;
	protected JMenuItem jMenuItemCancelarRubroEstructura;
    protected JMenuItem jMenuItemGuardarCambiosRubroEstructura;
	protected JMenuItem jMenuItemGuardarCambiosTablaRubroEstructura;
	protected JMenuItem jMenuItemCerrarRubroEstructura;
	protected JMenuItem jMenuItemDetalleCerrarRubroEstructura;
	protected JMenuItem jMenuItemDetalleMostarOcultarRubroEstructura;
	
	protected JMenuItem jMenuItemProcesarInformacionRubroEstructura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRubroEstructura;
	protected JMenuItem jMenuItemMostrarOcultarRubroEstructura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRubroEstructura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRubroEstructura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRubroEstructura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRubroEstructura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRubroEstructura;
	public JLabel jLabelIdRubroEstructura;
	public JLabel jLabelidRubroEstructura;
	public JButton jButtonidRubroEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoRubroEstructura;
	public JLabel jLabelesta_activoRubroEstructura;
	public JCheckBox jCheckBoxesta_activoRubroEstructura;
	public JButton jButtonesta_activoRubroEstructuraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRubroEstructura;
	public JLabel jLabelid_empresaRubroEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRubroEstructura;
	public JButton jButtonid_empresaRubroEstructura= new JButtonMe();
	public JButton jButtonid_empresaRubroEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_empresaRubroEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRubroEstructura;
	public JLabel jLabelid_sucursalRubroEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRubroEstructura;
	public JButton jButtonid_sucursalRubroEstructura= new JButtonMe();
	public JButton jButtonid_sucursalRubroEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRubroEstructuraBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraRubroEstructura;
	public JLabel jLabelid_estructuraRubroEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraRubroEstructura;
	public JButton jButtonid_estructuraRubroEstructura= new JButtonMe();
	public JButton jButtonid_estructuraRubroEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_estructuraRubroEstructuraBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraRubroEstructuraArbol= new JButtonMe();

	public JPanel jPanelid_rubro_empleaRubroEstructura;
	public JLabel jLabelid_rubro_empleaRubroEstructura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaRubroEstructura;
	public JButton jButtonid_rubro_empleaRubroEstructura= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubroEstructuraUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaRubroEstructuraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRubroEstructura;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RubroEstructuraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRubroEstructura=new JPanel();
				this.jPanelAccionesFormularioRubroEstructura=new JPanel();
				this.jmenuBarDetalleRubroEstructura=new JMenuBar();
				this.jTtoolBarDetalleRubroEstructura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RubroEstructuraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RubroEstructuraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RubroEstructura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRubroEstructura() {
		return this.jButtonActualizarToolBarRubroEstructura;
	}
	
	public JButton getjButtonEliminarToolBarRubroEstructura() {
		return this.jButtonEliminarToolBarRubroEstructura;
	}
	
	public JButton getjButtonCancelarToolBarRubroEstructura() {
		return this.jButtonCancelarToolBarRubroEstructura;
	}		
	
	public JButton getjButtonProcesarInformacionRubroEstructura() {
		return this.jButtonProcesarInformacionRubroEstructura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRubroEstructura)	{
		this.jButtonProcesarInformacionRubroEstructura = jButtonProcesarInformacionRubroEstructura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRubroEstructura() {
		return this.jComboBoxTiposAccionesRubroEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRubroEstructura(
			JComboBox jComboBoxTiposRelacionesRubroEstructura) {
		this.jComboBoxTiposRelacionesRubroEstructura = jComboBoxTiposRelacionesRubroEstructura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRubroEstructura(
			JComboBox jComboBoxTiposAccionesRubroEstructura) {
		this.jComboBoxTiposAccionesRubroEstructura = jComboBoxTiposAccionesRubroEstructura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRubroEstructura() {
		return this.jComboBoxTiposAccionesFormularioRubroEstructura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRubroEstructura(
			JComboBox jComboBoxTiposAccionesFormularioRubroEstructura) {
		this.jComboBoxTiposAccionesFormularioRubroEstructura = jComboBoxTiposAccionesFormularioRubroEstructura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rubroestructuraSessionBean=new RubroEstructuraSessionBean();
		
		this.rubroestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rubroestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rubroestructuraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RubroEstructuraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RubroEstructuraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rubro Estructura MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
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
	
		RubroEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRubroEstructura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRubroEstructura=new JButtonMe();
				this.jButtonModificarToolBarRubroEstructura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRubroEstructura,this.jTtoolBarDetalleRubroEstructura,
							"actualizar","actualizar","Actualizar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRubroEstructura,this.jTtoolBarDetalleRubroEstructura,
							"eliminar","eliminar","Eliminar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRubroEstructura,this.jTtoolBarDetalleRubroEstructura,
							"cancelar","cancelar","Cancelar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRubroEstructura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRubroEstructura,this.jTtoolBarDetalleRubroEstructura,
							"guardarcambios","guardarcambios","Guardar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRubroEstructura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRubroEstructura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRubroEstructura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRubroEstructura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRubroEstructura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRubroEstructura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRubroEstructura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRubroEstructura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRubroEstructura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRubroEstructura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRubroEstructura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRubroEstructura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRubroEstructura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRubroEstructura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRubroEstructura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRubroEstructura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRubroEstructura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRubroEstructura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRubroEstructura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRubroEstructura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRubroEstructura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRubroEstructura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRubroEstructura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRubroEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRubroEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRubroEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRubroEstructura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRubroEstructura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRubroEstructura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRubroEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRubroEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRubroEstructura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRubroEstructura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRubroEstructura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRubroEstructura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRubroEstructura.add(this.jMenuItemDetalleCerrarRubroEstructura);
		
		this.jmenuDetalleAccionesRubroEstructura.add(this.jMenuItemActualizarRubroEstructura);
		this.jmenuDetalleAccionesRubroEstructura.add(this.jMenuItemEliminarRubroEstructura);
		this.jmenuDetalleAccionesRubroEstructura.add(this.jMenuItemCancelarRubroEstructura);		
		
		//this.jmenuDetalleDatosRubroEstructura.add(this.jMenuItemDetalleAbrirOrderByRubroEstructura);				
		this.jmenuDetalleDatosRubroEstructura.add(this.jMenuItemDetalleMostarOcultarRubroEstructura);				
				
		//this.jmenuDetalleAccionesRubroEstructura.add(this.jMenuItemGuardarCambiosRubroEstructura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRubroEstructura.add(this.jmenuDetalleArchivoRubroEstructura);		
		this.jmenuBarDetalleRubroEstructura.add(this.jmenuDetalleAccionesRubroEstructura);		
		this.jmenuBarDetalleRubroEstructura.add(this.jmenuDetalleDatosRubroEstructura);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRubroEstructura);				
	}
	
	
	public void inicializarElementosCamposRubroEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRubroEstructura = new JLabelMe();
		jLabelIdRubroEstructura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRubroEstructura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRubroEstructura.setToolTipText(RubroEstructuraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRubroEstructura= new GridBagLayout();

		this.jPanelidRubroEstructura.setLayout(this.gridaBagLayoutRubroEstructura);

		jLabelidRubroEstructura = new JLabel();
		jLabelidRubroEstructura.setText("Id");

		jLabelidRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelesta_activoRubroEstructura = new JLabelMe();
		this.jLabelesta_activoRubroEstructura.setText(""+RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoRubroEstructura.setToolTipText("Esta Activo");
		this.jLabelesta_activoRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoRubroEstructura.setToolTipText(RubroEstructuraConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutRubroEstructura = new GridBagLayout();
		this.jPanelesta_activoRubroEstructura.setLayout(this.gridaBagLayoutRubroEstructura);


		jCheckBoxesta_activoRubroEstructura= new JCheckBoxMe();
		jCheckBoxesta_activoRubroEstructura.setEnabled(false);

		jCheckBoxesta_activoRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoRubroEstructuraBusqueda= new JButtonMe();
		this.jButtonesta_activoRubroEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoRubroEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoRubroEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoRubroEstructuraBusqueda.setText("U");
		this.jButtonesta_activoRubroEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoRubroEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoRubroEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoRubroEstructuraBusqueda"));

		if(this.rubroestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoRubroEstructuraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRubroEstructura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRubroEstructura = new JLabelMe();
		this.jLabelid_empresaRubroEstructura.setText(""+RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRubroEstructura.setToolTipText("Empresa");
		this.jLabelid_empresaRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRubroEstructura.setToolTipText(RubroEstructuraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRubroEstructura = new GridBagLayout();
		this.jPanelid_empresaRubroEstructura.setLayout(this.gridaBagLayoutRubroEstructura);


		jComboBoxid_empresaRubroEstructura= new JComboBoxMe();
		jComboBoxid_empresaRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRubroEstructura.setEnabled(false);

		this.jButtonid_empresaRubroEstructura= new JButtonMe();
		this.jButtonid_empresaRubroEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRubroEstructura.setText("Buscar");
		this.jButtonid_empresaRubroEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRubroEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEstructura"));

		this.jButtonid_empresaRubroEstructuraBusqueda= new JButtonMe();
		this.jButtonid_empresaRubroEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEstructuraBusqueda.setText("U");
		this.jButtonid_empresaRubroEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRubroEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEstructuraBusqueda"));

		if(this.rubroestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRubroEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_empresaRubroEstructuraUpdate= new JButtonMe();
		this.jButtonid_empresaRubroEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRubroEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRubroEstructuraUpdate.setText("U");
		this.jButtonid_empresaRubroEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRubroEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRubroEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRubroEstructuraUpdate"));



					
		this.jLabelid_sucursalRubroEstructura = new JLabelMe();
		this.jLabelid_sucursalRubroEstructura.setText(""+RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRubroEstructura.setToolTipText("Sucursal");
		this.jLabelid_sucursalRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRubroEstructura.setToolTipText(RubroEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRubroEstructura = new GridBagLayout();
		this.jPanelid_sucursalRubroEstructura.setLayout(this.gridaBagLayoutRubroEstructura);


		jComboBoxid_sucursalRubroEstructura= new JComboBoxMe();
		jComboBoxid_sucursalRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRubroEstructura.setEnabled(false);

		this.jButtonid_sucursalRubroEstructura= new JButtonMe();
		this.jButtonid_sucursalRubroEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRubroEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRubroEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRubroEstructura.setText("Buscar");
		this.jButtonid_sucursalRubroEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRubroEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRubroEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRubroEstructura"));

		this.jButtonid_sucursalRubroEstructuraBusqueda= new JButtonMe();
		this.jButtonid_sucursalRubroEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRubroEstructuraBusqueda.setText("U");
		this.jButtonid_sucursalRubroEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRubroEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRubroEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRubroEstructuraBusqueda"));

		if(this.rubroestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRubroEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRubroEstructuraUpdate= new JButtonMe();
		this.jButtonid_sucursalRubroEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRubroEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRubroEstructuraUpdate.setText("U");
		this.jButtonid_sucursalRubroEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRubroEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRubroEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRubroEstructuraUpdate"));



					
		this.jLabelid_estructuraRubroEstructura = new JLabelMe();
		this.jLabelid_estructuraRubroEstructura.setText(""+RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraRubroEstructura.setToolTipText("Estructura");
		this.jLabelid_estructuraRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraRubroEstructura.setToolTipText(RubroEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutRubroEstructura = new GridBagLayout();
		this.jPanelid_estructuraRubroEstructura.setLayout(this.gridaBagLayoutRubroEstructura);


		jComboBoxid_estructuraRubroEstructura= new JComboBoxMe();
		jComboBoxid_estructuraRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraRubroEstructura= new JButtonMe();
		this.jButtonid_estructuraRubroEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraRubroEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraRubroEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraRubroEstructura.setText("Buscar");
		this.jButtonid_estructuraRubroEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraRubroEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEstructura"));

		this.jButtonid_estructuraRubroEstructuraBusqueda= new JButtonMe();
		this.jButtonid_estructuraRubroEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraRubroEstructuraBusqueda.setText("U");
		this.jButtonid_estructuraRubroEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraRubroEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEstructuraBusqueda"));

		if(this.rubroestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraRubroEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_estructuraRubroEstructuraUpdate= new JButtonMe();
		this.jButtonid_estructuraRubroEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraRubroEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraRubroEstructuraUpdate.setText("U");
		this.jButtonid_estructuraRubroEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraRubroEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEstructuraUpdate"));


		jButtonid_estructuraRubroEstructuraArbol= new JButtonMe();
		jButtonid_estructuraRubroEstructuraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraRubroEstructuraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraRubroEstructuraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraRubroEstructuraArbol.setText("Arbol");
		jButtonid_estructuraRubroEstructuraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraRubroEstructuraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraRubroEstructuraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraRubroEstructuraArbol"));



					
		this.jLabelid_rubro_empleaRubroEstructura = new JLabelMe();
		this.jLabelid_rubro_empleaRubroEstructura.setText(""+RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaRubroEstructura.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaRubroEstructura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaRubroEstructura.setToolTipText(RubroEstructuraConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutRubroEstructura = new GridBagLayout();
		this.jPanelid_rubro_empleaRubroEstructura.setLayout(this.gridaBagLayoutRubroEstructura);


		jComboBoxid_rubro_empleaRubroEstructura= new JComboBoxMe();
		jComboBoxid_rubro_empleaRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaRubroEstructura= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEstructura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEstructura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEstructura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaRubroEstructura.setText("Buscar");
		this.jButtonid_rubro_empleaRubroEstructura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaRubroEstructura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEstructura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEstructura"));

		this.jButtonid_rubro_empleaRubroEstructuraBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setText("U");
		this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEstructuraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEstructuraBusqueda"));

		if(this.rubroestructuraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaRubroEstructuraBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaRubroEstructuraUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaRubroEstructuraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEstructuraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaRubroEstructuraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaRubroEstructuraUpdate.setText("U");
		this.jButtonid_rubro_empleaRubroEstructuraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaRubroEstructuraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaRubroEstructuraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaRubroEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaRubroEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaRubroEstructuraUpdate"));



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
		//this.jInternalFrameDetalleRubroEstructura = new RubroEstructuraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rubro Estructura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRubroEstructura= new GridBagLayout();
		

		
		String sToolTipRubroEstructura="";
		sToolTipRubroEstructura=RubroEstructuraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRubroEstructura+="(Nomina.RubroEstructura)";
		}
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			sToolTipRubroEstructura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRubroEstructura = new JButtonMe();
		this.jButtonModificarRubroEstructura = new JButtonMe();
        this.jButtonActualizarRubroEstructura = new JButtonMe();
        this.jButtonEliminarRubroEstructura = new JButtonMe();
        this.jButtonCancelarRubroEstructura = new JButtonMe();
        this.jButtonGuardarCambiosRubroEstructura = new JButtonMe();
		this.jButtonGuardarCambiosTablaRubroEstructura = new JButtonMe();
		this.jButtonCerrarRubroEstructura = new JButtonMe();
		
		this.jScrollPanelDatosRubroEstructura = new JScrollPane();   
        this.jScrollPanelDatosEdicionRubroEstructura = new JScrollPane();
		this.jScrollPanelDatosGeneralRubroEstructura = new JScrollPane();
				
		
		
		this.jPanelCamposRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rubro Estructura";
		
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rubro Estructuras" + this.sPath));
		} else {
			this.jScrollPanelDatosRubroEstructura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRubroEstructura.setName("jPanelCamposRubroEstructura"); 

		this.jPanelCamposOcultosRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRubroEstructura.setName("jPanelCamposOcultosRubroEstructura"); 

        this.jPanelAccionesRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRubroEstructura.setToolTipText("Acciones");
        this.jPanelAccionesRubroEstructura.setName("Acciones"); 

		this.jPanelAccionesFormularioRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRubroEstructura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRubroEstructura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRubroEstructura.setText("Nuevo");
		this.jButtonModificarRubroEstructura.setText("Editar");
        this.jButtonActualizarRubroEstructura.setText("Actualizar");
        this.jButtonEliminarRubroEstructura.setText("Eliminar");
        this.jButtonCancelarRubroEstructura.setText("Cancelar");
        this.jButtonGuardarCambiosRubroEstructura.setText("Guardar");
		this.jButtonGuardarCambiosTablaRubroEstructura.setText("Guardar");
		this.jButtonCerrarRubroEstructura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRubroEstructura,"nuevo_button","Nuevo",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRubroEstructura,"modificar_button","Editar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRubroEstructura,"actualizar_button","Actualizar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRubroEstructura,"eliminar_button","Eliminar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRubroEstructura,"cancelar_button","Cancelar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRubroEstructura,"guardarcambios_button","Guardar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRubroEstructura,"guardarcambiostabla_button","Guardar",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRubroEstructura,"cerrar_button","Salir",this.rubroestructuraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRubroEstructura.setToolTipText("Nuevo"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRubroEstructura.setToolTipText("Editar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRubroEstructura.setToolTipText("Actualizar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRubroEstructura.setToolTipText("Eliminar)"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRubroEstructura.setToolTipText("Cancelar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRubroEstructura.setToolTipText("Guardar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRubroEstructura.setToolTipText("Guardar"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRubroEstructura.setToolTipText("Salir"+" "+RubroEstructuraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRubroEstructura";
		inputMap = this.jButtonNuevoRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRubroEstructura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRubroEstructura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRubroEstructura";
		inputMap = this.jButtonActualizarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRubroEstructura"));
		
		//ELIMINAR
		sMapKey = "EliminarRubroEstructura";
		inputMap = this.jButtonEliminarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRubroEstructura"));
		
		//CANCELAR	
		sMapKey = "CancelarRubroEstructura";
		inputMap = this.jButtonCancelarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRubroEstructura"));
		
		//CERRAR		
		sMapKey = "CerrarRubroEstructura";
		inputMap = this.jButtonCerrarRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRubroEstructura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRubroEstructura";
		inputMap = this.jButtonGuardarCambiosTablaRubroEstructura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRubroEstructura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRubroEstructura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRubroEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRubroEstructura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRubroEstructura.setToolTipText("Nuevo RubroEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRubroEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRubroEstructura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRubroEstructura.setToolTipText("Sin Cerrar Ventana RubroEstructura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRubroEstructura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRubroEstructura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRubroEstructura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRubroEstructura.setText("Accion");
		this.jComboBoxTiposAccionesRubroEstructura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRubroEstructura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRubroEstructura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRubroEstructura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRubroEstructura = new JLabelMe();
		
		this.jLabelAccionesRubroEstructura.setText("Acciones");		
		this.jLabelAccionesRubroEstructura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEstructura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRubroEstructura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRubroEstructura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRubroEstructura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRubroEstructura=new JTabbedPane();
		this.jTabbedPaneRelacionesRubroEstructura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRubroEstructura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRubroEstructura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEstructura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRubroEstructura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRubroEstructura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRubroEstructura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEstructura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRubroEstructura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRubroEstructura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRubroEstructura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRubroEstructura = new GridBagLayout();
		
		this.jPanelCamposRubroEstructura.setLayout(gridaBagLayoutCamposRubroEstructura);
		this.jPanelCamposOcultosRubroEstructura.setLayout(gridaBagLayoutCamposOcultosRubroEstructura);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 0;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRubroEstructura.add(jLabelIdRubroEstructura, this.gridBagConstraintsRubroEstructura);



	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 1;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRubroEstructura.add(jLabelidRubroEstructura, this.gridBagConstraintsRubroEstructura);


	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 0;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRubroEstructura.add(jLabelid_empresaRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 2;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEstructura.add(jButtonid_empresaRubroEstructuraBusqueda, this.gridBagConstraintsRubroEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 3;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRubroEstructura.add(jButtonid_empresaRubroEstructuraUpdate, this.gridBagConstraintsRubroEstructura);
	}

	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 1;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRubroEstructura.add(jComboBoxid_empresaRubroEstructura, this.gridBagConstraintsRubroEstructura);


	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 0;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRubroEstructura.add(jLabelid_sucursalRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 2;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRubroEstructura.add(jButtonid_sucursalRubroEstructuraBusqueda, this.gridBagConstraintsRubroEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 3;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRubroEstructura.add(jButtonid_sucursalRubroEstructuraUpdate, this.gridBagConstraintsRubroEstructura);
	}

	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 1;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRubroEstructura.add(jComboBoxid_sucursalRubroEstructura, this.gridBagConstraintsRubroEstructura);


	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 0;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraRubroEstructura.add(jLabelid_estructuraRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 2;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraRubroEstructura.add(jButtonid_estructuraRubroEstructuraBusqueda, this.gridBagConstraintsRubroEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 3;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraRubroEstructura.add(jButtonid_estructuraRubroEstructuraUpdate, this.gridBagConstraintsRubroEstructura);
	}

	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 1;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraRubroEstructura.add(jComboBoxid_estructuraRubroEstructura, this.gridBagConstraintsRubroEstructura);


	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 0;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaRubroEstructura.add(jLabelid_rubro_empleaRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 2;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubroEstructura.add(jButtonid_rubro_empleaRubroEstructuraBusqueda, this.gridBagConstraintsRubroEstructura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 3;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaRubroEstructura.add(jButtonid_rubro_empleaRubroEstructuraUpdate, this.gridBagConstraintsRubroEstructura);
	}

	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 1;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaRubroEstructura.add(jComboBoxid_rubro_empleaRubroEstructura, this.gridBagConstraintsRubroEstructura);


	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 0;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoRubroEstructura.add(jLabelesta_activoRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		//this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = 2;
		this.gridBagConstraintsRubroEstructura.ipadx = 0;
		this.gridBagConstraintsRubroEstructura.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoRubroEstructura.add(jButtonesta_activoRubroEstructuraBusqueda, this.gridBagConstraintsRubroEstructura);
	}

	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRubroEstructura.gridy = 0;
	this.gridBagConstraintsRubroEstructura.gridx = 1;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoRubroEstructura.add(jCheckBoxesta_activoRubroEstructura, this.gridBagConstraintsRubroEstructura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEstructura.gridy = iYPanelCamposRubroEstructura;
	this.gridBagConstraintsRubroEstructura.gridx = iXPanelCamposRubroEstructura++;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEstructura.add(this.jPanelidRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(iXPanelCamposRubroEstructura % 1==0) {
		iXPanelCamposRubroEstructura=0;
		iYPanelCamposRubroEstructura++;
	}
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEstructura.gridy = iYPanelCamposRubroEstructura;
	this.gridBagConstraintsRubroEstructura.gridx = iXPanelCamposRubroEstructura++;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEstructura.add(this.jPanelid_estructuraRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(iXPanelCamposRubroEstructura % 1==0) {
		iXPanelCamposRubroEstructura=0;
		iYPanelCamposRubroEstructura++;
	}
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEstructura.gridy = iYPanelCamposRubroEstructura;
	this.gridBagConstraintsRubroEstructura.gridx = iXPanelCamposRubroEstructura++;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEstructura.add(this.jPanelid_rubro_empleaRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(iXPanelCamposRubroEstructura % 1==0) {
		iXPanelCamposRubroEstructura=0;
		iYPanelCamposRubroEstructura++;
	}
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEstructura.gridy = iYPanelCamposRubroEstructura;
	this.gridBagConstraintsRubroEstructura.gridx = iXPanelCamposRubroEstructura++;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRubroEstructura.add(this.jPanelesta_activoRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(iXPanelCamposRubroEstructura % 1==0) {
		iXPanelCamposRubroEstructura=0;
		iYPanelCamposRubroEstructura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEstructura.gridy = iYPanelCamposOcultosRubroEstructura;
	this.gridBagConstraintsRubroEstructura.gridx = iXPanelCamposOcultosRubroEstructura++;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubroEstructura.add(this.jPanelid_empresaRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(iXPanelCamposOcultosRubroEstructura % 1==0) {
		iXPanelCamposOcultosRubroEstructura=0;
		iYPanelCamposOcultosRubroEstructura++;
	}
	this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRubroEstructura.gridy = iYPanelCamposOcultosRubroEstructura;
	this.gridBagConstraintsRubroEstructura.gridx = iXPanelCamposOcultosRubroEstructura++;
	this.gridBagConstraintsRubroEstructura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRubroEstructura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRubroEstructura.add(this.jPanelid_sucursalRubroEstructura, this.gridBagConstraintsRubroEstructura);



	if(iXPanelCamposOcultosRubroEstructura % 1==0) {
		iXPanelCamposOcultosRubroEstructura=0;
		iYPanelCamposOcultosRubroEstructura++;
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
			
		GridBagLayout gridaBagLayoutAccionesRubroEstructura= new GridBagLayout();
		this.jPanelAccionesRubroEstructura.setLayout(gridaBagLayoutAccionesRubroEstructura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRubroEstructura= new GridBagLayout();
		this.jPanelAccionesFormularioRubroEstructura.setLayout(gridaBagLayoutAccionesFormularioRubroEstructura);
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEstructura.add(this.jComboBoxTiposAccionesFormularioRubroEstructura, this.gridBagConstraintsRubroEstructura);

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRubroEstructura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRubroEstructura.add(this.jCheckBoxPostAccionNuevoRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEstructura.add(this.jCheckBoxPostAccionSinCerrarRubroEstructura, this.gridBagConstraintsRubroEstructura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rubroestructuraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rubroestructuraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRubroEstructura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRubroEstructura.add(this.jCheckBoxPostAccionSinMensajeRubroEstructura, this.gridBagConstraintsRubroEstructura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx = iPosXAccion++;
			
		this.jPanelAccionesRubroEstructura.add(this.jButtonModificarRubroEstructura, this.gridBagConstraintsRubroEstructura);							

		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRubroEstructura.gridy = 0;
		this.gridBagConstraintsRubroEstructura.gridx =iPosXAccion++;
			
		this.jPanelAccionesRubroEstructura.add(this.jButtonEliminarRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
			
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = 0;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEstructura.add(this.jButtonActualizarRubroEstructura, this.gridBagConstraintsRubroEstructura);


		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = 0;		
		this.gridBagConstraintsRubroEstructura.gridx = iPosXAccion++;
		
		this.jPanelAccionesRubroEstructura.add(this.jButtonGuardarCambiosRubroEstructura, this.gridBagConstraintsRubroEstructura);	
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = 0;		
		this.gridBagConstraintsRubroEstructura.gridx =iPosXAccion++;
		
		this.jPanelAccionesRubroEstructura.add(this.jButtonCancelarRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRubroEstructura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRubroEstructura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rubroestructuraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();						
			this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRubroEstructura.gridx = 0;		
			//this.gridBagConstraintsRubroEstructura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRubroEstructura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRubroEstructura.gridx =0;
		this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRubroEstructura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRubroEstructura, this.gridBagConstraintsRubroEstructura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RubroEstructuraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRubroEstructura = new RubroEstructuraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rubro Estructura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rubro Estructura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rubro Estructura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RubroEstructuraModel rubroestructuraModel=new RubroEstructuraModel(this);
			
			//SI USARA CLASE INTERNA
			//RubroEstructuraModel.RubroEstructuraFocusTraversalPolicy rubroestructuraFocusTraversalPolicy = rubroestructuraModel.new RubroEstructuraFocusTraversalPolicy(this);
			
			//rubroestructuraFocusTraversalPolicy.setrubroestructuraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rubroestructuraModel);
			
			
			this.jContentPaneDetalleRubroEstructura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRubroEstructura = new GridBagLayout();	
			this.jContentPaneDetalleRubroEstructura.setLayout(gridaBagLayoutDetalleRubroEstructura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRubroEstructura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
				this.gridBagConstraintsRubroEstructura.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRubroEstructura.gridx = 0;
					
				
				this.jContentPaneDetalleRubroEstructura.add(jTtoolBarDetalleRubroEstructura, gridBagConstraintsRubroEstructura);								
				
}
			
			this.jScrollPanelDatosEdicionRubroEstructura=   new JScrollPane(jContentPaneDetalleRubroEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRubroEstructura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRubroEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRubroEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRubroEstructura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRubroEstructura.gridx = 0;
	        
			this.jContentPaneDetalleRubroEstructura.add(jPanelCamposRubroEstructura, gridBagConstraintsRubroEstructura);
			
			
			
			
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
						&& rubroestructuraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.rubroestructuraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRubroEstructura= new GridBagConstraints();
						this.gridBagConstraintsRubroEstructura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRubroEstructura.gridx = 0;
						this.jContentPaneDetalleRubroEstructura.add(this.jTabbedPaneRelacionesRubroEstructura, this.gridBagConstraintsRubroEstructura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRubroEstructura.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRubroEstructura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
					this.gridBagConstraintsRubroEstructura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRubroEstructura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRubroEstructura.gridx = 0;
					
				
					this.jContentPaneDetalleRubroEstructura.add(jPanelCamposOcultosRubroEstructura, gridBagConstraintsRubroEstructura);
				
					this.jPanelCamposOcultosRubroEstructura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRubroEstructura.gridx = 0;
	        this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRubroEstructura.add(this.jPanelAccionesFormularioRubroEstructura, this.gridBagConstraintsRubroEstructura);							
			
			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
	        this.gridBagConstraintsRubroEstructura.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRubroEstructura.gridx = 0;
	        
			
			this.jContentPaneDetalleRubroEstructura.add(this.jPanelAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRubroEstructura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRubroEstructura=   new JScrollPane(this.jPanelCamposRubroEstructura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRubroEstructura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEstructura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRubroEstructura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRubroEstructura.gridx = 0;
			this.gridBagConstraintsRubroEstructura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRubroEstructura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRubroEstructura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRubroEstructura, this.gridBagConstraintsRubroEstructura);			
			
			this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
			this.gridBagConstraintsRubroEstructura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRubroEstructura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRubroEstructura, this.gridBagConstraintsRubroEstructura);
			
			
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRubroEstructura, this.gridBagConstraintsRubroEstructura);
		
			
		this.gridBagConstraintsRubroEstructura = new GridBagConstraints();
		this.gridBagConstraintsRubroEstructura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRubroEstructura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRubroEstructura, this.gridBagConstraintsRubroEstructura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRubroEstructura;//jContentPane;
		
		return jScrollPanelDatosEdicionRubroEstructura;
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
