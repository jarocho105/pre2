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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.ConsignatarioConstantesFunciones;

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
public class ConsignatarioDetalleFormJInternalFrame extends ConsignatarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConsignatario;
	
	protected JMenuBar jmenuBarDetalleConsignatario;
	
	protected JMenu jmenuDetalleConsignatario;
	protected JMenu jmenuDetalleArchivoConsignatario;
	protected JMenu jmenuDetalleAccionesConsignatario;
	protected JMenu jmenuDetalleDatosConsignatario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConsignatario;	
	protected GridBagConstraints gridBagConstraintsConsignatario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConsignatarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleConsignatario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ConsignatarioSessionBean consignatarioSessionBean;
	
	

	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;
	public ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProforma=false;
	public ProformaSessionBean proformaSessionBean;

	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame=null;
	public ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteConsignacion=false;
	public ConsignacionSessionBean consignacionSessionBean;

	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame=null;
	public PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePedidoExpor=false;
	public PedidoExporSessionBean pedidoexporSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public ConsignatarioLogic consignatarioLogic;
	
	public JScrollPane jScrollPanelDatosConsignatario;
	public JScrollPane jScrollPanelDatosEdicionConsignatario;
	public JScrollPane jScrollPanelDatosGeneralConsignatario;
	
	protected JPanel jPanelCamposConsignatario;    
	protected JPanel jPanelCamposOcultosConsignatario;    	
	protected JPanel jPanelAccionesConsignatario;
	protected JPanel jPanelAccionesFormularioConsignatario;
    
	
	
	protected Integer iXPanelCamposConsignatario=0;
	protected Integer iYPanelCamposConsignatario=0;
	
	protected Integer iXPanelCamposOcultosConsignatario=0;
	protected Integer iYPanelCamposOcultosConsignatario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConsignatario;
	public JButton jButtonModificarConsignatario;
	public JButton jButtonActualizarConsignatario;
    public JButton jButtonEliminarConsignatario;
	public JButton jButtonCancelarConsignatario;
    public JButton jButtonGuardarCambiosConsignatario;
	public JButton jButtonGuardarCambiosTablaConsignatario;
	protected JButton jButtonCerrarConsignatario;
	
	
	protected JButton jButtonProcesarInformacionConsignatario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConsignatario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConsignatario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConsignatario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConsignatario;
	protected JButton jButtonModificarToolBarConsignatario;
	protected JButton jButtonActualizarToolBarConsignatario;
    protected JButton jButtonEliminarToolBarConsignatario;
	protected JButton jButtonCancelarToolBarConsignatario;
    protected JButton jButtonGuardarCambiosToolBarConsignatario;
	protected JButton jButtonGuardarCambiosTablaToolBarConsignatario;
	protected JButton jButtonMostrarOcultarTablaToolBarConsignatario;
	protected JButton jButtonCerrarToolBarConsignatario;
	
	protected JButton jButtonProcesarInformacionToolBarConsignatario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConsignatario;
	protected JMenuItem jMenuItemModificarConsignatario;
	protected JMenuItem jMenuItemActualizarConsignatario;
    protected JMenuItem jMenuItemEliminarConsignatario;
	protected JMenuItem jMenuItemCancelarConsignatario;
    protected JMenuItem jMenuItemGuardarCambiosConsignatario;
	protected JMenuItem jMenuItemGuardarCambiosTablaConsignatario;
	protected JMenuItem jMenuItemCerrarConsignatario;
	protected JMenuItem jMenuItemDetalleCerrarConsignatario;
	protected JMenuItem jMenuItemDetalleMostarOcultarConsignatario;
	
	protected JMenuItem jMenuItemProcesarInformacionConsignatario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConsignatario;
	protected JMenuItem jMenuItemMostrarOcultarConsignatario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConsignatario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConsignatario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConsignatario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConsignatario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConsignatario;
	public JLabel jLabelIdConsignatario;
	public JLabel jLabelidConsignatario;
	public JButton jButtonidConsignatarioBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completoConsignatario;
	public JLabel jLabelnombre_completoConsignatario;
	public JTextField jTextFieldnombre_completoConsignatario;
	public JButton jButtonnombre_completoConsignatarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreConsignatario;
	public JLabel jLabelnombreConsignatario;
	public JTextArea jTextAreanombreConsignatario;
	public JScrollPane jscrollPanenombreConsignatario;
	public JButton jButtonnombreConsignatarioBusqueda= new JButtonMe();

	public JPanel jPanelapellidoConsignatario;
	public JLabel jLabelapellidoConsignatario;
	public JTextArea jTextAreaapellidoConsignatario;
	public JScrollPane jscrollPaneapellidoConsignatario;
	public JButton jButtonapellidoConsignatarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConsignatario;
	public JLabel jLabelid_empresaConsignatario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConsignatario;
	public JButton jButtonid_empresaConsignatario= new JButtonMe();
	public JButton jButtonid_empresaConsignatarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaConsignatarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalConsignatario;
	public JLabel jLabelid_sucursalConsignatario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalConsignatario;
	public JButton jButtonid_sucursalConsignatario= new JButtonMe();
	public JButton jButtonid_sucursalConsignatarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalConsignatarioBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteConsignatario;
	public JLabel jLabelid_clienteConsignatario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteConsignatario;
	public JButton jButtonid_clienteConsignatario= new JButtonMe();
	public JButton jButtonid_clienteConsignatarioUpdate= new JButtonMe();
	public JButton jButtonid_clienteConsignatarioBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioConsignatario;
	public JLabel jLabelid_usuarioConsignatario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioConsignatario;
	public JButton jButtonid_usuarioConsignatario= new JButtonMe();
	public JButton jButtonid_usuarioConsignatarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioConsignatarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConsignatario;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ConsignatarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConsignatario=new JPanel();
				this.jPanelAccionesFormularioConsignatario=new JPanel();
				this.jmenuBarDetalleConsignatario=new JMenuBar();
				this.jTtoolBarDetalleConsignatario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConsignatarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConsignatarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Consignatario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConsignatario() {
		return this.jButtonActualizarToolBarConsignatario;
	}
	
	public JButton getjButtonEliminarToolBarConsignatario() {
		return this.jButtonEliminarToolBarConsignatario;
	}
	
	public JButton getjButtonCancelarToolBarConsignatario() {
		return this.jButtonCancelarToolBarConsignatario;
	}		
	
	public JButton getjButtonProcesarInformacionConsignatario() {
		return this.jButtonProcesarInformacionConsignatario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConsignatario)	{
		this.jButtonProcesarInformacionConsignatario = jButtonProcesarInformacionConsignatario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConsignatario() {
		return this.jComboBoxTiposAccionesConsignatario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConsignatario(
			JComboBox jComboBoxTiposRelacionesConsignatario) {
		this.jComboBoxTiposRelacionesConsignatario = jComboBoxTiposRelacionesConsignatario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConsignatario(
			JComboBox jComboBoxTiposAccionesConsignatario) {
		this.jComboBoxTiposAccionesConsignatario = jComboBoxTiposAccionesConsignatario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConsignatario() {
		return this.jComboBoxTiposAccionesFormularioConsignatario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConsignatario(
			JComboBox jComboBoxTiposAccionesFormularioConsignatario) {
		this.jComboBoxTiposAccionesFormularioConsignatario = jComboBoxTiposAccionesFormularioConsignatario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.consignatarioSessionBean=new ConsignatarioSessionBean();
		
		this.consignatarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.consignatarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.consignatarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.proformaSessionBean=new ProformaSessionBean();
		//this.consignacionSessionBean=new ConsignacionSessionBean();
		//this.pedidoexporSessionBean=new PedidoExporSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConsignatarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Consignatario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
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
	
		ConsignatarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConsignatario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConsignatario=new JButtonMe();
				this.jButtonModificarToolBarConsignatario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConsignatario,this.jTtoolBarDetalleConsignatario,
							"actualizar","actualizar","Actualizar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConsignatario,this.jTtoolBarDetalleConsignatario,
							"eliminar","eliminar","Eliminar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConsignatario,this.jTtoolBarDetalleConsignatario,
							"cancelar","cancelar","Cancelar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConsignatario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConsignatario,this.jTtoolBarDetalleConsignatario,
							"guardarcambios","guardarcambios","Guardar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConsignatario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConsignatario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConsignatario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConsignatario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConsignatario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConsignatario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConsignatario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConsignatario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConsignatario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConsignatario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConsignatario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConsignatario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConsignatario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConsignatario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConsignatario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConsignatario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConsignatario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConsignatario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConsignatario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConsignatario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConsignatario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConsignatario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConsignatario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConsignatario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConsignatario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConsignatario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConsignatario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConsignatario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConsignatario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConsignatario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConsignatario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConsignatario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConsignatario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConsignatario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConsignatario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConsignatario.add(this.jMenuItemDetalleCerrarConsignatario);
		
		this.jmenuDetalleAccionesConsignatario.add(this.jMenuItemActualizarConsignatario);
		this.jmenuDetalleAccionesConsignatario.add(this.jMenuItemEliminarConsignatario);
		this.jmenuDetalleAccionesConsignatario.add(this.jMenuItemCancelarConsignatario);		
		
		//this.jmenuDetalleDatosConsignatario.add(this.jMenuItemDetalleAbrirOrderByConsignatario);				
		this.jmenuDetalleDatosConsignatario.add(this.jMenuItemDetalleMostarOcultarConsignatario);				
				
		//this.jmenuDetalleAccionesConsignatario.add(this.jMenuItemGuardarCambiosConsignatario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConsignatario.add(this.jmenuDetalleArchivoConsignatario);		
		this.jmenuBarDetalleConsignatario.add(this.jmenuDetalleAccionesConsignatario);		
		this.jmenuBarDetalleConsignatario.add(this.jmenuDetalleDatosConsignatario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleConsignatario.add(this.jmenuDetalleConsignatario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConsignatario);				
	}
	
	
	public void inicializarElementosCamposConsignatario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConsignatario = new JLabelMe();
		jLabelIdConsignatario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConsignatario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConsignatario= new GridBagLayout();

		this.jPanelidConsignatario.setLayout(this.gridaBagLayoutConsignatario);

		jLabelidConsignatario = new JLabel();
		jLabelidConsignatario.setText("Id");

		jLabelidConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_completoConsignatario = new JLabelMe();
		this.jLabelnombre_completoConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO+" : *");
		this.jLabelnombre_completoConsignatario.setToolTipText("Nombre Completo");
		this.jLabelnombre_completoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_completoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completoConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completoConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completoConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_NOMBRECOMPLETO);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelnombre_completoConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jTextFieldnombre_completoConsignatario= new JTextFieldMe();

		jTextFieldnombre_completoConsignatario.setEnabled(false);
		jTextFieldnombre_completoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_completoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_completoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_completoConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_completoConsignatarioBusqueda= new JButtonMe();
		this.jButtonnombre_completoConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completoConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completoConsignatarioBusqueda.setText("U");
		this.jButtonnombre_completoConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completoConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completoConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_completoConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_completoConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completoConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completoConsignatarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreConsignatario = new JLabelMe();
		this.jLabelnombreConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConsignatario.setToolTipText("Nombre");
		this.jLabelnombreConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelnombreConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jTextAreanombreConsignatario= new JTextAreaMe();
		jTextAreanombreConsignatario.setEnabled(false);
		jTextAreanombreConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConsignatario.setLineWrap(true);
		jTextAreanombreConsignatario.setWrapStyleWord(true);
		jTextAreanombreConsignatario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConsignatario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConsignatario = new JScrollPane(jTextAreanombreConsignatario);
		jscrollPanenombreConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConsignatarioBusqueda= new JButtonMe();
		this.jButtonnombreConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConsignatarioBusqueda.setText("U");
		this.jButtonnombreConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConsignatarioBusqueda.setVisible(false);		}


					
		this.jLabelapellidoConsignatario = new JLabelMe();
		this.jLabelapellidoConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_APELLIDO+" : *");
		this.jLabelapellidoConsignatario.setToolTipText("Apello");
		this.jLabelapellidoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelapellidoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelapellidoConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelapellidoConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelapellidoConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_APELLIDO);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelapellidoConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jTextAreaapellidoConsignatario= new JTextAreaMe();
		jTextAreaapellidoConsignatario.setEnabled(false);
		jTextAreaapellidoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaapellidoConsignatario.setLineWrap(true);
		jTextAreaapellidoConsignatario.setWrapStyleWord(true);
		jTextAreaapellidoConsignatario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaapellidoConsignatario.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaapellidoConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneapellidoConsignatario = new JScrollPane(jTextAreaapellidoConsignatario);
		jscrollPaneapellidoConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneapellidoConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonapellidoConsignatarioBusqueda= new JButtonMe();
		this.jButtonapellidoConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonapellidoConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonapellidoConsignatarioBusqueda.setText("U");
		this.jButtonapellidoConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonapellidoConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonapellidoConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaapellidoConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaapellidoConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"apellidoConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonapellidoConsignatarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConsignatario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConsignatario = new JLabelMe();
		this.jLabelid_empresaConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConsignatario.setToolTipText("Empresa");
		this.jLabelid_empresaConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelid_empresaConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jComboBoxid_empresaConsignatario= new JComboBoxMe();
		jComboBoxid_empresaConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConsignatario.setEnabled(false);

		this.jButtonid_empresaConsignatario= new JButtonMe();
		this.jButtonid_empresaConsignatario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsignatario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsignatario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConsignatario.setText("Buscar");
		this.jButtonid_empresaConsignatario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConsignatario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsignatario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsignatario"));

		this.jButtonid_empresaConsignatarioBusqueda= new JButtonMe();
		this.jButtonid_empresaConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsignatarioBusqueda.setText("U");
		this.jButtonid_empresaConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConsignatarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaConsignatarioUpdate= new JButtonMe();
		this.jButtonid_empresaConsignatarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignatarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConsignatarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConsignatarioUpdate.setText("U");
		this.jButtonid_empresaConsignatarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConsignatarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConsignatarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConsignatarioUpdate"));



					
		this.jLabelid_sucursalConsignatario = new JLabelMe();
		this.jLabelid_sucursalConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalConsignatario.setToolTipText("Sucursal");
		this.jLabelid_sucursalConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelid_sucursalConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jComboBoxid_sucursalConsignatario= new JComboBoxMe();
		jComboBoxid_sucursalConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalConsignatario.setEnabled(false);

		this.jButtonid_sucursalConsignatario= new JButtonMe();
		this.jButtonid_sucursalConsignatario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConsignatario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConsignatario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalConsignatario.setText("Buscar");
		this.jButtonid_sucursalConsignatario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalConsignatario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConsignatario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConsignatario"));

		this.jButtonid_sucursalConsignatarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConsignatarioBusqueda.setText("U");
		this.jButtonid_sucursalConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalConsignatarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalConsignatarioUpdate= new JButtonMe();
		this.jButtonid_sucursalConsignatarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignatarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalConsignatarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalConsignatarioUpdate.setText("U");
		this.jButtonid_sucursalConsignatarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalConsignatarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalConsignatarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalConsignatarioUpdate"));



					
		this.jLabelid_clienteConsignatario = new JLabelMe();
		this.jLabelid_clienteConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteConsignatario.setToolTipText("Cliente");
		this.jLabelid_clienteConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelid_clienteConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jComboBoxid_clienteConsignatario= new JComboBoxMe();
		jComboBoxid_clienteConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteConsignatario= new JButtonMe();
		this.jButtonid_clienteConsignatario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConsignatario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConsignatario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteConsignatario.setText("Buscar");
		this.jButtonid_clienteConsignatario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteConsignatario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConsignatario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConsignatario"));

		this.jButtonid_clienteConsignatarioBusqueda= new JButtonMe();
		this.jButtonid_clienteConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteConsignatarioBusqueda.setText("U");
		this.jButtonid_clienteConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteConsignatarioBusqueda.setVisible(false);		}

		this.jButtonid_clienteConsignatarioUpdate= new JButtonMe();
		this.jButtonid_clienteConsignatarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignatarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteConsignatarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteConsignatarioUpdate.setText("U");
		this.jButtonid_clienteConsignatarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteConsignatarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteConsignatarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteConsignatarioUpdate"));



					
		this.jLabelid_usuarioConsignatario = new JLabelMe();
		this.jLabelid_usuarioConsignatario.setText(""+ConsignatarioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioConsignatario.setToolTipText("Usuario");
		this.jLabelid_usuarioConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioConsignatario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioConsignatario.setToolTipText(ConsignatarioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutConsignatario = new GridBagLayout();
		this.jPanelid_usuarioConsignatario.setLayout(this.gridaBagLayoutConsignatario);


		jComboBoxid_usuarioConsignatario= new JComboBoxMe();
		jComboBoxid_usuarioConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioConsignatario.setEnabled(false);

		this.jButtonid_usuarioConsignatario= new JButtonMe();
		this.jButtonid_usuarioConsignatario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioConsignatario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioConsignatario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioConsignatario.setText("Buscar");
		this.jButtonid_usuarioConsignatario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioConsignatario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioConsignatario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioConsignatario"));

		this.jButtonid_usuarioConsignatarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioConsignatarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignatarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignatarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioConsignatarioBusqueda.setText("U");
		this.jButtonid_usuarioConsignatarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioConsignatarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioConsignatarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioConsignatarioBusqueda"));

		if(this.consignatarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioConsignatarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioConsignatarioUpdate= new JButtonMe();
		this.jButtonid_usuarioConsignatarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignatarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioConsignatarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioConsignatarioUpdate.setText("U");
		this.jButtonid_usuarioConsignatarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioConsignatarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioConsignatarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioConsignatario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioConsignatario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioConsignatarioUpdate"));



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
		//this.jInternalFrameDetalleConsignatario = new ConsignatarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Consignatario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConsignatario= new GridBagLayout();
		

		
		String sToolTipConsignatario="";
		sToolTipConsignatario=ConsignatarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConsignatario+="(Cartera.Consignatario)";
		}
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipConsignatario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConsignatario = new JButtonMe();
		this.jButtonModificarConsignatario = new JButtonMe();
        this.jButtonActualizarConsignatario = new JButtonMe();
        this.jButtonEliminarConsignatario = new JButtonMe();
        this.jButtonCancelarConsignatario = new JButtonMe();
        this.jButtonGuardarCambiosConsignatario = new JButtonMe();
		this.jButtonGuardarCambiosTablaConsignatario = new JButtonMe();
		this.jButtonCerrarConsignatario = new JButtonMe();
		
		this.jScrollPanelDatosConsignatario = new JScrollPane();   
        this.jScrollPanelDatosEdicionConsignatario = new JScrollPane();
		this.jScrollPanelDatosGeneralConsignatario = new JScrollPane();
				
		
		
		this.jPanelCamposConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Consignatario";
		
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Consignatarios" + this.sPath));
		} else {
			this.jScrollPanelDatosConsignatario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConsignatario.setName("jPanelCamposConsignatario"); 

		this.jPanelCamposOcultosConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConsignatario.setName("jPanelCamposOcultosConsignatario"); 

        this.jPanelAccionesConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConsignatario.setToolTipText("Acciones");
        this.jPanelAccionesConsignatario.setName("Acciones"); 

		this.jPanelAccionesFormularioConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConsignatario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConsignatario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConsignatario.setText("Nuevo");
		this.jButtonModificarConsignatario.setText("Editar");
        this.jButtonActualizarConsignatario.setText("Actualizar");
        this.jButtonEliminarConsignatario.setText("Eliminar");
        this.jButtonCancelarConsignatario.setText("Cancelar");
        this.jButtonGuardarCambiosConsignatario.setText("Guardar");
		this.jButtonGuardarCambiosTablaConsignatario.setText("Guardar");
		this.jButtonCerrarConsignatario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConsignatario,"nuevo_button","Nuevo",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConsignatario,"modificar_button","Editar",this.consignatarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConsignatario,"actualizar_button","Actualizar",this.consignatarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConsignatario,"eliminar_button","Eliminar",this.consignatarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConsignatario,"cancelar_button","Cancelar",this.consignatarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConsignatario,"guardarcambios_button","Guardar",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConsignatario,"guardarcambiostabla_button","Guardar",this.consignatarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConsignatario,"cerrar_button","Salir",this.consignatarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConsignatario.setToolTipText("Nuevo"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConsignatario.setToolTipText("Editar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConsignatario.setToolTipText("Actualizar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConsignatario.setToolTipText("Eliminar)"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConsignatario.setToolTipText("Cancelar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConsignatario.setToolTipText("Guardar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConsignatario.setToolTipText("Guardar"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConsignatario.setToolTipText("Salir"+" "+ConsignatarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConsignatario";
		inputMap = this.jButtonNuevoConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConsignatario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConsignatario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConsignatario";
		inputMap = this.jButtonActualizarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConsignatario"));
		
		//ELIMINAR
		sMapKey = "EliminarConsignatario";
		inputMap = this.jButtonEliminarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConsignatario"));
		
		//CANCELAR	
		sMapKey = "CancelarConsignatario";
		inputMap = this.jButtonCancelarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConsignatario"));
		
		//CERRAR		
		sMapKey = "CerrarConsignatario";
		inputMap = this.jButtonCerrarConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConsignatario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConsignatario";
		inputMap = this.jButtonGuardarCambiosTablaConsignatario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConsignatario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConsignatario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConsignatario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConsignatario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConsignatario.setToolTipText("Nuevo Consignatario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConsignatario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConsignatario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConsignatario.setToolTipText("Sin Cerrar Ventana Consignatario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConsignatario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConsignatario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConsignatario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConsignatario.setText("Accion");
		this.jComboBoxTiposAccionesConsignatario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConsignatario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConsignatario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConsignatario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConsignatario = new JLabelMe();
		
		this.jLabelAccionesConsignatario.setText("Acciones");		
		this.jLabelAccionesConsignatario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignatario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConsignatario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConsignatario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConsignatario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConsignatario=new JTabbedPane();
		this.jTabbedPaneRelacionesConsignatario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConsignatario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConsignatario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignatario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConsignatario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConsignatario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConsignatario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsignatario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConsignatario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConsignatario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConsignatario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConsignatario = new GridBagLayout();
		
		this.jPanelCamposConsignatario.setLayout(gridaBagLayoutCamposConsignatario);
		this.jPanelCamposOcultosConsignatario.setLayout(gridaBagLayoutCamposOcultosConsignatario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConsignatario.add(jLabelIdConsignatario, this.gridBagConstraintsConsignatario);



	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConsignatario.add(jLabelidConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConsignatario.add(jLabelid_empresaConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 2;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsignatario.add(jButtonid_empresaConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 3;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConsignatario.add(jButtonid_empresaConsignatarioUpdate, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConsignatario.add(jComboBoxid_empresaConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalConsignatario.add(jLabelid_sucursalConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 2;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConsignatario.add(jButtonid_sucursalConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 3;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalConsignatario.add(jButtonid_sucursalConsignatarioUpdate, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalConsignatario.add(jComboBoxid_sucursalConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteConsignatario.add(jLabelid_clienteConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 2;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteConsignatario.add(jButtonid_clienteConsignatario, this.gridBagConstraintsConsignatario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 3;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteConsignatario.add(jButtonid_clienteConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 4;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteConsignatario.add(jButtonid_clienteConsignatarioUpdate, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteConsignatario.add(jComboBoxid_clienteConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioConsignatario.add(jLabelid_usuarioConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 2;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioConsignatario.add(jButtonid_usuarioConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 3;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioConsignatario.add(jButtonid_usuarioConsignatarioUpdate, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioConsignatario.add(jComboBoxid_usuarioConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completoConsignatario.add(jLabelnombre_completoConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 2;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completoConsignatario.add(jButtonnombre_completoConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completoConsignatario.add(jTextFieldnombre_completoConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConsignatario.add(jLabelnombreConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 2;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConsignatario.add(jButtonnombreConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConsignatario.add(jscrollPanenombreConsignatario, this.gridBagConstraintsConsignatario);


	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 0;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelapellidoConsignatario.add(jLabelapellidoConsignatario, this.gridBagConstraintsConsignatario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		//this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = 2;
		this.gridBagConstraintsConsignatario.ipadx = 0;
		this.gridBagConstraintsConsignatario.insets = new Insets(0, 0, 0, 0);
		this.jPanelapellidoConsignatario.add(jButtonapellidoConsignatarioBusqueda, this.gridBagConstraintsConsignatario);
	}

	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConsignatario.gridy = 0;
	this.gridBagConstraintsConsignatario.gridx = 1;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelapellidoConsignatario.add(jscrollPaneapellidoConsignatario, this.gridBagConstraintsConsignatario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignatario.add(this.jPanelidConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposConsignatario % 1==0) {
		iXPanelCamposConsignatario=0;
		iYPanelCamposConsignatario++;
	}
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignatario.add(this.jPanelid_clienteConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposConsignatario % 1==0) {
		iXPanelCamposConsignatario=0;
		iYPanelCamposConsignatario++;
	}
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignatario.add(this.jPanelnombre_completoConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposConsignatario % 1==0) {
		iXPanelCamposConsignatario=0;
		iYPanelCamposConsignatario++;
	}
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignatario.add(this.jPanelnombreConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposConsignatario % 1==0) {
		iXPanelCamposConsignatario=0;
		iYPanelCamposConsignatario++;
	}
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConsignatario.add(this.jPanelapellidoConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposConsignatario % 1==0) {
		iXPanelCamposConsignatario=0;
		iYPanelCamposConsignatario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposOcultosConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposOcultosConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignatario.add(this.jPanelid_empresaConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposOcultosConsignatario % 1==0) {
		iXPanelCamposOcultosConsignatario=0;
		iYPanelCamposOcultosConsignatario++;
	}
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposOcultosConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposOcultosConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignatario.add(this.jPanelid_sucursalConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposOcultosConsignatario % 1==0) {
		iXPanelCamposOcultosConsignatario=0;
		iYPanelCamposOcultosConsignatario++;
	}
	this.gridBagConstraintsConsignatario = new GridBagConstraints();
	this.gridBagConstraintsConsignatario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConsignatario.gridy = iYPanelCamposOcultosConsignatario;
	this.gridBagConstraintsConsignatario.gridx = iXPanelCamposOcultosConsignatario++;
	this.gridBagConstraintsConsignatario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConsignatario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConsignatario.add(this.jPanelid_usuarioConsignatario, this.gridBagConstraintsConsignatario);



	if(iXPanelCamposOcultosConsignatario % 1==0) {
		iXPanelCamposOcultosConsignatario=0;
		iYPanelCamposOcultosConsignatario++;
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
			
		GridBagLayout gridaBagLayoutAccionesConsignatario= new GridBagLayout();
		this.jPanelAccionesConsignatario.setLayout(gridaBagLayoutAccionesConsignatario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConsignatario= new GridBagLayout();
		this.jPanelAccionesFormularioConsignatario.setLayout(gridaBagLayoutAccionesFormularioConsignatario);
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsignatario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsignatario.add(this.jComboBoxTiposAccionesFormularioConsignatario, this.gridBagConstraintsConsignatario);

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConsignatario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConsignatario.add(this.jCheckBoxPostAccionNuevoConsignatario, this.gridBagConstraintsConsignatario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConsignatario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConsignatario.add(this.jCheckBoxPostAccionSinCerrarConsignatario, this.gridBagConstraintsConsignatario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.consignatarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.consignatarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConsignatario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConsignatario.add(this.jCheckBoxPostAccionSinMensajeConsignatario, this.gridBagConstraintsConsignatario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx = iPosXAccion++;
			
		this.jPanelAccionesConsignatario.add(this.jButtonModificarConsignatario, this.gridBagConstraintsConsignatario);							

		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConsignatario.gridy = 0;
		this.gridBagConstraintsConsignatario.gridx =iPosXAccion++;
			
		this.jPanelAccionesConsignatario.add(this.jButtonEliminarConsignatario, this.gridBagConstraintsConsignatario);
		
			
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = 0;		
		this.gridBagConstraintsConsignatario.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsignatario.add(this.jButtonActualizarConsignatario, this.gridBagConstraintsConsignatario);


		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = 0;		
		this.gridBagConstraintsConsignatario.gridx = iPosXAccion++;
		
		this.jPanelAccionesConsignatario.add(this.jButtonGuardarCambiosConsignatario, this.gridBagConstraintsConsignatario);	
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = 0;		
		this.gridBagConstraintsConsignatario.gridx =iPosXAccion++;
		
		this.jPanelAccionesConsignatario.add(this.jButtonCancelarConsignatario, this.gridBagConstraintsConsignatario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConsignatario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConsignatario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.consignatarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConsignatario = new GridBagConstraints();						
			this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConsignatario.gridx = 0;		
			//this.gridBagConstraintsConsignatario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConsignatario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConsignatario.gridx =0;
		this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConsignatario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConsignatario, this.gridBagConstraintsConsignatario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConsignatarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConsignatario = new ConsignatarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Consignatario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Consignatario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Consignatario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConsignatarioModel consignatarioModel=new ConsignatarioModel(this);
			
			//SI USARA CLASE INTERNA
			//ConsignatarioModel.ConsignatarioFocusTraversalPolicy consignatarioFocusTraversalPolicy = consignatarioModel.new ConsignatarioFocusTraversalPolicy(this);
			
			//consignatarioFocusTraversalPolicy.setconsignatarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(consignatarioModel);
			
			
			this.jContentPaneDetalleConsignatario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConsignatario = new GridBagLayout();	
			this.jContentPaneDetalleConsignatario.setLayout(gridaBagLayoutDetalleConsignatario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConsignatario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConsignatario = new GridBagConstraints();
				this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConsignatario.gridx = 0;
					
				
				this.jContentPaneDetalleConsignatario.add(jTtoolBarDetalleConsignatario, gridBagConstraintsConsignatario);								
				
}
			
			this.jScrollPanelDatosEdicionConsignatario=   new JScrollPane(jContentPaneDetalleConsignatario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsignatario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignatario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignatario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConsignatario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConsignatario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignatario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConsignatario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConsignatario.gridx = 0;
	        
			this.jContentPaneDetalleConsignatario.add(jPanelCamposConsignatario, gridBagConstraintsConsignatario);
			
			
			
			
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
						&& consignatarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(this.puedeCargarPorParteConsignacion,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(this.puedeCargarPorPartePedidoExpor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(this.puedeCargarPorParteProforma,false,-1);
					
					if(this.consignatarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConsignatario= new GridBagConstraints();
						this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConsignatario.gridx = 0;
						this.jContentPaneDetalleConsignatario.add(this.jTabbedPaneRelacionesConsignatario, this.gridBagConstraintsConsignatario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConsignatario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameConsignacion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePedidoExpor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProforma(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConsignatario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConsignatario = new GridBagConstraints();
					this.gridBagConstraintsConsignatario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConsignatario.gridx = 0;
					
				
					this.jContentPaneDetalleConsignatario.add(jPanelCamposOcultosConsignatario, gridBagConstraintsConsignatario);
				
					this.jPanelCamposOcultosConsignatario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsConsignatario.gridx = 0;
	        this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConsignatario.add(this.jPanelAccionesFormularioConsignatario, this.gridBagConstraintsConsignatario);							
			
			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
	        this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsConsignatario.gridx = 0;
	        
			
			this.jContentPaneDetalleConsignatario.add(this.jPanelAccionesConsignatario, this.gridBagConstraintsConsignatario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConsignatario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConsignatario=   new JScrollPane(this.jPanelCamposConsignatario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConsignatario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignatario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConsignatario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConsignatario.gridx = 0;
			this.gridBagConstraintsConsignatario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConsignatario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConsignatario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConsignatario, this.gridBagConstraintsConsignatario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsignatario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConsignatario, this.gridBagConstraintsConsignatario);			
			
			this.gridBagConstraintsConsignatario = new GridBagConstraints();
			this.gridBagConstraintsConsignatario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConsignatario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConsignatario, this.gridBagConstraintsConsignatario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConsignatario, this.gridBagConstraintsConsignatario);
			
			
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConsignatario, this.gridBagConstraintsConsignatario);
		
			
		this.gridBagConstraintsConsignatario = new GridBagConstraints();
		this.gridBagConstraintsConsignatario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConsignatario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConsignatario, this.gridBagConstraintsConsignatario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConsignatario;//jContentPane;
		
		return jScrollPanelDatosEdicionConsignatario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameConsignacion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.consignacionSessionBean=new ConsignacionSessionBean();
		this.consignacionSessionBean.setConGuardarRelaciones(true);
		this.consignacionSessionBean.setEsGuardarRelacionado(true);

		this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.consignacionBeanSwingJInternalFramePopup=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.consignacionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {

				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ConsignacionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.consignacionSessionBean.setEsGuardarRelacionado(true);

				this.consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.consignacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.consignacionBeanSwingJInternalFrame.setconsignacionSessionBean(this.consignacionSessionBean);

				//this.gridBagConstraintsConsignatario = new GridBagConstraints();
				//this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsignatario.gridx = 0;
				//this.jContentPaneDetalleConsignatario.add(this.consignacionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsignatario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsignatario.add("Consignacions",this.consignacionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsignatario.setComponentAt(iIndexTab,this.consignacionBeanSwingJInternalFrame.getContentPane());
				}

				//ConsignacionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.consignacionSessionBean.setEsGuardarRelacionado(false);
				this.consignacionBeanSwingJInternalFrame=null;//new ConsignacionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.consignacionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteConsignacion) {
					this.jTabbedPaneRelacionesConsignatario.add("Consignacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePedidoExpor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.pedidoexporSessionBean=new PedidoExporSessionBean();
		this.pedidoexporSessionBean.setConGuardarRelaciones(true);
		this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

		this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.pedidoexporBeanSwingJInternalFramePopup=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.pedidoexporBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {

				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				PedidoExporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.pedidoexporSessionBean.setEsGuardarRelacionado(true);

				this.pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.pedidoexporBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.pedidoexporBeanSwingJInternalFrame.setpedidoexporSessionBean(this.pedidoexporSessionBean);

				//this.gridBagConstraintsConsignatario = new GridBagConstraints();
				//this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsignatario.gridx = 0;
				//this.jContentPaneDetalleConsignatario.add(this.pedidoexporBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsignatario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsignatario.add("Pedido Exportacions",this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsignatario.setComponentAt(iIndexTab,this.pedidoexporBeanSwingJInternalFrame.getContentPane());
				}

				//PedidoExporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.pedidoexporSessionBean.setEsGuardarRelacionado(false);
				this.pedidoexporBeanSwingJInternalFrame=null;//new PedidoExporBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.pedidoexporSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePedidoExpor) {
					this.jTabbedPaneRelacionesConsignatario.add("Pedido Exportacions",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProforma(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.proformaSessionBean=new ProformaSessionBean();
		this.proformaSessionBean.setConGuardarRelaciones(true);
		this.proformaSessionBean.setEsGuardarRelacionado(true);

		this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.proformaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.proformaSessionBean.getEsGuardarRelacionado()) {

				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProformaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConsignatarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.proformaSessionBean.setEsGuardarRelacionado(true);

				this.proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.proformaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.proformaBeanSwingJInternalFrame.setproformaSessionBean(this.proformaSessionBean);

				//this.gridBagConstraintsConsignatario = new GridBagConstraints();
				//this.gridBagConstraintsConsignatario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConsignatario.gridx = 0;
				//this.jContentPaneDetalleConsignatario.add(this.proformaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConsignatario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConsignatario.add("Proformas",this.proformaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConsignatario.setComponentAt(iIndexTab,this.proformaBeanSwingJInternalFrame.getContentPane());
				}

				//ProformaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.proformaSessionBean.setEsGuardarRelacionado(false);
				this.proformaBeanSwingJInternalFrame=null;//new ProformaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.proformaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProforma) {
					this.jTabbedPaneRelacionesConsignatario.add("Proformas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarProformaBeanSwingJInternalFrame(List<Consignatario> consignatarios,Consignatario consignatario,ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					proformaBeanSwingJInternalFrame.getProformaLogic().setConnexion(this.consignatarioLogic.getConnexion());

					proformaBeanSwingJInternalFrame.setconsignatariosForeignKey(consignatarios);
					proformaBeanSwingJInternalFrame.setconsignatarioForeignKey(consignatario);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
					proformaBeanSwingJInternalFrame.proformaSessionBean.setlidConsignatarioActual(consignatario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					proformaBeanSwingJInternalFrame.cargarCombosForeignKeyProforma(proformaBeanSwingJInternalFrame.isCargarCombosDependencia);
					proformaBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsignatario(true);
					proformaBeanSwingJInternalFrame.setid_consignatarioFK_IdConsignatario(consignatario.getId());

					if(!this.conCargarFormDetalle) {
						proformaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					proformaBeanSwingJInternalFrame.setSelectedItemCombosFrameConsignatarioForeignKey(consignatario,1,false,true,true);
					proformaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					proformaBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsignatario");
					proformaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsignatario");
					proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(true);
					proformaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProforma("n",proformaBeanSwingJInternalFrame.isGuardarCambiosEnLote, proformaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					proformaBeanSwingJInternalFrame.setAutoscrolls(true);
					proformaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("relacionado");
					} else {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");
					}

					proformaBeanSwingJInternalFrame.getjButtonRecargarInformacionProforma().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarConsignacionBeanSwingJInternalFrame(List<Consignatario> consignatarios,Consignatario consignatario,ConsignacionBeanSwingJInternalFrame consignacionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//consignacionBeanSwingJInternalFrame=new ConsignacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					consignacionBeanSwingJInternalFrame.getConsignacionLogic().setConnexion(this.consignatarioLogic.getConnexion());

					consignacionBeanSwingJInternalFrame.setconsignatariosForeignKey(consignatarios);
					consignacionBeanSwingJInternalFrame.setconsignatarioForeignKey(consignatario);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
					consignacionBeanSwingJInternalFrame.consignacionSessionBean.setlidConsignatarioActual(consignatario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					consignacionBeanSwingJInternalFrame.cargarCombosForeignKeyConsignacion(consignacionBeanSwingJInternalFrame.isCargarCombosDependencia);
					consignacionBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsignatario(true);
					consignacionBeanSwingJInternalFrame.setid_consignatarioFK_IdConsignatario(consignatario.getId());

					if(!this.conCargarFormDetalle) {
						consignacionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					consignacionBeanSwingJInternalFrame.setSelectedItemCombosFrameConsignatarioForeignKey(consignatario,1,false,true,true);
					consignacionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					consignacionBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsignatario");
					consignacionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsignatario");
					consignacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaConsignacion(true);
					consignacionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesConsignacion("n",consignacionBeanSwingJInternalFrame.isGuardarCambiosEnLote, consignacionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					consignacionBeanSwingJInternalFrame.setAutoscrolls(true);
					consignacionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("relacionado");
					} else {
						consignacionBeanSwingJInternalFrame.actualizarEstadoPanelsConsignacion("no_relacionado");
					}

					consignacionBeanSwingJInternalFrame.getjButtonRecargarInformacionConsignacion().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPedidoExporBeanSwingJInternalFrame(List<Consignatario> consignatarios,Consignatario consignatario,PedidoExporBeanSwingJInternalFrame pedidoexporBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//pedidoexporBeanSwingJInternalFrame=new PedidoExporBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					pedidoexporBeanSwingJInternalFrame.getPedidoExporLogic().setConnexion(this.consignatarioLogic.getConnexion());

					pedidoexporBeanSwingJInternalFrame.setconsignatariosForeignKey(consignatarios);
					pedidoexporBeanSwingJInternalFrame.setconsignatarioForeignKey(consignatario);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setisBusquedaDesdeForeignKeySesionConsignatario(true);
					pedidoexporBeanSwingJInternalFrame.pedidoexporSessionBean.setlidConsignatarioActual(consignatario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					pedidoexporBeanSwingJInternalFrame.cargarCombosForeignKeyPedidoExpor(pedidoexporBeanSwingJInternalFrame.isCargarCombosDependencia);
					pedidoexporBeanSwingJInternalFrame.setVisibilidadBusquedasParaConsignatario(true);
					pedidoexporBeanSwingJInternalFrame.setid_consignatarioFK_IdConsignatario(consignatario.getId());

					if(!this.conCargarFormDetalle) {
						pedidoexporBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					pedidoexporBeanSwingJInternalFrame.setSelectedItemCombosFrameConsignatarioForeignKey(consignatario,1,false,true,true);
					pedidoexporBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					pedidoexporBeanSwingJInternalFrame.procesarBusqueda("FK_IdConsignatario");
					pedidoexporBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConsignatario");
					pedidoexporBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoExpor(true);
					pedidoexporBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPedidoExpor("n",pedidoexporBeanSwingJInternalFrame.isGuardarCambiosEnLote, pedidoexporBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					pedidoexporBeanSwingJInternalFrame.setAutoscrolls(true);
					pedidoexporBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("relacionado");
					} else {
						pedidoexporBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoExpor("no_relacionado");
					}

					pedidoexporBeanSwingJInternalFrame.getjButtonRecargarInformacionPedidoExpor().setVisible(false);

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
