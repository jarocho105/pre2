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



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.cartera.util.CobradorConstantesFunciones;

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
public class CobradorDetalleFormJInternalFrame extends CobradorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCobrador;
	
	protected JMenuBar jmenuBarDetalleCobrador;
	
	protected JMenu jmenuDetalleCobrador;
	protected JMenu jmenuDetalleArchivoCobrador;
	protected JMenu jmenuDetalleAccionesCobrador;
	protected JMenu jmenuDetalleDatosCobrador;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCobrador;	
	protected GridBagConstraints gridBagConstraintsCobrador;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CobradorBeanSwingJInternalFrameAdditional jInternalFrameDetalleCobrador;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoidentificacion="";
	
	public CobradorSessionBean cobradorSessionBean;
	
	
	
	
	public TipoIdentificacionSessionBean tipoidentificacionSessionBean;	
	
	public CobradorLogic cobradorLogic;
	
	public JScrollPane jScrollPanelDatosCobrador;
	public JScrollPane jScrollPanelDatosEdicionCobrador;
	public JScrollPane jScrollPanelDatosGeneralCobrador;
	
	protected JPanel jPanelCamposCobrador;    
	protected JPanel jPanelCamposOcultosCobrador;    	
	protected JPanel jPanelAccionesCobrador;
	protected JPanel jPanelAccionesFormularioCobrador;
    
	
	
	protected Integer iXPanelCamposCobrador=0;
	protected Integer iYPanelCamposCobrador=0;
	
	protected Integer iXPanelCamposOcultosCobrador=0;
	protected Integer iYPanelCamposOcultosCobrador=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCobrador;
	public JButton jButtonModificarCobrador;
	public JButton jButtonActualizarCobrador;
    public JButton jButtonEliminarCobrador;
	public JButton jButtonCancelarCobrador;
    public JButton jButtonGuardarCambiosCobrador;
	public JButton jButtonGuardarCambiosTablaCobrador;
	protected JButton jButtonCerrarCobrador;
	
	
	protected JButton jButtonProcesarInformacionCobrador;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCobrador;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCobrador;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCobrador;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCobrador;
	protected JButton jButtonModificarToolBarCobrador;
	protected JButton jButtonActualizarToolBarCobrador;
    protected JButton jButtonEliminarToolBarCobrador;
	protected JButton jButtonCancelarToolBarCobrador;
    protected JButton jButtonGuardarCambiosToolBarCobrador;
	protected JButton jButtonGuardarCambiosTablaToolBarCobrador;
	protected JButton jButtonMostrarOcultarTablaToolBarCobrador;
	protected JButton jButtonCerrarToolBarCobrador;
	
	protected JButton jButtonProcesarInformacionToolBarCobrador;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCobrador;
	protected JMenuItem jMenuItemModificarCobrador;
	protected JMenuItem jMenuItemActualizarCobrador;
    protected JMenuItem jMenuItemEliminarCobrador;
	protected JMenuItem jMenuItemCancelarCobrador;
    protected JMenuItem jMenuItemGuardarCambiosCobrador;
	protected JMenuItem jMenuItemGuardarCambiosTablaCobrador;
	protected JMenuItem jMenuItemCerrarCobrador;
	protected JMenuItem jMenuItemDetalleCerrarCobrador;
	protected JMenuItem jMenuItemDetalleMostarOcultarCobrador;
	
	protected JMenuItem jMenuItemProcesarInformacionCobrador;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCobrador;
	protected JMenuItem jMenuItemMostrarOcultarCobrador;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCobrador;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCobrador;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCobrador;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCobrador;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCobrador;
	public JLabel jLabelIdCobrador;
	public JLabel jLabelidCobrador;
	public JButton jButtonidCobradorBusqueda= new JButtonMe();

	public JPanel jPanelidentificacionCobrador;
	public JLabel jLabelidentificacionCobrador;
	public JTextField jTextFieldidentificacionCobrador;
	public JButton jButtonidentificacionCobradorBusqueda= new JButtonMe();

	public JPanel jPanelapellidoCobrador;
	public JLabel jLabelapellidoCobrador;
	public JTextField jTextFieldapellidoCobrador;
	public JButton jButtonapellidoCobradorBusqueda= new JButtonMe();

	public JPanel jPanelnombreCobrador;
	public JLabel jLabelnombreCobrador;
	public JTextField jTextFieldnombreCobrador;
	public JButton jButtonnombreCobradorBusqueda= new JButtonMe();

	public JPanel jPaneldireccionCobrador;
	public JLabel jLabeldireccionCobrador;
	public JTextArea jTextAreadireccionCobrador;
	public JScrollPane jscrollPanedireccionCobrador;
	public JButton jButtondireccionCobradorBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoCobrador;
	public JLabel jLabeltelefonoCobrador;
	public JTextField jTextFieldtelefonoCobrador;
	public JButton jButtontelefonoCobradorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_identificacionCobrador;
	public JLabel jLabelid_tipo_identificacionCobrador;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_identificacionCobrador;
	public JButton jButtonid_tipo_identificacionCobrador= new JButtonMe();
	public JButton jButtonid_tipo_identificacionCobradorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_identificacionCobradorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCobrador;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CobradorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCobrador=new JPanel();
				this.jPanelAccionesFormularioCobrador=new JPanel();
				this.jmenuBarDetalleCobrador=new JMenuBar();
				this.jTtoolBarDetalleCobrador=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CobradorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CobradorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Cobrador No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCobrador() {
		return this.jButtonActualizarToolBarCobrador;
	}
	
	public JButton getjButtonEliminarToolBarCobrador() {
		return this.jButtonEliminarToolBarCobrador;
	}
	
	public JButton getjButtonCancelarToolBarCobrador() {
		return this.jButtonCancelarToolBarCobrador;
	}		
	
	public JButton getjButtonProcesarInformacionCobrador() {
		return this.jButtonProcesarInformacionCobrador;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCobrador)	{
		this.jButtonProcesarInformacionCobrador = jButtonProcesarInformacionCobrador;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCobrador() {
		return this.jComboBoxTiposAccionesCobrador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCobrador(
			JComboBox jComboBoxTiposRelacionesCobrador) {
		this.jComboBoxTiposRelacionesCobrador = jComboBoxTiposRelacionesCobrador;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCobrador(
			JComboBox jComboBoxTiposAccionesCobrador) {
		this.jComboBoxTiposAccionesCobrador = jComboBoxTiposAccionesCobrador;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCobrador() {
		return this.jComboBoxTiposAccionesFormularioCobrador;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCobrador(
			JComboBox jComboBoxTiposAccionesFormularioCobrador) {
		this.jComboBoxTiposAccionesFormularioCobrador = jComboBoxTiposAccionesFormularioCobrador;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cobradorSessionBean=new CobradorSessionBean();
		
		this.cobradorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobradorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cobradorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CobradorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CobradorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CobradorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cobrador MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
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
	
		CobradorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCobrador= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCobrador=new JButtonMe();
				this.jButtonModificarToolBarCobrador=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCobrador,this.jTtoolBarDetalleCobrador,
							"actualizar","actualizar","Actualizar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCobrador,this.jTtoolBarDetalleCobrador,
							"eliminar","eliminar","Eliminar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCobrador,this.jTtoolBarDetalleCobrador,
							"cancelar","cancelar","Cancelar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCobrador=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCobrador,this.jTtoolBarDetalleCobrador,
							"guardarcambios","guardarcambios","Guardar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCobrador,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCobrador,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCobrador,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCobrador=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCobrador=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCobrador=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCobrador=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCobrador=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCobrador= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCobrador.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCobrador,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCobrador= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCobrador.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCobrador,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCobrador= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCobrador.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCobrador,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCobrador= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCobrador.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCobrador,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCobrador= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCobrador.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCobrador,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCobrador= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCobrador.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCobrador,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCobrador= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCobrador.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCobrador,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCobrador= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCobrador.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCobrador,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCobrador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCobrador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCobrador,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCobrador= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCobrador.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCobrador,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCobrador.add(this.jMenuItemDetalleCerrarCobrador);
		
		this.jmenuDetalleAccionesCobrador.add(this.jMenuItemActualizarCobrador);
		this.jmenuDetalleAccionesCobrador.add(this.jMenuItemEliminarCobrador);
		this.jmenuDetalleAccionesCobrador.add(this.jMenuItemCancelarCobrador);		
		
		//this.jmenuDetalleDatosCobrador.add(this.jMenuItemDetalleAbrirOrderByCobrador);				
		this.jmenuDetalleDatosCobrador.add(this.jMenuItemDetalleMostarOcultarCobrador);				
				
		//this.jmenuDetalleAccionesCobrador.add(this.jMenuItemGuardarCambiosCobrador);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCobrador.add(this.jmenuDetalleArchivoCobrador);		
		this.jmenuBarDetalleCobrador.add(this.jmenuDetalleAccionesCobrador);		
		this.jmenuBarDetalleCobrador.add(this.jmenuDetalleDatosCobrador);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCobrador);				
	}
	
	
	public void inicializarElementosCamposCobrador() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCobrador = new JLabelMe();
		jLabelIdCobrador.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCobrador = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCobrador= new GridBagLayout();

		this.jPanelidCobrador.setLayout(this.gridaBagLayoutCobrador);

		jLabelidCobrador = new JLabel();
		jLabelidCobrador.setText("Id");

		jLabelidCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelidentificacionCobrador = new JLabelMe();
		this.jLabelidentificacionCobrador.setText(""+CobradorConstantesFunciones.LABEL_IDENTIFICACION+" : *");
		this.jLabelidentificacionCobrador.setToolTipText("Identificacion");
		this.jLabelidentificacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelidentificacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelidentificacionCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelidentificacionCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidentificacionCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_IDENTIFICACION);
		this.gridaBagLayoutCobrador = new GridBagLayout();
		this.jPanelidentificacionCobrador.setLayout(this.gridaBagLayoutCobrador);


		jTextFieldidentificacionCobrador= new JTextFieldMe();

		jTextFieldidentificacionCobrador.setEnabled(false);
		jTextFieldidentificacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldidentificacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldidentificacionCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonidentificacionCobradorBusqueda= new JButtonMe();
		this.jButtonidentificacionCobradorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionCobradorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonidentificacionCobradorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonidentificacionCobradorBusqueda.setText("U");
		this.jButtonidentificacionCobradorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonidentificacionCobradorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonidentificacionCobradorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldidentificacionCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldidentificacionCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"identificacionCobradorBusqueda"));

		if(this.cobradorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonidentificacionCobradorBusqueda.setVisible(false);		}


					
		this.jLabelapellidoCobrador = new JLabelMe();
		this.jLabelapellidoCobrador.setText(""+CobradorConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoCobrador.setToolTipText("Apellido");
		this.jLabelapellidoCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutCobrador = new GridBagLayout();
		this.jPanelapellidoCobrador.setLayout(this.gridaBagLayoutCobrador);


		jTextFieldapellidoCobrador= new JTextFieldMe();

		jTextFieldapellidoCobrador.setEnabled(false);
		jTextFieldapellidoCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldapellidoCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldapellidoCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldapellidoCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonapellidoCobradorBusqueda= new JButtonMe();
		this.jButtonapellidoCobradorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobradorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoCobradorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoCobradorBusqueda.setText("U");
		this.jButtonapellidoCobradorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoCobradorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoCobradorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldapellidoCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldapellidoCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoCobradorBusqueda"));

		if(this.cobradorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoCobradorBusqueda.setVisible(false);		}


					
		this.jLabelnombreCobrador = new JLabelMe();
		this.jLabelnombreCobrador.setText(""+CobradorConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreCobrador.setToolTipText("Nombre");
		this.jLabelnombreCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutCobrador = new GridBagLayout();
		this.jPanelnombreCobrador.setLayout(this.gridaBagLayoutCobrador);


		jTextFieldnombreCobrador= new JTextFieldMe();

		jTextFieldnombreCobrador.setEnabled(false);
		jTextFieldnombreCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreCobradorBusqueda= new JButtonMe();
		this.jButtonnombreCobradorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobradorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreCobradorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreCobradorBusqueda.setText("U");
		this.jButtonnombreCobradorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreCobradorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreCobradorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreCobradorBusqueda"));

		if(this.cobradorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreCobradorBusqueda.setVisible(false);		}


					
		this.jLabeldireccionCobrador = new JLabelMe();
		this.jLabeldireccionCobrador.setText(""+CobradorConstantesFunciones.LABEL_DIRECCION+" : *");
		this.jLabeldireccionCobrador.setToolTipText("Direccion");
		this.jLabeldireccionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutCobrador = new GridBagLayout();
		this.jPaneldireccionCobrador.setLayout(this.gridaBagLayoutCobrador);


		jTextAreadireccionCobrador= new JTextAreaMe();
		jTextAreadireccionCobrador.setEnabled(false);
		jTextAreadireccionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionCobrador.setLineWrap(true);
		jTextAreadireccionCobrador.setWrapStyleWord(true);
		jTextAreadireccionCobrador.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionCobrador.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionCobrador = new JScrollPane(jTextAreadireccionCobrador);
		jscrollPanedireccionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedireccionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondireccionCobradorBusqueda= new JButtonMe();
		this.jButtondireccionCobradorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionCobradorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionCobradorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionCobradorBusqueda.setText("U");
		this.jButtondireccionCobradorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionCobradorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionCobradorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionCobradorBusqueda"));

		if(this.cobradorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionCobradorBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoCobrador = new JLabelMe();
		this.jLabeltelefonoCobrador.setText(""+CobradorConstantesFunciones.LABEL_TELEFONO+" : *");
		this.jLabeltelefonoCobrador.setToolTipText("Telefono");
		this.jLabeltelefonoCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutCobrador = new GridBagLayout();
		this.jPaneltelefonoCobrador.setLayout(this.gridaBagLayoutCobrador);


		jTextFieldtelefonoCobrador= new JTextFieldMe();

		jTextFieldtelefonoCobrador.setEnabled(false);
		jTextFieldtelefonoCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoCobradorBusqueda= new JButtonMe();
		this.jButtontelefonoCobradorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoCobradorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoCobradorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoCobradorBusqueda.setText("U");
		this.jButtontelefonoCobradorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoCobradorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoCobradorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoCobradorBusqueda"));

		if(this.cobradorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoCobradorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCobrador() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_identificacionCobrador = new JLabelMe();
		this.jLabelid_tipo_identificacionCobrador.setText(""+CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION+" : *");
		this.jLabelid_tipo_identificacionCobrador.setToolTipText("Tipo Identificacion");
		this.jLabelid_tipo_identificacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_identificacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_identificacionCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_identificacionCobrador=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_identificacionCobrador.setToolTipText(CobradorConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		this.gridaBagLayoutCobrador = new GridBagLayout();
		this.jPanelid_tipo_identificacionCobrador.setLayout(this.gridaBagLayoutCobrador);


		jComboBoxid_tipo_identificacionCobrador= new JComboBoxMe();
		jComboBoxid_tipo_identificacionCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_identificacionCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_identificacionCobrador,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_identificacionCobrador= new JButtonMe();
		this.jButtonid_tipo_identificacionCobrador.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionCobrador.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionCobrador.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_identificacionCobrador.setText("Buscar");
		this.jButtonid_tipo_identificacionCobrador.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_identificacionCobrador.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionCobrador,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_identificacionCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionCobrador"));

		this.jButtonid_tipo_identificacionCobradorBusqueda= new JButtonMe();
		this.jButtonid_tipo_identificacionCobradorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionCobradorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionCobradorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionCobradorBusqueda.setText("U");
		this.jButtonid_tipo_identificacionCobradorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_identificacionCobradorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionCobradorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_identificacionCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionCobradorBusqueda"));

		if(this.cobradorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_identificacionCobradorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_identificacionCobradorUpdate= new JButtonMe();
		this.jButtonid_tipo_identificacionCobradorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionCobradorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_identificacionCobradorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_identificacionCobradorUpdate.setText("U");
		this.jButtonid_tipo_identificacionCobradorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_identificacionCobradorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_identificacionCobradorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_identificacionCobrador.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_identificacionCobrador.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_identificacionCobradorUpdate"));



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
		//this.jInternalFrameDetalleCobrador = new CobradorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cobrador DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCobrador= new GridBagLayout();
		

		
		String sToolTipCobrador="";
		sToolTipCobrador=CobradorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCobrador+="(Cartera.Cobrador)";
		}
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			sToolTipCobrador+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCobrador = new JButtonMe();
		this.jButtonModificarCobrador = new JButtonMe();
        this.jButtonActualizarCobrador = new JButtonMe();
        this.jButtonEliminarCobrador = new JButtonMe();
        this.jButtonCancelarCobrador = new JButtonMe();
        this.jButtonGuardarCambiosCobrador = new JButtonMe();
		this.jButtonGuardarCambiosTablaCobrador = new JButtonMe();
		this.jButtonCerrarCobrador = new JButtonMe();
		
		this.jScrollPanelDatosCobrador = new JScrollPane();   
        this.jScrollPanelDatosEdicionCobrador = new JScrollPane();
		this.jScrollPanelDatosGeneralCobrador = new JScrollPane();
				
		
		
		this.jPanelCamposCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cobrador";
		
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cobradores" + this.sPath));
		} else {
			this.jScrollPanelDatosCobrador.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCobrador.setName("jPanelCamposCobrador"); 

		this.jPanelCamposOcultosCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCobrador.setName("jPanelCamposOcultosCobrador"); 

        this.jPanelAccionesCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCobrador.setToolTipText("Acciones");
        this.jPanelAccionesCobrador.setName("Acciones"); 

		this.jPanelAccionesFormularioCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCobrador.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCobrador.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCobrador, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCobrador.setText("Nuevo");
		this.jButtonModificarCobrador.setText("Editar");
        this.jButtonActualizarCobrador.setText("Actualizar");
        this.jButtonEliminarCobrador.setText("Eliminar");
        this.jButtonCancelarCobrador.setText("Cancelar");
        this.jButtonGuardarCambiosCobrador.setText("Guardar");
		this.jButtonGuardarCambiosTablaCobrador.setText("Guardar");
		this.jButtonCerrarCobrador.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCobrador,"nuevo_button","Nuevo",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCobrador,"modificar_button","Editar",this.cobradorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCobrador,"actualizar_button","Actualizar",this.cobradorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCobrador,"eliminar_button","Eliminar",this.cobradorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCobrador,"cancelar_button","Cancelar",this.cobradorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCobrador,"guardarcambios_button","Guardar",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCobrador,"guardarcambiostabla_button","Guardar",this.cobradorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCobrador,"cerrar_button","Salir",this.cobradorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCobrador, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCobrador.setToolTipText("Nuevo"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCobrador.setToolTipText("Editar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCobrador.setToolTipText("Actualizar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCobrador.setToolTipText("Eliminar)"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCobrador.setToolTipText("Cancelar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCobrador.setToolTipText("Guardar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCobrador.setToolTipText("Guardar"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCobrador.setToolTipText("Salir"+" "+CobradorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCobrador";
		inputMap = this.jButtonNuevoCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCobrador.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCobrador"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCobrador";
		inputMap = this.jButtonActualizarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCobrador"));
		
		//ELIMINAR
		sMapKey = "EliminarCobrador";
		inputMap = this.jButtonEliminarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCobrador"));
		
		//CANCELAR	
		sMapKey = "CancelarCobrador";
		inputMap = this.jButtonCancelarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCobrador"));
		
		//CERRAR		
		sMapKey = "CerrarCobrador";
		inputMap = this.jButtonCerrarCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCobrador"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCobrador";
		inputMap = this.jButtonGuardarCambiosTablaCobrador.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCobrador.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCobrador"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCobrador = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCobrador.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCobrador.setToolTipText("Nuevo Cobrador");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCobrador = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCobrador.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCobrador.setToolTipText("Sin Cerrar Ventana Cobrador");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCobrador, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCobrador = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCobrador.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCobrador.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCobrador, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCobrador = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCobrador.setText("Accion");
		this.jComboBoxTiposAccionesCobrador.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCobrador = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCobrador.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCobrador.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCobrador = new JLabelMe();
		
		this.jLabelAccionesCobrador.setText("Acciones");		
		this.jLabelAccionesCobrador.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrador.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCobrador.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCobrador();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCobrador();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCobrador=new JTabbedPane();
		this.jTabbedPaneRelacionesCobrador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCobrador,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCobrador.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrador.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCobrador.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCobrador, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCobrador.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrador.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCobrador.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCobrador, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCobrador = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCobrador = new GridBagLayout();
		
		this.jPanelCamposCobrador.setLayout(gridaBagLayoutCamposCobrador);
		this.jPanelCamposOcultosCobrador.setLayout(gridaBagLayoutCamposOcultosCobrador);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCobrador.add(jLabelIdCobrador, this.gridBagConstraintsCobrador);



	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCobrador.add(jLabelidCobrador, this.gridBagConstraintsCobrador);


	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_identificacionCobrador.add(jLabelid_tipo_identificacionCobrador, this.gridBagConstraintsCobrador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 2;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionCobrador.add(jButtonid_tipo_identificacionCobradorBusqueda, this.gridBagConstraintsCobrador);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 3;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_identificacionCobrador.add(jButtonid_tipo_identificacionCobradorUpdate, this.gridBagConstraintsCobrador);
	}

	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_identificacionCobrador.add(jComboBoxid_tipo_identificacionCobrador, this.gridBagConstraintsCobrador);


	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidentificacionCobrador.add(jLabelidentificacionCobrador, this.gridBagConstraintsCobrador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 2;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPanelidentificacionCobrador.add(jButtonidentificacionCobradorBusqueda, this.gridBagConstraintsCobrador);
	}

	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidentificacionCobrador.add(jTextFieldidentificacionCobrador, this.gridBagConstraintsCobrador);


	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoCobrador.add(jLabelapellidoCobrador, this.gridBagConstraintsCobrador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 2;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoCobrador.add(jButtonapellidoCobradorBusqueda, this.gridBagConstraintsCobrador);
	}

	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoCobrador.add(jTextFieldapellidoCobrador, this.gridBagConstraintsCobrador);


	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreCobrador.add(jLabelnombreCobrador, this.gridBagConstraintsCobrador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 2;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreCobrador.add(jButtonnombreCobradorBusqueda, this.gridBagConstraintsCobrador);
	}

	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreCobrador.add(jTextFieldnombreCobrador, this.gridBagConstraintsCobrador);


	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionCobrador.add(jLabeldireccionCobrador, this.gridBagConstraintsCobrador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 2;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionCobrador.add(jButtondireccionCobradorBusqueda, this.gridBagConstraintsCobrador);
	}

	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionCobrador.add(jscrollPanedireccionCobrador, this.gridBagConstraintsCobrador);


	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 0;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoCobrador.add(jLabeltelefonoCobrador, this.gridBagConstraintsCobrador);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		//this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = 2;
		this.gridBagConstraintsCobrador.ipadx = 0;
		this.gridBagConstraintsCobrador.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoCobrador.add(jButtontelefonoCobradorBusqueda, this.gridBagConstraintsCobrador);
	}

	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCobrador.gridy = 0;
	this.gridBagConstraintsCobrador.gridx = 1;
	this.gridBagConstraintsCobrador.ipadx = 0;
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoCobrador.add(jTextFieldtelefonoCobrador, this.gridBagConstraintsCobrador);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPanelidCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
	}
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPanelid_tipo_identificacionCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
	}
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPanelidentificacionCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
	}
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPanelapellidoCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
	}
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPanelnombreCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
	}
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPaneldireccionCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
	}
	this.gridBagConstraintsCobrador = new GridBagConstraints();
	this.gridBagConstraintsCobrador.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCobrador.gridy = iYPanelCamposCobrador;
	this.gridBagConstraintsCobrador.gridx = iXPanelCamposCobrador++;
	this.gridBagConstraintsCobrador.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCobrador.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCobrador.add(this.jPaneltelefonoCobrador, this.gridBagConstraintsCobrador);



	if(iXPanelCamposCobrador % 1==0) {
		iXPanelCamposCobrador=0;
		iYPanelCamposCobrador++;
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
			
		GridBagLayout gridaBagLayoutAccionesCobrador= new GridBagLayout();
		this.jPanelAccionesCobrador.setLayout(gridaBagLayoutAccionesCobrador);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCobrador= new GridBagLayout();
		this.jPanelAccionesFormularioCobrador.setLayout(gridaBagLayoutAccionesFormularioCobrador);
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrador.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrador.add(this.jComboBoxTiposAccionesFormularioCobrador, this.gridBagConstraintsCobrador);

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCobrador.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCobrador.add(this.jCheckBoxPostAccionNuevoCobrador, this.gridBagConstraintsCobrador);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCobrador.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCobrador.add(this.jCheckBoxPostAccionSinCerrarCobrador, this.gridBagConstraintsCobrador);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cobradorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cobradorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCobrador.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCobrador.add(this.jCheckBoxPostAccionSinMensajeCobrador, this.gridBagConstraintsCobrador);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx = iPosXAccion++;
			
		this.jPanelAccionesCobrador.add(this.jButtonModificarCobrador, this.gridBagConstraintsCobrador);							

		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCobrador.gridy = 0;
		this.gridBagConstraintsCobrador.gridx =iPosXAccion++;
			
		this.jPanelAccionesCobrador.add(this.jButtonEliminarCobrador, this.gridBagConstraintsCobrador);
		
			
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = 0;		
		this.gridBagConstraintsCobrador.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrador.add(this.jButtonActualizarCobrador, this.gridBagConstraintsCobrador);


		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = 0;		
		this.gridBagConstraintsCobrador.gridx = iPosXAccion++;
		
		this.jPanelAccionesCobrador.add(this.jButtonGuardarCambiosCobrador, this.gridBagConstraintsCobrador);	
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = 0;		
		this.gridBagConstraintsCobrador.gridx =iPosXAccion++;
		
		this.jPanelAccionesCobrador.add(this.jButtonCancelarCobrador, this.gridBagConstraintsCobrador);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCobrador = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCobrador);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cobradorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCobrador = new GridBagConstraints();						
			this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCobrador.gridx = 0;		
			//this.gridBagConstraintsCobrador.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCobrador.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCobrador.gridx =0;
		this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCobrador.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCobrador, this.gridBagConstraintsCobrador);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CobradorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCobrador = new CobradorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cobrador DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cobrador DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrador Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CobradorModel cobradorModel=new CobradorModel(this);
			
			//SI USARA CLASE INTERNA
			//CobradorModel.CobradorFocusTraversalPolicy cobradorFocusTraversalPolicy = cobradorModel.new CobradorFocusTraversalPolicy(this);
			
			//cobradorFocusTraversalPolicy.setcobradorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cobradorModel);
			
			
			this.jContentPaneDetalleCobrador = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCobrador = new GridBagLayout();	
			this.jContentPaneDetalleCobrador.setLayout(gridaBagLayoutDetalleCobrador);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCobrador = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCobrador = new GridBagConstraints();
				this.gridBagConstraintsCobrador.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCobrador.gridx = 0;
					
				
				this.jContentPaneDetalleCobrador.add(jTtoolBarDetalleCobrador, gridBagConstraintsCobrador);								
				
}
			
			this.jScrollPanelDatosEdicionCobrador=   new JScrollPane(jContentPaneDetalleCobrador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCobrador=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCobrador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCobrador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCobrador.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCobrador.gridx = 0;
	        
			this.jContentPaneDetalleCobrador.add(jPanelCamposCobrador, gridBagConstraintsCobrador);
			
			
			
			
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
						&& cobradorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cobradorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCobrador= new GridBagConstraints();
						this.gridBagConstraintsCobrador.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCobrador.gridx = 0;
						this.jContentPaneDetalleCobrador.add(this.jTabbedPaneRelacionesCobrador, this.gridBagConstraintsCobrador);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCobrador.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCobrador.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCobrador = new GridBagConstraints();
					this.gridBagConstraintsCobrador.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCobrador.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCobrador.gridx = 0;
					
				
					this.jContentPaneDetalleCobrador.add(jPanelCamposOcultosCobrador, gridBagConstraintsCobrador);
				
					this.jPanelCamposOcultosCobrador.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCobrador.gridx = 0;
	        this.gridBagConstraintsCobrador.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCobrador.add(this.jPanelAccionesFormularioCobrador, this.gridBagConstraintsCobrador);							
			
			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
	        this.gridBagConstraintsCobrador.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCobrador.gridx = 0;
	        
			
			this.jContentPaneDetalleCobrador.add(this.jPanelAccionesCobrador, this.gridBagConstraintsCobrador);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCobrador);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCobrador=   new JScrollPane(this.jPanelCamposCobrador,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCobrador.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrador.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCobrador.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCobrador.gridx = 0;
			this.gridBagConstraintsCobrador.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCobrador.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCobrador.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCobrador, this.gridBagConstraintsCobrador);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrador.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCobrador, this.gridBagConstraintsCobrador);			
			
			this.gridBagConstraintsCobrador = new GridBagConstraints();
			this.gridBagConstraintsCobrador.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCobrador.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCobrador, this.gridBagConstraintsCobrador);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCobrador, this.gridBagConstraintsCobrador);
			
			
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCobrador, this.gridBagConstraintsCobrador);
		
			
		this.gridBagConstraintsCobrador = new GridBagConstraints();
		this.gridBagConstraintsCobrador.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCobrador.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCobrador, this.gridBagConstraintsCobrador);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCobrador;//jContentPane;
		
		return jScrollPanelDatosEdicionCobrador;
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
