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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.MesaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class MesaDetalleFormJInternalFrame extends MesaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMesa;
	
	protected JMenuBar jmenuBarDetalleMesa;
	
	protected JMenu jmenuDetalleMesa;
	protected JMenu jmenuDetalleArchivoMesa;
	protected JMenu jmenuDetalleAccionesMesa;
	protected JMenu jmenuDetalleDatosMesa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMesa;	
	protected GridBagConstraints gridBagConstraintsMesa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MesaBeanSwingJInternalFrameAdditional jInternalFrameDetalleMesa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public MesaSessionBean mesaSessionBean;
	
	

	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame=null;
	public PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoPuntoVenta=false;
	public PedidoPuntoVentaSessionBean pedidopuntoventaSessionBean;

	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
	public FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaPuntoVenta=false;
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;

	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;
	public NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNotaCreditoPuntoVenta=false;
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;

	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame=null;
	public CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCajeroTurno=false;
	public CajeroTurnoSessionBean cajeroturnoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public MesaLogic mesaLogic;
	
	public JScrollPane jScrollPanelDatosMesa;
	public JScrollPane jScrollPanelDatosEdicionMesa;
	public JScrollPane jScrollPanelDatosGeneralMesa;
	
	protected JPanel jPanelCamposMesa;    
	protected JPanel jPanelCamposOcultosMesa;    	
	protected JPanel jPanelAccionesMesa;
	protected JPanel jPanelAccionesFormularioMesa;
    
	
	
	protected Integer iXPanelCamposMesa=0;
	protected Integer iYPanelCamposMesa=0;
	
	protected Integer iXPanelCamposOcultosMesa=0;
	protected Integer iYPanelCamposOcultosMesa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMesa;
	public JButton jButtonModificarMesa;
	public JButton jButtonActualizarMesa;
    public JButton jButtonEliminarMesa;
	public JButton jButtonCancelarMesa;
    public JButton jButtonGuardarCambiosMesa;
	public JButton jButtonGuardarCambiosTablaMesa;
	protected JButton jButtonCerrarMesa;
	
	
	protected JButton jButtonProcesarInformacionMesa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMesa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMesa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMesa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMesa;
	protected JButton jButtonModificarToolBarMesa;
	protected JButton jButtonActualizarToolBarMesa;
    protected JButton jButtonEliminarToolBarMesa;
	protected JButton jButtonCancelarToolBarMesa;
    protected JButton jButtonGuardarCambiosToolBarMesa;
	protected JButton jButtonGuardarCambiosTablaToolBarMesa;
	protected JButton jButtonMostrarOcultarTablaToolBarMesa;
	protected JButton jButtonCerrarToolBarMesa;
	
	protected JButton jButtonProcesarInformacionToolBarMesa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMesa;
	protected JMenuItem jMenuItemModificarMesa;
	protected JMenuItem jMenuItemActualizarMesa;
    protected JMenuItem jMenuItemEliminarMesa;
	protected JMenuItem jMenuItemCancelarMesa;
    protected JMenuItem jMenuItemGuardarCambiosMesa;
	protected JMenuItem jMenuItemGuardarCambiosTablaMesa;
	protected JMenuItem jMenuItemCerrarMesa;
	protected JMenuItem jMenuItemDetalleCerrarMesa;
	protected JMenuItem jMenuItemDetalleMostarOcultarMesa;
	
	protected JMenuItem jMenuItemProcesarInformacionMesa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMesa;
	protected JMenuItem jMenuItemMostrarOcultarMesa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMesa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMesa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMesa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMesa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMesa;
	public JLabel jLabelIdMesa;
	public JLabel jLabelidMesa;
	public JButton jButtonidMesaBusqueda= new JButtonMe();

	public JPanel jPanelnombreMesa;
	public JLabel jLabelnombreMesa;
	public JTextArea jTextAreanombreMesa;
	public JScrollPane jscrollPanenombreMesa;
	public JButton jButtonnombreMesaBusqueda= new JButtonMe();

	public JPanel jPanelnumeroMesa;
	public JLabel jLabelnumeroMesa;
	public JTextField jTextFieldnumeroMesa;
	public JButton jButtonnumeroMesaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMesa;
	public JLabel jLabelid_empresaMesa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMesa;
	public JButton jButtonid_empresaMesa= new JButtonMe();
	public JButton jButtonid_empresaMesaUpdate= new JButtonMe();
	public JButton jButtonid_empresaMesaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMesa;
	public JLabel jLabelid_sucursalMesa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMesa;
	public JButton jButtonid_sucursalMesa= new JButtonMe();
	public JButton jButtonid_sucursalMesaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMesaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMesa;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MesaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMesa=new JPanel();
				this.jPanelAccionesFormularioMesa=new JPanel();
				this.jmenuBarDetalleMesa=new JMenuBar();
				this.jTtoolBarDetalleMesa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MesaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MesaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Mesa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMesa() {
		return this.jButtonActualizarToolBarMesa;
	}
	
	public JButton getjButtonEliminarToolBarMesa() {
		return this.jButtonEliminarToolBarMesa;
	}
	
	public JButton getjButtonCancelarToolBarMesa() {
		return this.jButtonCancelarToolBarMesa;
	}		
	
	public JButton getjButtonProcesarInformacionMesa() {
		return this.jButtonProcesarInformacionMesa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMesa)	{
		this.jButtonProcesarInformacionMesa = jButtonProcesarInformacionMesa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMesa() {
		return this.jComboBoxTiposAccionesMesa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMesa(
			JComboBox jComboBoxTiposRelacionesMesa) {
		this.jComboBoxTiposRelacionesMesa = jComboBoxTiposRelacionesMesa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMesa(
			JComboBox jComboBoxTiposAccionesMesa) {
		this.jComboBoxTiposAccionesMesa = jComboBoxTiposAccionesMesa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMesa() {
		return this.jComboBoxTiposAccionesFormularioMesa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMesa(
			JComboBox jComboBoxTiposAccionesFormularioMesa) {
		this.jComboBoxTiposAccionesFormularioMesa = jComboBoxTiposAccionesFormularioMesa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.mesaSessionBean=new MesaSessionBean();
		
		this.mesaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mesaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.mesaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		//this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		//this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		//this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MesaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MesaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MesaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Mesa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
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
	
		MesaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMesa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMesa=new JButtonMe();
				this.jButtonModificarToolBarMesa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMesa,this.jTtoolBarDetalleMesa,
							"actualizar","actualizar","Actualizar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMesa,this.jTtoolBarDetalleMesa,
							"eliminar","eliminar","Eliminar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMesa,this.jTtoolBarDetalleMesa,
							"cancelar","cancelar","Cancelar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMesa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMesa,this.jTtoolBarDetalleMesa,
							"guardarcambios","guardarcambios","Guardar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMesa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMesa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMesa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMesa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMesa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMesa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMesa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMesa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMesa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMesa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMesa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMesa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMesa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMesa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMesa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMesa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMesa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMesa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMesa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMesa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMesa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMesa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMesa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMesa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMesa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMesa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMesa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMesa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMesa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMesa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMesa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMesa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMesa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMesa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMesa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMesa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMesa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMesa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMesa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMesa.add(this.jMenuItemDetalleCerrarMesa);
		
		this.jmenuDetalleAccionesMesa.add(this.jMenuItemActualizarMesa);
		this.jmenuDetalleAccionesMesa.add(this.jMenuItemEliminarMesa);
		this.jmenuDetalleAccionesMesa.add(this.jMenuItemCancelarMesa);		
		
		//this.jmenuDetalleDatosMesa.add(this.jMenuItemDetalleAbrirOrderByMesa);				
		this.jmenuDetalleDatosMesa.add(this.jMenuItemDetalleMostarOcultarMesa);				
				
		//this.jmenuDetalleAccionesMesa.add(this.jMenuItemGuardarCambiosMesa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMesa.add(this.jmenuDetalleArchivoMesa);		
		this.jmenuBarDetalleMesa.add(this.jmenuDetalleAccionesMesa);		
		this.jmenuBarDetalleMesa.add(this.jmenuDetalleDatosMesa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleMesa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMesa.add(this.jmenuDetalleMesa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleMesa);				
	}
	
	
	public void inicializarElementosCamposMesa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMesa = new JLabelMe();
		jLabelIdMesa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMesa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMesa.setToolTipText(MesaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMesa= new GridBagLayout();

		this.jPanelidMesa.setLayout(this.gridaBagLayoutMesa);

		jLabelidMesa = new JLabel();
		jLabelidMesa.setText("Id");

		jLabelidMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreMesa = new JLabelMe();
		this.jLabelnombreMesa.setText(""+MesaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreMesa.setToolTipText("Nombre");
		this.jLabelnombreMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreMesa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreMesa.setToolTipText(MesaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutMesa = new GridBagLayout();
		this.jPanelnombreMesa.setLayout(this.gridaBagLayoutMesa);


		jTextAreanombreMesa= new JTextAreaMe();
		jTextAreanombreMesa.setEnabled(false);
		jTextAreanombreMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreMesa.setLineWrap(true);
		jTextAreanombreMesa.setWrapStyleWord(true);
		jTextAreanombreMesa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreMesa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreMesa = new JScrollPane(jTextAreanombreMesa);
		jscrollPanenombreMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreMesaBusqueda= new JButtonMe();
		this.jButtonnombreMesaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMesaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreMesaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreMesaBusqueda.setText("U");
		this.jButtonnombreMesaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreMesaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreMesaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreMesaBusqueda"));

		if(this.mesaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreMesaBusqueda.setVisible(false);		}


					
		this.jLabelnumeroMesa = new JLabelMe();
		this.jLabelnumeroMesa.setText(""+MesaConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroMesa.setToolTipText("Numero");
		this.jLabelnumeroMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroMesa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroMesa.setToolTipText(MesaConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutMesa = new GridBagLayout();
		this.jPanelnumeroMesa.setLayout(this.gridaBagLayoutMesa);


		jTextFieldnumeroMesa= new JTextFieldMe();
		jTextFieldnumeroMesa.setEnabled(false);
		jTextFieldnumeroMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumeroMesa.setText("0");

		this.jButtonnumeroMesaBusqueda= new JButtonMe();
		this.jButtonnumeroMesaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroMesaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroMesaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroMesaBusqueda.setText("U");
		this.jButtonnumeroMesaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroMesaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroMesaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroMesaBusqueda"));

		if(this.mesaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroMesaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMesa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMesa = new JLabelMe();
		this.jLabelid_empresaMesa.setText(""+MesaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMesa.setToolTipText("Empresa");
		this.jLabelid_empresaMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMesa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMesa.setToolTipText(MesaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMesa = new GridBagLayout();
		this.jPanelid_empresaMesa.setLayout(this.gridaBagLayoutMesa);


		jComboBoxid_empresaMesa= new JComboBoxMe();
		jComboBoxid_empresaMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMesa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMesa.setEnabled(false);

		this.jButtonid_empresaMesa= new JButtonMe();
		this.jButtonid_empresaMesa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMesa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMesa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMesa.setText("Buscar");
		this.jButtonid_empresaMesa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMesa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMesa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMesa"));

		this.jButtonid_empresaMesaBusqueda= new JButtonMe();
		this.jButtonid_empresaMesaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMesaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMesaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMesaBusqueda.setText("U");
		this.jButtonid_empresaMesaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMesaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMesaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMesaBusqueda"));

		if(this.mesaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMesaBusqueda.setVisible(false);		}

		this.jButtonid_empresaMesaUpdate= new JButtonMe();
		this.jButtonid_empresaMesaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMesaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMesaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMesaUpdate.setText("U");
		this.jButtonid_empresaMesaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMesaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMesaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMesaUpdate"));



					
		this.jLabelid_sucursalMesa = new JLabelMe();
		this.jLabelid_sucursalMesa.setText(""+MesaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMesa.setToolTipText("Sucursal");
		this.jLabelid_sucursalMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMesa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMesa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMesa.setToolTipText(MesaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMesa = new GridBagLayout();
		this.jPanelid_sucursalMesa.setLayout(this.gridaBagLayoutMesa);


		jComboBoxid_sucursalMesa= new JComboBoxMe();
		jComboBoxid_sucursalMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMesa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMesa.setEnabled(false);

		this.jButtonid_sucursalMesa= new JButtonMe();
		this.jButtonid_sucursalMesa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMesa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMesa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMesa.setText("Buscar");
		this.jButtonid_sucursalMesa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMesa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMesa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMesa"));

		this.jButtonid_sucursalMesaBusqueda= new JButtonMe();
		this.jButtonid_sucursalMesaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMesaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMesaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMesaBusqueda.setText("U");
		this.jButtonid_sucursalMesaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMesaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMesaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMesaBusqueda"));

		if(this.mesaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMesaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMesaUpdate= new JButtonMe();
		this.jButtonid_sucursalMesaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMesaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMesaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMesaUpdate.setText("U");
		this.jButtonid_sucursalMesaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMesaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMesaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMesa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMesa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMesaUpdate"));



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
		//this.jInternalFrameDetalleMesa = new MesaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Mesa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMesa= new GridBagLayout();
		

		
		String sToolTipMesa="";
		sToolTipMesa=MesaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMesa+="(PuntoVenta.Mesa)";
		}
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			sToolTipMesa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMesa = new JButtonMe();
		this.jButtonModificarMesa = new JButtonMe();
        this.jButtonActualizarMesa = new JButtonMe();
        this.jButtonEliminarMesa = new JButtonMe();
        this.jButtonCancelarMesa = new JButtonMe();
        this.jButtonGuardarCambiosMesa = new JButtonMe();
		this.jButtonGuardarCambiosTablaMesa = new JButtonMe();
		this.jButtonCerrarMesa = new JButtonMe();
		
		this.jScrollPanelDatosMesa = new JScrollPane();   
        this.jScrollPanelDatosEdicionMesa = new JScrollPane();
		this.jScrollPanelDatosGeneralMesa = new JScrollPane();
				
		
		
		this.jPanelCamposMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Mesa";
		
		if(!this.mesaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Mesas" + this.sPath));
		} else {
			this.jScrollPanelDatosMesa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposMesa.setName("jPanelCamposMesa"); 

		this.jPanelCamposOcultosMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMesa.setName("jPanelCamposOcultosMesa"); 

        this.jPanelAccionesMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMesa.setToolTipText("Acciones");
        this.jPanelAccionesMesa.setName("Acciones"); 

		this.jPanelAccionesFormularioMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMesa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMesa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMesa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMesa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMesa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMesa.setText("Nuevo");
		this.jButtonModificarMesa.setText("Editar");
        this.jButtonActualizarMesa.setText("Actualizar");
        this.jButtonEliminarMesa.setText("Eliminar");
        this.jButtonCancelarMesa.setText("Cancelar");
        this.jButtonGuardarCambiosMesa.setText("Guardar");
		this.jButtonGuardarCambiosTablaMesa.setText("Guardar");
		this.jButtonCerrarMesa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMesa,"nuevo_button","Nuevo",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMesa,"modificar_button","Editar",this.mesaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMesa,"actualizar_button","Actualizar",this.mesaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMesa,"eliminar_button","Eliminar",this.mesaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMesa,"cancelar_button","Cancelar",this.mesaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMesa,"guardarcambios_button","Guardar",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMesa,"guardarcambiostabla_button","Guardar",this.mesaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMesa,"cerrar_button","Salir",this.mesaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMesa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMesa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMesa.setToolTipText("Nuevo"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMesa.setToolTipText("Editar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMesa.setToolTipText("Actualizar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMesa.setToolTipText("Eliminar)"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMesa.setToolTipText("Cancelar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMesa.setToolTipText("Guardar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMesa.setToolTipText("Guardar"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMesa.setToolTipText("Salir"+" "+MesaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMesa";
		inputMap = this.jButtonNuevoMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMesa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMesa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMesa";
		inputMap = this.jButtonActualizarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMesa"));
		
		//ELIMINAR
		sMapKey = "EliminarMesa";
		inputMap = this.jButtonEliminarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMesa"));
		
		//CANCELAR	
		sMapKey = "CancelarMesa";
		inputMap = this.jButtonCancelarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMesa"));
		
		//CERRAR		
		sMapKey = "CerrarMesa";
		inputMap = this.jButtonCerrarMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMesa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMesa";
		inputMap = this.jButtonGuardarCambiosTablaMesa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMesa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMesa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMesa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMesa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMesa.setToolTipText("Nuevo Mesa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMesa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMesa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMesa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMesa.setToolTipText("Sin Cerrar Ventana Mesa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMesa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMesa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMesa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMesa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMesa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMesa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMesa.setText("Accion");
		this.jComboBoxTiposAccionesMesa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMesa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMesa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMesa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMesa = new JLabelMe();
		
		this.jLabelAccionesMesa.setText("Acciones");		
		this.jLabelAccionesMesa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMesa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMesa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMesa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMesa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMesa=new JTabbedPane();
		this.jTabbedPaneRelacionesMesa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMesa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMesa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMesa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMesa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMesa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMesa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMesa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMesa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMesa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMesa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMesa = new GridBagLayout();
		
		this.jPanelCamposMesa.setLayout(gridaBagLayoutCamposMesa);
		this.jPanelCamposOcultosMesa.setLayout(gridaBagLayoutCamposOcultosMesa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 0;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidMesa.add(jLabelIdMesa, this.gridBagConstraintsMesa);



	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 1;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidMesa.add(jLabelidMesa, this.gridBagConstraintsMesa);


	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 0;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaMesa.add(jLabelid_empresaMesa, this.gridBagConstraintsMesa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 2;
		this.gridBagConstraintsMesa.ipadx = 0;
		this.gridBagConstraintsMesa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMesa.add(jButtonid_empresaMesaBusqueda, this.gridBagConstraintsMesa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 3;
		this.gridBagConstraintsMesa.ipadx = 0;
		this.gridBagConstraintsMesa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMesa.add(jButtonid_empresaMesaUpdate, this.gridBagConstraintsMesa);
	}

	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 1;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaMesa.add(jComboBoxid_empresaMesa, this.gridBagConstraintsMesa);


	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 0;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalMesa.add(jLabelid_sucursalMesa, this.gridBagConstraintsMesa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 2;
		this.gridBagConstraintsMesa.ipadx = 0;
		this.gridBagConstraintsMesa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMesa.add(jButtonid_sucursalMesaBusqueda, this.gridBagConstraintsMesa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 3;
		this.gridBagConstraintsMesa.ipadx = 0;
		this.gridBagConstraintsMesa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMesa.add(jButtonid_sucursalMesaUpdate, this.gridBagConstraintsMesa);
	}

	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 1;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalMesa.add(jComboBoxid_sucursalMesa, this.gridBagConstraintsMesa);


	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 0;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreMesa.add(jLabelnombreMesa, this.gridBagConstraintsMesa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 2;
		this.gridBagConstraintsMesa.ipadx = 0;
		this.gridBagConstraintsMesa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreMesa.add(jButtonnombreMesaBusqueda, this.gridBagConstraintsMesa);
	}

	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 1;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreMesa.add(jscrollPanenombreMesa, this.gridBagConstraintsMesa);


	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 0;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroMesa.add(jLabelnumeroMesa, this.gridBagConstraintsMesa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMesa = new GridBagConstraints();
		//this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = 2;
		this.gridBagConstraintsMesa.ipadx = 0;
		this.gridBagConstraintsMesa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroMesa.add(jButtonnumeroMesaBusqueda, this.gridBagConstraintsMesa);
	}

	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMesa.gridy = 0;
	this.gridBagConstraintsMesa.gridx = 1;
	this.gridBagConstraintsMesa.ipadx = 0;
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroMesa.add(jTextFieldnumeroMesa, this.gridBagConstraintsMesa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMesa.gridy = iYPanelCamposMesa;
	this.gridBagConstraintsMesa.gridx = iXPanelCamposMesa++;
	this.gridBagConstraintsMesa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMesa.add(this.jPanelidMesa, this.gridBagConstraintsMesa);



	if(iXPanelCamposMesa % 1==0) {
		iXPanelCamposMesa=0;
		iYPanelCamposMesa++;
	}
	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMesa.gridy = iYPanelCamposMesa;
	this.gridBagConstraintsMesa.gridx = iXPanelCamposMesa++;
	this.gridBagConstraintsMesa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMesa.add(this.jPanelnombreMesa, this.gridBagConstraintsMesa);



	if(iXPanelCamposMesa % 1==0) {
		iXPanelCamposMesa=0;
		iYPanelCamposMesa++;
	}
	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMesa.gridy = iYPanelCamposMesa;
	this.gridBagConstraintsMesa.gridx = iXPanelCamposMesa++;
	this.gridBagConstraintsMesa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposMesa.add(this.jPanelnumeroMesa, this.gridBagConstraintsMesa);



	if(iXPanelCamposMesa % 1==0) {
		iXPanelCamposMesa=0;
		iYPanelCamposMesa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMesa.gridy = iYPanelCamposOcultosMesa;
	this.gridBagConstraintsMesa.gridx = iXPanelCamposOcultosMesa++;
	this.gridBagConstraintsMesa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMesa.add(this.jPanelid_empresaMesa, this.gridBagConstraintsMesa);



	if(iXPanelCamposOcultosMesa % 1==0) {
		iXPanelCamposOcultosMesa=0;
		iYPanelCamposOcultosMesa++;
	}
	this.gridBagConstraintsMesa = new GridBagConstraints();
	this.gridBagConstraintsMesa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMesa.gridy = iYPanelCamposOcultosMesa;
	this.gridBagConstraintsMesa.gridx = iXPanelCamposOcultosMesa++;
	this.gridBagConstraintsMesa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMesa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosMesa.add(this.jPanelid_sucursalMesa, this.gridBagConstraintsMesa);



	if(iXPanelCamposOcultosMesa % 1==0) {
		iXPanelCamposOcultosMesa=0;
		iYPanelCamposOcultosMesa++;
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
			
		GridBagLayout gridaBagLayoutAccionesMesa= new GridBagLayout();
		this.jPanelAccionesMesa.setLayout(gridaBagLayoutAccionesMesa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMesa= new GridBagLayout();
		this.jPanelAccionesFormularioMesa.setLayout(gridaBagLayoutAccionesFormularioMesa);
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMesa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMesa.add(this.jComboBoxTiposAccionesFormularioMesa, this.gridBagConstraintsMesa);

		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMesa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMesa.add(this.jCheckBoxPostAccionNuevoMesa, this.gridBagConstraintsMesa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.mesaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMesa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMesa.add(this.jCheckBoxPostAccionSinCerrarMesa, this.gridBagConstraintsMesa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.mesaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.mesaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMesa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMesa.add(this.jCheckBoxPostAccionSinMensajeMesa, this.gridBagConstraintsMesa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx = iPosXAccion++;
			
		this.jPanelAccionesMesa.add(this.jButtonModificarMesa, this.gridBagConstraintsMesa);							

		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMesa.gridy = 0;
		this.gridBagConstraintsMesa.gridx =iPosXAccion++;
			
		this.jPanelAccionesMesa.add(this.jButtonEliminarMesa, this.gridBagConstraintsMesa);
		
			
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = 0;		
		this.gridBagConstraintsMesa.gridx = iPosXAccion++;
		
		this.jPanelAccionesMesa.add(this.jButtonActualizarMesa, this.gridBagConstraintsMesa);


		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = 0;		
		this.gridBagConstraintsMesa.gridx = iPosXAccion++;
		
		this.jPanelAccionesMesa.add(this.jButtonGuardarCambiosMesa, this.gridBagConstraintsMesa);	
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = 0;		
		this.gridBagConstraintsMesa.gridx =iPosXAccion++;
		
		this.jPanelAccionesMesa.add(this.jButtonCancelarMesa, this.gridBagConstraintsMesa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMesa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMesa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.mesaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMesa = new GridBagConstraints();						
			this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMesa.gridx = 0;		
			//this.gridBagConstraintsMesa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMesa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMesa.gridx =0;
		this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMesa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMesa, this.gridBagConstraintsMesa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MesaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMesa = new MesaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Mesa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Mesa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mesa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MesaModel mesaModel=new MesaModel(this);
			
			//SI USARA CLASE INTERNA
			//MesaModel.MesaFocusTraversalPolicy mesaFocusTraversalPolicy = mesaModel.new MesaFocusTraversalPolicy(this);
			
			//mesaFocusTraversalPolicy.setmesaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(mesaModel);
			
			
			this.jContentPaneDetalleMesa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMesa = new GridBagLayout();	
			this.jContentPaneDetalleMesa.setLayout(gridaBagLayoutDetalleMesa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMesa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsMesa = new GridBagConstraints();
				this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsMesa.gridx = 0;
					
				
				this.jContentPaneDetalleMesa.add(jTtoolBarDetalleMesa, gridBagConstraintsMesa);								
				
}
			
			this.jScrollPanelDatosEdicionMesa=   new JScrollPane(jContentPaneDetalleMesa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMesa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMesa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMesa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMesa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMesa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMesa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMesa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMesa.gridx = 0;
	        
			this.jContentPaneDetalleMesa.add(jPanelCamposMesa, gridBagConstraintsMesa);
			
			
			
			
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
						&& mesaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(this.puedeCargarPorParteCajeroTurno,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(this.puedeCargarPorParteFacturaPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(this.puedeCargarPorParteNotaCreditoPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(this.puedeCargarPorPartePedidoPuntoVenta,false,-1);
					
					if(this.mesaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMesa= new GridBagConstraints();
						this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMesa.gridx = 0;
						this.jContentPaneDetalleMesa.add(this.jTabbedPaneRelacionesMesa, this.gridBagConstraintsMesa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMesa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCajeroTurno(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMesa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMesa = new GridBagConstraints();
					this.gridBagConstraintsMesa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMesa.gridx = 0;
					
				
					this.jContentPaneDetalleMesa.add(jPanelCamposOcultosMesa, gridBagConstraintsMesa);
				
					this.jPanelCamposOcultosMesa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsMesa.gridx = 0;
	        this.gridBagConstraintsMesa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleMesa.add(this.jPanelAccionesFormularioMesa, this.gridBagConstraintsMesa);							
			
			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
	        this.gridBagConstraintsMesa.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsMesa.gridx = 0;
	        
			
			this.jContentPaneDetalleMesa.add(this.jPanelAccionesMesa, this.gridBagConstraintsMesa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMesa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMesa=   new JScrollPane(this.jPanelCamposMesa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMesa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMesa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMesa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMesa.gridx = 0;
			this.gridBagConstraintsMesa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMesa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMesa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMesa, this.gridBagConstraintsMesa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMesa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMesa, this.gridBagConstraintsMesa);			
			
			this.gridBagConstraintsMesa = new GridBagConstraints();
			this.gridBagConstraintsMesa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMesa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMesa, this.gridBagConstraintsMesa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMesa, this.gridBagConstraintsMesa);
			
			
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMesa, this.gridBagConstraintsMesa);
		
			
		this.gridBagConstraintsMesa = new GridBagConstraints();
		this.gridBagConstraintsMesa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMesa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMesa, this.gridBagConstraintsMesa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMesa;//jContentPane;
		
		return jScrollPanelDatosEdicionMesa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCajeroTurno(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cajeroturnoSessionBean=new CajeroTurnoSessionBean();
		this.cajeroturnoSessionBean.setConGuardarRelaciones(false);
		this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

		this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cajeroturnoBeanSwingJInternalFramePopup=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cajeroturnoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {

				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CajeroTurnoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cajeroturnoSessionBean.setEsGuardarRelacionado(true);

				this.cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cajeroturnoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cajeroturnoBeanSwingJInternalFrame.setcajeroturnoSessionBean(this.cajeroturnoSessionBean);

				//this.gridBagConstraintsMesa = new GridBagConstraints();
				//this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMesa.gridx = 0;
				//this.jContentPaneDetalleMesa.add(this.cajeroturnoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMesa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMesa.add("Cajero Turnos",this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMesa.setComponentAt(iIndexTab,this.cajeroturnoBeanSwingJInternalFrame.getContentPane());
				}

				//CajeroTurnoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cajeroturnoSessionBean.setEsGuardarRelacionado(false);
				this.cajeroturnoBeanSwingJInternalFrame=null;//new CajeroTurnoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cajeroturnoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCajeroTurno) {
					this.jTabbedPaneRelacionesMesa.add("Cajero Turnos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFacturaPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		this.facturapuntoventaSessionBean.setConGuardarRelaciones(true);
		this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturapuntoventaBeanSwingJInternalFramePopup=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturapuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {

				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventaSessionBean(this.facturapuntoventaSessionBean);

				//this.gridBagConstraintsMesa = new GridBagConstraints();
				//this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMesa.gridx = 0;
				//this.jContentPaneDetalleMesa.add(this.facturapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMesa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMesa.add("Factura Punto Ventas",this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMesa.setComponentAt(iIndexTab,this.facturapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.facturapuntoventaBeanSwingJInternalFrame=null;//new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaPuntoVenta) {
					this.jTabbedPaneRelacionesMesa.add("Factura Punto Ventas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.notacreditopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {

				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;
				NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.notacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.notacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaSessionBean(this.notacreditopuntoventaSessionBean);

				//this.gridBagConstraintsMesa = new GridBagConstraints();
				//this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMesa.gridx = 0;
				//this.jContentPaneDetalleMesa.add(this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMesa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMesa.add("Nota Creditos",this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMesa.setComponentAt(iIndexTab,this.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.notacreditopuntoventaBeanSwingJInternalFrame=null;//new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesMesa.add("Nota Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidopuntoventaSessionBean=new PedidoPuntoVentaSessionBean();
		this.pedidopuntoventaSessionBean.setConGuardarRelaciones(true);
		this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidopuntoventaBeanSwingJInternalFramePopup=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {

				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MesaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidopuntoventaBeanSwingJInternalFrame.setpedidopuntoventaSessionBean(this.pedidopuntoventaSessionBean);

				//this.gridBagConstraintsMesa = new GridBagConstraints();
				//this.gridBagConstraintsMesa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMesa.gridx = 0;
				//this.jContentPaneDetalleMesa.add(this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMesa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMesa.add("Pedido Punto Ventas",this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMesa.setComponentAt(iIndexTab,this.pedidopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.pedidopuntoventaBeanSwingJInternalFrame=null;//new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoPuntoVenta) {
					this.jTabbedPaneRelacionesMesa.add("Pedido Punto Ventas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPedidoPuntoVentaBeanSwingJInternalFrame(List<Mesa> mesas,Mesa mesa,PedidoPuntoVentaBeanSwingJInternalFrame pedidopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidopuntoventaBeanSwingJInternalFrame=new PedidoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidopuntoventaBeanSwingJInternalFrame.getPedidoPuntoVentaLogic().setConnexion(this.mesaLogic.getConnexion());

					pedidopuntoventaBeanSwingJInternalFrame.setmesasForeignKey(mesas);
					pedidopuntoventaBeanSwingJInternalFrame.setmesaForeignKey(mesa);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
					pedidopuntoventaBeanSwingJInternalFrame.pedidopuntoventaSessionBean.setlidMesaActual(mesa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoPuntoVenta(pedidopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaMesa(true);
					pedidopuntoventaBeanSwingJInternalFrame.setid_mesaFK_IdMesa(mesa.getId());

					if(!this.conCargarFormDetalle) {
						pedidopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameMesaForeignKey(mesa,1,false,true,true);
					pedidopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdMesa");
					pedidopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMesa");
					pedidopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoPuntoVenta(true);
					pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoPuntoVenta("n",pedidopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("relacionado");
					} else {
						pedidopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoPuntoVenta("no_relacionado");
					}

					pedidopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaPuntoVentaBeanSwingJInternalFrame(List<Mesa> mesas,Mesa mesa,FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturapuntoventaBeanSwingJInternalFrame.getFacturaPuntoVentaLogic().setConnexion(this.mesaLogic.getConnexion());

					facturapuntoventaBeanSwingJInternalFrame.setmesasForeignKey(mesas);
					facturapuntoventaBeanSwingJInternalFrame.setmesaForeignKey(mesa);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
					facturapuntoventaBeanSwingJInternalFrame.facturapuntoventaSessionBean.setlidMesaActual(mesa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaPuntoVenta(facturapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaMesa(true);
					facturapuntoventaBeanSwingJInternalFrame.setid_mesaFK_IdMesa(mesa.getId());

					if(!this.conCargarFormDetalle) {
						facturapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameMesaForeignKey(mesa,1,false,true,true);
					facturapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdMesa");
					facturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMesa");
					facturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaPuntoVenta(true);
					facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaPuntoVenta("n",facturapuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturapuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturapuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					facturapuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("relacionado");
					} else {
						facturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaPuntoVenta("no_relacionado");
					}

					facturapuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<Mesa> mesas,Mesa mesa,NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//notacreditopuntoventaBeanSwingJInternalFrame=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					notacreditopuntoventaBeanSwingJInternalFrame.getNotaCreditoPuntoVentaLogic().setConnexion(this.mesaLogic.getConnexion());

					notacreditopuntoventaBeanSwingJInternalFrame.setmesasForeignKey(mesas);
					notacreditopuntoventaBeanSwingJInternalFrame.setmesaForeignKey(mesa);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
					notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setlidMesaActual(mesa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					notacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyNotaCreditoPuntoVenta(notacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaMesa(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setid_mesaFK_IdMesa(mesa.getId());

					if(!this.conCargarFormDetalle) {
						notacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					notacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameMesaForeignKey(mesa,1,false,true,true);
					notacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					notacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdMesa");
					notacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMesa");
					notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(true);
					notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNotaCreditoPuntoVenta("n",notacreditopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, notacreditopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					notacreditopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("relacionado");
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");
					}

					notacreditopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionNotaCreditoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarCajeroTurnoBeanSwingJInternalFrame(List<Mesa> mesas,Mesa mesa,CajeroTurnoBeanSwingJInternalFrame cajeroturnoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cajeroturnoBeanSwingJInternalFrame=new CajeroTurnoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cajeroturnoBeanSwingJInternalFrame.getCajeroTurnoLogic().setConnexion(this.mesaLogic.getConnexion());

					cajeroturnoBeanSwingJInternalFrame.setmesasForeignKey(mesas);
					cajeroturnoBeanSwingJInternalFrame.setmesaForeignKey(mesa);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setisBusquedaDesdeForeignKeySesionMesa(true);
					cajeroturnoBeanSwingJInternalFrame.cajeroturnoSessionBean.setlidMesaActual(mesa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cajeroturnoBeanSwingJInternalFrame.cargarCombosForeignKeyCajeroTurno(cajeroturnoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cajeroturnoBeanSwingJInternalFrame.setVisibilidadBusquedasParaMesa(true);
					cajeroturnoBeanSwingJInternalFrame.setid_mesaFK_IdMesa(mesa.getId());

					if(!this.conCargarFormDetalle) {
						cajeroturnoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cajeroturnoBeanSwingJInternalFrame.setSelectedItemCombosFrameMesaForeignKey(mesa,1,false,true,true);
					cajeroturnoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cajeroturnoBeanSwingJInternalFrame.procesarBusqueda("FK_IdMesa");
					cajeroturnoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMesa");
					cajeroturnoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajeroTurno(true);
					cajeroturnoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCajeroTurno("n",cajeroturnoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cajeroturnoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cajeroturnoBeanSwingJInternalFrame.setAutoscrolls(true);
					cajeroturnoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("relacionado");
					} else {
						cajeroturnoBeanSwingJInternalFrame.actualizarEstadoPanelsCajeroTurno("no_relacionado");
					}

					cajeroturnoBeanSwingJInternalFrame.getjButtonRecargarInformacionCajeroTurno().setVisible(false);

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
