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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.ZonaConstantesFunciones;

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
public class ZonaDetalleFormJInternalFrame extends ZonaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleZona;
	
	protected JMenuBar jmenuBarDetalleZona;
	
	protected JMenu jmenuDetalleZona;
	protected JMenu jmenuDetalleArchivoZona;
	protected JMenu jmenuDetalleAccionesZona;
	protected JMenu jmenuDetalleDatosZona;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutZona;	
	protected GridBagConstraints gridBagConstraintsZona;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ZonaBeanSwingJInternalFrameAdditional jInternalFrameDetalleZona;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public ZonaSessionBean zonaSessionBean;
	
	

	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame=null;
	public SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteSubCliente=false;
	public SubClienteSessionBean subclienteSessionBean;

	public VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=null;
	public VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVendedor=false;
	public VendedorSessionBean vendedorSessionBean;

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFrame=null;
	public VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteVendedorZona=false;
	public VendedorZonaSessionBean vendedorzonaSessionBean;

	public PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame=null;
	public PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentas=false;
	public PresupuestoVentasSessionBean presupuestoventasSessionBean;

	public PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame=null;
	public PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePresupuestoVentasLineas=false;
	public PresupuestoVentasLineasSessionBean presupuestoventaslineasSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public ZonaLogic zonaLogic;
	
	public JScrollPane jScrollPanelDatosZona;
	public JScrollPane jScrollPanelDatosEdicionZona;
	public JScrollPane jScrollPanelDatosGeneralZona;
	
	protected JPanel jPanelCamposZona;    
	protected JPanel jPanelCamposOcultosZona;    	
	protected JPanel jPanelAccionesZona;
	protected JPanel jPanelAccionesFormularioZona;
    
	
	
	protected Integer iXPanelCamposZona=0;
	protected Integer iYPanelCamposZona=0;
	
	protected Integer iXPanelCamposOcultosZona=0;
	protected Integer iYPanelCamposOcultosZona=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoZona;
	public JButton jButtonModificarZona;
	public JButton jButtonActualizarZona;
    public JButton jButtonEliminarZona;
	public JButton jButtonCancelarZona;
    public JButton jButtonGuardarCambiosZona;
	public JButton jButtonGuardarCambiosTablaZona;
	protected JButton jButtonCerrarZona;
	
	
	protected JButton jButtonProcesarInformacionZona;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoZona;
	protected JCheckBox jCheckBoxPostAccionSinCerrarZona;
	protected JCheckBox jCheckBoxPostAccionSinMensajeZona;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarZona;
	protected JButton jButtonModificarToolBarZona;
	protected JButton jButtonActualizarToolBarZona;
    protected JButton jButtonEliminarToolBarZona;
	protected JButton jButtonCancelarToolBarZona;
    protected JButton jButtonGuardarCambiosToolBarZona;
	protected JButton jButtonGuardarCambiosTablaToolBarZona;
	protected JButton jButtonMostrarOcultarTablaToolBarZona;
	protected JButton jButtonCerrarToolBarZona;
	
	protected JButton jButtonProcesarInformacionToolBarZona;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoZona;
	protected JMenuItem jMenuItemModificarZona;
	protected JMenuItem jMenuItemActualizarZona;
    protected JMenuItem jMenuItemEliminarZona;
	protected JMenuItem jMenuItemCancelarZona;
    protected JMenuItem jMenuItemGuardarCambiosZona;
	protected JMenuItem jMenuItemGuardarCambiosTablaZona;
	protected JMenuItem jMenuItemCerrarZona;
	protected JMenuItem jMenuItemDetalleCerrarZona;
	protected JMenuItem jMenuItemDetalleMostarOcultarZona;
	
	protected JMenuItem jMenuItemProcesarInformacionZona;
	protected JMenuItem jMenuItemNuevoGuardarCambiosZona;
	protected JMenuItem jMenuItemMostrarOcultarZona;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesZona;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesZona;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesZona;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioZona;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidZona;
	public JLabel jLabelIdZona;
	public JLabel jLabelidZona;
	public JButton jButtonidZonaBusqueda= new JButtonMe();

	public JPanel jPanelnombreZona;
	public JLabel jLabelnombreZona;
	public JTextField jTextFieldnombreZona;
	public JButton jButtonnombreZonaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaZona;
	public JLabel jLabelid_empresaZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaZona;
	public JButton jButtonid_empresaZona= new JButtonMe();
	public JButton jButtonid_empresaZonaUpdate= new JButtonMe();
	public JButton jButtonid_empresaZonaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalZona;
	public JLabel jLabelid_sucursalZona;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalZona;
	public JButton jButtonid_sucursalZona= new JButtonMe();
	public JButton jButtonid_sucursalZonaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalZonaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesZona;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ZonaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposZona=new JPanel();
				this.jPanelAccionesFormularioZona=new JPanel();
				this.jmenuBarDetalleZona=new JMenuBar();
				this.jTtoolBarDetalleZona=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ZonaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ZonaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Zona No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarZona() {
		return this.jButtonActualizarToolBarZona;
	}
	
	public JButton getjButtonEliminarToolBarZona() {
		return this.jButtonEliminarToolBarZona;
	}
	
	public JButton getjButtonCancelarToolBarZona() {
		return this.jButtonCancelarToolBarZona;
	}		
	
	public JButton getjButtonProcesarInformacionZona() {
		return this.jButtonProcesarInformacionZona;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionZona)	{
		this.jButtonProcesarInformacionZona = jButtonProcesarInformacionZona;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesZona() {
		return this.jComboBoxTiposAccionesZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesZona(
			JComboBox jComboBoxTiposRelacionesZona) {
		this.jComboBoxTiposRelacionesZona = jComboBoxTiposRelacionesZona;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesZona(
			JComboBox jComboBoxTiposAccionesZona) {
		this.jComboBoxTiposAccionesZona = jComboBoxTiposAccionesZona;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioZona() {
		return this.jComboBoxTiposAccionesFormularioZona;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioZona(
			JComboBox jComboBoxTiposAccionesFormularioZona) {
		this.jComboBoxTiposAccionesFormularioZona = jComboBoxTiposAccionesFormularioZona;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.zonaSessionBean=new ZonaSessionBean();
		
		this.zonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.zonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.zonaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.subclienteSessionBean=new SubClienteSessionBean();
		//this.vendedorSessionBean=new VendedorSessionBean();
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		//this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		//this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ZonaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ZonaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Zona MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
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
	
		ZonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleZona= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarZona=new JButtonMe();
				this.jButtonModificarToolBarZona=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarZona,this.jTtoolBarDetalleZona,
							"actualizar","actualizar","Actualizar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarZona,this.jTtoolBarDetalleZona,
							"eliminar","eliminar","Eliminar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarZona,this.jTtoolBarDetalleZona,
							"cancelar","cancelar","Cancelar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarZona=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarZona,this.jTtoolBarDetalleZona,
							"guardarcambios","guardarcambios","Guardar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarZona,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarZona,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarZona,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleZona=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleZona=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoZona=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesZona=new JMenuMe("Acciones");
		this.jmenuDetalleDatosZona=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoZona= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoZona.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoZona,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarZona= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarZona.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarZona,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarZona= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarZona.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarZona,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarZona= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarZona.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarZona,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarZona= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarZona.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarZona,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosZona= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosZona.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosZona,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarZona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarZona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarZona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarZona= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarZona.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarZona,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarZona,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarZona= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarZona.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarZona,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarZona, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoZona.add(this.jMenuItemDetalleCerrarZona);
		
		this.jmenuDetalleAccionesZona.add(this.jMenuItemActualizarZona);
		this.jmenuDetalleAccionesZona.add(this.jMenuItemEliminarZona);
		this.jmenuDetalleAccionesZona.add(this.jMenuItemCancelarZona);		
		
		//this.jmenuDetalleDatosZona.add(this.jMenuItemDetalleAbrirOrderByZona);				
		this.jmenuDetalleDatosZona.add(this.jMenuItemDetalleMostarOcultarZona);				
				
		//this.jmenuDetalleAccionesZona.add(this.jMenuItemGuardarCambiosZona);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosZona, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleZona.add(this.jmenuDetalleArchivoZona);		
		this.jmenuBarDetalleZona.add(this.jmenuDetalleAccionesZona);		
		this.jmenuBarDetalleZona.add(this.jmenuDetalleDatosZona);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleZona, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleZona.add(this.jmenuDetalleZona);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleZona);				
	}
	
	
	public void inicializarElementosCamposZona() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdZona = new JLabelMe();
		jLabelIdZona.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdZona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidZona = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidZona.setToolTipText(ZonaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutZona= new GridBagLayout();

		this.jPanelidZona.setLayout(this.gridaBagLayoutZona);

		jLabelidZona = new JLabel();
		jLabelidZona.setText("Id");

		jLabelidZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreZona = new JLabelMe();
		this.jLabelnombreZona.setText(""+ZonaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreZona.setToolTipText("Nombre");
		this.jLabelnombreZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreZona.setToolTipText(ZonaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutZona = new GridBagLayout();
		this.jPanelnombreZona.setLayout(this.gridaBagLayoutZona);


		jTextFieldnombreZona= new JTextFieldMe();

		jTextFieldnombreZona.setEnabled(false);
		jTextFieldnombreZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreZona,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreZonaBusqueda= new JButtonMe();
		this.jButtonnombreZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreZonaBusqueda.setText("U");
		this.jButtonnombreZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreZonaBusqueda"));

		if(this.zonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreZonaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysZona() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaZona = new JLabelMe();
		this.jLabelid_empresaZona.setText(""+ZonaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaZona.setToolTipText("Empresa");
		this.jLabelid_empresaZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaZona.setToolTipText(ZonaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutZona = new GridBagLayout();
		this.jPanelid_empresaZona.setLayout(this.gridaBagLayoutZona);


		jComboBoxid_empresaZona= new JComboBoxMe();
		jComboBoxid_empresaZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaZona,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaZona.setEnabled(false);

		this.jButtonid_empresaZona= new JButtonMe();
		this.jButtonid_empresaZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaZona.setText("Buscar");
		this.jButtonid_empresaZona.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaZona.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaZona,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaZona"));

		this.jButtonid_empresaZonaBusqueda= new JButtonMe();
		this.jButtonid_empresaZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaZonaBusqueda.setText("U");
		this.jButtonid_empresaZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaZonaBusqueda"));

		if(this.zonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaZonaBusqueda.setVisible(false);		}

		this.jButtonid_empresaZonaUpdate= new JButtonMe();
		this.jButtonid_empresaZonaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaZonaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaZonaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaZonaUpdate.setText("U");
		this.jButtonid_empresaZonaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaZonaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaZonaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaZonaUpdate"));



					
		this.jLabelid_sucursalZona = new JLabelMe();
		this.jLabelid_sucursalZona.setText(""+ZonaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalZona.setToolTipText("Sucursal");
		this.jLabelid_sucursalZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalZona,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalZona=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalZona.setToolTipText(ZonaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutZona = new GridBagLayout();
		this.jPanelid_sucursalZona.setLayout(this.gridaBagLayoutZona);


		jComboBoxid_sucursalZona= new JComboBoxMe();
		jComboBoxid_sucursalZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalZona,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalZona.setEnabled(false);

		this.jButtonid_sucursalZona= new JButtonMe();
		this.jButtonid_sucursalZona.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalZona.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalZona.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalZona.setText("Buscar");
		this.jButtonid_sucursalZona.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalZona.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalZona,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalZona"));

		this.jButtonid_sucursalZonaBusqueda= new JButtonMe();
		this.jButtonid_sucursalZonaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalZonaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalZonaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalZonaBusqueda.setText("U");
		this.jButtonid_sucursalZonaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalZonaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalZonaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalZonaBusqueda"));

		if(this.zonaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalZonaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalZonaUpdate= new JButtonMe();
		this.jButtonid_sucursalZonaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalZonaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalZonaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalZonaUpdate.setText("U");
		this.jButtonid_sucursalZonaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalZonaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalZonaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalZona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalZona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalZonaUpdate"));



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
		//this.jInternalFrameDetalleZona = new ZonaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Zona DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutZona= new GridBagLayout();
		

		
		String sToolTipZona="";
		sToolTipZona=ZonaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipZona+="(Seguridad.Zona)";
		}
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			sToolTipZona+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoZona = new JButtonMe();
		this.jButtonModificarZona = new JButtonMe();
        this.jButtonActualizarZona = new JButtonMe();
        this.jButtonEliminarZona = new JButtonMe();
        this.jButtonCancelarZona = new JButtonMe();
        this.jButtonGuardarCambiosZona = new JButtonMe();
		this.jButtonGuardarCambiosTablaZona = new JButtonMe();
		this.jButtonCerrarZona = new JButtonMe();
		
		this.jScrollPanelDatosZona = new JScrollPane();   
        this.jScrollPanelDatosEdicionZona = new JScrollPane();
		this.jScrollPanelDatosGeneralZona = new JScrollPane();
				
		
		
		this.jPanelCamposZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Zona";
		
		if(!this.zonaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Zonas" + this.sPath));
		} else {
			this.jScrollPanelDatosZona.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposZona.setName("jPanelCamposZona"); 

		this.jPanelCamposOcultosZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosZona.setName("jPanelCamposOcultosZona"); 

        this.jPanelAccionesZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesZona.setToolTipText("Acciones");
        this.jPanelAccionesZona.setName("Acciones"); 

		this.jPanelAccionesFormularioZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioZona.setToolTipText("Acciones");
        this.jPanelAccionesFormularioZona.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosZona, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposZona, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosZona, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioZona, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoZona.setText("Nuevo");
		this.jButtonModificarZona.setText("Editar");
        this.jButtonActualizarZona.setText("Actualizar");
        this.jButtonEliminarZona.setText("Eliminar");
        this.jButtonCancelarZona.setText("Cancelar");
        this.jButtonGuardarCambiosZona.setText("Guardar");
		this.jButtonGuardarCambiosTablaZona.setText("Guardar");
		this.jButtonCerrarZona.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoZona,"nuevo_button","Nuevo",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarZona,"modificar_button","Editar",this.zonaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarZona,"actualizar_button","Actualizar",this.zonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarZona,"eliminar_button","Eliminar",this.zonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarZona,"cancelar_button","Cancelar",this.zonaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosZona,"guardarcambios_button","Guardar",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaZona,"guardarcambiostabla_button","Guardar",this.zonaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarZona,"cerrar_button","Salir",this.zonaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaZona, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarZona, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarZona, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarZona, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoZona.setToolTipText("Nuevo"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarZona.setToolTipText("Editar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarZona.setToolTipText("Actualizar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarZona.setToolTipText("Eliminar)"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarZona.setToolTipText("Cancelar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosZona.setToolTipText("Guardar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaZona.setToolTipText("Guardar"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarZona.setToolTipText("Salir"+" "+ZonaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoZona";
		inputMap = this.jButtonNuevoZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoZona.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoZona"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarZona";
		inputMap = this.jButtonActualizarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarZona"));
		
		//ELIMINAR
		sMapKey = "EliminarZona";
		inputMap = this.jButtonEliminarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarZona"));
		
		//CANCELAR	
		sMapKey = "CancelarZona";
		inputMap = this.jButtonCancelarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarZona"));
		
		//CERRAR		
		sMapKey = "CerrarZona";
		inputMap = this.jButtonCerrarZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarZona"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaZona";
		inputMap = this.jButtonGuardarCambiosTablaZona.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaZona.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaZona"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoZona = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoZona.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoZona.setToolTipText("Nuevo Zona");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoZona, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarZona = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarZona.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarZona.setToolTipText("Sin Cerrar Ventana Zona");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarZona, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeZona = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeZona.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeZona.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeZona, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesZona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesZona.setText("Accion");
		this.jComboBoxTiposAccionesZona.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioZona = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioZona.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioZona.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesZona = new JLabelMe();
		
		this.jLabelAccionesZona.setText("Acciones");		
		this.jLabelAccionesZona.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesZona.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesZona.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposZona();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysZona();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesZona=new JTabbedPane();
		this.jTabbedPaneRelacionesZona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesZona,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesZona.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesZona.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesZona.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesZona, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioZona.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioZona.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioZona.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioZona, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposZona = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosZona = new GridBagLayout();
		
		this.jPanelCamposZona.setLayout(gridaBagLayoutCamposZona);
		this.jPanelCamposOcultosZona.setLayout(gridaBagLayoutCamposOcultosZona);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 0;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidZona.add(jLabelIdZona, this.gridBagConstraintsZona);



	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 1;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidZona.add(jLabelidZona, this.gridBagConstraintsZona);


	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 0;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaZona.add(jLabelid_empresaZona, this.gridBagConstraintsZona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsZona = new GridBagConstraints();
		//this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = 2;
		this.gridBagConstraintsZona.ipadx = 0;
		this.gridBagConstraintsZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaZona.add(jButtonid_empresaZonaBusqueda, this.gridBagConstraintsZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsZona = new GridBagConstraints();
		//this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = 3;
		this.gridBagConstraintsZona.ipadx = 0;
		this.gridBagConstraintsZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaZona.add(jButtonid_empresaZonaUpdate, this.gridBagConstraintsZona);
	}

	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 1;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaZona.add(jComboBoxid_empresaZona, this.gridBagConstraintsZona);


	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 0;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalZona.add(jLabelid_sucursalZona, this.gridBagConstraintsZona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsZona = new GridBagConstraints();
		//this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = 2;
		this.gridBagConstraintsZona.ipadx = 0;
		this.gridBagConstraintsZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalZona.add(jButtonid_sucursalZonaBusqueda, this.gridBagConstraintsZona);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsZona = new GridBagConstraints();
		//this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = 3;
		this.gridBagConstraintsZona.ipadx = 0;
		this.gridBagConstraintsZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalZona.add(jButtonid_sucursalZonaUpdate, this.gridBagConstraintsZona);
	}

	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 1;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalZona.add(jComboBoxid_sucursalZona, this.gridBagConstraintsZona);


	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 0;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreZona.add(jLabelnombreZona, this.gridBagConstraintsZona);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsZona = new GridBagConstraints();
		//this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = 2;
		this.gridBagConstraintsZona.ipadx = 0;
		this.gridBagConstraintsZona.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreZona.add(jButtonnombreZonaBusqueda, this.gridBagConstraintsZona);
	}

	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsZona.gridy = 0;
	this.gridBagConstraintsZona.gridx = 1;
	this.gridBagConstraintsZona.ipadx = 0;
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreZona.add(jTextFieldnombreZona, this.gridBagConstraintsZona);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsZona.gridy = iYPanelCamposZona;
	this.gridBagConstraintsZona.gridx = iXPanelCamposZona++;
	this.gridBagConstraintsZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposZona.add(this.jPanelidZona, this.gridBagConstraintsZona);



	if(iXPanelCamposZona % 1==0) {
		iXPanelCamposZona=0;
		iYPanelCamposZona++;
	}
	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsZona.gridy = iYPanelCamposZona;
	this.gridBagConstraintsZona.gridx = iXPanelCamposZona++;
	this.gridBagConstraintsZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposZona.add(this.jPanelnombreZona, this.gridBagConstraintsZona);



	if(iXPanelCamposZona % 1==0) {
		iXPanelCamposZona=0;
		iYPanelCamposZona++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsZona.gridy = iYPanelCamposOcultosZona;
	this.gridBagConstraintsZona.gridx = iXPanelCamposOcultosZona++;
	this.gridBagConstraintsZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosZona.add(this.jPanelid_empresaZona, this.gridBagConstraintsZona);



	if(iXPanelCamposOcultosZona % 1==0) {
		iXPanelCamposOcultosZona=0;
		iYPanelCamposOcultosZona++;
	}
	this.gridBagConstraintsZona = new GridBagConstraints();
	this.gridBagConstraintsZona.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsZona.gridy = iYPanelCamposOcultosZona;
	this.gridBagConstraintsZona.gridx = iXPanelCamposOcultosZona++;
	this.gridBagConstraintsZona.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsZona.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosZona.add(this.jPanelid_sucursalZona, this.gridBagConstraintsZona);



	if(iXPanelCamposOcultosZona % 1==0) {
		iXPanelCamposOcultosZona=0;
		iYPanelCamposOcultosZona++;
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
			
		GridBagLayout gridaBagLayoutAccionesZona= new GridBagLayout();
		this.jPanelAccionesZona.setLayout(gridaBagLayoutAccionesZona);
		
		GridBagLayout gridaBagLayoutAccionesFormularioZona= new GridBagLayout();
		this.jPanelAccionesFormularioZona.setLayout(gridaBagLayoutAccionesFormularioZona);
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsZona.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioZona.add(this.jComboBoxTiposAccionesFormularioZona, this.gridBagConstraintsZona);

		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsZona.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioZona.add(this.jCheckBoxPostAccionNuevoZona, this.gridBagConstraintsZona);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.zonaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsZona.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioZona.add(this.jCheckBoxPostAccionSinCerrarZona, this.gridBagConstraintsZona);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.zonaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.zonaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsZona.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioZona.add(this.jCheckBoxPostAccionSinMensajeZona, this.gridBagConstraintsZona);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx = iPosXAccion++;
			
		this.jPanelAccionesZona.add(this.jButtonModificarZona, this.gridBagConstraintsZona);							

		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsZona.gridy = 0;
		this.gridBagConstraintsZona.gridx =iPosXAccion++;
			
		this.jPanelAccionesZona.add(this.jButtonEliminarZona, this.gridBagConstraintsZona);
		
			
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = 0;		
		this.gridBagConstraintsZona.gridx = iPosXAccion++;
		
		this.jPanelAccionesZona.add(this.jButtonActualizarZona, this.gridBagConstraintsZona);


		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = 0;		
		this.gridBagConstraintsZona.gridx = iPosXAccion++;
		
		this.jPanelAccionesZona.add(this.jButtonGuardarCambiosZona, this.gridBagConstraintsZona);	
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = 0;		
		this.gridBagConstraintsZona.gridx =iPosXAccion++;
		
		this.jPanelAccionesZona.add(this.jButtonCancelarZona, this.gridBagConstraintsZona);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutZona = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutZona);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.zonaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsZona = new GridBagConstraints();						
			this.gridBagConstraintsZona.gridy = iGridyPrincipal++;
			this.gridBagConstraintsZona.gridx = 0;		
			//this.gridBagConstraintsZona.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsZona.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsZona.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy =iGridyPrincipal++;
		this.gridBagConstraintsZona.gridx =0;
		this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsZona.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosZona, this.gridBagConstraintsZona);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ZonaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleZona = new ZonaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Zona DATOS");
			
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
			
	        //this.setTitle("[FOR] - Zona DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Zona Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ZonaModel zonaModel=new ZonaModel(this);
			
			//SI USARA CLASE INTERNA
			//ZonaModel.ZonaFocusTraversalPolicy zonaFocusTraversalPolicy = zonaModel.new ZonaFocusTraversalPolicy(this);
			
			//zonaFocusTraversalPolicy.setzonaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(zonaModel);
			
			
			this.jContentPaneDetalleZona = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleZona = new GridBagLayout();	
			this.jContentPaneDetalleZona.setLayout(gridaBagLayoutDetalleZona);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosZona = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsZona = new GridBagConstraints();
				this.gridBagConstraintsZona.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsZona.gridx = 0;
					
				
				this.jContentPaneDetalleZona.add(jTtoolBarDetalleZona, gridBagConstraintsZona);								
				
}
			
			this.jScrollPanelDatosEdicionZona=   new JScrollPane(jContentPaneDetalleZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralZona=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			
			
	        this.gridBagConstraintsZona.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsZona.gridx = 0;
	        
			this.jContentPaneDetalleZona.add(jPanelCamposZona, gridBagConstraintsZona);
			
			
			
			
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
						&& zonaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(this.puedeCargarPorPartePresupuestoVentas,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(this.puedeCargarPorPartePresupuestoVentasLineas,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(this.puedeCargarPorParteSubCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedor(this.puedeCargarPorParteVendedor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedorZona(this.puedeCargarPorParteVendedorZona,false,-1);
					
					if(this.zonaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsZona= new GridBagConstraints();
						this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
						this.gridBagConstraintsZona.gridx = 0;
						this.jContentPaneDetalleZona.add(this.jTabbedPaneRelacionesZona, this.gridBagConstraintsZona);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesZona.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentas(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameSubCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameVendedorZona(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosZona.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsZona = new GridBagConstraints();
					this.gridBagConstraintsZona.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsZona.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsZona.gridx = 0;
					
				
					this.jContentPaneDetalleZona.add(jPanelCamposOcultosZona, gridBagConstraintsZona);
				
					this.jPanelCamposOcultosZona.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridyRelaciones++;//19;		
	        this.gridBagConstraintsZona.gridx = 0;
	        this.gridBagConstraintsZona.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleZona.add(this.jPanelAccionesFormularioZona, this.gridBagConstraintsZona);							
			
			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
	        this.gridBagConstraintsZona.gridy = iGridyRelaciones;//19;		
	        this.gridBagConstraintsZona.gridx = 0;
	        
			
			this.jContentPaneDetalleZona.add(this.jPanelAccionesZona, this.gridBagConstraintsZona);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionZona);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionZona=   new JScrollPane(this.jPanelCamposZona,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionZona.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionZona.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionZona.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsZona.gridx = 0;
			this.gridBagConstraintsZona.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsZona.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsZona.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionZona, this.gridBagConstraintsZona);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsZona.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioZona, this.gridBagConstraintsZona);			
			
			this.gridBagConstraintsZona = new GridBagConstraints();
			this.gridBagConstraintsZona.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsZona.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesZona, this.gridBagConstraintsZona);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposZona, this.gridBagConstraintsZona);
			
			
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosZona, this.gridBagConstraintsZona);
		
			
		this.gridBagConstraintsZona = new GridBagConstraints();
		this.gridBagConstraintsZona.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsZona.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesZona, this.gridBagConstraintsZona);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralZona;//jContentPane;
		
		return jScrollPanelDatosEdicionZona;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsZona = new GridBagConstraints();
				//this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsZona.gridx = 0;
				//this.jContentPaneDetalleZona.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsZona);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesZona.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesZona.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesZona.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentas(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventasSessionBean=new PresupuestoVentasSessionBean();
		this.presupuestoventasSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventasSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventasBeanSwingJInternalFrame=null;//new PresupuestoVentasBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventasBeanSwingJInternalFramePopup=new PresupuestoVentasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventasBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventasSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventasBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventasBeanSwingJInternalFrame.setpresupuestoventasSessionBean(this.presupuestoventasSessionBean);

				//this.gridBagConstraintsZona = new GridBagConstraints();
				//this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsZona.gridx = 0;
				//this.jContentPaneDetalleZona.add(this.presupuestoventasBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsZona);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesZona.add("Presupuesto Ventases",this.presupuestoventasBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesZona.setComponentAt(iIndexTab,this.presupuestoventasBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventasSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventasBeanSwingJInternalFrame=null;//new PresupuestoVentasBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventasSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentas) {
					this.jTabbedPaneRelacionesZona.add("Presupuesto Ventases",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePresupuestoVentasLineas(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.presupuestoventaslineasSessionBean=new PresupuestoVentasLineasSessionBean();
		this.presupuestoventaslineasSessionBean.setConGuardarRelaciones(false);
		this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);

		this.presupuestoventaslineasBeanSwingJInternalFrame=null;//new PresupuestoVentasLineasBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.presupuestoventaslineasBeanSwingJInternalFramePopup=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.presupuestoventaslineasBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {

				PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PresupuestoVentasLineasJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(true);

				this.presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.presupuestoventaslineasBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.presupuestoventaslineasBeanSwingJInternalFrame.setpresupuestoventaslineasSessionBean(this.presupuestoventaslineasSessionBean);

				//this.gridBagConstraintsZona = new GridBagConstraints();
				//this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsZona.gridx = 0;
				//this.jContentPaneDetalleZona.add(this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsZona);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesZona.add("Presupuesto Ventas_lineases",this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesZona.setComponentAt(iIndexTab,this.presupuestoventaslineasBeanSwingJInternalFrame.getContentPane());
				}

				//PresupuestoVentasLineasJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.presupuestoventaslineasSessionBean.setEsGuardarRelacionado(false);
				this.presupuestoventaslineasBeanSwingJInternalFrame=null;//new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.presupuestoventaslineasSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePresupuestoVentasLineas) {
					this.jTabbedPaneRelacionesZona.add("Presupuesto Ventas_lineases",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameSubCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.subclienteSessionBean=new SubClienteSessionBean();
		this.subclienteSessionBean.setConGuardarRelaciones(false);
		this.subclienteSessionBean.setEsGuardarRelacionado(true);

		this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.subclienteBeanSwingJInternalFramePopup=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.subclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {

				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
				SubClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.subclienteSessionBean.setEsGuardarRelacionado(true);

				this.subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.subclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.subclienteBeanSwingJInternalFrame.setsubclienteSessionBean(this.subclienteSessionBean);

				//this.gridBagConstraintsZona = new GridBagConstraints();
				//this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsZona.gridx = 0;
				//this.jContentPaneDetalleZona.add(this.subclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsZona);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesZona.add("Sub Clientes",this.subclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesZona.setComponentAt(iIndexTab,this.subclienteBeanSwingJInternalFrame.getContentPane());
				}

				//SubClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.subclienteSessionBean.setEsGuardarRelacionado(false);
				this.subclienteBeanSwingJInternalFrame=null;//new SubClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.subclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteSubCliente) {
					this.jTabbedPaneRelacionesZona.add("Sub Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVendedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vendedorSessionBean=new VendedorSessionBean();
		this.vendedorSessionBean.setConGuardarRelaciones(false);
		this.vendedorSessionBean.setEsGuardarRelacionado(true);

		this.vendedorBeanSwingJInternalFrame=null;//new VendedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vendedorBeanSwingJInternalFramePopup=new VendedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vendedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vendedorSessionBean.getEsGuardarRelacionado()) {

				VendedorJInternalFrame.STIPO_TAMANIO_GENERAL=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
				VendedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vendedorSessionBean.setEsGuardarRelacionado(true);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vendedorBeanSwingJInternalFrame.setvendedorSessionBean(this.vendedorSessionBean);

				//this.gridBagConstraintsZona = new GridBagConstraints();
				//this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsZona.gridx = 0;
				//this.jContentPaneDetalleZona.add(this.vendedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsZona);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesZona.add("Vendedores",this.vendedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesZona.setComponentAt(iIndexTab,this.vendedorBeanSwingJInternalFrame.getContentPane());
				}

				//VendedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vendedorSessionBean.setEsGuardarRelacionado(false);
				this.vendedorBeanSwingJInternalFrame=null;//new VendedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vendedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVendedor) {
					this.jTabbedPaneRelacionesZona.add("Vendedores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameVendedorZona(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.vendedorzonaSessionBean=new VendedorZonaSessionBean();
		this.vendedorzonaSessionBean.setConGuardarRelaciones(false);
		this.vendedorzonaSessionBean.setEsGuardarRelacionado(true);

		this.vendedorzonaBeanSwingJInternalFrame=null;//new VendedorZonaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.vendedorzonaBeanSwingJInternalFramePopup=new VendedorZonaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.vendedorzonaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {

				VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;
				VendedorZonaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ZonaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.vendedorzonaSessionBean.setEsGuardarRelacionado(true);

				this.vendedorzonaBeanSwingJInternalFrame=new VendedorZonaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.vendedorzonaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.vendedorzonaBeanSwingJInternalFrame.setvendedorzonaSessionBean(this.vendedorzonaSessionBean);

				//this.gridBagConstraintsZona = new GridBagConstraints();
				//this.gridBagConstraintsZona.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsZona.gridx = 0;
				//this.jContentPaneDetalleZona.add(this.vendedorzonaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsZona);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesZona.add("Vendedor Zonas",this.vendedorzonaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesZona.setComponentAt(iIndexTab,this.vendedorzonaBeanSwingJInternalFrame.getContentPane());
				}

				//VendedorZonaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.vendedorzonaSessionBean.setEsGuardarRelacionado(false);
				this.vendedorzonaBeanSwingJInternalFrame=null;//new VendedorZonaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.vendedorzonaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteVendedorZona) {
					this.jTabbedPaneRelacionesZona.add("Vendedor Zonas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarSubClienteBeanSwingJInternalFrame(List<Zona> zonas,Zona zona,SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//subclienteBeanSwingJInternalFrame=new SubClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					subclienteBeanSwingJInternalFrame.getSubClienteLogic().setConnexion(this.zonaLogic.getConnexion());

					subclienteBeanSwingJInternalFrame.setzonasForeignKey(zonas);
					subclienteBeanSwingJInternalFrame.setzonaForeignKey(zona);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
					subclienteBeanSwingJInternalFrame.subclienteSessionBean.setlidZonaActual(zona.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					subclienteBeanSwingJInternalFrame.cargarCombosForeignKeySubCliente(subclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					subclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaZona(true);
					subclienteBeanSwingJInternalFrame.setid_zonaFK_IdZona(zona.getId());

					if(!this.conCargarFormDetalle) {
						subclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					subclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameZonaForeignKey(zona,1,false,true,true);
					subclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					subclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdZona");
					subclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdZona");
					subclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaSubCliente(true);
					subclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesSubCliente("n",subclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, subclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					subclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					subclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("relacionado");
					} else {
						subclienteBeanSwingJInternalFrame.actualizarEstadoPanelsSubCliente("no_relacionado");
					}

					subclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionSubCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVendedorBeanSwingJInternalFrame(List<Zona> zonas,Zona zona,VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.zonaLogic.getConnexion());

					vendedorBeanSwingJInternalFrame.setzonasForeignKey(zonas);
					vendedorBeanSwingJInternalFrame.setzonaForeignKey(zona);
					vendedorBeanSwingJInternalFrame.vendedorSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
					vendedorBeanSwingJInternalFrame.vendedorSessionBean.setlidZonaActual(zona.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vendedorBeanSwingJInternalFrame.cargarCombosForeignKeyVendedor(vendedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					vendedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaZona(true);
					vendedorBeanSwingJInternalFrame.setid_zonaFK_IdZona(zona.getId());

					if(!this.conCargarFormDetalle) {
						vendedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vendedorBeanSwingJInternalFrame.setSelectedItemCombosFrameZonaForeignKey(zona,1,false,true,true);
					vendedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vendedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdZona");
					vendedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdZona");
					vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor(true);
					vendedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVendedor("n",vendedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, vendedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vendedorBeanSwingJInternalFrame.setAutoscrolls(true);
					vendedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vendedorBeanSwingJInternalFrame.actualizarEstadoPanelsVendedor("relacionado");
					} else {
						vendedorBeanSwingJInternalFrame.actualizarEstadoPanelsVendedor("no_relacionado");
					}

					vendedorBeanSwingJInternalFrame.getjButtonRecargarInformacionVendedor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarClienteBeanSwingJInternalFrame(List<Zona> zonas,Zona zona,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.zonaLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setzonasForeignKey(zonas);
					clienteBeanSwingJInternalFrame.setzonaForeignKey(zona);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidZonaActual(zona.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaZona(true);
					clienteBeanSwingJInternalFrame.setid_zonaFK_IdZona(zona.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameZonaForeignKey(zona,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdZona");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdZona");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarVendedorZonaBeanSwingJInternalFrame(List<Zona> zonas,Zona zona,VendedorZonaBeanSwingJInternalFrame vendedorzonaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//vendedorzonaBeanSwingJInternalFrame=new VendedorZonaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					vendedorzonaBeanSwingJInternalFrame.getVendedorZonaLogic().setConnexion(this.zonaLogic.getConnexion());

					vendedorzonaBeanSwingJInternalFrame.setzonasForeignKey(zonas);
					vendedorzonaBeanSwingJInternalFrame.setzonaForeignKey(zona);
					vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
					vendedorzonaBeanSwingJInternalFrame.vendedorzonaSessionBean.setlidZonaActual(zona.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					vendedorzonaBeanSwingJInternalFrame.cargarCombosForeignKeyVendedorZona(vendedorzonaBeanSwingJInternalFrame.isCargarCombosDependencia);
					vendedorzonaBeanSwingJInternalFrame.setVisibilidadBusquedasParaZona(true);
					vendedorzonaBeanSwingJInternalFrame.setid_zonaFK_IdZona(zona.getId());

					if(!this.conCargarFormDetalle) {
						vendedorzonaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					vendedorzonaBeanSwingJInternalFrame.setSelectedItemCombosFrameZonaForeignKey(zona,1,false,true,true);
					vendedorzonaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					vendedorzonaBeanSwingJInternalFrame.procesarBusqueda("FK_IdZona");
					vendedorzonaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdZona");
					vendedorzonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedorZona(true);
					vendedorzonaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesVendedorZona("n",vendedorzonaBeanSwingJInternalFrame.isGuardarCambiosEnLote, vendedorzonaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					vendedorzonaBeanSwingJInternalFrame.setAutoscrolls(true);
					vendedorzonaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						vendedorzonaBeanSwingJInternalFrame.actualizarEstadoPanelsVendedorZona("relacionado");
					} else {
						vendedorzonaBeanSwingJInternalFrame.actualizarEstadoPanelsVendedorZona("no_relacionado");
					}

					vendedorzonaBeanSwingJInternalFrame.getjButtonRecargarInformacionVendedorZona().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoVentasBeanSwingJInternalFrame(List<Zona> zonas,Zona zona,PresupuestoVentasBeanSwingJInternalFrame presupuestoventasBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventasBeanSwingJInternalFrame=new PresupuestoVentasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventasBeanSwingJInternalFrame.getPresupuestoVentasLogic().setConnexion(this.zonaLogic.getConnexion());

					presupuestoventasBeanSwingJInternalFrame.setzonasForeignKey(zonas);
					presupuestoventasBeanSwingJInternalFrame.setzonaForeignKey(zona);
					presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
					presupuestoventasBeanSwingJInternalFrame.presupuestoventasSessionBean.setlidZonaActual(zona.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventasBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentas(presupuestoventasBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventasBeanSwingJInternalFrame.setVisibilidadBusquedasParaZona(true);
					presupuestoventasBeanSwingJInternalFrame.setid_zonaFK_IdZona(zona.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventasBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventasBeanSwingJInternalFrame.setSelectedItemCombosFrameZonaForeignKey(zona,1,false,true,true);
					presupuestoventasBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventasBeanSwingJInternalFrame.procesarBusqueda("FK_IdZona");
					presupuestoventasBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdZona");
					presupuestoventasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentas(true);
					presupuestoventasBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentas("n",presupuestoventasBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventasBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventasBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventasBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("relacionado");
					} else {
						presupuestoventasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentas("no_relacionado");
					}

					presupuestoventasBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentas().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPresupuestoVentasLineasBeanSwingJInternalFrame(List<Zona> zonas,Zona zona,PresupuestoVentasLineasBeanSwingJInternalFrame presupuestoventaslineasBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//presupuestoventaslineasBeanSwingJInternalFrame=new PresupuestoVentasLineasBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					presupuestoventaslineasBeanSwingJInternalFrame.getPresupuestoVentasLineasLogic().setConnexion(this.zonaLogic.getConnexion());

					presupuestoventaslineasBeanSwingJInternalFrame.setzonasForeignKey(zonas);
					presupuestoventaslineasBeanSwingJInternalFrame.setzonaForeignKey(zona);
					presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setisBusquedaDesdeForeignKeySesionZona(true);
					presupuestoventaslineasBeanSwingJInternalFrame.presupuestoventaslineasSessionBean.setlidZonaActual(zona.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					presupuestoventaslineasBeanSwingJInternalFrame.cargarCombosForeignKeyPresupuestoVentasLineas(presupuestoventaslineasBeanSwingJInternalFrame.isCargarCombosDependencia);
					presupuestoventaslineasBeanSwingJInternalFrame.setVisibilidadBusquedasParaZona(true);
					presupuestoventaslineasBeanSwingJInternalFrame.setid_zonaFK_IdZona(zona.getId());

					if(!this.conCargarFormDetalle) {
						presupuestoventaslineasBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					presupuestoventaslineasBeanSwingJInternalFrame.setSelectedItemCombosFrameZonaForeignKey(zona,1,false,true,true);
					presupuestoventaslineasBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					presupuestoventaslineasBeanSwingJInternalFrame.procesarBusqueda("FK_IdZona");
					presupuestoventaslineasBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdZona");
					presupuestoventaslineasBeanSwingJInternalFrame.inicializarActualizarBindingTablaPresupuestoVentasLineas(true);
					presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPresupuestoVentasLineas("n",presupuestoventaslineasBeanSwingJInternalFrame.isGuardarCambiosEnLote, presupuestoventaslineasBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					presupuestoventaslineasBeanSwingJInternalFrame.setAutoscrolls(true);
					presupuestoventaslineasBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("relacionado");
					} else {
						presupuestoventaslineasBeanSwingJInternalFrame.actualizarEstadoPanelsPresupuestoVentasLineas("no_relacionado");
					}

					presupuestoventaslineasBeanSwingJInternalFrame.getjButtonRecargarInformacionPresupuestoVentasLineas().setVisible(false);

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
