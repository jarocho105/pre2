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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.PuertoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class PuertoDetalleFormJInternalFrame extends PuertoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePuerto;
	
	protected JMenuBar jmenuBarDetallePuerto;
	
	protected JMenu jmenuDetallePuerto;
	protected JMenu jmenuDetalleArchivoPuerto;
	protected JMenu jmenuDetalleAccionesPuerto;
	protected JMenu jmenuDetalleDatosPuerto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPuerto;	
	protected GridBagConstraints gridBagConstraintsPuerto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PuertoBeanSwingJInternalFrameAdditional jInternalFrameDetallePuerto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoPuertoBeanSwingJInternalFrame tipopuertoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipopuerto="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public PuertoSessionBean puertoSessionBean;
	
	

	public PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame=null;
	public PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoCompraImpor=false;
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;

	public LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrame=null;
	public LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLiquidacionImpor=false;
	public LiquidacionImporSessionBean liquidacionimporSessionBean;

	public EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame=null;
	public EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmbarcador=false;
	public EmbarcadorSessionBean embarcadorSessionBean;
	
	
	public TipoPuertoSessionBean tipopuertoSessionBean;
	public PaisSessionBean paisSessionBean;	
	
	public PuertoLogic puertoLogic;
	
	public JScrollPane jScrollPanelDatosPuerto;
	public JScrollPane jScrollPanelDatosEdicionPuerto;
	public JScrollPane jScrollPanelDatosGeneralPuerto;
	
	protected JPanel jPanelCamposPuerto;    
	protected JPanel jPanelCamposOcultosPuerto;    	
	protected JPanel jPanelAccionesPuerto;
	protected JPanel jPanelAccionesFormularioPuerto;
    
	
	
	protected Integer iXPanelCamposPuerto=0;
	protected Integer iYPanelCamposPuerto=0;
	
	protected Integer iXPanelCamposOcultosPuerto=0;
	protected Integer iYPanelCamposOcultosPuerto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPuerto;
	public JButton jButtonModificarPuerto;
	public JButton jButtonActualizarPuerto;
    public JButton jButtonEliminarPuerto;
	public JButton jButtonCancelarPuerto;
    public JButton jButtonGuardarCambiosPuerto;
	public JButton jButtonGuardarCambiosTablaPuerto;
	protected JButton jButtonCerrarPuerto;
	
	
	protected JButton jButtonProcesarInformacionPuerto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPuerto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPuerto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePuerto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPuerto;
	protected JButton jButtonModificarToolBarPuerto;
	protected JButton jButtonActualizarToolBarPuerto;
    protected JButton jButtonEliminarToolBarPuerto;
	protected JButton jButtonCancelarToolBarPuerto;
    protected JButton jButtonGuardarCambiosToolBarPuerto;
	protected JButton jButtonGuardarCambiosTablaToolBarPuerto;
	protected JButton jButtonMostrarOcultarTablaToolBarPuerto;
	protected JButton jButtonCerrarToolBarPuerto;
	
	protected JButton jButtonProcesarInformacionToolBarPuerto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPuerto;
	protected JMenuItem jMenuItemModificarPuerto;
	protected JMenuItem jMenuItemActualizarPuerto;
    protected JMenuItem jMenuItemEliminarPuerto;
	protected JMenuItem jMenuItemCancelarPuerto;
    protected JMenuItem jMenuItemGuardarCambiosPuerto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPuerto;
	protected JMenuItem jMenuItemCerrarPuerto;
	protected JMenuItem jMenuItemDetalleCerrarPuerto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPuerto;
	
	protected JMenuItem jMenuItemProcesarInformacionPuerto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPuerto;
	protected JMenuItem jMenuItemMostrarOcultarPuerto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPuerto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPuerto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPuerto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPuerto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPuerto;
	public JLabel jLabelIdPuerto;
	public JLabel jLabelidPuerto;
	public JButton jButtonidPuertoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePuerto;
	public JLabel jLabelnombrePuerto;
	public JTextArea jTextAreanombrePuerto;
	public JScrollPane jscrollPanenombrePuerto;
	public JButton jButtonnombrePuertoBusqueda= new JButtonMe();

	public JPanel jPaneles_localPuerto;
	public JLabel jLabeles_localPuerto;
	public JCheckBox jCheckBoxes_localPuerto;
	public JButton jButtones_localPuertoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPuerto;
	public JLabel jLabeldescripcionPuerto;
	public JTextArea jTextAreadescripcionPuerto;
	public JScrollPane jscrollPanedescripcionPuerto;
	public JButton jButtondescripcionPuertoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_puertoPuerto;
	public JLabel jLabelid_tipo_puertoPuerto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_puertoPuerto;
	public JButton jButtonid_tipo_puertoPuerto= new JButtonMe();
	public JButton jButtonid_tipo_puertoPuertoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_puertoPuertoBusqueda= new JButtonMe();

	public JPanel jPanelid_paisPuerto;
	public JLabel jLabelid_paisPuerto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisPuerto;
	public JButton jButtonid_paisPuerto= new JButtonMe();
	public JButton jButtonid_paisPuertoUpdate= new JButtonMe();
	public JButton jButtonid_paisPuertoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPuerto;
	
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
	
	public PuertoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPuerto=new JPanel();
				this.jPanelAccionesFormularioPuerto=new JPanel();
				this.jmenuBarDetallePuerto=new JMenuBar();
				this.jTtoolBarDetallePuerto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PuertoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PuertoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Puerto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPuerto() {
		return this.jButtonActualizarToolBarPuerto;
	}
	
	public JButton getjButtonEliminarToolBarPuerto() {
		return this.jButtonEliminarToolBarPuerto;
	}
	
	public JButton getjButtonCancelarToolBarPuerto() {
		return this.jButtonCancelarToolBarPuerto;
	}		
	
	public JButton getjButtonProcesarInformacionPuerto() {
		return this.jButtonProcesarInformacionPuerto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPuerto)	{
		this.jButtonProcesarInformacionPuerto = jButtonProcesarInformacionPuerto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPuerto() {
		return this.jComboBoxTiposAccionesPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPuerto(
			JComboBox jComboBoxTiposRelacionesPuerto) {
		this.jComboBoxTiposRelacionesPuerto = jComboBoxTiposRelacionesPuerto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPuerto(
			JComboBox jComboBoxTiposAccionesPuerto) {
		this.jComboBoxTiposAccionesPuerto = jComboBoxTiposAccionesPuerto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPuerto() {
		return this.jComboBoxTiposAccionesFormularioPuerto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPuerto(
			JComboBox jComboBoxTiposAccionesFormularioPuerto) {
		this.jComboBoxTiposAccionesFormularioPuerto = jComboBoxTiposAccionesFormularioPuerto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.puertoSessionBean=new PuertoSessionBean();
		
		this.puertoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.puertoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.puertoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		//this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		//this.embarcadorSessionBean=new EmbarcadorSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PuertoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PuertoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PuertoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Puerto MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
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
	
		PuertoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePuerto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPuerto=new JButtonMe();
				this.jButtonModificarToolBarPuerto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPuerto,this.jTtoolBarDetallePuerto,
							"actualizar","actualizar","Actualizar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPuerto,this.jTtoolBarDetallePuerto,
							"eliminar","eliminar","Eliminar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPuerto,this.jTtoolBarDetallePuerto,
							"cancelar","cancelar","Cancelar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPuerto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPuerto,this.jTtoolBarDetallePuerto,
							"guardarcambios","guardarcambios","Guardar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePuerto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePuerto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPuerto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPuerto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPuerto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPuerto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPuerto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPuerto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPuerto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPuerto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPuerto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPuerto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPuerto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPuerto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPuerto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPuerto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPuerto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPuerto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPuerto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPuerto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPuerto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPuerto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPuerto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPuerto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPuerto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPuerto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPuerto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPuerto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPuerto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPuerto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPuerto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPuerto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPuerto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPuerto.add(this.jMenuItemDetalleCerrarPuerto);
		
		this.jmenuDetalleAccionesPuerto.add(this.jMenuItemActualizarPuerto);
		this.jmenuDetalleAccionesPuerto.add(this.jMenuItemEliminarPuerto);
		this.jmenuDetalleAccionesPuerto.add(this.jMenuItemCancelarPuerto);		
		
		//this.jmenuDetalleDatosPuerto.add(this.jMenuItemDetalleAbrirOrderByPuerto);				
		this.jmenuDetalleDatosPuerto.add(this.jMenuItemDetalleMostarOcultarPuerto);				
				
		//this.jmenuDetalleAccionesPuerto.add(this.jMenuItemGuardarCambiosPuerto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePuerto.add(this.jmenuDetalleArchivoPuerto);		
		this.jmenuBarDetallePuerto.add(this.jmenuDetalleAccionesPuerto);		
		this.jmenuBarDetallePuerto.add(this.jmenuDetalleDatosPuerto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePuerto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePuerto.add(this.jmenuDetallePuerto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePuerto);				
	}
	
	
	public void inicializarElementosCamposPuerto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPuerto = new JLabelMe();
		jLabelIdPuerto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPuerto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPuerto.setToolTipText(PuertoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPuerto= new GridBagLayout();

		this.jPanelidPuerto.setLayout(this.gridaBagLayoutPuerto);

		jLabelidPuerto = new JLabel();
		jLabelidPuerto.setText("Id");

		jLabelidPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombrePuerto = new JLabelMe();
		this.jLabelnombrePuerto.setText(""+PuertoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePuerto.setToolTipText("Nombre");
		this.jLabelnombrePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePuerto.setToolTipText(PuertoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPuerto = new GridBagLayout();
		this.jPanelnombrePuerto.setLayout(this.gridaBagLayoutPuerto);


		jTextAreanombrePuerto= new JTextAreaMe();
		jTextAreanombrePuerto.setEnabled(false);
		jTextAreanombrePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePuerto.setLineWrap(true);
		jTextAreanombrePuerto.setWrapStyleWord(true);
		jTextAreanombrePuerto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePuerto.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePuerto = new JScrollPane(jTextAreanombrePuerto);
		jscrollPanenombrePuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrePuertoBusqueda= new JButtonMe();
		this.jButtonnombrePuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePuertoBusqueda.setText("U");
		this.jButtonnombrePuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePuertoBusqueda"));

		if(this.puertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePuertoBusqueda.setVisible(false);		}


					
		this.jLabeles_localPuerto = new JLabelMe();
		this.jLabeles_localPuerto.setText(""+PuertoConstantesFunciones.LABEL_ESLOCAL+" : *");
		this.jLabeles_localPuerto.setToolTipText("Es Local");
		this.jLabeles_localPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_localPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_localPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_localPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_localPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_localPuerto.setToolTipText(PuertoConstantesFunciones.LABEL_ESLOCAL);
		this.gridaBagLayoutPuerto = new GridBagLayout();
		this.jPaneles_localPuerto.setLayout(this.gridaBagLayoutPuerto);


		jCheckBoxes_localPuerto= new JCheckBoxMe();
		jCheckBoxes_localPuerto.setEnabled(false);

		jCheckBoxes_localPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_localPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_localPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_localPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_localPuertoBusqueda= new JButtonMe();
		this.jButtones_localPuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_localPuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_localPuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_localPuertoBusqueda.setText("U");
		this.jButtones_localPuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_localPuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_localPuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_localPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_localPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_localPuertoBusqueda"));

		if(this.puertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_localPuertoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPuerto = new JLabelMe();
		this.jLabeldescripcionPuerto.setText(""+PuertoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionPuerto.setToolTipText("Descripcion");
		this.jLabeldescripcionPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPuerto.setToolTipText(PuertoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPuerto = new GridBagLayout();
		this.jPaneldescripcionPuerto.setLayout(this.gridaBagLayoutPuerto);


		jTextAreadescripcionPuerto= new JTextAreaMe();
		jTextAreadescripcionPuerto.setEnabled(false);
		jTextAreadescripcionPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPuerto.setLineWrap(true);
		jTextAreadescripcionPuerto.setWrapStyleWord(true);
		jTextAreadescripcionPuerto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPuerto.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPuerto = new JScrollPane(jTextAreadescripcionPuerto);
		jscrollPanedescripcionPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionPuertoBusqueda= new JButtonMe();
		this.jButtondescripcionPuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPuertoBusqueda.setText("U");
		this.jButtondescripcionPuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPuertoBusqueda"));

		if(this.puertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPuertoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPuerto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_puertoPuerto = new JLabelMe();
		this.jLabelid_tipo_puertoPuerto.setText(""+PuertoConstantesFunciones.LABEL_IDTIPOPUERTO+" : *");
		this.jLabelid_tipo_puertoPuerto.setToolTipText("Tipo Puerto");
		this.jLabelid_tipo_puertoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_puertoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_puertoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_puertoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_puertoPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_puertoPuerto.setToolTipText(PuertoConstantesFunciones.LABEL_IDTIPOPUERTO);
		this.gridaBagLayoutPuerto = new GridBagLayout();
		this.jPanelid_tipo_puertoPuerto.setLayout(this.gridaBagLayoutPuerto);


		jComboBoxid_tipo_puertoPuerto= new JComboBoxMe();
		jComboBoxid_tipo_puertoPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_puertoPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_puertoPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_puertoPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_puertoPuerto= new JButtonMe();
		this.jButtonid_tipo_puertoPuerto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_puertoPuerto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_puertoPuerto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_puertoPuerto.setText("Buscar");
		this.jButtonid_tipo_puertoPuerto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_puertoPuerto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_puertoPuerto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_puertoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_puertoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_puertoPuerto"));

		this.jButtonid_tipo_puertoPuertoBusqueda= new JButtonMe();
		this.jButtonid_tipo_puertoPuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_puertoPuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_puertoPuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_puertoPuertoBusqueda.setText("U");
		this.jButtonid_tipo_puertoPuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_puertoPuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_puertoPuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_puertoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_puertoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_puertoPuertoBusqueda"));

		if(this.puertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_puertoPuertoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_puertoPuertoUpdate= new JButtonMe();
		this.jButtonid_tipo_puertoPuertoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_puertoPuertoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_puertoPuertoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_puertoPuertoUpdate.setText("U");
		this.jButtonid_tipo_puertoPuertoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_puertoPuertoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_puertoPuertoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_puertoPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_puertoPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_puertoPuertoUpdate"));



					
		this.jLabelid_paisPuerto = new JLabelMe();
		this.jLabelid_paisPuerto.setText(""+PuertoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisPuerto.setToolTipText("Pais");
		this.jLabelid_paisPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisPuerto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisPuerto.setToolTipText(PuertoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutPuerto = new GridBagLayout();
		this.jPanelid_paisPuerto.setLayout(this.gridaBagLayoutPuerto);


		jComboBoxid_paisPuerto= new JComboBoxMe();
		jComboBoxid_paisPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisPuerto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisPuerto= new JButtonMe();
		this.jButtonid_paisPuerto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPuerto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPuerto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisPuerto.setText("Buscar");
		this.jButtonid_paisPuerto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisPuerto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPuerto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPuerto"));

		this.jButtonid_paisPuertoBusqueda= new JButtonMe();
		this.jButtonid_paisPuertoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPuertoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPuertoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPuertoBusqueda.setText("U");
		this.jButtonid_paisPuertoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisPuertoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPuertoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPuertoBusqueda"));

		if(this.puertoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisPuertoBusqueda.setVisible(false);		}

		this.jButtonid_paisPuertoUpdate= new JButtonMe();
		this.jButtonid_paisPuertoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPuertoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisPuertoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisPuertoUpdate.setText("U");
		this.jButtonid_paisPuertoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisPuertoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisPuertoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisPuerto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisPuerto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisPuertoUpdate"));



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
		//this.jInternalFrameDetallePuerto = new PuertoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Puerto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPuerto= new GridBagLayout();
		

		
		String sToolTipPuerto="";
		sToolTipPuerto=PuertoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPuerto+="(Inventario.Puerto)";
		}
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPuerto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPuerto = new JButtonMe();
		this.jButtonModificarPuerto = new JButtonMe();
        this.jButtonActualizarPuerto = new JButtonMe();
        this.jButtonEliminarPuerto = new JButtonMe();
        this.jButtonCancelarPuerto = new JButtonMe();
        this.jButtonGuardarCambiosPuerto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPuerto = new JButtonMe();
		this.jButtonCerrarPuerto = new JButtonMe();
		
		this.jScrollPanelDatosPuerto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPuerto = new JScrollPane();
		this.jScrollPanelDatosGeneralPuerto = new JScrollPane();
				
		
		
		this.jPanelCamposPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Puerto";
		
		if(!this.puertoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Puertoes" + this.sPath));
		} else {
			this.jScrollPanelDatosPuerto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPuerto.setName("jPanelCamposPuerto"); 

		this.jPanelCamposOcultosPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPuerto.setName("jPanelCamposOcultosPuerto"); 

        this.jPanelAccionesPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPuerto.setToolTipText("Acciones");
        this.jPanelAccionesPuerto.setName("Acciones"); 

		this.jPanelAccionesFormularioPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPuerto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPuerto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPuerto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPuerto.setText("Nuevo");
		this.jButtonModificarPuerto.setText("Editar");
        this.jButtonActualizarPuerto.setText("Actualizar");
        this.jButtonEliminarPuerto.setText("Eliminar");
        this.jButtonCancelarPuerto.setText("Cancelar");
        this.jButtonGuardarCambiosPuerto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPuerto.setText("Guardar");
		this.jButtonCerrarPuerto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPuerto,"nuevo_button","Nuevo",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPuerto,"modificar_button","Editar",this.puertoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPuerto,"actualizar_button","Actualizar",this.puertoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPuerto,"eliminar_button","Eliminar",this.puertoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPuerto,"cancelar_button","Cancelar",this.puertoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPuerto,"guardarcambios_button","Guardar",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPuerto,"guardarcambiostabla_button","Guardar",this.puertoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPuerto,"cerrar_button","Salir",this.puertoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPuerto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPuerto.setToolTipText("Nuevo"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPuerto.setToolTipText("Editar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPuerto.setToolTipText("Actualizar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPuerto.setToolTipText("Eliminar)"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPuerto.setToolTipText("Cancelar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPuerto.setToolTipText("Guardar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPuerto.setToolTipText("Guardar"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPuerto.setToolTipText("Salir"+" "+PuertoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPuerto";
		inputMap = this.jButtonNuevoPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPuerto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPuerto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPuerto";
		inputMap = this.jButtonActualizarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPuerto"));
		
		//ELIMINAR
		sMapKey = "EliminarPuerto";
		inputMap = this.jButtonEliminarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPuerto"));
		
		//CANCELAR	
		sMapKey = "CancelarPuerto";
		inputMap = this.jButtonCancelarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPuerto"));
		
		//CERRAR		
		sMapKey = "CerrarPuerto";
		inputMap = this.jButtonCerrarPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPuerto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPuerto";
		inputMap = this.jButtonGuardarCambiosTablaPuerto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPuerto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPuerto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPuerto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPuerto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPuerto.setToolTipText("Nuevo Puerto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPuerto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPuerto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPuerto.setToolTipText("Sin Cerrar Ventana Puerto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPuerto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePuerto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePuerto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePuerto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePuerto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPuerto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPuerto.setText("Accion");
		this.jComboBoxTiposAccionesPuerto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPuerto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPuerto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPuerto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPuerto = new JLabelMe();
		
		this.jLabelAccionesPuerto.setText("Acciones");		
		this.jLabelAccionesPuerto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuerto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPuerto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPuerto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPuerto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPuerto=new JTabbedPane();
		this.jTabbedPaneRelacionesPuerto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPuerto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPuerto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuerto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPuerto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPuerto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPuerto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPuerto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPuerto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPuerto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPuerto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPuerto = new GridBagLayout();
		
		this.jPanelCamposPuerto.setLayout(gridaBagLayoutCamposPuerto);
		this.jPanelCamposOcultosPuerto.setLayout(gridaBagLayoutCamposOcultosPuerto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 0;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPuerto.add(jLabelIdPuerto, this.gridBagConstraintsPuerto);



	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 1;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPuerto.add(jLabelidPuerto, this.gridBagConstraintsPuerto);


	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 0;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_puertoPuerto.add(jLabelid_tipo_puertoPuerto, this.gridBagConstraintsPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 2;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_puertoPuerto.add(jButtonid_tipo_puertoPuertoBusqueda, this.gridBagConstraintsPuerto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 3;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_puertoPuerto.add(jButtonid_tipo_puertoPuertoUpdate, this.gridBagConstraintsPuerto);
	}

	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 1;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_puertoPuerto.add(jComboBoxid_tipo_puertoPuerto, this.gridBagConstraintsPuerto);


	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 0;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisPuerto.add(jLabelid_paisPuerto, this.gridBagConstraintsPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 2;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPuerto.add(jButtonid_paisPuertoBusqueda, this.gridBagConstraintsPuerto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 3;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisPuerto.add(jButtonid_paisPuertoUpdate, this.gridBagConstraintsPuerto);
	}

	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 1;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisPuerto.add(jComboBoxid_paisPuerto, this.gridBagConstraintsPuerto);


	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 0;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePuerto.add(jLabelnombrePuerto, this.gridBagConstraintsPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 2;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePuerto.add(jButtonnombrePuertoBusqueda, this.gridBagConstraintsPuerto);
	}

	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 1;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePuerto.add(jscrollPanenombrePuerto, this.gridBagConstraintsPuerto);


	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 0;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_localPuerto.add(jLabeles_localPuerto, this.gridBagConstraintsPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 2;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_localPuerto.add(jButtones_localPuertoBusqueda, this.gridBagConstraintsPuerto);
	}

	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 1;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_localPuerto.add(jCheckBoxes_localPuerto, this.gridBagConstraintsPuerto);


	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 0;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPuerto.add(jLabeldescripcionPuerto, this.gridBagConstraintsPuerto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		//this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = 2;
		this.gridBagConstraintsPuerto.ipadx = 0;
		this.gridBagConstraintsPuerto.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPuerto.add(jButtondescripcionPuertoBusqueda, this.gridBagConstraintsPuerto);
	}

	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPuerto.gridy = 0;
	this.gridBagConstraintsPuerto.gridx = 1;
	this.gridBagConstraintsPuerto.ipadx = 0;
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPuerto.add(jscrollPanedescripcionPuerto, this.gridBagConstraintsPuerto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuerto.gridy = iYPanelCamposPuerto;
	this.gridBagConstraintsPuerto.gridx = iXPanelCamposPuerto++;
	this.gridBagConstraintsPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuerto.add(this.jPanelidPuerto, this.gridBagConstraintsPuerto);



	if(iXPanelCamposPuerto % 1==0) {
		iXPanelCamposPuerto=0;
		iYPanelCamposPuerto++;
	}
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuerto.gridy = iYPanelCamposPuerto;
	this.gridBagConstraintsPuerto.gridx = iXPanelCamposPuerto++;
	this.gridBagConstraintsPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuerto.add(this.jPanelid_tipo_puertoPuerto, this.gridBagConstraintsPuerto);



	if(iXPanelCamposPuerto % 1==0) {
		iXPanelCamposPuerto=0;
		iYPanelCamposPuerto++;
	}
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuerto.gridy = iYPanelCamposPuerto;
	this.gridBagConstraintsPuerto.gridx = iXPanelCamposPuerto++;
	this.gridBagConstraintsPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuerto.add(this.jPanelid_paisPuerto, this.gridBagConstraintsPuerto);



	if(iXPanelCamposPuerto % 1==0) {
		iXPanelCamposPuerto=0;
		iYPanelCamposPuerto++;
	}
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuerto.gridy = iYPanelCamposPuerto;
	this.gridBagConstraintsPuerto.gridx = iXPanelCamposPuerto++;
	this.gridBagConstraintsPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuerto.add(this.jPanelnombrePuerto, this.gridBagConstraintsPuerto);



	if(iXPanelCamposPuerto % 1==0) {
		iXPanelCamposPuerto=0;
		iYPanelCamposPuerto++;
	}
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuerto.gridy = iYPanelCamposPuerto;
	this.gridBagConstraintsPuerto.gridx = iXPanelCamposPuerto++;
	this.gridBagConstraintsPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuerto.add(this.jPaneles_localPuerto, this.gridBagConstraintsPuerto);



	if(iXPanelCamposPuerto % 1==0) {
		iXPanelCamposPuerto=0;
		iYPanelCamposPuerto++;
	}
	this.gridBagConstraintsPuerto = new GridBagConstraints();
	this.gridBagConstraintsPuerto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPuerto.gridy = iYPanelCamposPuerto;
	this.gridBagConstraintsPuerto.gridx = iXPanelCamposPuerto++;
	this.gridBagConstraintsPuerto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPuerto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPuerto.add(this.jPaneldescripcionPuerto, this.gridBagConstraintsPuerto);



	if(iXPanelCamposPuerto % 1==0) {
		iXPanelCamposPuerto=0;
		iYPanelCamposPuerto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPuerto= new GridBagLayout();
		this.jPanelAccionesPuerto.setLayout(gridaBagLayoutAccionesPuerto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPuerto= new GridBagLayout();
		this.jPanelAccionesFormularioPuerto.setLayout(gridaBagLayoutAccionesFormularioPuerto);
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPuerto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPuerto.add(this.jComboBoxTiposAccionesFormularioPuerto, this.gridBagConstraintsPuerto);

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPuerto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPuerto.add(this.jCheckBoxPostAccionNuevoPuerto, this.gridBagConstraintsPuerto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.puertoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPuerto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPuerto.add(this.jCheckBoxPostAccionSinCerrarPuerto, this.gridBagConstraintsPuerto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.puertoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.puertoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPuerto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPuerto.add(this.jCheckBoxPostAccionSinMensajePuerto, this.gridBagConstraintsPuerto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPuerto.add(this.jButtonModificarPuerto, this.gridBagConstraintsPuerto);							

		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPuerto.gridy = 0;
		this.gridBagConstraintsPuerto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPuerto.add(this.jButtonEliminarPuerto, this.gridBagConstraintsPuerto);
		
			
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = 0;		
		this.gridBagConstraintsPuerto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPuerto.add(this.jButtonActualizarPuerto, this.gridBagConstraintsPuerto);


		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = 0;		
		this.gridBagConstraintsPuerto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPuerto.add(this.jButtonGuardarCambiosPuerto, this.gridBagConstraintsPuerto);	
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = 0;		
		this.gridBagConstraintsPuerto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPuerto.add(this.jButtonCancelarPuerto, this.gridBagConstraintsPuerto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPuerto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPuerto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.puertoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPuerto = new GridBagConstraints();						
			this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPuerto.gridx = 0;		
			//this.gridBagConstraintsPuerto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPuerto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPuerto.gridx =0;
		this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPuerto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPuerto, this.gridBagConstraintsPuerto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PuertoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePuerto = new PuertoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Puerto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Puerto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Puerto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PuertoModel puertoModel=new PuertoModel(this);
			
			//SI USARA CLASE INTERNA
			//PuertoModel.PuertoFocusTraversalPolicy puertoFocusTraversalPolicy = puertoModel.new PuertoFocusTraversalPolicy(this);
			
			//puertoFocusTraversalPolicy.setpuertoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(puertoModel);
			
			
			this.jContentPaneDetallePuerto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePuerto = new GridBagLayout();	
			this.jContentPaneDetallePuerto.setLayout(gridaBagLayoutDetallePuerto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPuerto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPuerto = new GridBagConstraints();
				this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPuerto.gridx = 0;
					
				
				this.jContentPaneDetallePuerto.add(jTtoolBarDetallePuerto, gridBagConstraintsPuerto);								
				
}
			
			this.jScrollPanelDatosEdicionPuerto=   new JScrollPane(jContentPaneDetallePuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPuerto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPuerto.gridx = 0;
	        
			this.jContentPaneDetallePuerto.add(jPanelCamposPuerto, gridBagConstraintsPuerto);
			
			
			
			
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
						&& puertoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmbarcador(this.puedeCargarPorParteEmbarcador,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLiquidacionImpor(this.puedeCargarPorParteLiquidacionImpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(this.puedeCargarPorPartePedidoCompraImpor,false,-1);
					
					if(this.puertoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPuerto= new GridBagConstraints();
						this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPuerto.gridx = 0;
						this.jContentPaneDetallePuerto.add(this.jTabbedPaneRelacionesPuerto, this.gridBagConstraintsPuerto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPuerto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmbarcador(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameLiquidacionImpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPuerto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPuerto = new GridBagConstraints();
					this.gridBagConstraintsPuerto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPuerto.gridx = 0;
					
				
					this.jContentPaneDetallePuerto.add(jPanelCamposOcultosPuerto, gridBagConstraintsPuerto);
				
					this.jPanelCamposOcultosPuerto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsPuerto.gridx = 0;
	        this.gridBagConstraintsPuerto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePuerto.add(this.jPanelAccionesFormularioPuerto, this.gridBagConstraintsPuerto);							
			
			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
	        this.gridBagConstraintsPuerto.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsPuerto.gridx = 0;
	        
			
			this.jContentPaneDetallePuerto.add(this.jPanelAccionesPuerto, this.gridBagConstraintsPuerto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPuerto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPuerto=   new JScrollPane(this.jPanelCamposPuerto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPuerto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuerto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPuerto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPuerto.gridx = 0;
			this.gridBagConstraintsPuerto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPuerto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPuerto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPuerto, this.gridBagConstraintsPuerto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPuerto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPuerto, this.gridBagConstraintsPuerto);			
			
			this.gridBagConstraintsPuerto = new GridBagConstraints();
			this.gridBagConstraintsPuerto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPuerto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPuerto, this.gridBagConstraintsPuerto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPuerto, this.gridBagConstraintsPuerto);
			
			
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPuerto, this.gridBagConstraintsPuerto);
		
			
		this.gridBagConstraintsPuerto = new GridBagConstraints();
		this.gridBagConstraintsPuerto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPuerto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPuerto, this.gridBagConstraintsPuerto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPuerto;//jContentPane;
		
		return jScrollPanelDatosEdicionPuerto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmbarcador(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.embarcadorSessionBean=new EmbarcadorSessionBean();
		this.embarcadorSessionBean.setConGuardarRelaciones(false);
		this.embarcadorSessionBean.setEsGuardarRelacionado(true);

		this.embarcadorBeanSwingJInternalFrame=null;//new EmbarcadorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.embarcadorBeanSwingJInternalFramePopup=new EmbarcadorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.embarcadorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {

				EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmbarcadorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.embarcadorSessionBean.setEsGuardarRelacionado(true);

				this.embarcadorBeanSwingJInternalFrame=new EmbarcadorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.embarcadorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.embarcadorBeanSwingJInternalFrame.setembarcadorSessionBean(this.embarcadorSessionBean);

				//this.gridBagConstraintsPuerto = new GridBagConstraints();
				//this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPuerto.gridx = 0;
				//this.jContentPaneDetallePuerto.add(this.embarcadorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPuerto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPuerto.add("Embarcadores",this.embarcadorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPuerto.setComponentAt(iIndexTab,this.embarcadorBeanSwingJInternalFrame.getContentPane());
				}

				//EmbarcadorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.embarcadorSessionBean.setEsGuardarRelacionado(false);
				this.embarcadorBeanSwingJInternalFrame=null;//new EmbarcadorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.embarcadorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmbarcador) {
					this.jTabbedPaneRelacionesPuerto.add("Embarcadores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameLiquidacionImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.liquidacionimporSessionBean=new LiquidacionImporSessionBean();
		this.liquidacionimporSessionBean.setConGuardarRelaciones(false);
		this.liquidacionimporSessionBean.setEsGuardarRelacionado(true);

		this.liquidacionimporBeanSwingJInternalFrame=null;//new LiquidacionImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.liquidacionimporBeanSwingJInternalFramePopup=new LiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.liquidacionimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {

				LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;
				LiquidacionImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.liquidacionimporSessionBean.setEsGuardarRelacionado(true);

				this.liquidacionimporBeanSwingJInternalFrame=new LiquidacionImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.liquidacionimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.liquidacionimporBeanSwingJInternalFrame.setliquidacionimporSessionBean(this.liquidacionimporSessionBean);

				//this.gridBagConstraintsPuerto = new GridBagConstraints();
				//this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPuerto.gridx = 0;
				//this.jContentPaneDetallePuerto.add(this.liquidacionimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPuerto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPuerto.add("Liquidacion Impores",this.liquidacionimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPuerto.setComponentAt(iIndexTab,this.liquidacionimporBeanSwingJInternalFrame.getContentPane());
				}

				//LiquidacionImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.liquidacionimporSessionBean.setEsGuardarRelacionado(false);
				this.liquidacionimporBeanSwingJInternalFrame=null;//new LiquidacionImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.liquidacionimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLiquidacionImpor) {
					this.jTabbedPaneRelacionesPuerto.add("Liquidacion Impores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoCompraImpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidocompraimporSessionBean=new PedidoCompraImporSessionBean();
		this.pedidocompraimporSessionBean.setConGuardarRelaciones(true);
		this.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);

		this.pedidocompraimporBeanSwingJInternalFrame=null;//new PedidoCompraImporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidocompraimporBeanSwingJInternalFramePopup=new PedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidocompraimporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {

				PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PuertoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidocompraimporSessionBean.setEsGuardarRelacionado(true);

				this.pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidocompraimporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidocompraimporBeanSwingJInternalFrame.setpedidocompraimporSessionBean(this.pedidocompraimporSessionBean);

				//this.gridBagConstraintsPuerto = new GridBagConstraints();
				//this.gridBagConstraintsPuerto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPuerto.gridx = 0;
				//this.jContentPaneDetallePuerto.add(this.pedidocompraimporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPuerto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPuerto.add("Pedido Compras",this.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPuerto.setComponentAt(iIndexTab,this.pedidocompraimporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidocompraimporSessionBean.setEsGuardarRelacionado(false);
				this.pedidocompraimporBeanSwingJInternalFrame=null;//new PedidoCompraImporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidocompraimporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoCompraImpor) {
					this.jTabbedPaneRelacionesPuerto.add("Pedido Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoCompraImporBeanSwingJInternalFrame(List<Puerto> puertos,Puerto puerto,PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidocompraimporBeanSwingJInternalFrame=new PedidoCompraImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidocompraimporBeanSwingJInternalFrame.getPedidoCompraImporLogic().setConnexion(this.puertoLogic.getConnexion());

					pedidocompraimporBeanSwingJInternalFrame.setpuertosForeignKey(puertos);
					pedidocompraimporBeanSwingJInternalFrame.setpuertoForeignKey(puerto);
					pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setisBusquedaDesdeForeignKeySesionPuerto(true);
					pedidocompraimporBeanSwingJInternalFrame.pedidocompraimporSessionBean.setlidPuertoActual(puerto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidocompraimporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoCompraImpor(pedidocompraimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidocompraimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaPuerto(true);
					pedidocompraimporBeanSwingJInternalFrame.setid_puertoFK_IdPuerto(puerto.getId());

					if(!this.conCargarFormDetalle) {
						pedidocompraimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidocompraimporBeanSwingJInternalFrame.setSelectedItemCombosFramePuertoForeignKey(puerto,1,false,true,true);
					pedidocompraimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidocompraimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdPuerto");
					pedidocompraimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPuerto");
					pedidocompraimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoCompraImpor(true);
					pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoCompraImpor("n",pedidocompraimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidocompraimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidocompraimporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidocompraimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompraImpor("relacionado");
					} else {
						pedidocompraimporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoCompraImpor("no_relacionado");
					}

					pedidocompraimporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoCompraImpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarLiquidacionImporBeanSwingJInternalFrame(List<Puerto> puertos,Puerto puerto,LiquidacionImporBeanSwingJInternalFrame liquidacionimporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//liquidacionimporBeanSwingJInternalFrame=new LiquidacionImporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					liquidacionimporBeanSwingJInternalFrame.getLiquidacionImporLogic().setConnexion(this.puertoLogic.getConnexion());

					liquidacionimporBeanSwingJInternalFrame.setpuertosForeignKey(puertos);
					liquidacionimporBeanSwingJInternalFrame.setpuertoForeignKey(puerto);
					liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.setisBusquedaDesdeForeignKeySesionPuerto(true);
					liquidacionimporBeanSwingJInternalFrame.liquidacionimporSessionBean.setlidPuertoActual(puerto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					liquidacionimporBeanSwingJInternalFrame.cargarCombosForeignKeyLiquidacionImpor(liquidacionimporBeanSwingJInternalFrame.isCargarCombosDependencia);
					liquidacionimporBeanSwingJInternalFrame.setVisibilidadBusquedasParaPuerto(true);
					liquidacionimporBeanSwingJInternalFrame.setid_puertoFK_IdPuerto(puerto.getId());

					if(!this.conCargarFormDetalle) {
						liquidacionimporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					liquidacionimporBeanSwingJInternalFrame.setSelectedItemCombosFramePuertoForeignKey(puerto,1,false,true,true);
					liquidacionimporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					liquidacionimporBeanSwingJInternalFrame.procesarBusqueda("FK_IdPuerto");
					liquidacionimporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPuerto");
					liquidacionimporBeanSwingJInternalFrame.inicializarActualizarBindingTablaLiquidacionImpor(true);
					liquidacionimporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLiquidacionImpor("n",liquidacionimporBeanSwingJInternalFrame.isGuardarCambiosEnLote, liquidacionimporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					liquidacionimporBeanSwingJInternalFrame.setAutoscrolls(true);
					liquidacionimporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						liquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsLiquidacionImpor("relacionado");
					} else {
						liquidacionimporBeanSwingJInternalFrame.actualizarEstadoPanelsLiquidacionImpor("no_relacionado");
					}

					liquidacionimporBeanSwingJInternalFrame.getjButtonRecargarInformacionLiquidacionImpor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmbarcadorBeanSwingJInternalFrame(List<Puerto> puertos,Puerto puerto,EmbarcadorBeanSwingJInternalFrame embarcadorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//embarcadorBeanSwingJInternalFrame=new EmbarcadorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					embarcadorBeanSwingJInternalFrame.getEmbarcadorLogic().setConnexion(this.puertoLogic.getConnexion());

					embarcadorBeanSwingJInternalFrame.setpuertosForeignKey(puertos);
					embarcadorBeanSwingJInternalFrame.setpuertoForeignKey(puerto);
					embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.setisBusquedaDesdeForeignKeySesionPuerto(true);
					embarcadorBeanSwingJInternalFrame.embarcadorSessionBean.setlidPuertoActual(puerto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					embarcadorBeanSwingJInternalFrame.cargarCombosForeignKeyEmbarcador(embarcadorBeanSwingJInternalFrame.isCargarCombosDependencia);
					embarcadorBeanSwingJInternalFrame.setVisibilidadBusquedasParaPuerto(true);
					embarcadorBeanSwingJInternalFrame.setid_puertoFK_IdPuerto(puerto.getId());

					if(!this.conCargarFormDetalle) {
						embarcadorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					embarcadorBeanSwingJInternalFrame.setSelectedItemCombosFramePuertoForeignKey(puerto,1,false,true,true);
					embarcadorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					embarcadorBeanSwingJInternalFrame.procesarBusqueda("FK_IdPuerto");
					embarcadorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPuerto");
					embarcadorBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmbarcador(true);
					embarcadorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmbarcador("n",embarcadorBeanSwingJInternalFrame.isGuardarCambiosEnLote, embarcadorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					embarcadorBeanSwingJInternalFrame.setAutoscrolls(true);
					embarcadorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						embarcadorBeanSwingJInternalFrame.actualizarEstadoPanelsEmbarcador("relacionado");
					} else {
						embarcadorBeanSwingJInternalFrame.actualizarEstadoPanelsEmbarcador("no_relacionado");
					}

					embarcadorBeanSwingJInternalFrame.getjButtonRecargarInformacionEmbarcador().setVisible(false);

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
